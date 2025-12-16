package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.InterfaceC36431a;
import com.fasterxml.jackson.databind.l;
import com.fasterxml.jackson.databind.util.i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonSerialize {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    public static final class Inclusion {

        /* renamed from: b, reason: collision with root package name */
        public static final Inclusion f341448b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Inclusion[] f341449c;

        /* JADX INFO: Fake field, exist only in values array */
        Inclusion EF0;

        static {
            Inclusion inclusion = new Inclusion("ALWAYS", 0);
            Inclusion inclusion2 = new Inclusion("NON_NULL", 1);
            Inclusion inclusion3 = new Inclusion("NON_DEFAULT", 2);
            Inclusion inclusion4 = new Inclusion("NON_EMPTY", 3);
            Inclusion inclusion5 = new Inclusion("DEFAULT_INCLUSION", 4);
            f341448b = inclusion5;
            f341449c = new Inclusion[]{inclusion, inclusion2, inclusion3, inclusion4, inclusion5};
        }

        public Inclusion() {
            throw null;
        }

        public static Inclusion valueOf(String str) {
            return (Inclusion) Enum.valueOf(Inclusion.class, str);
        }

        public static Inclusion[] values() {
            return (Inclusion[]) f341449c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Typing {

        /* renamed from: b, reason: collision with root package name */
        public static final Typing f341450b;

        /* renamed from: c, reason: collision with root package name */
        public static final Typing f341451c;

        /* renamed from: d, reason: collision with root package name */
        public static final Typing f341452d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Typing[] f341453e;

        static {
            Typing typing = new Typing("DYNAMIC", 0);
            f341450b = typing;
            Typing typing2 = new Typing("STATIC", 1);
            f341451c = typing2;
            Typing typing3 = new Typing("DEFAULT_TYPING", 2);
            f341452d = typing3;
            f341453e = new Typing[]{typing, typing2, typing3};
        }

        public Typing() {
            throw null;
        }

        public static Typing valueOf(String str) {
            return (Typing) Enum.valueOf(Typing.class, str);
        }

        public static Typing[] values() {
            return (Typing[]) f341453e.clone();
        }
    }

    Class<?> as() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends i> contentConverter() default i.a.class;

    Class<? extends l> contentUsing() default l.a.class;

    Class<? extends i> converter() default i.a.class;

    @Deprecated
    Inclusion include() default Inclusion.f341448b;

    Class<?> keyAs() default Void.class;

    Class<? extends l> keyUsing() default l.a.class;

    Class<? extends l> nullsUsing() default l.a.class;

    Typing typing() default Typing.f341452d;

    Class<? extends l> using() default l.a.class;
}
