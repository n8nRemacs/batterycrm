package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import j.N;
import lY0.C43707b;

/* compiled from: FadeTabIndicatorInterpolator.java */
/* loaded from: classes6.dex */
class b extends c {
    @Override // com.google.android.material.tabs.c
    public final void b(TabLayout tabLayout, View view, View view2, float f12, @N Drawable drawable) {
        if (f12 >= 0.5f) {
            view = view2;
        }
        RectF rectFA = c.a(tabLayout, view);
        float fB2 = f12 < 0.5f ? C43707b.b(1.0f, 0.0f, 0.0f, 0.5f, f12) : C43707b.b(0.0f, 1.0f, 0.5f, 1.0f, f12);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fB2 * 255.0f));
    }
}
