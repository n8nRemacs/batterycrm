package vH0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemStatsLink;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import iI0.C41294D;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import lE.g;

/* compiled from: MyAdvertStatsPresenterDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LvH0/b;", "LfH0/a;", "LvH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vH0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49214b extends AbstractC40291a implements InterfaceC49213a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f440644d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final g f440645e;

    @Inject
    public C49214b(@k InterfaceC28373a interfaceC28373a, @k g gVar) {
        this.f440644d = interfaceC28373a;
        this.f440645e = gVar;
    }

    @Override // vH0.InterfaceC49213a
    public final void u(@k com.avito.android.user_advert.advert.items.stats.a aVar, @k DeepLink deepLink) {
        ClickStreamLink clickStreamLink = deepLink instanceof ClickStreamLink ? (ClickStreamLink) deepLink : null;
        boolean z12 = (deepLink instanceof ItemStatsLink) || ((clickStreamLink != null ? clickStreamLink.f133110e : null) instanceof ItemStatsLink);
        g gVar = this.f440645e;
        gVar.getClass();
        n<Object> nVar = g.f413657e[2];
        if (((Boolean) gVar.f413660d.a().invoke()).booleanValue() && z12) {
            this.f440644d.c(new C41294D(aVar.f310287h));
        }
        this.f395801b.accept(new InterfaceC40292b.a(deepLink));
    }
}
