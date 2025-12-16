package com.avito.android.serp.adapter.gig_promo_snippet;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigPromoSnippetPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f270093l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f270094m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ GigPromoSnippetItem f270095n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, int i12, GigPromoSnippetItem gigPromoSnippetItem) {
        super(1);
        this.f270093l = eVar;
        this.f270094m = i12;
        this.f270095n = gigPromoSnippetItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        e eVar = this.f270093l;
        b.a.a(eVar.f270091b, deepLink, null, null, 6);
        Integer numValueOf = Integer.valueOf(this.f270094m);
        GigPromoSnippetItem gigPromoSnippetItem = this.f270095n;
        d.a.a(eVar.f270092c, numValueOf, "gig_motivation_widget", gigPromoSnippetItem.f270079c.f231715b, null, null, null, null, gigPromoSnippetItem.f270080d, 120);
        return G0.f406611a;
    }
}
