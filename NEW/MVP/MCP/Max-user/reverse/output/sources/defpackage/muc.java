package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class muc extends ViewGroup implements u6g {
    public final TextView a;
    public final yta b;
    public final juc c;
    public final Object d;
    public final Paint o;
    public final Object s0;
    public final Object t0;
    public final int u0;
    public final int v0;

    public muc(Context context) {
        super(context);
        TextView textView = new TextView(context);
        dpg.p.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.y(textView).getText().g);
        textView.setSingleLine();
        mfh.k(textView, false);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setFocusable(0);
        this.a = textView;
        yta ytaVar = new yta(context);
        dpg.i.b(ytaVar, t75.b);
        ytaVar.setTextColor(v1aVar.y(ytaVar).getText().h);
        ytaVar.setSingleLine();
        mfh.k(ytaVar, false);
        ytaVar.setEllipsize(truncateAt);
        ytaVar.setFocusable(0);
        jgh.a(ytaVar);
        ytaVar.setVisibility(8);
        this.b = ytaVar;
        juc jucVar = new juc(context);
        jucVar.setVisibility(8);
        this.c = jucVar;
        this.d = ipi.b(3, new p1b(context, 19));
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(v1aVar.y(this).i().h);
        this.o = paint;
        this.s0 = ipi.b(3, new p1b(context, 20));
        this.t0 = ipi.b(3, new p1b(context, 21));
        this.u0 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        float f = 4;
        this.v0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        float f2 = 6;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density));
        addView(textView);
        addView(ytaVar);
        addView(jucVar);
        onThemeChanged(v1aVar.y(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final void setCounter(int i) {
        ?? r0 = this.d;
        w2b w2bVar = (w2b) r0.getValue();
        w2bVar.setVisibility(0);
        w2bVar.g(i, false);
        dqi.a(this, (View) r0.getValue(), null);
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, k18] */
    public final void a(String str, String str2, Integer num, boolean z, boolean z2) {
        juc jucVar = this.c;
        ?? r1 = jucVar.d;
        OneMeDraweeView oneMeDraweeView = jucVar.b;
        jucVar.setVisibility((str == null && (str2 == null || vmf.F(str2)) && num == null && !z2) ? 8 : 0);
        Object obj = null;
        rf7 rf7VarB = str2 != null ? rf7.b(str2) : null;
        int i = OneMeDraweeView.B0;
        oneMeDraweeView.i(rf7VarB, null);
        ((gr6) oneMeDraweeView.getHierarchy()).m(z ? vtd.a() : null);
        if (z2) {
            oneMeDraweeView.setVisibility(0);
            oneMeDraweeView.i(null, null);
            ((gr6) oneMeDraweeView.getHierarchy()).i((Drawable) jucVar.s0.getValue(), 1);
            jucVar.setPadding(0, 0, 0, 0);
            return;
        }
        if (str2 != null && !vmf.F(str2)) {
            oneMeDraweeView.setVisibility(0);
            if (r1.e()) {
                ((View) r1.getValue()).setVisibility(8);
            }
            ((gr6) oneMeDraweeView.getHierarchy()).i(null, 1);
            jucVar.setPadding(0, 0, 0, 0);
            return;
        }
        if (str == null) {
            if (num != null) {
                oneMeDraweeView.setVisibility(0);
                if (r1.e()) {
                    ((View) r1.getValue()).setVisibility(8);
                }
                gr6 gr6Var = (gr6) oneMeDraweeView.getHierarchy();
                Context context = jucVar.getContext();
                int iIntValue = num.intValue();
                v1a v1aVar = a93.s0;
                gr6Var.i(cei.h(iIntValue, v1aVar.y(jucVar).getIcon().i, context), 1);
                int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                jucVar.setPadding(iD, iD, iD, iD);
                jucVar.setBackgroundColor(v1aVar.y(jucVar).b().a.h);
                return;
            }
            return;
        }
        oneMeDraweeView.setVisibility(8);
        ((View) r1.getValue()).setVisibility(0);
        jucVar.setPadding(0, 0, 0, 0);
        int iG = vmf.G(str, '.', 0, 6);
        if (iG != -1) {
            str = str.substring(iG + 1, str.length());
        }
        Iterator it = ev5.c.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                break;
            }
            Object next = f2Var.next();
            if (dnf.n(((ev5) next).name(), str, true)) {
                obj = next;
                break;
            }
        }
        gv5 gv5VarB = (ev5) obj;
        if (gv5VarB == null) {
            fv5 fv5Var = fv5.c;
            gv5VarB = fbj.b(str);
        }
        ((pw5) jucVar.c.getValue()).a(gv5VarB);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float paddingStart;
        float measuredWidth;
        float strokeWidth;
        float f;
        boolean zD = m8j.d(this);
        ?? r2 = this.s0;
        Paint paint = this.o;
        if (zD) {
            if (dqi.r(r2)) {
                f = 2;
                measuredWidth = u45.q(f, vw4.d().getDisplayMetrics().density, (getMeasuredWidth() - getPaddingEnd()) - dqi.m(r2));
                strokeWidth = paint.getStrokeWidth();
            } else {
                measuredWidth = getMeasuredWidth() - getPaddingEnd();
                strokeWidth = paint.getStrokeWidth();
                f = 2;
            }
            paddingStart = measuredWidth - (strokeWidth / f);
        } else if (dqi.r(r2)) {
            int iM = dqi.m(r2) + getPaddingStart();
            paddingStart = (paint.getStrokeWidth() / 2) + u45.c(r0, vw4.d().getDisplayMetrics().density, iM);
        } else {
            paddingStart = getPaddingStart() + (paint.getStrokeWidth() / 2);
        }
        float f2 = paddingStart;
        canvas.drawLine(f2, getPaddingTop(), f2, getMeasuredHeight() - getPaddingBottom(), paint);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ?? r0 = this.d;
        if (r0.e() && view == r0.getValue() && this.c.getVisibility() != 0) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final TextView getTitleView() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        ?? r6 = this.s0;
        if (dqi.r(r6)) {
            ImageView imageView = (ImageView) r6.getValue();
            cri.b(imageView, paddingStart, (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2), imageView.getMeasuredWidth() + paddingStart, (imageView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            paddingStart = utb.j(2, vw4.d().getDisplayMetrics().density, imageView.getMeasuredWidth(), paddingStart);
        }
        int iD = kti.d(this.o.getStrokeWidth());
        int i5 = this.u0;
        int measuredWidth = iD + i5 + paddingStart;
        juc jucVar = this.c;
        if (jucVar.getVisibility() == 0) {
            cri.b(jucVar, measuredWidth, (getMeasuredHeight() / 2) - (jucVar.getMeasuredHeight() / 2), jucVar.getMeasuredWidth() + measuredWidth, (jucVar.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            measuredWidth += jucVar.getMeasuredWidth() + i5;
            ?? r7 = this.d;
            if (r7.e()) {
                w2b w2bVar = (w2b) r7.getValue();
                float f = 2;
                cri.b(w2bVar, u45.q(f, vw4.d().getDisplayMetrics().density, jucVar.getLeft()), u45.c(f, vw4.d().getDisplayMetrics().density, jucVar.getBottom()) - w2bVar.getMeasuredHeight(), w2bVar.getMeasuredWidth() + u45.q(f, vw4.d().getDisplayMetrics().density, jucVar.getLeft()), u45.c(f, vw4.d().getDisplayMetrics().density, jucVar.getBottom()));
            }
        }
        yta ytaVar = this.b;
        int visibility = ytaVar.getVisibility();
        TextView textView = this.a;
        if (visibility == 0) {
            float f2 = 4;
            cri.c(textView, measuredWidth, u45.c(f2, vw4.d().getDisplayMetrics().density, getPaddingTop()), 0, 12);
            int iQ = u45.q(f2, vw4.d().getDisplayMetrics().density, getMeasuredHeight() - getPaddingBottom());
            cri.b(ytaVar, measuredWidth, iQ - ytaVar.getMeasuredHeight(), ytaVar.getMeasuredWidth() + measuredWidth, iQ);
        } else {
            cri.b(textView, measuredWidth, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), textView.getMeasuredWidth() + measuredWidth, (textView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
        ?? r5 = this.t0;
        if (dqi.r(r5)) {
            ImageView imageView2 = (ImageView) r5.getValue();
            int iQ2 = u45.q(36, vw4.d().getDisplayMetrics().density, getMeasuredWidth() - getPaddingEnd());
            cri.b(imageView2, iQ2, (getMeasuredHeight() / 2) - (imageView2.getMeasuredHeight() / 2), imageView2.getMeasuredWidth() + iQ2, (imageView2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = vw4.d().getDisplayMetrics().density * 2.0f;
        Paint paint = this.o;
        paint.setStrokeWidth(f);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int iD = kti.d(paint.getStrokeWidth()) + getPaddingStart();
        int i3 = this.u0;
        int paddingEnd = getPaddingEnd() + iD + i3;
        ?? r0 = this.s0;
        if (dqi.r(r0)) {
            int iD2 = kti.d(40 * vw4.d().getDisplayMetrics().density);
            ((ImageView) r0.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iD2, 1073741824), View.MeasureSpec.makeMeasureSpec(iD2, 1073741824));
            paddingEnd = utb.j(2, vw4.d().getDisplayMetrics().density, ((ImageView) r0.getValue()).getMeasuredWidth(), paddingEnd);
        }
        juc jucVar = this.c;
        if (jucVar.getVisibility() == 0) {
            int iD3 = kti.d(40 * vw4.d().getDisplayMetrics().density);
            jucVar.measure(View.MeasureSpec.makeMeasureSpec(iD3, 1073741824), View.MeasureSpec.makeMeasureSpec(iD3, 1073741824));
            paddingEnd += jucVar.getMeasuredWidth() + i3;
            ?? r10 = this.d;
            if (r10.e()) {
                ((w2b) r10.getValue()).measure(0, 0);
            }
        }
        ?? r102 = this.t0;
        if (dqi.r(r102)) {
            int iD4 = kti.d(36 * vw4.d().getDisplayMetrics().density);
            ((ImageView) r102.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iD4, 1073741824), View.MeasureSpec.makeMeasureSpec(iD4, 1073741824));
            paddingEnd = utb.j(6, vw4.d().getDisplayMetrics().density, ((ImageView) r102.getValue()).getMeasuredWidth(), paddingEnd);
        }
        int i4 = size - paddingEnd;
        if (i4 < 0) {
            i4 = 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        TextView textView = this.a;
        textView.measure(iMakeMeasureSpec, 0);
        int measuredHeight = textView.getMeasuredHeight() + getPaddingTop() + getPaddingBottom();
        int i5 = this.v0;
        int measuredHeight2 = (i5 * 2) + measuredHeight;
        yta ytaVar = this.b;
        if (ytaVar.getVisibility() == 0) {
            ytaVar.measure(iMakeMeasureSpec, 0);
            measuredHeight2 += ytaVar.getMeasuredHeight() + i5;
        }
        if (jucVar.getVisibility() == 0) {
            setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + (kti.d(2 * vw4.d().getDisplayMetrics().density) * 2) + jucVar.getMeasuredHeight());
        } else {
            setMeasuredDimension(size, measuredHeight2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.setTextColor(yebVar.getText().g);
        this.b.setTextColor(yebVar.getText().h);
        this.o.setColor(yebVar.i().h);
        ?? r0 = this.d;
        if (r0.e()) {
            ((w2b) r0.getValue()).f(yebVar);
        }
        ?? r02 = this.s0;
        if (r02.e()) {
            ((ImageView) r02.getValue()).setImageTintList(ColorStateList.valueOf(yebVar.getIcon().k));
        }
        ?? r03 = this.t0;
        if (r03.e()) {
            ((ImageView) r03.getValue()).setImageTintList(ColorStateList.valueOf(yebVar.getIcon().i));
        }
        juc jucVar = this.c;
        ?? r1 = jucVar.s0;
        OneMeDraweeView oneMeDraweeView = jucVar.b;
        ?? r3 = jucVar.o;
        ?? r04 = jucVar.c;
        if (r04.e()) {
            ((pw5) r04.getValue()).onThemeChanged(yebVar);
        }
        if (((gr6) oneMeDraweeView.getHierarchy()).e.c(1) != null) {
            oneMeDraweeView.setBackgroundColor(yebVar.b().a.h);
        }
        if (r3.e() && ((LayerDrawable) r3.getValue()).getNumberOfLayers() > 1) {
            LayerDrawable layerDrawable = (LayerDrawable) r3.getValue();
            int i = yebVar.b().f;
            Drawable drawable = layerDrawable.getDrawable(0);
            cei.k(drawable, i);
            layerDrawable.setDrawable(0, drawable);
            LayerDrawable layerDrawable2 = (LayerDrawable) r3.getValue();
            int i2 = yebVar.getIcon().b;
            Drawable drawable2 = layerDrawable2.getDrawable(1);
            cei.k(drawable2, i2);
            layerDrawable2.setDrawable(1, drawable2);
        }
        if (!r1.e() || ((LayerDrawable) r1.getValue()).getNumberOfLayers() <= 1) {
            return;
        }
        LayerDrawable layerDrawable3 = (LayerDrawable) r3.getValue();
        int i3 = yebVar.a().i().a.m;
        Drawable drawable3 = layerDrawable3.getDrawable(0);
        cei.k(drawable3, i3);
        layerDrawable3.setDrawable(0, drawable3);
        LayerDrawable layerDrawable4 = (LayerDrawable) r3.getValue();
        int i4 = yebVar.getIcon().j;
        Drawable drawable4 = layerDrawable4.getDrawable(1);
        cei.k(drawable4, i4);
        layerDrawable4.setDrawable(1, drawable4);
    }

    public final void setAttachDescription(az azVar) {
        muc mucVar;
        boolean z;
        setBody(azVar != null ? azVar.a : null);
        String str = azVar != null ? azVar.b : null;
        String str2 = azVar != null ? azVar.c : null;
        Integer num = azVar != null ? azVar.d : null;
        boolean z2 = azVar != null && azVar.f;
        if (azVar == null || !azVar.g) {
            mucVar = this;
            z = false;
        } else {
            z = true;
            mucVar = this;
        }
        mucVar.a(str, str2, num, z2, z);
        setCounter(azVar != null ? azVar.e : null);
    }

    public final void setBody(CharSequence charSequence) {
        yta ytaVar = this.b;
        if (charSequence == null || vmf.F(charSequence)) {
            ytaVar.setVisibility(8);
            return;
        }
        ytaVar.setVisibility(0);
        ytaVar.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setDrawOverlay(boolean z) {
        this.c.setDrawOverlay(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setEndIconClickListener(View.OnClickListener onClickListener) {
        ?? r0 = this.t0;
        if (r0.e()) {
            f8j.d((ImageView) r0.getValue(), 300L, onClickListener);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setEndIconDrawable(Drawable drawable) {
        ?? r0 = this.t0;
        if (drawable != null) {
            ImageView imageView = (ImageView) r0.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            dqi.a(this, (View) r0.getValue(), -1);
        } else if (r0.e()) {
            ImageView imageView2 = (ImageView) r0.getValue();
            imageView2.setImageDrawable(null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    public final void setImageClickListener(View.OnClickListener onClickListener) {
        f8j.d(this.c, 300L, onClickListener);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setStartIconClickListener(View.OnClickListener onClickListener) {
        ?? r0 = this.s0;
        if (r0.e()) {
            f8j.d((ImageView) r0.getValue(), 300L, onClickListener);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setStartIconDrawable(Drawable drawable) {
        ?? r0 = this.s0;
        if (drawable != null) {
            ImageView imageView = (ImageView) r0.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            dqi.a(this, (View) r0.getValue(), -1);
        } else if (r0.e()) {
            ImageView imageView2 = (ImageView) r0.getValue();
            imageView2.setImageDrawable(null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    public final void setCounter(Integer num) {
        if (num == null) {
            ?? r2 = this.d;
            if (r2.e()) {
                ((w2b) r2.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        setCounter(num.intValue());
    }
}
