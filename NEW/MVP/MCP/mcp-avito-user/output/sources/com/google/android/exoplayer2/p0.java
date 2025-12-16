package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import org.webrtc.MediaStreamTrack;

/* compiled from: StreamVolumeManager.java */
/* loaded from: classes6.dex */
final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f345852a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f345853b;

    /* renamed from: c, reason: collision with root package name */
    public final b f345854c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f345855d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public c f345856e;

    /* renamed from: f, reason: collision with root package name */
    public int f345857f;

    /* renamed from: g, reason: collision with root package name */
    public int f345858g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f345859h;

    /* compiled from: StreamVolumeManager.java */
    public interface b {
        void a(int i12, boolean z12);

        void b();
    }

    /* compiled from: StreamVolumeManager.java */
    public final class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f345860b = 0;

        public c(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            final p0 p0Var = p0.this;
            p0Var.f345853b.post(new Runnable() { // from class: com.google.android.exoplayer2.q0
                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = p0.c.f345860b;
                    p0Var.b();
                }
            });
        }
    }

    public p0(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f345852a = applicationContext;
        this.f345853b = handler;
        this.f345854c = bVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C36585a.e(audioManager);
        this.f345855d = audioManager;
        this.f345857f = 3;
        this.f345858g = a(audioManager, 3);
        int i12 = this.f345857f;
        this.f345859h = com.google.android.exoplayer2.util.U.f348106a >= 23 ? audioManager.isStreamMute(i12) : a(audioManager, i12) == 0;
        c cVar = new c(null);
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f345856e = cVar;
        } catch (RuntimeException e12) {
            C36605v.a("Error registering stream volume receiver", e12);
        }
    }

    public static int a(AudioManager audioManager, int i12) {
        try {
            return audioManager.getStreamVolume(i12);
        } catch (RuntimeException e12) {
            C36605v.a("Could not retrieve stream volume for stream type " + i12, e12);
            return audioManager.getStreamMaxVolume(i12);
        }
    }

    public final void b() {
        int i12 = this.f345857f;
        AudioManager audioManager = this.f345855d;
        int iA2 = a(audioManager, i12);
        int i13 = this.f345857f;
        boolean zIsStreamMute = com.google.android.exoplayer2.util.U.f348106a >= 23 ? audioManager.isStreamMute(i13) : a(audioManager, i13) == 0;
        if (this.f345858g == iA2 && this.f345859h == zIsStreamMute) {
            return;
        }
        this.f345858g = iA2;
        this.f345859h = zIsStreamMute;
        this.f345854c.a(iA2, zIsStreamMute);
    }
}
