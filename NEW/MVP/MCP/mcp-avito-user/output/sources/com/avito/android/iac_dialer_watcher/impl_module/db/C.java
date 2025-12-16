package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.compose.runtime.C22026a;
import androidx.room.InterfaceC23452i0;
import androidx.room.InterfaceC23472t;
import androidx.room.J;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacLogDbEntities.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/db/C;", "", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J
/* loaded from: classes14.dex */
public final /* data */ class C {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23452i0
    public final long f167802a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    public final long f167803b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f167804c;

    public C(long j12, long j13, @Y61.k String str) {
        this.f167802a = j12;
        this.f167803b = j13;
        this.f167804c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return this.f167802a == c12.f167802a && this.f167803b == c12.f167803b && L.f(this.f167804c, c12.f167804c);
    }

    public final int hashCode() {
        return this.f167804c.hashCode() + androidx.appcompat.app.r.g(Long.hashCode(this.f167802a) * 31, 31, this.f167803b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacLogDbSessionEntity(id=");
        sb2.append(this.f167802a);
        sb2.append(", createdAt=");
        sb2.append(this.f167803b);
        sb2.append(", callsHistory=");
        return C22026a.c(sb2, this.f167804c, ')');
    }

    public /* synthetic */ C(long j12, long j13, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0L : j12, j13, str);
    }
}
