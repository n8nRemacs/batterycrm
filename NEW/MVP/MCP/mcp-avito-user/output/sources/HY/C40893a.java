package hY;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FindMeButtonState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhY/a;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hY.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C40893a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Y41.a<G0> f397219a;

    /* JADX WARN: Multi-variable type inference failed */
    public C40893a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40893a) && L.f(this.f397219a, ((C40893a) obj).f397219a);
    }

    public final int hashCode() {
        Y41.a<G0> aVar = this.f397219a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    @k
    public final String toString() {
        return r.v(new StringBuilder("FindMeButtonState(onClick="), this.f397219a, ')');
    }

    public C40893a(@l Y41.a<G0> aVar) {
        this.f397219a = aVar;
    }

    public /* synthetic */ C40893a(Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar);
    }
}
