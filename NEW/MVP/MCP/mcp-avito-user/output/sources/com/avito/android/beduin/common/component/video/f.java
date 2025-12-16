package com.avito.android.beduin.common.component.video;

import Y61.k;
import Y61.l;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.beduin.common.component.video.BeduinVideoState;
import com.avito.android.beduin.common.component.video.g;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.C36548k;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinVideoView.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u001e\u001fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/avito/android/beduin/common/component/video/f;", "Landroid/widget/FrameLayout;", "", "mode", "Lkotlin/G0;", "setResizeMode", "(I)V", "radius", "setCornerRadius", "(Ljava/lang/Integer;)V", "Lcom/avito/android/beduin/common/component/video/BeduinVideoState;", "pendingPlayingState", "setPendingPlayingState", "(Lcom/avito/android/beduin/common/component/video/BeduinVideoState;)V", "", "f", "F", "getRatio", "()F", "setRatio", "(F)V", "ratio", "Lcom/google/android/exoplayer2/source/k;", "j", "Lcom/google/android/exoplayer2/source/k;", "getSourceFactory", "()Lcom/google/android/exoplayer2/source/k;", "setSourceFactory", "(Lcom/google/android/exoplayer2/source/k;)V", "sourceFactory", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f102899b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public RectF f102900c;

    /* renamed from: d, reason: collision with root package name */
    public float f102901d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public BeduinVideoState f102902e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float ratio;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Uri f102904g;

    /* renamed from: h, reason: collision with root package name */
    public int f102905h;

    /* renamed from: i, reason: collision with root package name */
    public float f102906i;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    public C36548k sourceFactory;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final LinearLayout f102908k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ShimmerFrameLayout f102909l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final a f102910m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final List<View> f102911n;

    /* compiled from: BeduinVideoView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/video/f$a;", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends StyledPlayerView {

        /* renamed from: I, reason: collision with root package name */
        public static final /* synthetic */ int f102912I = 0;

        /* renamed from: E, reason: collision with root package name */
        @k
        public final b f102913E;

        /* renamed from: F, reason: collision with root package name */
        @k
        public final C3087a f102914F;

        /* renamed from: G, reason: collision with root package name */
        @k
        public g f102915G;

        /* compiled from: BeduinVideoView.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/common/component/video/f$a$a", "Landroidx/lifecycle/q;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.component.video.f$a$a, reason: collision with other inner class name */
        public static final class C3087a implements InterfaceC23057q {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f102918c;

            public C3087a(f fVar) {
                this.f102918c = fVar;
            }

            @Override // androidx.view.InterfaceC23057q
            public final void onDestroy(@k InterfaceC22983P interfaceC22983P) {
                int i12 = a.f102912I;
                a aVar = a.this;
                Lifecycle lifecycleP = aVar.p();
                if (lifecycleP != null) {
                    lifecycleP.c(this);
                }
                aVar.q(g.e.f102924a);
            }

            @Override // androidx.view.InterfaceC23057q
            public final void onPause(@k InterfaceC22983P interfaceC22983P) {
                a aVar = a.this;
                if (aVar.f102915G instanceof g.c) {
                    aVar.q(g.b.f102921a);
                }
            }

            @Override // androidx.view.InterfaceC23057q
            public final void onResume(@k InterfaceC22983P interfaceC22983P) {
                a.this.o();
            }

            @Override // androidx.view.InterfaceC23057q
            public final void onStart(@k InterfaceC22983P interfaceC22983P) {
                if (this.f102918c.f102904g != null) {
                    a.this.q(g.d.f102923a);
                }
            }

            @Override // androidx.view.InterfaceC23057q
            public final void onStop(@k InterfaceC22983P interfaceC22983P) {
                a.this.q(g.e.f102924a);
            }
        }

        /* compiled from: BeduinVideoView.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/common/component/video/f$a$b", "Lcom/google/android/exoplayer2/d0$g;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements d0.g {
            public b() {
            }

            @Override // com.google.android.exoplayer2.d0.g
            public final void onPlaybackStateChanged(int i12) {
                a.this.o();
            }

            @Override // com.google.android.exoplayer2.d0.g
            public final void onPlayerError(@k PlaybackException playbackException) {
                a.this.q(g.a.f102920a);
            }
        }

        public a() {
            super(f.this.getContext(), null);
            this.f102913E = new b();
            this.f102914F = new C3087a(f.this);
            this.f102915G = g.e.f102924a;
        }

        public final void o() {
            d0 player = getPlayer();
            if (player == null || player.getPlaybackState() != 3) {
                return;
            }
            Lifecycle lifecycleP = p();
            if ((lifecycleP != null ? lifecycleP.getF46705d() : null) == Lifecycle.State.f46683f && isAttachedToWindow()) {
                BeduinVideoState.a aVar = BeduinVideoState.f102879b;
                BeduinVideoState beduinVideoState = f.this.f102902e;
                aVar.getClass();
                int i12 = beduinVideoState == null ? -1 : BeduinVideoState.a.C3085a.f102882a[beduinVideoState.ordinal()];
                g gVar = (i12 == 1 || i12 != 2) ? g.c.f102922a : g.b.f102921a;
                q(gVar);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            o();
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f102915G instanceof g.c) {
                q(g.b.f102921a);
            }
        }

        public final Lifecycle p() {
            ComponentCallbacks2 componentCallbacks2A = C35835l0.a(getContext());
            InterfaceC22983P interfaceC22983P = componentCallbacks2A instanceof InterfaceC22983P ? (InterfaceC22983P) componentCallbacks2A : null;
            if (interfaceC22983P != null) {
                return interfaceC22983P.getLifecycle();
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void q(@Y61.k com.avito.android.beduin.common.component.video.g r7) {
            /*
                Method dump skipped, instructions count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.video.f.a.q(com.avito.android.beduin.common.component.video.g):void");
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerView
        public final void setPlayer(@l d0 d0Var) {
            super.setPlayer(d0Var);
            b bVar = this.f102913E;
            if (d0Var != null) {
                d0Var.s(bVar);
            }
            if (d0Var != null) {
                d0Var.N(bVar);
            }
        }
    }

    /* compiled from: BeduinVideoView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/component/video/f$b;", "", "<init>", "()V", "", "DEFAULT_CORNER_RADIUS", "I", "", "DEFAULT_RATIO", "F", "DEFAULT_STROKE_WIDTH", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public f(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.common_gray_12));
        paint.setStrokeWidth(y6.b(1));
        paint.setStyle(Paint.Style.STROKE);
        this.f102899b = paint;
        this.f102901d = y6.b(0);
        this.f102902e = BeduinVideoState.PLAYING;
        this.ratio = 1.0f;
        this.f102905h = 1;
        a aVar = new a();
        this.f102910m = aVar;
        LayoutInflater.from(context).inflate(R.layout.beduin_video_view, (ViewGroup) this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_error);
        this.f102908k = linearLayout;
        Button button = (Button) findViewById(R.id.btn_retry);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.skeleton);
        this.f102909l = shimmerFrameLayout;
        Lifecycle lifecycleP = aVar.p();
        if (lifecycleP != null) {
            lifecycleP.a(aVar.f102914F);
        }
        aVar.setShutterBackgroundColor(androidx.core.content.d.getColor(aVar.getContext(), R.color.common_warm_gray_8));
        addView(aVar);
        setBackground(new ColorDrawable(androidx.core.content.d.getColor(getContext(), R.color.common_transparent_white)));
        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.beduin.common.component.video.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102898b.f102910m.q(g.d.f102923a);
            }
        });
        this.f102911n = C42745f0.U(shimmerFrameLayout, linearLayout, aVar);
    }

    public final float getRatio() {
        return this.ratio;
    }

    @l
    public final C36548k getSourceFactory() {
        return this.sourceFactory;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f102900c;
        if (rectF != null && this.f102908k.getVisibility() == 0) {
            float f12 = this.f102901d;
            canvas.drawRoundRect(rectF, f12, f12, this.f102899b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int i14 = (int) (size / this.ratio);
        int mode = View.MeasureSpec.getMode(i12);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, mode);
        this.f102910m.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f102908k.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f102909l.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(iMakeMeasureSpec, iMakeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        this.f102900c = new RectF(1.0f, 1.0f, i12 - 1, i13 - 1);
    }

    public final void setCornerRadius(@l Integer radius) {
        float fB2 = y6.b(radius != null ? radius.intValue() : 0);
        this.f102901d = fB2;
        v.a(this, fB2);
    }

    public final void setPendingPlayingState(@k BeduinVideoState pendingPlayingState) {
        this.f102902e = pendingPlayingState;
        this.f102910m.o();
    }

    public final void setRatio(float f12) {
        this.ratio = f12;
    }

    public final void setResizeMode(int mode) {
        this.f102910m.setResizeMode(mode);
    }

    public final void setSourceFactory(@l C36548k c36548k) {
        this.sourceFactory = c36548k;
    }
}
