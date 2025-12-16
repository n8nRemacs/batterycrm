package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes17.dex */
public @interface JsonProperty {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Access {

        /* renamed from: b, reason: collision with root package name */
        public static final Access f340965b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Access[] f340966c;

        static {
            Access access = new Access("AUTO", 0);
            f340965b = access;
            f340966c = new Access[]{access, new Access("READ_ONLY", 1), new Access("WRITE_ONLY", 2), new Access("READ_WRITE", 3)};
        }

        public Access() {
            throw null;
        }

        public static Access valueOf(String str) {
            return (Access) Enum.valueOf(Access.class, str);
        }

        public static Access[] values() {
            return (Access[]) f340966c.clone();
        }
    }

    Access access() default Access.f340965b;

    String defaultValue() default "";

    int index() default -1;

    String namespace() default "";

    boolean required() default false;

    String value() default "";
}
