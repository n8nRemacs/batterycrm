package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class y80<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391955a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ViewGroup f391956b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final x80<V> f391957c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final w80<V> f391958d = new w80<>();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final v80<V> f391959e = new v80<>();

    public y80(@j.N Context context, @j.N ViewGroup viewGroup, @j.N ArrayList arrayList) {
        this.f391955a = context;
        this.f391956b = viewGroup;
        this.f391957c = new x80<>(arrayList);
    }

    public final boolean a() {
        ViewGroup viewGroupA;
        u80<V> u80VarA = this.f391957c.a(this.f391955a);
        if (u80VarA == null || (viewGroupA = this.f391958d.a(this.f391956b, u80VarA)) == null) {
            return false;
        }
        this.f391959e.a(this.f391956b, viewGroupA, u80VarA);
        return true;
    }

    public final void b() {
        this.f391959e.a(this.f391956b);
    }
}
