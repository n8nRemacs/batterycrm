package org.mockito;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: answer */
/* JADX WARN: Method from annotation default annotation not found: extraInterfaces */
/* JADX WARN: Method from annotation default annotation not found: lenient */
/* JADX WARN: Method from annotation default annotation not found: name */
/* JADX WARN: Method from annotation default annotation not found: serializable */
/* JADX WARN: Method from annotation default annotation not found: strictness */
/* JADX WARN: Method from annotation default annotation not found: stubOnly */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface Mock {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Strictness {

        /* renamed from: b, reason: collision with root package name */
        public static final Strictness f421492b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Strictness[] f421493c;

        static {
            Strictness strictness = new Strictness("TEST_LEVEL_DEFAULT", 0);
            f421492b = strictness;
            f421493c = new Strictness[]{strictness, new Strictness("LENIENT", 1), new Strictness("WARN", 2), new Strictness("STRICT_STUBS", 3)};
        }

        public Strictness() {
            throw null;
        }

        public static Strictness valueOf(String str) {
            return (Strictness) Enum.valueOf(Strictness.class, str);
        }

        public static Strictness[] values() {
            return (Strictness[]) f421493c.clone();
        }
    }
}
