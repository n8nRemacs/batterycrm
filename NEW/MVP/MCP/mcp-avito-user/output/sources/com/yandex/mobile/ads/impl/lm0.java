package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.qm0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes8.dex */
final class lm0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a4 f387579a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final xb f387580b = new xb();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final g30 f387581c = new g30();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final i30 f387582d = new i30();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final q20 f387583e;

    public interface a {
    }

    public lm0(@j.N Context context, @j.N a4 a4Var) {
        this.f387579a = a4Var;
        this.f387583e = new q20(context);
    }

    public final void a(@j.N uj0 uj0Var, @j.N hs0 hs0Var, @j.N qm0.b bVar) {
        bl0 bl0VarC = uj0Var.c();
        LinkedHashSet linkedHashSetA = this.f387582d.a(bl0VarC.e());
        this.f387583e.getClass();
        HashSet hashSet = new HashSet();
        List<vq> listD = bl0VarC.d();
        if (listD != null) {
            Iterator<vq> it = listD.iterator();
            while (it.hasNext()) {
                List<b30> listB = it.next().b();
                if (listB != null) {
                    hashSet.addAll(listB);
                }
            }
        }
        linkedHashSetA.addAll(hashSet);
        this.f387579a.b(z3.f392168h);
        this.f387583e.a(linkedHashSetA, new km0(this, uj0Var, hs0Var, bVar));
    }
}
