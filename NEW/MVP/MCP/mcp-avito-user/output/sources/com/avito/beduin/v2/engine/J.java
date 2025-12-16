package com.avito.beduin.v2.engine;

import com.avito.beduin.v2.engine.core.u;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ValueFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/J;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u.a f336536a;

    public J(@Y61.k u.a aVar) {
        this.f336536a = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && L.f(this.f336536a, ((J) obj).f336536a);
    }

    public final int hashCode() {
        return this.f336536a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ValueFactory(mutableValueFactory=" + this.f336536a + ')';
    }
}
