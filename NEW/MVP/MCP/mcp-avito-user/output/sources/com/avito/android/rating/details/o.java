package com.avito.android.rating.details;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating.details.RatingDetailsFragment;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class o extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RatingDetailsFragment f247521l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(RatingDetailsFragment ratingDetailsFragment) {
        super(1);
        this.f247521l = ratingDetailsFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
        this.f247521l.E5().accept(new a.i(deepLink2, null, null, 6, null));
        return G0.f406611a;
    }
}
