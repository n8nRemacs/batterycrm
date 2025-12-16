package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public class CroppedTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private final int f383157a;

    public CroppedTextView(@N Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        int measuredHeight = getMeasuredHeight();
        int lineHeight = getLineHeight();
        int minLines = getMinLines();
        int maxLines = getMaxLines();
        if (lineHeight > 0) {
            int iMin = Math.min((Math.round(getLineHeight() * 0.05f) + measuredHeight) / lineHeight, this.f383157a);
            if (iMin == minLines && iMin == maxLines) {
                return;
            }
            setLines(iMin);
            TextUtils.TruncateAt ellipsize = getEllipsize();
            setEllipsize(null);
            setEllipsize(ellipsize);
        }
    }

    public CroppedTextView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CroppedTextView(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f383157a = getMaxLines();
    }
}
