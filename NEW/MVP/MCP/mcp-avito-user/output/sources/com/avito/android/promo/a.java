package com.avito.android.promo;

import Y61.k;
import com.avito.android.J0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.promo.PromoWidgetItem;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.b;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PromoWidgetConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/promo/a;", "Lcom/avito/android/serp/b;", "Lcom/avito/android/promo/PromoWidget;", "Lcom/avito/android/promo/PromoWidgetItem;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements b<PromoWidget, PromoWidgetItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final J0 f231640a;

    public a(@k J0 j02) {
        this.f231640a = j02;
    }

    @Override // com.avito.android.serp.b
    @k
    public final Class<? extends PromoWidget> a() {
        return PromoWidget.class;
    }

    @Override // com.avito.android.serp.b
    public final l1 b(SerpElement serpElement, String str, String str2, int i12) {
        String title;
        if (!(serpElement instanceof PromoWidget)) {
            return null;
        }
        PromoWidget promoWidget = (PromoWidget) serpElement;
        String text = promoWidget.getText();
        if (((text == null || text.length() == 0) && !O2.a(promoWidget.getActions())) || (title = promoWidget.getTitle()) == null) {
            return null;
        }
        String strK = f.k(this.f231640a, new StringBuilder("vertical_promo"));
        String text2 = promoWidget.getText();
        List<PromoAction> actions = promoWidget.getActions();
        String image = promoWidget.getImage();
        MovableImage movableImage = promoWidget.getMovableImage();
        PromoStyle style = promoWidget.getStyle();
        if (style == null) {
            style = PromoStyle.WARMGRAY;
        }
        PromoStyle promoStyle = style;
        String promoId = promoWidget.getPromoId();
        PromoAnalyticParams analyticParams = promoWidget.getAnalyticParams();
        Boolean isUnifiedConfig = promoWidget.getIsUnifiedConfig();
        boolean zBooleanValue = isUnifiedConfig != null ? isUnifiedConfig.booleanValue() : false;
        PromoWidgetItem.ViewType.a aVar = PromoWidgetItem.ViewType.f231612b;
        String view = promoWidget.getView();
        aVar.getClass();
        return new PromoWidgetItemImpl(strK, title, text2, actions, promoStyle, image, promoWidget.getAnalytics(), movableImage, promoId, analyticParams, zBooleanValue, L.f(view, "mini") ? PromoWidgetItem.ViewType.f231613c : PromoWidgetItem.ViewType.f231614d, false, false, false, promoWidget.getSettings(), 28672, null);
    }
}
