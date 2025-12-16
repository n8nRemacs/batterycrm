package com.avito.android.vas_planning_checkout;

import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasPlanCheckoutView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class u extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f323026l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar) {
        super(1);
        this.f323026l = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        z zVar = this.f323026l;
        com.avito.android.deeplink_handler.handler.composite.a aVar = zVar.f323033c.f322808s0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink2, null, null, 6);
        if (deepLink2 instanceof AdvertDetailsLink) {
            zVar.f323033c.q5();
        }
        return G0.f406611a;
    }
}
