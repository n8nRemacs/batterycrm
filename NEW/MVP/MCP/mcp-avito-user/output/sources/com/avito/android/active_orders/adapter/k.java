package com.avito.android.active_orders.adapter;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HomeActiveOrdersItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f68276l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f68277m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Analytics f68278n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, int i12, Analytics analytics) {
        super(1);
        this.f68276l = mVar;
        this.f68277m = i12;
        this.f68278n = analytics;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        d dVar = this.f68276l.f68284d;
        if (dVar != null) {
            dVar.a(deepLink2, this.f68277m, this.f68278n);
        }
        return G0.f406611a;
    }
}
