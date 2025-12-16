package nV0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.field.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InMemoryRepositoryBundle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnV0/c;", "", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nV0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C44342c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f415166a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final d f415167b;

    public C44342c(@l d dVar, @k String str) {
        this.f415166a = str;
        this.f415167b = dVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44342c)) {
            return false;
        }
        C44342c c44342c = (C44342c) obj;
        return L.f(this.f415166a, c44342c.f415166a) && L.f(this.f415167b, c44342c.f415167b);
    }

    public final int hashCode() {
        int iHashCode = this.f415166a.hashCode() * 31;
        d dVar = this.f415167b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @k
    public final String toString() {
        return "InMemoryRepositoryProperties(key=" + this.f415166a + ", value=" + this.f415167b + ')';
    }
}
