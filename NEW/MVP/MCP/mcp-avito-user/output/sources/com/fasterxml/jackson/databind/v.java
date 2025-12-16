package com.fasterxml.jackson.databind;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* compiled from: PropertyName.java */
/* loaded from: classes4.dex */
public class v implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final v f342654e = new v("", null);

    /* renamed from: f, reason: collision with root package name */
    public static final v f342655f = new v(new String(""), null);
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f342656b;

    /* renamed from: c, reason: collision with root package name */
    public final String f342657c;

    /* renamed from: d, reason: collision with root package name */
    public com.fasterxml.jackson.core.io.n f342658d;

    public v(String str, String str2) {
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        this.f342656b = str == null ? "" : str;
        this.f342657c = str2;
    }

    public static v a(String str) {
        return (str == null || str.isEmpty()) ? f342654e : new v(com.fasterxml.jackson.core.util.g.f341303c.a(str), null);
    }

    public static v b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.isEmpty()) ? f342654e : new v(com.fasterxml.jackson.core.util.g.f341303c.a(str), str2);
    }

    public final boolean c() {
        return this.f342657c == null && this.f342656b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        v vVar = (v) obj;
        String str = vVar.f342656b;
        String str2 = this.f342656b;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = vVar.f342657c;
        String str4 = this.f342657c;
        return str4 == null ? str3 == null : str4.equals(str3);
    }

    public final int hashCode() {
        String str = this.f342656b;
        String str2 = this.f342657c;
        if (str2 == null) {
            return str.hashCode();
        }
        return str.hashCode() ^ str2.hashCode();
    }

    public Object readResolve() {
        String str;
        return (this.f342657c == null && ((str = this.f342656b) == null || "".equals(str))) ? f342654e : this;
    }

    public final String toString() {
        String str = this.f342656b;
        String str2 = this.f342657c;
        if (str2 == null) {
            return str;
        }
        return "{" + str2 + "}" + str;
    }
}
