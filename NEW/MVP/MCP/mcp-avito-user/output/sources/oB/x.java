package oB;

import com.avito.android.extended_profile_widgets.adapter.premium_banner.PremiumBannerListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/x;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class x implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PremiumBannerListItem f419536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419537c;

    public x(@Y61.k PremiumBannerListItem premiumBannerListItem, int i12) {
        this.f419536b = premiumBannerListItem;
        this.f419537c = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return L.f(this.f419536b, xVar.f419536b) && this.f419537c == xVar.f419537c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f419537c) + (this.f419536b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PremiumBannerScrollItemAction(item=");
        sb2.append(this.f419536b);
        sb2.append(", lastVisiblePosition=");
        return androidx.appcompat.app.r.t(sb2, this.f419537c, ')');
    }
}
