package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: NewInstanceFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/n0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36302n0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36302n0 f337101a = new C36302n0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337102b = "NewInstance";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        Object objO;
        com.avito.beduin.v2.engine.field.entity.x xVarV = mVar.v(zVar, "constructor");
        if (xVarV == null) {
            return com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        String strW = mVar.w(zVar, "targetId");
        if (strW == null) {
            strW = com.avito.beduin.v2.engine.utils.f.a();
        }
        Boolean boolO = mVar.o(zVar, "withUserId");
        boolean zBooleanValue = boolO != null ? boolO.booleanValue() : false;
        boolean zF2 = zVar.F();
        List listU = C42745f0.U(xVarV, strW, Boolean.valueOf(zBooleanValue));
        if (zF2) {
            InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, "result", listU);
            if (!interfaceC36252bK.getF336616h()) {
                com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bK.g();
                try {
                    com.avito.beduin.v2.engine.field.d dVarO = xVarV.o(zVarG, new com.avito.beduin.v2.engine.field.m((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new kotlin.Q[]{new kotlin.Q("targetId", C36273j.e(zVarG, strW))}));
                    if (dVarO instanceof com.avito.beduin.v2.engine.field.entity.A) {
                        dVarO = com.avito.beduin.v2.engine.field.entity.A.t((com.avito.beduin.v2.engine.field.entity.A) dVarO, null, strW, 1);
                    }
                    interfaceC36252bK.l(dVarO);
                } catch (Throwable th2) {
                    interfaceC36252bK.l(null);
                    throw th2;
                }
            }
            objO = interfaceC36252bK.getF336702c();
        } else {
            objO = xVarV.o(zVar, new com.avito.beduin.v2.engine.field.m((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new kotlin.Q[]{new kotlin.Q("targetId", C36273j.e(zVar, strW))}));
            if (objO instanceof com.avito.beduin.v2.engine.field.entity.A) {
                objO = com.avito.beduin.v2.engine.field.entity.A.t((com.avito.beduin.v2.engine.field.entity.A) objO, null, strW, 1);
            }
        }
        return (com.avito.beduin.v2.engine.field.d) objO;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337102b;
    }
}
