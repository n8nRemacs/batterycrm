package com.avito.android.stories.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.stories.model.StoryBannerItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StoriesItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f285064l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ StoriesItem f285065m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, StoriesItem storiesItem) {
        super(1);
        this.f285064l = dVar;
        this.f285065m = storiesItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        d dVar = this.f285064l;
        b.a.a(dVar.f285050b.f285147b, deepLink, null, null, 6);
        StoryBannerItem storyBannerItem = this.f285065m.f285030d;
        dVar.f285051c.a(storyBannerItem != null ? storyBannerItem.f285154c : null);
        return G0.f406611a;
    }
}
