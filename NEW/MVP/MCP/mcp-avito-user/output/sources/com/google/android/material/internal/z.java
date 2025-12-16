package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;

/* compiled from: ScrimInsetsFrameLayout.java */
@RestrictTo
/* loaded from: classes6.dex */
public class z extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public Drawable f356842b;

    @Override // android.view.View
    public final void draw(@j.N Canvas canvas) {
        super.draw(canvas);
        getWidth();
        getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f356842b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f356842b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setScrimInsetForeground(@j.P Drawable drawable) {
        this.f356842b = drawable;
    }

    public void setDrawBottomInsetForeground(boolean z12) {
    }

    public void setDrawLeftInsetForeground(boolean z12) {
    }

    public void setDrawRightInsetForeground(boolean z12) {
    }

    public void setDrawTopInsetForeground(boolean z12) {
    }
}
