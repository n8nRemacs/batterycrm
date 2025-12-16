package o8;

import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import com.avito.android.analytics_adjust.C28537e;
import com.avito.android.analytics_adjust.InterfaceC28535c;
import com.avito.android.analytics_adjust.utils.AdjustContentType;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: BuyerDevelopmentContact.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo8/a;", "Lcom/avito/android/analytics/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o8.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C44599a implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f419403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f419404c;

    public C44599a(@Y61.l Map map, @Y61.k String str, @Y61.l Double d12) {
        this.f419403b = map;
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName = b.f419405a;
        Qc.g gVarA = com.avito.android.analytics_adjust.t.a(adjustTokenWithFirebaseName);
        gVarA.j(map);
        gVarA.i(d12);
        InterfaceC28535c interfaceC28535cB = C28537e.b(adjustTokenWithFirebaseName);
        AdjustContentType[] adjustContentTypeArr = AdjustContentType.f91246b;
        interfaceC28535cB.c();
        interfaceC28535cB.f(str);
        interfaceC28535cB.a(d12);
        interfaceC28535cB.d(map);
        this.f419404c = C28461l.a(gVarA, interfaceC28535cB);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f419404c.getEvents();
    }
}
