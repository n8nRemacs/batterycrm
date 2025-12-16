package com.avito.android.advert.item.beduin.v2.favorite;

import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoriteButtonState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/advert/item/beduin/v2/favorite/j;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/advert/item/beduin/v2/favorite/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k extends N implements Y41.l<G, j> {

    /* renamed from: l, reason: collision with root package name */
    public static final k f73343l = new k();

    public k() {
        super(1);
    }

    @Override // Y41.l
    public final j invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("itemId");
        if (string == null) {
            string = "";
        }
        String str = string;
        Boolean boolC = g13.c("isFavorite");
        return new j(str, g13.getString("analyticsContext"), g13.getString(TooltipAttribute.PARAM_DEEP_LINK), g13.getString("categoryId"), boolC != null ? boolC.booleanValue() : false);
    }
}
