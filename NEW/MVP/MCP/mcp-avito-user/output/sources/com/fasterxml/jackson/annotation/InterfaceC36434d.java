package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: JacksonInject.java */
@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.fasterxml.jackson.annotation.d, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public @interface InterfaceC36434d {

    /* compiled from: JacksonInject.java */
    /* renamed from: com.fasterxml.jackson.annotation.d$a */
    public static class a implements InterfaceC36432b<InterfaceC36434d>, Serializable {

        /* renamed from: d, reason: collision with root package name */
        public static final a f340988d = new a(null, null);
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Object f340989b;

        /* renamed from: c, reason: collision with root package name */
        public final Boolean f340990c;

        public a(Object obj, Boolean bool) {
            this.f340989b = obj;
            this.f340990c = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                a aVar = (a) obj;
                Boolean bool = this.f340990c;
                Boolean bool2 = aVar.f340990c;
                if (bool == null ? bool2 == null : bool.equals(bool2)) {
                    Object obj2 = aVar.f340989b;
                    Object obj3 = this.f340989b;
                    return obj3 == null ? obj2 == null : obj3.equals(obj2);
                }
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f340989b;
            int iHashCode = obj != null ? 1 + obj.hashCode() : 1;
            Boolean bool = this.f340990c;
            return bool != null ? iHashCode + bool.hashCode() : iHashCode;
        }

        public final String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.f340989b, this.f340990c);
        }
    }

    OptBoolean useInput() default OptBoolean.f340985c;

    String value() default "";
}
