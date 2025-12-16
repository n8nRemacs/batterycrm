package com.google.android.material.bottomsheet;

import android.view.View;
import j.N;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes6.dex */
class c implements androidx.core.view.accessibility.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f356039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f356040c;

    public c(BottomSheetBehavior bottomSheetBehavior, int i12) {
        this.f356040c = bottomSheetBehavior;
        this.f356039b = i12;
    }

    @Override // androidx.core.view.accessibility.i
    public final boolean c(@N View view) {
        this.f356040c.b(this.f356039b);
        return true;
    }
}
