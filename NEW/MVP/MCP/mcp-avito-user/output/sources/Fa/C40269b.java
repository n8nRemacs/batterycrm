package fA;

import Y61.k;
import Y61.l;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileCombinedState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/b;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fA.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C40269b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.extended_profile.mvi.entity.a f395742a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AbstractC40048c f395743b;

    public C40269b(@k com.avito.android.extended_profile.mvi.entity.a aVar, @l AbstractC40048c abstractC40048c) {
        this.f395742a = aVar;
        this.f395743b = abstractC40048c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40269b)) {
            return false;
        }
        C40269b c40269b = (C40269b) obj;
        return L.f(this.f395742a, c40269b.f395742a) && L.f(this.f395743b, c40269b.f395743b);
    }

    public final int hashCode() {
        int iHashCode = this.f395742a.hashCode() * 31;
        AbstractC40048c abstractC40048c = this.f395743b;
        return iHashCode + (abstractC40048c == null ? 0 : abstractC40048c.hashCode());
    }

    @k
    public final String toString() {
        return "ExtendedProfileCombinedState(nativeState=" + this.f395742a + ", beduinState=" + this.f395743b + ')';
    }

    public /* synthetic */ C40269b(com.avito.android.extended_profile.mvi.entity.a aVar, AbstractC40048c abstractC40048c, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? null : abstractC40048c);
    }
}
