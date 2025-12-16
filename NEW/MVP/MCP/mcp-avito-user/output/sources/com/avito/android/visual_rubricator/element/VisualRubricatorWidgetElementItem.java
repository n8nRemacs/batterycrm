package com.avito.android.visual_rubricator.element;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.visual_rubricator.Space;
import j.InterfaceC42150f;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VisualRubricatorWidgetElementItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/element/VisualRubricatorWidgetElementItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VisualRubricatorWidgetElementItem extends PersistableSpannedItem {

    /* compiled from: VisualRubricatorWidgetElementItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @InterfaceC42150f
    @Y61.l
    Integer A0();

    boolean B5();

    boolean N5();

    @InterfaceC42150f
    @Y61.l
    Integer R1();

    @Y61.k
    Space a0();

    @Y61.l
    Map<String, String> b0();

    @Y61.l
    Analytics getAnalytics();

    @Y61.l
    Integer getBackgroundColor();

    @Y61.l
    UniversalColor getBackgroundUniversalColor();

    @Y61.l
    UniversalImage getImage();

    @Y61.k
    VisualRubricatorWidgetElementLayout getLayout();

    @Y61.l
    Integer getRowLine();

    @Y61.k
    String getTitle();

    @Y61.l
    UniversalColor getTitleColor();

    @Y61.l
    String getTitleWithTransfer();

    @Y61.k
    DeepLink getUri();

    boolean m0();

    @Y61.l
    CategoryBadge t0();

    @Y61.k
    Space t5();

    boolean u1();

    @Y61.l
    Integer y4();
}
