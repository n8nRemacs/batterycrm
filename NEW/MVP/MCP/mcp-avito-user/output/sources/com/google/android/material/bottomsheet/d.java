package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.J0;
import androidx.core.view.M;
import com.google.android.material.bottomsheet.h;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes6.dex */
class d implements M {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f356041b;

    public d(h hVar) {
        this.f356041b = hVar;
    }

    @Override // androidx.core.view.M
    public final J0 h(View view, J0 j02) {
        h hVar = this.f356041b;
        h.b bVar = hVar.f356051n;
        if (bVar != null) {
            hVar.f356044g.G(bVar);
        }
        h.b bVar2 = new h.b(hVar.f356047j, j02, null);
        hVar.f356051n = bVar2;
        bVar2.b(hVar.getWindow());
        hVar.f356044g.v(hVar.f356051n);
        return j02;
    }
}
