package com.example.demo.match;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SkillExtractor {

    private static final Set<String> KNOWN_SKILLS = new HashSet<>(Arrays.asList(
        "java", "spring", "spring boot", "hibernate", "jpa",
        "rest", "api", "jwt", "security",
        "postgresql", "mysql",
        "html", "css", "javascript",
        "git", "maven", "docker"
    ));

    public static Set<String> extractSkills(String text) {
        text = text.toLowerCase();

        Set<String> skills = new HashSet<>();
        for (String skill : KNOWN_SKILLS) {
            if (text.contains(skill)) {
                skills.add(skill);
            }
        }
        return skills;
    }
}
