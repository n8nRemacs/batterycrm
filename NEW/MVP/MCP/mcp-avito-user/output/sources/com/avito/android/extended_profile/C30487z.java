package com.avito.android.extended_profile;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import fA.InterfaceC40265a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.extended_profile.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C30487z implements SwipeRefreshLayout.f, SwipeRefreshLayout.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f150540b;

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.e
    public boolean b() {
        return this.f150540b.f149217B.getTop() < 0;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void j0() {
        this.f150540b.f149244d.accept(new InterfaceC40265a.C40268d(true));
    }
}
