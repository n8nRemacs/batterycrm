package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes6.dex */
class D extends H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f362004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f362005b;

    public D(Object obj, Method method) {
        this.f362004a = method;
        this.f362005b = obj;
    }

    @Override // com.google.gson.internal.H
    public final <T> T b(Class<T> cls) {
        String strA = H.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.f362004a.invoke(this.f362005b, cls);
    }
}
