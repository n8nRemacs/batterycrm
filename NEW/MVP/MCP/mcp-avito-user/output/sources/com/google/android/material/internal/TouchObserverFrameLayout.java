package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class TouchObserverFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public View.OnTouchListener f356754b;

    public TouchObserverFrameLayout(@j.N Context context, @j.P AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f356754b;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnTouchListener(@j.P View.OnTouchListener onTouchListener) {
        this.f356754b = onTouchListener;
    }
}
