package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.functions.base.C36279c;
import com.avito.beduin.v2.functions.base.C36279c.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MapCharsFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/X;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class X extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final X f337023a = new X();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337024b = "MapChars";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        String strW = mVar.w(zVar, "value");
        if (strW == null) {
            strW = "";
        }
        com.avito.beduin.v2.engine.field.entity.x xVarV = mVar.v(zVar, "template");
        if (xVarV == null) {
            return C36273j.e(zVar, strW);
        }
        C36279c c36279c = new C36279c(xVarV, "it", "index");
        ArrayList arrayList = new ArrayList(strW.length());
        int i12 = 0;
        int i13 = 0;
        while (i12 < strW.length()) {
            int i14 = i13 + 1;
            String strValueOf = String.valueOf(strW.charAt(i12));
            String strValueOf2 = String.valueOf(i13);
            C36279c.b bVar = c36279c.new b();
            LinkedHashSet linkedHashSet = c36279c.f337049c;
            boolean zContains = linkedHashSet.contains("it");
            String str = strW;
            LinkedHashMap linkedHashMap = bVar.f337052a;
            if (zContains) {
                linkedHashMap.put("it", C36273j.e(zVar, strValueOf));
            }
            if (linkedHashSet.contains("index")) {
                linkedHashMap.put("index", C36273j.e(zVar, strValueOf2));
            }
            C36279c.a aVarA = bVar.a();
            String strP = androidx.appcompat.app.r.p("value[", i13, ']');
            try {
                InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), strValueOf2, aVarA);
                zVar.w(interfaceC36252bE);
                if (!interfaceC36252bE.getF336616h()) {
                    com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bE.g();
                    try {
                        com.avito.beduin.v2.engine.field.entity.v vVarQ = xVarV.o(zVarG, aVarA.a()).q(zVarG);
                        Object f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                        if (f336843b == null) {
                            f336843b = "";
                        }
                        interfaceC36252bE.l(f336843b);
                    } catch (Throwable th2) {
                        interfaceC36252bE.l(null);
                        throw th2;
                    }
                }
                arrayList.add((String) interfaceC36252bE.getF336702c());
                i12++;
                strW = str;
                i13 = i14;
            } catch (Exception e12) {
                throw new BeduinPropertyException(strP, e12);
            }
        }
        return C36273j.e(zVar, C42745f0.O(arrayList, "", null, null, null, 62));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337024b;
    }
}
