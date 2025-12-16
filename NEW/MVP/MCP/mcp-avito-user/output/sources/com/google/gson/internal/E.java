package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes6.dex */
class E extends H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f362006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f362007b;

    public E(int i12, Method method) {
        this.f362006a = method;
        this.f362007b = i12;
    }

    @Override // com.google.gson.internal.H
    public final <T> T b(Class<T> cls) {
        String strA = H.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.f362006a.invoke(null, cls, Integer.valueOf(this.f362007b));
    }
}
