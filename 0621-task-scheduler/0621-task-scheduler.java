class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] count = new int[26];

        // Count frequency of each task
        for (char task : tasks) {
            count[task - 'A']++;
        }

        // Find the maximum frequency
        int maxFreq = 0;

        for (int freq : count) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Number of tasks having maximum frequency
        int maxCount = 0;

        for (int freq : count) {
            if (freq == maxFreq) {
                maxCount++;
            }
        }

        // Calculate minimum intervals
        int result = (maxFreq - 1) * (n + 1) + maxCount;

        // We never need more intervals than the number of tasks
        return Math.max(result, tasks.length);
    }
}