package com.google.gson.internal;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes6.dex */
class G extends H {
    @Override // com.google.gson.internal.H
    public final <T> T b(Class<T> cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}
