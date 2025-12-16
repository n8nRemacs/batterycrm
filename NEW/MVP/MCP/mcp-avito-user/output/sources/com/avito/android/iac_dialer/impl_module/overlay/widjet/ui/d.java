package com.avito.android.iac_dialer.impl_module.overlay.widjet.ui;

import androidx.camera.camera2.internal.G;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: IacDialerOverlayViewDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class d extends H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        a aVar = (a) this.receiver;
        int i12 = a.f166164j;
        aVar.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        StringBuilder sb2 = new StringBuilder();
        String str = aVar.f166167c;
        bVar.a("IacDialerOverlayViewDelegate", AK.c.s(sb2, str, ": click on openCallScreenButton"), null);
        aVar.f166166b.startActivity(aVar.f166170f.a(new IacCallScreenArgument.WithoutAction(new IacCallScreenArgument.WithoutAction.From.Other(G.f("overlay_", str)))));
        return G0.f406611a;
    }
}
