package pC;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics_adjust.t;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: AddToFavoritesEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpC/a;", "Lcom/avito/android/analytics/j;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pC.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C46930a implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Map<String, String> f428260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f428261c;

    public C46930a() {
        throw null;
    }

    public C46930a(String str, Double d12, boolean z12, String str2, String str3, String str4, Boolean bool, int i12, String str5, String str6, String str7, Map map, int i13, C42822w c42822w) {
        int i14 = (i13 & 128) != 0 ? 0 : i12;
        this.f428260b = map;
        this.f428261c = C28461l.a(t.a(b.f428262a), new ParametrizedClickStreamEvent(3187, 21, P0.k(C35755b0.c(P0.j(new Q("is_auth", Boolean.valueOf(z12)), new Q("iid", str), new Q("from_page", str2), new Q("context", str3), new Q("x", C35800g5.b(new C35792f5(str3))), new Q("s", str4), new Q("is_multiitems_variation", bool), new Q("from_block", Integer.valueOf(i14)), new Q("multiitem_source", str5), new Q("multiitem_click_param_name", str6), new Q("from_space", str7))), map == null ? P0.c() : map), null, 8, null));
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f428261c.getEvents();
    }
}
