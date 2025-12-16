package com.avito.beduin.v2.functions.base;

import androidx.compose.runtime.C22026a;
import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: WhenFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/functions/base/d1;", "LcU0/a;", "<init>", "()V", "a", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d1 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d1 f337062a = new d1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337063b = "When";

    /* compiled from: WhenFunction.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/functions/base/d1$a;", "", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.x f337064a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.x f337065b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f337066c;

        public a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.k String str) throws BeduinPropertyException {
            com.avito.beduin.v2.engine.field.entity.x xVarY = mVar.y(zVar, "condition");
            com.avito.beduin.v2.engine.field.entity.x xVarY2 = mVar.y(zVar, "result");
            this.f337064a = xVarY;
            this.f337065b = xVarY2;
            this.f337066c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f337064a, aVar.f337064a) && kotlin.jvm.internal.L.f(this.f337065b, aVar.f337065b) && kotlin.jvm.internal.L.f(this.f337066c, aVar.f337066c);
        }

        public final int hashCode() {
            com.avito.beduin.v2.engine.field.entity.x xVar = this.f337064a;
            int iHashCode = (xVar == null ? 0 : xVar.hashCode()) * 31;
            com.avito.beduin.v2.engine.field.entity.x xVar2 = this.f337065b;
            return this.f337066c.hashCode() + ((iHashCode + (xVar2 != null ? xVar2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Case(condition=");
            sb2.append(this.f337064a);
            sb2.append(", result=");
            sb2.append(this.f337065b);
            sb2.append(", key=");
            return C22026a.c(sb2, this.f337066c, ')');
        }
    }

    @Override // cU0.AbstractC27103a, cU0.InterfaceC27104b
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.h hVar, @Y61.k Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>> map) {
        Object objA;
        if (!zVar.a().f336480g) {
            if (zVar.F()) {
                InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), "@wrapCasesToRaw", hVar);
                zVar.w(interfaceC36252bE);
                if (!interfaceC36252bE.getF336616h()) {
                    interfaceC36252bE.g();
                    try {
                        interfaceC36252bE.l(e1.a(hVar));
                    } catch (Throwable th2) {
                        interfaceC36252bE.l(null);
                        throw th2;
                    }
                }
                objA = interfaceC36252bE.getF336702c();
            } else {
                objA = e1.a(hVar);
            }
            hVar = (com.avito.beduin.v2.engine.field.h) objA;
        }
        return super.a(zVar, jVar, str, hVar, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.avito.beduin.v2.engine.core.z] */
    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        ?? arrayList;
        Object next;
        Object objC;
        InterfaceC36252b interfaceC36252bE;
        com.avito.beduin.v2.engine.field.d dVarC;
        Object objValueOf;
        List<com.avito.beduin.v2.engine.field.d> list;
        C36268a c36268aN = mVar.n(zVar, "cases");
        if (c36268aN == null || (list = c36268aN.f336782b) == null) {
            arrayList = C42784z0.f406748b;
        } else {
            arrayList = new ArrayList();
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.beduin.v2.engine.field.entity.A a12 = ((com.avito.beduin.v2.engine.field.d) obj).a(zVar);
                a aVar = a12 != null ? new a(zVar, a12.f336778b, String.valueOf(i12)) : null;
                if (aVar != null) {
                    arrayList.add(aVar);
                }
                i12 = i13;
            }
        }
        Iterator it = ((Iterable) arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            a aVar2 = (a) next;
            aVar2.getClass();
            boolean zF2 = zVar.F();
            String str = "@condition:" + aVar2.f337066c;
            boolean zBooleanValue = true;
            com.avito.beduin.v2.engine.field.entity.x xVar = aVar2.f337064a;
            if (zF2) {
                interfaceC36252bE = zVar.E(zVar.getF336696a(), str, xVar);
                zVar.w(interfaceC36252bE);
                if (!interfaceC36252bE.getF336616h()) {
                    com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bE.g();
                    if (xVar != null) {
                        try {
                            com.avito.beduin.v2.engine.field.m.f336868b.getClass();
                            com.avito.beduin.v2.engine.field.entity.v vVarQ = xVar.o(zVarG, com.avito.beduin.v2.engine.field.m.f336869c).q(zVarG);
                            Boolean boolValueOf = vVarQ != null ? Boolean.valueOf(vVarQ.getF336837b()) : null;
                            zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
                        } finally {
                        }
                    }
                    interfaceC36252bE.l(Boolean.valueOf(zBooleanValue));
                }
                objValueOf = interfaceC36252bE.getF336702c();
            } else {
                com.avito.beduin.v2.engine.core.z zVarX = zVar.x(str, zF2);
                if (xVar != null) {
                    com.avito.beduin.v2.engine.field.m.f336868b.getClass();
                    com.avito.beduin.v2.engine.field.entity.v vVarQ2 = xVar.o(zVarX, com.avito.beduin.v2.engine.field.m.f336869c).q(zVarX);
                    Boolean boolValueOf2 = vVarQ2 != null ? Boolean.valueOf(vVarQ2.getF336837b()) : null;
                    zBooleanValue = boolValueOf2 != null ? boolValueOf2.booleanValue() : false;
                }
                objValueOf = Boolean.valueOf(zBooleanValue);
            }
            if (((Boolean) objValueOf).booleanValue()) {
                break;
            }
        }
        a aVar3 = (a) next;
        if (aVar3 != null) {
            boolean zF3 = zVar.F();
            String str2 = "@result:" + aVar3.f337066c;
            com.avito.beduin.v2.engine.field.entity.x xVar2 = aVar3.f337065b;
            if (zF3) {
                interfaceC36252bE = zVar.E(zVar.getF336696a(), str2, xVar2);
                zVar.w(interfaceC36252bE);
                if (!interfaceC36252bE.getF336616h()) {
                    com.avito.beduin.v2.engine.core.z zVarG2 = interfaceC36252bE.g();
                    try {
                        if (xVar2 == null) {
                            dVarC = com.avito.beduin.v2.engine.field.entity.f.f336800b;
                        } else {
                            com.avito.beduin.v2.engine.field.m.f336868b.getClass();
                            dVarC = xVar2.o(zVarG2, com.avito.beduin.v2.engine.field.m.f336869c).c(zVarG2);
                        }
                        interfaceC36252bE.l(dVarC);
                    } finally {
                    }
                }
                objC = interfaceC36252bE.getF336702c();
            } else {
                com.avito.beduin.v2.engine.core.z zVarX2 = zVar.x(str2, zF3);
                if (xVar2 == null) {
                    objC = com.avito.beduin.v2.engine.field.entity.f.f336800b;
                } else {
                    com.avito.beduin.v2.engine.field.m.f336868b.getClass();
                    objC = xVar2.o(zVarX2, com.avito.beduin.v2.engine.field.m.f336869c).c(zVarX2);
                }
            }
            com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) objC;
            if (dVar != null) {
                return dVar;
            }
        }
        return com.avito.beduin.v2.engine.field.entity.f.f336800b;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337063b;
    }
}
