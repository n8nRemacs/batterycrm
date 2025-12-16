package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.a41;
import com.yandex.mobile.ads.impl.aa;
import com.yandex.mobile.ads.impl.nb0;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public class ExtendedTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    @N
    private nb0 f383158a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final aa f383159b;

    public ExtendedTextView(@N Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i12, int i13) {
        nb0.a aVarA = this.f383158a.a(i12, i13);
        super.onMeasure(aVarA.f388198a, aVarA.f388199b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
        super.onTextChanged(charSequence, i12, i13, i14);
    }

    public void setAutoSizeTextType(int i12) {
        super.setAutoSizeTextTypeWithDefaults(i12);
    }

    public void setMeasureSpecProvider(@N nb0 nb0Var) {
        this.f383158a = nb0Var;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i12, float f12) {
        super.setTextSize(i12, f12);
    }

    public ExtendedTextView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f383158a = new a41();
        this.f383159b = new aa(this);
    }
}
