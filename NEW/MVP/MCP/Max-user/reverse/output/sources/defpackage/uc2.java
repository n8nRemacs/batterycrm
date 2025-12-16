package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public final class uc2 extends ViewGroup implements u6g, Animatable {
    public static final /* synthetic */ int Z0 = 0;
    public Animatable A0;
    public final Object B0;
    public final Object C0;
    public final Object D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    public final View H0;
    public final View I0;
    public final View J0;
    public final BitSet K0;
    public final BitSet L0;
    public final int M0;
    public final int N0;
    public final int O0;
    public final int P0;
    public final int Q0;
    public final int R0;
    public final int S0;
    public final int T0;
    public final int U0;
    public boolean V0;
    public final vy1 W0;
    public long X0;
    public xzg Y0;
    public final uxa a;
    public final TextView b;
    public final Object c;
    public final Object d;
    public final Object o;
    public final Object s0;
    public final TextView t0;
    public final ina u0;
    public Drawable v0;
    public final Object w0;
    public final Object x0;
    public final Object y0;
    public final Object z0;

    public uc2(final Context context) {
        super(context, null, 0, 0);
        uxa uxaVar = new uxa(context);
        uxaVar.setFocusable(0);
        this.a = uxaVar;
        TextView textView = new TextView(context);
        dpg.O.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.y(textView).getText().e);
        textView.setSingleLine();
        mfh.k(textView, false);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setFocusable(0);
        this.b = textView;
        final int i = 0;
        this.c = ipi.b(3, new cm6() { // from class: qc2
            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                switch (i) {
                    case 0:
                        sga sgaVar = new sga(context);
                        sgaVar.i(dpg.Q);
                        sgaVar.setTextColor(a93.s0.y(sgaVar).getText().g);
                        sgaVar.setMaxLinesValue(2);
                        sgaVar.setFocusable(0);
                        sgaVar.setFallbackLineSpace(false);
                        sgaVar.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var = this;
                        uc2Var.addView(sgaVar, -1, -2);
                        uc2Var.e(uc2Var.K0, true);
                        uc2Var.e(uc2Var.L0, false);
                        return sgaVar;
                    case 1:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yud.I);
                        z18.e(enhancedVectorDrawable, NegotiationErrorStat.KEY_ERROR, a93.s0.y(this).c().b.a.c);
                        return enhancedVectorDrawable;
                    case 2:
                        v5g v5gVar = new v5g(context);
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        v5gVar.setBounds(0, 0, iD, iD);
                        v5gVar.setCallback(this);
                        return v5gVar;
                    case 3:
                        pgf pgfVar = new pgf(context);
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        pgfVar.setBounds(0, 0, iD2, iD2);
                        pgfVar.setCallback(this);
                        return pgfVar;
                    case 4:
                        ey5 ey5Var = new ey5(context);
                        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        ey5Var.setBounds(0, 0, iD3, iD3);
                        ey5Var.setCallback(this);
                        return ey5Var;
                    case 5:
                        sga sgaVar2 = new sga(context);
                        sgaVar2.i(dpg.Q);
                        sgaVar2.setTextColor(a93.s0.y(sgaVar2).getText().g);
                        sgaVar2.setMaxLinesValue(2);
                        sgaVar2.setFocusable(0);
                        sgaVar2.setFallbackLineSpace(false);
                        sgaVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var2 = this;
                        uc2Var2.addView(sgaVar2, -1, -2);
                        uc2Var2.h(uc2Var2.K0, true);
                        uc2Var2.h(uc2Var2.L0, false);
                        return sgaVar2;
                    case 6:
                        m28 m28Var = new m28(context);
                        m28Var.f(dpg.Q);
                        m28Var.setTextColor(a93.s0.y(m28Var).getText().g);
                        m28Var.setMaxLinesValue(2);
                        m28Var.setFocusable(0);
                        m28Var.setFallbackLineSpace(false);
                        m28Var.setEllipsizing(TextUtils.TruncateAt.END);
                        jgh.a(m28Var);
                        uc2 uc2Var3 = this;
                        uc2Var3.addView(m28Var, -1, -2);
                        uc2Var3.e(uc2Var3.K0, true);
                        uc2Var3.e(uc2Var3.L0, false);
                        return m28Var;
                    case 7:
                        m28 m28Var2 = new m28(context);
                        m28Var2.f(dpg.Q);
                        m28Var2.setTextColor(a93.s0.y(m28Var2).getText().g);
                        m28Var2.setMaxLinesValue(2);
                        m28Var2.setFocusable(0);
                        m28Var2.setFallbackLineSpace(false);
                        m28Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var4 = this;
                        uc2Var4.addView(m28Var2, -1, -2);
                        uc2Var4.h(uc2Var4.K0, true);
                        uc2Var4.h(uc2Var4.L0, false);
                        return m28Var2;
                    default:
                        Context context2 = context;
                        te teVar = new te(context2);
                        uc2 uc2Var5 = this;
                        teVar.setCallback(uc2Var5);
                        v1a v1aVar2 = a93.s0;
                        teVar.d(v1aVar2.y(uc2Var5).getIcon().j, uc2Var5.L0.get(uc2Var5.R0) ? v1aVar2.x(context2).k().b().n : v1aVar2.x(context2).k().b().l);
                        return teVar;
                }
            }
        });
        final int i2 = 5;
        this.d = ipi.b(3, new cm6() { // from class: qc2
            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                switch (i2) {
                    case 0:
                        sga sgaVar = new sga(context);
                        sgaVar.i(dpg.Q);
                        sgaVar.setTextColor(a93.s0.y(sgaVar).getText().g);
                        sgaVar.setMaxLinesValue(2);
                        sgaVar.setFocusable(0);
                        sgaVar.setFallbackLineSpace(false);
                        sgaVar.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var = this;
                        uc2Var.addView(sgaVar, -1, -2);
                        uc2Var.e(uc2Var.K0, true);
                        uc2Var.e(uc2Var.L0, false);
                        return sgaVar;
                    case 1:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yud.I);
                        z18.e(enhancedVectorDrawable, NegotiationErrorStat.KEY_ERROR, a93.s0.y(this).c().b.a.c);
                        return enhancedVectorDrawable;
                    case 2:
                        v5g v5gVar = new v5g(context);
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        v5gVar.setBounds(0, 0, iD, iD);
                        v5gVar.setCallback(this);
                        return v5gVar;
                    case 3:
                        pgf pgfVar = new pgf(context);
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        pgfVar.setBounds(0, 0, iD2, iD2);
                        pgfVar.setCallback(this);
                        return pgfVar;
                    case 4:
                        ey5 ey5Var = new ey5(context);
                        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        ey5Var.setBounds(0, 0, iD3, iD3);
                        ey5Var.setCallback(this);
                        return ey5Var;
                    case 5:
                        sga sgaVar2 = new sga(context);
                        sgaVar2.i(dpg.Q);
                        sgaVar2.setTextColor(a93.s0.y(sgaVar2).getText().g);
                        sgaVar2.setMaxLinesValue(2);
                        sgaVar2.setFocusable(0);
                        sgaVar2.setFallbackLineSpace(false);
                        sgaVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var2 = this;
                        uc2Var2.addView(sgaVar2, -1, -2);
                        uc2Var2.h(uc2Var2.K0, true);
                        uc2Var2.h(uc2Var2.L0, false);
                        return sgaVar2;
                    case 6:
                        m28 m28Var = new m28(context);
                        m28Var.f(dpg.Q);
                        m28Var.setTextColor(a93.s0.y(m28Var).getText().g);
                        m28Var.setMaxLinesValue(2);
                        m28Var.setFocusable(0);
                        m28Var.setFallbackLineSpace(false);
                        m28Var.setEllipsizing(TextUtils.TruncateAt.END);
                        jgh.a(m28Var);
                        uc2 uc2Var3 = this;
                        uc2Var3.addView(m28Var, -1, -2);
                        uc2Var3.e(uc2Var3.K0, true);
                        uc2Var3.e(uc2Var3.L0, false);
                        return m28Var;
                    case 7:
                        m28 m28Var2 = new m28(context);
                        m28Var2.f(dpg.Q);
                        m28Var2.setTextColor(a93.s0.y(m28Var2).getText().g);
                        m28Var2.setMaxLinesValue(2);
                        m28Var2.setFocusable(0);
                        m28Var2.setFallbackLineSpace(false);
                        m28Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var4 = this;
                        uc2Var4.addView(m28Var2, -1, -2);
                        uc2Var4.h(uc2Var4.K0, true);
                        uc2Var4.h(uc2Var4.L0, false);
                        return m28Var2;
                    default:
                        Context context2 = context;
                        te teVar = new te(context2);
                        uc2 uc2Var5 = this;
                        teVar.setCallback(uc2Var5);
                        v1a v1aVar2 = a93.s0;
                        teVar.d(v1aVar2.y(uc2Var5).getIcon().j, uc2Var5.L0.get(uc2Var5.R0) ? v1aVar2.x(context2).k().b().n : v1aVar2.x(context2).k().b().l);
                        return teVar;
                }
            }
        });
        final int i3 = 6;
        this.o = ipi.b(3, new cm6() { // from class: qc2
            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                switch (i3) {
                    case 0:
                        sga sgaVar = new sga(context);
                        sgaVar.i(dpg.Q);
                        sgaVar.setTextColor(a93.s0.y(sgaVar).getText().g);
                        sgaVar.setMaxLinesValue(2);
                        sgaVar.setFocusable(0);
                        sgaVar.setFallbackLineSpace(false);
                        sgaVar.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var = this;
                        uc2Var.addView(sgaVar, -1, -2);
                        uc2Var.e(uc2Var.K0, true);
                        uc2Var.e(uc2Var.L0, false);
                        return sgaVar;
                    case 1:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yud.I);
                        z18.e(enhancedVectorDrawable, NegotiationErrorStat.KEY_ERROR, a93.s0.y(this).c().b.a.c);
                        return enhancedVectorDrawable;
                    case 2:
                        v5g v5gVar = new v5g(context);
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        v5gVar.setBounds(0, 0, iD, iD);
                        v5gVar.setCallback(this);
                        return v5gVar;
                    case 3:
                        pgf pgfVar = new pgf(context);
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        pgfVar.setBounds(0, 0, iD2, iD2);
                        pgfVar.setCallback(this);
                        return pgfVar;
                    case 4:
                        ey5 ey5Var = new ey5(context);
                        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        ey5Var.setBounds(0, 0, iD3, iD3);
                        ey5Var.setCallback(this);
                        return ey5Var;
                    case 5:
                        sga sgaVar2 = new sga(context);
                        sgaVar2.i(dpg.Q);
                        sgaVar2.setTextColor(a93.s0.y(sgaVar2).getText().g);
                        sgaVar2.setMaxLinesValue(2);
                        sgaVar2.setFocusable(0);
                        sgaVar2.setFallbackLineSpace(false);
                        sgaVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var2 = this;
                        uc2Var2.addView(sgaVar2, -1, -2);
                        uc2Var2.h(uc2Var2.K0, true);
                        uc2Var2.h(uc2Var2.L0, false);
                        return sgaVar2;
                    case 6:
                        m28 m28Var = new m28(context);
                        m28Var.f(dpg.Q);
                        m28Var.setTextColor(a93.s0.y(m28Var).getText().g);
                        m28Var.setMaxLinesValue(2);
                        m28Var.setFocusable(0);
                        m28Var.setFallbackLineSpace(false);
                        m28Var.setEllipsizing(TextUtils.TruncateAt.END);
                        jgh.a(m28Var);
                        uc2 uc2Var3 = this;
                        uc2Var3.addView(m28Var, -1, -2);
                        uc2Var3.e(uc2Var3.K0, true);
                        uc2Var3.e(uc2Var3.L0, false);
                        return m28Var;
                    case 7:
                        m28 m28Var2 = new m28(context);
                        m28Var2.f(dpg.Q);
                        m28Var2.setTextColor(a93.s0.y(m28Var2).getText().g);
                        m28Var2.setMaxLinesValue(2);
                        m28Var2.setFocusable(0);
                        m28Var2.setFallbackLineSpace(false);
                        m28Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var4 = this;
                        uc2Var4.addView(m28Var2, -1, -2);
                        uc2Var4.h(uc2Var4.K0, true);
                        uc2Var4.h(uc2Var4.L0, false);
                        return m28Var2;
                    default:
                        Context context2 = context;
                        te teVar = new te(context2);
                        uc2 uc2Var5 = this;
                        teVar.setCallback(uc2Var5);
                        v1a v1aVar2 = a93.s0;
                        teVar.d(v1aVar2.y(uc2Var5).getIcon().j, uc2Var5.L0.get(uc2Var5.R0) ? v1aVar2.x(context2).k().b().n : v1aVar2.x(context2).k().b().l);
                        return teVar;
                }
            }
        });
        final int i4 = 7;
        this.s0 = ipi.b(3, new cm6() { // from class: qc2
            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                switch (i4) {
                    case 0:
                        sga sgaVar = new sga(context);
                        sgaVar.i(dpg.Q);
                        sgaVar.setTextColor(a93.s0.y(sgaVar).getText().g);
                        sgaVar.setMaxLinesValue(2);
                        sgaVar.setFocusable(0);
                        sgaVar.setFallbackLineSpace(false);
                        sgaVar.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var = this;
                        uc2Var.addView(sgaVar, -1, -2);
                        uc2Var.e(uc2Var.K0, true);
                        uc2Var.e(uc2Var.L0, false);
                        return sgaVar;
                    case 1:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yud.I);
                        z18.e(enhancedVectorDrawable, NegotiationErrorStat.KEY_ERROR, a93.s0.y(this).c().b.a.c);
                        return enhancedVectorDrawable;
                    case 2:
                        v5g v5gVar = new v5g(context);
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        v5gVar.setBounds(0, 0, iD, iD);
                        v5gVar.setCallback(this);
                        return v5gVar;
                    case 3:
                        pgf pgfVar = new pgf(context);
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        pgfVar.setBounds(0, 0, iD2, iD2);
                        pgfVar.setCallback(this);
                        return pgfVar;
                    case 4:
                        ey5 ey5Var = new ey5(context);
                        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        ey5Var.setBounds(0, 0, iD3, iD3);
                        ey5Var.setCallback(this);
                        return ey5Var;
                    case 5:
                        sga sgaVar2 = new sga(context);
                        sgaVar2.i(dpg.Q);
                        sgaVar2.setTextColor(a93.s0.y(sgaVar2).getText().g);
                        sgaVar2.setMaxLinesValue(2);
                        sgaVar2.setFocusable(0);
                        sgaVar2.setFallbackLineSpace(false);
                        sgaVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var2 = this;
                        uc2Var2.addView(sgaVar2, -1, -2);
                        uc2Var2.h(uc2Var2.K0, true);
                        uc2Var2.h(uc2Var2.L0, false);
                        return sgaVar2;
                    case 6:
                        m28 m28Var = new m28(context);
                        m28Var.f(dpg.Q);
                        m28Var.setTextColor(a93.s0.y(m28Var).getText().g);
                        m28Var.setMaxLinesValue(2);
                        m28Var.setFocusable(0);
                        m28Var.setFallbackLineSpace(false);
                        m28Var.setEllipsizing(TextUtils.TruncateAt.END);
                        jgh.a(m28Var);
                        uc2 uc2Var3 = this;
                        uc2Var3.addView(m28Var, -1, -2);
                        uc2Var3.e(uc2Var3.K0, true);
                        uc2Var3.e(uc2Var3.L0, false);
                        return m28Var;
                    case 7:
                        m28 m28Var2 = new m28(context);
                        m28Var2.f(dpg.Q);
                        m28Var2.setTextColor(a93.s0.y(m28Var2).getText().g);
                        m28Var2.setMaxLinesValue(2);
                        m28Var2.setFocusable(0);
                        m28Var2.setFallbackLineSpace(false);
                        m28Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var4 = this;
                        uc2Var4.addView(m28Var2, -1, -2);
                        uc2Var4.h(uc2Var4.K0, true);
                        uc2Var4.h(uc2Var4.L0, false);
                        return m28Var2;
                    default:
                        Context context2 = context;
                        te teVar = new te(context2);
                        uc2 uc2Var5 = this;
                        teVar.setCallback(uc2Var5);
                        v1a v1aVar2 = a93.s0;
                        teVar.d(v1aVar2.y(uc2Var5).getIcon().j, uc2Var5.L0.get(uc2Var5.R0) ? v1aVar2.x(context2).k().b().n : v1aVar2.x(context2).k().b().l);
                        return teVar;
                }
            }
        });
        TextView textView2 = new TextView(context);
        dpg.P.b(textView2, t75.b);
        mfh.k(textView2, false);
        textView2.setTextColor(v1aVar.y(textView2).getText().i);
        textView2.setFocusable(0);
        this.t0 = textView2;
        ina inaVar = new ina(context);
        inaVar.setFocusable(0);
        this.u0 = inaVar;
        final int i5 = 8;
        this.w0 = ipi.b(3, new cm6() { // from class: qc2
            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                switch (i5) {
                    case 0:
                        sga sgaVar = new sga(context);
                        sgaVar.i(dpg.Q);
                        sgaVar.setTextColor(a93.s0.y(sgaVar).getText().g);
                        sgaVar.setMaxLinesValue(2);
                        sgaVar.setFocusable(0);
                        sgaVar.setFallbackLineSpace(false);
                        sgaVar.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var = this;
                        uc2Var.addView(sgaVar, -1, -2);
                        uc2Var.e(uc2Var.K0, true);
                        uc2Var.e(uc2Var.L0, false);
                        return sgaVar;
                    case 1:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yud.I);
                        z18.e(enhancedVectorDrawable, NegotiationErrorStat.KEY_ERROR, a93.s0.y(this).c().b.a.c);
                        return enhancedVectorDrawable;
                    case 2:
                        v5g v5gVar = new v5g(context);
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        v5gVar.setBounds(0, 0, iD, iD);
                        v5gVar.setCallback(this);
                        return v5gVar;
                    case 3:
                        pgf pgfVar = new pgf(context);
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        pgfVar.setBounds(0, 0, iD2, iD2);
                        pgfVar.setCallback(this);
                        return pgfVar;
                    case 4:
                        ey5 ey5Var = new ey5(context);
                        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        ey5Var.setBounds(0, 0, iD3, iD3);
                        ey5Var.setCallback(this);
                        return ey5Var;
                    case 5:
                        sga sgaVar2 = new sga(context);
                        sgaVar2.i(dpg.Q);
                        sgaVar2.setTextColor(a93.s0.y(sgaVar2).getText().g);
                        sgaVar2.setMaxLinesValue(2);
                        sgaVar2.setFocusable(0);
                        sgaVar2.setFallbackLineSpace(false);
                        sgaVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var2 = this;
                        uc2Var2.addView(sgaVar2, -1, -2);
                        uc2Var2.h(uc2Var2.K0, true);
                        uc2Var2.h(uc2Var2.L0, false);
                        return sgaVar2;
                    case 6:
                        m28 m28Var = new m28(context);
                        m28Var.f(dpg.Q);
                        m28Var.setTextColor(a93.s0.y(m28Var).getText().g);
                        m28Var.setMaxLinesValue(2);
                        m28Var.setFocusable(0);
                        m28Var.setFallbackLineSpace(false);
                        m28Var.setEllipsizing(TextUtils.TruncateAt.END);
                        jgh.a(m28Var);
                        uc2 uc2Var3 = this;
                        uc2Var3.addView(m28Var, -1, -2);
                        uc2Var3.e(uc2Var3.K0, true);
                        uc2Var3.e(uc2Var3.L0, false);
                        return m28Var;
                    case 7:
                        m28 m28Var2 = new m28(context);
                        m28Var2.f(dpg.Q);
                        m28Var2.setTextColor(a93.s0.y(m28Var2).getText().g);
                        m28Var2.setMaxLinesValue(2);
                        m28Var2.setFocusable(0);
                        m28Var2.setFallbackLineSpace(false);
                        m28Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var4 = this;
                        uc2Var4.addView(m28Var2, -1, -2);
                        uc2Var4.h(uc2Var4.K0, true);
                        uc2Var4.h(uc2Var4.L0, false);
                        return m28Var2;
                    default:
                        Context context2 = context;
                        te teVar = new te(context2);
                        uc2 uc2Var5 = this;
                        teVar.setCallback(uc2Var5);
                        v1a v1aVar2 = a93.s0;
                        teVar.d(v1aVar2.y(uc2Var5).getIcon().j, uc2Var5.L0.get(uc2Var5.R0) ? v1aVar2.x(context2).k().b().n : v1aVar2.x(context2).k().b().l);
                        return teVar;
                }
            }
        });
        final int i6 = 0;
        this.x0 = ipi.b(3, new cm6(this) { // from class: rc2
            public final /* synthetic */ uc2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        int i7 = yud.l;
                        uc2 uc2Var = this.b;
                        Drawable drawableMutate = r34.b(uc2Var.getContext(), i7).mutate();
                        cei.k(drawableMutate, a93.s0.y(uc2Var).getIcon().k);
                        return drawableMutate;
                    case 1:
                        int i8 = yud.j;
                        uc2 uc2Var2 = this.b;
                        Drawable drawableMutate2 = r34.b(uc2Var2.getContext(), i8).mutate();
                        cei.k(drawableMutate2, a93.s0.y(uc2Var2).getIcon().k);
                        return drawableMutate2;
                    case 2:
                        m60 m60Var = new m60();
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        m60Var.setBounds(0, 0, iD, iD);
                        m60Var.setCallback(this.b);
                        return m60Var;
                    case 3:
                        g9h g9hVar = new g9h();
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        g9hVar.setBounds(0, 0, iD2, iD2);
                        g9hVar.setCallback(this.b);
                        return g9hVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(a93.s0.y(this.b).c().a.a.i), null, new ColorDrawable(-1));
                }
            }
        });
        final int i7 = 1;
        this.y0 = ipi.b(3, new cm6(this) { // from class: rc2
            public final /* synthetic */ uc2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        int i72 = yud.l;
                        uc2 uc2Var = this.b;
                        Drawable drawableMutate = r34.b(uc2Var.getContext(), i72).mutate();
                        cei.k(drawableMutate, a93.s0.y(uc2Var).getIcon().k);
                        return drawableMutate;
                    case 1:
                        int i8 = yud.j;
                        uc2 uc2Var2 = this.b;
                        Drawable drawableMutate2 = r34.b(uc2Var2.getContext(), i8).mutate();
                        cei.k(drawableMutate2, a93.s0.y(uc2Var2).getIcon().k);
                        return drawableMutate2;
                    case 2:
                        m60 m60Var = new m60();
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        m60Var.setBounds(0, 0, iD, iD);
                        m60Var.setCallback(this.b);
                        return m60Var;
                    case 3:
                        g9h g9hVar = new g9h();
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        g9hVar.setBounds(0, 0, iD2, iD2);
                        g9hVar.setCallback(this.b);
                        return g9hVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(a93.s0.y(this.b).c().a.a.i), null, new ColorDrawable(-1));
                }
            }
        });
        this.z0 = ipi.b(3, new cm6() { // from class: qc2
            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                switch (i7) {
                    case 0:
                        sga sgaVar = new sga(context);
                        sgaVar.i(dpg.Q);
                        sgaVar.setTextColor(a93.s0.y(sgaVar).getText().g);
                        sgaVar.setMaxLinesValue(2);
                        sgaVar.setFocusable(0);
                        sgaVar.setFallbackLineSpace(false);
                        sgaVar.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var = this;
                        uc2Var.addView(sgaVar, -1, -2);
                        uc2Var.e(uc2Var.K0, true);
                        uc2Var.e(uc2Var.L0, false);
                        return sgaVar;
                    case 1:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yud.I);
                        z18.e(enhancedVectorDrawable, NegotiationErrorStat.KEY_ERROR, a93.s0.y(this).c().b.a.c);
                        return enhancedVectorDrawable;
                    case 2:
                        v5g v5gVar = new v5g(context);
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        v5gVar.setBounds(0, 0, iD, iD);
                        v5gVar.setCallback(this);
                        return v5gVar;
                    case 3:
                        pgf pgfVar = new pgf(context);
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        pgfVar.setBounds(0, 0, iD2, iD2);
                        pgfVar.setCallback(this);
                        return pgfVar;
                    case 4:
                        ey5 ey5Var = new ey5(context);
                        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        ey5Var.setBounds(0, 0, iD3, iD3);
                        ey5Var.setCallback(this);
                        return ey5Var;
                    case 5:
                        sga sgaVar2 = new sga(context);
                        sgaVar2.i(dpg.Q);
                        sgaVar2.setTextColor(a93.s0.y(sgaVar2).getText().g);
                        sgaVar2.setMaxLinesValue(2);
                        sgaVar2.setFocusable(0);
                        sgaVar2.setFallbackLineSpace(false);
                        sgaVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var2 = this;
                        uc2Var2.addView(sgaVar2, -1, -2);
                        uc2Var2.h(uc2Var2.K0, true);
                        uc2Var2.h(uc2Var2.L0, false);
                        return sgaVar2;
                    case 6:
                        m28 m28Var = new m28(context);
                        m28Var.f(dpg.Q);
                        m28Var.setTextColor(a93.s0.y(m28Var).getText().g);
                        m28Var.setMaxLinesValue(2);
                        m28Var.setFocusable(0);
                        m28Var.setFallbackLineSpace(false);
                        m28Var.setEllipsizing(TextUtils.TruncateAt.END);
                        jgh.a(m28Var);
                        uc2 uc2Var3 = this;
                        uc2Var3.addView(m28Var, -1, -2);
                        uc2Var3.e(uc2Var3.K0, true);
                        uc2Var3.e(uc2Var3.L0, false);
                        return m28Var;
                    case 7:
                        m28 m28Var2 = new m28(context);
                        m28Var2.f(dpg.Q);
                        m28Var2.setTextColor(a93.s0.y(m28Var2).getText().g);
                        m28Var2.setMaxLinesValue(2);
                        m28Var2.setFocusable(0);
                        m28Var2.setFallbackLineSpace(false);
                        m28Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var4 = this;
                        uc2Var4.addView(m28Var2, -1, -2);
                        uc2Var4.h(uc2Var4.K0, true);
                        uc2Var4.h(uc2Var4.L0, false);
                        return m28Var2;
                    default:
                        Context context2 = context;
                        te teVar = new te(context2);
                        uc2 uc2Var5 = this;
                        teVar.setCallback(uc2Var5);
                        v1a v1aVar2 = a93.s0;
                        teVar.d(v1aVar2.y(uc2Var5).getIcon().j, uc2Var5.L0.get(uc2Var5.R0) ? v1aVar2.x(context2).k().b().n : v1aVar2.x(context2).k().b().l);
                        return teVar;
                }
            }
        });
        final int i8 = 2;
        this.B0 = ipi.b(3, new cm6() { // from class: qc2
            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                switch (i8) {
                    case 0:
                        sga sgaVar = new sga(context);
                        sgaVar.i(dpg.Q);
                        sgaVar.setTextColor(a93.s0.y(sgaVar).getText().g);
                        sgaVar.setMaxLinesValue(2);
                        sgaVar.setFocusable(0);
                        sgaVar.setFallbackLineSpace(false);
                        sgaVar.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var = this;
                        uc2Var.addView(sgaVar, -1, -2);
                        uc2Var.e(uc2Var.K0, true);
                        uc2Var.e(uc2Var.L0, false);
                        return sgaVar;
                    case 1:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yud.I);
                        z18.e(enhancedVectorDrawable, NegotiationErrorStat.KEY_ERROR, a93.s0.y(this).c().b.a.c);
                        return enhancedVectorDrawable;
                    case 2:
                        v5g v5gVar = new v5g(context);
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        v5gVar.setBounds(0, 0, iD, iD);
                        v5gVar.setCallback(this);
                        return v5gVar;
                    case 3:
                        pgf pgfVar = new pgf(context);
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        pgfVar.setBounds(0, 0, iD2, iD2);
                        pgfVar.setCallback(this);
                        return pgfVar;
                    case 4:
                        ey5 ey5Var = new ey5(context);
                        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        ey5Var.setBounds(0, 0, iD3, iD3);
                        ey5Var.setCallback(this);
                        return ey5Var;
                    case 5:
                        sga sgaVar2 = new sga(context);
                        sgaVar2.i(dpg.Q);
                        sgaVar2.setTextColor(a93.s0.y(sgaVar2).getText().g);
                        sgaVar2.setMaxLinesValue(2);
                        sgaVar2.setFocusable(0);
                        sgaVar2.setFallbackLineSpace(false);
                        sgaVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var2 = this;
                        uc2Var2.addView(sgaVar2, -1, -2);
                        uc2Var2.h(uc2Var2.K0, true);
                        uc2Var2.h(uc2Var2.L0, false);
                        return sgaVar2;
                    case 6:
                        m28 m28Var = new m28(context);
                        m28Var.f(dpg.Q);
                        m28Var.setTextColor(a93.s0.y(m28Var).getText().g);
                        m28Var.setMaxLinesValue(2);
                        m28Var.setFocusable(0);
                        m28Var.setFallbackLineSpace(false);
                        m28Var.setEllipsizing(TextUtils.TruncateAt.END);
                        jgh.a(m28Var);
                        uc2 uc2Var3 = this;
                        uc2Var3.addView(m28Var, -1, -2);
                        uc2Var3.e(uc2Var3.K0, true);
                        uc2Var3.e(uc2Var3.L0, false);
                        return m28Var;
                    case 7:
                        m28 m28Var2 = new m28(context);
                        m28Var2.f(dpg.Q);
                        m28Var2.setTextColor(a93.s0.y(m28Var2).getText().g);
                        m28Var2.setMaxLinesValue(2);
                        m28Var2.setFocusable(0);
                        m28Var2.setFallbackLineSpace(false);
                        m28Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var4 = this;
                        uc2Var4.addView(m28Var2, -1, -2);
                        uc2Var4.h(uc2Var4.K0, true);
                        uc2Var4.h(uc2Var4.L0, false);
                        return m28Var2;
                    default:
                        Context context2 = context;
                        te teVar = new te(context2);
                        uc2 uc2Var5 = this;
                        teVar.setCallback(uc2Var5);
                        v1a v1aVar2 = a93.s0;
                        teVar.d(v1aVar2.y(uc2Var5).getIcon().j, uc2Var5.L0.get(uc2Var5.R0) ? v1aVar2.x(context2).k().b().n : v1aVar2.x(context2).k().b().l);
                        return teVar;
                }
            }
        });
        this.C0 = ipi.b(3, new cm6(this) { // from class: rc2
            public final /* synthetic */ uc2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        int i72 = yud.l;
                        uc2 uc2Var = this.b;
                        Drawable drawableMutate = r34.b(uc2Var.getContext(), i72).mutate();
                        cei.k(drawableMutate, a93.s0.y(uc2Var).getIcon().k);
                        return drawableMutate;
                    case 1:
                        int i82 = yud.j;
                        uc2 uc2Var2 = this.b;
                        Drawable drawableMutate2 = r34.b(uc2Var2.getContext(), i82).mutate();
                        cei.k(drawableMutate2, a93.s0.y(uc2Var2).getIcon().k);
                        return drawableMutate2;
                    case 2:
                        m60 m60Var = new m60();
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        m60Var.setBounds(0, 0, iD, iD);
                        m60Var.setCallback(this.b);
                        return m60Var;
                    case 3:
                        g9h g9hVar = new g9h();
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        g9hVar.setBounds(0, 0, iD2, iD2);
                        g9hVar.setCallback(this.b);
                        return g9hVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(a93.s0.y(this.b).c().a.a.i), null, new ColorDrawable(-1));
                }
            }
        });
        final int i9 = 3;
        this.D0 = ipi.b(3, new cm6() { // from class: qc2
            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                switch (i9) {
                    case 0:
                        sga sgaVar = new sga(context);
                        sgaVar.i(dpg.Q);
                        sgaVar.setTextColor(a93.s0.y(sgaVar).getText().g);
                        sgaVar.setMaxLinesValue(2);
                        sgaVar.setFocusable(0);
                        sgaVar.setFallbackLineSpace(false);
                        sgaVar.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var = this;
                        uc2Var.addView(sgaVar, -1, -2);
                        uc2Var.e(uc2Var.K0, true);
                        uc2Var.e(uc2Var.L0, false);
                        return sgaVar;
                    case 1:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yud.I);
                        z18.e(enhancedVectorDrawable, NegotiationErrorStat.KEY_ERROR, a93.s0.y(this).c().b.a.c);
                        return enhancedVectorDrawable;
                    case 2:
                        v5g v5gVar = new v5g(context);
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        v5gVar.setBounds(0, 0, iD, iD);
                        v5gVar.setCallback(this);
                        return v5gVar;
                    case 3:
                        pgf pgfVar = new pgf(context);
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        pgfVar.setBounds(0, 0, iD2, iD2);
                        pgfVar.setCallback(this);
                        return pgfVar;
                    case 4:
                        ey5 ey5Var = new ey5(context);
                        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        ey5Var.setBounds(0, 0, iD3, iD3);
                        ey5Var.setCallback(this);
                        return ey5Var;
                    case 5:
                        sga sgaVar2 = new sga(context);
                        sgaVar2.i(dpg.Q);
                        sgaVar2.setTextColor(a93.s0.y(sgaVar2).getText().g);
                        sgaVar2.setMaxLinesValue(2);
                        sgaVar2.setFocusable(0);
                        sgaVar2.setFallbackLineSpace(false);
                        sgaVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var2 = this;
                        uc2Var2.addView(sgaVar2, -1, -2);
                        uc2Var2.h(uc2Var2.K0, true);
                        uc2Var2.h(uc2Var2.L0, false);
                        return sgaVar2;
                    case 6:
                        m28 m28Var = new m28(context);
                        m28Var.f(dpg.Q);
                        m28Var.setTextColor(a93.s0.y(m28Var).getText().g);
                        m28Var.setMaxLinesValue(2);
                        m28Var.setFocusable(0);
                        m28Var.setFallbackLineSpace(false);
                        m28Var.setEllipsizing(TextUtils.TruncateAt.END);
                        jgh.a(m28Var);
                        uc2 uc2Var3 = this;
                        uc2Var3.addView(m28Var, -1, -2);
                        uc2Var3.e(uc2Var3.K0, true);
                        uc2Var3.e(uc2Var3.L0, false);
                        return m28Var;
                    case 7:
                        m28 m28Var2 = new m28(context);
                        m28Var2.f(dpg.Q);
                        m28Var2.setTextColor(a93.s0.y(m28Var2).getText().g);
                        m28Var2.setMaxLinesValue(2);
                        m28Var2.setFocusable(0);
                        m28Var2.setFallbackLineSpace(false);
                        m28Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var4 = this;
                        uc2Var4.addView(m28Var2, -1, -2);
                        uc2Var4.h(uc2Var4.K0, true);
                        uc2Var4.h(uc2Var4.L0, false);
                        return m28Var2;
                    default:
                        Context context2 = context;
                        te teVar = new te(context2);
                        uc2 uc2Var5 = this;
                        teVar.setCallback(uc2Var5);
                        v1a v1aVar2 = a93.s0;
                        teVar.d(v1aVar2.y(uc2Var5).getIcon().j, uc2Var5.L0.get(uc2Var5.R0) ? v1aVar2.x(context2).k().b().n : v1aVar2.x(context2).k().b().l);
                        return teVar;
                }
            }
        });
        this.E0 = ipi.b(3, new cm6(this) { // from class: rc2
            public final /* synthetic */ uc2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        int i72 = yud.l;
                        uc2 uc2Var = this.b;
                        Drawable drawableMutate = r34.b(uc2Var.getContext(), i72).mutate();
                        cei.k(drawableMutate, a93.s0.y(uc2Var).getIcon().k);
                        return drawableMutate;
                    case 1:
                        int i82 = yud.j;
                        uc2 uc2Var2 = this.b;
                        Drawable drawableMutate2 = r34.b(uc2Var2.getContext(), i82).mutate();
                        cei.k(drawableMutate2, a93.s0.y(uc2Var2).getIcon().k);
                        return drawableMutate2;
                    case 2:
                        m60 m60Var = new m60();
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        m60Var.setBounds(0, 0, iD, iD);
                        m60Var.setCallback(this.b);
                        return m60Var;
                    case 3:
                        g9h g9hVar = new g9h();
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        g9hVar.setBounds(0, 0, iD2, iD2);
                        g9hVar.setCallback(this.b);
                        return g9hVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(a93.s0.y(this.b).c().a.a.i), null, new ColorDrawable(-1));
                }
            }
        });
        final int i10 = 4;
        this.F0 = ipi.b(3, new cm6() { // from class: qc2
            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                switch (i10) {
                    case 0:
                        sga sgaVar = new sga(context);
                        sgaVar.i(dpg.Q);
                        sgaVar.setTextColor(a93.s0.y(sgaVar).getText().g);
                        sgaVar.setMaxLinesValue(2);
                        sgaVar.setFocusable(0);
                        sgaVar.setFallbackLineSpace(false);
                        sgaVar.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var = this;
                        uc2Var.addView(sgaVar, -1, -2);
                        uc2Var.e(uc2Var.K0, true);
                        uc2Var.e(uc2Var.L0, false);
                        return sgaVar;
                    case 1:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yud.I);
                        z18.e(enhancedVectorDrawable, NegotiationErrorStat.KEY_ERROR, a93.s0.y(this).c().b.a.c);
                        return enhancedVectorDrawable;
                    case 2:
                        v5g v5gVar = new v5g(context);
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        v5gVar.setBounds(0, 0, iD, iD);
                        v5gVar.setCallback(this);
                        return v5gVar;
                    case 3:
                        pgf pgfVar = new pgf(context);
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        pgfVar.setBounds(0, 0, iD2, iD2);
                        pgfVar.setCallback(this);
                        return pgfVar;
                    case 4:
                        ey5 ey5Var = new ey5(context);
                        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        ey5Var.setBounds(0, 0, iD3, iD3);
                        ey5Var.setCallback(this);
                        return ey5Var;
                    case 5:
                        sga sgaVar2 = new sga(context);
                        sgaVar2.i(dpg.Q);
                        sgaVar2.setTextColor(a93.s0.y(sgaVar2).getText().g);
                        sgaVar2.setMaxLinesValue(2);
                        sgaVar2.setFocusable(0);
                        sgaVar2.setFallbackLineSpace(false);
                        sgaVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var2 = this;
                        uc2Var2.addView(sgaVar2, -1, -2);
                        uc2Var2.h(uc2Var2.K0, true);
                        uc2Var2.h(uc2Var2.L0, false);
                        return sgaVar2;
                    case 6:
                        m28 m28Var = new m28(context);
                        m28Var.f(dpg.Q);
                        m28Var.setTextColor(a93.s0.y(m28Var).getText().g);
                        m28Var.setMaxLinesValue(2);
                        m28Var.setFocusable(0);
                        m28Var.setFallbackLineSpace(false);
                        m28Var.setEllipsizing(TextUtils.TruncateAt.END);
                        jgh.a(m28Var);
                        uc2 uc2Var3 = this;
                        uc2Var3.addView(m28Var, -1, -2);
                        uc2Var3.e(uc2Var3.K0, true);
                        uc2Var3.e(uc2Var3.L0, false);
                        return m28Var;
                    case 7:
                        m28 m28Var2 = new m28(context);
                        m28Var2.f(dpg.Q);
                        m28Var2.setTextColor(a93.s0.y(m28Var2).getText().g);
                        m28Var2.setMaxLinesValue(2);
                        m28Var2.setFocusable(0);
                        m28Var2.setFallbackLineSpace(false);
                        m28Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        uc2 uc2Var4 = this;
                        uc2Var4.addView(m28Var2, -1, -2);
                        uc2Var4.h(uc2Var4.K0, true);
                        uc2Var4.h(uc2Var4.L0, false);
                        return m28Var2;
                    default:
                        Context context2 = context;
                        te teVar = new te(context2);
                        uc2 uc2Var5 = this;
                        teVar.setCallback(uc2Var5);
                        v1a v1aVar2 = a93.s0;
                        teVar.d(v1aVar2.y(uc2Var5).getIcon().j, uc2Var5.L0.get(uc2Var5.R0) ? v1aVar2.x(context2).k().b().n : v1aVar2.x(context2).k().b().l);
                        return teVar;
                }
            }
        });
        this.G0 = ipi.b(3, new cm6(this) { // from class: rc2
            public final /* synthetic */ uc2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        int i72 = yud.l;
                        uc2 uc2Var = this.b;
                        Drawable drawableMutate = r34.b(uc2Var.getContext(), i72).mutate();
                        cei.k(drawableMutate, a93.s0.y(uc2Var).getIcon().k);
                        return drawableMutate;
                    case 1:
                        int i82 = yud.j;
                        uc2 uc2Var2 = this.b;
                        Drawable drawableMutate2 = r34.b(uc2Var2.getContext(), i82).mutate();
                        cei.k(drawableMutate2, a93.s0.y(uc2Var2).getIcon().k);
                        return drawableMutate2;
                    case 2:
                        m60 m60Var = new m60();
                        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        m60Var.setBounds(0, 0, iD, iD);
                        m60Var.setCallback(this.b);
                        return m60Var;
                    case 3:
                        g9h g9hVar = new g9h();
                        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        g9hVar.setBounds(0, 0, iD2, iD2);
                        g9hVar.setCallback(this.b);
                        return g9hVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(a93.s0.y(this.b).c().a.a.i), null, new ColorDrawable(-1));
                }
            }
        });
        View view = new View(context);
        Drawable drawableMutate = r34.b(view.getContext(), yud.z1).mutate();
        cei.k(drawableMutate, v1aVar.y(view).getIcon().h);
        view.setBackground(drawableMutate);
        view.setFocusable(0);
        this.H0 = view;
        View view2 = new View(context);
        Drawable drawableMutate2 = r34.b(view2.getContext(), yud.q1).mutate();
        cei.k(drawableMutate2, v1aVar.y(view2).getIcon().h);
        view2.setBackground(drawableMutate2);
        view2.setFocusable(0);
        this.I0 = view2;
        View view3 = new View(context);
        view3.setBackground(new ColorDrawable(-16711936));
        view3.setFocusable(0);
        this.J0 = view3;
        BitSet bitSet = new BitSet(8);
        this.K0 = bitSet;
        BitSet bitSet2 = new BitSet(8);
        this.L0 = bitSet2;
        this.M0 = 1;
        this.N0 = 2;
        this.O0 = 3;
        this.P0 = 4;
        this.Q0 = 5;
        this.R0 = 6;
        this.S0 = 7;
        this.T0 = 8;
        this.U0 = 9;
        this.W0 = new vy1(14, this);
        setBackground(getRippleDrawable());
        addView(uxaVar);
        addView(textView, -1, -2);
        addView(textView2);
        addView(view2);
        addView(inaVar);
        addView(view);
        addView(view3);
        float f = 6;
        float f2 = 10;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        bitSet.set(0, bitSet.size(), true);
        bitSet2.set(0, bitSet2.size(), false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    private final ga5 getActiveSubtitleView() {
        if (this.c.e()) {
            return getSubtitleView();
        }
        if (this.o.e()) {
            return getOldSubtitleView();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    private final ga5 getActiveTypingView() {
        if (this.d.e()) {
            return getTypingView();
        }
        if (this.s0.e()) {
            return getOldTypingView();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final m28 getOldSubtitleView() {
        return (m28) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final m28 getOldTypingView() {
        return (m28) this.s0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.G0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final sga getSubtitleView() {
        return (sga) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final sga getTypingView() {
        return (sga) this.d.getValue();
    }

    public final boolean a(String str) {
        View asView;
        if (str != null && str.length() != 0) {
            ga5 activeSubtitleView = getActiveSubtitleView();
            float fD = activeSubtitleView != null ? activeSubtitleView.d(str) : 0.0f;
            ga5 activeSubtitleView2 = getActiveSubtitleView();
            if (fD > ((activeSubtitleView2 == null || (asView = activeSubtitleView2.getAsView()) == null) ? 0 : asView.getMeasuredWidth())) {
                return true;
            }
        }
        return false;
    }

    public final void b(Uri uri, CharSequence charSequence, Long l) {
        String string = uri != null ? uri.toString() : null;
        Long lValueOf = Long.valueOf(l.longValue());
        if (charSequence == null) {
            charSequence = "";
        }
        uxa.n(this.a, string, lValueOf, charSequence);
        this.K0.set(0, true);
        requestLayout();
        this.L0.set(0, true);
    }

    public final void c(BitSet bitSet, boolean z) {
        bitSet.set(this.P0, z);
    }

    public final void d(CharSequence charSequence, boolean z) {
        ga5 oldSubtitleView = z ? getOldSubtitleView() : getSubtitleView();
        CharSequence textValue = oldSubtitleView.getTextValue();
        BitSet bitSet = this.K0;
        boolean z2 = true;
        if (textValue != charSequence) {
            oldSubtitleView.setTextValue(charSequence);
            e(bitSet, true);
        }
        BitSet bitSet2 = this.L0;
        e(bitSet2, (charSequence == null || vmf.F(charSequence) || bitSet2.get(this.U0)) ? false : true);
        int i = this.N0;
        if (!bitSet.get(i) && bitSet2.get(i) == oldSubtitleView.a()) {
            z2 = false;
        }
        bitSet.set(i, z2);
        oldSubtitleView.c(a93.s0.y(this));
        invalidate();
        requestLayout();
    }

    public final void e(BitSet bitSet, boolean z) {
        bitSet.set(this.N0, z);
    }

    public final void f(int i, CharSequence charSequence, boolean z) {
        v1a v1aVar = a93.s0;
        ga5 oldTypingView = z ? getOldTypingView() : getTypingView();
        ga5 oldSubtitleView = z ? getOldSubtitleView() : getSubtitleView();
        Animatable animatableI = i(i);
        CharSequence textValue = oldTypingView.getTextValue();
        BitSet bitSet = this.K0;
        boolean z2 = true;
        if (textValue != charSequence) {
            oldTypingView.setTextValue(charSequence);
            h(bitSet, true);
        }
        Animatable animatable = this.A0;
        if (animatableI != animatable) {
            if (animatable != null) {
                animatable.stop();
            }
            this.A0 = animatableI;
            u6g u6gVar = animatableI instanceof u6g ? (u6g) animatableI : null;
            if (u6gVar != null) {
                u6gVar.onThemeChanged(v1aVar.y(this));
            }
            h(bitSet, true);
        }
        boolean z3 = (charSequence == null || vmf.F(charSequence)) ? false : true;
        BitSet bitSet2 = this.L0;
        h(bitSet2, z3);
        CharSequence spannableText = oldSubtitleView.getSpannableText();
        int i2 = this.U0;
        bitSet2.set(this.N0, (spannableText == null || vmf.F(spannableText) || bitSet2.get(i2)) ? false : true);
        if (!bitSet.get(i2) && bitSet2.get(i2) == oldSubtitleView.a()) {
            z2 = false;
        }
        bitSet.set(i2, z2);
        oldTypingView.c(v1aVar.y(this));
        if (bitSet.get(i2)) {
            Animatable animatable2 = this.A0;
            if (animatable2 != null) {
                animatable2.start();
            }
        } else {
            this.A0 = null;
        }
        requestLayout();
    }

    public final void g(u4g u4gVar, int i) {
        Animatable animatableI = i(i);
        int i2 = this.N0;
        int i3 = this.U0;
        boolean z = false;
        BitSet bitSet = this.K0;
        BitSet bitSet2 = this.L0;
        if (u4gVar != null) {
            getTypingView().setLayout(u4gVar);
            h(bitSet2, !vmf.F(u4gVar.a.a().getText()));
            ga5 activeSubtitleView = getActiveSubtitleView();
            CharSequence spannableText = activeSubtitleView != null ? activeSubtitleView.getSpannableText() : null;
            if (spannableText != null && !vmf.F(spannableText) && !bitSet2.get(i3)) {
                z = true;
            }
            bitSet2.set(i2, z);
            h(bitSet, true);
        } else {
            h(bitSet2, false);
            ga5 activeSubtitleView2 = getActiveSubtitleView();
            CharSequence spannableText2 = activeSubtitleView2 != null ? activeSubtitleView2.getSpannableText() : null;
            if (spannableText2 != null && !vmf.F(spannableText2)) {
                z = true;
            }
            bitSet2.set(i2, z);
            h(bitSet, true);
        }
        Animatable animatable = this.A0;
        if (animatableI != animatable) {
            if (animatable != null) {
                animatable.stop();
            }
            this.A0 = animatableI;
            u6g u6gVar = animatableI instanceof u6g ? (u6g) animatableI : null;
            if (u6gVar != null) {
                u6gVar.onThemeChanged(a93.s0.y(this));
            }
            h(bitSet, true);
        }
        if (bitSet.get(i3)) {
            Animatable animatable2 = this.A0;
            if (animatable2 != null) {
                animatable2.start();
            }
        } else {
            this.A0 = null;
        }
        requestLayout();
    }

    public final void h(BitSet bitSet, boolean z) {
        bitSet.set(this.U0, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, k18] */
    public final Animatable i(int i) {
        int i2 = i == 0 ? -1 : tc2.$EnumSwitchMapping$0[az1.v(i)];
        ?? r0 = this.F0;
        switch (i2) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return (Animatable) this.E0.getValue();
            case 2:
                return (Animatable) this.C0.getValue();
            case 3:
                return (Animatable) this.D0.getValue();
            case 4:
                return (Animatable) r0.getValue();
            case 5:
                return (Animatable) this.B0.getValue();
            case 6:
                return (Animatable) r0.getValue();
            case 7:
                return (Animatable) r0.getValue();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Animatable animatable;
        ga5 activeTypingView = getActiveTypingView();
        if (activeTypingView == null || !activeTypingView.a() || (animatable = this.A0) == null || animatable == null || !animatable.isRunning()) {
            Object obj = this.v0;
            Animatable animatable2 = obj instanceof Animatable ? (Animatable) obj : null;
            if (animatable2 == null || !animatable2.isRunning()) {
                return false;
            }
        }
        return true;
    }

    public final void j(int i, boolean z) {
        ina inaVar = this.u0;
        hna hnaVar = inaVar.d;
        int i2 = hnaVar.a;
        hna hnaVarA = hna.a(hnaVar, i, false, false, false, 14);
        inaVar.d = hnaVarA;
        if (i2 != i) {
            int i3 = inaVar.t0;
            BitSet bitSet = inaVar.o;
            w2b w2bVar = inaVar.w0;
            w2bVar.g(hnaVarA.a, z && bitSet.get(i3));
            w2bVar.setAppearance(hnaVarA.d ? r2b.c : r2b.a);
            bitSet.set(i3, hnaVarA.e);
            inaVar.requestLayout();
        }
        BitSet bitSet2 = this.L0;
        int i4 = this.P0;
        bitSet2.set(i4, bitSet2.get(i4) || i > 0);
        c(this.K0, true);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(a93.s0.y(this));
        start();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        BitSet bitSet = this.K0;
        bitSet.set(0, bitSet.size(), true);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave;
        super.onDraw(canvas);
        ga5 activeTypingView = getActiveTypingView();
        if (activeTypingView != null && activeTypingView.a()) {
            Object obj = this.A0;
            Drawable drawable = obj instanceof Drawable ? (Drawable) obj : null;
            if (drawable == null) {
                return;
            }
            float fHeight = ((activeTypingView.b().height() - kti.d(16 * vw4.d().getDisplayMetrics().density)) / 2.0f) + activeTypingView.getAsView().getTop();
            float left = activeTypingView.getAsView().getLeft();
            iSave = canvas.save();
            canvas.translate(left, fHeight);
            canvas.clipRect(drawable.getBounds());
            drawable.draw(canvas);
            return;
        }
        Drawable drawable2 = this.v0;
        if (drawable2 != null) {
            TextView textView = this.t0;
            float x = (textView.getX() - kti.d(16 * vw4.d().getDisplayMetrics().density)) - kti.d(2 * vw4.d().getDisplayMetrics().density);
            float height = ((textView.getHeight() - drawable2.getBounds().height()) / 2.0f) + textView.getY();
            iSave = canvas.save();
            canvas.translate(x, height);
            try {
                drawable2.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ga5 activeTypingView;
        View asView;
        ga5 activeSubtitleView;
        View asView2;
        View asView3;
        View asView4;
        uxa uxaVar = this.a;
        int measuredHeight = (int) ((((getMeasuredHeight() - (getPaddingBottom() + getPaddingTop())) / 2.0f) + getPaddingTop()) - (uxaVar.getMeasuredWidth() / 2.0f));
        BitSet bitSet = this.L0;
        if (bitSet.get(0)) {
            m8j.e(this.a, this, getPaddingStart(), measuredHeight, uxaVar.getMeasuredWidth() + getPaddingStart(), uxaVar.getMeasuredHeight() + measuredHeight);
        }
        float f = 12;
        int iC = u45.c(f, vw4.d().getDisplayMetrics().density, uxaVar.getMeasuredWidth() + getPaddingStart());
        boolean z2 = bitSet.get(this.M0);
        TextView textView = this.b;
        if (z2) {
            m8j.e(textView, this, iC, getPaddingTop(), textView.getMeasuredWidth() + iC, getPaddingTop() + textView.getMeasuredHeight());
        }
        float measuredHeight2 = (textView.getMeasuredHeight() / 2.0f) + textView.getTop();
        View view = this.I0;
        int measuredHeight3 = (int) (measuredHeight2 - (view.getMeasuredHeight() / 2.0f));
        if (bitSet.get(this.S0)) {
            m8j.e(view, this, (z2 ? u45.c(4, vw4.d().getDisplayMetrics().density, textView.getMeasuredWidth()) : 0) + iC, measuredHeight3, view.getMeasuredWidth() + iC + (z2 ? u45.c(4, vw4.d().getDisplayMetrics().density, textView.getMeasuredWidth()) : 0), view.getMeasuredHeight() + measuredHeight3);
        }
        int iC2 = u45.c(f, vw4.d().getDisplayMetrics().density, uxaVar.getMeasuredWidth() + getPaddingStart());
        int iC3 = u45.c(2, vw4.d().getDisplayMetrics().density, textView.getBottom());
        if (bitSet.get(this.N0) && (activeSubtitleView = getActiveSubtitleView()) != null && (asView2 = activeSubtitleView.getAsView()) != null) {
            ga5 activeSubtitleView2 = getActiveSubtitleView();
            int measuredWidth = ((activeSubtitleView2 == null || (asView4 = activeSubtitleView2.getAsView()) == null) ? 0 : asView4.getMeasuredWidth()) + iC2;
            ga5 activeSubtitleView3 = getActiveSubtitleView();
            cri.b(asView2, iC2, iC3, measuredWidth, ((activeSubtitleView3 == null || (asView3 = activeSubtitleView3.getAsView()) == null) ? 0 : asView3.getMeasuredHeight()) + iC3);
        }
        if (bitSet.get(this.U0) && (activeTypingView = getActiveTypingView()) != null && (asView = activeTypingView.getAsView()) != null) {
            cri.c(asView, iC2, iC3, 0, 12);
        }
        int measuredWidth2 = getMeasuredWidth() - getPaddingEnd();
        float measuredHeight4 = (textView.getMeasuredHeight() / 2.0f) + textView.getTop();
        View view2 = this.H0;
        int measuredHeight5 = (int) (measuredHeight4 - (view2.getMeasuredHeight() / 2.0f));
        int i5 = this.R0;
        if (bitSet.get(i5)) {
            m8j.e(view2, this, measuredWidth2 - view2.getMeasuredWidth(), measuredHeight5, measuredWidth2, view2.getMeasuredHeight() + measuredHeight5);
        }
        int iQ = bitSet.get(i5) ? u45.q(4, vw4.d().getDisplayMetrics().density, measuredWidth2 - view2.getMeasuredWidth()) : getMeasuredWidth() - getPaddingEnd();
        float measuredHeight6 = (textView.getMeasuredHeight() / 2.0f) + textView.getTop();
        TextView textView2 = this.t0;
        int measuredHeight7 = (int) (measuredHeight6 - (textView2.getMeasuredHeight() / 2.0f));
        if (bitSet.get(this.O0)) {
            m8j.e(textView2, this, iQ - textView2.getMeasuredWidth(), measuredHeight7, iQ, textView2.getMeasuredHeight() + measuredHeight7);
        }
        int measuredWidth3 = getMeasuredWidth() - getPaddingEnd();
        int i6 = this.P0;
        boolean z3 = bitSet.get(i6);
        ina inaVar = this.u0;
        if (z3) {
            int iQ2 = u45.q(1, vw4.d().getDisplayMetrics().density, iC3);
            m8j.e(inaVar, this, measuredWidth3 - inaVar.getMeasuredWidth(), iQ2, measuredWidth3, inaVar.getMeasuredHeight() + iQ2);
        }
        if (bitSet.get(i6)) {
            measuredWidth3 = u45.q(4, vw4.d().getDisplayMetrics().density, measuredWidth3 - inaVar.getMeasuredWidth());
        }
        if (bitSet.get(this.T0)) {
            View view3 = this.J0;
            m8j.e(view3, this, measuredWidth3 - view3.getMeasuredWidth(), iC3, measuredWidth3, view3.getMeasuredHeight() + iC3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0209  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc2.onMeasure(int, int):void");
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Drawable drawable;
        Drawable drawable2;
        te teVar;
        Drawable drawable3;
        v1a v1aVar = a93.s0;
        this.a.onThemeChanged(yebVar);
        int i = yebVar.getText().e;
        TextView textView = this.b;
        textView.setTextColor(i);
        ga5 activeSubtitleView = getActiveSubtitleView();
        if (activeSubtitleView != null) {
            activeSubtitleView.setTextColor(yebVar.getText().g);
        }
        int i2 = yebVar.getText().i;
        TextView textView2 = this.t0;
        textView2.setTextColor(i2);
        this.u0.onThemeChanged(yebVar);
        cei.k(this.H0.getBackground(), yebVar.getIcon().h);
        cei.k(this.I0.getBackground(), yebVar.getIcon().h);
        ?? r1 = this.x0;
        k18 k18Var = r1.e() ? r1 : null;
        if (k18Var != null && (drawable3 = (Drawable) k18Var.getValue()) != null) {
            cei.k(drawable3, yebVar.getIcon().k);
        }
        ?? r4 = this.w0;
        boolean zE = r4.e();
        k18 k18Var2 = r4;
        if (!zE) {
            k18Var2 = null;
        }
        if (k18Var2 != null && (teVar = (te) k18Var2.getValue()) != null) {
            teVar.d(v1aVar.y(this).getIcon().j, this.L0.get(this.R0) ? v1aVar.x(getContext()).k().b().n : v1aVar.x(getContext()).k().b().l);
        }
        boolean zE2 = r1.e();
        k18 k18Var3 = r1;
        if (!zE2) {
            k18Var3 = null;
        }
        if (k18Var3 != null && (drawable2 = (Drawable) k18Var3.getValue()) != null) {
            cei.k(drawable2, yebVar.getIcon().k);
        }
        ?? r12 = this.y0;
        boolean zE3 = r12.e();
        k18 k18Var4 = r12;
        if (!zE3) {
            k18Var4 = null;
        }
        if (k18Var4 != null && (drawable = (Drawable) k18Var4.getValue()) != null) {
            cei.k(drawable, yebVar.getIcon().k);
        }
        ?? r13 = this.z0;
        boolean zE4 = r13.e();
        k18 k18Var5 = r13;
        if (!zE4) {
            k18Var5 = null;
        }
        Drawable drawable4 = k18Var5 != null ? (Drawable) k18Var5.getValue() : null;
        EnhancedVectorDrawable enhancedVectorDrawable = drawable4 instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable4 : null;
        if (enhancedVectorDrawable != null) {
            z18.e(enhancedVectorDrawable, NegotiationErrorStat.KEY_ERROR, yebVar.b().a.f);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(yebVar.c().a.a.i));
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), u6g.class) : null;
        if (spans == null) {
            spans = new u6g[0];
        }
        for (Object obj : spans) {
            u6g u6gVar = (u6g) obj;
            u6gVar.onThemeChanged(yebVar);
            b6g.b(textView, u6gVar);
        }
        ga5 activeSubtitleView2 = getActiveSubtitleView();
        if (activeSubtitleView2 != null) {
            activeSubtitleView2.c(yebVar);
        }
        CharSequence text2 = textView2.getText();
        Spanned spanned2 = text2 instanceof Spanned ? (Spanned) text2 : null;
        Object[] spans2 = spanned2 != null ? spanned2.getSpans(0, textView2.getText().length(), u6g.class) : null;
        if (spans2 == null) {
            spans2 = new u6g[0];
        }
        for (Object obj2 : spans2) {
            u6g u6gVar2 = (u6g) obj2;
            u6gVar2.onThemeChanged(yebVar);
            b6g.b(textView2, u6gVar2);
        }
        Animatable animatable = this.A0;
        u6g u6gVar3 = animatable instanceof u6g ? (u6g) animatable : null;
        if (u6gVar3 != null) {
            u6gVar3.onThemeChanged(yebVar);
        }
        ga5 activeTypingView = getActiveTypingView();
        if (activeTypingView != null) {
            activeTypingView.c(v1aVar.y(this));
        }
        invalidate();
    }

    public final void setAvatarClickListener(View.OnClickListener onClickListener) {
        f8j.d(this.a, 300L, onClickListener);
    }

    public final void setCall(CharSequence charSequence) {
        boolean z = charSequence == null || vmf.F(charSequence);
        BitSet bitSet = this.L0;
        int i = this.T0;
        bitSet.set(i, !z);
        this.K0.set(i, true);
        requestLayout();
    }

    public final void setCallBadge(boolean z) {
        this.a.setCallBadgeVisibility(z);
        this.K0.set(0, true);
        requestLayout();
    }

    public final void setMention(boolean z) {
        this.u0.c(z);
        BitSet bitSet = this.L0;
        int i = this.P0;
        bitSet.set(i, bitSet.get(i) || z);
        c(this.K0, true);
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMuted(boolean r13) {
        /*
            r12 = this;
            java.util.BitSet r0 = r12.L0
            int r1 = r12.S0
            r0.set(r1, r13)
            java.util.BitSet r2 = r12.K0
            boolean r3 = r2.get(r1)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L25
            android.view.View r3 = r12.I0
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L1b
            r3 = r5
            goto L1c
        L1b:
            r3 = r4
        L1c:
            boolean r6 = r0.get(r1)
            if (r3 == r6) goto L23
            goto L25
        L23:
            r3 = r4
            goto L26
        L25:
            r3 = r5
        L26:
            r2.set(r1, r3)
            ina r1 = r12.u0
            hna r6 = r1.d
            boolean r3 = r6.d
            r9 = 0
            r11 = 7
            r7 = 0
            r8 = 0
            r10 = r13
            hna r13 = defpackage.hna.a(r6, r7, r8, r9, r10, r11)
            r1.d = r13
            if (r3 == r10) goto L45
            v1a r13 = defpackage.a93.s0
            yeb r13 = r13.y(r1)
            r1.b(r10, r13)
        L45:
            int r13 = r12.P0
            boolean r1 = r0.get(r13)
            if (r1 != 0) goto L4f
            if (r10 == 0) goto L50
        L4f:
            r4 = r5
        L50:
            r0.set(r13, r4)
            r2.set(r13, r5)
            r12.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc2.setMuted(boolean):void");
    }

    public final void setOnline(boolean z) {
        this.a.setOnlineBadgeVisibility(z);
        this.K0.set(0, true);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k18] */
    public final void setPinned(boolean z) {
        te teVar;
        this.L0.set(this.R0, z);
        ?? r4 = this.w0;
        boolean zE = r4.e();
        k18 k18Var = r4;
        if (!zE) {
            k18Var = null;
        }
        if (k18Var != null && (teVar = (te) k18Var.getValue()) != null) {
            v1a v1aVar = a93.s0;
            teVar.d(v1aVar.y(this).getIcon().j, v1aVar.x(getContext()).k().b().n);
        }
        requestLayout();
    }

    public final void setReaction(boolean z) {
        this.u0.d(z);
        BitSet bitSet = this.L0;
        int i = this.P0;
        bitSet.set(i, bitSet.get(i) || z);
        c(this.K0, true);
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, k18] */
    public final void setStatus(sc2 sc2Var) {
        Animatable animatable;
        int iOrdinal = sc2Var.ordinal();
        if (iOrdinal == 0) {
            animatable = 0;
        } else if (iOrdinal == 1) {
            animatable = (Drawable) this.w0.getValue();
        } else if (iOrdinal == 2) {
            animatable = (Drawable) this.x0.getValue();
        } else if (iOrdinal == 3) {
            animatable = (Drawable) this.y0.getValue();
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            animatable = (Drawable) this.z0.getValue();
        }
        if (animatable != 0) {
            u6g u6gVar = animatable instanceof u6g ? animatable : null;
            if (u6gVar != null) {
                u6gVar.onThemeChanged(a93.s0.y(this));
            }
        } else {
            animatable = 0;
        }
        Animatable animatable2 = animatable instanceof Animatable ? animatable : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        boolean z = this.v0 != animatable;
        if (animatable != 0) {
            float f = 16;
            animatable.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        }
        boolean z2 = this.v0 != animatable;
        BitSet bitSet = this.K0;
        int i = this.Q0;
        bitSet.set(i, z2);
        this.v0 = animatable;
        this.L0.set(i, animatable != 0);
        invalidate();
        if (z) {
            requestLayout();
        }
    }

    public final void setSubtitle(u4g u4gVar) {
        getSubtitleView().setLayout(u4gVar);
        boolean zF = vmf.F(u4gVar.a.a().getText());
        BitSet bitSet = this.L0;
        e(bitSet, (zF || bitSet.get(this.U0)) ? false : true);
        e(this.K0, true);
        invalidate();
        requestLayout();
    }

    public final void setTime(CharSequence charSequence) {
        TextView textView = this.t0;
        CharSequence text = textView.getText();
        int i = this.O0;
        BitSet bitSet = this.K0;
        boolean z = true;
        if (text != charSequence) {
            textView.setText(charSequence);
            bitSet.set(i, true);
        }
        boolean z2 = (charSequence == null || vmf.F(charSequence)) ? false : true;
        BitSet bitSet2 = this.L0;
        bitSet2.set(i, z2);
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        requestLayout();
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.b;
        CharSequence text = textView.getText();
        int i = this.M0;
        BitSet bitSet = this.K0;
        boolean z = true;
        if (text != charSequence) {
            textView.setText(charSequence);
            bitSet.set(i, true);
        }
        boolean z2 = (charSequence == null || vmf.F(charSequence)) ? false : true;
        BitSet bitSet2 = this.L0;
        bitSet2.set(i, z2);
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        yeb yebVarY = a93.s0.y(this);
        CharSequence text2 = textView.getText();
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), u6g.class) : null;
        if (spans == null) {
            spans = new u6g[0];
        }
        for (Object obj : spans) {
            u6g u6gVar = (u6g) obj;
            u6gVar.onThemeChanged(yebVarY);
            b6g.b(textView, u6gVar);
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setVerified(boolean r6) {
        /*
            r5 = this;
            v1a r0 = defpackage.a93.s0
            android.widget.TextView r1 = r5.b
            float r2 = defpackage.b6g.e(r1)
            int r2 = defpackage.kpi.r(r2)
            r3 = 0
            if (r6 == 0) goto L27
            xzg r4 = defpackage.b6g.a(r1)
            if (r4 == 0) goto L18
            int r4 = r4.a
            goto L19
        L18:
            r4 = r3
        L19:
            if (r4 != r2) goto L27
            xzg r6 = r5.Y0
            if (r6 == 0) goto L26
            yeb r0 = r0.y(r5)
            r6.onThemeChanged(r0)
        L26:
            return
        L27:
            if (r6 == 0) goto L4a
            xzg r6 = defpackage.b6g.a(r1)
            if (r6 == 0) goto L31
            int r3 = r6.a
        L31:
            if (r3 == r2) goto L4a
            xzg r6 = r5.Y0
            if (r6 == 0) goto L3c
            int r3 = r6.a
            if (r3 != r2) goto L3c
            goto L4b
        L3c:
            xzg r6 = new xzg
            android.content.Context r3 = r5.getContext()
            mni r4 = defpackage.mni.b
            r6.<init>(r3, r2, r4)
            r5.Y0 = r6
            goto L4b
        L4a:
            r6 = 0
        L4b:
            xzg r2 = r5.Y0
            if (r2 == 0) goto L56
            yeb r0 = r0.y(r5)
            r2.onThemeChanged(r0)
        L56:
            defpackage.b6g.d(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc2.setVerified(boolean):void");
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animatable animatable;
        ga5 activeTypingView = getActiveTypingView();
        if (activeTypingView != null && activeTypingView.a() && (animatable = this.A0) != null) {
            animatable.start();
        }
        Object obj = this.v0;
        Animatable animatable2 = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable2 != null) {
            animatable2.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable animatable;
        ga5 activeTypingView = getActiveTypingView();
        if (activeTypingView != null && activeTypingView.a() && (animatable = this.A0) != null) {
            animatable.stop();
        }
        Object obj = this.v0;
        Animatable animatable2 = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
