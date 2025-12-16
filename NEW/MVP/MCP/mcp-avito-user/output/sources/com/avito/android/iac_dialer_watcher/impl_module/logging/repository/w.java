package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacLogEntities.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f167936a;

    /* renamed from: b, reason: collision with root package name */
    public final long f167937b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f167938c;

    public w(long j12, long j13, @Y61.k String str) {
        this.f167936a = j12;
        this.f167937b = j13;
        this.f167938c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f167936a == wVar.f167936a && this.f167937b == wVar.f167937b && L.f(this.f167938c, wVar.f167938c);
    }

    public final int hashCode() {
        return this.f167938c.hashCode() + androidx.appcompat.app.r.g(Long.hashCode(this.f167936a) * 31, 31, this.f167937b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacLogSession(id=");
        sb2.append(this.f167936a);
        sb2.append(", createdAt=");
        return androidx.appcompat.app.r.u(sb2, this.f167937b, ')');
    }
}
