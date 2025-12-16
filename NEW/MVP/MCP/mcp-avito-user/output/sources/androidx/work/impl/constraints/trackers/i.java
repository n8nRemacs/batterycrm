package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.work.G;
import j.X;
import java.util.Objects;
import kotlin.Metadata;

/* compiled from: NetworkStateTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/i;", "Landroidx/work/impl/constraints/trackers/g;", "Landroidx/work/impl/constraints/d;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes10.dex */
public final class i extends g<androidx.work.impl.constraints.d> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ConnectivityManager f55722f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a f55723g;

    /* compiled from: NetworkStateTracker.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/work/impl/constraints/trackers/i$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            G gA2 = G.a();
            int i12 = j.f55725a;
            Objects.toString(networkCapabilities);
            gA2.getClass();
            int i13 = Build.VERSION.SDK_INT;
            i iVar = i.this;
            iVar.b(i13 >= 28 ? new androidx.work.impl.constraints.d(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : j.a(iVar.f55722f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            G gA2 = G.a();
            int i12 = j.f55725a;
            gA2.getClass();
            i iVar = i.this;
            iVar.b(j.a(iVar.f55722f));
        }
    }

    public i(@Y61.k Context context, @Y61.k androidx.work.impl.utils.taskexecutor.b bVar) {
        super(context, bVar);
        this.f55722f = (ConnectivityManager) this.f55717b.getSystemService("connectivity");
        this.f55723g = new a();
    }

    @Override // androidx.work.impl.constraints.trackers.g
    public final androidx.work.impl.constraints.d a() {
        return j.a(this.f55722f);
    }

    @Override // androidx.work.impl.constraints.trackers.g
    public final void c() {
        try {
            G gA2 = G.a();
            int i12 = j.f55725a;
            gA2.getClass();
            this.f55722f.registerDefaultNetworkCallback(this.f55723g);
        } catch (IllegalArgumentException unused) {
            G gA3 = G.a();
            int i13 = j.f55725a;
            gA3.getClass();
        } catch (SecurityException unused2) {
            G gA4 = G.a();
            int i14 = j.f55725a;
            gA4.getClass();
        }
    }

    @Override // androidx.work.impl.constraints.trackers.g
    public final void d() {
        try {
            G gA2 = G.a();
            int i12 = j.f55725a;
            gA2.getClass();
            this.f55722f.unregisterNetworkCallback(this.f55723g);
        } catch (IllegalArgumentException unused) {
            G gA3 = G.a();
            int i13 = j.f55725a;
            gA3.getClass();
        } catch (SecurityException unused2) {
            G gA4 = G.a();
            int i14 = j.f55725a;
            gA4.getClass();
        }
    }
}
