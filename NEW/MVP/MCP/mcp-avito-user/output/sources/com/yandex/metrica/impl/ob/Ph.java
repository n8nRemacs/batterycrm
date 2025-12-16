package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Ph {

    /* renamed from: a, reason: collision with root package name */
    public final long f379213a;

    /* renamed from: b, reason: collision with root package name */
    public final long f379214b;

    /* renamed from: c, reason: collision with root package name */
    public final long f379215c;

    /* renamed from: d, reason: collision with root package name */
    public final long f379216d;

    public Ph(long j12, long j13, long j14, long j15) {
        this.f379213a = j12;
        this.f379214b = j13;
        this.f379215c = j14;
        this.f379216d = j15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ph.class != obj.getClass()) {
            return false;
        }
        Ph ph2 = (Ph) obj;
        return this.f379213a == ph2.f379213a && this.f379214b == ph2.f379214b && this.f379215c == ph2.f379215c && this.f379216d == ph2.f379216d;
    }

    public int hashCode() {
        long j12 = this.f379213a;
        long j13 = this.f379214b;
        int i12 = ((((int) (j12 ^ (j12 >>> 32))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f379215c;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f379216d;
        return i13 + ((int) ((j15 >>> 32) ^ j15));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CacheControl{cellsAroundTtl=");
        sb2.append(this.f379213a);
        sb2.append(", wifiNetworksTtl=");
        sb2.append(this.f379214b);
        sb2.append(", lastKnownLocationTtl=");
        sb2.append(this.f379215c);
        sb2.append(", netInterfacesTtl=");
        return androidx.appcompat.app.r.u(sb2, this.f379216d, '}');
    }
}
