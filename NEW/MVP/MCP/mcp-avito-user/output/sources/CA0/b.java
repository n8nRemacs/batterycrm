package CA0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxAddressEntryAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCA0/b;", "LCA0/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f2044a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f2044a = interfaceC28373a;
    }

    @Override // CA0.a
    public final void a() {
        this.f2044a.c(new com.avito.android.analytics.provider.clickstream.b(16879, 0));
    }
}
