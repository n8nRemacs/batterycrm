package coil.network;

import Y61.k;
import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.Metadata;

/* compiled from: NetworkObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/network/h;", "Landroid/net/ConnectivityManager$NetworkCallback;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f58577a;

    public h(i iVar) {
        this.f58577a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(@k Network network) {
        i.b(this.f58577a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(@k Network network) {
        i.b(this.f58577a, network, false);
    }
}
