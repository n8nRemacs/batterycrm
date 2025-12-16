package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: JsonSetter.java */
@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes17.dex */
public @interface z {

    /* compiled from: JsonSetter.java */
    public static class a implements InterfaceC36432b<z>, Serializable {

        /* renamed from: d, reason: collision with root package name */
        public static final a f340999d;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Nulls f341000b;

        /* renamed from: c, reason: collision with root package name */
        public final Nulls f341001c;

        static {
            Nulls nulls = Nulls.f340982e;
            f340999d = new a(nulls, nulls);
        }

        public a(Nulls nulls, Nulls nulls2) {
            this.f341000b = nulls;
            this.f341001c = nulls2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f341000b == this.f341000b && aVar.f341001c == this.f341001c;
        }

        public final int hashCode() {
            return this.f341000b.ordinal() + (this.f341001c.ordinal() << 2);
        }

        public Object readResolve() {
            Nulls nulls = this.f341000b;
            Nulls nulls2 = this.f341001c;
            Nulls nulls3 = Nulls.f340982e;
            return (nulls == nulls3 && nulls2 == nulls3) ? f340999d : this;
        }

        public final String toString() {
            return "JsonSetter.Value(valueNulls=" + this.f341000b + ",contentNulls=" + this.f341001c + ")";
        }
    }

    Nulls contentNulls() default Nulls.f340982e;

    Nulls nulls() default Nulls.f340982e;

    String value() default "";
}
