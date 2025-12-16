package com.avito.android.profile.user_profile.cards.recommendations;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.user_profile.items.RecommendationsItem;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RecommendationsView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecommendationsItem.SnippetItem f225293l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f225294m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(RecommendationsItem.SnippetItem snippetItem, k kVar) {
        super(0);
        this.f225293l = snippetItem;
        this.f225294m = kVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Iterator<T> it = this.f225293l.getActions().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DeepLink deepLink = ((RecommendationsItem.SnippetItem.Deeplink) it.next()).getDeepLink();
            if (deepLink != null) {
                l<? super DeepLink, G0> lVar = this.f225294m.f225299e;
                if (lVar != null) {
                    lVar.invoke(deepLink);
                }
            }
        }
        return G0.f406611a;
    }
}
