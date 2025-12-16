package YE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.travel_onboarding.models.TravelOnboardingButtonViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingBlocksInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYE0/j;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f19410a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f19411b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f19412c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f19413d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TravelOnboardingButtonViewType f19414e;

    public j(@k String str, @l String str2, @k DeepLink deepLink, @l String str3, @k TravelOnboardingButtonViewType travelOnboardingButtonViewType) {
        this.f19410a = str;
        this.f19411b = str2;
        this.f19412c = deepLink;
        this.f19413d = str3;
        this.f19414e = travelOnboardingButtonViewType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f19410a, jVar.f19410a) && L.f(this.f19411b, jVar.f19411b) && L.f(this.f19412c, jVar.f19412c) && L.f(this.f19413d, jVar.f19413d) && this.f19414e == jVar.f19414e;
    }

    public final int hashCode() {
        int iHashCode = this.f19410a.hashCode() * 31;
        String str = this.f19411b;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f19412c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f19413d;
        return this.f19414e.hashCode() + ((iE2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "TravelOnboardingRedirectButton(title=" + this.f19410a + ", subtitle=" + this.f19411b + ", deeplink=" + this.f19412c + ", analyticsActionType=" + this.f19413d + ", viewType=" + this.f19414e + ')';
    }
}
