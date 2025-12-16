package com.avito.android.rubricator.items;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.C36135w2;
import com.avito.android.J0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.vertical_main.RubricatorWidget;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.rubricator.b;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import tn0.InterfaceC48695a;

/* compiled from: RubricatorRefinedItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/items/a;", "Ltn0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements InterfaceC48695a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final J0 f255777a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C36135w2 f255778b;

    @Inject
    public a(@k J0 j02, @k C36135w2 c36135w2) {
        this.f255777a = j02;
        this.f255778b = c36135w2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tn0.InterfaceC48695a
    @l
    public final b a(@k RubricatorWidget rubricatorWidget, int i12) {
        C42784z0 c42784z0;
        C42784z0 c42784z02;
        ArrayList arrayList;
        List<RubricatorWidget.RubricatorWidgetAction> list;
        RubricatorRefinedItem.SerpRubricatorLinearServiceItem serpRubricatorLinearServiceItem;
        C42784z0 c42784z03;
        List<RubricatorWidget.RubricatorWidgetItem> items = rubricatorWidget.getItems();
        if (items == null || items.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("rubricatorWidget");
        J0 j02 = this.f255777a;
        String strK = f.k(j02, sb2);
        RubricatorWidget.RubricatorWidgetType displayingOptions = rubricatorWidget.getDisplayingOptions();
        if (displayingOptions instanceof RubricatorWidget.RubricatorWidgetType.FixedColumns) {
            C36135w2 c36135w2 = this.f255778b;
            c36135w2.getClass();
            n<Object> nVar = C36135w2.f327457X[1];
            if (!((Boolean) c36135w2.f327482c.a().invoke()).booleanValue()) {
                return null;
            }
            RubricatorWidget.RubricatorWidgetType.FixedColumns fixedColumns = (RubricatorWidget.RubricatorWidgetType.FixedColumns) rubricatorWidget.getDisplayingOptions();
            String title = rubricatorWidget.getTitle();
            List<RubricatorWidget.RubricatorWidgetItem> items2 = rubricatorWidget.getItems();
            if (items2 != null) {
                List<RubricatorWidget.RubricatorWidgetItem> list2 = items2;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (RubricatorWidget.RubricatorWidgetItem rubricatorWidgetItem : list2) {
                    Analytics analytics = rubricatorWidget.getAnalytics();
                    String strValueOf = String.valueOf(j02.a());
                    String title2 = rubricatorWidgetItem.getTitle();
                    String displayTitle = rubricatorWidgetItem.getDisplayTitle();
                    DeepLink uri = rubricatorWidgetItem.getActionedImage().getAction().getUri();
                    UniversalImage image = rubricatorWidgetItem.getActionedImage().getImage();
                    List<RubricatorWidget.RubricatorWidgetAction> actions = rubricatorWidgetItem.getActions();
                    if (actions == null) {
                        actions = C42784z0.f406748b;
                    }
                    arrayList2.add(new RubricatorRefinedItem.SerpRubricatorGridServiceItem(strValueOf, i12, title2, displayTitle, uri, image, actions, analytics));
                }
                c42784z03 = arrayList2;
            } else {
                c42784z03 = C42784z0.f406748b;
            }
            return new b.c(strK, null, 0, new b.c.a(fixedColumns.getColumnCount(), fixedColumns.getTabletColumnCount()), title, c42784z03, rubricatorWidget.getAnalytics(), rubricatorWidget.getSettings(), 6, null);
        }
        if (!(displayingOptions instanceof RubricatorWidget.RubricatorWidgetType.DynamicColumns)) {
            String title3 = rubricatorWidget.getTitle();
            List<RubricatorWidget.RubricatorWidgetItem> items3 = rubricatorWidget.getItems();
            if (items3 != null) {
                List<RubricatorWidget.RubricatorWidgetItem> list3 = items3;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
                for (RubricatorWidget.RubricatorWidgetItem rubricatorWidgetItem2 : list3) {
                    Analytics analytics2 = rubricatorWidget.getAnalytics();
                    String strValueOf2 = String.valueOf(j02.a());
                    String title4 = rubricatorWidgetItem2.getTitle();
                    DeepLink uri2 = rubricatorWidgetItem2.getActionedImage().getAction().getUri();
                    UniversalImage image2 = rubricatorWidgetItem2.getActionedImage().getImage();
                    List<RubricatorWidget.RubricatorWidgetAction> actions2 = rubricatorWidgetItem2.getActions();
                    if (actions2 == null) {
                        actions2 = C42784z0.f406748b;
                    }
                    arrayList3.add(new RubricatorRefinedItem.SerpRubricatorCategoryItem(strValueOf2, i12, title4, uri2, image2, analytics2, actions2));
                }
                c42784z0 = arrayList3;
            } else {
                c42784z0 = C42784z0.f406748b;
            }
            return new b.a(strK, null, 0, title3, c42784z0, rubricatorWidget.getAnalytics(), rubricatorWidget.getSettings(), 6, null);
        }
        String title5 = rubricatorWidget.getTitle();
        List<RubricatorWidget.RubricatorWidgetItem> items4 = rubricatorWidget.getItems();
        if (items4 != null) {
            List<RubricatorWidget.RubricatorWidgetItem> list4 = items4;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list4, 10));
            for (RubricatorWidget.RubricatorWidgetItem rubricatorWidgetItem3 : list4) {
                Analytics analytics3 = rubricatorWidget.getAnalytics();
                String strValueOf3 = String.valueOf(j02.a());
                String title6 = rubricatorWidgetItem3.getTitle();
                String displayTitle2 = rubricatorWidgetItem3.getDisplayTitle();
                DeepLink uri3 = rubricatorWidgetItem3.getActionedImage().getAction().getUri();
                UniversalImage image3 = rubricatorWidgetItem3.getActionedImage().getImage();
                List<RubricatorWidget.RubricatorWidgetAction> actions3 = rubricatorWidgetItem3.getActions();
                if (actions3 == null) {
                    actions3 = C42784z0.f406748b;
                }
                arrayList4.add(new RubricatorRefinedItem.SerpRubricatorLinearServiceItem(strValueOf3, i12, title6, displayTitle2, uri3, image3, actions3, analytics3));
            }
            c42784z02 = arrayList4;
        } else {
            c42784z02 = C42784z0.f406748b;
        }
        Analytics analytics4 = rubricatorWidget.getAnalytics();
        RubricatorWidget.RubricatorWidgetItem additionalButton = rubricatorWidget.getAdditionalButton();
        if (additionalButton == null) {
            serpRubricatorLinearServiceItem = null;
        } else {
            List<RubricatorWidget.RubricatorWidgetItem> items5 = rubricatorWidget.getItems();
            if (items5 != null) {
                List<RubricatorWidget.RubricatorWidgetItem> list5 = items5;
                ArrayList arrayList5 = new ArrayList(C42745f0.q(list5, 10));
                for (RubricatorWidget.RubricatorWidgetItem rubricatorWidgetItem4 : list5) {
                    arrayList5.add(new RubricatorWidget.RubricatorWidgetAction(null, rubricatorWidgetItem4.getTitle(), rubricatorWidgetItem4.getSubtitle(), rubricatorWidgetItem4.getActionedImage().getImage(), rubricatorWidgetItem4.getActionedImage().getAction().getUri(), false, C42784z0.f406748b));
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            String strValueOf4 = String.valueOf(j02.a());
            String title7 = additionalButton.getTitle();
            String displayTitle3 = additionalButton.getDisplayTitle();
            DeepLink uri4 = additionalButton.getActionedImage().getAction().getUri();
            UniversalImage image4 = additionalButton.getActionedImage().getImage();
            List<RubricatorWidget.RubricatorWidgetAction> actions4 = additionalButton.getActions();
            if (actions4 != null) {
                list = actions4;
                serpRubricatorLinearServiceItem = new RubricatorRefinedItem.SerpRubricatorLinearServiceItem(strValueOf4, i12, title7, displayTitle3, uri4, image4, list, analytics4);
            } else if (arrayList == null) {
                actions4 = C42784z0.f406748b;
                list = actions4;
                serpRubricatorLinearServiceItem = new RubricatorRefinedItem.SerpRubricatorLinearServiceItem(strValueOf4, i12, title7, displayTitle3, uri4, image4, list, analytics4);
            } else {
                list = arrayList;
                serpRubricatorLinearServiceItem = new RubricatorRefinedItem.SerpRubricatorLinearServiceItem(strValueOf4, i12, title7, displayTitle3, uri4, image4, list, analytics4);
            }
        }
        return new b.d(strK, null, 0, title5, c42784z02, serpRubricatorLinearServiceItem, rubricatorWidget.getAnalytics(), rubricatorWidget.getSettings(), 6, null);
    }
}
