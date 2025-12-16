package com.google.firebase.components;

/* compiled from: Lazy.java */
/* loaded from: classes13.dex */
public class p<T> implements wZ0.b<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f360775c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f360776a = f360775c;

    /* renamed from: b, reason: collision with root package name */
    public volatile wZ0.b<T> f360777b;

    public p(wZ0.b<T> bVar) {
        this.f360777b = bVar;
    }

    @Override // wZ0.b
    public final T get() {
        T t12 = (T) this.f360776a;
        Object obj = f360775c;
        if (t12 == obj) {
            synchronized (this) {
                try {
                    t12 = (T) this.f360776a;
                    if (t12 == obj) {
                        t12 = this.f360777b.get();
                        this.f360776a = t12;
                        this.f360777b = null;
                    }
                } finally {
                }
            }
        }
        return t12;
    }
}
