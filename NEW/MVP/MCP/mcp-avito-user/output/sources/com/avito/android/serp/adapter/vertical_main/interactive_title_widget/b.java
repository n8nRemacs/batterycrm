package com.avito.android.serp.adapter.vertical_main.interactive_title_widget;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.vertical_main.InteractiveTitleWidget;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InteractiveTitleItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/interactive_title_widget/b;", "Lcom/avito/android/serp/adapter/vertical_main/interactive_title_widget/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.interactive_title_widget.a
    @Y61.k
    public final InteractiveTitleWidgetItem a(@Y61.k InteractiveTitleWidget interactiveTitleWidget) {
        String title = interactiveTitleWidget.getTitle();
        String style = interactiveTitleWidget.getStyle();
        DeepLink deeplink = interactiveTitleWidget.getDeeplink();
        com.avito.android.remote.model.vertical_main.VerticalInsets verticalInsets = interactiveTitleWidget.getVerticalInsets();
        VerticalInsets verticalInsets2 = verticalInsets != null ? new VerticalInsets(verticalInsets.getTop(), verticalInsets.getBottom()) : null;
        com.avito.android.remote.model.vertical_main.HorizontalInsets horizontalInsets = interactiveTitleWidget.getHorizontalInsets();
        return new InteractiveTitleWidgetItem(title, style, null, deeplink, verticalInsets2, horizontalInsets != null ? new com.avito.android.remote.model.vertical_main.HorizontalInsets(horizontalInsets.getLeft(), horizontalInsets.getRight()) : null, interactiveTitleWidget.getAnalytics(), interactiveTitleWidget.getSettings(), 4, null);
    }
}
