package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public abstract class tn<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f381906a;

    public tn(T t12) {
        this.f381906a = t12;
    }

    public abstract boolean a(tn<T> tnVar);

    public boolean equals(Object obj) {
        if (obj instanceof tn) {
            try {
                return a((tn) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
