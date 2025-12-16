package com.avito.android.iac_dialer.impl_module.overlay.widjet.ui;

import android.content.Intent;
import kK.C42589a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: IacDialerOverlayViewDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class c extends H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        a aVar = (a) this.receiver;
        int i12 = a.f166164j;
        aVar.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacDialerOverlayViewDelegate", AK.c.s(new StringBuilder(), aVar.f166167c, ": click on speakerButton"), null);
        C42589a.f406229b.getClass();
        aVar.f166166b.sendBroadcast(new Intent("IacBroadcastReceiver.ACTION_IAC_BROADCAST_ACTION").putExtra("IacBroadcastReceiver.EXTRA_TYPE", "IacBroadcastReceiver.TYPE_CHANGE_AUDIO_DEVICE_FROM_OVERLAY"));
        return G0.f406611a;
    }
}
