package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes17.dex */
public @interface JsonCreator {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f340922b;

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f340923c;

        /* renamed from: d, reason: collision with root package name */
        public static final Mode f340924d;

        /* renamed from: e, reason: collision with root package name */
        public static final Mode f340925e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f340926f;

        static {
            Mode mode = new Mode("DEFAULT", 0);
            f340922b = mode;
            Mode mode2 = new Mode("DELEGATING", 1);
            f340923c = mode2;
            Mode mode3 = new Mode("PROPERTIES", 2);
            f340924d = mode3;
            Mode mode4 = new Mode("DISABLED", 3);
            f340925e = mode4;
            f340926f = new Mode[]{mode, mode2, mode3, mode4};
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f340926f.clone();
        }
    }

    Mode mode() default Mode.f340922b;
}
