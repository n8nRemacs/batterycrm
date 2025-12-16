package com.avito.beduin.v2.engine.component;

import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Reader.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/component/s;", "Lcom/avito/beduin/v2/engine/component/C;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class s implements C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.z f336576a;

    /* compiled from: Reader.kt */
    @s0
    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0018\u0010\u0006\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lcom/avito/beduin/v2/engine/core/z;", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "handleError", "Lcom/avito/beduin/v2/engine/core/K;", "invoke", "(Lcom/avito/beduin/v2/engine/core/z;LY41/l;)Lcom/avito/beduin/v2/engine/core/K;", "com/avito/beduin/v2/engine/component/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<com.avito.beduin.v2.engine.core.z, Y41.l<? super Exception, ? extends Object>, K<? extends Object>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.c f336577l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.beduin.v2.engine.field.entity.c cVar, String str, boolean z12) {
            super(2);
            this.f336577l = cVar;
        }

        @Override // Y41.p
        public final K<? extends Object> invoke(com.avito.beduin.v2.engine.core.z zVar, Y41.l<? super Exception, ? extends Object> lVar) {
            com.avito.beduin.v2.engine.core.z zVar2 = zVar;
            com.avito.beduin.v2.engine.field.m.f336868b.getClass();
            com.avito.beduin.v2.engine.field.m mVar = com.avito.beduin.v2.engine.field.m.f336869c;
            return zVar2.n(zVar2.getF336696a(), "@componentValue").o(this.f336577l, mVar, lVar);
        }
    }

    /* compiled from: Reader.kt */
    @s0
    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0018\u0010\u0006\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lcom/avito/beduin/v2/engine/core/z;", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "handleError", "Lcom/avito/beduin/v2/engine/core/K;", "invoke", "(Lcom/avito/beduin/v2/engine/core/z;LY41/l;)Lcom/avito/beduin/v2/engine/core/K;", "com/avito/beduin/v2/engine/component/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<com.avito.beduin.v2.engine.core.z, Y41.l<? super Exception, ? extends Object>, K<? extends Object>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.c f336578l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f336579m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f336580n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ZT0.a f336581o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.beduin.v2.engine.field.entity.c cVar, String str, boolean z12, ZT0.a aVar) {
            super(2);
            this.f336578l = cVar;
            this.f336579m = str;
            this.f336580n = z12;
            this.f336581o = aVar;
        }

        @Override // Y41.p
        public final K<? extends Object> invoke(com.avito.beduin.v2.engine.core.z zVar, Y41.l<? super Exception, ? extends Object> lVar) {
            com.avito.beduin.v2.engine.core.z zVar2 = zVar;
            Y41.l<? super Exception, ? extends Object> lVar2 = lVar;
            com.avito.beduin.v2.engine.field.entity.c cVar = this.f336578l;
            if (!this.f336580n) {
                com.avito.beduin.v2.engine.field.m.f336868b.getClass();
                return zVar2.n(zVar2.getF336696a(), "@componentValue").o(cVar, com.avito.beduin.v2.engine.field.m.f336869c, lVar2);
            }
            com.avito.beduin.v2.engine.field.m.f336868b.getClass();
            com.avito.beduin.v2.engine.field.m mVar = com.avito.beduin.v2.engine.field.m.f336869c;
            return zVar2.D(zVar2.getF336696a(), "@recycleComponentValue").i(this.f336581o.d(this.f336579m), cVar, mVar, lVar2);
        }
    }

    public s(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        this.f336576a = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T o(@Y61.l com.avito.beduin.v2.engine.field.d r13, @Y61.k java.lang.String r14, @Y61.k Y41.q<? super com.avito.beduin.v2.engine.component.G, ? super com.avito.beduin.v2.engine.component.InterfaceC36249i, ? super java.lang.String, ? extends T> r15) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.component.s.o(com.avito.beduin.v2.engine.field.d, java.lang.String, Y41.q):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.beduin.v2.engine.core.z] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.avito.beduin.v2.engine.field.d] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.avito.beduin.v2.engine.core.N, com.avito.beduin.v2.engine.core.b] */
    @Y61.k
    public final <T> List<T> p(@Y61.l com.avito.beduin.v2.engine.field.d dVar, @Y61.k String str, @Y61.k Y41.p<? super InterfaceC36241a, ? super Integer, ? extends T> pVar) {
        Object f336702c;
        ?? arrayList;
        ?? r12 = this.f336576a;
        C36268a c36268aL = dVar != 0 ? dVar.l(r12) : null;
        boolean zU2 = r12.u();
        if (zU2) {
            ?? E12 = r12.E(r12.getF336696a(), str, c36268aL);
            r12.w(E12);
            if (!E12.getF336701b()) {
                com.avito.beduin.v2.engine.core.z zVarG = E12.g();
                try {
                    if (c36268aL != null) {
                        r rVar = new r(zVarG, c36268aL);
                        kotlin.ranges.l lVarI = C42745f0.I(c36268aL.f336782b);
                        arrayList = new ArrayList(C42745f0.q(lVarI, 10));
                        kotlin.ranges.k it = lVarI.iterator();
                        while (it.f406910d) {
                            arrayList.add(pVar.invoke(rVar, Integer.valueOf(it.a())));
                        }
                    } else {
                        arrayList = C42784z0.f406748b;
                    }
                    E12.l(arrayList);
                } catch (Throwable th2) {
                    E12.l(null);
                    throw th2;
                }
            }
            f336702c = E12.getF336702c();
        } else {
            com.avito.beduin.v2.engine.core.z zVarX = r12.x(str, zU2);
            if (c36268aL != null) {
                r rVar2 = new r(zVarX, c36268aL);
                kotlin.ranges.l lVarI2 = C42745f0.I(c36268aL.f336782b);
                ArrayList arrayList2 = new ArrayList(C42745f0.q(lVarI2, 10));
                kotlin.ranges.k it2 = lVarI2.iterator();
                while (it2.f406910d) {
                    arrayList2.add(pVar.invoke(rVar2, Integer.valueOf(it2.a())));
                }
                f336702c = arrayList2;
            } else {
                f336702c = C42784z0.f406748b;
            }
        }
        return (List) f336702c;
    }

    public final <T> T q(@Y61.l com.avito.beduin.v2.engine.field.d dVar, @Y61.k String str, @Y61.k Y41.l<? super G, ? extends T> lVar) {
        w wVar;
        com.avito.beduin.v2.engine.core.z zVar = this.f336576a;
        com.avito.beduin.v2.engine.field.entity.A a12 = dVar != null ? dVar.a(zVar) : null;
        boolean zU2 = zVar.u();
        if (!zU2) {
            return lVar.invoke(a12 != null ? new w(zVar.x(str, zU2), a12.f336778b) : null);
        }
        InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), str, a12);
        zVar.w(interfaceC36252bE);
        if (!interfaceC36252bE.getF336701b()) {
            com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bE.g();
            if (a12 != null) {
                try {
                    wVar = new w(zVarG, a12.f336778b);
                } catch (Throwable th2) {
                    interfaceC36252bE.l(null);
                    throw th2;
                }
            } else {
                wVar = null;
            }
            interfaceC36252bE.l(lVar.invoke(wVar));
        }
        return (T) interfaceC36252bE.getF336702c();
    }

    @Y61.l
    public final <T> T r(@Y61.l com.avito.beduin.v2.engine.field.d dVar, @Y61.k String str, @Y61.k Y41.l<? super G, ? extends T> lVar) {
        com.avito.beduin.v2.engine.core.z zVar = this.f336576a;
        com.avito.beduin.v2.engine.field.entity.A a12 = dVar != null ? dVar.a(zVar) : null;
        boolean zU2 = zVar.u();
        if (!zU2) {
            return a12 != null ? lVar.invoke(new w(zVar.x(str, zU2), a12)) : null;
        }
        InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), str, a12);
        zVar.w(interfaceC36252bE);
        if (!interfaceC36252bE.getF336701b()) {
            com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bE.g();
            if (a12 != null) {
                try {
                    tInvoke = lVar.invoke(new w(zVarG, a12));
                } finally {
                    interfaceC36252bE.l(null);
                }
            }
        }
        return (T) interfaceC36252bE.getF336702c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T s(@Y61.l com.avito.beduin.v2.engine.field.d r16, @Y61.k java.lang.String r17, @Y61.k ZT0.a r18, @Y61.k Y41.q<? super com.avito.beduin.v2.engine.component.G, ? super com.avito.beduin.v2.engine.component.InterfaceC36249i, ? super java.lang.String, ? extends T> r19) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.component.s.s(com.avito.beduin.v2.engine.field.d, java.lang.String, ZT0.a, Y41.q):java.lang.Object");
    }
}
