package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.p;
import com.google.android.exoplayer2.ui.s;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.InterfaceC36596l;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import j.InterfaceC42156l;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import v61.InterfaceC49174e;

/* loaded from: classes6.dex */
public class StyledPlayerView extends FrameLayout implements InterfaceC36564b {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f347391D = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f347392A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f347393B;

    /* renamed from: C, reason: collision with root package name */
    public int f347394C;

    /* renamed from: b, reason: collision with root package name */
    public final a f347395b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final AspectRatioFrameLayout f347396c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final View f347397d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final View f347398e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f347399f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final ImageView f347400g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final SubtitleView f347401h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final View f347402i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final TextView f347403j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public final s f347404k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public final FrameLayout f347405l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public final FrameLayout f347406m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public d0 f347407n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f347408o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public b f347409p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public s.m f347410q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public c f347411r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f347412s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public Drawable f347413t;

    /* renamed from: u, reason: collision with root package name */
    public int f347414u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f347415v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public InterfaceC36596l<? super PlaybackException> f347416w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public CharSequence f347417x;

    /* renamed from: y, reason: collision with root package name */
    public int f347418y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f347419z;

    public final class a implements d0.g, View.OnLayoutChangeListener, View.OnClickListener, s.m, s.d {

        /* renamed from: b, reason: collision with root package name */
        public final s0.b f347420b = new s0.b();

        /* renamed from: c, reason: collision with root package name */
        @P
        public Object f347421c;

        public a() {
        }

        @Override // com.google.android.exoplayer2.ui.s.d
        public final void a(boolean z12) {
            c cVar = StyledPlayerView.this.f347411r;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // com.google.android.exoplayer2.ui.s.m
        public final void b(int i12) {
            int i13 = StyledPlayerView.f347391D;
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            styledPlayerView.k();
            b bVar = styledPlayerView.f347409p;
            if (bVar != null) {
                bVar.a(i12);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i12 = StyledPlayerView.f347391D;
            StyledPlayerView.this.h();
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onCues(com.google.android.exoplayer2.text.d dVar) {
            SubtitleView subtitleView = StyledPlayerView.this.f347401h;
            if (subtitleView != null) {
                subtitleView.setCues(dVar.f346847b);
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            StyledPlayerView.a((TextureView) view, StyledPlayerView.this.f347394C);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayWhenReadyChanged(boolean z12, int i12) {
            int i13 = StyledPlayerView.f347391D;
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            styledPlayerView.j();
            if (!styledPlayerView.b() || !styledPlayerView.f347392A) {
                styledPlayerView.c(false);
                return;
            }
            s sVar = styledPlayerView.f347404k;
            if (sVar != null) {
                sVar.f();
            }
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlaybackStateChanged(int i12) {
            int i13 = StyledPlayerView.f347391D;
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            styledPlayerView.j();
            styledPlayerView.l();
            if (!styledPlayerView.b() || !styledPlayerView.f347392A) {
                styledPlayerView.c(false);
                return;
            }
            s sVar = styledPlayerView.f347404k;
            if (sVar != null) {
                sVar.f();
            }
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPositionDiscontinuity(d0.k kVar, d0.k kVar2, int i12) {
            s sVar;
            int i13 = StyledPlayerView.f347391D;
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            if (styledPlayerView.b() && styledPlayerView.f347392A && (sVar = styledPlayerView.f347404k) != null) {
                sVar.f();
            }
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onRenderedFirstFrame() {
            View view = StyledPlayerView.this.f347397d;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onTracksChanged(t0 t0Var) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            d0 d0Var = styledPlayerView.f347407n;
            d0Var.getClass();
            s0 currentTimeline = d0Var.getCurrentTimeline();
            if (currentTimeline.p()) {
                this.f347421c = null;
            } else {
                boolean zIsEmpty = d0Var.getCurrentTracks().f346709b.isEmpty();
                s0.b bVar = this.f347420b;
                if (zIsEmpty) {
                    Object obj = this.f347421c;
                    if (obj != null) {
                        int iB2 = currentTimeline.b(obj);
                        if (iB2 != -1) {
                            if (d0Var.getCurrentMediaItemIndex() == currentTimeline.f(iB2, bVar, false).f345872d) {
                                return;
                            }
                        }
                        this.f347421c = null;
                    }
                } else {
                    this.f347421c = currentTimeline.f(d0Var.getCurrentPeriodIndex(), bVar, true).f345871c;
                }
            }
            styledPlayerView.m(false);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onVideoSizeChanged(com.google.android.exoplayer2.video.o oVar) {
            int i12 = StyledPlayerView.f347391D;
            StyledPlayerView.this.i();
        }
    }

    public interface b {
        void a(int i12);
    }

    public interface c {
        void a();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, @P AttributeSet attributeSet) {
        int i12;
        boolean z12;
        int i13;
        int i14;
        int i15;
        boolean z13;
        int color;
        boolean zHasValue;
        boolean z14;
        int resourceId;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        super(context, attributeSet, 0);
        a aVar = new a();
        this.f347395b = aVar;
        if (isInEditMode()) {
            this.f347396c = null;
            this.f347397d = null;
            this.f347398e = null;
            this.f347399f = false;
            this.f347400g = null;
            this.f347401h = null;
            this.f347402i = null;
            this.f347403j = null;
            this.f347404k = null;
            this.f347405l = null;
            this.f347406m = null;
            ImageView imageView = new ImageView(context);
            if (U.f348106a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.m.f347540d, 0, 0);
            try {
                zHasValue = typedArrayObtainStyledAttributes.hasValue(27);
                color = typedArrayObtainStyledAttributes.getColor(27, 0);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(14, R.layout.exo_styled_player_view);
                z14 = typedArrayObtainStyledAttributes.getBoolean(32, true);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(8, 0);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(33, true);
                i14 = typedArrayObtainStyledAttributes.getInt(28, 1);
                i13 = typedArrayObtainStyledAttributes.getInt(16, 0);
                int i18 = typedArrayObtainStyledAttributes.getInt(25, 5000);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(10, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(3, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(22, 0);
                this.f347415v = typedArrayObtainStyledAttributes.getBoolean(11, this.f347415v);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(9, true);
                typedArrayObtainStyledAttributes.recycle();
                z13 = z22;
                i15 = integer;
                z15 = z18;
                z16 = z23;
                z12 = z19;
                i12 = i18;
                i16 = resourceId2;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i12 = 5000;
            z12 = true;
            i13 = 0;
            i14 = 1;
            i15 = 0;
            z13 = true;
            color = 0;
            zHasValue = false;
            z14 = true;
            resourceId = 0;
            z15 = true;
            i16 = R.layout.exo_styled_player_view;
            z16 = true;
        }
        LayoutInflater.from(context).inflate(i16, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f347396c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i13);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.f347397d = viewFindViewById;
        if (viewFindViewById != null && zHasValue) {
            viewFindViewById.setBackgroundColor(color);
        }
        if (aspectRatioFrameLayout == null || i14 == 0) {
            i17 = 0;
            this.f347398e = null;
            z17 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i14 == 2) {
                this.f347398e = new TextureView(context);
            } else if (i14 == 3) {
                try {
                    int i19 = com.google.android.exoplayer2.video.spherical.k.f348380m;
                    this.f347398e = (View) com.google.android.exoplayer2.video.spherical.k.class.getConstructor(Context.class).newInstance(context);
                    z17 = true;
                    this.f347398e.setLayoutParams(layoutParams);
                    this.f347398e.setOnClickListener(aVar);
                    i17 = 0;
                    this.f347398e.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f347398e, 0);
                } catch (Exception e12) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e12);
                }
            } else if (i14 != 4) {
                this.f347398e = new SurfaceView(context);
            } else {
                try {
                    int i22 = com.google.android.exoplayer2.video.h.f348272c;
                    this.f347398e = (View) com.google.android.exoplayer2.video.h.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e13) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e13);
                }
            }
            z17 = false;
            this.f347398e.setLayoutParams(layoutParams);
            this.f347398e.setOnClickListener(aVar);
            i17 = 0;
            this.f347398e.setClickable(false);
            aspectRatioFrameLayout.addView(this.f347398e, 0);
        }
        this.f347399f = z17;
        this.f347405l = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f347406m = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f347400g = imageView2;
        this.f347412s = (!z14 || imageView2 == null) ? i17 : 1;
        if (resourceId != 0) {
            this.f347413t = androidx.core.content.d.getDrawable(getContext(), resourceId);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f347401h = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.f347402i = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f347414u = i15;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f347403j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        s sVar = (s) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (sVar != null) {
            this.f347404k = sVar;
        } else if (viewFindViewById3 != null) {
            s sVar2 = new s(context, attributeSet);
            this.f347404k = sVar2;
            sVar2.setId(R.id.exo_controller);
            sVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(sVar2, iIndexOfChild);
        } else {
            this.f347404k = null;
        }
        s sVar3 = this.f347404k;
        this.f347418y = sVar3 != null ? i12 : i17;
        this.f347393B = z12;
        this.f347419z = z13;
        this.f347392A = z16;
        this.f347408o = (!z15 || sVar3 == null) ? i17 : 1;
        if (sVar3 != null) {
            z zVar = sVar3.f347593i0;
            int i23 = zVar.f347692z;
            if (i23 != 3 && i23 != 2) {
                zVar.f();
                zVar.i(2);
            }
            this.f347404k.f347580c.add(aVar);
        }
        if (z15) {
            setClickable(true);
        }
        k();
    }

    public static void a(TextureView textureView, int i12) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i12 != 0) {
            float f12 = width / 2.0f;
            float f13 = height / 2.0f;
            matrix.postRotate(i12, f12, f13);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f12, f13);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        d0 d0Var = this.f347407n;
        return d0Var != null && d0Var.isPlayingAd() && this.f347407n.getPlayWhenReady();
    }

    public final void c(boolean z12) {
        if (!(b() && this.f347392A) && n()) {
            s sVar = this.f347404k;
            boolean z13 = sVar.g() && sVar.getShowTimeoutMs() <= 0;
            boolean zE2 = e();
            if (z12 || z13 || zE2) {
                g(zE2);
            }
        }
    }

    @v61.m
    public final boolean d(@P Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f12 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f347396c;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f12);
                }
                ImageView imageView = this.f347400g;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        d0 d0Var = this.f347407n;
        if (d0Var != null && d0Var.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z12 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        s sVar = this.f347404k;
        if (z12 && n() && !sVar.g()) {
            c(true);
        } else {
            if ((!n() || !sVar.c(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z12 || !n()) {
                    return false;
                }
                c(true);
                return false;
            }
            c(true);
        }
        return true;
    }

    public final boolean e() {
        d0 d0Var = this.f347407n;
        if (d0Var == null) {
            return true;
        }
        int playbackState = d0Var.getPlaybackState();
        if (this.f347419z && !this.f347407n.getCurrentTimeline().p()) {
            if (playbackState == 1 || playbackState == 4) {
                return true;
            }
            d0 d0Var2 = this.f347407n;
            d0Var2.getClass();
            if (!d0Var2.getPlayWhenReady()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        g(e());
    }

    public final void g(boolean z12) {
        if (n()) {
            int i12 = z12 ? 0 : this.f347418y;
            s sVar = this.f347404k;
            sVar.setShowTimeoutMs(i12);
            z zVar = sVar.f347593i0;
            s sVar2 = zVar.f347667a;
            if (!sVar2.h()) {
                sVar2.setVisibility(0);
                sVar2.i();
                View view = sVar2.f347586f;
                if (view != null) {
                    view.requestFocus();
                }
            }
            zVar.k();
        }
    }

    @Override // com.google.android.exoplayer2.ui.InterfaceC36564b
    public List<C36563a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f347406m;
        if (frameLayout != null) {
            arrayList.add(new C36563a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        s sVar = this.f347404k;
        if (sVar != null) {
            arrayList.add(new C36563a(sVar, 1, null));
        }
        return AbstractC37401r1.v(arrayList);
    }

    @Override // com.google.android.exoplayer2.ui.InterfaceC36564b
    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f347405l;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw new IllegalStateException("exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f347419z;
    }

    public boolean getControllerHideOnTouch() {
        return this.f347393B;
    }

    public int getControllerShowTimeoutMs() {
        return this.f347418y;
    }

    @P
    public Drawable getDefaultArtwork() {
        return this.f347413t;
    }

    @P
    public FrameLayout getOverlayFrameLayout() {
        return this.f347406m;
    }

    @P
    public d0 getPlayer() {
        return this.f347407n;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f347396c;
        C36585a.e(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @P
    public SubtitleView getSubtitleView() {
        return this.f347401h;
    }

    public boolean getUseArtwork() {
        return this.f347412s;
    }

    public boolean getUseController() {
        return this.f347408o;
    }

    @P
    public View getVideoSurfaceView() {
        return this.f347398e;
    }

    public final void h() {
        if (!n() || this.f347407n == null) {
            return;
        }
        s sVar = this.f347404k;
        if (!sVar.g()) {
            c(true);
        } else if (this.f347393B) {
            sVar.f();
        }
    }

    public final void i() {
        d0 d0Var = this.f347407n;
        com.google.android.exoplayer2.video.o oVarE = d0Var != null ? d0Var.e() : com.google.android.exoplayer2.video.o.f348320f;
        int i12 = oVarE.f348321b;
        int i13 = oVarE.f348322c;
        float f12 = (i13 == 0 || i12 == 0) ? 0.0f : (i12 * oVarE.f348324e) / i13;
        View view = this.f347398e;
        if (view instanceof TextureView) {
            int i14 = oVarE.f348323d;
            if (f12 > 0.0f && (i14 == 90 || i14 == 270)) {
                f12 = 1.0f / f12;
            }
            int i15 = this.f347394C;
            a aVar = this.f347395b;
            if (i15 != 0) {
                view.removeOnLayoutChangeListener(aVar);
            }
            this.f347394C = i14;
            if (i14 != 0) {
                view.addOnLayoutChangeListener(aVar);
            }
            a((TextureView) view, this.f347394C);
        }
        float f13 = this.f347399f ? 0.0f : f12;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f347396c;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f13);
        }
    }

    public final void j() {
        int i12;
        View view = this.f347402i;
        if (view != null) {
            d0 d0Var = this.f347407n;
            view.setVisibility((d0Var != null && d0Var.getPlaybackState() == 2 && ((i12 = this.f347414u) == 2 || (i12 == 1 && this.f347407n.getPlayWhenReady()))) ? 0 : 8);
        }
    }

    public final void k() {
        s sVar = this.f347404k;
        if (sVar == null || !this.f347408o) {
            setContentDescription(null);
        } else if (sVar.g()) {
            setContentDescription(this.f347393B ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void l() {
        InterfaceC36596l<? super PlaybackException> interfaceC36596l;
        TextView textView = this.f347403j;
        if (textView != null) {
            CharSequence charSequence = this.f347417x;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            d0 d0Var = this.f347407n;
            if ((d0Var != null ? d0Var.a() : null) == null || (interfaceC36596l = this.f347416w) == null) {
                textView.setVisibility(8);
            } else {
                textView.setText((CharSequence) interfaceC36596l.getErrorMessage().second);
                textView.setVisibility(0);
            }
        }
    }

    public final void m(boolean z12) {
        d0 d0Var = this.f347407n;
        View view = this.f347397d;
        ImageView imageView = this.f347400g;
        boolean zD2 = false;
        if (d0Var == null || d0Var.getCurrentTracks().f346709b.isEmpty()) {
            if (this.f347415v) {
                return;
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        if (z12 && !this.f347415v && view != null) {
            view.setVisibility(0);
        }
        if (d0Var.getCurrentTracks().b(2)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
                return;
            }
            return;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.f347412s) {
            C36585a.e(imageView);
            byte[] bArr = d0Var.p().f343619k;
            if (bArr != null) {
                zD2 = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
            }
            if (zD2 || d(this.f347413t)) {
                return;
            }
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
    }

    @InterfaceC49174e
    public final boolean n() {
        if (!this.f347408o) {
            return false;
        }
        C36585a.e(this.f347404k);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!n() || this.f347407n == null) {
            return false;
        }
        c(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        h();
        return super.performClick();
    }

    public void setAspectRatioListener(@P AspectRatioFrameLayout.b bVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f347396c;
        C36585a.e(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z12) {
        this.f347419z = z12;
    }

    public void setControllerHideDuringAds(boolean z12) {
        this.f347392A = z12;
    }

    public void setControllerHideOnTouch(boolean z12) {
        C36585a.e(this.f347404k);
        this.f347393B = z12;
        k();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@P s.d dVar) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        this.f347411r = null;
        sVar.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i12) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        this.f347418y = i12;
        if (sVar.g()) {
            f();
        }
    }

    public void setControllerVisibilityListener(@P b bVar) {
        this.f347409p = bVar;
        setControllerVisibilityListener((s.m) null);
    }

    public void setCustomErrorMessage(@P CharSequence charSequence) {
        C36585a.d(this.f347403j != null);
        this.f347417x = charSequence;
        l();
    }

    public void setDefaultArtwork(@P Drawable drawable) {
        if (this.f347413t != drawable) {
            this.f347413t = drawable;
            m(false);
        }
    }

    public void setErrorMessageProvider(@P InterfaceC36596l<? super PlaybackException> interfaceC36596l) {
        if (this.f347416w != interfaceC36596l) {
            this.f347416w = interfaceC36596l;
            l();
        }
    }

    public void setFullscreenButtonClickListener(@P c cVar) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        this.f347411r = cVar;
        sVar.setOnFullScreenModeChangedListener(this.f347395b);
    }

    public void setKeepContentOnPlayerReset(boolean z12) {
        if (this.f347415v != z12) {
            this.f347415v = z12;
            m(false);
        }
    }

    public void setPlayer(@P d0 d0Var) {
        C36585a.d(Looper.myLooper() == Looper.getMainLooper());
        C36585a.b(d0Var == null || d0Var.G() == Looper.getMainLooper());
        d0 d0Var2 = this.f347407n;
        if (d0Var2 == d0Var) {
            return;
        }
        View view = this.f347398e;
        a aVar = this.f347395b;
        if (d0Var2 != null) {
            d0Var2.s(aVar);
            if (view instanceof TextureView) {
                d0Var2.v((TextureView) view);
            } else if (view instanceof SurfaceView) {
                d0Var2.D((SurfaceView) view);
            }
        }
        SubtitleView subtitleView = this.f347401h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f347407n = d0Var;
        boolean zN2 = n();
        s sVar = this.f347404k;
        if (zN2) {
            sVar.setPlayer(d0Var);
        }
        j();
        l();
        m(true);
        if (d0Var == null) {
            if (sVar != null) {
                sVar.f();
                return;
            }
            return;
        }
        if (d0Var.u(27)) {
            if (view instanceof TextureView) {
                d0Var.setVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                d0Var.t((SurfaceView) view);
            }
            i();
        }
        if (subtitleView != null && d0Var.u(28)) {
            subtitleView.setCues(d0Var.m().f346847b);
        }
        d0Var.N(aVar);
        c(false);
    }

    public void setRepeatToggleModes(int i12) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        sVar.setRepeatToggleModes(i12);
    }

    public void setResizeMode(int i12) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f347396c;
        C36585a.e(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i12);
    }

    public void setShowBuffering(int i12) {
        if (this.f347414u != i12) {
            this.f347414u = i12;
            j();
        }
    }

    public void setShowFastForwardButton(boolean z12) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        sVar.setShowFastForwardButton(z12);
    }

    public void setShowMultiWindowTimeBar(boolean z12) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        sVar.setShowMultiWindowTimeBar(z12);
    }

    public void setShowNextButton(boolean z12) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        sVar.setShowNextButton(z12);
    }

    public void setShowPreviousButton(boolean z12) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        sVar.setShowPreviousButton(z12);
    }

    public void setShowRewindButton(boolean z12) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        sVar.setShowRewindButton(z12);
    }

    public void setShowShuffleButton(boolean z12) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        sVar.setShowShuffleButton(z12);
    }

    public void setShowSubtitleButton(boolean z12) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        sVar.setShowSubtitleButton(z12);
    }

    public void setShowVrButton(boolean z12) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        sVar.setShowVrButton(z12);
    }

    public void setShutterBackgroundColor(@InterfaceC42156l int i12) {
        View view = this.f347397d;
        if (view != null) {
            view.setBackgroundColor(i12);
        }
    }

    public void setUseArtwork(boolean z12) {
        C36585a.d((z12 && this.f347400g == null) ? false : true);
        if (this.f347412s != z12) {
            this.f347412s = z12;
            m(false);
        }
    }

    public void setUseController(boolean z12) {
        boolean z13 = true;
        s sVar = this.f347404k;
        C36585a.d((z12 && sVar == null) ? false : true);
        if (!z12 && !hasOnClickListeners()) {
            z13 = false;
        }
        setClickable(z13);
        if (this.f347408o == z12) {
            return;
        }
        this.f347408o = z12;
        if (n()) {
            sVar.setPlayer(this.f347407n);
        } else if (sVar != null) {
            sVar.f();
            sVar.setPlayer(null);
        }
        k();
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
        super.setVisibility(i12);
        View view = this.f347398e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i12);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(@P s.m mVar) {
        s sVar = this.f347404k;
        C36585a.e(sVar);
        s.m mVar2 = this.f347410q;
        if (mVar2 == mVar) {
            return;
        }
        CopyOnWriteArrayList<s.m> copyOnWriteArrayList = sVar.f347580c;
        if (mVar2 != null) {
            copyOnWriteArrayList.remove(mVar2);
        }
        this.f347410q = mVar;
        if (mVar != null) {
            copyOnWriteArrayList.add(mVar);
        }
        setControllerVisibilityListener((b) null);
    }
}
