package G5;

import H5.d;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ParametrizedEvent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertHotelAnalyticsTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG5/b;", "LG5/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f6346a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f6347b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f6348c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public AdvertDetails f6349d;

    @Inject
    public b(@k E e12, @k InterfaceC28373a interfaceC28373a, @k @InterfaceC30174s String str) {
        this.f6346a = str;
        this.f6347b = e12;
        this.f6348c = interfaceC28373a;
    }

    public final void a(int i12) {
        AdjustParameters adjustParameters;
        String strA = this.f6347b.a();
        if (strA == null) {
            strA = "";
        }
        String str = strA;
        AdvertDetails advertDetails = this.f6349d;
        String locationId = advertDetails != null ? advertDetails.getLocationId() : null;
        AdvertDetails advertDetails2 = this.f6349d;
        String categoryId = advertDetails2 != null ? advertDetails2.getCategoryId() : null;
        AdvertDetails advertDetails3 = this.f6349d;
        String microCategoryId = (advertDetails3 == null || (adjustParameters = advertDetails3.getAdjustParameters()) == null) ? null : adjustParameters.getMicroCategoryId();
        AdvertDetails advertDetails4 = this.f6349d;
        this.f6348c.c(new d(Integer.valueOf(i12), this.f6346a, str, locationId, categoryId, microCategoryId, advertDetails4 != null ? advertDetails4.getXHash() : null));
    }

    @Override // G5.a
    public final void p(@k AdvertDetails advertDetails) {
        this.f6349d = advertDetails;
    }

    @Override // G5.a
    public final void q(@k ParametrizedEvent parametrizedEvent) {
        this.f6348c.c(a0.a(parametrizedEvent));
    }

    @Override // G5.a
    public final void r() {
        a(1);
    }

    @Override // G5.a
    public final void s(@k String str) {
        this.f6348c.c(new H5.a(this.f6346a, str));
    }

    @Override // G5.a
    public final void t(@k String str) {
        this.f6348c.c(new H5.c(this.f6346a, str));
    }

    @Override // G5.a
    public final void u(@k String str) {
        this.f6348c.c(new H5.b(this.f6346a, str));
    }

    @Override // G5.a
    public final void v() {
        a(2);
    }
}
