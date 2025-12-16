package Yo;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PremierPartnerBuyerBannerAnalyticsInteractorImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYo/q;", "LYo/p;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f19683a;

    @Inject
    public q(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f19683a = interfaceC28373a;
    }

    @Override // Yo.p
    public final void a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f19683a.c(new g(str, str2, str3, str4));
    }

    @Override // Yo.p
    public final void b(@Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
        this.f19683a.c(new C18311c(str, H.k("[\\s-]", str2, ""), str3, str4, str5));
    }

    @Override // Yo.p
    public final void c(@Y61.k String str, @Y61.l String str2) {
        this.f19683a.c(new C18310b(str, str2));
    }

    @Override // Yo.p
    public final void d(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f19683a.c(new d(str, str2, str3));
    }

    @Override // Yo.p
    public final void e(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f19683a.c(new e(str, str2, str3));
    }

    @Override // Yo.p
    public final void f(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f19683a.c(new f(str, str2, str3, str4));
    }
}
