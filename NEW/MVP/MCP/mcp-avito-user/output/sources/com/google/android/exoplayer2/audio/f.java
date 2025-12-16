package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;

/* compiled from: AudioCapabilitiesReceiver.java */
/* loaded from: classes6.dex */
public final class f {

    /* compiled from: AudioCapabilitiesReceiver.java */
    public final class b extends ContentObserver {
        @Override // android.database.ContentObserver
        public final void onChange(boolean z12) {
            throw null;
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    public final class c extends BroadcastReceiver {
        public c(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            e.a(context, intent);
            f.this.getClass();
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    public interface d {
    }
}
