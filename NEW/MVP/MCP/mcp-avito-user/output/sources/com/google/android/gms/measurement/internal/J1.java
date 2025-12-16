package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class J1<V> {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f354743g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f354744a;

    /* renamed from: b, reason: collision with root package name */
    public final H1<V> f354745b;

    /* renamed from: c, reason: collision with root package name */
    public final V f354746c;

    /* renamed from: d, reason: collision with root package name */
    public final V f354747d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f354748e;

    /* renamed from: f, reason: collision with root package name */
    @j.B
    public volatile V f354749f;

    public J1() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public J1(String str, Object obj, Object obj2, H1 h12, I1 i12) {
        this.f354748e = new Object();
        this.f354749f = null;
        this.f354744a = str;
        this.f354746c = obj;
        this.f354747d = obj2;
        this.f354745b = h12;
    }

    public final V a(V v12) {
        synchronized (this.f354748e) {
        }
        if (v12 != null) {
            return v12;
        }
        if (G1.f354683a == null) {
            return this.f354746c;
        }
        synchronized (f354743g) {
            try {
                if (C36852c.a()) {
                    return this.f354749f == null ? this.f354746c : this.f354749f;
                }
                try {
                    for (J1<?> j12 : E.f354607a) {
                        if (C36852c.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        V v13 = null;
                        try {
                            H1<?> h12 = j12.f354745b;
                            if (h12 != null) {
                                v13 = (V) h12.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f354743g) {
                            j12.f354749f = v13;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                H1<V> h13 = this.f354745b;
                if (h13 == null) {
                    return this.f354746c;
                }
                try {
                    return h13.zza();
                } catch (IllegalStateException unused3) {
                    return this.f354746c;
                } catch (SecurityException unused4) {
                    return this.f354746c;
                }
            } finally {
            }
        }
    }
}
