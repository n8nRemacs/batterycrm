package com.yandex.metrica.impl.ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.di, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38758di {

    /* renamed from: a, reason: collision with root package name */
    public final long f380403a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f380404b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final List<Integer> f380405c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final List<Integer> f380406d;

    /* renamed from: e, reason: collision with root package name */
    public final long f380407e;

    /* renamed from: f, reason: collision with root package name */
    public final int f380408f;

    /* renamed from: g, reason: collision with root package name */
    public final long f380409g;

    /* renamed from: h, reason: collision with root package name */
    public final long f380410h;

    /* renamed from: i, reason: collision with root package name */
    public final long f380411i;

    /* renamed from: j, reason: collision with root package name */
    public final long f380412j;

    public C38758di(long j12, @j.N String str, @j.N List<Integer> list, @j.N List<Integer> list2, long j13, int i12, long j14, long j15, long j16, long j17) {
        this.f380403a = j12;
        this.f380404b = str;
        this.f380405c = A2.c(list);
        this.f380406d = A2.c(list2);
        this.f380407e = j13;
        this.f380408f = i12;
        this.f380409g = j14;
        this.f380410h = j15;
        this.f380411i = j16;
        this.f380412j = j17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38758di.class != obj.getClass()) {
            return false;
        }
        C38758di c38758di = (C38758di) obj;
        if (this.f380403a == c38758di.f380403a && this.f380407e == c38758di.f380407e && this.f380408f == c38758di.f380408f && this.f380409g == c38758di.f380409g && this.f380410h == c38758di.f380410h && this.f380411i == c38758di.f380411i && this.f380412j == c38758di.f380412j && this.f380404b.equals(c38758di.f380404b) && this.f380405c.equals(c38758di.f380405c)) {
            return this.f380406d.equals(c38758di.f380406d);
        }
        return false;
    }

    public int hashCode() {
        long j12 = this.f380403a;
        int iHashCode = (this.f380406d.hashCode() + ((this.f380405c.hashCode() + androidx.compose.foundation.H.d(((int) (j12 ^ (j12 >>> 32))) * 31, 31, this.f380404b)) * 31)) * 31;
        long j13 = this.f380407e;
        int i12 = (((iHashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f380408f) * 31;
        long j14 = this.f380409g;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f380410h;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f380411i;
        int i15 = (i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
        long j17 = this.f380412j;
        return i15 + ((int) ((j17 >>> 32) ^ j17));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SocketConfig{secondsToLive=");
        sb2.append(this.f380403a);
        sb2.append(", token='");
        sb2.append(this.f380404b);
        sb2.append("', ports=");
        sb2.append(this.f380405c);
        sb2.append(", portsHttp=");
        sb2.append(this.f380406d);
        sb2.append(", firstDelaySeconds=");
        sb2.append(this.f380407e);
        sb2.append(", launchDelaySeconds=");
        sb2.append(this.f380408f);
        sb2.append(", openEventIntervalSeconds=");
        sb2.append(this.f380409g);
        sb2.append(", minFailedRequestIntervalSeconds=");
        sb2.append(this.f380410h);
        sb2.append(", minSuccessfulRequestIntervalSeconds=");
        sb2.append(this.f380411i);
        sb2.append(", openRetryIntervalSeconds=");
        return androidx.appcompat.app.r.u(sb2, this.f380412j, '}');
    }
}
