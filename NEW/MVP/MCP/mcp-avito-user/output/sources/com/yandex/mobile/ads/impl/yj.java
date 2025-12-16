package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.div.core.C37916k;
import com.yandex.div2.DivAction;

/* loaded from: classes8.dex */
public final class yj extends C37916k {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xj f392016a;

    public yj(@j.N xj xjVar) {
        this.f392016a = xjVar;
    }

    private boolean a(@j.N String str) {
        str.getClass();
        if (str.equals("close_dialog")) {
            this.f392016a.b();
            return true;
        }
        if (!str.equals("close_ad")) {
            return false;
        }
        this.f392016a.a();
        return true;
    }

    @Override // com.yandex.div.core.C37916k
    public final boolean handleAction(@j.N DivAction divAction, @j.N com.yandex.div.core.n0 n0Var) {
        com.yandex.div.json.expressions.b<Uri> bVar = divAction.f371220e;
        boolean zA2 = bVar != null ? a(bVar.a(com.yandex.div.json.expressions.e.f370568a).toString()) : false;
        return zA2 ? zA2 : super.handleAction(divAction, n0Var);
    }
}
