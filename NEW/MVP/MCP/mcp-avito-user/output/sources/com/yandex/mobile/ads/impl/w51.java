package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.List;

/* loaded from: classes8.dex */
public final class w51 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ra1 f391290a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final xj0 f391291b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final List<r51> f391292c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.k f391293d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final sm0 f391294e;

    public w51(@j.N ra1 ra1Var, @j.N xj0 xj0Var, @j.N List<r51> list, @j.N com.yandex.mobile.ads.nativeads.k kVar, @j.N sm0 sm0Var) {
        this.f391290a = ra1Var;
        this.f391291b = xj0Var;
        this.f391292c = list;
        this.f391293d = kVar;
        this.f391294e = sm0Var;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(@j.N MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f391292c.size()) {
            return true;
        }
        r51 r51Var = this.f391292c.get(itemId);
        h90 h90VarA = r51Var.a();
        rm0 rm0VarA = this.f391294e.a(this.f391291b.a(r51Var.b(), "social_action"));
        this.f391293d.a(h90VarA);
        this.f391290a.a(h90VarA.d());
        String strE = h90VarA.e();
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        rm0VarA.a(strE);
        return true;
    }
}
