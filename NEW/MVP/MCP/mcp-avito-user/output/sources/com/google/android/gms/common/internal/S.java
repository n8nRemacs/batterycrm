package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.InterfaceC36664q;
import com.google.android.gms.common.internal.AbstractC36699e;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class S implements AbstractC36699e.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36664q f349374b;

    public S(InterfaceC36664q interfaceC36664q) {
        this.f349374b = interfaceC36664q;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e.b
    public final void onConnectionFailed(@j.N ConnectionResult connectionResult) {
        this.f349374b.onConnectionFailed(connectionResult);
    }
}
