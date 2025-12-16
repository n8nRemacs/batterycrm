package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class hb {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.nativeads.c0 f385944a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final gb f385945b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final List<eb<?>> f385946c;

    /* JADX WARN: Multi-variable type inference failed */
    public hb(@Y61.k com.yandex.mobile.ads.nativeads.c0 c0Var, @Y61.k gb gbVar, @Y61.k List<? extends eb<?>> list) {
        this.f385944a = c0Var;
        this.f385945b = gbVar;
        this.f385946c = list;
    }

    @Y61.k
    public final HashMap a() {
        HashMap map = new HashMap();
        gb gbVar = this.f385945b;
        TextView textViewE = this.f385944a.e();
        gbVar.getClass();
        map.put("close_button", gb.a(textViewE));
        map.put("feedback", this.f385945b.a(this.f385944a.g()));
        map.put("media", this.f385945b.a(this.f385944a.i(), this.f385944a.j()));
        gb gbVar2 = this.f385945b;
        View viewM = this.f385944a.m();
        gbVar2.getClass();
        map.put("rating", gb.b(viewM));
        for (eb<?> ebVar : this.f385946c) {
            View viewA = this.f385944a.a(ebVar.b());
            if (viewA != null && !map.containsKey(ebVar.b())) {
                fb<?> fbVarA = this.f385945b.a(viewA, ebVar.c());
                if (fbVarA == null) {
                    this.f385945b.getClass();
                    fbVarA = gb.a(viewA);
                }
                map.put(ebVar.b(), fbVarA);
            }
        }
        for (Map.Entry entry : this.f385944a.b().entrySet()) {
            String str = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null && !map.containsKey(str)) {
                this.f385945b.getClass();
                map.put(str, gb.a(view));
            }
        }
        return map;
    }

    public hb(@Y61.k com.yandex.mobile.ads.nativeads.c0 c0Var, @Y61.k w20 w20Var, @Y61.k wd0 wd0Var, @Y61.k om0 om0Var, @Y61.k cm0 cm0Var, @Y61.k oo0 oo0Var) {
        this(c0Var, new gb(w20Var, wd0Var, om0Var, cm0Var), oo0Var.b());
    }
}
