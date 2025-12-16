package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import j.X;

/* compiled from: RequirementsWatcher.java */
/* loaded from: classes6.dex */
public final class b {

    /* compiled from: RequirementsWatcher.java */
    /* renamed from: com.google.android.exoplayer2.scheduler.b$b, reason: collision with other inner class name */
    public class C10590b extends BroadcastReceiver {
        public C10590b(a aVar) {
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
        public boolean f345899a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f345900b;

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
            boolean z12 = this.f345899a;
            b bVar = b.this;
            if (z12 && this.f345900b == zHasCapability) {
                if (zHasCapability) {
                    bVar.getClass();
                    throw null;
                }
            } else {
                this.f345899a = true;
                this.f345900b = zHasCapability;
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
