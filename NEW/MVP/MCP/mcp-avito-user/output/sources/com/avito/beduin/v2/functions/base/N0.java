package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: SubstringFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/N0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class N0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final N0 f336989a = new N0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336990b = "Substring";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        String strW = mVar.w(zVar, "value");
        if (strW == null) {
            strW = "";
        }
        Integer numS = mVar.s(zVar, "start");
        int iIntValue = numS != null ? numS.intValue() : 0;
        Integer numS2 = mVar.s(zVar, "end");
        int iIntValue2 = numS2 != null ? numS2.intValue() : strW.length();
        int length = strW.length();
        f336989a.getClass();
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        if (iIntValue > length) {
            iIntValue = length - 1;
        }
        int length2 = strW.length();
        if (iIntValue2 < 0) {
            iIntValue2 += length2;
        }
        int i12 = iIntValue2 >= 0 ? iIntValue2 : 0;
        if (i12 <= length2) {
            length2 = i12;
        }
        if (length2 < iIntValue) {
            length2 = iIntValue;
        }
        return C36273j.e(zVar, strW.substring(iIntValue, length2));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f336990b;
    }
}
