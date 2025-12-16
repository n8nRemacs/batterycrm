package com.google.android.material.sidesheet;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C22808a;
import j.N;

/* compiled from: SheetDialog.java */
/* loaded from: classes6.dex */
class f extends C22808a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f357184d;

    public f(g gVar) {
        this.f357184d = gVar;
    }

    @Override // androidx.core.view.C22808a
    public final void d(View view, @N androidx.core.view.accessibility.f fVar) {
        this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
        if (!this.f357184d.f357190j) {
            fVar.p(false);
        } else {
            fVar.a(1048576);
            fVar.p(true);
        }
    }

    @Override // androidx.core.view.C22808a
    public final boolean g(View view, int i12, Bundle bundle) {
        if (i12 == 1048576) {
            g gVar = this.f357184d;
            if (gVar.f357190j) {
                gVar.cancel();
                return true;
            }
        }
        return super.g(view, i12, bundle);
    }
}
