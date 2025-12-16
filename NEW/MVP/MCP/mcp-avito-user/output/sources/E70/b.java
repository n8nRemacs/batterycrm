package e70;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.personal_filters.ButtonType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: PersonalFiltersAnalytics.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le70/b;", "Le70/a;", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements InterfaceC39961a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f394964a;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f394964a = interfaceC28373a;
    }

    @Override // e70.InterfaceC39961a
    public final void a(@Y61.k ButtonType buttonType, boolean z12) {
        this.f394964a.c(new ParametrizedClickStreamEvent(11108, 0, P0.j(new Q("status_id", Integer.valueOf(buttonType.f215701b)), new Q("suggest_ad_id", Integer.valueOf(!z12 ? 0 : 1))), null, 8, null));
    }
}
