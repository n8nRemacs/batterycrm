package com.avito.android.stories.view.story_banner;

import TV0.e;
import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.stories.model.StoryBannerItem;
import com.avito.android.stories.view.n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StoryBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/view/story_banner/c;", "LTV0/d;", "Lcom/avito/android/stories/view/n;", "Lcom/avito/android/stories/model/StoryBannerItem;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements TV0.d<n, StoryBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f285340b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k l<? super DeepLink, G0> lVar) {
        this.f285340b = lVar;
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        StoryBannerItem storyBannerItem = (StoryBannerItem) aVar;
        nVar.X2(storyBannerItem.f285157f, storyBannerItem.f285155d);
        nVar.BE(storyBannerItem.f285158g, storyBannerItem.f285156e);
        nVar.v(storyBannerItem.f285161j);
        nVar.v1(storyBannerItem.f285160i);
        nVar.a(new b(storyBannerItem, this));
    }
}
