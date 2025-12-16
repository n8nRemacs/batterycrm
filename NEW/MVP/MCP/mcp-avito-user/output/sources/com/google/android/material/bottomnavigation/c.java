package com.google.android.material.bottomnavigation;

import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.google.android.material.internal.O;
import j.N;
import java.util.WeakHashMap;

/* compiled from: BottomNavigationView.java */
/* loaded from: classes6.dex */
class c implements O.c {
    @Override // com.google.android.material.internal.O.c
    @N
    public final J0 a(View view, @N J0 j02, @N O.d dVar) {
        dVar.f356751d = j02.h() + dVar.f356751d;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean z12 = view.getLayoutDirection() == 1;
        int i12 = j02.i();
        int iJ2 = j02.j();
        int i13 = dVar.f356748a + (z12 ? iJ2 : i12);
        dVar.f356748a = i13;
        int i14 = dVar.f356750c;
        if (!z12) {
            i12 = iJ2;
        }
        int i15 = i14 + i12;
        dVar.f356750c = i15;
        view.setPaddingRelative(i13, dVar.f356749b, i15, dVar.f356751d);
        return j02;
    }
}
