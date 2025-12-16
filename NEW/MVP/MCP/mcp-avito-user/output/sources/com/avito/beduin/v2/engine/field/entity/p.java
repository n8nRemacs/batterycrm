package com.avito.beduin.v2.engine.field.entity;

import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.field.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MutableField.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/p;", "Lcom/avito/beduin/v2/engine/field/d;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class p implements com.avito.beduin.v2.engine.field.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final K<com.avito.beduin.v2.engine.field.d> f336818b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, G0> f336819c;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@Y61.k K<? extends com.avito.beduin.v2.engine.field.d> k12, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, G0> lVar) {
        this.f336818b = k12;
        this.f336819c = lVar;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        boolean z12 = zVar.a().f336477d;
        K<com.avito.beduin.v2.engine.field.d> k12 = this.f336818b;
        return z12 ? new A(new Q("value", k12.k(zVar))) : k12.k(zVar).a(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        return L.f(h(zVar), dVar.h(zVar));
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return zVar.a().f336477d ? this : this.f336818b.k(zVar).c(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        if (zVar.a().f336477d) {
            throw new UnsupportedOperationException("The operation is unavailable for MutableData. Use nested 'value' field for the operation. Cause: enableStructuredMutable feature");
        }
        return this.f336818b.k(zVar).e(zVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f336818b, pVar.f336818b) && L.f(this.f336819c, pVar.f336819c);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.f(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d h(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return zVar.a().f336477d ? this : this.f336818b.k(zVar).h(zVar);
    }

    public final int hashCode() {
        return this.f336819c.hashCode() + (this.f336818b.hashCode() * 31);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        if (zVar.a().f336477d) {
            throw new UnsupportedOperationException("The operation is unavailable for MutableData. Use nested 'value' field for the operation. Cause: enableStructuredMutable feature");
        }
        return this.f336818b.k(zVar).l(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return new q(zVar.A(), this.f336818b.k(zVar).m(zVar));
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        if (zVar.a().f336477d) {
            throw new UnsupportedOperationException("The operation is unavailable for MutableData. Use nested 'value' field for the operation. Cause: enableStructuredMutable feature");
        }
        return this.f336818b.k(zVar).q(zVar);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.l
    public final c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        if (zVar.a().f336477d) {
            throw new UnsupportedOperationException("The operation is unavailable for MutableData. Use nested 'value' field for the operation. Cause: enableStructuredMutable feature");
        }
        return this.f336818b.k(zVar).r(zVar);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableData(");
        sb2.append("value=" + this.f336818b);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }
}
