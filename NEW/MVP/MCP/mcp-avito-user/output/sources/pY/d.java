package pY;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import pY.InterfaceC47032c;
import wY.C49575a;

/* compiled from: MasterPlanAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpY/d;", "LpY/c;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements InterfaceC47032c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f428595a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C49575a f428596b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C49575a f428597c;

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a, @k C49575a c49575a, @k C49575a c49575a2) {
        this.f428595a = interfaceC28373a;
        this.f428596b = c49575a;
        this.f428597c = c49575a2;
    }

    @Override // pY.InterfaceC47032c
    public final void a(@k String str, @l String str2, @l String str3) {
        this.f428595a.c(new C47030a(this.f428596b.f441542e, str, str2, str3, this.f428597c.f441543f));
    }

    @Override // pY.InterfaceC47032c
    public final void b(@k String str) {
        String str2;
        if (str.equals("all_flats_item")) {
            str2 = "all_serp_click";
            str = null;
        } else {
            str2 = "rooms_number_serp_click";
        }
        InterfaceC47032c.a.a(this, str2, null, str, 2);
    }
}
