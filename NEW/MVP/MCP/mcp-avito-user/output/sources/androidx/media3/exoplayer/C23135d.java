package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media3.common.C23091e;
import androidx.media3.exoplayer.C23135d;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.webrtc.MediaStreamTrack;

/* compiled from: AudioFocusManager.java */
/* renamed from: androidx.media3.exoplayer.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23135d {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f49016a;

    /* renamed from: b, reason: collision with root package name */
    public final a f49017b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public c f49018c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public C23091e f49019d;

    /* renamed from: e, reason: collision with root package name */
    public int f49020e;

    /* renamed from: f, reason: collision with root package name */
    public int f49021f;

    /* renamed from: g, reason: collision with root package name */
    public float f49022g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f49023h;

    /* compiled from: AudioFocusManager.java */
    /* renamed from: androidx.media3.exoplayer.d$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f49024b;

        public a(Handler handler) {
            this.f49024b = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i12) {
            this.f49024b.post(new Runnable() { // from class: androidx.media3.exoplayer.c
                @Override // java.lang.Runnable
                public final void run() {
                    C23135d c23135d = C23135d.this;
                    c23135d.getClass();
                    int i13 = i12;
                    if (i13 == -3 || i13 == -2) {
                        if (i13 != -2) {
                            C23091e c23091e = c23135d.f49019d;
                            if (!(c23091e != null && c23091e.f47651b == 1)) {
                                c23135d.c(3);
                                return;
                            }
                        }
                        C23135d.c cVar = c23135d.f49018c;
                        if (cVar != null) {
                            A a12 = A.this;
                            boolean playWhenReady = a12.getPlayWhenReady();
                            a12.v0(0, playWhenReady ? 2 : 1, playWhenReady);
                        }
                        c23135d.c(2);
                        return;
                    }
                    if (i13 == -1) {
                        C23135d.c cVar2 = c23135d.f49018c;
                        if (cVar2 != null) {
                            A a13 = A.this;
                            boolean playWhenReady2 = a13.getPlayWhenReady();
                            a13.v0(-1, playWhenReady2 ? 2 : 1, playWhenReady2);
                        }
                        c23135d.a();
                        return;
                    }
                    if (i13 != 1) {
                        androidx.media3.common.util.s.g();
                        return;
                    }
                    c23135d.c(1);
                    C23135d.c cVar3 = c23135d.f49018c;
                    if (cVar3 != null) {
                        A a14 = A.this;
                        a14.v0(1, 1, a14.getPlayWhenReady());
                    }
                }
            });
        }
    }

    /* compiled from: AudioFocusManager.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.exoplayer.d$b */
    public @interface b {
    }

    /* compiled from: AudioFocusManager.java */
    /* renamed from: androidx.media3.exoplayer.d$c */
    public interface c {
    }

    public C23135d(Context context, Handler handler, c cVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.f49016a = audioManager;
        this.f49018c = cVar;
        this.f49017b = new a(handler);
        this.f49020e = 0;
    }

    public final void a() {
        if (this.f49020e == 0) {
            return;
        }
        int i12 = androidx.media3.common.util.M.f47887a;
        AudioManager audioManager = this.f49016a;
        if (i12 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f49023h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f49017b);
        }
        c(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@j.P androidx.media3.common.C23091e r6) {
        /*
            r5 = this;
            androidx.media3.common.e r0 = r5.f49019d
            boolean r0 = androidx.media3.common.util.M.a(r0, r6)
            if (r0 != 0) goto L3c
            r5.f49019d = r6
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L10
        Le:
            r3 = r0
            goto L30
        L10:
            int r2 = r6.f47653d
            r3 = 3
            r4 = 2
            switch(r2) {
                case 0: goto L2c;
                case 1: goto L2a;
                case 2: goto L23;
                case 3: goto Le;
                case 4: goto L23;
                case 5: goto L30;
                case 6: goto L30;
                case 7: goto L30;
                case 8: goto L30;
                case 9: goto L30;
                case 10: goto L30;
                case 11: goto L25;
                case 12: goto L30;
                case 13: goto L30;
                case 14: goto L2a;
                case 15: goto L17;
                case 16: goto L1b;
                default: goto L17;
            }
        L17:
            androidx.media3.common.util.s.g()
            goto Le
        L1b:
            int r6 = androidx.media3.common.util.M.f47887a
            r2 = 19
            if (r6 < r2) goto L23
            r3 = 4
            goto L30
        L23:
            r3 = r4
            goto L30
        L25:
            int r6 = r6.f47651b
            if (r6 != r1) goto L30
            goto L23
        L2a:
            r3 = r1
            goto L30
        L2c:
            androidx.media3.common.util.s.g()
            goto L2a
        L30:
            r5.f49021f = r3
            if (r3 == r1) goto L36
            if (r3 != 0) goto L37
        L36:
            r0 = r1
        L37:
            java.lang.String r6 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            androidx.media3.common.util.C23110a.a(r6, r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C23135d.b(androidx.media3.common.e):void");
    }

    public final void c(int i12) {
        if (this.f49020e == i12) {
            return;
        }
        this.f49020e = i12;
        float f12 = i12 == 3 ? 0.2f : 1.0f;
        if (this.f49022g == f12) {
            return;
        }
        this.f49022g = f12;
        c cVar = this.f49018c;
        if (cVar != null) {
            int i13 = A.f48357h0;
            A a12 = A.this;
            a12.q0(1, 2, Float.valueOf(a12.f48379V * a12.f48415z.f49022g));
        }
    }

    public final int d(int i12, boolean z12) {
        int i13;
        int iRequestAudioFocus;
        int i14 = 1;
        if (i12 == 1 || this.f49021f != 1) {
            a();
            return z12 ? 1 : -1;
        }
        if (!z12) {
            return -1;
        }
        if (this.f49020e != 1) {
            int i15 = androidx.media3.common.util.M.f47887a;
            AudioManager audioManager = this.f49016a;
            a aVar = this.f49017b;
            if (i15 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f49023h;
                if (audioFocusRequest == null) {
                    AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f49021f) : new AudioFocusRequest.Builder(this.f49023h);
                    C23091e c23091e = this.f49019d;
                    boolean z13 = c23091e != null && c23091e.f47651b == 1;
                    c23091e.getClass();
                    this.f49023h = builder.setAudioAttributes(c23091e.a().f47657a).setWillPauseWhenDucked(z13).setOnAudioFocusChangeListener(aVar).build();
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(this.f49023h);
            } else {
                C23091e c23091e2 = this.f49019d;
                c23091e2.getClass();
                int i16 = c23091e2.f47653d;
                if (i16 != 13) {
                    switch (i16) {
                        case 2:
                            i13 = 0;
                            break;
                        case 3:
                            i13 = 8;
                            break;
                        case 4:
                            i13 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i13 = 5;
                            break;
                        case 6:
                            i13 = 2;
                            break;
                        default:
                            i13 = 3;
                            break;
                    }
                } else {
                    i13 = 1;
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(aVar, i13, this.f49021f);
            }
            if (iRequestAudioFocus == 1) {
                c(1);
            } else {
                c(0);
                i14 = -1;
            }
        }
        return i14;
    }
}
