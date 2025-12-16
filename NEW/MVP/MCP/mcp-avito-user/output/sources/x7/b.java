package X7;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AdvertCollectionToastAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX7/b;", "LX7/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f18640a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public List<String> f18641b = C42784z0.f406748b;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f18640a = interfaceC28373a;
    }

    @Override // X7.a
    public final void a(@k List<String> list) {
        this.f18641b = list;
        this.f18640a.c(new Y7.a(list));
    }

    @Override // X7.a
    public final void b() {
        this.f18640a.c(new Y7.b(this.f18641b));
    }
}
