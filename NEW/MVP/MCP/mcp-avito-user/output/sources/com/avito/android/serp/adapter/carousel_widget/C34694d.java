package com.avito.android.serp.adapter.carousel_widget;

import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpAdvertXl;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.inset.AdditionalItem;
import com.avito.android.remote.model.inset.ItemsCarouselWidget;
import com.avito.android.remote.model.inset.ItemsRequestParams;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.serp.adapter.n1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselItemConverter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/d;", "Lcom/avito/android/serp/adapter/carousel_widget/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.carousel_widget.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34694d implements InterfaceC34693c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34904z0 f269339a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f269340b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n1 f269341c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.advert_xl.D f269342d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.carousel_show_more.a f269343e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.f f269344f;

    /* compiled from: CarouselItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.carousel_widget.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f269345a;

        static {
            int[] iArr = new int[AdditionalItem.Position.values().length];
            try {
                iArr[AdditionalItem.Position.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f269345a = iArr;
        }
    }

    @Inject
    public C34694d(@Y61.k InterfaceC34904z0 interfaceC34904z0, @Y61.k T t12, @Y61.k n1 n1Var, @Y61.k com.avito.android.serp.adapter.advert_xl.D d12, @Y61.k com.avito.android.serp.adapter.carousel_show_more.a aVar, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.f fVar) {
        this.f269339a = interfaceC34904z0;
        this.f269340b = t12;
        this.f269341c = n1Var;
        this.f269342d = d12;
        this.f269343e = aVar;
        this.f269344f = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.avito.android.serp.adapter.advert_xl.AdvertXlItem] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.avito.android.serp.adapter.AdvertItem] */
    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34693c
    @Y61.l
    public final CarouselWidgetItem a(@Y61.k ItemsCarouselWidget itemsCarouselWidget, boolean z12, boolean z13, int i12) {
        UniversalColor universalColor;
        DeepLink deepLink;
        List<SerpElement> items = itemsCarouselWidget.getItems();
        if (items == null) {
            items = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = items.iterator();
        while (true) {
            SerpConstructorAdvertItem serpConstructorAdvertItemA = null;
            serpConstructorAdvertItemA = null;
            if (!it.hasNext()) {
                break;
            }
            SerpElement serpElement = (SerpElement) it.next();
            if (serpElement instanceof SerpAdvertXl) {
                SerpAdvertXl serpAdvertXl = (SerpAdvertXl) serpElement;
                SerpDisplayType displayType = itemsCarouselWidget.getDisplayType();
                if (displayType == null) {
                    displayType = SerpDisplayType.Grid;
                }
                serpConstructorAdvertItemA = this.f269342d.a(serpAdvertXl, displayType);
            } else if (serpElement instanceof SerpAdvert) {
                SerpAdvert serpAdvert = (SerpAdvert) serpElement;
                SerpDisplayType displayType2 = itemsCarouselWidget.getDisplayType();
                if (displayType2 == null) {
                    displayType2 = SerpDisplayType.Grid;
                }
                ?? A12 = InterfaceC34904z0.a.a(this.f269339a, serpAdvert, false, false, displayType2, null, 0, null, null, false, 2036);
                UniversalColor snippetTextColor = itemsCarouselWidget.getSnippetTextColor();
                if (snippetTextColor != null) {
                    A12.f268385I0 = snippetTextColor;
                }
                ItemsCarouselWidget.PriceStyle oldPriceStyle = itemsCarouselWidget.getOldPriceStyle();
                if (oldPriceStyle != null) {
                    A12.f268387J0 = oldPriceStyle.getColor();
                }
                ItemsCarouselWidget.PriceStyle discountPercentStyle = itemsCarouselWidget.getDiscountPercentStyle();
                serpConstructorAdvertItemA = A12;
                if (discountPercentStyle != null) {
                    A12.f268389K0 = discountPercentStyle.getColor();
                    serpConstructorAdvertItemA = A12;
                }
            } else if (serpElement instanceof ConstructorAdvertNetworkModel) {
                ConstructorAdvertNetworkModel constructorAdvertNetworkModel = (ConstructorAdvertNetworkModel) serpElement;
                SerpDisplayType displayType3 = itemsCarouselWidget.getDisplayType();
                if (displayType3 == null) {
                    displayType3 = SerpDisplayType.Grid;
                }
                ConstructorAdvertItem constructorAdvertItemA = this.f269344f.a(constructorAdvertNetworkModel, displayType3, false, "", -1, "", null);
                if (constructorAdvertItemA != null) {
                    SerpDisplayType displayType4 = itemsCarouselWidget.getDisplayType();
                    if (displayType4 == null) {
                        displayType4 = SerpDisplayType.Grid;
                    }
                    serpConstructorAdvertItemA = com.avito.android.serp.adapter.constructor.z.a(constructorAdvertItemA, displayType4);
                }
            }
            if (serpConstructorAdvertItemA != null) {
                arrayList.add(serpConstructorAdvertItemA);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<AdditionalItem> additionalItems = itemsCarouselWidget.getAdditionalItems();
        if (additionalItems == null) {
            additionalItems = C42784z0.f406748b;
        }
        Iterator it2 = additionalItems.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AdditionalItem additionalItem = (AdditionalItem) it2.next();
            SerpDisplayType displayType5 = itemsCarouselWidget.getDisplayType();
            if (displayType5 == null) {
                displayType5 = SerpDisplayType.Grid;
            }
            PersistableSerpItem persistableSerpItemA = this.f269343e.a(additionalItem, displayType5);
            AdditionalItem.Position position = additionalItem.getPosition();
            if ((position == null ? -1 : a.f269345a[position.ordinal()]) == 1) {
                arrayList2.add(persistableSerpItemA);
            } else {
                arrayList3.add(persistableSerpItemA);
            }
        }
        if (arrayList.isEmpty()) {
            ItemsRequestParams itemsRequestParams = itemsCarouselWidget.getItemsRequestParams();
            boolean z14 = false;
            if (itemsRequestParams != null) {
                z14 = kotlin.jvm.internal.L.f(itemsRequestParams.getSource(), ItemsCarouselWidget.RECS_PARAMS_SOURCE) && itemsRequestParams.getParamRecs() != null;
            }
            if (!z14) {
                return null;
            }
        }
        this.f269341c.b(arrayList);
        this.f269340b.b(arrayList);
        String title = itemsCarouselWidget.getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        String subtitle = itemsCarouselWidget.getSubtitle();
        AttributedText attributedTitle = itemsCarouselWidget.getAttributedTitle();
        AttributedText attributedSubtitle = itemsCarouselWidget.getAttributedSubtitle();
        ItemsCarouselWidget.Action titleAction = itemsCarouselWidget.getTitleAction();
        CarouselWidgetItem.Action action = (titleAction == null || (deepLink = titleAction.getDeepLink()) == null) ? null : new CarouselWidgetItem.Action(deepLink);
        ItemsCarouselWidget.Action titleAction2 = itemsCarouselWidget.getTitleAction();
        String buttonStyle = titleAction2 != null ? titleAction2.getButtonStyle() : null;
        ItemsCarouselWidget.Action titleAction3 = itemsCarouselWidget.getTitleAction();
        ItemsCarouselWidget.ButtonColors buttonColors = titleAction3 != null ? titleAction3.getButtonColors() : null;
        SerpDisplayType displayType6 = itemsCarouselWidget.getDisplayType();
        UniversalColor backgroundColor = itemsCarouselWidget.getBackgroundColor();
        if (backgroundColor != null) {
            if (backgroundColor.getColor() == null && backgroundColor.getColorKey() == null) {
                backgroundColor = null;
            }
            universalColor = backgroundColor;
        } else {
            universalColor = null;
        }
        ItemsCarouselWidget.BackgroundImage backgroundImage = itemsCarouselWidget.getBackgroundImage();
        ItemsCarouselWidget.Button button = itemsCarouselWidget.getButton();
        Timer timer = itemsCarouselWidget.getTimer();
        ItemsRequestParams itemsRequestParams2 = itemsCarouselWidget.getItemsRequestParams();
        ItemsCarouselWidget.IconImage iconImage = itemsCarouselWidget.getIconImage();
        UniversalImage image = iconImage != null ? iconImage.getImage() : null;
        ItemsCarouselWidget.Analytics analyticForm = itemsCarouselWidget.getAnalyticForm();
        return new CarouselWidgetItem(null, 6, z12, i12, arrayList, arrayList2, arrayList3, str, subtitle, attributedTitle, attributedSubtitle, universalColor, image, action, buttonStyle, buttonColors, displayType6, backgroundImage, button, timer, z13, analyticForm != null ? new CarouselWidgetItem.Analytics(analyticForm.getMcid(), analyticForm.getCwid()) : null, itemsRequestParams2, itemsCarouselWidget.getAnalytics(), itemsCarouselWidget.getSettings(), 1, null);
    }
}
