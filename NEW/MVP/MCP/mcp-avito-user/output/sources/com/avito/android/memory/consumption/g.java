package com.avito.android.memory.consumption;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: MemoryMetrics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/memory/consumption/g;", "", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f186124a;

    /* renamed from: b, reason: collision with root package name */
    public final long f186125b;

    /* renamed from: c, reason: collision with root package name */
    public final long f186126c;

    /* renamed from: d, reason: collision with root package name */
    public final long f186127d;

    /* renamed from: e, reason: collision with root package name */
    public final long f186128e;

    /* renamed from: f, reason: collision with root package name */
    public final long f186129f;

    /* renamed from: g, reason: collision with root package name */
    public final long f186130g;

    /* renamed from: h, reason: collision with root package name */
    public final long f186131h;

    /* renamed from: i, reason: collision with root package name */
    public final long f186132i;

    /* renamed from: j, reason: collision with root package name */
    public final long f186133j;

    public g(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23) {
        this.f186124a = j12;
        this.f186125b = j13;
        this.f186126c = j14;
        this.f186127d = j15;
        this.f186128e = j16;
        this.f186129f = j17;
        this.f186130g = j18;
        this.f186131h = j19;
        this.f186132i = j22;
        this.f186133j = j23;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f186124a == gVar.f186124a && this.f186125b == gVar.f186125b && this.f186126c == gVar.f186126c && this.f186127d == gVar.f186127d && this.f186128e == gVar.f186128e && this.f186129f == gVar.f186129f && this.f186130g == gVar.f186130g && this.f186131h == gVar.f186131h && this.f186132i == gVar.f186132i && this.f186133j == gVar.f186133j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f186133j) + r.g(r.g(r.g(r.g(r.g(r.g(r.g(r.g(Long.hashCode(this.f186124a) * 31, 31, this.f186125b), 31, this.f186126c), 31, this.f186127d), 31, this.f186128e), 31, this.f186129f), 31, this.f186130g), 31, this.f186131h), 31, this.f186132i);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MemoryMetrics(javaHeapSize=");
        sb2.append(this.f186124a);
        sb2.append(", nativeHeapSize=");
        sb2.append(this.f186125b);
        sb2.append(", codeSize=");
        sb2.append(this.f186126c);
        sb2.append(", stackSize=");
        sb2.append(this.f186127d);
        sb2.append(", graphicsSize=");
        sb2.append(this.f186128e);
        sb2.append(", privateOtherSize=");
        sb2.append(this.f186129f);
        sb2.append(", gcCount=");
        sb2.append(this.f186130g);
        sb2.append(", gcTime=");
        sb2.append(this.f186131h);
        sb2.append(", blockingGcCount=");
        sb2.append(this.f186132i);
        sb2.append(", blockingGcTime=");
        return r.u(sb2, this.f186133j, ')');
    }
}
