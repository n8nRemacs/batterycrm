package com.avito.android.promo_snippet;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PromoSnippetList.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PromoSnippetList f231737l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PromoSnippetList promoSnippetList) {
        super(1);
        this.f231737l = promoSnippetList;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        this.f231737l.f231712g.invoke(deepLink);
        return G0.f406611a;
    }
}
