package oB;

import com.avito.android.extended_profile_widgets.adapter.job_company_carousel.JobCompanyCarouselItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/s;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class s implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final JobCompanyCarouselItem f419528b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419529c;

    public s(@Y61.k JobCompanyCarouselItem jobCompanyCarouselItem, int i12) {
        this.f419528b = jobCompanyCarouselItem;
        this.f419529c = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f419528b, sVar.f419528b) && this.f419529c == sVar.f419529c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f419529c) + (this.f419528b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCarouselScrollAction(item=");
        sb2.append(this.f419528b);
        sb2.append(", scrollPosition=");
        return androidx.appcompat.app.r.t(sb2, this.f419529c, ')');
    }
}
