package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import j.N;
import lY0.C43707b;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes6.dex */
class a extends c {
    @Override // com.google.android.material.tabs.c
    public final void b(TabLayout tabLayout, View view, View view2, float f12, @N Drawable drawable) {
        float fCos;
        float fCos2;
        RectF rectFA = c.a(tabLayout, view);
        RectF rectFA2 = c.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            double d12 = (f12 * 3.141592653589793d) / 2.0d;
            fCos2 = (float) (1.0d - Math.cos(d12));
            fCos = (float) Math.sin(d12);
        } else {
            double d13 = (f12 * 3.141592653589793d) / 2.0d;
            float fSin = (float) Math.sin(d13);
            fCos = (float) (1.0d - Math.cos(d13));
            fCos2 = fSin;
        }
        drawable.setBounds(C43707b.c(fCos2, (int) rectFA.left, (int) rectFA2.left), drawable.getBounds().top, C43707b.c(fCos, (int) rectFA.right, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
