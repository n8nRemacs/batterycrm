package com.google.android.material.bottomsheet;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C22808a;
import j.N;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes6.dex */
class f extends C22808a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f356043d;

    public f(h hVar) {
        this.f356043d = hVar;
    }

    @Override // androidx.core.view.C22808a
    public final void d(View view, @N androidx.core.view.accessibility.f fVar) {
        this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
        if (!this.f356043d.f356048k) {
            fVar.p(false);
        } else {
            fVar.a(1048576);
            fVar.p(true);
        }
    }

    @Override // androidx.core.view.C22808a
    public final boolean g(View view, int i12, Bundle bundle) {
        if (i12 == 1048576) {
            h hVar = this.f356043d;
            if (hVar.f356048k) {
                hVar.cancel();
                return true;
            }
        }
        return super.g(view, i12, bundle);
    }
}
