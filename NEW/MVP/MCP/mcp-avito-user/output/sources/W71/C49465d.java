package w71;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TypeQualifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw71/d;", "Lw71/a;", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w71.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C49465d implements InterfaceC49462a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final kotlin.reflect.d<?> f441299a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f441300b;

    public C49465d(@k kotlin.reflect.d<?> dVar) {
        this.f441299a = dVar;
        this.f441300b = A71.b.a(dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C49465d.class == obj.getClass() && L.f(this.f441300b, ((C49465d) obj).f441300b);
    }

    @Override // w71.InterfaceC49462a
    @k
    /* renamed from: getValue, reason: from getter */
    public final String getF441300b() {
        return this.f441300b;
    }

    public final int hashCode() {
        return this.f441300b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("q:'"), this.f441300b, '\'');
    }
}
