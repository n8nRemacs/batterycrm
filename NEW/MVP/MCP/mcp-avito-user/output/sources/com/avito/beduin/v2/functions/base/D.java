package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ContainsFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/D;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class D extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final D f336945a = new D();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336946b = "Contains";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        Iterable iterable;
        com.avito.beduin.v2.engine.field.d dVar;
        C36268a c36268aN = mVar.n(zVar, "array");
        if (c36268aN == null || (iterable = c36268aN.f336782b) == null) {
            iterable = C42784z0.f406748b;
        }
        Boolean boolO = mVar.o(zVar, "checkEquals");
        boolean zBooleanValue = boolO != null ? boolO.booleanValue() : false;
        com.avito.beduin.v2.engine.field.d dVarP = mVar.p(zVar, "item");
        if (dVarP == null) {
            dVarP = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        Object obj = null;
        if (zBooleanValue) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((com.avito.beduin.v2.engine.field.d) next).b(zVar, dVarP)) {
                    obj = next;
                    break;
                }
            }
            dVar = (com.avito.beduin.v2.engine.field.d) obj;
        } else {
            Iterator it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (kotlin.jvm.internal.L.f((com.avito.beduin.v2.engine.field.d) next2, dVarP)) {
                    obj = next2;
                    break;
                }
            }
            dVar = (com.avito.beduin.v2.engine.field.d) obj;
        }
        return C36273j.f(zVar, dVar != null);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF415160b() {
        return f336946b;
    }
}
