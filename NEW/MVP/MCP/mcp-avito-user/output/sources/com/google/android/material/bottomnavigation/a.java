package com.google.android.material.bottomnavigation;

import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import j.I;
import j.InterfaceC42161q;

/* compiled from: BottomNavigationItemView.java */
@RestrictTo
/* loaded from: classes6.dex */
public class a extends com.google.android.material.navigation.b {
    @Override // com.google.android.material.navigation.b
    @InterfaceC42161q
    public int getItemDefaultMarginResId() {
        return R.dimen.design_bottom_navigation_margin;
    }

    @Override // com.google.android.material.navigation.b
    @I
    public int getItemLayoutResId() {
        return R.layout.design_bottom_navigation_item;
    }
}
