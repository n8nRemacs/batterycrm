package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ObserveMutationFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/s0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36311s0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36311s0 f337122a = new C36311s0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337123b = "ObserveMutation";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.l lVarT = mVar.t(zVar, "onMutate");
        try {
            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("mutable");
            com.avito.beduin.v2.engine.field.entity.p pVarK = dVarC != null ? dVarC.k(zVar) : null;
            if (pVarK == null) {
                throw new IllegalArgumentException("Property mutable is mandatory");
            }
            InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, "@newMutable", C42745f0.U(pVarK, lVarT));
            if (!interfaceC36252bK.getF336616h()) {
                try {
                    interfaceC36252bK.l(new com.avito.beduin.v2.engine.field.entity.p(pVarK.f336818b, new C36309r0(pVarK, lVarT, interfaceC36252bK.g())));
                } catch (Throwable th2) {
                    interfaceC36252bK.l(null);
                    throw th2;
                }
            }
            return (com.avito.beduin.v2.engine.field.entity.p) interfaceC36252bK.getF336702c();
        } catch (Exception e12) {
            throw new BeduinPropertyException("mutable", e12);
        }
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337123b;
    }
}
