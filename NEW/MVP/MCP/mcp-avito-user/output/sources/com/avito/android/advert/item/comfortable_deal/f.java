package com.avito.android.advert.item.comfortable_deal;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExpertBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f74299l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExpertBlockItem f74300m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ExpertBlockItem expertBlockItem) {
        super(1);
        this.f74299l = gVar;
        this.f74300m = expertBlockItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        g gVar = this.f74299l;
        gVar.f74302c.c(new S4.b(gVar.f74303d, this.f74300m.f74287h.getIconType()));
        gVar.f74301b.C0(deepLink);
        return G0.f406611a;
    }
}
