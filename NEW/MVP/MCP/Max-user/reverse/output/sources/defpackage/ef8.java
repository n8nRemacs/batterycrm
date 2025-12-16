package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ef8 extends ViewGroup {
    public final int a;
    public final int b;
    public final int c;
    public final TextView d;
    public final TextView o;
    public final TextView s0;
    public final TextView t0;

    public ef8(Context context) {
        super(context);
        float f = 12;
        this.a = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.b = kti.d(f * vw4.d().getDisplayMetrics().density);
        float f2 = 8;
        this.c = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        tqi.c(new x9(3, null, 20), textView);
        dpg.J.b(textView, t75.b);
        this.d = textView;
        TextView textView2 = new TextView(context);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        tqi.c(new x9(3, null, 18), textView2);
        t5g t5gVar = dpg.L;
        t5gVar.b(textView2, t75.b);
        this.o = textView2;
        TextView textView3 = new TextView(context);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        tqi.c(new x9(3, null, 21), textView3);
        t5gVar.b(textView3, t75.b);
        this.s0 = textView3;
        TextView textView4 = new TextView(context);
        textView4.setMaxLines(1);
        textView4.setEllipsize(truncateAt);
        tqi.c(new x9(3, null, 19), textView4);
        dpg.f.b(textView4, t75.b);
        textView4.setCompoundDrawablePadding(iD);
        float f3 = 16;
        textView4.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        Drawable drawableB = r34.b(context, pwc.ic_directions_24);
        ArrayList arrayList = b6g.a;
        textView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableB, (Drawable) null);
        textView4.setGravity(16);
        this.t0 = textView4;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-1, -2));
        addView(textView3, new ViewGroup.LayoutParams(-1, -2));
        addView(textView4, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        tqi.c(new ld0(3, (Continuation) null, 21), this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.d;
        int i5 = this.a;
        int i6 = this.c;
        cri.c(textView, i5, i6, 0, 12);
        float f = 2;
        int iJ = utb.j(f, vw4.d().getDisplayMetrics().density, textView.getMeasuredHeight(), i6);
        TextView textView2 = this.o;
        cri.c(textView2, i5, iJ, 0, 12);
        cri.c(this.s0, i5, utb.j(f, vw4.d().getDisplayMetrics().density, textView2.getMeasuredHeight(), iJ), 0, 12);
        int measuredWidth = getMeasuredWidth() - i5;
        TextView textView3 = this.t0;
        cri.c(textView3, measuredWidth - textView3.getMeasuredWidth(), kti.d(16 * vw4.d().getDisplayMetrics().density), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = size - (this.a * 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        TextView textView = this.t0;
        textView.measure(iMakeMeasureSpec, i2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((i3 - textView.getMeasuredWidth()) - this.b, Integer.MIN_VALUE);
        TextView textView2 = this.d;
        textView2.measure(iMakeMeasureSpec2, i2);
        TextView textView3 = this.o;
        textView3.measure(iMakeMeasureSpec2, i2);
        TextView textView4 = this.s0;
        textView4.measure(iMakeMeasureSpec2, i2);
        float f = 2;
        setMeasuredDimension(size, Math.max(kti.d(96 * vw4.d().getDisplayMetrics().density), kti.d(32 * vw4.d().getDisplayMetrics().density) + textView4.getMeasuredHeight() + u45.c(f, vw4.d().getDisplayMetrics().density, textView3.getMeasuredHeight() + u45.c(f, vw4.d().getDisplayMetrics().density, textView2.getMeasuredHeight() + this.c))));
    }
}
