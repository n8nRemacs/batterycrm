package com.google.android.material.sidesheet;

import android.view.View;
import j.N;

/* compiled from: RightSheetDelegate.java */
/* loaded from: classes6.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f357182a;

    public a(@N SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f357182a = sideSheetBehavior;
    }

    public final int a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f357182a;
        return Math.max(0, (sideSheetBehavior.f357167m - sideSheetBehavior.f357166l) - sideSheetBehavior.f357168n);
    }
}
