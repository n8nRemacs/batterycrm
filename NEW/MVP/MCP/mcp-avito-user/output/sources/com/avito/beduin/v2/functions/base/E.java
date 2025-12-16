package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ContainsSubstringFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/E;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class E extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final E f336949a = new E();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336950b = "ContainsSubstring";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        String strW = mVar.w(zVar, "value");
        if (strW == null) {
            strW = "";
        }
        String strW2 = mVar.w(zVar, "substring");
        String str = strW2 != null ? strW2 : "";
        Boolean boolO = mVar.o(zVar, "ignoreCase");
        return C36273j.f(zVar, C43066x.q(strW, str, boolO != null ? boolO.booleanValue() : false));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414529b() {
        return f336950b;
    }
}
