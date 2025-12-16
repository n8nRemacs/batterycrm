package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.functions.base.C36279c;
import com.avito.beduin.v2.functions.base.C36279c.b;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* compiled from: ArrayFindLastFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/h;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36289h extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36289h f337077a = new C36289h();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337078b = "ArrayFindLast";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.d dVar;
        com.avito.beduin.v2.engine.field.entity.x xVarV = mVar.v(zVar, "predicate");
        if (xVarV == null) {
            return com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        C36268a c36268aN = mVar.n(zVar, "array");
        if (c36268aN == null) {
            return com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        C36279c c36279c = new C36279c(xVarV, "it");
        List<com.avito.beduin.v2.engine.field.d> list = c36268aN.f336782b;
        ListIterator<com.avito.beduin.v2.engine.field.d> listIterator = list.listIterator(list.size());
        int i12 = 0;
        while (true) {
            dVar = null;
            if (!listIterator.hasPrevious()) {
                break;
            }
            com.avito.beduin.v2.engine.field.d dVarPrevious = listIterator.previous();
            com.avito.beduin.v2.engine.field.d dVar2 = dVarPrevious;
            C36279c.b bVar = c36279c.new b();
            if (c36279c.f337049c.contains("it")) {
                bVar.f337052a.put("it", dVar2);
            }
            C36279c.a aVarA = bVar.a();
            int i13 = i12 + 1;
            InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), String.valueOf(i12), aVarA);
            zVar.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336616h()) {
                com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bE.g();
                try {
                    com.avito.beduin.v2.engine.field.entity.v vVarQ = xVarV.o(zVarG, aVarA.a()).q(zVarG);
                    interfaceC36252bE.l(Boolean.valueOf(kotlin.jvm.internal.L.f(vVarQ != null ? Boolean.valueOf(vVarQ.getF336837b()) : null, Boolean.TRUE)));
                } catch (Throwable th2) {
                    interfaceC36252bE.l(null);
                    throw th2;
                }
            }
            if (((Boolean) interfaceC36252bE.getF336702c()).booleanValue()) {
                dVar = dVarPrevious;
                break;
            }
            i12 = i13;
        }
        com.avito.beduin.v2.engine.field.d dVar3 = dVar;
        return dVar3 == null ? com.avito.beduin.v2.engine.field.entity.f.f336800b : dVar3;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337078b;
    }
}
