package com.avito.android.pinch_to_zoom;

import Y61.k;
import Y61.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import z80.InterfaceC50396b;

/* compiled from: PinchToZoomViewHolderHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/pinch_to_zoom/f;", "Lcom/avito/android/pinch_to_zoom/e;", "<init>", "()V", "a", "b", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements com.avito.android.pinch_to_zoom.e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f220006f = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public b f220007b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public ViewPropertyAnimator f220008c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public z80.e f220009d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public d f220010e;

    /* compiled from: PinchToZoomViewHolderHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/pinch_to_zoom/f$a;", "", "<init>", "()V", "", "FADE_DURATION", "J", "PINCH_TO_ZOOM_ONBOARDING_DURATION", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PinchToZoomViewHolderHelper.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/pinch_to_zoom/f$b;", "", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.pinch_to_zoom.b f220011a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ImageView f220012b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ViewGroup f220013c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PinchToZoomSource f220014d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final AnimationView f220015e;

        public b(@k com.avito.android.pinch_to_zoom.b bVar, @k ImageView imageView, @k ViewGroup viewGroup, @k PinchToZoomSource pinchToZoomSource) {
            this.f220011a = bVar;
            this.f220012b = imageView;
            this.f220013c = viewGroup;
            this.f220014d = pinchToZoomSource;
            View viewFindViewById = viewGroup.findViewById(R.id.pinch_to_zoom_animation_view);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.animation.AnimationView");
            }
            this.f220015e = (AnimationView) viewFindViewById;
        }
    }

    /* compiled from: PinchToZoomViewHolderHelper.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/pinch_to_zoom/f$c", "Landroid/animation/AnimatorListenerAdapter;", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f220016a;

        public c(b bVar) {
            this.f220016a = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@k Animator animator) {
            this.f220016a.f220013c.setVisibility(8);
        }
    }

    /* compiled from: PinchToZoomViewHolderHelper.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/pinch_to_zoom/f$d", "Lz80/b;", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC50396b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f220017a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f220018b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N f220019c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(ImageView imageView, f fVar, Y41.a<Integer> aVar) {
            this.f220017a = imageView;
            this.f220018b = fVar;
            this.f220019c = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // z80.InterfaceC50396b
        public final void a(@l ImageView imageView) {
            ImageView imageView2 = this.f220017a;
            if (imageView2 == imageView) {
                imageView2.setVisibility(4);
                f fVar = this.f220018b;
                b bVar = fVar.f220007b;
                if (bVar != null) {
                    bVar.f220011a.a(bVar.f220014d);
                    if (bVar.f220013c.getVisibility() == 0) {
                        bVar.f220015e.c();
                        ViewPropertyAnimator viewPropertyAnimator = fVar.f220008c;
                        if (viewPropertyAnimator != null) {
                            viewPropertyAnimator.cancel();
                        }
                        fVar.f220008c = f.a(bVar);
                    }
                    G0 g02 = G0.f406611a;
                }
                z80.e eVar = fVar.f220009d;
                if (eVar != null) {
                    eVar.a((Integer) this.f220019c.invoke());
                }
            }
        }

        @Override // z80.InterfaceC50396b
        public final void b(@l ImageView imageView) {
            ImageView imageView2 = this.f220017a;
            if (imageView2 == imageView) {
                imageView2.setVisibility(0);
            }
        }
    }

    /* compiled from: PinchToZoomViewHolderHelper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/pinch_to_zoom/f$e", "Landroid/animation/AnimatorListenerAdapter;", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f220020a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f220021b;

        public e(b bVar, f fVar) {
            this.f220020a = bVar;
            this.f220021b = fVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@k Animator animator) {
            b bVar = this.f220020a;
            bVar.f220015e.e();
            int i12 = f.f220006f;
            f fVar = this.f220021b;
            fVar.getClass();
            fVar.f220008c = f.a(bVar).setStartDelay(2500L);
        }
    }

    static {
        new a(null);
    }

    public static ViewPropertyAnimator a(b bVar) {
        return bVar.f220013c.animate().alpha(0.0f).setDuration((long) (bVar.f220013c.getAlpha() * 300)).setListener(new c(bVar));
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final boolean Y00() {
        return this.f220007b != null;
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final void Zn() {
        b bVar = this.f220007b;
        if (bVar != null) {
            ViewGroup viewGroup = bVar.f220013c;
            viewGroup.setAlpha(0.0f);
            viewGroup.setVisibility(0);
            bVar.f220015e.c();
            z80.e eVar = this.f220009d;
            if (eVar != null) {
                eVar.b();
            }
            this.f220008c = viewGroup.animate().alpha(1.0f).setDuration(300L).setListener(new e(bVar, this));
            G0 g02 = G0.f406611a;
        }
    }

    @l
    @SuppressLint({"ClickableViewAccessibility"})
    public final void b() {
        b bVar = this.f220007b;
        if (bVar != null) {
            d dVar = this.f220010e;
            if (dVar != null) {
                bVar.f220011a.g(dVar);
                this.f220010e = null;
            }
            bVar.f220012b.setOnTouchListener(null);
            this.f220007b = null;
            G0 g02 = G0.f406611a;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void c(@k Y41.a<Integer> aVar, @k com.avito.android.pinch_to_zoom.b bVar, @k PinchToZoomSource pinchToZoomSource, @k View view, @k ImageView imageView, @k ViewGroup viewGroup) {
        b();
        d dVar = new d(imageView, this, aVar);
        bVar.f(dVar);
        this.f220010e = dVar;
        imageView.setOnTouchListener(new com.avito.android.lib.design.map.a(bVar, imageView, view, 1));
        this.f220007b = new b(bVar, imageView, viewGroup, pinchToZoomSource);
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final void p7(@k z80.e eVar) {
        throw null;
    }
}
