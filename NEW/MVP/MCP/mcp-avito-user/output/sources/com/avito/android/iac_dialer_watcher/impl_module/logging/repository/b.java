package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacLogEntities.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/b;", "", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f167901a;

    /* renamed from: b, reason: collision with root package name */
    public final long f167902b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f167903c;

    public b(long j12, long j13, @Y61.k String str) {
        this.f167901a = j12;
        this.f167902b = j13;
        this.f167903c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f167901a == bVar.f167901a && this.f167902b == bVar.f167902b && L.f(this.f167903c, bVar.f167903c);
    }

    public final int hashCode() {
        return this.f167903c.hashCode() + androidx.appcompat.app.r.g(Long.hashCode(this.f167901a) * 31, 31, this.f167902b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacLogLine(sessionId=");
        sb2.append(this.f167901a);
        sb2.append(", createdAt=");
        sb2.append(this.f167902b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f167903c, ')');
    }
}
