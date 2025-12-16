package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import j.InterfaceC42151g;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class y0 extends AbstractC36706h0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC36699e f349479g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC42151g
    public y0(AbstractC36699e abstractC36699e, int i12) {
        super(abstractC36699e, i12, null);
        this.f349479g = abstractC36699e;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36706h0
    public final void c(ConnectionResult connectionResult) {
        AbstractC36699e abstractC36699e = this.f349479g;
        abstractC36699e.getClass();
        abstractC36699e.f349413q.a(connectionResult);
        abstractC36699e.f349401e = connectionResult.f348860c;
        abstractC36699e.f349402f = System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.internal.AbstractC36706h0
    public final boolean d() {
        this.f349479g.f349413q.a(ConnectionResult.f348858f);
        return true;
    }
}
