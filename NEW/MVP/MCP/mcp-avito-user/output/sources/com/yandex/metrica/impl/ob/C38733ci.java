package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ci, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38733ci {

    /* renamed from: a, reason: collision with root package name */
    public final long f380345a;

    /* renamed from: b, reason: collision with root package name */
    public final long f380346b;

    /* renamed from: c, reason: collision with root package name */
    public final long f380347c;

    /* renamed from: d, reason: collision with root package name */
    public final long f380348d;

    public C38733ci(long j12, long j13, long j14, long j15) {
        this.f380345a = j12;
        this.f380346b = j13;
        this.f380347c = j14;
        this.f380348d = j15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38733ci.class != obj.getClass()) {
            return false;
        }
        C38733ci c38733ci = (C38733ci) obj;
        return this.f380345a == c38733ci.f380345a && this.f380346b == c38733ci.f380346b && this.f380347c == c38733ci.f380347c && this.f380348d == c38733ci.f380348d;
    }

    public int hashCode() {
        long j12 = this.f380345a;
        long j13 = this.f380346b;
        int i12 = ((((int) (j12 ^ (j12 >>> 32))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f380347c;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f380348d;
        return i13 + ((int) ((j15 >>> 32) ^ j15));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SdkFingerprintingConfig{minCollectingInterval=");
        sb2.append(this.f380345a);
        sb2.append(", minFirstCollectingDelay=");
        sb2.append(this.f380346b);
        sb2.append(", minCollectingDelayAfterLaunch=");
        sb2.append(this.f380347c);
        sb2.append(", minRequestRetryInterval=");
        return androidx.appcompat.app.r.u(sb2, this.f380348d, '}');
    }
}
