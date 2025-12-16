package com.avito.beduin.v2.engine.component;

import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Reader.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/w;", "Lcom/avito/beduin/v2/engine/component/s;", "Lcom/avito/beduin/v2/engine/component/G;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w extends s implements G {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.m f336584b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<String> f336585c;

    public w(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
        super(zVar);
        this.f336584b = mVar;
        this.f336585c = mVar.f336870a.keySet();
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.l
    public final Integer a(@Y61.k String str) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.v vVarQ;
        try {
            com.avito.beduin.v2.engine.field.d dVarC = this.f336584b.c(str);
            if (dVarC == null || (vVarQ = dVarC.q(this.f336576a)) == null) {
                return null;
            }
            return Integer.valueOf(vVarQ.j());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.k
    public final Set<String> b() {
        return this.f336585c;
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.l
    public final Boolean c(@Y61.k String str) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.v vVarQ;
        try {
            com.avito.beduin.v2.engine.field.d dVarC = this.f336584b.c(str);
            if (dVarC == null || (vVarQ = dVarC.q(this.f336576a)) == null) {
                return null;
            }
            return Boolean.valueOf(vVarQ.getF336837b());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.G
    public final boolean contains(@Y61.k String str) {
        return this.f336584b.f336870a.containsKey(str);
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.l
    public final Object d(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2) throws BeduinPropertyException {
        try {
            com.avito.beduin.v2.engine.field.d dVarC = this.f336584b.c(str);
            com.avito.beduin.v2.engine.core.z zVar = this.f336576a;
            Object objInvoke = null;
            com.avito.beduin.v2.engine.field.entity.l lVarE = dVarC != null ? dVarC.e(zVar) : null;
            InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), str2, lVarE);
            zVar.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336616h()) {
                com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bE.g();
                if (lVarE != null) {
                    try {
                        objInvoke = lVar.invoke(new t(zVarG, lVarE));
                    } finally {
                        interfaceC36252bE.l(null);
                    }
                }
            }
            return interfaceC36252bE.getF336702c();
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.l
    public final Long e() throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.v vVarQ;
        try {
            com.avito.beduin.v2.engine.field.d dVarC = this.f336584b.c("itemId");
            if (dVarC == null || (vVarQ = dVarC.q(this.f336576a)) == null) {
                return null;
            }
            return Long.valueOf(vVarQ.getF336840b());
        } catch (Exception e12) {
            throw new BeduinPropertyException("itemId", e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.l
    public final Object f(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2) throws BeduinPropertyException {
        try {
            return r(this.f336584b.c(str), str2, lVar);
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.k
    public final <T> List<T> g(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.p<? super InterfaceC36241a, ? super Integer, ? extends T> pVar) throws BeduinPropertyException {
        try {
            return p(this.f336584b.c(str), str2, pVar);
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.l
    public final String getString(@Y61.k String str) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.v vVarQ;
        try {
            com.avito.beduin.v2.engine.field.d dVarC = this.f336584b.c(str);
            if (dVarC == null || (vVarQ = dVarC.q(this.f336576a)) == null) {
                return null;
            }
            return vVarQ.getF336843b();
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.l
    public final <T> T h(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.q<? super G, ? super InterfaceC36249i, ? super String, ? extends T> qVar) throws BeduinPropertyException {
        try {
            return (T) o(this.f336584b.c(str), str2, qVar);
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.G
    public final Object k(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2) throws BeduinPropertyException {
        try {
            return q(this.f336584b.c(str), str2, lVar);
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.l
    public final Double l(@Y61.k String str) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.v vVarQ;
        try {
            com.avito.beduin.v2.engine.field.d dVarC = this.f336584b.c(str);
            if (dVarC == null || (vVarQ = dVarC.q(this.f336576a)) == null) {
                return null;
            }
            return Double.valueOf(vVarQ.getF336838b());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.G
    @Y61.l
    public final Float n(@Y61.k String str) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.v vVarQ;
        try {
            com.avito.beduin.v2.engine.field.d dVarC = this.f336584b.c(str);
            if (dVarC == null || (vVarQ = dVarC.q(this.f336576a)) == null) {
                return null;
            }
            return Float.valueOf(vVarQ.getF336839b());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    public w(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.entity.A a12) {
        this(zVar, a12.f336778b);
    }
}
