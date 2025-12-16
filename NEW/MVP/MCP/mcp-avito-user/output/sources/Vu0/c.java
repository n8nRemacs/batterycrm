package VU0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.field.entity.A;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV1InMemoryRepositoryBundle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVU0/c;", "", "beduin-v1-in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f17177a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A f17178b;

    public c(@k String str, @k A a12) {
        this.f17177a = str;
        this.f17178b = a12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f17177a, cVar.f17177a) && L.f(this.f17178b, cVar.f17178b);
    }

    public final int hashCode() {
        return this.f17178b.hashCode() + (this.f17177a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "BeduinV1InMemoryRepositoryProperties(key=" + this.f17177a + ", value=" + this.f17178b + ')';
    }
}
