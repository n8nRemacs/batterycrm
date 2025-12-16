package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.compose.runtime.C22026a;
import androidx.room.InterfaceC23452i0;
import androidx.room.InterfaceC23472t;
import androidx.room.J;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacLogDbEntities.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/db/B;", "", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J
/* loaded from: classes14.dex */
public final /* data */ class B {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23452i0
    public final long f167798a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    public final long f167799b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    public final long f167800c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f167801d;

    public B(@Y61.k String str, long j12, long j13, long j14) {
        this.f167798a = j12;
        this.f167799b = j13;
        this.f167800c = j14;
        this.f167801d = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        return this.f167798a == b12.f167798a && this.f167799b == b12.f167799b && this.f167800c == b12.f167800c && L.f(this.f167801d, b12.f167801d);
    }

    public final int hashCode() {
        return this.f167801d.hashCode() + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f167798a) * 31, 31, this.f167799b), 31, this.f167800c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacLogDbLineEntity(lineId=");
        sb2.append(this.f167798a);
        sb2.append(", sessionId=");
        sb2.append(this.f167799b);
        sb2.append(", createdAt=");
        sb2.append(this.f167800c);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f167801d, ')');
    }

    public /* synthetic */ B(long j12, long j13, long j14, String str, int i12, C42822w c42822w) {
        this(str, (i12 & 1) != 0 ? 0L : j12, j13, j14);
    }
}
