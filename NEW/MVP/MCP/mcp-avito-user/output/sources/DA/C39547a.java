package dA;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.extended_profile_widgets.adapter.about_v2.AboutV2Item;
import com.avito.android.extended_profile_widgets.adapter.badge_bar.BadgeBarItem;
import com.avito.android.extended_profile_widgets.adapter.badge_bar_v3.BadgeBarV3Item;
import com.avito.android.extended_profile_widgets.adapter.carousel.CarouselItem;
import com.avito.android.extended_profile_widgets.adapter.categorizer.CategorizerItem;
import com.avito.android.extended_profile_widgets.adapter.gallery.GalleryItem;
import com.avito.android.extended_profile_widgets.adapter.info.TextItem;
import com.avito.android.extended_profile_widgets.adapter.job_company_carousel.JobCompanyCarouselItem;
import com.avito.android.extended_profile_widgets.adapter.premium_banner.PremiumBannerListItem;
import com.avito.android.extended_profile_widgets.adapter.search.inline_filters.InlineFiltersItem;
import com.avito.android.extended_profile_widgets.adapter.search.search_advert.SearchAdvertItem;
import com.avito.android.extended_profile_widgets.adapter.search.search_bar.SearchBarItem;
import com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.TabsWithWidgetsItem;
import com.avito.android.serp.adapter.AdvertItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileDiffCallback.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LdA/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dA.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C39547a extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof AboutV2Item) && (aVar4 instanceof AboutV2Item)) {
            AboutV2Item aboutV2Item = (AboutV2Item) aVar3;
            AboutV2Item aboutV2Item2 = (AboutV2Item) aVar4;
            if (!L.f(aboutV2Item.f154164d, aboutV2Item2.f154164d) || !L.f(aboutV2Item.f154165e, aboutV2Item2.f154165e) || !L.f(aboutV2Item.f154167g, aboutV2Item2.f154167g)) {
                return false;
            }
        } else if ((aVar3 instanceof BadgeBarItem) && (aVar4 instanceof BadgeBarItem)) {
            List<BadgeItem> list = ((BadgeBarItem) aVar3).f154210d;
            int size = list.size();
            List<BadgeItem> list2 = ((BadgeBarItem) aVar4).f154210d;
            if (size != list2.size()) {
                return false;
            }
            List<BadgeItem> list3 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((BadgeItem) it.next()).f124944c));
            }
            List<BadgeItem> list4 = list2;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((BadgeItem) it2.next()).f124944c));
            }
            if (!arrayList.containsAll(arrayList2)) {
                return false;
            }
        } else if ((aVar3 instanceof BadgeBarV3Item) && (aVar4 instanceof BadgeBarV3Item)) {
            BadgeBarV3Item badgeBarV3Item = (BadgeBarV3Item) aVar3;
            List<BadgeItem> list5 = badgeBarV3Item.f154221d;
            int size2 = list5.size();
            BadgeBarV3Item badgeBarV3Item2 = (BadgeBarV3Item) aVar4;
            List<BadgeItem> list6 = badgeBarV3Item2.f154221d;
            if (size2 != list6.size()) {
                return false;
            }
            List<BadgeItem> list7 = list5;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list7, 10));
            Iterator<T> it3 = list7.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(((BadgeItem) it3.next()).f124944c));
            }
            List<BadgeItem> list8 = list6;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list8, 10));
            Iterator<T> it4 = list8.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Integer.valueOf(((BadgeItem) it4.next()).f124944c));
            }
            if (!arrayList3.containsAll(arrayList4) || !L.f(badgeBarV3Item.f154222e, badgeBarV3Item2.f154222e)) {
                return false;
            }
        } else if ((aVar3 instanceof CarouselItem) && (aVar4 instanceof CarouselItem)) {
            CarouselItem carouselItem = (CarouselItem) aVar3;
            CarouselItem carouselItem2 = (CarouselItem) aVar4;
            if (!L.f(carouselItem.f154285d, carouselItem2.f154285d) || !L.f(carouselItem.f154286e, carouselItem2.f154286e)) {
                return false;
            }
        } else if ((aVar3 instanceof CategorizerItem) && (aVar4 instanceof CategorizerItem)) {
            CategorizerItem categorizerItem = (CategorizerItem) aVar3;
            CategorizerItem categorizerItem2 = (CategorizerItem) aVar4;
            if (!L.f(categorizerItem.f154312d, categorizerItem2.f154312d) || !L.f(categorizerItem.f154313e, categorizerItem2.f154313e)) {
                return false;
            }
        } else if ((aVar3 instanceof JobCompanyCarouselItem) && (aVar4 instanceof JobCompanyCarouselItem)) {
            JobCompanyCarouselItem jobCompanyCarouselItem = (JobCompanyCarouselItem) aVar3;
            JobCompanyCarouselItem jobCompanyCarouselItem2 = (JobCompanyCarouselItem) aVar4;
            if (!L.f(jobCompanyCarouselItem.f154487d, jobCompanyCarouselItem2.f154487d) || !L.f(jobCompanyCarouselItem.f154488e, jobCompanyCarouselItem2.f154488e)) {
                return false;
            }
        } else if ((aVar3 instanceof GalleryItem) && (aVar4 instanceof GalleryItem)) {
            GalleryItem galleryItem = (GalleryItem) aVar3;
            GalleryItem galleryItem2 = (GalleryItem) aVar4;
            if (!L.f(galleryItem.f154393d, galleryItem2.f154393d) || !L.f(galleryItem.f154394e, galleryItem2.f154394e)) {
                return false;
            }
        } else if (!(aVar3 instanceof InlineFiltersItem) || !(aVar4 instanceof InlineFiltersItem)) {
            if ((aVar3 instanceof PremiumBannerListItem) && (aVar4 instanceof PremiumBannerListItem)) {
                return L.f(((PremiumBannerListItem) aVar3).f154573d, ((PremiumBannerListItem) aVar4).f154573d);
            }
            if ((aVar3 instanceof SearchAdvertItem) && (aVar4 instanceof SearchAdvertItem)) {
                AdvertItem advertItem = ((SearchAdvertItem) aVar3).f154691d;
                String str = advertItem.f268425c;
                AdvertItem advertItem2 = ((SearchAdvertItem) aVar4).f154691d;
                if (!L.f(str, advertItem2.f268425c) || advertItem.f268380G != advertItem2.f268380G || advertItem.f268394N != advertItem2.f268394N) {
                    return false;
                }
            } else if ((aVar3 instanceof TabsWithWidgetsItem) && (aVar4 instanceof TabsWithWidgetsItem)) {
                TabsWithWidgetsItem tabsWithWidgetsItem = (TabsWithWidgetsItem) aVar3;
                TabsWithWidgetsItem tabsWithWidgetsItem2 = (TabsWithWidgetsItem) aVar4;
                if (!L.f(tabsWithWidgetsItem.f154935d, tabsWithWidgetsItem2.f154935d) || !L.f(tabsWithWidgetsItem.f154936e, tabsWithWidgetsItem2.f154936e)) {
                    return false;
                }
            } else {
                if (!(aVar3 instanceof TextItem) || !(aVar4 instanceof TextItem)) {
                    return aVar3.equals(aVar4);
                }
                TextItem textItem = (TextItem) aVar3;
                TextItem textItem2 = (TextItem) aVar4;
                if (!L.f(textItem.f154463e, textItem2.f154463e) || !L.f(textItem.f154462d, textItem2.f154462d)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof InlineFiltersItem) && (aVar4 instanceof InlineFiltersItem)) {
            return true;
        }
        if ((aVar3 instanceof TabsWithWidgetsItem) && (aVar4 instanceof TabsWithWidgetsItem)) {
            return true;
        }
        if ((aVar3 instanceof SearchBarItem) && (aVar4 instanceof SearchBarItem)) {
            return true;
        }
        return ((aVar3 instanceof com.avito.conveyor_item.a) && (aVar4 instanceof com.avito.conveyor_item.a)) ? L.f(((com.avito.conveyor_item.a) aVar3).getF75720c(), ((com.avito.conveyor_item.a) aVar4).getF75720c()) : aVar3.getF72677b() == aVar4.getF72677b();
    }
}
