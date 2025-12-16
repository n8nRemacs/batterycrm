package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.room.InterfaceC23472t;
import androidx.room.J;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacLogDbEntities.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/db/A;", "", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J
/* loaded from: classes14.dex */
public final /* data */ class A {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    public final long f167790a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    public final long f167791b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f167792c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f167793d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC23472t
    public final long f167794e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC23472t
    public final long f167795f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f167796g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f167797h;

    public A(long j12, long j13, @Y61.k String str, @Y61.k String str2, long j14, long j15, boolean z12, @Y61.k String str3) {
        this.f167790a = j12;
        this.f167791b = j13;
        this.f167792c = str;
        this.f167793d = str2;
        this.f167794e = j14;
        this.f167795f = j15;
        this.f167796g = z12;
        this.f167797h = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a12 = (A) obj;
        return this.f167790a == a12.f167790a && this.f167791b == a12.f167791b && L.f(this.f167792c, a12.f167792c) && L.f(this.f167793d, a12.f167793d) && this.f167794e == a12.f167794e && this.f167795f == a12.f167795f && this.f167796g == a12.f167796g && L.f(this.f167797h, a12.f167797h);
    }

    public final int hashCode() {
        return this.f167797h.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(H.d(H.d(androidx.appcompat.app.r.g(Long.hashCode(this.f167790a) * 31, 31, this.f167791b), 31, this.f167792c), 31, this.f167793d), 31, this.f167794e), 31, this.f167795f), 31, this.f167796g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacLogDbCallEntity(sessionId=");
        sb2.append(this.f167790a);
        sb2.append(", index=");
        sb2.append(this.f167791b);
        sb2.append(", callId=");
        sb2.append(this.f167792c);
        sb2.append(", scenario=");
        sb2.append(this.f167793d);
        sb2.append(", startedAt=");
        sb2.append(this.f167794e);
        sb2.append(", finishedAt=");
        sb2.append(this.f167795f);
        sb2.append(", isLinesCountLimitReachedAtCallStart=");
        sb2.append(this.f167796g);
        sb2.append(", header=");
        return C22026a.c(sb2, this.f167797h, ')');
    }
}
