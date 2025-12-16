package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.my.target.P0;
import com.my.target.S;
import com.my.target.S0;
import com.my.target.U0;
import com.my.target.V;
import com.my.target.nativeads.d;
import com.my.target.nativeads.views.MediaAdView;
import e11.C39855b1;
import e11.C39907t0;
import e11.C39913v0;
import e11.C39924z;
import e11.C39925z0;
import i11.C41211a;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.webrtc.MediaStreamTrack;

/* renamed from: com.my.target.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37796l implements P0.a, V.a, S.e, U0.a {

    /* renamed from: b, reason: collision with root package name */
    public final e11.Z0 f364893b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39913v0<com.my.target.common.models.e> f364894c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final com.my.target.common.models.e f364895d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final a f364896e = new a();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final e11.Q0 f364897f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final C39855b1 f364898g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final r1 f364899h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public WeakReference<MediaAdView> f364900i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public WeakReference<V> f364901j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public WeakReference<S> f364902k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public P0 f364903l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f364904m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f364905n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f364906o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f364907p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f364908q;

    /* renamed from: r, reason: collision with root package name */
    public int f364909r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    public Uri f364910s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    public S0.a f364911t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    public WeakReference<Context> f364912u;

    /* renamed from: v, reason: collision with root package name */
    @j.P
    public S0.a f364913v;

    /* renamed from: w, reason: collision with root package name */
    public long f364914w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f364915x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f364916y;

    /* renamed from: com.my.target.l$a */
    public final class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i12) {
            C37796l c37796l = C37796l.this;
            if (i12 == -3) {
                P0 p02 = c37796l.f364903l;
                if (p02 == null || c37796l.f364908q) {
                    return;
                }
                p02.o();
                return;
            }
            if (i12 == -2 || i12 == -1) {
                c37796l.u();
            } else if ((i12 == 1 || i12 == 2 || i12 == 4) && c37796l.f364906o) {
                c37796l.e(false);
            }
        }
    }

    /* renamed from: com.my.target.l$b */
    public interface b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37796l(@j.N e11.Q0 q02, @j.N C39913v0<com.my.target.common.models.e> c39913v0, @j.N com.my.target.common.models.e eVar, @j.N e11.Z0 z02) {
        this.f364894c = c39913v0;
        this.f364897f = q02;
        this.f364893b = z02;
        this.f364895d = eVar;
        this.f364905n = c39913v0.f394863Q;
        this.f364908q = c39913v0.f394862P;
        this.f364898g = C39855b1.a(c39913v0.f394702a);
        this.f364899h = new r1(c39913v0, z02.f394520a, z02.f394521b);
        String str = (String) eVar.f394307d;
        this.f364910s = Uri.parse(str == null ? eVar.f394304a : str);
    }

    @Override // com.my.target.S.e
    public final void a() {
        WeakReference<V> weakReference = this.f364901j;
        V v12 = weakReference == null ? null : weakReference.get();
        if (v12 == null || !v12.isShowing()) {
            return;
        }
        v12.dismiss();
    }

    public final void b(@j.N MediaAdView mediaAdView, @j.P Context context) {
        U0 u02;
        WeakReference<Context> weakReference;
        Objects.toString(mediaAdView);
        if (this.f364906o) {
            return;
        }
        WeakReference<MediaAdView> weakReference2 = this.f364900i;
        if (weakReference2 != null && weakReference2.get() == mediaAdView && (weakReference = this.f364912u) != null && weakReference.get() == context && (mediaAdView.getChildAt(1) instanceof U0)) {
            u02 = (U0) mediaAdView.getChildAt(1);
        } else {
            w();
            this.f364899h.f365126e = context;
            this.f364900i = new WeakReference<>(mediaAdView);
            this.f364912u = new WeakReference<>(context);
            U0 u03 = new U0(mediaAdView.getContext().getApplicationContext());
            mediaAdView.addView(u03, 1);
            u02 = u03;
        }
        u02.setAdVideoViewListener(this);
        this.f364898g.c(u02);
        if (this.f364905n) {
            g();
        } else {
            j();
        }
    }

    public final void c(@j.N U0 u02, boolean z12) {
        if (this.f364903l == null) {
            e11.Z0 z02 = this.f364893b;
            P0 p0A = e11.P0.a(z02.f394521b, z02.f394522c);
            this.f364903l = p0A;
            p0A.a(this);
        }
        e(z12);
        this.f364903l.b(u02);
        com.my.target.common.models.e eVar = this.f364895d;
        u02.b(eVar.f394305b, eVar.f394306c);
        if (this.f364903l.f()) {
            o();
            return;
        }
        this.f364903l.c(u02.getContext(), this.f364910s);
        long j12 = this.f364914w;
        if (j12 > 0) {
            this.f364903l.a(j12);
        }
    }

    @Override // com.my.target.V.a
    public final void d(@j.N V v12, @j.N FrameLayout frameLayout) {
        String str;
        S s5 = new S(frameLayout.getContext());
        this.f364909r = 4;
        this.f364901j = new WeakReference<>(v12);
        s5.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.addView(s5);
        this.f364902k = new WeakReference<>(s5);
        e11.Q0 q02 = this.f364897f;
        C39913v0<com.my.target.common.models.e> c39913v0 = q02.f394464I;
        if (c39913v0 != null) {
            s5.f364568l.setMax(q02.f394724w);
            s5.f364557A = c39913v0.f394865S;
            s5.f364560d.setText(q02.a());
            s5.f364558b.setText(q02.f394706e);
            boolean zEquals = "store".equals(q02.f394714m);
            TextView textView = s5.f364567k;
            C41211a c41211a = s5.f364559c;
            if (zEquals) {
                textView.setVisibility(8);
                if (q02.f394710i == 0 || q02.f394709h <= 0.0f) {
                    c41211a.setVisibility(8);
                } else {
                    c41211a.setVisibility(0);
                    c41211a.setRating(q02.f394709h);
                }
            } else {
                c41211a.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(q02.f394713l);
            }
            s5.f364561e.setText(c39913v0.f394859M);
            s5.f364564h.setText(c39913v0.f394860N);
            byte[] bArrDecode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjM59gfMOgAAA59JREFUeNrtmkloFEEUhl/N6KgxriiJOHEXF4gENYlgRFA8uyAoCNGggl68CCJ6EQx6cCFqUFzABQQRMYh4EfSi4IJbiFERQVxRgxuRMWri5yE1UBY9yWh6Znq6+z+96a6ZV/8/tbz3qkRChAgRwiMAFgJngWgQyVcDHXTiFKCCRH4Df6MFKAkK+W0W+VfAxCAQV8A+i/wTIB4E8lHgpEX+LjA8COQHAM8t8o3ATKC338kXA59IjXbgEVAPLAb6+k2AHRbhVrrGV+AwMNVPIpx3INncjRi/gTPAWL+IcMIieBGIAXFgGXAU+OggRALY7ItIEdhvkTsNRIz3MWCp3h1sXAGK/RAHnLKIHUzRdgnwwmr7Epjsh3jggkWsNkXbQuC4Q8g8Ld9F6ANctYht7KL9GiNpAnib94ujDo5uaUIdwMo00uafhghNQL98F2EYcA9YlGb75daoOeqHnSHyj+23WyLMC1oRJQpct7LJXkETYSrwyxBhlQQNwAFrFKigCTDK2hXmBnEUnDMEOBZEARYaArwLogAF1jRIq4YQ8YsASqmEiNw2HpUHSgCNB4Y9KYgCPDXs8UEU4LNhF6bzhW7DRmCEiFTqjx+VUtc8LECrYfd3RQA9lxq03SgiZR4WIGbYv9yaAt8Me5DHp8DAFP3ukQDvDTvu8WxrnGG/dUUApdQrEUkYU2a8hwWYnGJH6PEu0GzYczwaCSoRqTIeNbkpwFXDnu/Rf79URJKnyz9E5Kab6i4wYuxvQKEHR8BO8+DE7R+PAu8MB6s9Rj4GvDH6tzYTTvZaVZeIhwSoMfr2HRiUCSd21aXGI+T7WRcu6jLp7Ijh6AMw1AMCmKXxtozeLgOKgC+Gw4ZcFiCB2fpWSRLbsuF0nXUYsSlH5EfqE+IknmblSo0+1m6wRKjOMvnB+jzQHPpl2ezAEOCx0YEOYH2WfMct8rlZkIES4LXVkXqgTwZ9Vjn43JrLFXgC8Mzq0H2g0mU/BTrSa7d8bfHCPlwE3HC41XWyp9fbdIS3Tt8fxprzq7wUivYGdmnithCXgRXpxgw67K4A9ljhdxKPgVK3+q5cFqJcRA6JyAyn1zpFfaBz9RZdtYnpStNonc/PEpEhDt9vE5FaEdmtlPrh2YoEEAEWpbje9j9o1aNrhOQbgOlAncNC2R0SwCVgZaZTb5VFMUpEpEJEpojIGBEZLJ21+zbpLGe3iMgTEXkoIneUUj8lRIgQIUKECJFJ/AEepzU1TSID5QAAAABJRU5ErkJggg==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 420;
            int i12 = C39924z.f394913b;
            options.inTargetDensity = C39924z.a.f394916b;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
            if (bitmapDecodeByteArray != null) {
                s5.f364573q.setImageBitmap(bitmapDecodeByteArray);
            }
            com.my.target.common.models.e eVar = this.f364895d;
            int i13 = eVar.f394305b;
            int i14 = eVar.f394306c;
            MediaAdView mediaAdView = s5.f364566j;
            mediaAdView.b(i13, i14);
            com.my.target.common.models.b bVar = q02.f394716o;
            if (bVar != null) {
                mediaAdView.getImageView().setImageBitmap(bVar.a());
            }
        }
        s5.setVideoDialogViewListener(this);
        boolean z12 = this.f364908q;
        e11.r rVar = s5.f364569m;
        if (z12) {
            rVar.a(s5.f364578v, false);
            str = "sound off";
        } else {
            rVar.a(s5.f364577u, false);
            str = "sound on";
        }
        rVar.setContentDescription(str);
        this.f364899h.b(true);
        c(s5.getAdVideoView(), this.f364908q);
    }

    public final void e(boolean z12) {
        P0 p02 = this.f364903l;
        if (p02 == null) {
            return;
        }
        if (z12) {
            p02.r();
        } else {
            p02.m();
        }
    }

    @Override // com.my.target.P0.a
    public final void f() {
        Context context;
        d.c cVar;
        AudioManager audioManager;
        MediaAdView mediaAdViewS = s();
        if (mediaAdViewS != null) {
            context = mediaAdViewS.getContext();
            if (!this.f364915x) {
                mediaAdViewS.getPlayButtonView().setVisibility(0);
            }
            mediaAdViewS.getProgressBarView().setVisibility(8);
        } else {
            context = null;
        }
        u();
        if (mediaAdViewS != null && (audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) != null) {
            audioManager.abandonAudioFocus(this.f364896e);
        }
        S0.a aVar = this.f364913v;
        if (aVar == null || (cVar = aVar.f364596b.f364586a.f365003g) == null) {
            return;
        }
        cVar.e();
    }

    @Override // com.my.target.P0.a
    public final void g() {
        WeakReference<S> weakReference;
        S s5;
        this.f364909r = 4;
        MediaAdView mediaAdViewS = s();
        if (mediaAdViewS != null) {
            if (!this.f364915x) {
                mediaAdViewS.getProgressBarView().setVisibility(0);
            }
            mediaAdViewS.getPlayButtonView().setVisibility(8);
        }
        if (!this.f364906o || (weakReference = this.f364902k) == null || (s5 = weakReference.get()) == null || s5.f364582z == 3) {
            return;
        }
        s5.f364582z = 3;
        s5.f364566j.getProgressBarView().setVisibility(0);
        s5.f364563g.setVisibility(8);
        s5.f364572p.setVisibility(8);
        s5.f364571o.setVisibility(8);
        s5.f364565i.setVisibility(8);
    }

    @Override // com.my.target.S.e
    public final void h() {
        if (this.f364909r != 1) {
            return;
        }
        u();
        this.f364909r = 2;
        WeakReference<V> weakReference = this.f364901j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f364899h.f();
    }

    @Override // com.my.target.P0.a
    public final void j() {
        Context context;
        AudioManager audioManager;
        WeakReference<S> weakReference;
        S s5;
        this.f364907p = false;
        this.f364914w = 0L;
        MediaAdView mediaAdViewS = s();
        if (mediaAdViewS != null) {
            ImageView imageView = mediaAdViewS.getImageView();
            com.my.target.common.models.b bVar = this.f364894c.f394716o;
            if (bVar != null) {
                imageView.setImageBitmap(bVar.a());
            }
            imageView.setVisibility(0);
            if (!this.f364915x) {
                mediaAdViewS.getPlayButtonView().setVisibility(0);
            }
            mediaAdViewS.getProgressBarView().setVisibility(8);
            context = mediaAdViewS.getContext();
        } else {
            context = null;
        }
        if (this.f364906o && (weakReference = this.f364902k) != null && (s5 = weakReference.get()) != null) {
            if (s5.f364582z != 4) {
                s5.f364582z = 4;
                MediaAdView mediaAdView = s5.f364566j;
                mediaAdView.getImageView().setVisibility(0);
                mediaAdView.getProgressBarView().setVisibility(8);
                if (s5.f364557A) {
                    s5.f364563g.setVisibility(0);
                    s5.f364565i.setVisibility(0);
                }
                s5.f364572p.setVisibility(8);
                s5.f364571o.setVisibility(8);
                s5.f364568l.setVisibility(8);
            }
            context = s5.getContext();
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) == null) {
            return;
        }
        audioManager.abandonAudioFocus(this.f364896e);
    }

    @Override // com.my.target.P0.a
    public final void k() {
        this.f364899h.h();
        S0.a aVar = this.f364913v;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.my.target.S.e
    public final void m() {
        WeakReference<V> weakReference = this.f364901j;
        if (weakReference != null && weakReference.get() != null) {
            v();
            this.f364899h.i();
        }
        S0.a aVar = this.f364913v;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.my.target.P0.a
    public final void o() {
        WeakReference<S> weakReference;
        S s5;
        if (this.f364909r == 1) {
            return;
        }
        this.f364909r = 1;
        MediaAdView mediaAdViewS = s();
        if (mediaAdViewS != null) {
            mediaAdViewS.getProgressBarView().setVisibility(8);
            mediaAdViewS.getPlayButtonView().setVisibility(8);
        }
        if (!this.f364906o || (weakReference = this.f364902k) == null || (s5 = weakReference.get()) == null) {
            return;
        }
        if (this.f364903l != null) {
            U0 adVideoView = s5.getAdVideoView();
            com.my.target.common.models.e eVar = this.f364895d;
            adVideoView.b(eVar.f394305b, eVar.f394306c);
            this.f364903l.b(adVideoView);
        }
        int i12 = s5.f364582z;
        if (i12 == 0 || i12 == 2) {
            return;
        }
        s5.f364582z = 0;
        MediaAdView mediaAdView = s5.f364566j;
        mediaAdView.getImageView().setVisibility(8);
        mediaAdView.getProgressBarView().setVisibility(8);
        s5.f364563g.setVisibility(8);
        s5.f364572p.setVisibility(8);
        if (s5.f364582z != 2) {
            s5.f364571o.setVisibility(8);
        }
    }

    @Override // com.my.target.P0.a
    public final void onVideoCompleted() {
        MediaAdView mediaAdViewS = s();
        if (mediaAdViewS != null) {
            mediaAdViewS.getProgressBarView().setVisibility(8);
            if (!this.f364915x) {
                mediaAdViewS.getPlayButtonView().setVisibility(0);
            }
        }
        this.f364914w = 0L;
    }

    @Override // com.my.target.U0.a
    public final void p() {
        S0.a aVar = this.f364913v;
        if (aVar != null) {
            aVar.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[PHI: r3
  0x005d: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v4 android.view.View) binds: [B:24:0x005b, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.my.target.V.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r7 = this;
            r0 = 0
            r7.f364901j = r0
            r1 = 0
            r7.f364906o = r1
            r2 = 1
            r7.e(r2)
            com.my.target.nativeads.views.MediaAdView r3 = r7.s()
            if (r3 != 0) goto L11
            return
        L11:
            android.content.Context r4 = r3.getContext()
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L24
            com.my.target.l$a r5 = r7.f364896e
            r4.abandonAudioFocus(r5)
        L24:
            int r4 = r7.f364909r
            r5 = 4
            if (r4 == r2) goto L48
            r6 = 2
            if (r4 == r6) goto L42
            r6 = 3
            if (r4 == r6) goto L42
            if (r4 == r5) goto L34
            r7.f364905n = r1
            goto L62
        L34:
            r7.f364905n = r2
            r7.g()
            android.view.View r3 = r3.getChildAt(r2)
            boolean r4 = r3 instanceof com.my.target.U0
            if (r4 == 0) goto L62
            goto L5d
        L42:
            r7.f364905n = r1
            r7.j()
            goto L62
        L48:
            r7.f364909r = r5
            r7.o()
            e11.v0<com.my.target.common.models.e> r4 = r7.f364894c
            boolean r4 = r4.f394863Q
            if (r4 == 0) goto L55
            r7.f364905n = r2
        L55:
            android.view.View r3 = r3.getChildAt(r2)
            boolean r4 = r3 instanceof com.my.target.U0
            if (r4 == 0) goto L62
        L5d:
            com.my.target.U0 r3 = (com.my.target.U0) r3
            r7.c(r3, r2)
        L62:
            com.my.target.r1 r2 = r7.f364899h
            r2.b(r1)
            r7.f364902k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.C37796l.q():void");
    }

    public final void r() {
        P0 p02 = this.f364903l;
        if (p02 == null) {
            return;
        }
        p02.a((P0.a) null);
        this.f364903l.destroy();
        this.f364903l = null;
    }

    @j.P
    public final MediaAdView s() {
        WeakReference<MediaAdView> weakReference = this.f364900i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void t() {
        P0 p02;
        if (!this.f364904m || this.f364906o) {
            return;
        }
        this.f364904m = false;
        if (this.f364909r == 1 && (p02 = this.f364903l) != null) {
            p02.b();
            this.f364909r = 2;
        }
        P0 p03 = this.f364903l;
        if (p03 != null) {
            p03.a((P0.a) null);
            this.f364903l.b(null);
        }
    }

    public final void u() {
        WeakReference<S> weakReference;
        if (!this.f364906o || (weakReference = this.f364902k) == null) {
            return;
        }
        this.f364909r = 2;
        S s5 = weakReference.get();
        if (s5 == null) {
            return;
        }
        P0 p02 = this.f364903l;
        if (p02 != null) {
            p02.b();
        }
        if (s5.f364582z != 1) {
            s5.f364582z = 1;
            MediaAdView mediaAdView = s5.f364566j;
            mediaAdView.getImageView().setVisibility(0);
            mediaAdView.getProgressBarView().setVisibility(8);
            s5.f364563g.setVisibility(8);
            s5.f364572p.setVisibility(0);
            s5.f364571o.setVisibility(8);
            s5.f364565i.setVisibility(0);
        }
    }

    public final void v() {
        WeakReference<S> weakReference;
        WeakReference<S> weakReference2;
        P0 p02 = this.f364903l;
        if (p02 != null && p02.i()) {
            MediaAdView mediaAdViewS = s();
            if (mediaAdViewS == null) {
                r();
                return;
            }
            U0 adVideoView = (!this.f364906o || (weakReference2 = this.f364902k) == null) ? mediaAdViewS.getChildAt(1) instanceof U0 ? (U0) mediaAdViewS.getChildAt(1) : null : weakReference2.get().getAdVideoView();
            if (adVideoView == null) {
                r();
                return;
            }
            com.my.target.common.models.e eVar = this.f364895d;
            adVideoView.b(eVar.f394305b, eVar.f394306c);
            this.f364903l.b(adVideoView);
            this.f364903l.a();
        } else if (this.f364906o && (weakReference = this.f364902k) != null) {
            c(weakReference.get().getAdVideoView(), this.f364908q);
        }
        g();
    }

    public final void w() {
        MediaAdView mediaAdView;
        t();
        this.f364898g.c(null);
        this.f364899h.f365126e = null;
        r();
        WeakReference<MediaAdView> weakReference = this.f364900i;
        if (weakReference == null || (mediaAdView = weakReference.get()) == null || !(mediaAdView.getChildAt(1) instanceof U0)) {
            return;
        }
        mediaAdView.removeViewAt(1);
    }

    @Override // com.my.target.P0.a
    public final void a(float f12) {
        S s5;
        String str;
        WeakReference<S> weakReference = this.f364902k;
        if (weakReference == null || (s5 = weakReference.get()) == null) {
            return;
        }
        boolean z12 = f12 <= 0.0f;
        e11.r rVar = s5.f364569m;
        if (z12) {
            rVar.a(s5.f364578v, false);
            str = "sound off";
        } else {
            rVar.a(s5.f364577u, false);
            str = "sound on";
        }
        rVar.setContentDescription(str);
    }

    @Override // com.my.target.S.e
    public final void e() {
        S s5;
        v();
        WeakReference<S> weakReference = this.f364902k;
        if (weakReference != null && (s5 = weakReference.get()) != null) {
            s5.f364566j.getImageView().setVisibility(0);
        }
        S0.a aVar = this.f364913v;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.my.target.P0.a
    public final void a(float f12, float f13) {
        d.c cVar;
        S s5;
        o();
        this.f364898g.b(f12, f13);
        r1 r1Var = this.f364899h;
        r1Var.a(f12, f13);
        if (!this.f364907p) {
            S0.a aVar = this.f364913v;
            if (aVar != null) {
                aVar.e();
            }
            this.f364907p = true;
        }
        float f14 = this.f364894c.f394724w;
        WeakReference<S> weakReference = this.f364902k;
        if (weakReference != null && (s5 = weakReference.get()) != null) {
            C39925z0 c39925z0 = s5.f364568l;
            if (c39925z0.getVisibility() != 0) {
                c39925z0.setVisibility(0);
            }
            c39925z0.setProgress(f12 / f14);
            c39925z0.setDigit((int) Math.ceil(f14 - f12));
        }
        int iA2 = C39907t0.a(f12, f14);
        if (iA2 == 1) {
            a(f14, f14);
            return;
        }
        if (this.f364903l == null) {
            return;
        }
        if (C39907t0.a(f12, 0.0f) == 1) {
            this.f364914w = this.f364903l.q();
        }
        if (iA2 == -1) {
            return;
        }
        if (this.f364916y) {
            this.f364903l.k();
            return;
        }
        j();
        this.f364909r = 3;
        this.f364903l.e();
        this.f364905n = false;
        S0.a aVar2 = this.f364913v;
        if (aVar2 != null && (cVar = aVar2.f364596b.f364586a.f365003g) != null) {
            cVar.c();
        }
        r1Var.e();
    }

    @Override // com.my.target.V.a
    public final void b(boolean z12) {
        P0 p02 = this.f364903l;
        if (p02 == null || z12) {
            return;
        }
        this.f364914w = p02.q();
        r();
        f();
    }

    @Override // com.my.target.P0.a
    public final void a(@j.N String str) {
        this.f364899h.g();
        com.my.target.common.models.e eVar = (com.my.target.common.models.e) this.f364894c.f394856J;
        if (eVar == null || !this.f364910s.toString().equals(eVar.f394307d)) {
            S0.a aVar = this.f364913v;
            if (aVar != null) {
                aVar.d();
                return;
            }
            return;
        }
        this.f364910s = Uri.parse(eVar.f394304a);
        WeakReference<Context> weakReference = this.f364912u;
        Context context = weakReference != null ? weakReference.get() : null;
        P0 p02 = this.f364903l;
        if (p02 == null || context == null) {
            return;
        }
        p02.c(context, this.f364910s);
    }

    @Override // com.my.target.S.e
    public final void a(View view) {
        if (this.f364909r == 1) {
            P0 p02 = this.f364903l;
            if (p02 != null) {
                p02.b();
            }
            f();
        }
        S0.a aVar = this.f364911t;
        if (aVar != null) {
            aVar.onClick(view);
        }
    }

    @Override // com.my.target.P0.a
    public final void i() {
    }

    @Override // com.my.target.S.e
    public final void d() {
        P0 p02 = this.f364903l;
        if (p02 == null) {
            this.f364908q = !this.f364908q;
            return;
        }
        boolean zL2 = p02.l();
        r1 r1Var = this.f364899h;
        if (zL2) {
            this.f364903l.m();
            r1Var.d(true);
            this.f364908q = false;
        } else {
            this.f364903l.r();
            r1Var.d(false);
            this.f364908q = true;
        }
    }
}
