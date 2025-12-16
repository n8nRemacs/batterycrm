package com.avito.android.bxcontent.beduin_v2.favorite;

import com.avito.android.deep_linking.x;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BxFavoriteButtonState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/favorite/i;", "Lcom/avito/beduin/v2/engine/component/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends AbstractC36250j {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f109542c;

    @Inject
    public i(@Y61.k x xVar) {
        super("BuyerContentFavoriteButton", false, 2, null);
        this.f109542c = xVar;
    }

    @Override // com.avito.beduin.v2.engine.component.AbstractC36250j
    public final Object a(AbstractC36250j.b bVar, String str) {
        return (g) E.b(bVar, bVar.f336563b, new h(this));
    }
}
