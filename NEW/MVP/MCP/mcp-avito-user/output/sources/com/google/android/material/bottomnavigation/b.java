package com.google.android.material.bottomnavigation;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.h;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.navigation.f;
import java.util.WeakHashMap;

/* compiled from: BottomNavigationMenuView.java */
@RestrictTo
/* loaded from: classes6.dex */
public class b extends f {

    /* renamed from: t, reason: collision with root package name */
    public boolean f355962t;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int childCount = getChildCount();
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        int measuredWidth = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                if (getLayoutDirection() == 1) {
                    int i19 = i16 - measuredWidth;
                    childAt.layout(i19 - childAt.getMeasuredWidth(), 0, i19, i17);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i17);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        h menu = getMenu();
        View.MeasureSpec.getSize(i12);
        menu.l().size();
        getChildCount();
        throw null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z12) {
        this.f355962t = z12;
    }
}
