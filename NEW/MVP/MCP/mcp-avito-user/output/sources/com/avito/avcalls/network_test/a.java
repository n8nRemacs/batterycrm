package com.avito.avcalls.network_test;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NetworkTestConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/network_test/a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f332983a;

    /* renamed from: b, reason: collision with root package name */
    public final int f332984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f332985c;

    /* renamed from: d, reason: collision with root package name */
    public final int f332986d;

    /* renamed from: e, reason: collision with root package name */
    public final int f332987e;

    public a(@Y61.k String str, int i12, int i13, int i14, int i15) {
        this.f332983a = str;
        this.f332984b = i12;
        this.f332985c = i13;
        this.f332986d = i14;
        this.f332987e = i15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f332983a, aVar.f332983a) && this.f332984b == aVar.f332984b && this.f332985c == aVar.f332985c && this.f332986d == aVar.f332986d && this.f332987e == aVar.f332987e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f332987e) + androidx.appcompat.app.r.e(this.f332986d, androidx.appcompat.app.r.e(this.f332985c, androidx.appcompat.app.r.e(this.f332984b, this.f332983a.hashCode() * 31, 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkTestConfig(stunServerIp=");
        sb2.append(this.f332983a);
        sb2.append(", stunServerPort=");
        sb2.append(this.f332984b);
        sb2.append(", packetsNum=");
        sb2.append(this.f332985c);
        sb2.append(", packetsSendingPeriod=");
        sb2.append(this.f332986d);
        sb2.append(", packetLengthInBytes=");
        return androidx.appcompat.app.r.t(sb2, this.f332987e, ')');
    }
}
