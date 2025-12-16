package com.avito.beduin.v2.engine.field;

import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.d;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ResolvedField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/s;", "Lcom/avito/beduin/v2/engine/field/d;", "T", "Lcom/avito/beduin/v2/engine/field/f;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class s<T extends d> implements f<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f336886b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final j f336887c;

    public s() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(d dVar, j jVar, int i12, C42822w c42822w) {
        jVar = (i12 & 2) != 0 ? e.f336775a : jVar;
        this.f336886b = dVar;
        this.f336887c = jVar;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final T a(@Y61.k z zVar, @Y61.k Map<q, ? extends K<? extends d>> map) {
        return this.f336886b;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final Set<q> e() {
        return B0.f406639b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f336886b, sVar.f336886b) && L.f(this.f336887c, sVar.f336887c);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final j getF336831b() {
        return this.f336887c;
    }

    public final int hashCode() {
        return this.f336887c.hashCode() + (this.f336886b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ResolvedField(id=" + this.f336887c + ", result=" + this.f336886b + ')';
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final f<d> h() {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final f<T> g(@Y61.k f<?> fVar) {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final f<T> l(@Y61.k j jVar) {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final f<T> b(@Y61.k String str, @Y61.k f<?> fVar) {
        return this;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final f<d> d(@Y61.k String str, @Y61.k f<?> fVar) {
        return this;
    }
}
