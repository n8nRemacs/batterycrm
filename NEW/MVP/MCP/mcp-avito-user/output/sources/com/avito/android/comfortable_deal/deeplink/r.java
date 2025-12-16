package com.avito.android.comfortable_deal.deeplink;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: ComfortableDealRouteDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/r;", "Lev/a;", "Lcom/avito/android/comfortable_deal/deeplink/ComfortableDealRouteDeeplink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r extends AbstractC40161a<ComfortableDealRouteDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f121980f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f121981g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.a f121982h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f121983i;

    @Inject
    public r(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.g gVar, @Y61.k com.avito.android.comfortable_deal.repository.a aVar2, @Y61.k R0 r02) {
        this.f121980f = aVar;
        this.f121981g = gVar;
        this.f121982h = aVar2;
        this.f121983i = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f121983i, null, null, new q(this, (ComfortableDealRouteDeeplink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f121983i, null);
    }
}
