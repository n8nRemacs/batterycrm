package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes6.dex */
class F extends H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f362017a;

    public F(Method method) {
        this.f362017a = method;
    }

    @Override // com.google.gson.internal.H
    public final <T> T b(Class<T> cls) {
        String strA = H.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.f362017a.invoke(null, cls, Object.class);
    }
}
