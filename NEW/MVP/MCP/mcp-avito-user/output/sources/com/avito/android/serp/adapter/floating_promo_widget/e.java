package com.avito.android.serp.adapter.floating_promo_widget;

import androidx.compose.runtime.internal.P;
import com.avito.android.di.module.InterfaceC30235x5;
import com.avito.android.remote.model.FloatingPromoWidget;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FloatingPromoWidgetConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/floating_promo_widget/e;", "Lcom/avito/android/serp/adapter/floating_promo_widget/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f269984a;

    @Inject
    public e(@InterfaceC30235x5 boolean z12) {
        this.f269984a = z12;
    }

    @Override // com.avito.android.serp.adapter.floating_promo_widget.d
    @Y61.k
    public final FloatingPromoWidgetItem a(@Y61.k FloatingPromoWidget floatingPromoWidget) {
        String id2 = floatingPromoWidget.getId();
        AttributedText title = floatingPromoWidget.getTitle();
        AttributedText text = floatingPromoWidget.getText();
        FloatingPromoWidget.Image backgroundImage = floatingPromoWidget.getBackgroundImage();
        boolean z12 = this.f269984a;
        UniversalImage image = backgroundImage.getImage(z12);
        FloatingPromoWidget.Image image2 = floatingPromoWidget.getImage();
        return new FloatingPromoWidgetItem(id2, title, text, image, image2 != null ? image2.getImage(z12) : null, floatingPromoWidget.getDeepLink());
    }
}
