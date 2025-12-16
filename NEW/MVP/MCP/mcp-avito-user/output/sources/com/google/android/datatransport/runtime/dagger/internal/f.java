package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.Provider;

/* compiled from: DoubleCheck.java */
/* loaded from: classes10.dex */
public final class f<T> implements Provider<T>, AX0.e<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f343130c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile g f343131a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f343132b;

    public static Provider a(g gVar) {
        gVar.getClass();
        if (gVar instanceof f) {
            return gVar;
        }
        f fVar = new f();
        fVar.f343132b = f343130c;
        fVar.f343131a = gVar;
        return fVar;
    }

    public static void b(Object obj, Object obj2) {
        if (obj == f343130c || (obj instanceof o) || obj == obj2) {
            return;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public final T get() {
        T t12 = (T) this.f343132b;
        Object obj = f343130c;
        if (t12 == obj) {
            synchronized (this) {
                try {
                    t12 = (T) this.f343132b;
                    if (t12 == obj) {
                        t12 = this.f343131a.get();
                        b(this.f343132b, t12);
                        this.f343132b = t12;
                        this.f343131a = null;
                    }
                } finally {
                }
            }
        }
        return t12;
    }
}
