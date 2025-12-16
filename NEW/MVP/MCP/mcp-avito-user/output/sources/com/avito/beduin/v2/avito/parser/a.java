package com.avito.beduin.v2.avito.parser;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.n;
import com.avito.beduin.v2.engine.t;
import com.avito.beduin.v2.engine.u;
import kotlin.Metadata;

/* compiled from: AvitoEngineStateWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/parser/a;", "Lcom/avito/beduin/v2/engine/n;", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements n {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f335461a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final t f335462b;

    public a(@k String str, @k t tVar) {
        this.f335461a = str;
        this.f335462b = tVar;
    }

    @Override // com.avito.beduin.v2.engine.n
    @k
    public final n a(@k u uVar) {
        return this.f335462b.a(uVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f335461a.equals(aVar.f335461a) && this.f335462b.equals(aVar.f335462b);
    }

    public final int hashCode() {
        return this.f335462b.hashCode() + (this.f335461a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "AvitoEngineStateWrapper(scenarioId=" + this.f335461a + ", internalEngineState=" + this.f335462b + ')';
    }
}
