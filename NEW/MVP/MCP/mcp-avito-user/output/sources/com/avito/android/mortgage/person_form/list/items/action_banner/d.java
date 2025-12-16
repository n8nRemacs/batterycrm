package com.avito.android.mortgage.person_form.list.items.action_banner;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ActionBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/action_banner/d;", "LC00/b;", "Lcom/avito/android/mortgage/person_form/list/items/action_banner/f;", "Lcom/avito/android/mortgage/person_form/list/items/action_banner/ActionBannerItem;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends C00.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<E00.b, G0> f200575b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super E00.b, G0> lVar) {
        this.f200575b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ActionBannerItem actionBannerItem = (ActionBannerItem) aVar;
        fVar.setTitle(actionBannerItem.f200564c);
        fVar.h(actionBannerItem.f200565d);
        fVar.oa(actionBannerItem.f200566e);
        fVar.U(new c(actionBannerItem, this));
    }
}
