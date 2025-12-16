package com.avito.android.serp.adapter.attributed_header_widget;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AttributedHeaderWidget;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AttributedHeaderWidgetConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/attributed_header_widget/d;", "Lcom/avito/android/serp/adapter/attributed_header_widget/c;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // com.avito.android.serp.adapter.attributed_header_widget.c
    @Y61.k
    public final AttributedHeaderWidgetItem a(@Y61.k AttributedHeaderWidget attributedHeaderWidget) {
        return new AttributedHeaderWidgetItem(attributedHeaderWidget.getTitle(), attributedHeaderWidget.getDescription(), UUID.randomUUID().toString(), attributedHeaderWidget.getAnalytics(), attributedHeaderWidget.getSettings());
    }
}
