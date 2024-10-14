import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 这位同学的测试用例符合题目要求，非常规范
 * 并且测试结果均通过
 */
// 采用等价划分法设计测试用例
public class L2022211926_2_Test {

        @Test
        public void test1() {
            // 测试目的：验证正常情况下的字符串去重功能
            // 测试用例："bcabc" 应返回 "abc"
            Solution2 solution = new Solution2();
            String input = "bcabc";
            String expected = "abc";
            String actual = solution.removeDuplicateLetters(input);
            Assertions.assertEquals(expected, actual, "The output should be the lexicographically smallest string with unique characters.");
        }

        @Test
        public void test2() {
            // 测试目的：验证包含多个重复字母的字符串去重功能
            // 测试用例："cbacdcbc" 应返回 "acdb"
            Solution2 solution = new Solution2();
            String input = "cbacdcbc";
            String expected = "acdb";
            String actual = solution.removeDuplicateLetters(input);
            Assertions.assertEquals(expected, actual, "The output should correctly remove duplicate letters while maintaining the relative order of other characters.");
        }

        @Test
        public void test3() {
            // 测试目的：验证当输入字符串中所有字符都唯一时的去重功能
            // 测试用例："abcde" 应返回 "abcde"
            Solution2 solution = new Solution2();
            String input = "abcde";
            String expected = "abcde";
            String actual = solution.removeDuplicateLetters(input);
            Assertions.assertEquals(expected, actual, "The output should remain unchanged if all characters are unique.");
        }

        @Test
        public void test4() {
            // 测试目的：验证空输入字符串的去重功能
            // 测试用例："" 应返回 ""
            Solution2 solution = new Solution2();
            String input = "";
            String expected = "";
            String actual = solution.removeDuplicateLetters(input);
            Assertions.assertEquals(expected, actual, "The output should be an empty string for an empty input.");
        }

        @Test
        public void test5() {
            // 测试目的：验证单个字符输入的去重功能
            // 测试用例："a" 应返回 "a"
            Solution2 solution = new Solution2();
            String input = "a";
            String expected = "a";
            String actual = solution.removeDuplicateLetters(input);
            Assertions.assertEquals(expected, actual, "The output should be the same single character for a single character input.");
        }


    }
