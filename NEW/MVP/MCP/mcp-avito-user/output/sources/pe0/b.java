package PE0;

import PE0.c;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmptyStateBannerBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPE0/b;", "", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f12883a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c.a f12884b;

    public b(@k String str, @k c.a aVar) {
        this.f12883a = str;
        this.f12884b = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f12883a, bVar.f12883a) && this.f12884b.equals(bVar.f12884b);
    }

    public final int hashCode() {
        return this.f12884b.f12885a.hashCode() + (this.f12883a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "EmptyStateBannerButton(title=" + this.f12883a + ", action=" + this.f12884b + ')';
    }
}
