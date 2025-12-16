package com.avito.android.iac_dialer.impl_module.overlay.widjet.ui;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: IacDialerOverviewGeneralViewPositionHolder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/widjet/ui/f;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public int f166188a;

    /* renamed from: b, reason: collision with root package name */
    public int f166189b;

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f166188a == fVar.f166188a && this.f166189b == fVar.f166189b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166189b) + (Integer.hashCode(this.f166188a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacDialerOverviewGeneralViewPositionHolder(x=");
        sb2.append(this.f166188a);
        sb2.append(", y=");
        return r.t(sb2, this.f166189b, ')');
    }
}
