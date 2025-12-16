package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
final class tj0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n20 f390211a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final vb0 f390212b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final nb f390213c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final tb f390214d;

    public tj0(@j.N Context context) {
        n20 n20Var = new n20(context, new z20());
        this.f390211a = n20Var;
        this.f390212b = new vb0(n20Var);
        this.f390213c = new nb();
        this.f390214d = new tb();
    }

    @j.N
    public final ArrayList a(@j.N com.monetization.ads.mediation.nativeads.b bVar, @j.N Map map) {
        ArrayList arrayList = new ArrayList();
        bVar.getClass();
        arrayList.add(a((Object) null, "age"));
        arrayList.add(a((Object) null, "body"));
        arrayList.add(a((Object) null, "call_to_action"));
        arrayList.add(a((Object) null, "domain"));
        arrayList.add(a(this.f390211a.a(map, null), "favicon"));
        arrayList.add(a(this.f390211a.a(map, null), "icon"));
        arrayList.add(a(this.f390212b.a(map, null, null), "media"));
        arrayList.add(a((Object) null, "price"));
        arrayList.add(a("null", "rating"));
        arrayList.add(a((Object) null, "review_count"));
        arrayList.add(a((Object) null, "sponsored"));
        arrayList.add(a((Object) null, "title"));
        arrayList.add(a((Object) null, ConstraintKt.WARNING));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eb ebVar = (eb) it.next();
            if (ebVar != null) {
                arrayList2.add(ebVar);
            }
        }
        return arrayList2;
    }

    @j.P
    private eb a(@j.P Object obj, @j.N String str) {
        this.f390214d.getClass();
        sb sbVarA = tb.a(str);
        if (obj == null || !sbVarA.a(obj)) {
            return null;
        }
        this.f390213c.getClass();
        return nb.a(str).a(obj, str);
    }
}
