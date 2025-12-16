package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;

/* loaded from: classes8.dex */
public final class r90 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f389447a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final n2 f389448b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final pa f389449c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ch0 f389450d;

    @X41.j
    public r90(@Y61.k Context context, @Y61.k n2 n2Var) {
        this(context, n2Var, 0);
    }

    private final List<w2> a() {
        w2 w2VarA;
        w2 w2VarA2;
        try {
            this.f389449c.a();
            w2VarA = null;
        } catch (g70 e12) {
            w2VarA = i5.a(e12.getMessage(), e12.a());
        }
        try {
            this.f389450d.a(this.f389447a);
            w2VarA2 = null;
        } catch (g70 e13) {
            w2VarA2 = i5.a(e13.getMessage(), e13.a());
        }
        return C42756l.B(new w2[]{w2VarA, w2VarA2, this.f389448b.c() == null ? i5.f386324p : null, this.f389448b.a() == null ? i5.f386322n : null});
    }

    @Y61.l
    public final w2 b() {
        ArrayList arrayListH0 = C42745f0.h0(C42745f0.V(this.f389448b.n() == null ? i5.f386325q : null), a());
        String strA = this.f389448b.b().a();
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListH0, 10));
        Iterator it = arrayListH0.iterator();
        while (it.hasNext()) {
            arrayList.add(((w2) it.next()).c());
        }
        y2.a(strA, arrayList);
        return (w2) C42745f0.G(arrayListH0);
    }

    @Y61.l
    public final w2 c() {
        return (w2) C42745f0.G(a());
    }

    @X41.j
    public r90(@Y61.k Context context, @Y61.k n2 n2Var, @Y61.k pa paVar, @Y61.k ch0 ch0Var) {
        this.f389447a = context;
        this.f389448b = n2Var;
        this.f389449c = paVar;
        this.f389450d = ch0Var;
    }

    public /* synthetic */ r90(Context context, n2 n2Var, int i12) {
        this(context, n2Var, new pa(), ch0.f384297e.a());
    }
}
