package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.C39026oc;
import com.yandex.metrica.impl.ob.E;

/* loaded from: classes7.dex */
public class Hc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39026oc.a f378254a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Long f378255b;

    /* renamed from: c, reason: collision with root package name */
    private long f378256c;

    /* renamed from: d, reason: collision with root package name */
    private long f378257d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private Location f378258e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private E.b.a f378259f;

    public Hc(@j.N C39026oc.a aVar, long j12, long j13, @j.N Location location, @j.N E.b.a aVar2, @j.P Long l12) {
        this.f378254a = aVar;
        this.f378255b = l12;
        this.f378256c = j12;
        this.f378257d = j13;
        this.f378258e = location;
        this.f378259f = aVar2;
    }

    @j.N
    public E.b.a a() {
        return this.f378259f;
    }

    @j.P
    public Long b() {
        return this.f378255b;
    }

    @j.N
    public Location c() {
        return this.f378258e;
    }

    public long d() {
        return this.f378257d;
    }

    public long e() {
        return this.f378256c;
    }

    public String toString() {
        return "LocationWrapper{collectionMode=" + this.f378254a + ", mIncrementalId=" + this.f378255b + ", mReceiveTimestamp=" + this.f378256c + ", mReceiveElapsedRealtime=" + this.f378257d + ", mLocation=" + this.f378258e + ", mChargeType=" + this.f378259f + '}';
    }
}
