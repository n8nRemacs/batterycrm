package com.avito.android.extended_profile_widgets.adapter.job_company_carousel.snippet_item;

import Y41.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.p;

/* compiled from: JobCompanyCarouselSnippetItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f154516l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f154517m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, AdvertItem advertItem) {
        super(1);
        this.f154516l = fVar;
        this.f154517m = advertItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        f fVar = this.f154516l;
        if (deepLink2 != null) {
            fVar.f154522b.invoke(new p(deepLink2, this.f154517m.f268420a0));
        }
        return G0.f406611a;
    }
}
