package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class dk7 extends ViewGroup implements a4c {
    public final jve A0;
    public final gbd B0;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int o;
    public final int s0;
    public final TextView t0;
    public final TextView u0;
    public final Object v0;
    public final Object w0;
    public final ImageView x0;
    public final Object y0;
    public final Object z0;

    public dk7(final Context context) {
        super(context);
        this.a = kti.d(9 * vw4.d().getDisplayMetrics().density);
        this.b = kti.d(2 * vw4.d().getDisplayMetrics().density);
        this.c = kti.d(4 * vw4.d().getDisplayMetrics().density);
        this.d = kti.d(40 * vw4.d().getDisplayMetrics().density);
        float f = 8;
        this.o = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.s0 = kti.d(1 * vw4.d().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        textView.setId(d1b.c);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams);
        dpg.m.b(textView, t75.b);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.B(textView).c.getText().e);
        this.t0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(d1b.d);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams2);
        dpg.B.b(textView2, t75.b);
        textView2.setTextColor(v1aVar.B(textView2).c.getText().e);
        this.u0 = textView2;
        final int i = 0;
        this.v0 = ipi.b(3, new cm6() { // from class: bk7
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        b4c b4cVar = new b4c(context);
                        b4cVar.setListener(this);
                        return b4cVar;
                    default:
                        ImageView imageView = new ImageView(context);
                        int i2 = yud.V1;
                        v1a v1aVar2 = a93.s0;
                        int i3 = v1aVar2.B(imageView).c.getIcon().f;
                        Drawable drawableMutate = r34.b(imageView.getContext(), i2).mutate();
                        cei.k(drawableMutate, i3);
                        imageView.setImageDrawable(drawableMutate);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(v1aVar2.B(imageView).c.c().a.a.i), null, null));
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD, iD, iD, iD);
                        f8j.d(imageView, 300L, new ck7(this, 1));
                        return imageView;
                }
            }
        });
        final int i2 = 1;
        this.w0 = ipi.b(3, new cm6() { // from class: bk7
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        b4c b4cVar = new b4c(context);
                        b4cVar.setListener(this);
                        return b4cVar;
                    default:
                        ImageView imageView = new ImageView(context);
                        int i22 = yud.V1;
                        v1a v1aVar2 = a93.s0;
                        int i3 = v1aVar2.B(imageView).c.getIcon().f;
                        Drawable drawableMutate = r34.b(imageView.getContext(), i22).mutate();
                        cei.k(drawableMutate, i3);
                        imageView.setImageDrawable(drawableMutate);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(v1aVar2.B(imageView).c.c().a.a.i), null, null));
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD, iD, iD, iD);
                        f8j.d(imageView, 300L, new ck7(this, 1));
                        return imageView;
                }
            }
        });
        ImageView imageView = new ImageView(context);
        int i3 = y9b.j;
        int i4 = v1aVar.B(imageView).c.getIcon().f;
        Drawable drawableMutate = r34.b(imageView.getContext(), i3).mutate();
        cei.k(drawableMutate, i4);
        imageView.setImageDrawable(drawableMutate);
        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(v1aVar.B(imageView).c.c().a.a.i), null, null));
        int iD = kti.d(f * vw4.d().getDisplayMetrics().density);
        imageView.setPadding(iD, iD, iD, iD);
        f8j.d(imageView, 300L, new ck7(this, 0));
        this.x0 = imageView;
        this.y0 = ipi.b(3, new ns2(context, 13));
        this.z0 = ipi.b(3, new ns2(context, 14));
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 5);
        this.A0 = jveVarB;
        this.B0 = new gbd(jveVarB);
        addView(textView);
        addView(textView2);
        addView(imageView);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, k18] */
    public final void a(gp2 gp2Var, boolean z) {
        this.t0.setText(gp2Var.a);
        this.u0.setText(gp2Var.b);
        if (!z) {
            CharSequence charSequence = gp2Var.c;
            int length = charSequence.length();
            ?? r3 = this.z0;
            ?? r4 = this.y0;
            if (length > 0) {
                dqi.a(this, (View) r4.getValue(), -1);
                dqi.a(this, (View) r3.getValue(), -1);
                ((View) r4.getValue()).setVisibility(0);
                ((View) r3.getValue()).setVisibility(0);
                ((TextView) r4.getValue()).setText(charSequence);
            } else if (dqi.r(r4)) {
                ((TextView) r4.getValue()).setText(charSequence);
                ((View) r4.getValue()).setVisibility(8);
                ((View) r3.getValue()).setVisibility(8);
                ((TextView) r4.getValue()).setText((CharSequence) null);
            }
        }
        ?? r7 = this.v0;
        if (r7.e()) {
            ((b4c) r7.getValue()).a(gp2Var.d);
        }
        this.x0.setVisibility(gp2Var.e ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, k18] */
    public final void b(gp2 gp2Var) {
        ?? r0 = this.v0;
        dqi.a(this, (View) r0.getValue(), -1);
        ((View) r0.getValue()).setVisibility(0);
        ?? r1 = this.w0;
        dqi.a(this, (View) r1.getValue(), -1);
        ((View) r1.getValue()).setVisibility(0);
        ((b4c) r0.getValue()).a(gp2Var.d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    public final void c(boolean z) {
        Drawable drawableMutate;
        v1a v1aVar = a93.s0;
        ?? r1 = this.w0;
        if (r1.e()) {
            ImageView imageView = (ImageView) r1.getValue();
            if (z) {
                int i = yud.U1;
                int i2 = v1aVar.B(imageView).c.getIcon().f;
                drawableMutate = r34.b(imageView.getContext(), i).mutate();
                cei.k(drawableMutate, i2);
            } else {
                int i3 = yud.V1;
                int i4 = v1aVar.B(imageView).c.getIcon().f;
                drawableMutate = r34.b(imageView.getContext(), i3).mutate();
                cei.k(drawableMutate, i4);
            }
            imageView.setImageDrawable(drawableMutate);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void d(long j, long j2, long j3) {
        b4c b4cVar = (b4c) this.v0.getValue();
        b4cVar.d.setText(z7i.a(j3));
        b4cVar.c.setText(z7i.a(j));
        x4c x4cVar = b4cVar.o;
        x4cVar.setMax((int) j3);
        x4cVar.setSecondaryProgress((int) j2);
        x4cVar.setProgress((int) j);
    }

    public final fve getEvents() {
        return this.B0;
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        ?? r6 = this.y0;
        boolean zR = dqi.r(r6);
        int i5 = this.o;
        if (zR) {
            cri.c((View) r6.getValue(), 0, paddingTop, 0, 12);
            int measuredHeight = ((TextView) r6.getValue()).getMeasuredHeight() + i5 + paddingTop;
            ?? r5 = this.z0;
            cri.c((View) r5.getValue(), 0, ((TextView) r6.getValue()).getBottom() + i5, 0, 12);
            paddingTop = ((View) r5.getValue()).getMeasuredHeight() + measuredHeight;
        }
        ?? r7 = this.v0;
        if (dqi.r(r7) && ((b4c) r7.getValue()).getParent() != null) {
            if (!dqi.r(r6)) {
                i5 = 0;
            }
            int i6 = paddingTop + i5;
            cri.c((View) r7.getValue(), 0, i6, 0, 12);
            paddingTop = i6 + ((b4c) r7.getValue()).getMeasuredHeight();
        }
        int measuredWidth = getMeasuredWidth() / 2;
        TextView textView = this.t0;
        int measuredWidth2 = measuredWidth - (textView.getMeasuredWidth() / 2);
        int i7 = paddingTop + this.a;
        cri.c(textView, measuredWidth2, i7, 0, 12);
        int measuredWidth3 = getMeasuredWidth() / 2;
        TextView textView2 = this.u0;
        cri.c(textView2, measuredWidth3 - (textView2.getMeasuredWidth() / 2), textView.getMeasuredHeight() + this.b + i7, 0, 12);
        ?? r52 = this.w0;
        boolean zR2 = dqi.r(r52);
        int i8 = this.c;
        ImageView imageView = this.x0;
        if (zR2) {
            cri.c((View) r52.getValue(), i8, ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        }
        if (imageView.getVisibility() == 0) {
            cri.c(imageView, (getMeasuredWidth() - i8) - imageView.getMeasuredWidth(), ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        }
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredWidth;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        ?? r4 = this.y0;
        boolean zR = dqi.r(r4);
        int i3 = this.o;
        if (zR) {
            ((TextView) r4.getValue()).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            ?? r5 = this.z0;
            ((View) r5.getValue()).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.s0, 1073741824));
            measuredHeight = ((View) r5.getValue()).getMeasuredHeight() + ((TextView) r4.getValue()).getMeasuredHeight() + i3;
        } else {
            measuredHeight = 0;
        }
        ?? r9 = this.v0;
        if (dqi.r(r9) && ((b4c) r9.getValue()).getParent() != null) {
            ((b4c) r9.getValue()).measure(i, i2);
            int measuredHeight2 = ((b4c) r9.getValue()).getMeasuredHeight();
            if (!dqi.r(r4)) {
                i3 = 0;
            }
            measuredHeight += measuredHeight2 + i3;
        }
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
        ?? r14 = this.w0;
        boolean zR2 = dqi.r(r14);
        int i4 = this.c;
        if (zR2) {
            ((ImageView) r14.getValue()).measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
            measuredWidth = size - (((ImageView) r14.getValue()).getMeasuredWidth() + i4);
        } else {
            measuredWidth = size;
        }
        ImageView imageView = this.x0;
        if (imageView.getVisibility() == 0) {
            imageView.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
            measuredWidth -= imageView.getMeasuredWidth() + i4;
        }
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        TextView textView = this.t0;
        textView.measure(iMakeMeasureSpec4, iMakeMeasureSpec2);
        int measuredHeight3 = textView.getMeasuredHeight() + this.a + measuredHeight;
        TextView textView2 = this.u0;
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + textView2.getMeasuredHeight() + this.b + measuredHeight3);
    }
}
