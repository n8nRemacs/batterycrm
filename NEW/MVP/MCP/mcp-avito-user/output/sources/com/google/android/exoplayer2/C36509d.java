package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.C36509d;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.webrtc.MediaStreamTrack;

/* compiled from: AudioFocusManager.java */
/* renamed from: com.google.android.exoplayer2.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36509d {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f344183a;

    /* renamed from: b, reason: collision with root package name */
    public final a f344184b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public c f344185c;

    /* renamed from: d, reason: collision with root package name */
    public int f344186d;

    /* renamed from: e, reason: collision with root package name */
    public int f344187e;

    /* renamed from: f, reason: collision with root package name */
    public float f344188f = 1.0f;

    /* compiled from: AudioFocusManager.java */
    /* renamed from: com.google.android.exoplayer2.d$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f344189b;

        public a(Handler handler) {
            this.f344189b = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i12) {
            this.f344189b.post(new Runnable() { // from class: com.google.android.exoplayer2.c
                @Override // java.lang.Runnable
                public final void run() {
                    C36509d c36509d = C36509d.this;
                    c36509d.getClass();
                    int i13 = i12;
                    if (i13 == -3 || i13 == -2) {
                        if (i13 != -2) {
                            c36509d.b(3);
                            return;
                        }
                        C36509d.c cVar = c36509d.f344185c;
                        if (cVar != null) {
                            cVar.h(0);
                        }
                        c36509d.b(2);
                        return;
                    }
                    if (i13 == -1) {
                        C36509d.c cVar2 = c36509d.f344185c;
                        if (cVar2 != null) {
                            cVar2.h(-1);
                        }
                        c36509d.a();
                        return;
                    }
                    if (i13 != 1) {
                        return;
                    }
                    c36509d.b(1);
                    C36509d.c cVar3 = c36509d.f344185c;
                    if (cVar3 != null) {
                        cVar3.h(1);
                    }
                }
            });
        }
    }

    /* compiled from: AudioFocusManager.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.d$b */
    public @interface b {
    }

    /* compiled from: AudioFocusManager.java */
    /* renamed from: com.google.android.exoplayer2.d$c */
    public interface c {
        void d();

        void h(int i12);
    }

    public C36509d(Context context, Handler handler, c cVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.f344183a = audioManager;
        this.f344185c = cVar;
        this.f344184b = new a(handler);
        this.f344186d = 0;
    }

    public final void a() {
        if (this.f344186d == 0) {
            return;
        }
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        AudioManager audioManager = this.f344183a;
        if (i12 < 26) {
            audioManager.abandonAudioFocus(this.f344184b);
        }
        b(0);
    }

    public final void b(int i12) {
        if (this.f344186d == i12) {
            return;
        }
        this.f344186d = i12;
        float f12 = i12 == 3 ? 0.2f : 1.0f;
        if (this.f344188f == f12) {
            return;
        }
        this.f344188f = f12;
        c cVar = this.f344185c;
        if (cVar != null) {
            cVar.d();
        }
    }

    public final int c(int i12, boolean z12) {
        if (i12 == 1 || this.f344187e != 1) {
            a();
            return z12 ? 1 : -1;
        }
        if (!z12) {
            return -1;
        }
        if (this.f344186d == 1) {
            return 1;
        }
        if (com.google.android.exoplayer2.util.U.f348106a < 26) {
            throw null;
        }
        new AudioFocusRequest.Builder(this.f344187e);
        throw null;
    }
}
