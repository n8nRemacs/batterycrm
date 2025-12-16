package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Set;

/* compiled from: JsonIgnoreProperties.java */
@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes17.dex */
public @interface p {

    /* compiled from: JsonIgnoreProperties.java */
    public static class a implements InterfaceC36432b<p>, Serializable {

        /* renamed from: g, reason: collision with root package name */
        public static final a f340991g = new a(Collections.emptySet(), false, false, false, true);
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Set<String> f340992b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f340993c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f340994d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f340995e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f340996f;

        public a(Set<String> set, boolean z12, boolean z13, boolean z14, boolean z15) {
            if (set == null) {
                this.f340992b = Collections.emptySet();
            } else {
                this.f340992b = set;
            }
            this.f340993c = z12;
            this.f340994d = z13;
            this.f340995e = z14;
            this.f340996f = z15;
        }

        public static boolean a(Set<String> set, boolean z12, boolean z13, boolean z14, boolean z15) {
            a aVar = f340991g;
            if (z12 == aVar.f340993c && z13 == aVar.f340994d && z14 == aVar.f340995e && z15 == aVar.f340996f) {
                return set == null || set.size() == 0;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (obj.getClass() == getClass()) {
                a aVar = (a) obj;
                if (this.f340993c == aVar.f340993c && this.f340996f == aVar.f340996f && this.f340994d == aVar.f340994d && this.f340995e == aVar.f340995e && this.f340992b.equals(aVar.f340992b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f340992b.size() + (this.f340993c ? 1 : -3) + (this.f340994d ? 3 : -7) + (this.f340995e ? 7 : -11) + (this.f340996f ? 11 : -13);
        }

        public Object readResolve() {
            return a(this.f340992b, this.f340993c, this.f340994d, this.f340995e, this.f340996f) ? f340991g : this;
        }

        public final String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.f340992b, Boolean.valueOf(this.f340993c), Boolean.valueOf(this.f340994d), Boolean.valueOf(this.f340995e), Boolean.valueOf(this.f340996f));
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
