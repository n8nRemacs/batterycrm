package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/* compiled from: JsonIncludeProperties.java */
@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes17.dex */
public @interface r {

    /* compiled from: JsonIncludeProperties.java */
    public static class a implements InterfaceC36432b<r>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final a f340997c = new a(null);
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Set<String> f340998b;

        public a(Set<String> set) {
            this.f340998b = set;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (obj.getClass() == getClass()) {
                Set<String> set = this.f340998b;
                Set<String> set2 = ((a) obj).f340998b;
                if (set == null ? set2 == null : set.equals(set2)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Set<String> set = this.f340998b;
            if (set == null) {
                return 0;
            }
            return set.size();
        }

        public final String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", this.f340998b);
        }
    }

    String[] value() default {};
}
