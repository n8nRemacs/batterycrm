package Yo;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PremierPartnerOnPublishAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYo/u;", "LYo/t;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f19685a;

    @Inject
    public u(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f19685a = interfaceC28373a;
    }

    @Override // Yo.t
    public final void a() {
        this.f19685a.c(new o());
    }

    @Override // Yo.t
    public final void b() {
        this.f19685a.c(new i());
    }

    @Override // Yo.t
    public final void c(@Y61.k String str) {
        this.f19685a.c(new C18308B(str));
    }

    @Override // Yo.t
    public final void d() {
        this.f19685a.c(new m());
    }
}
