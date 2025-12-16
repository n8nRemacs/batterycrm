package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ReplaceFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/B0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final B0 f336933a = new B0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336934b = "Replace";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        String strW = mVar.w(zVar, SearchParamsConverterKt.SOURCE);
        if (strW == null) {
            strW = "";
        }
        String strW2 = mVar.w(zVar, "oldValue");
        if (strW2 == null) {
            strW2 = "";
        }
        String strW3 = mVar.w(zVar, "newValue");
        return C36273j.e(zVar, C43066x.a0(strW, strW2, strW3 != null ? strW3 : "", false));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414529b() {
        return f336934b;
    }
}
