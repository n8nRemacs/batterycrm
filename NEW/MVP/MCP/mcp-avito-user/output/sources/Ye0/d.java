package YE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.travel_onboarding.models.TravelOnboardingButtonViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingBlocksInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYE0/d;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f19394a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f19395b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f19396c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TravelOnboardingButtonViewType f19397d;

    public d(@k String str, @l String str2, @l String str3, @k TravelOnboardingButtonViewType travelOnboardingButtonViewType) {
        this.f19394a = str;
        this.f19395b = str2;
        this.f19396c = str3;
        this.f19397d = travelOnboardingButtonViewType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f19394a, dVar.f19394a) && L.f(this.f19395b, dVar.f19395b) && L.f(this.f19396c, dVar.f19396c) && this.f19397d == dVar.f19397d;
    }

    public final int hashCode() {
        int iHashCode = this.f19394a.hashCode() * 31;
        String str = this.f19395b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19396c;
        return this.f19397d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "TravelOnboardingCloseButton(title=" + this.f19394a + ", subtitle=" + this.f19395b + ", analyticsActionType=" + this.f19396c + ", viewType=" + this.f19397d + ')';
    }
}
