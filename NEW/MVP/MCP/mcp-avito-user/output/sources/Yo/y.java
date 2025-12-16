package Yo;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PremierPartnerSellerBannerAnalyticsInteractorImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYo/y;", "LYo/w;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f19690a;

    @Inject
    public y(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f19690a = interfaceC28373a;
    }

    @Override // Yo.w
    public final void a(@Y61.k String str) {
        this.f19690a.c(new x(8879, 4, str, null));
    }

    @Override // Yo.w
    public final void b(@Y61.k String str) {
        this.f19690a.c(new x(8880, 5, str, "target_click"));
    }
}
