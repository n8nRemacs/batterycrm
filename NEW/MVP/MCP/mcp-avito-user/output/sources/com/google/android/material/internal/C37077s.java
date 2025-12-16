package com.google.android.material.internal;

import android.view.SubMenu;
import androidx.annotation.RestrictTo;

/* compiled from: NavigationMenu.java */
@RestrictTo
/* renamed from: com.google.android.material.internal.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37077s extends androidx.appcompat.view.menu.h {
    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    @j.N
    public final SubMenu addSubMenu(int i12, int i13, int i14, CharSequence charSequence) {
        androidx.appcompat.view.menu.k kVarA = a(i12, i13, i14, charSequence);
        v vVar = new v(this.f21831a, this, kVarA);
        kVarA.f21875o = vVar;
        vVar.setHeaderTitle(kVarA.f21865e);
        return vVar;
    }
}
