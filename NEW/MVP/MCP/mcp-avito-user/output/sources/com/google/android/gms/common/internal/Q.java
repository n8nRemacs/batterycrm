package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.InterfaceC36637f;
import com.google.android.gms.common.internal.AbstractC36699e;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class Q implements AbstractC36699e.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36637f f349367b;

    public Q(InterfaceC36637f interfaceC36637f) {
        this.f349367b = interfaceC36637f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e.a
    public final void onConnected(@j.P Bundle bundle) {
        this.f349367b.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e.a
    public final void onConnectionSuspended(int i12) {
        this.f349367b.onConnectionSuspended(i12);
    }
}
