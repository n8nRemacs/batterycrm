package com.avito.android.stories.view.stories_carousel;

import Y41.l;
import Y61.k;
import com.avito.android.stories.model.StoryCarouselItem;
import com.avito.android.stories.view.o;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StoryCarouselItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/view/stories_carousel/e;", "LTV0/d;", "Lcom/avito/android/stories/view/o;", "Lcom/avito/android/stories/model/StoryCarouselItem;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.d<o, StoryCarouselItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f285326b;

    public e(@k l lVar) {
        this.f285326b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        o oVar = (o) eVar;
        StoryCarouselItem storyCarouselItem = (StoryCarouselItem) aVar;
        oVar.d(new c(oVar, (y) oVar.A().t0(new d(this, i12))));
        oVar.q0(1.0f);
        oVar.Ji(storyCarouselItem.f285168g, storyCarouselItem.f285167f);
        oVar.setTitle(storyCarouselItem.f285169h);
        oVar.setViewed(storyCarouselItem.f285170i);
        oVar.n4(storyCarouselItem.f285171j);
    }
}
