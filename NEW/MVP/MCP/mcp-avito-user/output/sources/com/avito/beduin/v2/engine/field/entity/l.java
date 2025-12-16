package com.avito.beduin.v2.engine.field.entity;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.exception.EngineBeduinException;
import com.avito.beduin.v2.engine.field.a;
import com.avito.beduin.v2.engine.field.d;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InteractionField.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/l;", "Lcom/avito/beduin/v2/engine/field/d;", "", "id", "interactionType", "Lcom/avito/beduin/v2/engine/field/h;", "params", "Lcom/avito/beduin/v2/engine/field/a;", "args", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/beduin/v2/engine/field/h;Ljava/util/Map;Lkotlin/jvm/internal/w;)V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class l implements com.avito.beduin.v2.engine.field.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f336808b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f336809c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.h f336810d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> f336811e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f336812f;

    public l() {
        throw null;
    }

    public l(String str, String str2, com.avito.beduin.v2.engine.field.h hVar, Map map, C42822w c42822w) {
        this.f336808b = str;
        this.f336809c = str2;
        this.f336810d = hVar;
        this.f336811e = map;
        this.f336812f = str == null ? "" : str;
    }

    public static final dU0.f s(l lVar, com.avito.beduin.v2.engine.core.z zVar, Exception exc) {
        lVar.getClass();
        EngineBeduinException.InteractionException.f336727i.getClass();
        EngineBeduinException.InteractionException interactionExceptionA = EngineBeduinException.InteractionException.a.a(lVar.f336809c, exc);
        InterfaceC36274k f336594a = zVar.getF336594a();
        com.avito.beduin.v2.engine.utils.e.b(interactionExceptionA, "InteractionField", null);
        f336594a.y(interactionExceptionA);
        return zVar.I("InteractionException").a(zVar, com.avito.beduin.v2.engine.utils.e.d(zVar, interactionExceptionA.f336728g, interactionExceptionA.f336729h, interactionExceptionA));
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.g(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        return equals(dVar.h(zVar));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!L.f(this.f336808b, lVar.f336808b) || !L.f(this.f336809c, lVar.f336809c) || !L.f(this.f336810d, lVar.f336810d)) {
            return false;
        }
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        return L.f(this.f336811e, lVar.f336811e);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.f(zVar, this);
        throw null;
    }

    public final int hashCode() {
        String str = this.f336808b;
        int iC2 = AK.c.c(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f336809c), 31, this.f336810d.f336867a);
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        return this.f336811e.hashCode() + iC2;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.d(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.a(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        throw new UnsupportedOperationException(d.a.a(com.avito.beduin.v2.engine.field.d.f336773a, this, zVar) + " can't be used as Patch");
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.e(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.b(zVar, this);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final dU0.f t(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        Object q12;
        Object objS;
        Object objE;
        InterfaceC36252b interfaceC36252bE;
        dU0.f fVarA;
        dU0.f fVarS;
        Object objE2;
        com.avito.beduin.v2.engine.field.m mVarD;
        Q q13;
        com.avito.beduin.v2.engine.core.z zVarI = zVar.getF336594a().i();
        boolean zF2 = zVarI.F();
        String str = this.f336809c;
        if (zF2) {
            interfaceC36252bE = zVarI.E(zVarI.getF336594a(), "@factory", str);
            zVarI.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336701b()) {
                com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bE.g();
                try {
                    try {
                        q13 = new Q(zVarG.I(str), null);
                    } catch (Exception e12) {
                        RU0.b.f14467a.e("InteractionField", com.avito.beduin.v2.engine.utils.d.c("[" + str + "] interaction", com.avito.beduin.v2.engine.utils.d.a(e12)), e12);
                        q13 = new Q(zVarG.I("InteractionException"), e12);
                    }
                    interfaceC36252bE.l(q13);
                } finally {
                }
            }
            q12 = interfaceC36252bE.getF336702c();
        } else {
            try {
                q12 = new Q(zVarI.I(str), null);
            } catch (Exception e13) {
                RU0.b.f14467a.e("InteractionField", com.avito.beduin.v2.engine.utils.d.c(AK.c.k("[", str, "] interaction"), com.avito.beduin.v2.engine.utils.d.a(e13)), e13);
                q12 = new Q(zVarI.I("InteractionException"), e13);
            }
        }
        Q q14 = (Q) q12;
        dU0.c cVar = (dU0.c) q14.f406619b;
        Exception exc = (Exception) q14.f406620c;
        if (exc != null) {
            if (exc instanceof EngineBeduinException.UnregisteredInteractionException) {
                EngineBeduinException.UnregisteredInteractionException unregisteredInteractionException = (EngineBeduinException.UnregisteredInteractionException) exc;
                Q q15 = new Q("type", C36273j.e(zVarI, unregisteredInteractionException.f336730g));
                List listA = com.avito.beduin.v2.engine.utils.d.a(unregisteredInteractionException);
                ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(C36273j.e(zVarI, (String) it.next()));
                }
                mVarD = new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{q15, new Q("trace", new C36268a(arrayList))});
            } else {
                mVarD = com.avito.beduin.v2.engine.utils.e.d(zVarI, str, null, exc);
            }
            fVarA = cVar.a(zVarI, mVarD);
        } else {
            Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> mapA = mVar.A(this.f336812f);
            a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
            LinkedHashMap linkedHashMapK = P0.k(this.f336811e, mapA);
            boolean zF3 = zVarI.F();
            com.avito.beduin.v2.engine.field.a aVarA = com.avito.beduin.v2.engine.field.a.a(linkedHashMapK);
            com.avito.beduin.v2.engine.field.h hVar = this.f336810d;
            List listU = C42745f0.U(cVar, hVar, aVarA);
            String str2 = this.f336808b;
            if (zF3) {
                InterfaceC36252b interfaceC36252bK = C31685o.k(zVarI, "@result", listU);
                if (!interfaceC36252bK.getF336701b()) {
                    com.avito.beduin.v2.engine.core.z zVarG2 = interfaceC36252bK.g();
                    try {
                        try {
                            boolean zF4 = zVarG2.F();
                            List listU2 = C42745f0.U(hVar, com.avito.beduin.v2.engine.field.a.a(linkedHashMapK));
                            if (zF4) {
                                interfaceC36252bE = zVarG2.E(zVarG2.getF336594a(), "@params", listU2);
                                zVarG2.w(interfaceC36252bE);
                                if (!interfaceC36252bE.getF336701b()) {
                                    try {
                                        interfaceC36252bE.l(hVar.e(interfaceC36252bE.g(), linkedHashMapK, str2));
                                    } finally {
                                    }
                                }
                                objE2 = interfaceC36252bE.getF336702c();
                            } else {
                                objE2 = hVar.e(zVarG2.x("@params", zF4), linkedHashMapK, str2);
                            }
                            com.avito.beduin.v2.engine.field.m mVar2 = (com.avito.beduin.v2.engine.field.m) objE2;
                            i iVarA = mVar2.a();
                            if (iVarA != null) {
                                fVarS = s(this, zVarG2, iVarA.f336804b);
                            } else {
                                try {
                                    fVarS = cVar.a(zVarG2, mVar2);
                                } catch (Exception e14) {
                                    fVarS = s(this, zVarG2, e14);
                                }
                            }
                        } catch (Throwable th2) {
                            interfaceC36252bK.l(null);
                            throw th2;
                        }
                    } catch (Exception e15) {
                        fVarS = s(this, zVarG2, e15);
                    }
                    interfaceC36252bK.l(fVarS);
                }
                objS = interfaceC36252bK.getF336702c();
            } else {
                com.avito.beduin.v2.engine.core.z zVarX = zVarI.x("@result", zF3);
                try {
                    boolean zF5 = zVarX.F();
                    List listU3 = C42745f0.U(hVar, com.avito.beduin.v2.engine.field.a.a(linkedHashMapK));
                    if (zF5) {
                        interfaceC36252bE = zVarX.E(zVarX.getF336594a(), "@params", listU3);
                        zVarX.w(interfaceC36252bE);
                        if (!interfaceC36252bE.getF336701b()) {
                            try {
                                interfaceC36252bE.l(hVar.e(interfaceC36252bE.g(), linkedHashMapK, str2));
                            } finally {
                            }
                        }
                        objE = interfaceC36252bE.getF336702c();
                    } else {
                        objE = hVar.e(zVarX.x("@params", zF5), linkedHashMapK, str2);
                    }
                    com.avito.beduin.v2.engine.field.m mVar3 = (com.avito.beduin.v2.engine.field.m) objE;
                    i iVarA2 = mVar3.a();
                    if (iVarA2 != null) {
                        objS = s(this, zVarX, iVarA2.f336804b);
                    } else {
                        try {
                            objS = cVar.a(zVarX, mVar3);
                        } catch (Exception e16) {
                            objS = s(this, zVarX, e16);
                        }
                    }
                } catch (Exception e17) {
                    objS = s(this, zVarX, e17);
                }
            }
            fVarA = (dU0.f) objS;
        }
        zVarI.close();
        return fVarA;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InteractionData(id=");
        sb2.append(this.f336808b);
        sb2.append(", interactionType=");
        sb2.append(this.f336809c);
        sb2.append(", params=");
        sb2.append(this.f336810d);
        sb2.append(", args=");
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        sb2.append((Object) ("Args(args=" + this.f336811e + ')'));
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d h(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }
}
