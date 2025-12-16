package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.mediabar.MediaBarWidget;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* loaded from: classes2.dex */
public final class ytc extends FrameLayout {
    public static final float G0 = vw4.d().getDisplayMetrics().density * 24.0f;
    public final f8b A0;
    public final f8b B0;
    public final FrameLayout C0;
    public final Object D0;
    public final Object E0;
    public final Object F0;
    public final FloatEvaluator a;
    public boolean b;
    public ValueAnimator c;
    public buc d;
    public ExecutorService o;
    public x6i s0;
    public final CameraxCameraApiView t0;
    public final AppCompatImageView u0;
    public final f8b v0;
    public final Chronometer w0;
    public final LinearLayout x0;
    public final f8b y0;
    public final g12 z0;

    public ytc(Context context) {
        super(context, null, 0, 0);
        this.a = new FloatEvaluator();
        CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(context, null, 14);
        cameraxCameraApiView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.t0 = cameraxCameraApiView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        v1a v1aVar = a93.s0;
        v1aVar.y(appCompatImageView).getIcon();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        appCompatImageView.setImageResource(ivd.G);
        this.u0 = appCompatImageView;
        f8b f8bVar = new f8b(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388659);
        float f = 12;
        float f2 = 6;
        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        f8bVar.setLayoutParams(layoutParams);
        c8b c8bVar = c8b.b;
        f8bVar.setMode(c8bVar);
        int i = ivd.P;
        float f3 = G0;
        f8bVar.a(f3, i, "M12 10.586L5.734 4.32c-0.39-0.39-1.024-0.39-1.414 0-0.39 0.39-0.39 1.023 0 1.414L10.586 12 4.32 18.266c-0.39 0.39-0.39 1.024 0 1.414 0.39 0.39 1.023 0.39 1.414 0L12 13.414l6.266 6.266c0.39 0.39 1.024 0.39 1.414 0 0.39-0.39 0.39-1.024 0-1.414L13.414 12l6.266-6.266c0.39-0.39 0.39-1.023 0-1.414-0.39-0.39-1.024-0.39-1.414 0L12 10.586z");
        final int i2 = 0;
        f8j.d(f8bVar, 300L, new View.OnClickListener(this) { // from class: stc
            public final /* synthetic */ ytc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                i02 i02Var;
                Object value2;
                Object obj;
                int i3 = i2;
                boolean z = false;
                mtc mtcVar = mtc.a;
                ytc ytcVar = this.b;
                switch (i3) {
                    case 0:
                        x6i x6iVar = ytcVar.s0;
                        if (x6iVar != null) {
                            p12 p12Var = (p12) x6iVar.b;
                            int i4 = p12.z0;
                            p12Var.a(false, true);
                            o12 listener = p12Var.getListener();
                            if (listener != null) {
                                gda.g(((MediaBarWidget) listener).d, f1e.CHAT_ATTACH_PICKER);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        buc bucVar = ytcVar.d;
                        tcf tcfVar = (bucVar != null ? bucVar : null).u0;
                        do {
                            value = tcfVar.getValue();
                            int iOrdinal = ((i02) value).ordinal();
                            if (iOrdinal == 0) {
                                i02Var = i02.b;
                            } else if (iOrdinal != 1) {
                                i02Var = i02.a;
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i02Var = i02.c;
                            }
                        } while (!tcfVar.c(value, i02Var));
                        return;
                    case 2:
                        buc bucVar2 = ytcVar.d;
                        if (bucVar2 == null) {
                            bucVar2 = null;
                        }
                        ci5 ci5Var = bucVar2.v0;
                        tcf tcfVar2 = bucVar2.t0;
                        wqi.c("QuickCameraViewModel", "onClickTake(). State: " + tcfVar2.getValue(), new Object[0]);
                        ntc ntcVar = (ntc) tcfVar2.getValue();
                        if (ntcVar instanceof jtc) {
                            tcfVar2.m(null, ktc.a);
                            gu5 gu5Var = (gu5) bucVar2.s0;
                            xfh.r(ci5Var, new gtc(((s65) gu5Var.F.D(gu5Var, gu5.S[20])).a));
                            return;
                        } else {
                            if (ntcVar instanceof ktc) {
                                return;
                            }
                            if (!(ntcVar instanceof mtc)) {
                                if (!(ntcVar instanceof ltc)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tcfVar2.m(null, mtcVar);
                                xfh.r(ci5Var, ftc.a);
                                return;
                            }
                            if (!bucVar2.x0.l()) {
                                xfh.r(bucVar2.w0, ptc.a);
                                return;
                            } else {
                                tcfVar2.m(null, new ltc(SystemClock.elapsedRealtime()));
                                xfh.r(ci5Var, new etc(((iz5) bucVar2.o).l(bucVar2.X.c())));
                                return;
                            }
                        }
                    case 3:
                        j02 cameraApi = ytcVar.getCameraApi();
                        o38 o38Var = ((CameraxCameraApiView) ytcVar.getCameraApi()).c;
                        o38Var.getClass();
                        jei.b();
                        n38 n38Var = o38Var.p;
                        yod yodVar = n38Var != null ? n38Var.c.B0 : null;
                        if (yodVar != null && yodVar.a.h() == 0) {
                            z = true;
                        }
                        ((CameraxCameraApiView) cameraApi).c.l(!z ? f32.b : f32.c);
                        return;
                    default:
                        buc bucVar3 = ytcVar.d;
                        tcf tcfVar3 = (bucVar3 != null ? bucVar3 : null).t0;
                        do {
                            value2 = tcfVar3.getValue();
                            obj = (ntc) value2;
                            if (obj instanceof jtc) {
                                obj = mtcVar;
                            } else if (obj instanceof mtc) {
                                obj = jtc.a;
                            } else if (!(obj instanceof ltc) && !(obj instanceof ktc)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!tcfVar3.c(value2, obj));
                        return;
                }
            }
        });
        this.v0 = f8bVar;
        Chronometer chronometer = new Chronometer(context);
        v1aVar.y(chronometer).getText();
        chronometer.setTextColor(-1);
        this.w0 = chronometer;
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 1);
        float f4 = 16;
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, kti.d(vw4.d().getDisplayMetrics().density * f4), ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setOrientation(0);
        linearLayout.setVerticalGravity(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 12.0f);
        cei.k(gradientDrawable, v1aVar.y(linearLayout).b().g);
        linearLayout.setBackground(gradientDrawable);
        int iD = kti.d(f4 * vw4.d().getDisplayMetrics().density);
        float f5 = 8;
        linearLayout.setPadding(iD, kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f5));
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f));
        layoutParams3.setMargins(((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, kti.d(f5 * vw4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
        appCompatImageView2.setLayoutParams(layoutParams3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        cei.k(gradientDrawable2, v1aVar.y(appCompatImageView2).e().a);
        gradientDrawable2.setCornerRadius(vw4.d().getDisplayMetrics().density * 6.0f);
        appCompatImageView2.setImageDrawable(gradientDrawable2);
        linearLayout.addView(appCompatImageView2);
        linearLayout.addView(chronometer);
        this.x0 = linearLayout;
        f8b f8bVar2 = new f8b(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams4.setMargins(kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
        f8bVar2.setLayoutParams(layoutParams4);
        f8bVar2.setMode(c8bVar);
        final int i3 = 1;
        f8j.d(f8bVar2, 300L, new View.OnClickListener(this) { // from class: stc
            public final /* synthetic */ ytc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                i02 i02Var;
                Object value2;
                Object obj;
                int i32 = i3;
                boolean z = false;
                mtc mtcVar = mtc.a;
                ytc ytcVar = this.b;
                switch (i32) {
                    case 0:
                        x6i x6iVar = ytcVar.s0;
                        if (x6iVar != null) {
                            p12 p12Var = (p12) x6iVar.b;
                            int i4 = p12.z0;
                            p12Var.a(false, true);
                            o12 listener = p12Var.getListener();
                            if (listener != null) {
                                gda.g(((MediaBarWidget) listener).d, f1e.CHAT_ATTACH_PICKER);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        buc bucVar = ytcVar.d;
                        tcf tcfVar = (bucVar != null ? bucVar : null).u0;
                        do {
                            value = tcfVar.getValue();
                            int iOrdinal = ((i02) value).ordinal();
                            if (iOrdinal == 0) {
                                i02Var = i02.b;
                            } else if (iOrdinal != 1) {
                                i02Var = i02.a;
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i02Var = i02.c;
                            }
                        } while (!tcfVar.c(value, i02Var));
                        return;
                    case 2:
                        buc bucVar2 = ytcVar.d;
                        if (bucVar2 == null) {
                            bucVar2 = null;
                        }
                        ci5 ci5Var = bucVar2.v0;
                        tcf tcfVar2 = bucVar2.t0;
                        wqi.c("QuickCameraViewModel", "onClickTake(). State: " + tcfVar2.getValue(), new Object[0]);
                        ntc ntcVar = (ntc) tcfVar2.getValue();
                        if (ntcVar instanceof jtc) {
                            tcfVar2.m(null, ktc.a);
                            gu5 gu5Var = (gu5) bucVar2.s0;
                            xfh.r(ci5Var, new gtc(((s65) gu5Var.F.D(gu5Var, gu5.S[20])).a));
                            return;
                        } else {
                            if (ntcVar instanceof ktc) {
                                return;
                            }
                            if (!(ntcVar instanceof mtc)) {
                                if (!(ntcVar instanceof ltc)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tcfVar2.m(null, mtcVar);
                                xfh.r(ci5Var, ftc.a);
                                return;
                            }
                            if (!bucVar2.x0.l()) {
                                xfh.r(bucVar2.w0, ptc.a);
                                return;
                            } else {
                                tcfVar2.m(null, new ltc(SystemClock.elapsedRealtime()));
                                xfh.r(ci5Var, new etc(((iz5) bucVar2.o).l(bucVar2.X.c())));
                                return;
                            }
                        }
                    case 3:
                        j02 cameraApi = ytcVar.getCameraApi();
                        o38 o38Var = ((CameraxCameraApiView) ytcVar.getCameraApi()).c;
                        o38Var.getClass();
                        jei.b();
                        n38 n38Var = o38Var.p;
                        yod yodVar = n38Var != null ? n38Var.c.B0 : null;
                        if (yodVar != null && yodVar.a.h() == 0) {
                            z = true;
                        }
                        ((CameraxCameraApiView) cameraApi).c.l(!z ? f32.b : f32.c);
                        return;
                    default:
                        buc bucVar3 = ytcVar.d;
                        tcf tcfVar3 = (bucVar3 != null ? bucVar3 : null).t0;
                        do {
                            value2 = tcfVar3.getValue();
                            obj = (ntc) value2;
                            if (obj instanceof jtc) {
                                obj = mtcVar;
                            } else if (obj instanceof mtc) {
                                obj = jtc.a;
                            } else if (!(obj instanceof ltc) && !(obj instanceof ktc)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!tcfVar3.c(value2, obj));
                        return;
                }
            }
        });
        this.y0 = f8bVar2;
        g12 g12Var = new g12(context);
        float f6 = 72;
        g12Var.setLayoutParams(new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f6), kti.d(f6 * vw4.d().getDisplayMetrics().density), 17));
        final int i4 = 2;
        f8j.d(g12Var, 300L, new View.OnClickListener(this) { // from class: stc
            public final /* synthetic */ ytc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                i02 i02Var;
                Object value2;
                Object obj;
                int i32 = i4;
                boolean z = false;
                mtc mtcVar = mtc.a;
                ytc ytcVar = this.b;
                switch (i32) {
                    case 0:
                        x6i x6iVar = ytcVar.s0;
                        if (x6iVar != null) {
                            p12 p12Var = (p12) x6iVar.b;
                            int i42 = p12.z0;
                            p12Var.a(false, true);
                            o12 listener = p12Var.getListener();
                            if (listener != null) {
                                gda.g(((MediaBarWidget) listener).d, f1e.CHAT_ATTACH_PICKER);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        buc bucVar = ytcVar.d;
                        tcf tcfVar = (bucVar != null ? bucVar : null).u0;
                        do {
                            value = tcfVar.getValue();
                            int iOrdinal = ((i02) value).ordinal();
                            if (iOrdinal == 0) {
                                i02Var = i02.b;
                            } else if (iOrdinal != 1) {
                                i02Var = i02.a;
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i02Var = i02.c;
                            }
                        } while (!tcfVar.c(value, i02Var));
                        return;
                    case 2:
                        buc bucVar2 = ytcVar.d;
                        if (bucVar2 == null) {
                            bucVar2 = null;
                        }
                        ci5 ci5Var = bucVar2.v0;
                        tcf tcfVar2 = bucVar2.t0;
                        wqi.c("QuickCameraViewModel", "onClickTake(). State: " + tcfVar2.getValue(), new Object[0]);
                        ntc ntcVar = (ntc) tcfVar2.getValue();
                        if (ntcVar instanceof jtc) {
                            tcfVar2.m(null, ktc.a);
                            gu5 gu5Var = (gu5) bucVar2.s0;
                            xfh.r(ci5Var, new gtc(((s65) gu5Var.F.D(gu5Var, gu5.S[20])).a));
                            return;
                        } else {
                            if (ntcVar instanceof ktc) {
                                return;
                            }
                            if (!(ntcVar instanceof mtc)) {
                                if (!(ntcVar instanceof ltc)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tcfVar2.m(null, mtcVar);
                                xfh.r(ci5Var, ftc.a);
                                return;
                            }
                            if (!bucVar2.x0.l()) {
                                xfh.r(bucVar2.w0, ptc.a);
                                return;
                            } else {
                                tcfVar2.m(null, new ltc(SystemClock.elapsedRealtime()));
                                xfh.r(ci5Var, new etc(((iz5) bucVar2.o).l(bucVar2.X.c())));
                                return;
                            }
                        }
                    case 3:
                        j02 cameraApi = ytcVar.getCameraApi();
                        o38 o38Var = ((CameraxCameraApiView) ytcVar.getCameraApi()).c;
                        o38Var.getClass();
                        jei.b();
                        n38 n38Var = o38Var.p;
                        yod yodVar = n38Var != null ? n38Var.c.B0 : null;
                        if (yodVar != null && yodVar.a.h() == 0) {
                            z = true;
                        }
                        ((CameraxCameraApiView) cameraApi).c.l(!z ? f32.b : f32.c);
                        return;
                    default:
                        buc bucVar3 = ytcVar.d;
                        tcf tcfVar3 = (bucVar3 != null ? bucVar3 : null).t0;
                        do {
                            value2 = tcfVar3.getValue();
                            obj = (ntc) value2;
                            if (obj instanceof jtc) {
                                obj = mtcVar;
                            } else if (obj instanceof mtc) {
                                obj = jtc.a;
                            } else if (!(obj instanceof ltc) && !(obj instanceof ktc)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!tcfVar3.c(value2, obj));
                        return;
                }
            }
        });
        this.z0 = g12Var;
        f8b f8bVar3 = new f8b(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2, 17);
        float f7 = 90;
        layoutParams5.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f7), ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin);
        f8bVar3.setLayoutParams(layoutParams5);
        f8bVar3.setMode(c8bVar);
        f8bVar3.a(f3, ivd.E0, "M16.472 8C15.374 6.772 13.777 6 12 6c-2.974 0-5.443 2.164-5.918 5.004C5.992 11.55 5.552 12 5 12s-1.006-0.45-0.938-0.998C4.552 7.055 7.92 4 12 4c2.39 0 4.534 1.047 6 2.708V5c0-0.552 0.448-1 1-1s1 0.448 1 1v4c0 0.552-0.448 1-1 1h-4c-0.552 0-1-0.448-1-1s0.448-1 1-1h1.472zM10 15c0-0.552-0.448-1-1-1H5c-0.552 0-1 0.448-1 1v4c0 0.552 0.448 1 1 1s1-0.448 1-1v-1.708C7.466 18.952 9.61 20 12 20c4.08 0 7.447-3.055 7.938-7.002C20.007 12.45 19.552 12 19 12c-0.552 0-0.991 0.451-1.082 0.996C17.443 15.836 14.975 18 12 18c-1.777 0-3.374-0.773-4.472-2H9c0.552 0 1-0.448 1-1z");
        final int i5 = 3;
        f8j.d(f8bVar3, 300L, new View.OnClickListener(this) { // from class: stc
            public final /* synthetic */ ytc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                i02 i02Var;
                Object value2;
                Object obj;
                int i32 = i5;
                boolean z = false;
                mtc mtcVar = mtc.a;
                ytc ytcVar = this.b;
                switch (i32) {
                    case 0:
                        x6i x6iVar = ytcVar.s0;
                        if (x6iVar != null) {
                            p12 p12Var = (p12) x6iVar.b;
                            int i42 = p12.z0;
                            p12Var.a(false, true);
                            o12 listener = p12Var.getListener();
                            if (listener != null) {
                                gda.g(((MediaBarWidget) listener).d, f1e.CHAT_ATTACH_PICKER);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        buc bucVar = ytcVar.d;
                        tcf tcfVar = (bucVar != null ? bucVar : null).u0;
                        do {
                            value = tcfVar.getValue();
                            int iOrdinal = ((i02) value).ordinal();
                            if (iOrdinal == 0) {
                                i02Var = i02.b;
                            } else if (iOrdinal != 1) {
                                i02Var = i02.a;
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i02Var = i02.c;
                            }
                        } while (!tcfVar.c(value, i02Var));
                        return;
                    case 2:
                        buc bucVar2 = ytcVar.d;
                        if (bucVar2 == null) {
                            bucVar2 = null;
                        }
                        ci5 ci5Var = bucVar2.v0;
                        tcf tcfVar2 = bucVar2.t0;
                        wqi.c("QuickCameraViewModel", "onClickTake(). State: " + tcfVar2.getValue(), new Object[0]);
                        ntc ntcVar = (ntc) tcfVar2.getValue();
                        if (ntcVar instanceof jtc) {
                            tcfVar2.m(null, ktc.a);
                            gu5 gu5Var = (gu5) bucVar2.s0;
                            xfh.r(ci5Var, new gtc(((s65) gu5Var.F.D(gu5Var, gu5.S[20])).a));
                            return;
                        } else {
                            if (ntcVar instanceof ktc) {
                                return;
                            }
                            if (!(ntcVar instanceof mtc)) {
                                if (!(ntcVar instanceof ltc)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tcfVar2.m(null, mtcVar);
                                xfh.r(ci5Var, ftc.a);
                                return;
                            }
                            if (!bucVar2.x0.l()) {
                                xfh.r(bucVar2.w0, ptc.a);
                                return;
                            } else {
                                tcfVar2.m(null, new ltc(SystemClock.elapsedRealtime()));
                                xfh.r(ci5Var, new etc(((iz5) bucVar2.o).l(bucVar2.X.c())));
                                return;
                            }
                        }
                    case 3:
                        j02 cameraApi = ytcVar.getCameraApi();
                        o38 o38Var = ((CameraxCameraApiView) ytcVar.getCameraApi()).c;
                        o38Var.getClass();
                        jei.b();
                        n38 n38Var = o38Var.p;
                        yod yodVar = n38Var != null ? n38Var.c.B0 : null;
                        if (yodVar != null && yodVar.a.h() == 0) {
                            z = true;
                        }
                        ((CameraxCameraApiView) cameraApi).c.l(!z ? f32.b : f32.c);
                        return;
                    default:
                        buc bucVar3 = ytcVar.d;
                        tcf tcfVar3 = (bucVar3 != null ? bucVar3 : null).t0;
                        do {
                            value2 = tcfVar3.getValue();
                            obj = (ntc) value2;
                            if (obj instanceof jtc) {
                                obj = mtcVar;
                            } else if (obj instanceof mtc) {
                                obj = jtc.a;
                            } else if (!(obj instanceof ltc) && !(obj instanceof ktc)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!tcfVar3.c(value2, obj));
                        return;
                }
            }
        });
        this.A0 = f8bVar3;
        f8b f8bVar4 = new f8b(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams6.setMargins(((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin, kti.d(vw4.d().getDisplayMetrics().density * f7), ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin);
        f8bVar4.setLayoutParams(layoutParams6);
        f8bVar4.setMode(c8bVar);
        final int i6 = 4;
        f8j.d(f8bVar4, 300L, new View.OnClickListener(this) { // from class: stc
            public final /* synthetic */ ytc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                i02 i02Var;
                Object value2;
                Object obj;
                int i32 = i6;
                boolean z = false;
                mtc mtcVar = mtc.a;
                ytc ytcVar = this.b;
                switch (i32) {
                    case 0:
                        x6i x6iVar = ytcVar.s0;
                        if (x6iVar != null) {
                            p12 p12Var = (p12) x6iVar.b;
                            int i42 = p12.z0;
                            p12Var.a(false, true);
                            o12 listener = p12Var.getListener();
                            if (listener != null) {
                                gda.g(((MediaBarWidget) listener).d, f1e.CHAT_ATTACH_PICKER);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        buc bucVar = ytcVar.d;
                        tcf tcfVar = (bucVar != null ? bucVar : null).u0;
                        do {
                            value = tcfVar.getValue();
                            int iOrdinal = ((i02) value).ordinal();
                            if (iOrdinal == 0) {
                                i02Var = i02.b;
                            } else if (iOrdinal != 1) {
                                i02Var = i02.a;
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i02Var = i02.c;
                            }
                        } while (!tcfVar.c(value, i02Var));
                        return;
                    case 2:
                        buc bucVar2 = ytcVar.d;
                        if (bucVar2 == null) {
                            bucVar2 = null;
                        }
                        ci5 ci5Var = bucVar2.v0;
                        tcf tcfVar2 = bucVar2.t0;
                        wqi.c("QuickCameraViewModel", "onClickTake(). State: " + tcfVar2.getValue(), new Object[0]);
                        ntc ntcVar = (ntc) tcfVar2.getValue();
                        if (ntcVar instanceof jtc) {
                            tcfVar2.m(null, ktc.a);
                            gu5 gu5Var = (gu5) bucVar2.s0;
                            xfh.r(ci5Var, new gtc(((s65) gu5Var.F.D(gu5Var, gu5.S[20])).a));
                            return;
                        } else {
                            if (ntcVar instanceof ktc) {
                                return;
                            }
                            if (!(ntcVar instanceof mtc)) {
                                if (!(ntcVar instanceof ltc)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tcfVar2.m(null, mtcVar);
                                xfh.r(ci5Var, ftc.a);
                                return;
                            }
                            if (!bucVar2.x0.l()) {
                                xfh.r(bucVar2.w0, ptc.a);
                                return;
                            } else {
                                tcfVar2.m(null, new ltc(SystemClock.elapsedRealtime()));
                                xfh.r(ci5Var, new etc(((iz5) bucVar2.o).l(bucVar2.X.c())));
                                return;
                            }
                        }
                    case 3:
                        j02 cameraApi = ytcVar.getCameraApi();
                        o38 o38Var = ((CameraxCameraApiView) ytcVar.getCameraApi()).c;
                        o38Var.getClass();
                        jei.b();
                        n38 n38Var = o38Var.p;
                        yod yodVar = n38Var != null ? n38Var.c.B0 : null;
                        if (yodVar != null && yodVar.a.h() == 0) {
                            z = true;
                        }
                        ((CameraxCameraApiView) cameraApi).c.l(!z ? f32.b : f32.c);
                        return;
                    default:
                        buc bucVar3 = ytcVar.d;
                        tcf tcfVar3 = (bucVar3 != null ? bucVar3 : null).t0;
                        do {
                            value2 = tcfVar3.getValue();
                            obj = (ntc) value2;
                            if (obj instanceof jtc) {
                                obj = mtcVar;
                            } else if (obj instanceof mtc) {
                                obj = jtc.a;
                            } else if (!(obj instanceof ltc) && !(obj instanceof ktc)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!tcfVar3.c(value2, obj));
                        return;
                }
            }
        });
        this.B0 = f8bVar4;
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams7.setMargins(((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin, kti.d(64 * vw4.d().getDisplayMetrics().density));
        frameLayout.setLayoutParams(layoutParams7);
        frameLayout.addView(f8bVar4);
        frameLayout.addView(g12Var);
        frameLayout.addView(f8bVar3);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.addView(f8bVar);
        frameLayout2.addView(linearLayout);
        frameLayout2.addView(f8bVar2);
        frameLayout2.addView(frameLayout);
        zfi.b(frameLayout2, new eo7(3, new ms0(3, 3, false), 5), null);
        this.C0 = frameLayout2;
        final int i7 = 0;
        this.D0 = ipi.b(3, new cm6(this) { // from class: ttc
            public final /* synthetic */ ytc b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return r34.b(this.b.getContext(), ivd.l0).mutate();
                    case 1:
                        return r34.b(this.b.getContext(), ivd.k0).mutate();
                    default:
                        return r34.b(this.b.getContext(), ivd.m0).mutate();
                }
            }
        });
        final int i8 = 1;
        this.E0 = ipi.b(3, new cm6(this) { // from class: ttc
            public final /* synthetic */ ytc b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return r34.b(this.b.getContext(), ivd.l0).mutate();
                    case 1:
                        return r34.b(this.b.getContext(), ivd.k0).mutate();
                    default:
                        return r34.b(this.b.getContext(), ivd.m0).mutate();
                }
            }
        });
        final int i9 = 2;
        this.F0 = ipi.b(3, new cm6(this) { // from class: ttc
            public final /* synthetic */ ytc b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return r34.b(this.b.getContext(), ivd.l0).mutate();
                    case 1:
                        return r34.b(this.b.getContext(), ivd.k0).mutate();
                    default:
                        return r34.b(this.b.getContext(), ivd.m0).mutate();
                }
            }
        });
        addView(cameraxCameraApiView);
        addView(appCompatImageView);
        addView(frameLayout2);
        setBackgroundColor(-16777216);
    }

    public static final void b(ytc ytcVar, i02 i02Var) {
        Drawable flashOffDrawable;
        String str;
        int iOrdinal = i02Var.ordinal();
        if (iOrdinal == 0) {
            flashOffDrawable = ytcVar.getFlashOffDrawable();
        } else if (iOrdinal == 1) {
            flashOffDrawable = ytcVar.getFlashOnDrawable();
        } else if (iOrdinal == 2) {
            flashOffDrawable = ytcVar.getFlashAutoDrawable();
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            flashOffDrawable = ytcVar.getFlashOnDrawable();
        }
        int iOrdinal2 = i02Var.ordinal();
        if (iOrdinal2 != 0) {
            str = "M14.16 3.854l-7.786 8.384 3.643 0.52c1.23 0.176 1.987 1.439 1.563 2.607l-1.74 4.781 7.786-8.384-3.643-0.52c-1.23-0.176-1.987-1.439-1.563-2.607l1.74-4.781zm0.285-3.248c1.098-1.181 3.025-0.003 2.474 1.512l-2.6 7.152 4.576 0.653c1.181 0.17 1.686 1.596 0.874 2.47l-10.214 11c-1.097 1.182-3.025 0.004-2.474-1.51l2.601-7.153-4.577-0.653c-1.181-0.17-1.686-1.596-0.874-2.47l10.214-11z";
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    str = "M14.919 2.118c0.55-1.515-1.376-2.693-2.474-1.512l-10.214 11c-0.812 0.875-0.307 2.302 0.874 2.47l4.577 0.654-2.6 7.152c-0.552 1.515 1.376 2.693 2.473 1.511l10.214-11c0.812-0.874 0.307-2.3-0.874-2.47L12.318 9.27l2.6-7.152zM4.374 12.238l7.785-8.384-1.739 4.781c-0.424 1.168 0.333 2.431 1.563 2.607l3.643 0.52-7.785 8.384 1.739-4.782c0.424-1.168-0.333-2.43-1.563-2.606l-3.643-0.52zm15.456 3.843c-0.53-1.428-2.546-1.438-3.09-0.015l-2.181 5.713c-0.177 0.464 0.055 0.984 0.52 1.162 0.464 0.177 0.984-0.056 1.162-0.52l0.395-1.036h3.239l0.38 1.028c0.174 0.466 0.691 0.704 1.158 0.53 0.466-0.172 0.703-0.69 0.53-1.156l-2.114-5.706zm-0.622 3.504L18.28 17.08l-0.956 2.504h1.884z";
                } else if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            str = "M10 5.792c0-0.301 0.133-0.571 0.344-0.755l4.101-4.43c1.098-1.182 3.025-0.004 2.474 1.51l-1.643 4.52h0.002l-0.33 0.9-0.561 1.543-0.003-0.003-0.07 0.192 0.306 0.044 4.275 0.61c1.181 0.17 1.686 1.596 0.874 2.47l-1 1.069c-0.182 0.188-0.437 0.305-0.72 0.305-0.552 0-1-0.448-1-1 0-0.302 0.134-0.573 0.346-0.756l0.23-0.249-0.649-0.092-0.008-0.008-1.668-0.23-2.855-2.866 0.972-2.68h0.003l0.74-2.032-2.372 2.553C11.605 6.641 11.32 6.792 11 6.792c-0.552 0-1-0.448-1-1z M7.101 8.516L3.293 4.707c-0.39-0.39-0.39-1.024 0-1.414 0.39-0.39 1.024-0.39 1.414 0l16 16c0.39 0.39 0.39 1.024 0 1.414-0.39 0.39-1.024 0.39-1.414 0l-3.756-3.756-5.982 6.443c-1.097 1.181-3.025 0.003-2.474-1.512l2.601-7.152-4.577-0.653c-1.181-0.17-1.686-1.596-0.874-2.47l2.87-3.091zm7.02 7.02L8.518 9.93l-2.143 2.307 3.643 0.52c1.23 0.176 1.987 1.439 1.563 2.607l-1.74 4.781 4.282-4.61z";
        }
        ytcVar.y0.b(flashOffDrawable, str, G0);
        ytcVar.getCameraApi().setFlash(i02Var.name());
    }

    public static final void c(ytc ytcVar, float f, float f2, float f3, float f4, float f5) {
        AppCompatImageView appCompatImageView = ytcVar.u0;
        FloatEvaluator floatEvaluator = ytcVar.a;
        appCompatImageView.setAlpha(floatEvaluator.evaluate(f5, (Number) Float.valueOf(f), (Number) Float.valueOf(f2)).floatValue());
        ytcVar.C0.setAlpha(floatEvaluator.evaluate(f5, (Number) Float.valueOf(f3), (Number) Float.valueOf(f4)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getCanRecordingVideo() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getFlashAutoDrawable() {
        return (Drawable) this.D0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getFlashOffDrawable() {
        return (Drawable) this.F0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getFlashOnDrawable() {
        return (Drawable) this.E0.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.b) {
            return false;
        }
        if (keyEvent.getKeyCode() != 25 && keyEvent.getKeyCode() != 24) {
            return false;
        }
        int action = keyEvent.getAction();
        return action == 0 || action == 1;
    }

    public final j02 getCameraApi() {
        return this.t0;
    }
}
