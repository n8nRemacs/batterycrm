package com.avito.beduin.v2.engine.field;

import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.MergePolicy;
import com.avito.beduin.v2.engine.field.entity.B;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MergePolicy.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/p;", "Lcom/avito/beduin/v2/engine/field/k;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class p implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B f336875b;

    public p(@Y61.k B b12) {
        this.f336875b = b12;
    }

    @Override // com.avito.beduin.v2.engine.field.k
    @Y61.k
    public final MergePolicy a(@Y61.k z zVar, @Y61.k Map<q, ? extends K<? extends d>> map) {
        MergePolicy.Builder builder = new MergePolicy.Builder(zVar, this.f336875b.a(zVar, map));
        return builder.f336740a.b(builder);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && L.f(this.f336875b, ((p) obj).f336875b);
    }

    @Override // com.avito.beduin.v2.engine.field.k
    @Y61.k
    public final MergePolicy get() {
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        return this.f336875b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "RawMergePolicy(params=" + this.f336875b + ')';
    }
}
