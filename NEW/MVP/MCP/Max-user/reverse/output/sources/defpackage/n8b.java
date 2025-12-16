package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class n8b extends ViewGroup implements u6g {
    public static final /* synthetic */ yy7[] y0;
    public final int a;
    public final BitSet b;
    public final BitSet c;
    public final int d;
    public final int o;
    public final int s0;
    public final qi t0;
    public final bwf u0;
    public final iwe v0;
    public final m28 w0;
    public final ImageView x0;

    static {
        a9a a9aVar = new a9a("icon", "getIcon(Ljava/util/BitSet;)Z");
        vid.a.getClass();
        y0 = new yy7[]{a9aVar, new a9a("title", "getTitle(Ljava/util/BitSet;)Z"), new a9a("subtitle", "getSubtitle(Ljava/util/BitSet;)Z"), new a9a("closeBtn", "getCloseBtn(Ljava/util/BitSet;)Z")};
    }

    public n8b(Context context, int i) {
        int i2;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        super(context, null);
        this.a = i;
        BitSet bitSet = new BitSet(4);
        this.b = bitSet;
        BitSet bitSet2 = new BitSet(4);
        this.c = bitSet2;
        this.d = 1;
        this.o = 2;
        this.s0 = 3;
        this.t0 = new qi(4, this);
        this.u0 = new bwf(new p1b(context, 6));
        iwe iweVar = new iwe(context);
        dpg.k.b(iweVar, t75.b);
        v1a v1aVar = a93.s0;
        iweVar.setTextColor(v1aVar.y(iweVar).getText().j);
        iweVar.setSingleLine();
        iweVar.b.d();
        iweVar.c = false;
        iweVar.invalidate();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        iweVar.setEllipsize(truncateAt);
        if (i == 2) {
            dpg.K.b(iweVar, t75.b);
        }
        this.v0 = iweVar;
        m28 m28Var = new m28(context);
        dpg.i.b(m28Var, t75.b);
        m28Var.setTextColor(v1aVar.y(m28Var).getText().e);
        m28Var.setMaxLinesValue(i == 1 ? 1 : 2);
        m28Var.setEllipsize(truncateAt);
        jgh.a(m28Var);
        if (i == 2) {
            dpg.J.b(m28Var, t75.b);
        }
        this.w0 = m28Var;
        ImageView imageView = new ImageView(context);
        if (i == 2) {
            imageView.setImageDrawable(r34.b(imageView.getContext(), ivd.Q).mutate());
            float f = 12;
            iD = kti.d(vw4.d().getDisplayMetrics().density * f);
            iD2 = kti.d(vw4.d().getDisplayMetrics().density * f);
            i2 = 3;
            iD3 = kti.d(20 * vw4.d().getDisplayMetrics().density);
            iD4 = kti.d(f * vw4.d().getDisplayMetrics().density);
        } else {
            i2 = 3;
            imageView.setImageDrawable(r34.b(imageView.getContext(), yud.w).mutate());
            iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
            iD2 = kti.d(12 * vw4.d().getDisplayMetrics().density);
            iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
            iD4 = kti.d(10 * vw4.d().getDisplayMetrics().density);
        }
        imageView.setPadding(iD, iD4, iD2, iD4);
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(iD2 + iD3 + iD, (iD4 * 2) + iD3));
        imageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(imageView).getIcon().j));
        this.x0 = imageView;
        if (i == 2) {
            addView(getIconView());
        }
        addView(iweVar);
        addView(m28Var);
        addView(imageView);
        if (i == 2) {
            float f2 = 12;
            float f3 = 7;
            setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        } else {
            float f4 = 12;
            float f5 = 5;
            setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(f4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density));
        }
        bitSet.set(0, bitSet.size(), true);
        yy7[] yy7VarArr = y0;
        yy7 yy7Var = yy7VarArr[0];
        bitSet2.set(0, false);
        yy7 yy7Var2 = yy7VarArr[1];
        bitSet2.set(1, false);
        yy7 yy7Var3 = yy7VarArr[i2];
        bitSet2.set(i2, false);
        yy7 yy7Var4 = yy7VarArr[2];
        bitSet2.set(2, false);
    }

    public static bwe b(yeb yebVar) {
        ulc ulcVar = new ulc(4);
        bwe bweVar = (bwe) ulcVar.b;
        bweVar.j = false;
        ulcVar.q(yebVar.getText().j);
        bweVar.d = -1;
        ulcVar.p(1.0f);
        ulcVar.s(kti.d(48 * vw4.d().getDisplayMetrics().density));
        bweVar.m = 1;
        bweVar.l = 2;
        ulcVar.r(500L);
        bweVar.p = new LinearInterpolator();
        bweVar.o = 3500L;
        return ulcVar.k();
    }

    public static boolean c(BitSet bitSet) {
        yy7 yy7Var = y0[0];
        return bitSet.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getIconView() {
        return (ImageView) this.u0.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (c(this.c)) {
            pqi.d(getIconView(), this.t0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (c(this.c)) {
            pqi.f(getIconView(), this.t0);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        BitSet bitSet = this.c;
        if (c(bitSet)) {
            m8j.e(getIconView(), this, getPaddingStart(), (getMeasuredHeight() / 2) - (getIconView().getMeasuredHeight() / 2), getPaddingStart() + getIconView().getMeasuredWidth(), (getMeasuredHeight() / 2) + (getIconView().getMeasuredHeight() / 2));
        }
        int paddingStart = getPaddingStart() + (getIconView().getVisibility() == 0 ? getIconView().getRight() : 0);
        yy7[] yy7VarArr = y0;
        yy7 yy7Var = yy7VarArr[1];
        boolean z2 = bitSet.get(this.d);
        int i5 = this.o;
        iwe iweVar = this.v0;
        if (z2) {
            yy7 yy7Var2 = yy7VarArr[2];
            int paddingTop = bitSet.get(i5) ? getPaddingTop() : (getMeasuredHeight() - iweVar.getMeasuredHeight()) / 2;
            m8j.e(iweVar, this, paddingStart, paddingTop, iweVar.getMeasuredWidth() + paddingStart, iweVar.getMeasuredHeight() + paddingTop);
        }
        yy7 yy7Var3 = yy7VarArr[2];
        if (bitSet.get(i5)) {
            int iC = u45.c(2, vw4.d().getDisplayMetrics().density, iweVar.getBottom());
            m28 m28Var = this.w0;
            m8j.e(m28Var, this, paddingStart, iC, m28Var.getMeasuredWidth() + paddingStart, m28Var.getMeasuredHeight() + iC);
        }
        int measuredWidth = getMeasuredWidth();
        ImageView imageView = this.x0;
        int measuredWidth2 = measuredWidth - imageView.getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2);
        m8j.e(imageView, this, measuredWidth2, measuredHeight, measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        ImageView iconView = getIconView();
        BitSet bitSet = this.c;
        iconView.setVisibility(c(bitSet) ? 0 : 8);
        yy7[] yy7VarArr = y0;
        yy7 yy7Var = yy7VarArr[1];
        int i3 = this.d;
        int i4 = bitSet.get(i3) ? 0 : 8;
        iwe iweVar = this.v0;
        iweVar.setVisibility(i4);
        yy7 yy7Var2 = yy7VarArr[2];
        int i5 = this.o;
        int i6 = bitSet.get(i5) ? 0 : 8;
        m28 m28Var = this.w0;
        m28Var.setVisibility(i6);
        yy7 yy7Var3 = yy7VarArr[3];
        int i7 = this.s0;
        int i8 = bitSet.get(i7) ? 0 : 8;
        ImageView imageView = this.x0;
        imageView.setVisibility(i8);
        yy7 yy7Var4 = yy7VarArr[3];
        if (bitSet.get(i7)) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().height, 1073741824));
        }
        if (c(bitSet)) {
            getIconView().measure(View.MeasureSpec.makeMeasureSpec(getIconView().getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getIconView().getLayoutParams().height, 1073741824));
        }
        int size = View.MeasureSpec.getSize(i);
        int iQ = u45.q(12, vw4.d().getDisplayMetrics().density, (((size - (getIconView().getVisibility() == 0 ? getIconView().getMeasuredWidth() : 0)) - (imageView.getVisibility() == 0 ? imageView.getMeasuredWidth() : 0)) - getPaddingStart()) - getPaddingEnd());
        yy7 yy7Var5 = yy7VarArr[1];
        if (bitSet.get(i3)) {
            iweVar.measure(View.MeasureSpec.makeMeasureSpec(iQ, Integer.MIN_VALUE), 0);
        }
        yy7 yy7Var6 = yy7VarArr[2];
        if (bitSet.get(i5)) {
            m28Var.measure(View.MeasureSpec.makeMeasureSpec(iQ, Integer.MIN_VALUE), 0);
        }
        BitSet bitSet2 = this.b;
        bitSet2.set(0, bitSet2.size(), false);
        if (this.a == 1) {
            iMax = kti.d(52 * vw4.d().getDisplayMetrics().density);
        } else {
            iMax = Math.max(getPaddingBottom() + getPaddingTop() + (iweVar.getVisibility() == 0 ? iweVar.getMeasuredHeight() : 0) + (m28Var.getVisibility() == 0 ? m28Var.getMeasuredHeight() : 0), Math.max(getIconView().getMeasuredHeight(), imageView.getMeasuredHeight()));
        }
        setMeasuredDimension(size, iMax);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int i = yebVar.getText().j;
        iwe iweVar = this.v0;
        iweVar.setTextColor(i);
        if (iweVar.c) {
            iweVar.a(b(yebVar));
        }
        this.w0.setTextColor(yebVar.getText().e);
        this.x0.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().j));
        BitSet bitSet = this.b;
        bitSet.set(0, bitSet.size(), true);
        invalidate();
    }

    public final void setCloseBtnClickListener(View.OnClickListener onClickListener) {
        f8j.d(this.x0, 300L, onClickListener);
    }

    public final void setCloseButtonVisibility(boolean z) {
        yy7[] yy7VarArr = y0;
        yy7 yy7Var = yy7VarArr[3];
        BitSet bitSet = this.b;
        int i = this.s0;
        bitSet.set(i, true);
        yy7 yy7Var2 = yy7VarArr[3];
        this.c.set(i, z);
        requestLayout();
    }

    public final void setIcon(Drawable drawable) {
        ImageView iconView = getIconView();
        qi qiVar = this.t0;
        pqi.f(iconView, qiVar);
        getIconView().setImageDrawable(drawable);
        yy7[] yy7VarArr = y0;
        yy7 yy7Var = yy7VarArr[0];
        this.b.set(0, true);
        boolean z = drawable != null;
        yy7 yy7Var2 = yy7VarArr[0];
        BitSet bitSet = this.c;
        bitSet.set(0, z);
        if (c(bitSet) && isAttachedToWindow()) {
            pqi.d(getIconView(), qiVar);
        }
        requestLayout();
        invalidate();
    }

    public final void setOnPinnedMsgClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setShimmerEnabled(boolean z) {
        iwe iweVar = this.v0;
        if (!z) {
            iweVar.b.d();
            iweVar.b.d();
            iweVar.c = false;
            iweVar.invalidate();
            return;
        }
        iweVar.a(b(a93.s0.y(this)));
        ewe eweVar = iweVar.b;
        eweVar.c();
        iweVar.c = true;
        eweVar.c();
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.w0.setTextValue(charSequence);
        yy7[] yy7VarArr = y0;
        yy7 yy7Var = yy7VarArr[2];
        BitSet bitSet = this.b;
        int i = this.o;
        bitSet.set(i, true);
        boolean z = charSequence.length() > 0;
        yy7 yy7Var2 = yy7VarArr[2];
        this.c.set(i, z);
        requestLayout();
    }

    public final void setTitle(CharSequence charSequence) {
        this.v0.setText(charSequence);
        yy7[] yy7VarArr = y0;
        yy7 yy7Var = yy7VarArr[1];
        BitSet bitSet = this.b;
        int i = this.d;
        bitSet.set(i, true);
        boolean z = charSequence.length() > 0;
        yy7 yy7Var2 = yy7VarArr[1];
        this.c.set(i, z);
        requestLayout();
    }
}
