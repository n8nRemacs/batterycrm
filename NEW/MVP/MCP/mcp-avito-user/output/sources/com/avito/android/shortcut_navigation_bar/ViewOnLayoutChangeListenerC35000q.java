package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.shortcut_navigation_bar.C34999p;
import kotlin.Metadata;

/* compiled from: View.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.shortcut_navigation_bar.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC35000q implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabGroup f283540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C34999p f283541c;

    public ViewOnLayoutChangeListenerC35000q(TabGroup tabGroup, C34999p c34999p) {
        this.f283540b = tabGroup;
        this.f283541c = c34999p;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        view.removeOnLayoutChangeListener(this);
        C34999p c34999p = this.f283541c;
        C34999p.g gVar = c34999p.f283496m0;
        TabGroup tabGroup = this.f283540b;
        tabGroup.m(gVar);
        tabGroup.d(c34999p.f283496m0);
    }
}
