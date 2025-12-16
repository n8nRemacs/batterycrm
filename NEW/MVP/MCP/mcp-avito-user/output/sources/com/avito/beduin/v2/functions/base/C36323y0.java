package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: RangeFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/y0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.y0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36323y0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36323y0 f337146a = new C36323y0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337147b = "Range";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
        kotlin.ranges.o oVar = new kotlin.ranges.o(mVar.j(zVar, "start"), mVar.j(zVar, "end"));
        ArrayList arrayList = new ArrayList(C42745f0.q(oVar, 10));
        Iterator<Long> it = oVar.iterator();
        while (((kotlin.ranges.n) it).f406920d) {
            arrayList.add(C36273j.d(zVar, ((kotlin.collections.L0) it).a()));
        }
        return new C36268a(arrayList);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337147b;
    }
}
