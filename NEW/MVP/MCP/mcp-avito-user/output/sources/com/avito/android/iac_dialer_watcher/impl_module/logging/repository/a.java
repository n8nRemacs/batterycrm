package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacLogEntities.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f167893a;

    /* renamed from: b, reason: collision with root package name */
    public final long f167894b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f167895c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f167896d;

    /* renamed from: e, reason: collision with root package name */
    public final long f167897e;

    /* renamed from: f, reason: collision with root package name */
    public final long f167898f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f167899g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f167900h;

    public a(long j12, long j13, @Y61.k String str, @Y61.k String str2, long j14, long j15, boolean z12, @Y61.k String str3) {
        this.f167893a = j12;
        this.f167894b = j13;
        this.f167895c = str;
        this.f167896d = str2;
        this.f167897e = j14;
        this.f167898f = j15;
        this.f167899g = z12;
        this.f167900h = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f167893a == aVar.f167893a && this.f167894b == aVar.f167894b && L.f(this.f167895c, aVar.f167895c) && L.f(this.f167896d, aVar.f167896d) && this.f167897e == aVar.f167897e && this.f167898f == aVar.f167898f && this.f167899g == aVar.f167899g && L.f(this.f167900h, aVar.f167900h);
    }

    public final int hashCode() {
        return this.f167900h.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(H.d(H.d(androidx.appcompat.app.r.g(Long.hashCode(this.f167893a) * 31, 31, this.f167894b), 31, this.f167895c), 31, this.f167896d), 31, this.f167897e), 31, this.f167898f), 31, this.f167899g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacLogCall(sessionId=");
        sb2.append(this.f167893a);
        sb2.append(", index=");
        sb2.append(this.f167894b);
        sb2.append(", callId=");
        sb2.append(this.f167895c);
        sb2.append(", scenario=");
        return C22026a.c(sb2, this.f167896d, ')');
    }
}
