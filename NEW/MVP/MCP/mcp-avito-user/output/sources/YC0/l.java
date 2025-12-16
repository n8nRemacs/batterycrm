package yc0;

import androidx.compose.runtime.internal.P;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsCombinedState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/l;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.mvi.entity.a f443264a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AbstractC40048c f443265b;

    public l(@Y61.k com.avito.android.profile_settings_extended.mvi.entity.a aVar, @Y61.l AbstractC40048c abstractC40048c) {
        this.f443264a = aVar;
        this.f443265b = abstractC40048c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f443264a, lVar.f443264a) && L.f(this.f443265b, lVar.f443265b);
    }

    public final int hashCode() {
        int iHashCode = this.f443264a.hashCode() * 31;
        AbstractC40048c abstractC40048c = this.f443265b;
        return iHashCode + (abstractC40048c == null ? 0 : abstractC40048c.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ExtendedProfileSettingsCombinedState(nativeState=" + this.f443264a + ", beduinState=" + this.f443265b + ')';
    }

    public /* synthetic */ l(com.avito.android.profile_settings_extended.mvi.entity.a aVar, AbstractC40048c abstractC40048c, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? null : abstractC40048c);
    }
}
