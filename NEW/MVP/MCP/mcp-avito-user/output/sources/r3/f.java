package R3;

import Y61.k;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: NetworkCongestionProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR3/f;", "LR3/e;", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14095a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ConnectivityManager f14096b;

    /* compiled from: NetworkCongestionProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"R3/f$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@k Network network) {
            f fVar = f.this;
            fVar.b(fVar.f14096b.getNetworkCapabilities(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(@k Network network, @k NetworkCapabilities networkCapabilities) {
            f.this.b(networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@k Network network) {
            f fVar = f.this;
            Network activeNetwork = fVar.f14096b.getActiveNetwork();
            if (activeNetwork == null) {
                fVar.f14095a = false;
            } else {
                fVar.b(fVar.f14096b.getNetworkCapabilities(activeNetwork));
            }
        }
    }

    public f(@k Context context) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f14096b = connectivityManager;
        connectivityManager.registerDefaultNetworkCallback(new a());
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return;
        }
        b(networkCapabilities);
    }

    @Override // R3.e
    /* renamed from: a, reason: from getter */
    public final boolean getF14095a() {
        return this.f14095a;
    }

    public final void b(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null) {
            boolean z12 = false;
            if (Build.VERSION.SDK_INT >= 28 && !networkCapabilities.hasCapability(20)) {
                z12 = true;
            }
            this.f14095a = z12;
        }
    }
}
