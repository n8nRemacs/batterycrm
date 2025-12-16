package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.google.android.material.internal.O;
import java.util.WeakHashMap;

/* compiled from: ViewUtils.java */
/* loaded from: classes6.dex */
class P implements O.c {
    @Override // com.google.android.material.internal.O.c
    @j.N
    public final J0 a(View view, @j.N J0 j02, @j.N O.d dVar) {
        O.f(view);
        int i12 = dVar.f356748a;
        int i13 = dVar.f356749b;
        int i14 = dVar.f356750c;
        int i15 = dVar.f356751d;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        view.setPaddingRelative(i12, i13, i14, i15);
        return j02;
    }
}
