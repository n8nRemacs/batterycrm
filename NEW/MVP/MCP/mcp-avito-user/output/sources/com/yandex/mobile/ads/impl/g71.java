package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.yandex.mobile.ads.impl.pt;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
final class g71 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f385605a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f385606b;

    /* renamed from: c, reason: collision with root package name */
    private final a f385607c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f385608d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private b f385609e;

    /* renamed from: f, reason: collision with root package name */
    private int f385610f;

    /* renamed from: g, reason: collision with root package name */
    private int f385611g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f385612h;

    public interface a {
    }

    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            g71.this.f385606b.post(new J(g71.this, 1));
        }

        public /* synthetic */ b(g71 g71Var, int i12) {
            this();
        }
    }

    public g71(Context context, Handler handler, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f385605a = applicationContext;
        this.f385606b = handler;
        this.f385607c = aVar;
        AudioManager audioManager = (AudioManager) db.b((AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.f385608d = audioManager;
        this.f385610f = 3;
        this.f385611g = b(audioManager, 3);
        this.f385612h = a(audioManager, this.f385610f);
        b bVar = new b(this, 0);
        try {
            applicationContext.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f385609e = bVar;
        } catch (RuntimeException e12) {
            ka0.b("StreamVolumeManager", "Error registering stream volume receiver", e12);
        }
    }

    public final int b() {
        if (pc1.f388768a >= 28) {
            return this.f385608d.getStreamMinVolume(this.f385610f);
        }
        return 0;
    }

    public final void c() {
        b bVar = this.f385609e;
        if (bVar != null) {
            try {
                this.f385605a.unregisterReceiver(bVar);
            } catch (RuntimeException e12) {
                ka0.b("StreamVolumeManager", "Error unregistering stream volume receiver", e12);
            }
            this.f385609e = null;
        }
    }

    public static void b(g71 g71Var) {
        int iB2 = b(g71Var.f385608d, g71Var.f385610f);
        boolean zA2 = a(g71Var.f385608d, g71Var.f385610f);
        if (g71Var.f385611g == iB2 && g71Var.f385612h == zA2) {
            return;
        }
        g71Var.f385611g = iB2;
        g71Var.f385612h = zA2;
        ((pt.b) g71Var.f385607c).a(zA2, iB2);
    }

    public final void a(int i12) {
        if (this.f385610f == i12) {
            return;
        }
        this.f385610f = i12;
        int iB2 = b(this.f385608d, i12);
        boolean zA2 = a(this.f385608d, this.f385610f);
        if (this.f385611g != iB2 || this.f385612h != zA2) {
            this.f385611g = iB2;
            this.f385612h = zA2;
            ((pt.b) this.f385607c).a(zA2, iB2);
        }
        ((pt.b) this.f385607c).c();
    }

    private static int b(AudioManager audioManager, int i12) {
        try {
            return audioManager.getStreamVolume(i12);
        } catch (RuntimeException e12) {
            ka0.b("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i12, e12);
            return audioManager.getStreamMaxVolume(i12);
        }
    }

    public final int a() {
        return this.f385608d.getStreamMaxVolume(this.f385610f);
    }

    private static boolean a(AudioManager audioManager, int i12) {
        if (pc1.f388768a >= 23) {
            return audioManager.isStreamMute(i12);
        }
        return b(audioManager, i12) == 0;
    }
}
