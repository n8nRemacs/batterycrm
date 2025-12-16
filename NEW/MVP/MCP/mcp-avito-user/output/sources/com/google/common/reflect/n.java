package com.google.common.reflect;

import com.google.common.base.M;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeParameter.java */
@InterfaceC37524c
/* loaded from: classes6.dex */
public abstract class n<T> extends m<T> {

    /* renamed from: b, reason: collision with root package name */
    public final TypeVariable<?> f360454b;

    public n() {
        Type typeA = a();
        M.f("%s should be a type variable.", typeA instanceof TypeVariable, typeA);
        this.f360454b = (TypeVariable) typeA;
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj instanceof n) {
            return this.f360454b.equals(((n) obj).f360454b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f360454b.hashCode();
    }

    public final String toString() {
        return this.f360454b.toString();
    }
}
