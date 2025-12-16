package com.avito.android.advert.item;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.advert.item.cv_state.AdvertCvStateItem;
import com.avito.android.advert.item.description_header.AdvertDetailsDescriptionHeaderItem;
import com.avito.android.advert.item.gig.similar_shifts.AdvertDetailsSimilarShiftsItem;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import com.avito.android.advert_details_items.price.AdvertDetailsPriceItem;
import com.avito.android.advert_details_items.price_discount.PriceWithDiscountItem;
import com.avito.android.advert_details_items.title.AdvertDetailsTitleItem;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.remote.cv_state.CvStateType;
import com.avito.android.serp.adapter.recomendations.ExpandableSectionItem;
import java.util.ArrayList;
import kotlin.Metadata;
import ob.C44744h;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/u1;", "Landroidx/recyclerview/widget/o$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.u1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28214u1 extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f80643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f80644b;

    public C28214u1(ArrayList arrayList, ArrayList arrayList2) {
        this.f80643a = arrayList;
        this.f80644b = arrayList2;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        com.avito.conveyor_item.a aVar = (com.avito.android.serp.adapter.i1) this.f80643a.get(i12);
        com.avito.conveyor_item.a aVar2 = (com.avito.android.serp.adapter.i1) this.f80644b.get(i13);
        if ((aVar instanceof AdvertDetailsGalleryItem) && (aVar2 instanceof AdvertDetailsGalleryItem)) {
            return false;
        }
        if ((aVar instanceof AdvertDetailsTitleItem) && (aVar2 instanceof AdvertDetailsTitleItem)) {
            return kotlin.jvm.internal.L.f(((AdvertDetailsTitleItem) aVar).f85715d, ((AdvertDetailsTitleItem) aVar2).f85715d);
        }
        if ((aVar instanceof AdvertDetailsPriceItem) && (aVar2 instanceof AdvertDetailsPriceItem)) {
            AdvertDetailsPriceItem advertDetailsPriceItem = (AdvertDetailsPriceItem) aVar;
            AdvertDetailsPriceItem advertDetailsPriceItem2 = (AdvertDetailsPriceItem) aVar2;
            if (!kotlin.jvm.internal.L.f(advertDetailsPriceItem.f85140d, advertDetailsPriceItem2.f85140d) || !kotlin.jvm.internal.L.f(advertDetailsPriceItem.f85143g, advertDetailsPriceItem2.f85143g) || !kotlin.jvm.internal.L.f(advertDetailsPriceItem.f85147k, advertDetailsPriceItem2.f85147k)) {
                return false;
            }
        } else {
            if ((aVar instanceof PriceWithDiscountItem) && (aVar2 instanceof PriceWithDiscountItem)) {
                return kotlin.jvm.internal.L.f(((PriceWithDiscountItem) aVar).f85314m, ((PriceWithDiscountItem) aVar2).f85314m);
            }
            if ((aVar instanceof ExpandableSectionItem) && (aVar2 instanceof ExpandableSectionItem)) {
                ExpandableSectionItem expandableSectionItem = (ExpandableSectionItem) aVar;
                ExpandableSectionItem expandableSectionItem2 = (ExpandableSectionItem) aVar2;
                if (expandableSectionItem.f270543e != expandableSectionItem2.f270543e || !kotlin.jvm.internal.L.f(expandableSectionItem.f270546h, expandableSectionItem2.f270546h)) {
                    return false;
                }
            } else if (!(aVar instanceof AdvertDetailsFlatsItem) || !(aVar2 instanceof AdvertDetailsFlatsItem)) {
                if ((aVar instanceof AdvertCvStateItem) && (aVar2 instanceof AdvertCvStateItem)) {
                    AdvertCvStateItem advertCvStateItem = (AdvertCvStateItem) aVar;
                    CvStateType currentState = advertCvStateItem.f75056d.getCurrentState();
                    String slug = currentState != null ? currentState.getSlug() : null;
                    AdvertCvStateItem advertCvStateItem2 = (AdvertCvStateItem) aVar2;
                    CvStateType currentState2 = advertCvStateItem2.f75056d.getCurrentState();
                    if (!kotlin.jvm.internal.L.f(slug, currentState2 != null ? currentState2.getSlug() : null) || advertCvStateItem.f75057e != advertCvStateItem2.f75057e) {
                        return false;
                    }
                } else if ((aVar instanceof AdvertDetailsGapItem) && (aVar2 instanceof AdvertDetailsGapItem)) {
                    if (((AdvertDetailsGapItem) aVar).f83670d != ((AdvertDetailsGapItem) aVar2).f83670d) {
                        return false;
                    }
                } else {
                    if ((aVar instanceof CommercialBannerItem) && (aVar2 instanceof CommercialBannerItem)) {
                        CommercialBanner commercialBanner = ((CommercialBannerItem) aVar).getCommercialBanner();
                        String strA = commercialBanner != null ? C44744h.a(commercialBanner) : null;
                        CommercialBanner commercialBanner2 = ((CommercialBannerItem) aVar2).getCommercialBanner();
                        return kotlin.jvm.internal.L.f(strA, commercialBanner2 != null ? C44744h.a(commercialBanner2) : null);
                    }
                    if ((aVar instanceof TrustFactorsItem) && (aVar2 instanceof TrustFactorsItem)) {
                        return kotlin.jvm.internal.L.f(aVar, aVar2);
                    }
                    if ((aVar instanceof AdvertDetailsPpRecallPromoItem) && (aVar2 instanceof AdvertDetailsPpRecallPromoItem)) {
                        return kotlin.jvm.internal.L.f(aVar, aVar2);
                    }
                    if ((aVar instanceof AdvertDetailsSimilarShiftsItem) && (aVar2 instanceof AdvertDetailsSimilarShiftsItem)) {
                        AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem = (AdvertDetailsSimilarShiftsItem) aVar;
                        AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem2 = (AdvertDetailsSimilarShiftsItem) aVar2;
                        if (!kotlin.jvm.internal.L.f(advertDetailsSimilarShiftsItem.f75766e, advertDetailsSimilarShiftsItem2.f75766e)) {
                            return false;
                        }
                        AdvertDetailsSimilarShiftsItem.SimilarShiftTimeContent similarShiftTimeContent = advertDetailsSimilarShiftsItem.f75767f;
                        String str = similarShiftTimeContent != null ? similarShiftTimeContent.f75773b : null;
                        AdvertDetailsSimilarShiftsItem.SimilarShiftTimeContent similarShiftTimeContent2 = advertDetailsSimilarShiftsItem2.f75767f;
                        if (!kotlin.jvm.internal.L.f(str, similarShiftTimeContent2 != null ? similarShiftTimeContent2.f75773b : null)) {
                            return false;
                        }
                    } else if ((aVar instanceof AdvertDetailsContactBarItem) && (aVar2 instanceof AdvertDetailsContactBarItem)) {
                        AdvertDetailsContactBarItem advertDetailsContactBarItem = (AdvertDetailsContactBarItem) aVar;
                        AdvertDetailsContactBarItem advertDetailsContactBarItem2 = (AdvertDetailsContactBarItem) aVar2;
                        if (!kotlin.jvm.internal.L.f(advertDetailsContactBarItem.f74865g, advertDetailsContactBarItem2.f74865g) || !kotlin.jvm.internal.L.f(advertDetailsContactBarItem.f74864f, advertDetailsContactBarItem2.f74864f)) {
                            return false;
                        }
                    } else if ((aVar instanceof AdvertDetailsDescriptionHeaderItem) && (aVar2 instanceof AdvertDetailsDescriptionHeaderItem)) {
                        AdvertDetailsDescriptionHeaderItem advertDetailsDescriptionHeaderItem = (AdvertDetailsDescriptionHeaderItem) aVar;
                        AdvertDetailsDescriptionHeaderItem advertDetailsDescriptionHeaderItem2 = (AdvertDetailsDescriptionHeaderItem) aVar2;
                        if (!kotlin.jvm.internal.L.f(advertDetailsDescriptionHeaderItem.f75149d, advertDetailsDescriptionHeaderItem2.f75149d) || !kotlin.jvm.internal.L.f(advertDetailsDescriptionHeaderItem.f75150e, advertDetailsDescriptionHeaderItem2.f75150e) || !kotlin.jvm.internal.L.f(advertDetailsDescriptionHeaderItem.f75151f, advertDetailsDescriptionHeaderItem2.f75151f) || ((AdvertDetailsDescriptionHeaderItem) aVar).f75153h != ((AdvertDetailsDescriptionHeaderItem) aVar2).f75153h) {
                            return false;
                        }
                    }
                }
            } else if (((AdvertDetailsFlatsItem) aVar).f84656d.size() != ((AdvertDetailsFlatsItem) aVar2).f84656d.size()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        ArrayList arrayList = this.f80643a;
        com.avito.android.serp.adapter.i1 i1Var = (com.avito.android.serp.adapter.i1) arrayList.get(i12);
        Class<?> cls = arrayList.get(i12).getClass();
        ArrayList arrayList2 = this.f80644b;
        return cls.equals(arrayList2.get(i13).getClass()) && (((com.avito.android.serp.adapter.i1) arrayList.get(i12)).getF85303b() == ((com.avito.android.serp.adapter.i1) arrayList2.get(i13)).getF85303b() || (i1Var instanceof pb.e) || (i1Var instanceof AdvertDetailsDescriptionHeaderItem));
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f80644b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f80643a.size();
    }
}
