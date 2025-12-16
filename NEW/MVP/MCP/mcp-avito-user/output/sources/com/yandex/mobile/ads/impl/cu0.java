package com.yandex.mobile.ads.impl;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.gv;
import com.yandex.mobile.ads.impl.ky0;
import java.util.List;

/* loaded from: classes8.dex */
final class cu0 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final oy0 f384459a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final x6 f384460b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final List<gv.a> f384461c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.k f384462d;

    public cu0(@j.N x6 x6Var, @j.N List<gv.a> list, @j.N oy0 oy0Var, @j.N com.yandex.mobile.ads.nativeads.k kVar) {
        this.f384461c = list;
        this.f384460b = x6Var;
        this.f384459a = oy0Var;
        this.f384462d = kVar;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(@j.N MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f384461c.size()) {
            return true;
        }
        this.f384460b.a(this.f384461c.get(itemId).b());
        ((dj) this.f384459a).a(ky0.b.f387282C);
        this.f384462d.a();
        return true;
    }
}
