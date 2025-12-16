package com.avito.android.stories.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.stories.model.StoryBannerItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StoriesItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StoryBannerItem f285057l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f285058m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StoryBannerItem storyBannerItem, d dVar) {
        super(0);
        this.f285057l = storyBannerItem;
        this.f285058m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        StoryBannerItem storyBannerItem = this.f285057l;
        DeepLink deepLink = storyBannerItem.f285159h;
        d dVar = this.f285058m;
        if (deepLink != null) {
            b.a.a(dVar.f285050b.f285147b, deepLink, null, null, 6);
        }
        dVar.f285051c.a(storyBannerItem.f285154c);
        return G0.f406611a;
    }
}
