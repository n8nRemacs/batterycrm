package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class aif extends ViewGroup implements u6g {
    public final TextView a;
    public final TextView b;
    public final OneMeButton c;
    public final int d;

    public aif(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        textView.setId(uab.e);
        dpg.g.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.y(textView).getText().e);
        this.a = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(uab.d);
        textView2.setTextColor(az1.f(dpg.l, textView2, v1aVar, textView2).i);
        this.b = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setId(uab.c);
        oneMeButton.setSize(jza.a);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.c);
        oneMeButton.setVisibility(4);
        this.c = oneMeButton;
        this.d = kti.d(10 * vw4.d().getDisplayMetrics().density);
        addView(textView);
        addView(textView2);
        addView(oneMeButton);
    }

    public final OneMeButton getHeaderButton() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        TextView textView = this.a;
        m8j.e(textView, this, paddingStart, paddingTop, textView.getMeasuredWidth() + paddingStart, getPaddingTop() + textView.getMeasuredHeight());
        int bottom = textView.getBottom();
        TextView textView2 = this.b;
        m8j.e(textView2, this, paddingStart, bottom, textView2.getMeasuredWidth() + paddingStart, textView2.getMeasuredHeight() + textView.getBottom());
        int bottom2 = textView2.getBottom() / 2;
        OneMeButton oneMeButton = this.c;
        int measuredHeight = bottom2 - (oneMeButton.getMeasuredHeight() / 2);
        m8j.e(this.c, this, getMeasuredWidth() - (oneMeButton.getMeasuredWidth() + getPaddingEnd()), measuredHeight, getMeasuredWidth() - getPaddingEnd(), oneMeButton.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        OneMeButton oneMeButton = this.c;
        oneMeButton.measure(iMakeMeasureSpec, i2);
        int measuredWidth = size - (oneMeButton.getMeasuredWidth() + this.d);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        TextView textView = this.a;
        textView.measure(iMakeMeasureSpec2, i2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        TextView textView2 = this.b;
        textView2.measure(iMakeMeasureSpec3, i2);
        setMeasuredDimension(size, textView2.getMeasuredHeight() + textView.getMeasuredHeight());
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        v1a v1aVar = a93.s0;
        this.a.setTextColor(v1aVar.y(this).getText().e);
        this.b.setTextColor(v1aVar.y(this).getText().i);
        this.c.onThemeChanged(yebVar);
    }
}
