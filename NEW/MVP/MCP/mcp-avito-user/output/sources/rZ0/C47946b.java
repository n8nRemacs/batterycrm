package rz0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import vz0.C49405b;

/* compiled from: StrSellerOrdersAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrz0/b;", "Lrz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47946b implements InterfaceC47945a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f437273a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f437274b;

    @Inject
    public C47946b(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.analytics.provider.a aVar) {
        this.f437273a = interfaceC28373a;
        this.f437274b = aVar.a();
    }

    @Override // rz0.InterfaceC47945a
    public final void a() {
        this.f437273a.c(new C49405b(this.f437274b));
    }
}
