package com.avito.android.rating.publish.deep_linking;

import com.avito.android.deep_linking.RatingPublishLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.publish.RatingPublishResult;
import kotlin.Metadata;

/* compiled from: RatingPublishLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/publish/RatingPublishResult;", "publishResult", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/publish/RatingPublishResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f247625b;

    public b(d dVar) {
        this.f247625b = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        RatingPublishResult ratingPublishResult = (RatingPublishResult) obj;
        RatingPublishResult.Action action = ratingPublishResult instanceof RatingPublishResult.Action ? (RatingPublishResult.Action) ratingPublishResult : null;
        DeepLink action2 = action != null ? action.getAction() : null;
        d dVar = this.f247625b;
        if (action2 != null) {
            dVar.i(RatingPublishLink.b.C3981b.f132861b, dVar.f247630i, action2);
        } else {
            dVar.j(RatingPublishLink.b.a.f132860b);
        }
    }
}
