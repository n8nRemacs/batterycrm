package com.avito.avcalls.android.network_test;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NetworkTestConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/network_test/a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f331783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331784b;

    /* renamed from: c, reason: collision with root package name */
    public final int f331785c;

    /* renamed from: d, reason: collision with root package name */
    public final int f331786d;

    /* renamed from: e, reason: collision with root package name */
    public final int f331787e;

    public a(@Y61.k String str, int i12, int i13, int i14, int i15) {
        this.f331783a = str;
        this.f331784b = i12;
        this.f331785c = i13;
        this.f331786d = i14;
        this.f331787e = i15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f331783a, aVar.f331783a) && this.f331784b == aVar.f331784b && this.f331785c == aVar.f331785c && this.f331786d == aVar.f331786d && this.f331787e == aVar.f331787e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f331787e) + androidx.appcompat.app.r.e(this.f331786d, androidx.appcompat.app.r.e(this.f331785c, androidx.appcompat.app.r.e(this.f331784b, this.f331783a.hashCode() * 31, 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkTestConfig(stunServerIp=");
        sb2.append(this.f331783a);
        sb2.append(", stunServerPort=");
        sb2.append(this.f331784b);
        sb2.append(", packetsNum=");
        sb2.append(this.f331785c);
        sb2.append(", packetsSendingPeriod=");
        sb2.append(this.f331786d);
        sb2.append(", packetLengthInBytes=");
        return androidx.appcompat.app.r.t(sb2, this.f331787e, ')');
    }
}
