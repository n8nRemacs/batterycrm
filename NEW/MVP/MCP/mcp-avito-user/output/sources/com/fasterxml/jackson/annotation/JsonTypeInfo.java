package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes17.dex */
public @interface JsonTypeInfo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class As {

        /* renamed from: b, reason: collision with root package name */
        public static final As f340967b;

        /* renamed from: c, reason: collision with root package name */
        public static final As f340968c;

        /* renamed from: d, reason: collision with root package name */
        public static final As f340969d;

        /* renamed from: e, reason: collision with root package name */
        public static final As f340970e;

        /* renamed from: f, reason: collision with root package name */
        public static final As f340971f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ As[] f340972g;

        static {
            As as2 = new As("PROPERTY", 0);
            f340967b = as2;
            As as3 = new As("WRAPPER_OBJECT", 1);
            f340968c = as3;
            As as4 = new As("WRAPPER_ARRAY", 2);
            f340969d = as4;
            As as5 = new As("EXTERNAL_PROPERTY", 3);
            f340970e = as5;
            As as6 = new As("EXISTING_PROPERTY", 4);
            f340971f = as6;
            f340972g = new As[]{as2, as3, as4, as5, as6};
        }

        public As() {
            throw null;
        }

        public static As valueOf(String str) {
            return (As) Enum.valueOf(As.class, str);
        }

        public static As[] values() {
            return (As[]) f340972g.clone();
        }
    }

    public enum Id {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        /* JADX INFO: Fake field, exist only in values array */
        NAME("@type"),
        DEDUCTION(null),
        /* JADX INFO: Fake field, exist only in values array */
        CUSTOM(null);


        /* renamed from: b, reason: collision with root package name */
        public final String f340978b;

        Id(String str) {
            this.f340978b = str;
        }
    }

    @Deprecated
    public static abstract class a {
    }

    Class<?> defaultImpl() default JsonTypeInfo.class;

    As include() default As.f340967b;

    String property() default "";

    Id use();

    boolean visible() default false;
}
