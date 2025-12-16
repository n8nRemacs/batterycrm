package androidx.media3.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.media3.common.util.J;
import j.X;

/* compiled from: RequirementsWatcher.java */
@J
/* loaded from: classes.dex */
public final class b {

    /* compiled from: RequirementsWatcher.java */
    /* renamed from: androidx.media3.exoplayer.scheduler.b$b, reason: collision with other inner class name */
    public class C1832b extends BroadcastReceiver {
        public C1832b(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b.this.getClass();
            throw null;
        }
    }

    /* compiled from: RequirementsWatcher.java */
    public interface c {
    }

    /* compiled from: RequirementsWatcher.java */
    @X
    public final class d extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public boolean f49452a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f49453b;

        public d(a aVar) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            b.this.getClass();
            throw null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z12) {
            if (z12) {
                return;
            }
            b.this.getClass();
            throw null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            boolean z12 = this.f49452a;
            b bVar = b.this;
            if (z12 && this.f49453b == zHasCapability) {
                if (zHasCapability) {
                    bVar.getClass();
                    throw null;
                }
            } else {
                this.f49452a = true;
                this.f49453b = zHasCapability;
                bVar.getClass();
                throw null;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            b.this.getClass();
            throw null;
        }
    }
}
