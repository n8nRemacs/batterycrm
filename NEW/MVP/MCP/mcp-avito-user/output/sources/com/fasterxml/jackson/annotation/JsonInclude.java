package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes17.dex */
public @interface JsonInclude {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Include {

        /* renamed from: b, reason: collision with root package name */
        public static final Include f340954b;

        /* renamed from: c, reason: collision with root package name */
        public static final Include f340955c;

        /* renamed from: d, reason: collision with root package name */
        public static final Include f340956d;

        /* renamed from: e, reason: collision with root package name */
        public static final Include f340957e;

        /* renamed from: f, reason: collision with root package name */
        public static final Include f340958f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Include[] f340959g;

        static {
            Include include = new Include("ALWAYS", 0);
            f340954b = include;
            Include include2 = new Include("NON_NULL", 1);
            f340955c = include2;
            Include include3 = new Include("NON_ABSENT", 2);
            Include include4 = new Include("NON_EMPTY", 3);
            f340956d = include4;
            Include include5 = new Include("NON_DEFAULT", 4);
            f340957e = include5;
            Include include6 = new Include("CUSTOM", 5);
            Include include7 = new Include("USE_DEFAULTS", 6);
            f340958f = include7;
            f340959g = new Include[]{include, include2, include3, include4, include5, include6, include7};
        }

        public Include() {
            throw null;
        }

        public static Include valueOf(String str) {
            return (Include) Enum.valueOf(Include.class, str);
        }

        public static Include[] values() {
            return (Include[]) f340959g.clone();
        }
    }

    public static class a implements InterfaceC36432b<JsonInclude>, Serializable {

        /* renamed from: f, reason: collision with root package name */
        public static final a f340960f;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Include f340961b;

        /* renamed from: c, reason: collision with root package name */
        public final Include f340962c;

        /* renamed from: d, reason: collision with root package name */
        public final Class<?> f340963d;

        /* renamed from: e, reason: collision with root package name */
        public final Class<?> f340964e;

        static {
            Include include = Include.f340958f;
            f340960f = new a(include, include, null, null);
        }

        public a(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            Include include3 = Include.f340958f;
            this.f340961b = include == null ? include3 : include;
            this.f340962c = include2 == null ? include3 : include2;
            this.f340963d = cls == Void.class ? null : cls;
            this.f340964e = cls2 == Void.class ? null : cls2;
        }

        public final a a(a aVar) {
            if (aVar != null && aVar != f340960f) {
                Include include = Include.f340958f;
                Include include2 = aVar.f340961b;
                Include include3 = this.f340961b;
                boolean z12 = (include2 == include3 || include2 == include) ? false : true;
                Include include4 = aVar.f340962c;
                Include include5 = this.f340962c;
                boolean z13 = (include4 == include5 || include4 == include) ? false : true;
                Class<?> cls = aVar.f340963d;
                Class<?> cls2 = aVar.f340964e;
                Class<?> cls3 = this.f340963d;
                boolean z14 = (cls == cls3 && cls2 == cls3) ? false : true;
                if (z12) {
                    return z13 ? new a(include2, include4, cls, cls2) : new a(include2, include5, cls, cls2);
                }
                if (z13) {
                    return new a(include3, include4, cls, cls2);
                }
                if (z14) {
                    return new a(include3, include5, cls, cls2);
                }
            }
            return this;
        }

        public final a b(Include include) {
            return include == this.f340961b ? this : new a(include, this.f340962c, this.f340963d, this.f340964e);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f340961b == this.f340961b && aVar.f340962c == this.f340962c && aVar.f340963d == this.f340963d && aVar.f340964e == this.f340964e;
        }

        public final int hashCode() {
            return this.f340962c.hashCode() + (this.f340961b.hashCode() << 2);
        }

        public Object readResolve() {
            Include include = Include.f340958f;
            return (this.f340961b == include && this.f340962c == include && this.f340963d == null && this.f340964e == null) ? f340960f : this;
        }

        public final String toString() {
            StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(80, "JsonInclude.Value(value=");
            sbQ.append(this.f340961b);
            sbQ.append(",content=");
            sbQ.append(this.f340962c);
            Class<?> cls = this.f340963d;
            if (cls != null) {
                sbQ.append(",valueFilter=");
                sbQ.append(cls.getName());
                sbQ.append(".class");
            }
            Class<?> cls2 = this.f340964e;
            if (cls2 != null) {
                sbQ.append(",contentFilter=");
                sbQ.append(cls2.getName());
                sbQ.append(".class");
            }
            sbQ.append(')');
            return sbQ.toString();
        }
    }

    Include content() default Include.f340954b;

    Class<?> contentFilter() default Void.class;

    Include value() default Include.f340954b;

    Class<?> valueFilter() default Void.class;
}
