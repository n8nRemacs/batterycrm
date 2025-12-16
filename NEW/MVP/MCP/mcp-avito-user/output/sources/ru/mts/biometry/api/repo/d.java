package ru.mts.biometry.api.repo;

import Y61.k;
import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.Metadata;

/* compiled from: VpnConnectionRepo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/mts/biometry/api/repo/d;", "Landroid/net/ConnectivityManager$NetworkCallback;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f436359a;

    public d(e eVar) {
        this.f436359a = eVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(@k Network network) {
        super.onAvailable(network);
        this.f436359a.f436361b = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(@k Network network) {
        super.onLost(network);
        this.f436359a.f436361b = false;
    }
}
