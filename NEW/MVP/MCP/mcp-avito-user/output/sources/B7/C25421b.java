package b7;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import c7.C26951a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ParametrizedEvent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertShortTermRentAnalyticsTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb7/b;", "Lb7/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b7.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C25421b implements InterfaceC25420a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f56934a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f56935b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f56936c;

    @Inject
    public C25421b(@k InterfaceC28373a interfaceC28373a, @k @InterfaceC30174s String str) {
        this.f56934a = str;
        this.f56935b = interfaceC28373a;
    }

    @Override // b7.InterfaceC25420a
    public final void a(@k AdvertDetails advertDetails) {
        AdjustParameters adjustParameters = advertDetails.getAdjustParameters();
        this.f56936c = adjustParameters != null ? adjustParameters.getMicroCategoryId() : null;
    }

    @Override // b7.InterfaceC25420a
    public final void b(boolean z12) {
        this.f56935b.c(new C26951a(this.f56934a, this.f56936c, z12));
    }

    @Override // b7.InterfaceC25420a
    public final void q(@k ParametrizedEvent parametrizedEvent) {
        this.f56935b.c(a0.a(parametrizedEvent));
    }
}
