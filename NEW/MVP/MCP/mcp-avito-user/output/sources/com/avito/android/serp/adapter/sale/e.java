package com.avito.android.serp.adapter.sale;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.inset.ItemsCarouselWidget;
import com.avito.android.remote.model.sales.SaleShortcuts;
import com.avito.android.remote.model.sales.SalesHeaderWidget;
import com.avito.android.remote.model.slider.SliderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.carousel_widget.InterfaceC34693c;
import com.avito.android.visual_rubricator.N;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItemImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SaleHeaderItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/sale/e;", "Lcom/avito/android/serp/adapter/sale/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N f271490a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34693c f271491b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.slider.c f271492c;

    @Inject
    public e(@Y61.k N n12, @Y61.k InterfaceC34693c interfaceC34693c, @Y61.k com.avito.android.serp.adapter.slider.c cVar) {
        this.f271490a = n12;
        this.f271491b = interfaceC34693c;
        this.f271492c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // com.avito.android.serp.adapter.sale.d
    @Y61.k
    public final SaleHeaderItem a(@Y61.k SalesHeaderWidget salesHeaderWidget) {
        ?? H02;
        List<SerpElement> internalWidgets = salesHeaderWidget.getInternalWidgets();
        if (internalWidgets != null) {
            H02 = new ArrayList();
            int i12 = 0;
            for (Object obj : internalWidgets) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                SerpElement serpElement = (SerpElement) obj;
                com.avito.conveyor_item.a aVarA = serpElement instanceof ItemsCarouselWidget ? this.f271491b.a((ItemsCarouselWidget) serpElement, true, true, i12) : serpElement instanceof SliderWidget ? this.f271492c.a((SliderWidget) serpElement, true) : null;
                if (aVarA != null) {
                    H02.add(aVarA);
                }
                i12 = i13;
            }
        } else {
            H02 = C42784z0.f406748b;
        }
        SaleShortcuts shortcuts = salesHeaderWidget.getShortcuts();
        VisualRubricatorWidgetItemImpl visualRubricatorWidgetItemImplB = shortcuts != null ? this.f271490a.b(shortcuts) : null;
        if (visualRubricatorWidgetItemImplB != null) {
            H02 = C42745f0.h0((Iterable) H02, Collections.singletonList(visualRubricatorWidgetItemImplB));
        }
        List list = H02;
        AttributedText attributedTitle = salesHeaderWidget.getAttributedTitle();
        AttributedText attributedSubtitle = salesHeaderWidget.getAttributedSubtitle();
        SalesHeaderWidget.Style style = salesHeaderWidget.getStyle();
        String stickerText = salesHeaderWidget.getStickerText();
        SalesHeaderWidget.Timer timer = salesHeaderWidget.getTimer();
        UniversalImage image = salesHeaderWidget.getImage();
        UniversalImage bottomImage = salesHeaderWidget.getBottomImage();
        SalesHeaderWidget.ImageDisplayMode imageDisplayMode = salesHeaderWidget.getImageDisplayMode();
        if (imageDisplayMode == null) {
            imageDisplayMode = SalesHeaderWidget.ImageDisplayMode.TOP;
        }
        return new SaleHeaderItem(attributedTitle, attributedSubtitle, style, stickerText, timer, image, bottomImage, imageDisplayMode, list, null, salesHeaderWidget.getAnalytics(), salesHeaderWidget.getSettings(), 512, null);
    }
}
