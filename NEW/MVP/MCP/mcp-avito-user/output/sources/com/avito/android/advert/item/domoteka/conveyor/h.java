package com.avito.android.advert.item.domoteka.conveyor;

import com.avito.android.advert.item.W0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.ApartmentNumberRequestLink;
import com.avito.android.remote.ApartmentNumberRequestResponse;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDomotekaTeaserPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/ApartmentNumberRequestResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/ApartmentNumberRequestResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f75257b;

    public h(j jVar) {
        this.f75257b = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeepLink link;
        W0 w02;
        ApartmentNumberRequestLink result = ((ApartmentNumberRequestResponse) obj).getResult();
        if (result == null || (link = result.getLink()) == null || (w02 = this.f75257b.f75263f) == null) {
            return;
        }
        w02.k(link);
    }
}
