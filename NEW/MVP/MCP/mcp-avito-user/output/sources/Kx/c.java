package KX;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import mU.C44012a;

/* compiled from: MallAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKX/c;", "LKX/b;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f9505a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C44012a f9506b;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a, @k C44012a c44012a) {
        this.f9505a = interfaceC28373a;
        this.f9506b = c44012a;
    }

    @Override // KX.b
    public final void a(@k SuggestAnalyticsEvent suggestAnalyticsEvent) {
        a.f9503c.getClass();
        this.f9505a.c(new a(suggestAnalyticsEvent.getId(), suggestAnalyticsEvent.getVersion(), suggestAnalyticsEvent.getParameters(), null));
    }

    @Override // KX.b
    public final void b() {
        C44012a.a(this.f9506b, null, null, null, 7);
    }

    @Override // KX.b
    public final void c(@k HP0.b bVar) {
        this.f9505a.c(bVar);
    }
}
