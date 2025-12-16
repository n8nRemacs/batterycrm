package ON0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ClientsAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LON0/b;", "LON0/a;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f12229a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f12229a = interfaceC28373a;
    }

    @Override // ON0.a
    public final void a() {
        this.f12229a.c(new ParametrizedClickStreamEvent(16724, 1, Collections.singletonMap("rre_trx_vdr_new_client_creation_from_list", "add_new_client"), null, 8, null));
    }

    @Override // ON0.a
    public final void b() {
        this.f12229a.c(new ParametrizedClickStreamEvent(16724, 1, Collections.singletonMap("rre_trx_vdr_new_client_creation_from_list", "client_list"), null, 8, null));
    }

    @Override // ON0.a
    public final void c() {
        new ParametrizedClickStreamEvent(13765, 2, Collections.singletonMap("rre_trx_vdr_new_client_creation_from_list", "client_list"), null, 8, null);
    }

    @Override // ON0.a
    public final void d() {
        this.f12229a.c(new ParametrizedClickStreamEvent(16725, 1, Collections.singletonMap("from_page", "choose_client"), null, 8, null));
    }

    @Override // ON0.a
    public final void e() {
        this.f12229a.c(new ParametrizedClickStreamEvent(13765, 2, Collections.singletonMap("rre_trx_vdr_new_client_creation_from_list", "empty_client_list_button"), null, 8, null));
    }

    @Override // ON0.a
    public final void f() {
        this.f12229a.c(new ParametrizedClickStreamEvent(16724, 1, Collections.singletonMap("rre_trx_vdr_new_client_creation_from_list", "duplication_list"), null, 8, null));
    }
}
