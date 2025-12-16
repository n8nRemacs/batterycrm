package com.yandex.mobile.ads.embedded.guava.collect;

/* loaded from: classes8.dex */
final class h0<E> extends r<E> {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f382766h;

    /* renamed from: i, reason: collision with root package name */
    static final h0<Object> f382767i;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f382768c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f382769d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f382770e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f382771f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f382772g;

    static {
        Object[] objArr = new Object[0];
        f382766h = objArr;
        f382767i = new h0<>(objArr, 0, objArr, 0, 0);
    }

    public h0(Object[] objArr, int i12, Object[] objArr2, int i13, int i14) {
        this.f382768c = objArr;
        this.f382769d = i12;
        this.f382770e = objArr2;
        this.f382771f = i13;
        this.f382772g = i14;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int a(int i12, Object[] objArr) {
        System.arraycopy(this.f382768c, 0, objArr, i12, this.f382772g);
        return i12 + this.f382772g;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final Object[] c() {
        return this.f382768c;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@I41.a Object obj) {
        Object[] objArr = this.f382770e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA2 = m.a(obj.hashCode());
        while (true) {
            int i12 = iA2 & this.f382771f;
            Object obj2 = objArr[i12];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA2 = i12 + 1;
        }
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int d() {
        return this.f382772g;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final boolean f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public final p0<E> iterator() {
        return b().listIterator(0);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r
    public final p<E> h() {
        return p.b(this.f382772g, this.f382768c);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f382769d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f382772g;
    }
}
