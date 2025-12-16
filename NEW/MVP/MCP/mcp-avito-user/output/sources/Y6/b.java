package y6;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.realty_usp.q;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RealtyUspAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly6/b;", "Ly6/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements InterfaceC50067a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f442932a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f442932a = interfaceC28373a;
    }

    @Override // y6.InterfaceC50067a
    public final void a(@k String str, @k q qVar) {
        this.f442932a.c(new d(str, qVar.a().toString()));
    }

    @Override // y6.InterfaceC50067a
    public final void b(@k String str) {
        this.f442932a.c(new e(str));
    }
}
