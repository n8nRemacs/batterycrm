package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.PopupMenu;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes8.dex */
public final class x51 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n2 f391552a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final xj0 f391553b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final w20 f391554c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.k f391555d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final sm0 f391556e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final c61 f391557f = new c61();

    public x51(@j.N n2 n2Var, @j.N xj0 xj0Var, @j.N com.yandex.mobile.ads.nativeads.k kVar, @j.N com.yandex.mobile.ads.nativeads.w wVar, @j.N sm0 sm0Var) {
        this.f391552a = n2Var;
        this.f391553b = xj0Var;
        this.f391555d = kVar;
        this.f391556e = sm0Var;
        this.f391554c = wVar.d();
    }

    public final void a(@j.N View view, @j.N o51 o51Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<r51> listB = o51Var.b();
        if (listB.isEmpty()) {
            return;
        }
        PopupMenu popupMenuA = this.f391557f.a(view, this.f391554c, listB);
        popupMenuA.setOnMenuItemClickListener(new w51(new ra1(new x6(view.getContext(), this.f391552a)), this.f391553b, listB, this.f391555d, this.f391556e));
        popupMenuA.show();
    }
}
