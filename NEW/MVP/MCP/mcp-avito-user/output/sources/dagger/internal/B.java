package dagger.internal;

/* compiled from: SingleCheck.java */
/* loaded from: classes8.dex */
public final class B<T> implements u<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f393939c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile u<T> f393940a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f393941b;

    public B() {
        throw null;
    }

    public static <P extends u<T>, T> u<T> a(P p12) {
        if ((p12 instanceof B) || (p12 instanceof g)) {
            return p12;
        }
        p12.getClass();
        B b12 = new B();
        b12.f393941b = f393939c;
        b12.f393940a = p12;
        return b12;
    }

    @Override // javax.inject.Provider
    public final T get() {
        T t12 = (T) this.f393941b;
        if (t12 != f393939c) {
            return t12;
        }
        u<T> uVar = this.f393940a;
        if (uVar == null) {
            return (T) this.f393941b;
        }
        T t13 = uVar.get();
        this.f393941b = t13;
        this.f393940a = null;
        return t13;
    }
}
