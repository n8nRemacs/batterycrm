package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

/* compiled from: VisibilityAwareImageButton.java */
@SuppressLint({"AppCompatCustomView"})
@RestrictTo
/* loaded from: classes6.dex */
public class S extends ImageButton {

    /* renamed from: b, reason: collision with root package name */
    public int f356752b;

    public S(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i12, boolean z12) {
        super.setVisibility(i12);
        if (z12) {
            this.f356752b = i12;
        }
    }

    public final int getUserSetVisibility() {
        return this.f356752b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i12) {
        a(i12, true);
    }

    public S(Context context, AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f356752b = getVisibility();
    }
}
