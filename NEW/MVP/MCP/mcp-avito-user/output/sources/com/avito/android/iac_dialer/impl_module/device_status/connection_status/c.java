package com.avito.android.iac_dialer.impl_module.device_status.connection_status;

import Y61.k;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;

/* compiled from: IacConnectionStatusProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/c;", "Landroid/net/ConnectivityManager$NetworkCallback;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f165951a;

    public c(b bVar) {
        this.f165951a = bVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(@k Network network, @k NetworkCapabilities networkCapabilities) {
        int i12 = b.f165939j;
        b bVar = this.f165951a;
        bVar.getClass();
        b.b(bVar, b.c(network, networkCapabilities));
    }
}
