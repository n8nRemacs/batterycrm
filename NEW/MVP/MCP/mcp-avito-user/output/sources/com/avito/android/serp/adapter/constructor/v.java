package com.avito.android.serp.adapter.constructor;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SerpConstructorAdvertBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/v;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/blueprint/a;", "Lcom/avito/android/serp/adapter/constructor/SerpConstructorAdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v extends com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a<SerpConstructorAdvertItem> {
    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a, TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof SerpConstructorAdvertItem) {
            SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) aVar;
            if (!serpConstructorAdvertItem.getDisplayType().isRich() && !serpConstructorAdvertItem.getDisplayType().isCv() && !serpConstructorAdvertItem.isRedesign() && !serpConstructorAdvertItem.getDisplayType().isAvitoBlack() && !serpConstructorAdvertItem.getDisplayType().isAvitoMall() && !serpConstructorAdvertItem.getDisplayType().isService() && !serpConstructorAdvertItem.getDisplayType().isItemsCarouselWidgetGridXL()) {
                return true;
            }
        }
        return false;
    }
}
