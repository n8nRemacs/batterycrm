package com.avito.android.lib.design.tab_layout;

import android.view.View;
import com.avito.android.lib.design.tab_layout.c;

/* compiled from: TabLayout.java */
/* loaded from: classes14.dex */
class d implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f180915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.m f180916c;

    public d(c.m mVar, View view) {
        this.f180916c = mVar;
        this.f180915b = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        View view2 = this.f180915b;
        if (view2.getVisibility() == 0) {
            int i22 = c.m.f180902m;
            this.f180916c.d(view2);
        }
    }
}
