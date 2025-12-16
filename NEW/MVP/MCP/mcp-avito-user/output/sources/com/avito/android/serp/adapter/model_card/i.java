package com.avito.android.serp.adapter.model_card;

import Y41.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.widget_analytics.Analytics;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ModelCardWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "title", "", "optionNumber", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;ILcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements q<String, Integer, DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f270415l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f270416m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ModelCardWidget f270417n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i12, ModelCardWidget modelCardWidget, j jVar) {
        super(3);
        this.f270415l = jVar;
        this.f270416m = i12;
        this.f270417n = modelCardWidget;
    }

    @Override // Y41.q
    public final G0 invoke(String str, Integer num, DeepLink deepLink) {
        String str2 = str;
        int iIntValue = num.intValue();
        DeepLink deepLink2 = deepLink;
        if (deepLink2 != null) {
            j jVar = this.f270415l;
            b.a.a(jVar.f270431b, deepLink2, null, null, 6);
            Analytics analytics = this.f270417n.f270399g;
            Integer numValueOf = Integer.valueOf(iIntValue);
            d.a.a(jVar.f270432c, Integer.valueOf(this.f270416m), "catalogEntryPointWidget", str2, null, numValueOf, null, null, analytics, 104);
        }
        return G0.f406611a;
    }
}
