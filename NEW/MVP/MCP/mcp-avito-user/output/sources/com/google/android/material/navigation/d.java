package com.google.android.material.navigation;

import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.k;
import j.N;

/* compiled from: NavigationBarMenu.java */
@RestrictTo
/* loaded from: classes6.dex */
public final class d extends androidx.appcompat.view.menu.h {
    @Override // androidx.appcompat.view.menu.h
    @N
    public final k a(int i12, int i13, int i14, @N CharSequence charSequence) {
        if (this.f21836f.size() + 1 > 0) {
            throw null;
        }
        w();
        k kVarA = super.a(i12, i13, i14, charSequence);
        kVarA.g(true);
        v();
        return kVarA;
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    @N
    public final SubMenu addSubMenu(int i12, int i13, int i14, @N CharSequence charSequence) {
        throw null;
    }
}
