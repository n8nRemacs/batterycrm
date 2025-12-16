package com.avito.android.user_advert.advert.items.realty.entry_point_client_room;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EntryPointToAccountOwnerPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f309922l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar) {
        super(1);
        this.f309922l = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f309922l.f309925c;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.c2(deepLink2);
        }
        return G0.f406611a;
    }
}
