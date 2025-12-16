package io.ktor.client.statement;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HttpResponsePipeline.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/statement/e;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final U31.b f399785a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f399786b;

    public e(@Y61.k U31.b bVar, @Y61.k Object obj) {
        this.f399785a = bVar;
        this.f399786b = obj;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f399785a, eVar.f399785a) && L.f(this.f399786b, eVar.f399786b);
    }

    public final int hashCode() {
        return this.f399786b.hashCode() + (this.f399785a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpResponseContainer(expectedType=");
        sb2.append(this.f399785a);
        sb2.append(", response=");
        return H.n(sb2, this.f399786b, ')');
    }
}
