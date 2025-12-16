package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ArrayIndexOfFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/l;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36297l extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36297l f337091a = new C36297l();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337092b = "ArrayIndexOf";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        C36268a c36268aD = mVar.d(zVar, "array");
        com.avito.beduin.v2.engine.field.d dVarQ = mVar.q("item");
        if (dVarQ == null) {
            dVarQ = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        Boolean boolO = mVar.o(zVar, "checkContentEquals");
        int i12 = 0;
        boolean zBooleanValue = boolO != null ? boolO.booleanValue() : false;
        int i13 = -1;
        List<com.avito.beduin.v2.engine.field.d> list = c36268aD.f336782b;
        if (zBooleanValue) {
            Iterator<com.avito.beduin.v2.engine.field.d> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().b(zVar, dVarQ)) {
                    i13 = i12;
                    break;
                }
                i12++;
            }
        } else {
            Iterator<com.avito.beduin.v2.engine.field.d> it2 = list.iterator();
            while (it2.hasNext()) {
                if (kotlin.jvm.internal.L.f(it2.next(), dVarQ)) {
                    i13 = i12;
                    break;
                }
                i12++;
            }
        }
        return C36273j.c(zVar, i13);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF415156b() {
        return f337092b;
    }
}
