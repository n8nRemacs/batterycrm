package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class vga extends ViewGroup implements jf4, vde, wad, zk9, qde {
    public static final String G0 = uga.class.getName();
    public static final tga H0 = new tga();
    public final wde A0;
    public final vs8 B0;
    public final bza C0;
    public final ImageView D0;
    public final if4 E0;
    public final qh9 F0;
    public final u9d a;
    public final uk9 b;
    public final ode c;
    public final int d;
    public final int o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public double x0;
    public final int y0;
    public final int z0;

    public vga(Context context) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        ode odeVar = new ode();
        super(context);
        this.a = u9dVar;
        this.b = uk9Var;
        this.c = odeVar;
        float f = 10;
        this.d = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.o = kti.d(8 * vw4.d().getDisplayMetrics().density);
        this.s0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.t0 = kti.d(2 * vw4.d().getDisplayMetrics().density);
        float f2 = 4;
        this.u0 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        this.v0 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        this.w0 = kti.d(f * vw4.d().getDisplayMetrics().density);
        this.x0 = 1.7d;
        float f3 = 40;
        this.y0 = kti.d(vw4.d().getDisplayMetrics().density * f3);
        this.z0 = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        this.A0 = new wde(this);
        vs8 vs8Var = new vs8(context);
        ((gr6) vs8Var.getHierarchy()).h(tyd.f);
        this.B0 = vs8Var;
        bza bzaVar = new bza(context);
        bzaVar.setText(context.getString(l7b.q0));
        this.C0 = bzaVar;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i7b.k);
        v1a v1aVar = a93.s0;
        imageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(imageView).getIcon().k));
        this.D0 = imageView;
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(false);
        this.E0 = if4Var;
        kk4 kk4Var = qh9.s;
        yeb yebVarY = v1aVar.y(this);
        kk4Var.getClass();
        qh9 qh9VarO = kk4.o(yebVarY);
        this.F0 = qh9VarO;
        uk9Var.b = this;
        u9dVar.b = this;
        odeVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
        addView(vs8Var, new ViewGroup.LayoutParams(-1, -2));
        addView(bzaVar, new ViewGroup.LayoutParams(-1, -2));
        addView(imageView, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setBackground(qh9VarO);
    }

    public final void a(jr6 jr6Var) throws NumberFormatException {
        String str;
        this.x0 = jr6Var.i;
        int iOrdinal = a93.s0.y(this).h().ordinal();
        if (iOrdinal == 0) {
            str = jr6Var.g;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = jr6Var.g;
        } else {
            str = jr6Var.h;
        }
        if (str == null || !(!vmf.F(str))) {
            return;
        }
        sf7 sf7VarD = sf7.d(Uri.parse(str));
        sf7VarD.l = H0;
        rf7 rf7VarA = sf7VarD.a();
        int i = OneMeDraweeView.B0;
        this.B0.i(rf7VarA, null);
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.b.d(yt0Var);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!fni.a(view, this.B0)) {
            return super.drawChild(canvas, view, j);
        }
        qh9 qh9Var = this.F0;
        Path path = qh9Var.g;
        if (path == null) {
            path = qh9Var.f;
        }
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.drawChild(canvas, view, j);
            canvas.restoreToCount(iSave);
            return true;
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
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
        this.E0.c(charSequence, false);
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.a.l(yt0Var, z);
    }

    @Override // defpackage.zk9
    public final void m() {
        this.b.m();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iJ;
        wde wdeVar = this.A0;
        boolean zR = dqi.r(wdeVar.b);
        int i5 = this.d;
        if (zR) {
            int iA = wdeVar.a() + i5;
            wdeVar.c(i5, i5);
            iJ = iA + this.v0;
        } else {
            iJ = 0;
        }
        ode odeVar = this.c;
        if (dqi.r(odeVar.c) && dqi.r(wdeVar.b)) {
            odeVar.W((getMeasuredWidth() - i5) - odeVar.N(), ((wdeVar.a() / 2) - (odeVar.M() / 2)) + i5);
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            if (iJ == 0) {
                iJ += i5;
            }
            uk9Var.W(i5, iJ);
            iJ = utb.j(4, vw4.d().getDisplayMetrics().density, uk9Var.M(), iJ);
        }
        vs8 vs8Var = this.B0;
        cri.c(vs8Var, 0, iJ, 0, 12);
        cri.c(this.D0, (vs8Var.getMeasuredWidth() / 2) - (this.z0 / 2), u45.q(37, vw4.d().getDisplayMetrics().density, (vs8Var.getMeasuredHeight() / 2) + iJ), 0, 12);
        int measuredHeight = vs8Var.getMeasuredHeight();
        int i6 = this.s0;
        int i7 = measuredHeight + i6 + iJ;
        bza bzaVar = this.C0;
        cri.c(bzaVar, i6, i7, 0, 12);
        int measuredHeight2 = bzaVar.getMeasuredHeight() + this.t0 + i7;
        int measuredWidth = getMeasuredWidth();
        if4 if4Var = this.E0;
        cri.c(if4Var, (measuredWidth - if4Var.getMeasuredWidth()) - this.w0, measuredHeight2, 0, 12);
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.W(u9dVar.Y ? getMeasuredWidth() - u9dVar.N() : 0, utb.j(10, vw4.d().getDisplayMetrics().density, if4Var.getMeasuredHeight(), measuredHeight2));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iJ;
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        ode odeVar = this.c;
        boolean zR = dqi.r(odeVar.c);
        wde wdeVar = this.A0;
        if (zR && dqi.r(wdeVar.b)) {
            odeVar.Y(iMakeMeasureSpec, i2);
        }
        boolean zR2 = dqi.r(wdeVar.b);
        int i3 = this.d;
        if (zR2) {
            wdeVar.d(iMakeMeasureSpec, i2);
            iJ = wdeVar.a() + this.v0 + i3;
        } else {
            iJ = 0;
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            if (iJ == 0) {
                iJ += i3;
            }
            uk9Var.Y(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iJ = utb.j(4, vw4.d().getDisplayMetrics().density, uk9Var.M(), iJ);
        }
        if4 if4Var = this.E0;
        if4Var.measure(i, i2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((int) (size / this.x0), 1073741824);
        vs8 vs8Var = this.B0;
        vs8Var.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
        int measuredHeight = vs8Var.getMeasuredHeight() + iJ;
        int i4 = this.s0;
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - (i4 * 2), 1073741824);
        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(this.y0, 1073741824);
        bza bzaVar = this.C0;
        bzaVar.measure(iMakeMeasureSpec4, iMakeMeasureSpec5);
        int measuredHeight2 = if4Var.getMeasuredHeight() + bzaVar.getMeasuredHeight() + i4 + this.t0 + this.u0 + measuredHeight;
        u9d u9dVar = this.a;
        boolean zR3 = dqi.r(u9dVar.c);
        qh9 qh9Var = this.F0;
        if (zR3) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            int iM = u9dVar.M() + kti.d(10 * vw4.d().getDisplayMetrics().density) + this.o;
            measuredHeight2 += iM;
            qh9Var.q = iM;
        } else {
            qh9Var.q = 0.0f;
        }
        int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(this.z0, 1073741824);
        this.D0.measure(iMakeMeasureSpec6, iMakeMeasureSpec6);
        setMeasuredDimension(size, measuredHeight2);
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
        this.E0.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.E0.setStatus$message_list_release(ghhVar);
    }

    public final void setExternalMapButtonClickListener(View.OnClickListener onClickListener) {
        f8j.d(this.C0, 300L, onClickListener);
    }

    public final void setExternalMapButtonText(CharSequence charSequence) {
        this.C0.setText(charSequence);
    }

    @Override // defpackage.zk9
    public void setForwardClickListener(sm6 sm6Var) {
        this.b.o = sm6Var;
    }

    @Override // defpackage.jf4
    public void setIsChannelMode(boolean z) {
        this.E0.setChannelMode$message_list_release(z);
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
        this.A0.e(layout);
    }

    @Override // defpackage.vde
    public void setSenderNameColor(int i) {
        this.A0.f(i);
    }

    @Override // defpackage.wad
    public void setStackFromEnd(boolean z) {
        this.a.Y = z;
    }
}
