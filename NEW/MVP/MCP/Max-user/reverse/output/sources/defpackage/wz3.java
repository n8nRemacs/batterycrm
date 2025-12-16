package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class wz3 extends ViewGroup implements jf4, vde, wad, zk9, qde {
    public final u9d a;
    public final uk9 b;
    public final ode c;
    public final em6 d;
    public final bwf o;
    public final wde s0;
    public final TextView t0;
    public final TextView u0;
    public final uxa v0;
    public final Object w0;
    public final Object x0;
    public final if4 y0;
    public final int z0;

    public wz3(final Context context, ts9 ts9Var) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        ode odeVar = new ode();
        super(context);
        this.a = u9dVar;
        this.b = uk9Var;
        this.c = odeVar;
        this.d = ts9Var;
        this.o = new bwf(new ps3(5));
        this.s0 = new wde(this);
        TextView textView = new TextView(context);
        t5g t5gVar = dpg.a;
        vz2.j.b(textView, t75.b);
        final int i = 1;
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.t0 = textView;
        TextView textView2 = new TextView(context);
        vz2.g.b(textView2, t75.b);
        this.u0 = textView2;
        uxa uxaVar = new uxa(context);
        this.v0 = uxaVar;
        final int i2 = 0;
        this.w0 = ipi.b(3, new cm6() { // from class: vz3
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return wz3.a(context, this);
                    default:
                        return wz3.b(context, this);
                }
            }
        });
        this.x0 = ipi.b(3, new cm6() { // from class: vz3
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return wz3.a(context, this);
                    default:
                        return wz3.b(context, this);
                }
            }
        });
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(false);
        this.y0 = if4Var;
        this.z0 = 4;
        u9dVar.b = this;
        uk9Var.b = this;
        odeVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        float f = 44;
        addView(uxaVar, new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        kk4 kk4Var = qh9.s;
        yeb yebVarY = a93.s0.y(this);
        kk4Var.getClass();
        setBackground(kk4.o(yebVarY));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public static AppCompatImageView a(Context context, wz3 wz3Var) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setBackground(wz3Var.getIconBackground());
        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iD, iD, iD, iD);
        float f = 32;
        wz3Var.addView(appCompatImageView, new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        appCompatImageView.requestLayout();
        return appCompatImageView;
    }

    public static AppCompatImageView b(Context context, wz3 wz3Var) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setBackground(wz3Var.getIconBackground());
        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iD, iD, iD, iD);
        float f = 32;
        wz3Var.addView(appCompatImageView, new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        appCompatImageView.requestLayout();
        return appCompatImageView;
    }

    public static void e(k18 k18Var, Drawable drawable) {
        if (drawable != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) k18Var.getValue();
            int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
            appCompatImageView.setPadding(iD, iD, iD, iD);
            appCompatImageView.setImageDrawable(drawable);
            appCompatImageView.setVisibility(0);
            return;
        }
        if (k18Var.e()) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) k18Var.getValue();
            appCompatImageView2.setImageDrawable(null);
            appCompatImageView2.setVisibility(8);
        }
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.o.getValue();
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.u0.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.t0.setText(charSequence);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, k18] */
    public final void c(yt0 yt0Var) {
        int i = yt0Var.b.b;
        bu0 bu0Var = yt0Var.d;
        this.t0.setTextColor(bu0Var.e);
        this.u0.setTextColor(bu0Var.f);
        getIconBackground().getPaint().setColor(yt0Var.a.g);
        int i2 = bu0Var.m;
        if4 if4Var = this.y0;
        if4Var.setTextColor$message_list_release(i2);
        if4Var.setDateViewStatusColor(i2);
        ?? r5 = this.x0;
        if (r5.e()) {
            ((AppCompatImageView) r5.getValue()).setImageTintList(ColorStateList.valueOf(i));
        }
        ?? r52 = this.w0;
        if (r52.e()) {
            ((AppCompatImageView) r52.getValue()).setImageTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.b.d(yt0Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    public final void f(final ru3 ru3Var) {
        setTitle(ru3Var.b);
        setSubtitle(ru3Var.g);
        long j = ru3Var.a;
        String str = ru3Var.d;
        CharSequence charSequence = ru3Var.e;
        kxa kxaVar = kxa.a;
        uxa uxaVar = this.v0;
        uxaVar.setAvatarShape(kxaVar);
        uxa.n(uxaVar, str, Long.valueOf(j), charSequence);
        Drawable drawable = ru3Var.i;
        ?? r1 = this.x0;
        e(r1, drawable);
        Drawable drawable2 = ru3Var.h;
        ?? r2 = this.w0;
        e(r2, drawable2);
        if (r1.e()) {
            final int i = 0;
            f8j.d((AppCompatImageView) r1.getValue(), 300L, new View.OnClickListener(this) { // from class: uz3
                public final /* synthetic */ wz3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            em6 em6Var = this.b.d;
                            ru3 ru3Var2 = ru3Var;
                            em6Var.invoke(new sp9(ru3Var2.j, ru3Var2));
                            break;
                        default:
                            em6 em6Var2 = this.b.d;
                            ru3 ru3Var3 = ru3Var;
                            em6Var2.invoke(new tp9(ru3Var3.j, ru3Var3));
                            break;
                    }
                }
            });
        }
        if (r2.e()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) r2.getValue();
            final int i2 = 1;
            f8j.d(appCompatImageView, 300L, new View.OnClickListener(this) { // from class: uz3
                public final /* synthetic */ wz3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            em6 em6Var = this.b.d;
                            ru3 ru3Var2 = ru3Var;
                            em6Var.invoke(new sp9(ru3Var2.j, ru3Var2));
                            break;
                        default:
                            em6 em6Var2 = this.b.d;
                            ru3 ru3Var3 = ru3Var;
                            em6Var2.invoke(new tp9(ru3Var3.j, ru3Var3));
                            break;
                    }
                }
            });
        }
    }

    @Override // defpackage.wad
    public final void g(xl9 xl9Var, boolean z) {
        this.a.g(xl9Var, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.j0();
    }

    @Override // defpackage.jf4
    public final void h(CharSequence charSequence, boolean z) {
        yy7[] yy7VarArr = if4.K0;
        this.y0.c(charSequence, false);
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.a.l(yt0Var, z);
    }

    @Override // defpackage.zk9
    public final void m() {
        this.b.m();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iJ;
        int i5;
        int measuredHeight;
        int iD;
        float f = 8;
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f);
        float f2 = 10;
        int iD3 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int iD4 = kti.d(32 * vw4.d().getDisplayMetrics().density);
        int iD5 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        wde wdeVar = this.s0;
        if (dqi.r(wdeVar.b)) {
            wdeVar.c(iD5, iD3);
            iJ = utb.j(4, vw4.d().getDisplayMetrics().density, wdeVar.a(), iD3);
        } else {
            iJ = iD3;
        }
        ode odeVar = this.c;
        if (dqi.r(odeVar.c) && dqi.r(wdeVar.b)) {
            odeVar.W((getMeasuredWidth() - iD5) - odeVar.N(), ((wdeVar.a() / 2) - (odeVar.M() / 2)) + iD3);
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.W(iD5, iJ);
            iJ = utb.j(4, vw4.d().getDisplayMetrics().density, uk9Var.M(), iJ);
        }
        uxa uxaVar = this.v0;
        int measuredWidth = uxaVar.getMeasuredWidth() + iD2 + iD5;
        TextView textView = this.t0;
        int measuredHeight2 = textView.getMeasuredHeight();
        TextView textView2 = this.u0;
        if (textView2.getMeasuredHeight() + measuredHeight2 > uxaVar.getMeasuredHeight()) {
            cri.c(textView, measuredWidth, iJ, 0, 12);
            cri.c(textView2, measuredWidth, textView.getBottom(), 0, 12);
            iD = kti.d(((textView2.getMeasuredHeight() + textView.getMeasuredHeight()) / 2.0f) + textView.getTop());
            cri.c(uxaVar, iD5, iD - (uxaVar.getMeasuredHeight() / 2), 0, 12);
            measuredHeight = textView2.getMeasuredHeight() + textView.getMeasuredHeight() + iJ;
            i5 = iD2;
        } else {
            cri.c(uxaVar, iD5, iJ, 0, 12);
            int measuredHeight3 = (uxaVar.getMeasuredHeight() / 2) + iJ;
            i5 = iD2;
            cri.b(textView, measuredWidth, measuredHeight3 - textView.getMeasuredHeight(), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + measuredHeight3);
            cri.c(textView2, measuredWidth, measuredHeight3, 0, 12);
            measuredHeight = uxaVar.getMeasuredHeight() + iJ;
            iD = measuredHeight3;
        }
        int i6 = iD - (iD4 / 2);
        int measuredWidth2 = getMeasuredWidth() - iD3;
        ?? r4 = this.x0;
        if (dqi.r(r4)) {
            int i7 = measuredWidth2 - iD4;
            cri.b((AppCompatImageView) r4.getValue(), i7, i6, measuredWidth2, i6 + iD4);
            measuredWidth2 = i7 - i5;
        }
        ?? r42 = this.w0;
        if (dqi.r(r42)) {
            cri.b((AppCompatImageView) r42.getValue(), measuredWidth2 - iD4, i6, measuredWidth2, iD4 + i6);
        }
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.W(kti.d(f2 * vw4.d().getDisplayMetrics().density), u45.c(f, vw4.d().getDisplayMetrics().density, measuredHeight));
            u9dVar.M();
        }
        int measuredWidth3 = getMeasuredWidth();
        if4 if4Var = this.y0;
        int measuredWidth4 = (measuredWidth3 - if4Var.getMeasuredWidth()) - i5;
        int iQ = u45.q(6, vw4.d().getDisplayMetrics().density, getMeasuredHeight() - if4Var.getMeasuredHeight());
        int measuredWidth5 = if4Var.getMeasuredWidth() + measuredWidth4;
        int measuredHeight4 = if4Var.getMeasuredHeight() + iQ;
        View view = (View) if4Var.getParent();
        if (m8j.d(if4Var)) {
            if4Var.layout(view.getMeasuredWidth() - measuredWidth5, iQ, view.getMeasuredWidth() - measuredWidth4, measuredHeight4);
        } else {
            if4Var.layout(measuredWidth4, iQ, measuredWidth5, measuredHeight4);
        }
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iD;
        int size = View.MeasureSpec.getSize(i);
        float f = 10;
        int iD2 = u45.d(f, vw4.d().getDisplayMetrics().density, 2, size);
        int iD3 = kti.d(32 * vw4.d().getDisplayMetrics().density);
        int iD4 = kti.d(44 * vw4.d().getDisplayMetrics().density);
        float f2 = 8;
        int iD5 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int iD6 = kti.d(vw4.d().getDisplayMetrics().density * f);
        int i3 = iD3 + iD5;
        Integer numValueOf = Integer.valueOf(i3);
        ?? r13 = this.x0;
        if (!dqi.r(r13)) {
            numValueOf = num;
        }
        int iIntValue = iD2 - numValueOf.intValue();
        Integer numValueOf2 = Integer.valueOf(i3);
        ?? r14 = this.w0;
        int iIntValue2 = (((iIntValue - (dqi.r(r14) ? numValueOf2 : 0).intValue()) - (iD4 + iD5)) - iD6) - iD6;
        ode odeVar = this.c;
        boolean zR = dqi.r(odeVar.c);
        wde wdeVar = this.s0;
        if (zR && dqi.r(wdeVar.b)) {
            odeVar.Y(View.MeasureSpec.makeMeasureSpec(iD2, Integer.MIN_VALUE), i2);
        }
        if (dqi.r(wdeVar.b)) {
            wdeVar.d(View.MeasureSpec.makeMeasureSpec(iD2, Integer.MIN_VALUE), i2);
            iD = u45.c(this.z0, vw4.d().getDisplayMetrics().density, wdeVar.a() + iD5);
        } else {
            iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.Y(View.MeasureSpec.makeMeasureSpec(iD2, Integer.MIN_VALUE), i2);
            iD += uk9Var.M();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iD4, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iD4, 1073741824);
        uxa uxaVar = this.v0;
        uxaVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iIntValue2, 1073741824);
        TextView textView = this.t0;
        textView.measure(iMakeMeasureSpec3, i2);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iIntValue2, Integer.MIN_VALUE);
        TextView textView2 = this.u0;
        textView2.measure(iMakeMeasureSpec4, i2);
        if (dqi.r(r13)) {
            ((AppCompatImageView) r13.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iD3, 1073741824), i2);
        }
        if (dqi.r(r14)) {
            ((AppCompatImageView) r14.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iD3, 1073741824), i2);
        }
        int iMax = Math.max(uxaVar.getMeasuredHeight(), textView2.getMeasuredHeight() + textView.getMeasuredHeight()) + iD;
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(iD2, Integer.MIN_VALUE), i2);
            iMax = utb.j(f2, vw4.d().getDisplayMetrics().density, u9dVar.M(), iMax);
        }
        if4 if4Var = this.y0;
        if4Var.measure(i, i2);
        float f3 = 6;
        setMeasuredDimension(size, (!dqi.r(u9dVar.c) || u45.c(f, vw4.d().getDisplayMetrics().density, if4Var.getMeasuredWidth() + u45.c(f3, vw4.d().getDisplayMetrics().density, u9dVar.N())) >= iD2) ? utb.j(f3, vw4.d().getDisplayMetrics().density, if4Var.getMeasuredHeight(), iMax) : u45.c(f, vw4.d().getDisplayMetrics().density, iMax));
    }

    @Override // defpackage.wad
    public final void r(boolean z) {
        this.a.r(z);
    }

    @Override // defpackage.qde
    public void setAlias(Layout layout) {
        this.c.setAlias(layout);
    }

    @Override // defpackage.qde
    public void setAliasColor(int i) {
        this.c.setAliasColor(i);
    }

    @Override // defpackage.wad
    public void setChipObserver(y8d y8dVar) {
        this.a.setChipObserver(y8dVar);
    }

    @Override // defpackage.jf4
    public void setCountView(CharSequence charSequence) {
        this.y0.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.y0.setStatus$message_list_release(ghhVar);
    }

    @Override // defpackage.zk9
    public void setForwardClickListener(sm6 sm6Var) {
        this.b.o = sm6Var;
    }

    @Override // defpackage.jf4
    public void setIsChannelMode(boolean z) {
        this.y0.setChannelMode$message_list_release(z);
    }

    @Override // defpackage.wad
    public void setIsIncoming(boolean z) {
        this.a.d = z;
    }

    @Override // defpackage.zk9
    public void setLink(tk9 tk9Var) {
        this.b.setLink(tk9Var);
    }

    @Override // defpackage.wad
    public void setOnClickListener(em6 em6Var) {
        this.a.o = em6Var;
    }

    @Override // defpackage.zk9
    public void setReplyClickListener(sm6 sm6Var) {
        this.b.d = sm6Var;
    }

    @Override // defpackage.vde
    public void setSenderName(Layout layout) {
        this.s0.e(layout);
    }

    @Override // defpackage.vde
    public void setSenderNameColor(int i) {
        this.s0.f(i);
    }

    @Override // defpackage.wad
    public void setStackFromEnd(boolean z) {
        this.a.Y = z;
    }
}
