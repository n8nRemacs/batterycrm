package com.avito.android.advert.item.modelSpecs;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.modelSpecs.a;
import com.avito.android.remote.model.model_card.LinkInfo;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ModelSpecsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/modelSpecs/c;", "Lcom/avito/android/advert/item/modelSpecs/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a.InterfaceC2289a f77628b;

    @Inject
    public c(@k a.InterfaceC2289a interfaceC2289a) {
        this.f77628b = interfaceC2289a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        ModelSpecsItem modelSpecsItem = (ModelSpecsItem) aVar;
        LinkInfo linkInfo = modelSpecsItem.getF77633e().getLinkInfo();
        if (linkInfo == null) {
            throw new IllegalStateException("No link info provided");
        }
        eVar2.setTitle(linkInfo.getTitle());
        eVar2.a(new b(this, modelSpecsItem));
    }
}
