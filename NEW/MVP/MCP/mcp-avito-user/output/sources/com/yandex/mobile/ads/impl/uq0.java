package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class uq0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f390613a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hq0 f390614b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final jq0 f390615c = jq0.a();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final vq0 f390616d = new vq0();

    public uq0(@j.N Context context, @j.N ae1 ae1Var) {
        this.f390613a = context.getApplicationContext();
        this.f390614b = new hq0(context, ae1Var);
    }

    @j.P
    public final tq0 a(@j.N ArrayList arrayList) {
        if (this.f390616d.b(this.f390613a)) {
            this.f390615c.a(this.f390613a);
            to1 to1VarA = this.f390614b.a(arrayList);
            if (to1VarA != null) {
                return new tq0(to1VarA, qc0.a(to1VarA), p2.a(to1VarA));
            }
        }
        return null;
    }
}
