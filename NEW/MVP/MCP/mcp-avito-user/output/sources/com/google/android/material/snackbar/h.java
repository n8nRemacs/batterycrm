package com.google.android.material.snackbar;

import android.view.View;
import androidx.core.view.J0;
import androidx.core.view.M;
import j.N;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes6.dex */
class h implements M {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f357334b;

    public h(BaseTransientBottomBar baseTransientBottomBar) {
        this.f357334b = baseTransientBottomBar;
    }

    @Override // androidx.core.view.M
    @N
    public final J0 h(View view, @N J0 j02) {
        int iH2 = j02.h();
        BaseTransientBottomBar baseTransientBottomBar = this.f357334b;
        baseTransientBottomBar.f357290n = iH2;
        baseTransientBottomBar.f357291o = j02.i();
        baseTransientBottomBar.f357292p = j02.j();
        baseTransientBottomBar.h();
        return j02;
    }
}
