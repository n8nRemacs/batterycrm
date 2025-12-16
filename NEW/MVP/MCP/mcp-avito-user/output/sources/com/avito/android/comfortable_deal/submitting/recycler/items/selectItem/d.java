package com.avito.android.comfortable_deal.submitting.recycler.items.selectItem;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/recycler/items/selectItem/d;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/submitting/recycler/items/selectItem/f;", "Lcom/avito/android/comfortable_deal/submitting/recycler/items/selectItem/SelectorItem;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<f, SelectorItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f123244b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f123245c;

    @Inject
    public d(@k Y41.a aVar, @k l lVar) {
        this.f123244b = lVar;
        this.f123245c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        SelectorItem selectorItem = (SelectorItem) aVar;
        fVar.setTitle(selectorItem.f123233d);
        UniversalImage universalImage = selectorItem.f123232c;
        if (universalImage != null) {
            fVar.J9(universalImage);
        }
        fVar.lT(this.f123245c, selectorItem.f123234e);
        fVar.X20(selectorItem.f123236g);
        fVar.a(new c(this, i12));
    }
}
