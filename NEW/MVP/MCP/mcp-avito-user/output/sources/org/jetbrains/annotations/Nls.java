package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: capitalization */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE, ElementType.TYPE, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes7.dex */
public @interface Nls {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Capitalization {

        /* renamed from: b, reason: collision with root package name */
        public static final Capitalization f420420b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Capitalization[] f420421c;

        static {
            Capitalization capitalization = new Capitalization("NotSpecified", 0);
            f420420b = capitalization;
            f420421c = new Capitalization[]{capitalization, new Capitalization("Title", 1), new Capitalization("Sentence", 2)};
        }

        public Capitalization() {
            throw null;
        }

        public static Capitalization valueOf(String str) {
            return (Capitalization) Enum.valueOf(Capitalization.class, str);
        }

        public static Capitalization[] values() {
            return (Capitalization[]) f420421c.clone();
        }
    }
}
