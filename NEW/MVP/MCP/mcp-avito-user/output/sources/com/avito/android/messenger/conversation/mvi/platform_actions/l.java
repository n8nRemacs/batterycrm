package com.avito.android.messenger.conversation.mvi.platform_actions;

import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.messenger.conversation.mvi.platform_actions.g;
import com.avito.android.remote.model.messenger.context_actions.RecommendationItem;
import com.avito.android.remote.model.messenger.context_actions.RecommendationsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PlatformActionsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/RecommendationsResponse;", "<name for destructuring parameter 0>", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "apply", "(Lcom/avito/android/remote/model/messenger/context_actions/RecommendationsResponse;)Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f194027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.InterfaceC5732f.b.c.C5738c f194028c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g.e f194029d;

    public l(g gVar, f.InterfaceC5732f.b.c.C5738c c5738c, g.e eVar) {
        this.f194027b = gVar;
        this.f194028c = c5738c;
        this.f194029d = eVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List<RecommendationItem> listComponent1 = ((RecommendationsResponse) obj).component1();
        this.f194029d.getClass();
        List<RecommendationItem> list = listComponent1;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (RecommendationItem recommendationItem : list) {
            arrayList.add(new com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.f(recommendationItem.getId(), recommendationItem.getTitle(), recommendationItem.getPrice(), recommendationItem.getImage(), recommendationItem.getLocation(), recommendationItem.getWithSellerFastReplyBadge()));
        }
        UV0.c cVar = new UV0.c(arrayList);
        this.f194027b.getClass();
        f.InterfaceC5732f.b.c.C5738c c5738c = this.f194028c;
        return new f.InterfaceC5732f.b.c.a(c5738c.f193926a, c5738c.f193927b, c5738c.f193928c, c5738c.f193929d, cVar);
    }
}
