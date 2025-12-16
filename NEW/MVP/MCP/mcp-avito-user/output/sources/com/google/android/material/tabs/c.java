package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.O;
import com.google.android.material.tabs.TabLayout;
import j.InterfaceC42167x;
import j.N;
import j.P;
import lY0.C43707b;

/* compiled from: TabIndicatorInterpolator.java */
/* loaded from: classes6.dex */
class c {
    public static RectF a(TabLayout tabLayout, @P View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f357356E || !(view instanceof TabLayout.n)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.n nVar = (TabLayout.n) view;
        int contentWidth = nVar.getContentWidth();
        int contentHeight = nVar.getContentHeight();
        int iB2 = (int) O.b(24, nVar.getContext());
        if (contentWidth < iB2) {
            contentWidth = iB2;
        }
        int right = (nVar.getRight() + nVar.getLeft()) / 2;
        int bottom = (nVar.getBottom() + nVar.getTop()) / 2;
        int i12 = contentWidth / 2;
        return new RectF(right - i12, bottom - (contentHeight / 2), i12 + right, (right / 2) + bottom);
    }

    public void b(TabLayout tabLayout, View view, View view2, @InterfaceC42167x float f12, @N Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(C43707b.c(f12, (int) rectFA.left, (int) rectFA2.left), drawable.getBounds().top, C43707b.c(f12, (int) rectFA.right, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
