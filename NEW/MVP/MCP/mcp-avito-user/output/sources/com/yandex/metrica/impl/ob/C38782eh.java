package com.yandex.metrica.impl.ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.eh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38782eh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final List<C38857hh> f380491a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f380492b;

    /* renamed from: c, reason: collision with root package name */
    public final long f380493c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f380494d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f380495e;

    public C38782eh(@j.N List<C38857hh> list, @j.N String str, long j12, boolean z12, boolean z13) {
        this.f380491a = A2.c(list);
        this.f380492b = str;
        this.f380493c = j12;
        this.f380494d = z12;
        this.f380495e = z13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SdkFingerprintingState{sdkItemList=");
        sb2.append(this.f380491a);
        sb2.append(", etag='");
        sb2.append(this.f380492b);
        sb2.append("', lastAttemptTime=");
        sb2.append(this.f380493c);
        sb2.append(", hasFirstCollectionOccurred=");
        sb2.append(this.f380494d);
        sb2.append(", shouldRetry=");
        return androidx.appcompat.app.r.x(sb2, this.f380495e, '}');
    }
}
