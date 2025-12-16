package com.avito.android.serp.adapter.auto_model_widget;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.auto_model.AutoModelButton;
import com.avito.android.remote.model.auto_model.AutoModelDescription;
import com.avito.android.remote.model.auto_model.AutoModelRating;
import com.avito.android.remote.model.auto_model.AutoModelWidget;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoModelWidgetConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/auto_model_widget/d;", "Lcom/avito/android/serp/adapter/auto_model_widget/c;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // com.avito.android.serp.adapter.auto_model_widget.c
    @Y61.k
    public final AutoModelWidgetItem a(@Y61.k AutoModelWidget autoModelWidget) {
        String string = UUID.randomUUID().toString();
        List<Image> images = autoModelWidget.getImages();
        String title = autoModelWidget.getTitle();
        String price = autoModelWidget.getPrice();
        AutoModelRating rating = autoModelWidget.getRating();
        DeepLink deepLink = autoModelWidget.getDeepLink();
        List<AutoModelButton> buttons = autoModelWidget.getButtons();
        AutoModelDescription description = autoModelWidget.getDescription();
        return new AutoModelWidgetItem(null, 0, string, images, title, price, description != null ? description.getParams() : null, rating, deepLink, buttons, 3, null);
    }
}
