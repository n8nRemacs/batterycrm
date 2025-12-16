package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: JoinToStringFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/W;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class W extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final W f337019a = new W();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337020b = "JoinToString";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        List<com.avito.beduin.v2.engine.field.d> list;
        C36268a c36268aN = mVar.n(zVar, "items");
        if (c36268aN == null || (list = c36268aN.f336782b) == null) {
            return C36273j.e(zVar, "");
        }
        List<com.avito.beduin.v2.engine.field.d> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            String f336843b = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) obj;
            String strP = androidx.appcompat.app.r.p("items[", i12, ']');
            try {
                com.avito.beduin.v2.engine.field.entity.v vVarQ = dVar.q(zVar);
                if (vVarQ != null) {
                    f336843b = vVarQ.getF336843b();
                }
                arrayList.add(f336843b);
                i12 = i13;
            } catch (Exception e12) {
                throw new BeduinPropertyException(strP, e12);
            }
        }
        String strW = mVar.w(zVar, "separator");
        return C36273j.e(zVar, C42745f0.O(arrayList, strW == null ? "" : strW, null, null, null, 62));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414537c() {
        return f337020b;
    }
}
