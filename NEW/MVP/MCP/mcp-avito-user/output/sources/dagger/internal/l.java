package dagger.internal;

/* compiled from: InstanceFactory.java */
/* loaded from: classes8.dex */
public final class l<T> implements h<T>, h31.e<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final l<Object> f393948b = new l<>(null);

    /* renamed from: a, reason: collision with root package name */
    public final T f393949a;

    public l(T t12) {
        this.f393949a = t12;
    }

    public static l a(Object obj) {
        t.b(obj, "instance cannot be null");
        return new l(obj);
    }

    public static l b(Object obj) {
        return obj == null ? f393948b : new l(obj);
    }

    @Override // javax.inject.Provider
    public final T get() {
        return this.f393949a;
    }
}
