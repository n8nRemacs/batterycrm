package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.yandex.mobile.ads.impl.pt;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
final class nc {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f388207a;

    /* renamed from: b, reason: collision with root package name */
    private final a f388208b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private b f388209c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private jc f388210d;

    /* renamed from: f, reason: collision with root package name */
    private int f388212f;

    /* renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f388214h;

    /* renamed from: g, reason: collision with root package name */
    private float f388213g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f388211e = 0;

    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f388215a;

        public a(Handler handler) {
            this.f388215a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i12) {
            this.f388215a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.A1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f383168b.a(i12);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i12) {
            nc.a(nc.this, i12);
        }
    }

    public interface b {
    }

    public nc(Context context, Handler handler, b bVar) {
        this.f388207a = (AudioManager) db.a((AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.f388209c = bVar;
        this.f388208b = new a(handler);
    }

    public final int a(boolean z12, int i12) {
        int iRequestAudioFocus;
        if (i12 == 1 || this.f388212f != 1) {
            a();
            return z12 ? 1 : -1;
        }
        if (!z12) {
            return -1;
        }
        if (this.f388211e != 1) {
            if (pc1.f388768a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f388214h;
                if (audioFocusRequest == null) {
                    AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f388212f) : new AudioFocusRequest.Builder(this.f388214h);
                    jc jcVar = this.f388210d;
                    boolean z13 = jcVar != null && jcVar.f386812a == 1;
                    jcVar.getClass();
                    this.f388214h = builder.setAudioAttributes(jcVar.a().f386818a).setWillPauseWhenDucked(z13).setOnAudioFocusChangeListener(this.f388208b).build();
                }
                iRequestAudioFocus = this.f388207a.requestAudioFocus(this.f388214h);
            } else {
                AudioManager audioManager = this.f388207a;
                a aVar = this.f388208b;
                jc jcVar2 = this.f388210d;
                jcVar2.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(aVar, pc1.c(jcVar2.f386814c), this.f388212f);
            }
            if (iRequestAudioFocus != 1) {
                a(0);
                return -1;
            }
            a(1);
        }
        return 1;
    }

    public final float b() {
        return this.f388213g;
    }

    public final void c() {
        this.f388209c = null;
        a();
    }

    public final void d() {
        if (pc1.a(this.f388210d, (Object) null)) {
            return;
        }
        this.f388210d = null;
        this.f388212f = 0;
    }

    private void a() {
        if (this.f388211e == 0) {
            return;
        }
        if (pc1.f388768a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f388214h;
            if (audioFocusRequest != null) {
                this.f388207a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f388207a.abandonAudioFocus(this.f388208b);
        }
        a(0);
    }

    private void a(int i12) {
        if (this.f388211e == i12) {
            return;
        }
        this.f388211e = i12;
        float f12 = i12 == 3 ? 0.2f : 1.0f;
        if (this.f388213g == f12) {
            return;
        }
        this.f388213g = f12;
        b bVar = this.f388209c;
        if (bVar != null) {
            pt.e(pt.this);
        }
    }

    public static void a(nc ncVar, int i12) {
        jc jcVar;
        if (i12 == -3 || i12 == -2) {
            if (i12 != -2 && ((jcVar = ncVar.f388210d) == null || jcVar.f386812a != 1)) {
                ncVar.a(3);
                return;
            }
            b bVar = ncVar.f388209c;
            if (bVar != null) {
                pt.b bVar2 = (pt.b) bVar;
                boolean playWhenReady = pt.this.getPlayWhenReady();
                pt.this.a(0, pt.a(playWhenReady, 0), playWhenReady);
            }
            ncVar.a(2);
            return;
        }
        if (i12 == -1) {
            b bVar3 = ncVar.f388209c;
            if (bVar3 != null) {
                pt.b bVar4 = (pt.b) bVar3;
                boolean playWhenReady2 = pt.this.getPlayWhenReady();
                pt.this.a(-1, pt.a(playWhenReady2, -1), playWhenReady2);
            }
            ncVar.a();
            return;
        }
        if (i12 != 1) {
            ncVar.getClass();
            ka0.d("AudioFocusManager", "Unknown focus change type: " + i12);
            return;
        }
        ncVar.a(1);
        b bVar5 = ncVar.f388209c;
        if (bVar5 != null) {
            pt.b bVar6 = (pt.b) bVar5;
            boolean playWhenReady3 = pt.this.getPlayWhenReady();
            pt.this.a(1, pt.a(playWhenReady3, 1), playWhenReady3);
        }
    }
}
