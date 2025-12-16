package com.google.android.play.core.assetpacks.internal;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class N extends G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f358356c;

    public N(P p12) {
        this.f358356c = p12;
    }

    @Override // com.google.android.play.core.assetpacks.internal.G
    public final void a() {
        Q q12 = this.f358356c.f358357b;
        q12.f358360b.d("unlinkToDeath", new Object[0]);
        q12.f358371m.asBinder().unlinkToDeath(q12.f358368j, 0);
        q12.f358371m = null;
        q12.f358365g = false;
    }
}
