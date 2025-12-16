package com.avito.android.analytics;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;

/* compiled from: NetworkTypeProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/I;", "Landroid/net/ConnectivityManager$NetworkCallback;", "_common_network-type_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class I extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f89655a;

    public I(J j12) {
        this.f89655a = j12;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(@Y61.k Network network, @Y61.k NetworkCapabilities networkCapabilities) {
        J j12 = this.f89655a;
        if (kotlin.jvm.internal.L.f(((ConnectivityManager) j12.f89656a.getSystemService("connectivity")).getActiveNetwork(), network)) {
            j12.f89659d = j12.c(networkCapabilities);
        }
    }
}
