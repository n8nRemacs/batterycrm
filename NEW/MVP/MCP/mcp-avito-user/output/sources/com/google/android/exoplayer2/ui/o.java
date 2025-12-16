package com.google.android.exoplayer2.ui;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.m;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.InterfaceC36596l;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import v61.InterfaceC49174e;

/* compiled from: PlayerView.java */
@Deprecated
/* loaded from: classes6.dex */
public class o extends FrameLayout implements InterfaceC36564b {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f347524n = 0;

    /* renamed from: b, reason: collision with root package name */
    @P
    public d0 f347525b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f347526c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public m.e f347527d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f347528e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public Drawable f347529f;

    /* renamed from: g, reason: collision with root package name */
    public int f347530g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f347531h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public InterfaceC36596l<? super PlaybackException> f347532i;

    /* renamed from: j, reason: collision with root package name */
    public int f347533j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f347534k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f347535l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f347536m;

    /* compiled from: PlayerView.java */
    public final class a implements d0.g, View.OnLayoutChangeListener, View.OnClickListener, m.e {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i12 = o.f347524n;
            throw null;
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onCues(com.google.android.exoplayer2.text.d dVar) {
            int i12 = o.f347524n;
            throw null;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int i22 = o.f347524n;
            throw null;
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayWhenReadyChanged(boolean z12, int i12) {
            int i13 = o.f347524n;
            throw null;
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlaybackStateChanged(int i12) {
            int i13 = o.f347524n;
            throw null;
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPositionDiscontinuity(d0.k kVar, d0.k kVar2, int i12) {
            int i13 = o.f347524n;
            throw null;
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onRenderedFirstFrame() {
            int i12 = o.f347524n;
            throw null;
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onTracksChanged(t0 t0Var) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onVideoSizeChanged(com.google.android.exoplayer2.video.o oVar) {
            int i12 = o.f347524n;
            throw null;
        }
    }

    /* compiled from: PlayerView.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public final void a() {
        d0 d0Var = this.f347525b;
        if (!(d0Var != null && d0Var.isPlayingAd() && this.f347525b.getPlayWhenReady() && this.f347535l) && c()) {
            throw null;
        }
    }

    public final void b() {
        d0 d0Var = this.f347525b;
        if (d0Var == null || !d0Var.u(30) || d0Var.getCurrentTracks().f346709b.isEmpty() || d0Var.getCurrentTracks().b(2) || !this.f347528e) {
            return;
        }
        C36585a.e(null);
        byte[] bArr = d0Var.p().f343619k;
        if (bArr != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            int intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
            int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                throw null;
            }
        }
        Drawable drawable = this.f347529f;
        if (drawable != null) {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            int intrinsicHeight2 = drawable.getIntrinsicHeight();
            if (intrinsicWidth2 > 0 && intrinsicHeight2 > 0) {
                throw null;
            }
        }
    }

    @InterfaceC49174e
    public final boolean c() {
        if (!this.f347526c) {
            return false;
        }
        C36585a.e(null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        d0 d0Var = this.f347525b;
        if (d0Var != null && d0Var.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z12 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if ((z12 && c()) || c()) {
            throw null;
        }
        if (super.dispatchKeyEvent(keyEvent)) {
            a();
            return true;
        }
        if (!z12 || !c()) {
            return false;
        }
        a();
        return false;
    }

    @Override // com.google.android.exoplayer2.ui.InterfaceC36564b
    public List<C36563a> getAdOverlayInfos() {
        return AbstractC37401r1.v(new ArrayList());
    }

    @Override // com.google.android.exoplayer2.ui.InterfaceC36564b
    public ViewGroup getAdViewGroup() {
        throw new IllegalStateException("exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f347534k;
    }

    public boolean getControllerHideOnTouch() {
        return this.f347536m;
    }

    public int getControllerShowTimeoutMs() {
        return this.f347533j;
    }

    @P
    public Drawable getDefaultArtwork() {
        return this.f347529f;
    }

    @P
    public FrameLayout getOverlayFrameLayout() {
        return null;
    }

    @P
    public d0 getPlayer() {
        return this.f347525b;
    }

    public int getResizeMode() {
        C36585a.e(null);
        throw null;
    }

    @P
    public SubtitleView getSubtitleView() {
        return null;
    }

    public boolean getUseArtwork() {
        return this.f347528e;
    }

    public boolean getUseController() {
        return this.f347526c;
    }

    @P
    public View getVideoSurfaceView() {
        return null;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!c() || this.f347525b == null) {
            return false;
        }
        a();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!c() || this.f347525b == null) {
            return super.performClick();
        }
        throw null;
    }

    public void setAspectRatioListener(@P AspectRatioFrameLayout.b bVar) {
        C36585a.e(null);
        throw null;
    }

    public void setControllerAutoShow(boolean z12) {
        this.f347534k = z12;
    }

    public void setControllerHideDuringAds(boolean z12) {
        this.f347535l = z12;
    }

    public void setControllerHideOnTouch(boolean z12) {
        C36585a.e(null);
        this.f347536m = z12;
        setContentDescription(null);
    }

    public void setControllerShowTimeoutMs(int i12) {
        C36585a.e(null);
        this.f347533j = i12;
        throw null;
    }

    public void setControllerVisibilityListener(@P m.e eVar) {
        C36585a.e(null);
        m.e eVar2 = this.f347527d;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            throw null;
        }
        this.f347527d = eVar;
        if (eVar != null) {
            throw null;
        }
    }

    public void setCustomErrorMessage(@P CharSequence charSequence) {
        C36585a.d(false);
    }

    public void setDefaultArtwork(@P Drawable drawable) {
        if (this.f347529f != drawable) {
            this.f347529f = drawable;
            b();
        }
    }

    public void setErrorMessageProvider(@P InterfaceC36596l<? super PlaybackException> interfaceC36596l) {
        if (this.f347532i != interfaceC36596l) {
            this.f347532i = interfaceC36596l;
        }
    }

    public void setKeepContentOnPlayerReset(boolean z12) {
        if (this.f347531h != z12) {
            this.f347531h = z12;
            b();
        }
    }

    public void setPlayer(@P d0 d0Var) {
        C36585a.d(Looper.myLooper() == Looper.getMainLooper());
        C36585a.b(d0Var == null || d0Var.G() == Looper.getMainLooper());
        d0 d0Var2 = this.f347525b;
        if (d0Var2 == d0Var) {
            return;
        }
        if (d0Var2 != null) {
            d0Var2.s(null);
            d0Var2.u(27);
        }
        this.f347525b = d0Var;
        if (c()) {
            throw null;
        }
        b();
        if (d0Var != null) {
            if (d0Var.u(27)) {
                d0 d0Var3 = this.f347525b;
                int i12 = (d0Var3 != null ? d0Var3.e() : com.google.android.exoplayer2.video.o.f348320f).f348321b;
            }
            d0Var.N(null);
            a();
        }
    }

    public void setRepeatToggleModes(int i12) {
        C36585a.e(null);
        throw null;
    }

    public void setResizeMode(int i12) {
        C36585a.e(null);
        throw null;
    }

    public void setShowBuffering(int i12) {
        if (this.f347530g != i12) {
            this.f347530g = i12;
        }
    }

    public void setShowFastForwardButton(boolean z12) {
        C36585a.e(null);
        throw null;
    }

    public void setShowMultiWindowTimeBar(boolean z12) {
        C36585a.e(null);
        throw null;
    }

    public void setShowNextButton(boolean z12) {
        C36585a.e(null);
        throw null;
    }

    public void setShowPreviousButton(boolean z12) {
        C36585a.e(null);
        throw null;
    }

    public void setShowRewindButton(boolean z12) {
        C36585a.e(null);
        throw null;
    }

    public void setShowShuffleButton(boolean z12) {
        C36585a.e(null);
        throw null;
    }

    public void setUseArtwork(boolean z12) {
        C36585a.d(!z12);
        if (this.f347528e != z12) {
            this.f347528e = z12;
            b();
        }
    }

    public void setUseController(boolean z12) {
        boolean z13 = true;
        C36585a.d(!z12);
        if (!z12 && !hasOnClickListeners()) {
            z13 = false;
        }
        setClickable(z13);
        if (this.f347526c == z12) {
            return;
        }
        this.f347526c = z12;
        if (c()) {
            throw null;
        }
        setContentDescription(null);
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
        super.setVisibility(i12);
    }

    public void setShutterBackgroundColor(int i12) {
    }
}
