package com.yandex.metrica.impl.ob;

import android.util.Pair;

/* renamed from: com.yandex.metrica.impl.ob.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39109s {

    /* renamed from: a, reason: collision with root package name */
    private C38687am f381809a;

    /* renamed from: b, reason: collision with root package name */
    private long f381810b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f381811c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38713bn f381812d;

    /* renamed from: com.yandex.metrica.impl.ob.s$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f381813a;

        /* renamed from: b, reason: collision with root package name */
        public final long f381814b;

        public a(String str, long j12) {
            this.f381813a = str;
            this.f381814b = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f381814b != aVar.f381814b) {
                return false;
            }
            String str = this.f381813a;
            String str2 = aVar.f381813a;
            if (str != null) {
                if (str.equals(str2)) {
                    return true;
                }
            } else if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f381813a;
            int iHashCode = str != null ? str.hashCode() : 0;
            long j12 = this.f381814b;
            return (iHashCode * 31) + ((int) (j12 ^ (j12 >>> 32)));
        }
    }

    public C39109s(String str, long j12, @j.N C38737cm c38737cm) {
        this(str, j12, new C38713bn(c38737cm, "[App Environment]"));
    }

    public synchronized void a(@j.N Pair<String, String> pair) {
        if (this.f381812d.b(this.f381809a, (String) pair.first, (String) pair.second)) {
            this.f381811c = true;
        }
    }

    public synchronized void b() {
        this.f381809a = new C38687am();
    }

    public synchronized String toString() {
        return "Map size " + this.f381809a.size() + ". Is changed " + this.f381811c + ". Current revision " + this.f381810b;
    }

    @j.k0
    public C39109s(String str, long j12, @j.N C38713bn c38713bn) {
        this.f381810b = j12;
        try {
            this.f381809a = new C38687am(str);
        } catch (Throwable unused) {
            this.f381809a = new C38687am();
        }
        this.f381812d = c38713bn;
    }

    public synchronized a a() {
        try {
            if (this.f381811c) {
                this.f381810b++;
                this.f381811c = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new a(Tl.g(this.f381809a), this.f381810b);
    }
}
