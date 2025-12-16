package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class FieldNamingPolicy implements com.google.gson.c {

    /* renamed from: b, reason: collision with root package name */
    public static final FieldNamingPolicy f361952b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FieldNamingPolicy[] f361953c;

    public enum a extends FieldNamingPolicy {
        @Override // com.google.gson.c
        public final String a(Field field) {
            return field.getName();
        }
    }

    public enum b extends FieldNamingPolicy {
        @Override // com.google.gson.c
        public final String a(Field field) {
            return FieldNamingPolicy.c(field.getName());
        }
    }

    public enum c extends FieldNamingPolicy {
        @Override // com.google.gson.c
        public final String a(Field field) {
            return FieldNamingPolicy.c(FieldNamingPolicy.b(field.getName(), ' '));
        }
    }

    public enum d extends FieldNamingPolicy {
        @Override // com.google.gson.c
        public final String a(Field field) {
            return FieldNamingPolicy.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    }

    public enum e extends FieldNamingPolicy {
        @Override // com.google.gson.c
        public final String a(Field field) {
            return FieldNamingPolicy.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    }

    public enum f extends FieldNamingPolicy {
        @Override // com.google.gson.c
        public final String a(Field field) {
            return FieldNamingPolicy.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    }

    public enum g extends FieldNamingPolicy {
        @Override // com.google.gson.c
        public final String a(Field field) {
            return FieldNamingPolicy.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    }

    static {
        a aVar = new a("IDENTITY", 0, null);
        f361952b = aVar;
        f361953c = new FieldNamingPolicy[]{aVar, new b("UPPER_CAMEL_CASE", 1, null), new c("UPPER_CAMEL_CASE_WITH_SPACES", 2, null), new d("UPPER_CASE_WITH_UNDERSCORES", 3, null), new e("LOWER_CASE_WITH_UNDERSCORES", 4, null), new f("LOWER_CASE_WITH_DASHES", 5, null), new g("LOWER_CASE_WITH_DOTS", 6, null)};
    }

    public FieldNamingPolicy() {
        throw null;
    }

    public FieldNamingPolicy(String str, int i12, a aVar) {
    }

    public static String b(String str, char c12) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c12);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i12 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i12) + upperCase + str.substring(i12 + 1);
            }
        }
        return str;
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) f361953c.clone();
    }
}
