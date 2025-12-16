package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout.java */
/* loaded from: classes6.dex */
class e implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f357432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TabLayout.n f357433c;

    public e(TabLayout.n nVar, View view) {
        this.f357433c = nVar;
        this.f357432b = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        View view2 = this.f357432b;
        if (view2.getVisibility() == 0) {
            int i22 = TabLayout.n.f357419m;
            this.f357433c.c(view2);
        }
    }
}
