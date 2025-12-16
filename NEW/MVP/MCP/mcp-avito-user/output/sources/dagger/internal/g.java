package dagger.internal;

import javax.inject.Provider;

/* compiled from: DoubleCheck.java */
/* loaded from: classes8.dex */
public final class g<T> implements u<T>, h31.e<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f393945c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile u<T> f393946a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f393947b = f393945c;

    public g(u<T> uVar) {
        this.f393946a = uVar;
    }

    public static <P extends u<T>, T> h31.e<T> a(P p12) {
        if (p12 instanceof h31.e) {
            return (h31.e) p12;
        }
        p12.getClass();
        return new g(p12);
    }

    public static <P extends Provider<T>, T> h31.e<T> b(P p12) {
        return a(w.a(p12));
    }

    @Deprecated
    public static u c(h hVar) {
        return d(w.a(hVar));
    }

    public static <P extends u<T>, T> u<T> d(P p12) {
        p12.getClass();
        return p12 instanceof g ? p12 : new g(p12);
    }

    @Override // javax.inject.Provider
    public final T get() {
        T t12 = (T) this.f393947b;
        Object obj = f393945c;
        if (t12 == obj) {
            synchronized (this) {
                try {
                    t12 = (T) this.f393947b;
                    if (t12 == obj) {
                        t12 = this.f393946a.get();
                        Object obj2 = this.f393947b;
                        if (obj2 != obj && obj2 != t12) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t12 + ". This is likely due to a circular dependency.");
                        }
                        this.f393947b = t12;
                        this.f393946a = null;
                    }
                } finally {
                }
            }
        }
        return t12;
    }
}
