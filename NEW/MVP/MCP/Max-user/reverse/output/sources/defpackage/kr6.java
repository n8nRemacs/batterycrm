package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class kr6 extends ViewGroup implements jf4, vde, wad, zk9, qde {
    public final int A0;
    public final int B0;
    public final u9d a;
    public final uk9 b;
    public final ode c;
    public yt0 d;
    public final bwf o;
    public final wde s0;
    public final TextView t0;
    public final TextView u0;
    public final AppCompatImageView v0;
    public final if4 w0;
    public final int x0;
    public final int y0;
    public final int z0;

    public kr6(Context context) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        ode odeVar = new ode();
        super(context);
        this.a = u9dVar;
        this.b = uk9Var;
        this.c = odeVar;
        v1a v1aVar = a93.s0;
        this.d = v1aVar.y(this).a().i();
        this.o = new bwf(new e44(23, this));
        this.s0 = new wde(this);
        TextView textView = new TextView(context);
        t5g t5gVar = dpg.a;
        vz2.j.b(textView, t75.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.t0 = textView;
        TextView textView2 = new TextView(context);
        vz2.g.b(textView2, t75.b);
        textView2.setTextColor(getSubtitleColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.u0 = textView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setBackground(getIconBackground());
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iD, iD, iD, iD);
        this.v0 = appCompatImageView;
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(false);
        this.w0 = if4Var;
        this.x0 = kti.d(10 * vw4.d().getDisplayMetrics().density);
        float f = 4;
        this.y0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.z0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.A0 = kti.d(f * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(40 * vw4.d().getDisplayMetrics().density);
        this.B0 = iD2;
        uk9Var.b = this;
        u9dVar.b = this;
        odeVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(iD2, iD2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        kk4 kk4Var = qh9.s;
        yeb yebVarY = v1aVar.y(this);
        kk4Var.getClass();
        setBackground(kk4.o(yebVarY));
    }

    public static ShapeDrawable a(kr6 kr6Var) {
        float f = vw4.d().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(kr6Var.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.o.getValue();
    }

    private final int getIconBackgroundColor() {
        return this.d.a.i;
    }

    private final int getIconColor() {
        return this.d.b.f;
    }

    private final int getSubtitleColor() {
        return this.d.d.f;
    }

    private final int getTitleColor() {
        return this.d.d.e;
    }

    public final void b(jr6 jr6Var, boolean z) {
        this.d = a93.s0.y(this).a().h(z);
        String str = jr6Var.b;
        TextView textView = this.t0;
        textView.setText(str);
        textView.setTextColor(getTitleColor());
        String str2 = jr6Var.c;
        TextView textView2 = this.u0;
        textView2.setText(str2);
        textView2.setTextColor(getSubtitleColor());
        int i = yud.Q;
        AppCompatImageView appCompatImageView = this.v0;
        appCompatImageView.setImageResource(i);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    public final void c(yt0 yt0Var) {
        this.d = yt0Var;
        this.t0.setTextColor(getTitleColor());
        this.u0.setTextColor(getSubtitleColor());
        this.v0.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        int i = this.d.d.m;
        if4 if4Var = this.w0;
        if4Var.setTextColor$message_list_release(i);
        if4Var.setDateViewStatusColor(this.d.d.m);
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.b.d(yt0Var);
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
        this.w0.c(charSequence, false);
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.a.l(yt0Var, z);
    }

    @Override // defpackage.zk9
    public final void m() {
        this.b.m();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM;
        wde wdeVar = this.s0;
        boolean zR = dqi.r(wdeVar.b);
        int i5 = this.x0;
        if (zR) {
            wdeVar.c(i5, i5);
            iM = wdeVar.a() + this.y0 + i5;
        } else {
            iM = i5;
        }
        ode odeVar = this.c;
        if (dqi.r(odeVar.c) && dqi.r(wdeVar.b)) {
            odeVar.W((getMeasuredWidth() - i5) - odeVar.N(), ((wdeVar.a() / 2) - (odeVar.M() / 2)) + i5);
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.W(i5, iM);
            iM += uk9Var.M() + this.A0;
        }
        int i6 = this.B0;
        AppCompatImageView appCompatImageView = this.v0;
        m8j.e(appCompatImageView, this, i5, iM, i5 + i6, iM + i6);
        int i7 = i6 + i5 + i5;
        TextView textView = this.t0;
        m8j.e(textView, this, i7, iM, textView.getMeasuredWidth() + i7, textView.getMeasuredHeight() + iM);
        int measuredHeight = iM + textView.getMeasuredHeight();
        TextView textView2 = this.u0;
        m8j.e(textView2, this, i7, measuredHeight, textView2.getMeasuredWidth() + i7, textView2.getMeasuredHeight() + measuredHeight);
        int bottom = appCompatImageView.getBottom();
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            float f = 10;
            u9dVar.W(kti.d(f * vw4.d().getDisplayMetrics().density), u45.c(f, vw4.d().getDisplayMetrics().density, bottom));
            u9dVar.M();
        }
        int measuredWidth = getMeasuredWidth();
        if4 if4Var = this.w0;
        int measuredWidth2 = (measuredWidth - if4Var.getMeasuredWidth()) - i5;
        int measuredHeight2 = (getMeasuredHeight() - if4Var.getMeasuredHeight()) - this.z0;
        m8j.e(if4Var, this, measuredWidth2, measuredHeight2, if4Var.getMeasuredWidth() + measuredWidth2, if4Var.getMeasuredHeight() + measuredHeight2);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iM;
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.x0;
        int i4 = i3 * 2;
        int i5 = size - i4;
        ode odeVar = this.c;
        boolean zR = dqi.r(odeVar.c);
        wde wdeVar = this.s0;
        int iMax = 0;
        if (zR && dqi.r(wdeVar.b)) {
            odeVar.Y(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            iMax = Math.max(0, odeVar.N());
        }
        if (dqi.r(wdeVar.b)) {
            wdeVar.d(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, wdeVar.b() + i4 + odeVar.j0());
            iM = wdeVar.a() + this.y0 + i3;
        } else {
            iM = i3;
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.Y(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, uk9Var.N() + i4);
            iM += uk9Var.M() + this.A0;
        }
        if4 if4Var = this.w0;
        if4Var.measure(i, i2);
        this.v0.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i2);
        int i6 = this.B0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i5 - i6) - i4, Integer.MIN_VALUE);
        TextView textView = this.t0;
        textView.measure(iMakeMeasureSpec, i2);
        TextView textView2 = this.u0;
        textView2.measure(iMakeMeasureSpec, i2);
        int iMax2 = Math.max(Math.min(i5, if4Var.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), textView2.getMeasuredWidth()) + i6) + i3, iMax);
        int measuredHeight = if4Var.getMeasuredHeight() + u45.c(2, vw4.d().getDisplayMetrics().density, textView.getMeasuredHeight() + textView2.getMeasuredHeight()) + this.z0 + iM;
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            float f = 10;
            iMax2 = Math.max(iMax2, (kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + u9dVar.N());
            measuredHeight = utb.j(f, vw4.d().getDisplayMetrics().density, u9dVar.M(), measuredHeight);
        }
        setMeasuredDimension(iMax2, measuredHeight);
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
        this.w0.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.w0.setStatus$message_list_release(ghhVar);
    }

    @Override // defpackage.zk9
    public void setForwardClickListener(sm6 sm6Var) {
        this.b.o = sm6Var;
    }

    @Override // defpackage.jf4
    public void setIsChannelMode(boolean z) {
        this.w0.setChannelMode$message_list_release(z);
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
