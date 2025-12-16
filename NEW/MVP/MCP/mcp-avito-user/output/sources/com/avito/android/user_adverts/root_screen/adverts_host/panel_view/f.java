package com.avito.android.user_adverts.root_screen.adverts_host.panel_view;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PanelViewListState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/f;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f313661a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f313662b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f313663c;

    public f() {
        this(false, false, false, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f313661a == fVar.f313661a && this.f313662b == fVar.f313662b && this.f313663c == fVar.f313663c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f313663c) + r.i(Boolean.hashCode(this.f313661a) * 31, 31, this.f313662b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PanelListState(containsCard=");
        sb2.append(this.f313661a);
        sb2.append(", containsFlatCard=");
        sb2.append(this.f313662b);
        sb2.append(", containsProgressCard=");
        return r.x(sb2, this.f313663c, ')');
    }

    public f(boolean z12, boolean z13, boolean z14) {
        this.f313661a = z12;
        this.f313662b = z13;
        this.f313663c = z14;
    }

    public /* synthetic */ f(boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14);
    }
}
