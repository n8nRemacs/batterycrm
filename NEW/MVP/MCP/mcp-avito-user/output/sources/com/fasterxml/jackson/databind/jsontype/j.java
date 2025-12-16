package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: NamedType.java */
/* loaded from: classes4.dex */
public final class j implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f342179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f342180c;

    /* renamed from: d, reason: collision with root package name */
    public final String f342181d;

    public j() {
        throw null;
    }

    public j(Class<?> cls, String str) {
        this.f342179b = cls;
        this.f342180c = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        this.f342181d = (str == null || str.isEmpty()) ? null : str;
    }

    public final boolean a() {
        return this.f342181d != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != j.class) {
            return false;
        }
        j jVar = (j) obj;
        return this.f342179b == jVar.f342179b && Objects.equals(this.f342181d, jVar.f342181d);
    }

    public final int hashCode() {
        return this.f342180c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[NamedType, class ");
        androidx.compose.ui.graphics.colorspace.e.u(this.f342179b, sb2, ", name: ");
        return AK.c.s(sb2, this.f342181d == null ? "null" : AK.c.s(new StringBuilder("'"), this.f342181d, "'"), "]");
    }
}
