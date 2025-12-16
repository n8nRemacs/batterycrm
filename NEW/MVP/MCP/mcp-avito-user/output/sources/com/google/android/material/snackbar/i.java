package com.google.android.material.snackbar;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C22808a;
import j.N;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes6.dex */
class i extends C22808a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f357335d;

    public i(BaseTransientBottomBar baseTransientBottomBar) {
        this.f357335d = baseTransientBottomBar;
    }

    @Override // androidx.core.view.C22808a
    public final void d(View view, @N androidx.core.view.accessibility.f fVar) {
        this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
        fVar.a(1048576);
        fVar.p(true);
    }

    @Override // androidx.core.view.C22808a
    public final boolean g(View view, int i12, Bundle bundle) {
        if (i12 != 1048576) {
            return super.g(view, i12, bundle);
        }
        this.f357335d.a();
        return true;
    }
}
