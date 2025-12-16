package one.me.chatscreen.videomsg;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a5h;
import defpackage.aw0;
import defpackage.bah;
import defpackage.bbd;
import defpackage.c7j;
import defpackage.cah;
import defpackage.cbh;
import defpackage.cm6;
import defpackage.cqi;
import defpackage.d53;
import defpackage.dpg;
import defpackage.dqi;
import defpackage.e8j;
import defpackage.e9h;
import defpackage.em6;
import defpackage.eo7;
import defpackage.f6j;
import defpackage.fah;
import defpackage.g2h;
import defpackage.g56;
import defpackage.gah;
import defpackage.gw0;
import defpackage.hfd;
import defpackage.ho7;
import defpackage.i84;
import defpackage.ipi;
import defpackage.j5h;
import defpackage.jah;
import defpackage.k18;
import defpackage.k7h;
import defpackage.kah;
import defpackage.kk4;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5h;
import defpackage.l6b;
import defpackage.lah;
import defpackage.lg8;
import defpackage.m1b;
import defpackage.mah;
import defpackage.nah;
import defpackage.o22;
import defpackage.o7h;
import defpackage.o8h;
import defpackage.o98;
import defpackage.oah;
import defpackage.p22;
import defpackage.pah;
import defpackage.q2b;
import defpackage.q8g;
import defpackage.q8h;
import defpackage.qah;
import defpackage.qlg;
import defpackage.sah;
import defpackage.svi;
import defpackage.t75;
import defpackage.t9f;
import defpackage.tfh;
import defpackage.toc;
import defpackage.tqi;
import defpackage.tv2;
import defpackage.u45;
import defpackage.u5h;
import defpackage.uif;
import defpackage.und;
import defpackage.uv2;
import defpackage.ve3;
import defpackage.vgd;
import defpackage.vid;
import defpackage.vnd;
import defpackage.vw4;
import defpackage.w9c;
import defpackage.wqi;
import defpackage.x26;
import defpackage.x9f;
import defpackage.x9h;
import defpackage.xfh;
import defpackage.xz7;
import defpackage.y9h;
import defpackage.yy7;
import defpackage.z2f;
import defpackage.z8a;
import defpackage.z8e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/chatscreen/videomsg/VideoMessageWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "chat-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class VideoMessageWidget extends Widget {
    public static final /* synthetic */ yy7[] H0 = {new toc(VideoMessageWidget.class, "torchButton", "getTorchButton()Landroid/widget/ImageView;", 0), ho7.d(vid.a, VideoMessageWidget.class, "timerView", "getTimerView()Landroid/widget/TextView;", 0), new toc(VideoMessageWidget.class, "cameraPreviewView", "getCameraPreviewView()Lone/me/chatscreen/videomsg/VideoMessageCameraView;", 0), new toc(VideoMessageWidget.class, "cameraSwitchButton", "getCameraSwitchButton()Landroid/widget/ImageView;", 0), new toc(VideoMessageWidget.class, "container", "getContainer()Landroid/view/ViewGroup;", 0), new z8a(VideoMessageWidget.class, "blinkingDotJob", "getBlinkingDotJob()Lkotlinx/coroutines/Job;")};
    public final vnd A0;
    public final Object B0;
    public final Object C0;
    public final Object D0;
    public AnimatorSet E0;
    public ScaleGestureDetector F0;
    public x9f G0;
    public final String X;
    public final Object Y;
    public final bbd Z;
    public final eo7 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final bah o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final t9f w0;
    public final vnd x0;
    public g2h y0;
    public final vgd z0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoMessageWidget() {
        final int i = 0;
        final int i2 = 3;
        super(null, i, i2, 0 == true ? 1 : 0);
        this.a = new eo7(0, null, 5);
        this.b = createViewModelLazy(x9h.class, new uif(9, new q8g(16)));
        k18 k18Var = tv2.a;
        uv2 uv2Var = uv2.a;
        this.c = uv2Var.getAccessor().d(48);
        this.d = uv2Var.getAccessor().d(127);
        this.o = new bah(this);
        this.X = VideoMessageWidget.class.getName();
        this.Y = ipi.b(3, new cm6(this) { // from class: z9h
            public final /* synthetic */ VideoMessageWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i3 = i;
                VideoMessageWidget videoMessageWidget = this.b;
                switch (i3) {
                    case 0:
                        yy7[] yy7VarArr = VideoMessageWidget.H0;
                        cbh cbhVar = ((z2f) videoMessageWidget.d.getValue()).get();
                        cbhVar.b(0.0f);
                        cbhVar.Q(true);
                        cbhVar.X(videoMessageWidget.o);
                        return cbhVar;
                    case 1:
                        yy7[] yy7VarArr2 = VideoMessageWidget.H0;
                        o7h o7hVar = new o7h(videoMessageWidget.getContext());
                        if (videoMessageWidget.A0().getWidth() > 0 && videoMessageWidget.A0().getHeight() > 0) {
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(videoMessageWidget.A0().getWidth(), videoMessageWidget.A0().getHeight());
                            layoutParams.gravity = 17;
                            o7hVar.setLayoutParams(layoutParams);
                        } else if (!o7hVar.isLaidOut() || o7hVar.isLayoutRequested()) {
                            o7hVar.addOnLayoutChangeListener(new pt1(videoMessageWidget, 6, o7hVar));
                        } else {
                            int iZ0 = VideoMessageWidget.z0(videoMessageWidget, (View) videoMessageWidget.C0().getParent());
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iZ0, iZ0);
                            layoutParams2.gravity = 17;
                            o7hVar.setLayoutParams(layoutParams2);
                        }
                        f8j.d(o7hVar, 300L, new pcc(26, videoMessageWidget));
                        return o7hVar;
                    case 2:
                        yy7[] yy7VarArr3 = VideoMessageWidget.H0;
                        e9h e9hVar = new e9h(videoMessageWidget.getContext());
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, kti.d(60 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 80;
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        e9hVar.setPadding(iD, iD, iD, iD);
                        e9hVar.setLayoutParams(layoutParams3);
                        tqi.c(new qlg(3, null), e9hVar);
                        e9hVar.setVisibility(8);
                        e9hVar.setFramesProvider(new ehg(13, videoMessageWidget));
                        e9hVar.setSeekListener(new ulc(11, videoMessageWidget));
                        return e9hVar;
                    case 3:
                        yy7[] yy7VarArr4 = VideoMessageWidget.H0;
                        return r34.b(videoMessageWidget.getContext(), yud.O);
                    default:
                        yy7[] yy7VarArr5 = VideoMessageWidget.H0;
                        return r34.b(videoMessageWidget.getContext(), yud.N);
                }
            }
        });
        this.Z = viewBinding(m1b.B);
        this.s0 = viewBinding(m1b.A);
        this.t0 = viewBinding(m1b.w);
        this.u0 = viewBinding(m1b.z);
        this.v0 = viewBinding(m1b.y);
        this.w0 = c7j.c();
        final int i3 = 1;
        this.x0 = e8j.b(new cm6(this) { // from class: z9h
            public final /* synthetic */ VideoMessageWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i32 = i3;
                VideoMessageWidget videoMessageWidget = this.b;
                switch (i32) {
                    case 0:
                        yy7[] yy7VarArr = VideoMessageWidget.H0;
                        cbh cbhVar = ((z2f) videoMessageWidget.d.getValue()).get();
                        cbhVar.b(0.0f);
                        cbhVar.Q(true);
                        cbhVar.X(videoMessageWidget.o);
                        return cbhVar;
                    case 1:
                        yy7[] yy7VarArr2 = VideoMessageWidget.H0;
                        o7h o7hVar = new o7h(videoMessageWidget.getContext());
                        if (videoMessageWidget.A0().getWidth() > 0 && videoMessageWidget.A0().getHeight() > 0) {
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(videoMessageWidget.A0().getWidth(), videoMessageWidget.A0().getHeight());
                            layoutParams.gravity = 17;
                            o7hVar.setLayoutParams(layoutParams);
                        } else if (!o7hVar.isLaidOut() || o7hVar.isLayoutRequested()) {
                            o7hVar.addOnLayoutChangeListener(new pt1(videoMessageWidget, 6, o7hVar));
                        } else {
                            int iZ0 = VideoMessageWidget.z0(videoMessageWidget, (View) videoMessageWidget.C0().getParent());
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iZ0, iZ0);
                            layoutParams2.gravity = 17;
                            o7hVar.setLayoutParams(layoutParams2);
                        }
                        f8j.d(o7hVar, 300L, new pcc(26, videoMessageWidget));
                        return o7hVar;
                    case 2:
                        yy7[] yy7VarArr3 = VideoMessageWidget.H0;
                        e9h e9hVar = new e9h(videoMessageWidget.getContext());
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, kti.d(60 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 80;
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        e9hVar.setPadding(iD, iD, iD, iD);
                        e9hVar.setLayoutParams(layoutParams3);
                        tqi.c(new qlg(3, null), e9hVar);
                        e9hVar.setVisibility(8);
                        e9hVar.setFramesProvider(new ehg(13, videoMessageWidget));
                        e9hVar.setSeekListener(new ulc(11, videoMessageWidget));
                        return e9hVar;
                    case 3:
                        yy7[] yy7VarArr4 = VideoMessageWidget.H0;
                        return r34.b(videoMessageWidget.getContext(), yud.O);
                    default:
                        yy7[] yy7VarArr5 = VideoMessageWidget.H0;
                        return r34.b(videoMessageWidget.getContext(), yud.N);
                }
            }
        });
        this.z0 = new vgd(10, this);
        final int i4 = 2;
        this.A0 = e8j.b(new cm6(this) { // from class: z9h
            public final /* synthetic */ VideoMessageWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i32 = i4;
                VideoMessageWidget videoMessageWidget = this.b;
                switch (i32) {
                    case 0:
                        yy7[] yy7VarArr = VideoMessageWidget.H0;
                        cbh cbhVar = ((z2f) videoMessageWidget.d.getValue()).get();
                        cbhVar.b(0.0f);
                        cbhVar.Q(true);
                        cbhVar.X(videoMessageWidget.o);
                        return cbhVar;
                    case 1:
                        yy7[] yy7VarArr2 = VideoMessageWidget.H0;
                        o7h o7hVar = new o7h(videoMessageWidget.getContext());
                        if (videoMessageWidget.A0().getWidth() > 0 && videoMessageWidget.A0().getHeight() > 0) {
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(videoMessageWidget.A0().getWidth(), videoMessageWidget.A0().getHeight());
                            layoutParams.gravity = 17;
                            o7hVar.setLayoutParams(layoutParams);
                        } else if (!o7hVar.isLaidOut() || o7hVar.isLayoutRequested()) {
                            o7hVar.addOnLayoutChangeListener(new pt1(videoMessageWidget, 6, o7hVar));
                        } else {
                            int iZ0 = VideoMessageWidget.z0(videoMessageWidget, (View) videoMessageWidget.C0().getParent());
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iZ0, iZ0);
                            layoutParams2.gravity = 17;
                            o7hVar.setLayoutParams(layoutParams2);
                        }
                        f8j.d(o7hVar, 300L, new pcc(26, videoMessageWidget));
                        return o7hVar;
                    case 2:
                        yy7[] yy7VarArr3 = VideoMessageWidget.H0;
                        e9h e9hVar = new e9h(videoMessageWidget.getContext());
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, kti.d(60 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 80;
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        e9hVar.setPadding(iD, iD, iD, iD);
                        e9hVar.setLayoutParams(layoutParams3);
                        tqi.c(new qlg(3, null), e9hVar);
                        e9hVar.setVisibility(8);
                        e9hVar.setFramesProvider(new ehg(13, videoMessageWidget));
                        e9hVar.setSeekListener(new ulc(11, videoMessageWidget));
                        return e9hVar;
                    case 3:
                        yy7[] yy7VarArr4 = VideoMessageWidget.H0;
                        return r34.b(videoMessageWidget.getContext(), yud.O);
                    default:
                        yy7[] yy7VarArr5 = VideoMessageWidget.H0;
                        return r34.b(videoMessageWidget.getContext(), yud.N);
                }
            }
        });
        this.B0 = ipi.b(3, new q8g(17));
        this.C0 = ipi.b(3, new cm6(this) { // from class: z9h
            public final /* synthetic */ VideoMessageWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i32 = i2;
                VideoMessageWidget videoMessageWidget = this.b;
                switch (i32) {
                    case 0:
                        yy7[] yy7VarArr = VideoMessageWidget.H0;
                        cbh cbhVar = ((z2f) videoMessageWidget.d.getValue()).get();
                        cbhVar.b(0.0f);
                        cbhVar.Q(true);
                        cbhVar.X(videoMessageWidget.o);
                        return cbhVar;
                    case 1:
                        yy7[] yy7VarArr2 = VideoMessageWidget.H0;
                        o7h o7hVar = new o7h(videoMessageWidget.getContext());
                        if (videoMessageWidget.A0().getWidth() > 0 && videoMessageWidget.A0().getHeight() > 0) {
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(videoMessageWidget.A0().getWidth(), videoMessageWidget.A0().getHeight());
                            layoutParams.gravity = 17;
                            o7hVar.setLayoutParams(layoutParams);
                        } else if (!o7hVar.isLaidOut() || o7hVar.isLayoutRequested()) {
                            o7hVar.addOnLayoutChangeListener(new pt1(videoMessageWidget, 6, o7hVar));
                        } else {
                            int iZ0 = VideoMessageWidget.z0(videoMessageWidget, (View) videoMessageWidget.C0().getParent());
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iZ0, iZ0);
                            layoutParams2.gravity = 17;
                            o7hVar.setLayoutParams(layoutParams2);
                        }
                        f8j.d(o7hVar, 300L, new pcc(26, videoMessageWidget));
                        return o7hVar;
                    case 2:
                        yy7[] yy7VarArr3 = VideoMessageWidget.H0;
                        e9h e9hVar = new e9h(videoMessageWidget.getContext());
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, kti.d(60 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 80;
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        e9hVar.setPadding(iD, iD, iD, iD);
                        e9hVar.setLayoutParams(layoutParams3);
                        tqi.c(new qlg(3, null), e9hVar);
                        e9hVar.setVisibility(8);
                        e9hVar.setFramesProvider(new ehg(13, videoMessageWidget));
                        e9hVar.setSeekListener(new ulc(11, videoMessageWidget));
                        return e9hVar;
                    case 3:
                        yy7[] yy7VarArr4 = VideoMessageWidget.H0;
                        return r34.b(videoMessageWidget.getContext(), yud.O);
                    default:
                        yy7[] yy7VarArr5 = VideoMessageWidget.H0;
                        return r34.b(videoMessageWidget.getContext(), yud.N);
                }
            }
        });
        final int i5 = 4;
        this.D0 = ipi.b(3, new cm6(this) { // from class: z9h
            public final /* synthetic */ VideoMessageWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i32 = i5;
                VideoMessageWidget videoMessageWidget = this.b;
                switch (i32) {
                    case 0:
                        yy7[] yy7VarArr = VideoMessageWidget.H0;
                        cbh cbhVar = ((z2f) videoMessageWidget.d.getValue()).get();
                        cbhVar.b(0.0f);
                        cbhVar.Q(true);
                        cbhVar.X(videoMessageWidget.o);
                        return cbhVar;
                    case 1:
                        yy7[] yy7VarArr2 = VideoMessageWidget.H0;
                        o7h o7hVar = new o7h(videoMessageWidget.getContext());
                        if (videoMessageWidget.A0().getWidth() > 0 && videoMessageWidget.A0().getHeight() > 0) {
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(videoMessageWidget.A0().getWidth(), videoMessageWidget.A0().getHeight());
                            layoutParams.gravity = 17;
                            o7hVar.setLayoutParams(layoutParams);
                        } else if (!o7hVar.isLaidOut() || o7hVar.isLayoutRequested()) {
                            o7hVar.addOnLayoutChangeListener(new pt1(videoMessageWidget, 6, o7hVar));
                        } else {
                            int iZ0 = VideoMessageWidget.z0(videoMessageWidget, (View) videoMessageWidget.C0().getParent());
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iZ0, iZ0);
                            layoutParams2.gravity = 17;
                            o7hVar.setLayoutParams(layoutParams2);
                        }
                        f8j.d(o7hVar, 300L, new pcc(26, videoMessageWidget));
                        return o7hVar;
                    case 2:
                        yy7[] yy7VarArr3 = VideoMessageWidget.H0;
                        e9h e9hVar = new e9h(videoMessageWidget.getContext());
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, kti.d(60 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 80;
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        e9hVar.setPadding(iD, iD, iD, iD);
                        e9hVar.setLayoutParams(layoutParams3);
                        tqi.c(new qlg(3, null), e9hVar);
                        e9hVar.setVisibility(8);
                        e9hVar.setFramesProvider(new ehg(13, videoMessageWidget));
                        e9hVar.setSeekListener(new ulc(11, videoMessageWidget));
                        return e9hVar;
                    case 3:
                        yy7[] yy7VarArr4 = VideoMessageWidget.H0;
                        return r34.b(videoMessageWidget.getContext(), yud.O);
                    default:
                        yy7[] yy7VarArr5 = VideoMessageWidget.H0;
                        return r34.b(videoMessageWidget.getContext(), yud.N);
                }
            }
        });
    }

    public static final void y0(VideoMessageWidget videoMessageWidget, FrameLayout frameLayout, int i, em6 em6Var) {
        View imageView = new ImageView(frameLayout.getContext());
        float f = 40;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        layoutParams.leftMargin = i;
        layoutParams.bottomMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        imageView.setLayoutParams(layoutParams);
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        imageView.setPadding(iD, iD, iD, iD);
        tqi.c(new z8e(videoMessageWidget, (Continuation) null, 8), imageView);
        em6Var.invoke(imageView);
        frameLayout.addView(imageView);
    }

    public static final int z0(VideoMessageWidget videoMessageWidget, View view) {
        float f = 16;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f) * 2;
        int iB = f6j.b(videoMessageWidget.getContext()) - iD;
        int iC = u45.c(f, vw4.d().getDisplayMetrics().density, kti.d(40 * vw4.d().getDisplayMetrics().density));
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        int i = 0;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            }
        }
        int iMin = Math.min(iB, ((((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - i) - iC) - iD);
        return iMin == 0 ? kti.d(352 * vw4.d().getDisplayMetrics().density) : iMin;
    }

    public final l5h A0() {
        return (l5h) this.t0.D(this, H0[2]);
    }

    public final ImageView B0() {
        return (ImageView) this.u0.D(this, H0[3]);
    }

    public final ViewGroup C0() {
        return (ViewGroup) this.v0.D(this, H0[4]);
    }

    public final TextView D0() {
        return (TextView) this.s0.D(this, H0[1]);
    }

    public final ImageView E0() {
        return (ImageView) this.Z.D(this, H0[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final cbh F0() {
        return (cbh) this.Y.getValue();
    }

    public final x9h G0() {
        return (x9h) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void H0() {
        if (this.Y.e()) {
            if (F0().a() == 1.0f) {
                xfh.r(G0().s0, u5h.a);
            }
            F0().pause();
        }
        vnd vndVar = this.x0;
        if (vndVar.e()) {
            ((o7h) vndVar.getValue()).setVisibility(8);
        }
        vnd vndVar2 = this.A0;
        if (vndVar2.e()) {
            ((e9h) vndVar2.getValue()).setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, k18] */
    public final void I0(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.E0;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.E0;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.E0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.E0 = new AnimatorSet();
        A0().setVisibility(0);
        o98 o98VarD = ve3.d();
        if (z) {
            o98VarD.add(cqi.b(E0(), View.ALPHA, E0().getAlpha(), 1.0f, 200L, 0L, 112));
        }
        if (B0().getVisibility() != 0) {
            o98VarD.add(cqi.b(B0(), View.ALPHA, B0().getAlpha(), 1.0f, 200L, 0L, 112));
        }
        if (z2) {
            o98VarD.add(cqi.b(D0(), View.ALPHA, D0().getAlpha(), 1.0f, 200L, 0L, 112));
        }
        o98 o98VarA = ve3.a(o98VarD);
        AnimatorSet animatorSet4 = this.E0;
        if (animatorSet4 != null) {
            animatorSet4.playTogether(o98VarA);
        }
        AnimatorSet animatorSet5 = this.E0;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new sah(this, z, z2));
        }
        AnimatorSet animatorSet6 = this.E0;
        if (animatorSet6 != null) {
            animatorSet6.start();
        }
        View view = getView();
        this.w0.O(this, H0[5], svi.e(view != null ? tfh.b(view) : getLifecycleScope(), null, null, new a5h(((InsetDrawable) this.B0.getValue()).mutate(), null), 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void J0() {
        if (this.Y.e()) {
            x9f x9fVar = this.G0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            this.G0 = null;
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        boolean z = this.y0 != null && this.Y.e() && F0().y0();
        if (getView() == null || !z) {
            return;
        }
        vnd vndVar = this.x0;
        if (dqi.r(vndVar)) {
            if (vndVar.e()) {
                ((o7h) vndVar.getValue()).a.a(this.z0);
            }
            F0().play();
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onActivityStopped(Activity activity) {
        ((q8h) G0().b).D.m(null, Boolean.FALSE);
        super.onActivityStopped(activity);
        if (getView() == null || this.y0 == null || !this.Y.e()) {
            return;
        }
        cbh cbhVarF0 = F0();
        cbhVarF0.pause();
        cbhVarF0.a0(null);
        vnd vndVar = this.x0;
        if (vndVar.e()) {
            ((o7h) vndVar.getValue()).a.b();
        }
    }

    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(m1b.y);
        frameLayout.setOnTouchListener(gah.b);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        l5h l5hVar = new l5h(frameLayout.getContext());
        l5hVar.setId(m1b.w);
        l5hVar.setZoomListener(new y9h(this, 1));
        l5hVar.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        frameLayout.addView(l5hVar);
        Continuation continuation = null;
        tqi.c(new qlg(l5hVar, continuation, 4), frameLayout);
        y0(this, frameLayout, kti.d(16 * vw4.d().getDisplayMetrics().density), new jah(this, 0));
        y0(this, frameLayout, kti.d(72 * vw4.d().getDisplayMetrics().density), new jah(this, 1));
        TextView textView = new TextView(frameLayout.getContext());
        textView.setId(m1b.A);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((InsetDrawable) this.B0.getValue(), (Drawable) null, (Drawable) null, (Drawable) null);
        dpg.l.b(textView, t75.b);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 6.0f);
        textView.setBackground(gradientDrawable);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), kti.d(8 * vw4.d().getDisplayMetrics().density), textView.getPaddingBottom());
        textView.setVisibility(8);
        tqi.c(new qlg(this, continuation, 6), textView);
        frameLayout.addView(textView);
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroy() {
        super.onDestroy();
        if (this.Y.e()) {
            cbh cbhVarF0 = F0();
            cbhVarF0.pause();
            cbhVarF0.a0(null);
            cbhVarF0.C(this.o);
            cbhVarF0.stop();
            ((z2f) this.d.getValue()).a(F0());
            und undVar = ((z2f) this.d.getValue()).i;
            if (undVar.e()) {
                ((cbh) undVar.getValue()).release();
                undVar.reset();
            }
        }
        q8h q8hVar = (q8h) G0().b;
        String str = q8hVar.h;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "VideoMessage Recording. Release all", null);
            }
        }
        q8hVar.v.setValue(null);
        if (q8hVar.j.e()) {
            ((k7h) q8hVar.j.getValue()).f();
        }
        p22 p22Var = q8hVar.H;
        if (p22Var != null) {
            p22Var.a(new o22(p22Var, 1));
        }
        q8hVar.H = null;
        q8hVar.D.m(null, Boolean.FALSE);
        q8hVar.n = null;
        w9c w9cVar = q8hVar.f;
        if (w9cVar != null) {
            w9cVar.f();
        }
        q8hVar.f = null;
        q8hVar.p = null;
        q8hVar.o = null;
        q8hVar.l = null;
        j5h j5hVar = q8hVar.m;
        if (j5hVar != null) {
            j5hVar.e.release();
        }
        q8hVar.m = null;
        q8hVar.I.compareAndSet(true, false);
        q8hVar.J.O(q8hVar, q8h.M[0], null);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        Bitmap frameAsBitmap = A0().getFrameAsBitmap();
        if (frameAsBitmap != null) {
            q8h q8hVar = (q8h) G0().b;
            q8hVar.K.O(q8hVar, q8h.M[1], svi.d(q8hVar.i, ((q2b) q8hVar.q()).a(), i84.b, new o8h(q8hVar, frameAsBitmap, null)));
        }
        ((q8h) G0().b).r = null;
        this.y0 = null;
        if (this.Y.e()) {
            cbh cbhVarF0 = F0();
            cbhVarF0.pause();
            cbhVarF0.a0(null);
            cbhVarF0.C(this.o);
        }
        vnd vndVar = this.x0;
        if (vndVar.e()) {
            ((o7h) vndVar.getValue()).a.b();
        }
        kk4 kk4Var = kk4.B0;
        vndVar.b = kk4Var;
        this.A0.b = kk4Var;
        AnimatorSet animatorSet = this.E0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.F0 = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        svi.e(getViewLifecycleScope(), null, null, new fah(view, null, this), 3);
        this.F0 = new ScaleGestureDetector(getContext(), new cah(this));
        x26 previewStreamState = A0().getPreviewStreamState();
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(previewStreamState, l48VarP, l38Var), new kah(null, this), 1), getViewLifecycleScope());
        A0().setZoomListener(new y9h(this, 0));
        gw0.w(new g56(aw0.a(G0().A0, getViewLifecycleOwner().p(), l38Var), new lah(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(G0().w0, 12), getViewLifecycleOwner().p(), l38Var), new mah(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(G0().Y, getViewLifecycleOwner().p(), l38Var), new nah(null, this), 1), getViewLifecycleScope());
        ((q8h) G0().b).r = new hfd(11, this);
        gw0.w(new g56(aw0.a(new d53(xz7.f, 8), getViewLifecycleOwner().p(), l38Var), new oah(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(G0().Z, getViewLifecycleOwner().p(), l38Var), new pah(view, null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(G0().s0, getViewLifecycleOwner().p(), l38Var), new qah(null, this), 1), getViewLifecycleScope());
    }
}
