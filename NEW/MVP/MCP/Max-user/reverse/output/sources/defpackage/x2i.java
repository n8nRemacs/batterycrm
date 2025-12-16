package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class x2i extends ViewGroup implements u6g {
    public final zd7 a;
    public final TextView b;
    public final TextView c;
    public final bm7 d;
    public final uuf o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final float x0;
    public v32 y0;

    public x2i(Context context) {
        super(context, null);
        zd7 zd7Var = new zd7(context);
        zd7Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.a = zd7Var;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setGravity(1);
        textView.setVisibility(0);
        this.b = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView2.setGravity(1);
        if (y78.a == null) {
            y78.a = new y78();
        }
        textView2.setMovementMethod(y78.a);
        dpg.G.b(textView2, t75.b);
        this.c = textView2;
        bm7 bm7Var = new bm7(context);
        bm7Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.d = bm7Var;
        tuf tufVar = new tuf(22);
        float f = 40;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        int iD2 = kti.d(f * vw4.d().getDisplayMetrics().density);
        tufVar.c = iD;
        tufVar.d = iD2;
        this.o = new uuf(tufVar);
        this.s0 = kti.d(274 * vw4.d().getDisplayMetrics().density);
        int iD3 = kti.d(24 * vw4.d().getDisplayMetrics().density);
        this.t0 = iD3;
        float f2 = 16;
        this.u0 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        this.v0 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        this.w0 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        this.x0 = vw4.d().getDisplayMetrics().density * 12.0f;
        setPadding(getPaddingLeft(), iD3, getPaddingRight(), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        addView(zd7Var);
        addView(textView);
        addView(textView2);
        onThemeChanged(a93.s0.y(this));
    }

    public final void a(yeb yebVar) {
        int i = yebVar.getText().g;
        TextView textView = this.c;
        textView.setTextColor(i);
        CharSequence text = textView.getText();
        int length = text.length();
        Object[] spans = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                spans = spanned.getSpans(0, length, b88.class);
            }
        } catch (Throwable unused) {
        }
        b88[] b88VarArr = (b88[]) spans;
        if (b88VarArr != null) {
            for (b88 b88Var : b88VarArr) {
                b88Var.a = yebVar.a().i().d.i;
                b88Var.b = a93.s0.x(getContext()).l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        v32 v32Var = this.y0;
        if (v32Var == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) v32Var.c;
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() / 2;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            a3i a3iVar = (a3i) arrayList.get(i5);
            if (a3iVar instanceof b3i) {
                bm7 bm7Var = this.d;
                int measuredWidth2 = measuredWidth - (bm7Var.getMeasuredWidth() / 2);
                paddingTop += this.t0;
                cri.c(bm7Var, measuredWidth2, paddingTop, 0, 12);
            } else {
                if (a3iVar instanceof c3i) {
                    zd7 zd7Var = this.a;
                    cri.c(zd7Var, measuredWidth - (zd7Var.getMeasuredWidth() / 2), paddingTop, 0, 12);
                    measuredHeight = zd7Var.getMeasuredHeight() + this.u0;
                } else {
                    if (!(a3iVar instanceof d3i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((d3i) a3iVar).c) {
                        TextView textView = this.c;
                        int measuredWidth3 = measuredWidth - (textView.getMeasuredWidth() / 2);
                        paddingTop += this.w0;
                        cri.c(textView, measuredWidth3, paddingTop, 0, 12);
                        measuredHeight = textView.getMeasuredHeight();
                    } else {
                        TextView textView2 = this.b;
                        cri.c(textView2, measuredWidth - (textView2.getMeasuredWidth() / 2), paddingTop, 0, 12);
                        measuredHeight = textView2.getMeasuredHeight();
                    }
                }
                paddingTop = measuredHeight + paddingTop;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        int i3;
        v32 v32Var = this.y0;
        if (v32Var == null) {
            super.onMeasure(i, i2);
            return;
        }
        ArrayList arrayList = (ArrayList) v32Var.c;
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            int i5 = this.s0;
            if (i4 >= size) {
                setMeasuredDimension(i5, paddingBottom);
                return;
            }
            a3i a3iVar = (a3i) arrayList.get(i4);
            boolean z = a3iVar instanceof b3i;
            int i6 = this.t0;
            if (z) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5 - (this.v0 * 2), 1073741824);
                bm7 bm7Var = this.d;
                bm7Var.measure(iMakeMeasureSpec, i2);
                measuredHeight = bm7Var.getMeasuredHeight() + i6;
            } else {
                if (a3iVar instanceof c3i) {
                    c3i c3iVar = (c3i) a3iVar;
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5 - (i6 * 2), kti.d(c3iVar.a.getWidth() * vw4.d().getDisplayMetrics().density)), 1073741824);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(kti.d(c3iVar.a.getHeight() * vw4.d().getDisplayMetrics().density), 1073741824);
                    zd7 zd7Var = this.a;
                    zd7Var.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    measuredHeight2 = zd7Var.getMeasuredHeight();
                    i3 = this.u0;
                } else {
                    if (!(a3iVar instanceof d3i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((d3i) a3iVar).c) {
                        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i5 - (i6 * 2), Integer.MIN_VALUE);
                        TextView textView = this.c;
                        textView.measure(iMakeMeasureSpec4, i2);
                        measuredHeight2 = textView.getMeasuredHeight();
                        i3 = this.w0;
                    } else {
                        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i5 - (i6 * 2), Integer.MIN_VALUE);
                        TextView textView2 = this.b;
                        textView2.measure(iMakeMeasureSpec5, i2);
                        measuredHeight = textView2.getMeasuredHeight();
                    }
                }
                measuredHeight = measuredHeight2 + i3;
            }
            paddingBottom = measuredHeight + paddingBottom;
            i4++;
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        zd7 zd7Var = this.a;
        if (zd7Var.getColorFilter() != null) {
            zd7Var.setColorFilter(yebVar.a().G().c.b);
        }
        this.b.setTextColor(yebVar.getText().e);
        a(yebVar);
    }

    public final void setKeyboardListener(am7 am7Var) {
        this.d.setClickListener(am7Var);
    }
}
