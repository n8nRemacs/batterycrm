package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class G<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final If.c f378154e = new If.c();

    /* renamed from: a, reason: collision with root package name */
    private volatile long f378155a;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f378156b;

    /* renamed from: c, reason: collision with root package name */
    private long f378157c = 0;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private T f378158d = null;

    public G(long j12, long j13) {
        this.f378155a = j12;
        this.f378156b = j13;
    }

    @j.P
    public T a() {
        return this.f378158d;
    }

    public final boolean b() {
        return this.f378158d == null;
    }

    public final boolean c() {
        if (this.f378157c == 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f378157c;
        return jCurrentTimeMillis > this.f378156b || jCurrentTimeMillis < 0;
    }

    public final boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f378157c;
        return jCurrentTimeMillis > this.f378155a || jCurrentTimeMillis < 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CachedData{refreshTime=");
        sb2.append(this.f378155a);
        sb2.append(", mCachedTime=");
        sb2.append(this.f378157c);
        sb2.append(", expiryTime=");
        sb2.append(this.f378156b);
        sb2.append(", mCachedData=");
        return androidx.compose.foundation.H.n(sb2, this.f378158d, '}');
    }

    public void a(@j.P T t12) {
        this.f378158d = t12;
        this.f378157c = System.currentTimeMillis();
    }

    public void a(long j12, long j13) {
        this.f378155a = j12;
        this.f378156b = j13;
    }
}
