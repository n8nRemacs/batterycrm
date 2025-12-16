package com.avito.android.advert.item.consultation;

import RJ0.a;
import android.view.View;
import androidx.view.C23038g0;
import com.avito.android.C36135w2;
import com.avito.android.cross_category.CrossCategoryWidgetItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem;
import com.avito.android.horizontal_list.HorizontalListWidgetListItem;
import com.avito.android.horizontal_list.widget.HorizontalWidgetType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.select.BaseSelect;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.gallery.GalleryPickerFragment;
import com.avito.android.photo_picker.gallery.e;
import com.avito.android.remote.model.vertical_main.ArticleType;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import com.avito.android.serp.adapter.model_card.item.ModelCardWidgetItem;
import com.avito.android.serp.adapter.vertical_main.VerticalFilterData;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.analytics.SearchWidgetAction;
import com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem;
import com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item.CollectionsRecommendationItem;
import com.avito.android.serp.adapter.vertical_main.featured.action.FeaturedActionItem;
import com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list.TopSellerItem;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.InterfaceC34866b;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.Column;
import com.avito.android.util.N0;
import java.util.List;
import java.util.NoSuchElementException;
import js0.d;
import kotlin.collections.C42745f0;
import q80.C47254a;
import r80.C47511d;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;
import vQ.InterfaceC49249a;
import vs0.C49377a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class C implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f74639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f74640c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f74641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f74642e;

    public /* synthetic */ C(Object obj, int i12, Object obj2, int i13) {
        this.f74639b = i13;
        this.f74642e = obj;
        this.f74640c = i12;
        this.f74641d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i12 = this.f74640c;
        Object obj = this.f74641d;
        Object obj2 = this.f74642e;
        switch (this.f74639b) {
            case 0:
                D d12 = (D) obj2;
                int i13 = 0;
                for (Object obj3 : d12.f74665j) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    ((CallInterval) obj3).f136192b = i13 == i12;
                    i13 = i14;
                }
                for (CallInterval callInterval : d12.f74665j) {
                    if (callInterval.f136192b) {
                        Input.t(d12.f74663h, E.a(callInterval), false, 6);
                        N0.a((com.avito.android.lib.design.bottom_sheet.d) obj);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 1:
                S s5 = (S) obj2;
                int i15 = 0;
                for (Object obj4 : s5.f74716y) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    ((CallInterval) obj4).f136192b = i15 == i12;
                    i15 = i16;
                }
                boolean z12 = s5.f74717z;
                BaseSelect baseSelect = s5.f74700i;
                if (z12) {
                    for (CallInterval callInterval2 : s5.f74716y) {
                        if (callInterval2.f136192b) {
                            Input.t(baseSelect, T.b(callInterval2), false, 6);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                for (CallInterval callInterval3 : s5.f74716y) {
                    if (callInterval3.f136192b) {
                        Input.t(baseSelect, T.a(callInterval3), false, 6);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                N0.a((com.avito.android.lib.design.bottom_sheet.d) obj);
                return;
            case 2:
                int i17 = com.avito.android.advert.item.cv_state.h.f75070f;
                ((Y41.l) obj2).invoke(((List) obj).get(i12));
                return;
            case 3:
                com.avito.android.cross_category.h hVar = (com.avito.android.cross_category.h) obj2;
                vs0.d dVar = hVar.f131063c.get();
                Integer numValueOf = Integer.valueOf(i12);
                hVar.f131064d.getClass();
                CrossCategoryWidgetItem crossCategoryWidgetItem = (CrossCategoryWidgetItem) obj;
                dVar.v(new C49377a(crossCategoryWidgetItem, new vs0.b(numValueOf, null, null, 2, null)));
                d.a.a(hVar.f131065e, Integer.valueOf(i12), "CrossCategoryWidget", crossCategoryWidgetItem.getF131044c(), null, null, null, null, crossCategoryWidgetItem.getF131049h(), 120);
                return;
            case 4:
                com.avito.android.developments_advice.j jVar = (com.avito.android.developments_advice.j) obj2;
                int i18 = 0;
                for (Object obj5 : jVar.f136119r) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    ((CallInterval) obj5).f136192b = i18 == i12;
                    i18 = i19;
                }
                for (CallInterval callInterval4 : jVar.f136119r) {
                    if (callInterval4.f136192b) {
                        Input.t(jVar.f136113l, com.avito.android.developments_advice.k.a(callInterval4), false, 6);
                        N0.a((com.avito.android.lib.design.bottom_sheet.d) obj);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 5:
                int i22 = com.avito.android.feed_shortcuts.element.g.f157685g;
                ((com.avito.android.feed_shortcuts.widget.g) obj2).k((FeedShortcutsWidgetElementItem) obj, i12);
                return;
            case 6:
                int i23 = com.avito.android.horizontal_list.items.defaultItem.c.f162579d;
                HorizontalListWidgetListItem.Default r82 = (HorizontalListWidgetListItem.Default) obj;
                com.avito.android.horizontal_list.items.defaultItem.c cVar = (com.avito.android.horizontal_list.items.defaultItem.c) obj2;
                d.a.a(cVar.f162580b, Integer.valueOf(r82.f162548b), HorizontalWidgetType.NONE.f162607b, r82.f162549c, null, Integer.valueOf(i12), null, null, r82.f162553g, 104);
                InterfaceC47691c.a.b(cVar.f162581c.get(), r82.f162551e, 6);
                return;
            case 7:
                int i24 = com.avito.android.horizontal_list.items.recentSearchItem.c.f162592d;
                HorizontalListWidgetListItem.RecentSearch recentSearch = (HorizontalListWidgetListItem.RecentSearch) obj;
                com.avito.android.horizontal_list.items.recentSearchItem.c cVar2 = (com.avito.android.horizontal_list.items.recentSearchItem.c) obj2;
                d.a.a(cVar2.f162593b, Integer.valueOf(recentSearch.f162554b), HorizontalWidgetType.RECENT_SEARCH.f162607b, recentSearch.f162555c, null, Integer.valueOf(i12), null, null, recentSearch.f162560h, 104);
                InterfaceC47691c.a.b(cVar2.f162594c.get(), recentSearch.f162557e, 6);
                return;
            case 8:
                int i25 = com.avito.android.job.interview.pickers.b.f174653G;
                Picker picker = (Picker) obj2;
                com.avito.android.lib.design.picker.k<?> firstWheelValue = picker.getFirstWheelValue();
                com.avito.android.lib.design.picker.k<?> secondWheelValue = picker.getSecondWheelValue();
                com.avito.android.job.interview.pickers.b bVar = (com.avito.android.job.interview.pickers.b) obj;
                bVar.f174654E.invoke(new InterfaceC49249a.c(i12, ((Number) firstWheelValue.f180046a).intValue(), firstWheelValue.f180047b + ' ' + secondWheelValue.f180047b + ' ' + bVar.f174655F.get(1), ((Number) secondWheelValue.f180046a).intValue()));
                bVar.dismiss();
                return;
            case 9:
                RubricatorRefinedItem.SerpRubricatorCategoryItem serpRubricatorCategoryItem = (RubricatorRefinedItem.SerpRubricatorCategoryItem) obj;
                com.avito.android.rubricator.items.category.f fVar = (com.avito.android.rubricator.items.category.f) obj2;
                d.a.a(fVar.f255789c, Integer.valueOf(serpRubricatorCategoryItem.f255755c), "rubricatorWidget", serpRubricatorCategoryItem.f255756d, null, Integer.valueOf(i12), null, null, serpRubricatorCategoryItem.f255759g, 104);
                fVar.f255788b.r1(serpRubricatorCategoryItem);
                return;
            case 10:
                RubricatorRefinedItem.SerpRubricatorLinearServiceItem serpRubricatorLinearServiceItem = (RubricatorRefinedItem.SerpRubricatorLinearServiceItem) obj;
                com.avito.android.rubricator.items.linear_service.f fVar2 = (com.avito.android.rubricator.items.linear_service.f) obj2;
                d.a.a(fVar2.f255805c, Integer.valueOf(serpRubricatorLinearServiceItem.f255770c), "rubricatorWidget", serpRubricatorLinearServiceItem.f255771d, null, Integer.valueOf(i12), null, null, serpRubricatorLinearServiceItem.f255776i, 104);
                fVar2.f255804b.r1(serpRubricatorLinearServiceItem);
                return;
            case 11:
                RubricatorRefinedItem.SerpRubricatorGridServiceItem serpRubricatorGridServiceItem = (RubricatorRefinedItem.SerpRubricatorGridServiceItem) obj;
                com.avito.android.rubricator.items.service.e eVar = (com.avito.android.rubricator.items.service.e) obj2;
                d.a.a(eVar.f255822c, Integer.valueOf(serpRubricatorGridServiceItem.f255762c), "rubricatorWidget", serpRubricatorGridServiceItem.f255763d, null, Integer.valueOf(i12), null, null, serpRubricatorGridServiceItem.f255768i, 104);
                eVar.f255821b.r1(serpRubricatorGridServiceItem);
                return;
            case 12:
                ModelCardWidgetItem modelCardWidgetItem = (ModelCardWidgetItem) obj;
                ((com.avito.android.serp.adapter.model_card.item.a) obj2).f270422c.invoke(modelCardWidgetItem.f270418b, Integer.valueOf(i12), modelCardWidgetItem.f270419c);
                return;
            case 13:
                AvitoBlogArticleItem avitoBlogArticleItem = (AvitoBlogArticleItem) obj;
                com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.c cVar3 = (com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.c) obj2;
                d.a.a(cVar3.f272605d, Integer.valueOf(avitoBlogArticleItem.getF272597g()), "avitoBlogWidgetArticle", avitoBlogArticleItem.getF272594d(), null, Integer.valueOf(i12), null, null, avitoBlogArticleItem.getF272598h(), 104);
                DeepLink uri = avitoBlogArticleItem.getF272595e().getUri();
                h31.e<InterfaceC47690b> eVar2 = cVar3.f272603b;
                if (uri != null) {
                    C36135w2 c36135w2 = cVar3.f272606e;
                    c36135w2.getClass();
                    kotlin.reflect.n<Object> nVar = C36135w2.f327457X[25];
                    if (((Boolean) c36135w2.f327501v.a().invoke()).booleanValue()) {
                        DeepLink uri2 = avitoBlogArticleItem.getF272595e().getUri();
                        if (uri2 != null) {
                            InterfaceC47691c.a.a(eVar2.get(), uri2, null, 14);
                            if (avitoBlogArticleItem.getF272596f() == ArticleType.VIDEO) {
                                cVar3.f272607f.a(avitoBlogArticleItem.getF272594d());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                eVar2.get().f(avitoBlogArticleItem);
                return;
            case 14:
                CollectionsRecommendationItem collectionsRecommendationItem = (CollectionsRecommendationItem) obj;
                com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item.a aVar = (com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item.a) obj2;
                d.a.a(aVar.f272725c, Integer.valueOf(collectionsRecommendationItem.f272719c), "collectionsRecommendationsWidget", collectionsRecommendationItem.f272720d, null, Integer.valueOf(i12), null, null, collectionsRecommendationItem.f272723g, 104);
                InterfaceC47691c.a.a(aVar.f272724b.get(), collectionsRecommendationItem.f272721e, null, 14);
                return;
            case 15:
                ((com.avito.android.serp.adapter.vertical_main.featured.action.j) obj2).f272826b.k((FeaturedActionItem) obj, i12);
                return;
            case 16:
                com.avito.android.serp.adapter.vertical_main.publish.f fVar3 = (com.avito.android.serp.adapter.vertical_main.publish.f) obj2;
                VerticalPromoBlockItem.VerticalPublishItem verticalPublishItem = (VerticalPromoBlockItem.VerticalPublishItem) obj;
                d.a.a(fVar3.f273097g, Integer.valueOf(i12), verticalPublishItem.f272549f, null, null, null, null, null, verticalPublishItem.f272557n, 124);
                fVar3.t();
                return;
            case 17:
                TopSellerItem topSellerItem = (TopSellerItem) obj;
                com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list.c cVar4 = (com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list.c) obj2;
                d.a.a(cVar4.f273275c, Integer.valueOf(topSellerItem.f273266f), "top_sellers_widget", topSellerItem.f273263c, null, Integer.valueOf(i12), null, topSellerItem.f273269i, topSellerItem.f273268h, 40);
                InterfaceC47691c.a.a(cVar4.f273274b.get(), topSellerItem.f273267g.getDeepLink(), null, 14);
                return;
            case 18:
                com.avito.android.serp.adapter.vertical_main.vertical_filter.v vVar = (com.avito.android.serp.adapter.vertical_main.vertical_filter.v) obj2;
                VerticalFilterData verticalFilterData = vVar.f273582H;
                InterfaceC34866b interfaceC34866b = vVar.f273609i;
                interfaceC34866b.d(verticalFilterData);
                if (interfaceC34866b.b()) {
                    vVar.y();
                    return;
                }
                VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem = (VerticalPromoBlockItem.VerticalFilterItem) obj;
                d.a.a(vVar.f273614n, Integer.valueOf(i12), verticalFilterItem.f272534f, null, null, null, null, verticalFilterItem.f272546r, verticalFilterItem.f272544p, 60);
                vVar.v(SearchWidgetAction.f272570d);
                return;
            case 19:
                int i26 = com.avito.android.service_booking_calendar.flexible.header.recycler.j.f276055c;
                ((Y41.l) obj2).invoke(((WeekItem) obj).f275675c.get(i12));
                return;
            case 20:
                int i27 = com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.d.f317705g;
                ((Y41.l) obj2).invoke(new a.d(Integer.valueOf(i12), ((Column) obj).f317685d));
                return;
            default:
                com.avito.android.offlinization.ui.a aVar2 = ((C47511d) obj2).f429638e;
                if (aVar2 != null) {
                    C47254a c47254a = (C47254a) obj;
                    com.avito.android.photo_picker.gallery.e eVar3 = ((GalleryPickerFragment) aVar2.f208626c).f219467z0;
                    if (eVar3 == null) {
                        eVar3 = null;
                    }
                    C23038g0<e.a> c23038g0 = eVar3.f219509S;
                    c23038g0.setValue(new e.a.C6601e(c47254a.f429050b));
                    if (i12 == 0) {
                        eVar3.f219505O = "";
                    } else if (i12 == eVar3.f219507Q.size() - 1) {
                        PhotoPickerViewModel photoPickerViewModel = eVar3.f219510T;
                        PhotoPickerViewModel photoPickerViewModel2 = photoPickerViewModel != null ? photoPickerViewModel : null;
                        photoPickerViewModel2.f218825U.setValue(new PhotoPickerViewModel.a.g(photoPickerViewModel2.f218820P > 1));
                    } else {
                        eVar3.f219505O = c47254a.f429049a;
                    }
                    eVar3.ke();
                    c23038g0.setValue(new e.a.h(eVar3.le()));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ C(Object obj, Object obj2, int i12, int i13) {
        this.f74639b = i13;
        this.f74642e = obj;
        this.f74641d = obj2;
        this.f74640c = i12;
    }
}
