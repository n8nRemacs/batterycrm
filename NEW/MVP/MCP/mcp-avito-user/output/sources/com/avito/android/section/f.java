package com.avito.android.section;

import Ag.CallableC13028a;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details.model.images_with_links.Displaying;
import com.avito.android.advert_details.model.images_with_links.ImageWithLinkElement;
import com.avito.android.advert_details.model.images_with_links.ImagesWithLinksElement;
import com.avito.android.advert_details.model.images_with_links.SimpleViewType;
import com.avito.android.favorite_sellers.AdvertDetailsRecommendationItem;
import com.avito.android.favorite_sellers.S;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.recommended_sellers.RecommendedSellerElement;
import com.avito.android.remote.model.recommended_sellers.RecommendedSellersCarousel;
import com.avito.android.remote.model.section.SectionDisplaying;
import com.avito.android.remote.model.section.SectionElement;
import com.avito.android.remote.model.section.SectionGroupTypeElement;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.remote.model.section.SectionTypeItem;
import com.avito.android.remote.model.section.SectionViewType;
import com.avito.android.section.SectionItemConverter;
import com.avito.android.section.chips.SectionChip;
import com.avito.android.section.chips.SectionChipsItem;
import com.avito.android.section.horizontal.adapter.HorizontalSectionAdapterItem;
import com.avito.android.section.horizontal.button.HorizontalSectionButtonItem;
import com.avito.android.section.placeholder.SectionPlaceholderItem;
import com.avito.android.section.skeleton.SectionSkeletonItem;
import com.avito.android.section.title.with_action.SectionTitleWithActionItem;
import com.avito.android.section.title.with_action.redesign.SectionTitleWithActionRedesignItem;
import com.avito.android.section.vertical.adapter.SectionVerticalAdapterItem;
import com.avito.android.section.vertical.button.SectionVerticalButtonItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.images_and_links_item.ImagesWithLinksItem;
import com.avito.android.serp.adapter.n1;
import com.avito.android.serp.adapter.recomendations.ExpandableSectionItem;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41964k1;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: SectionItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/section/f;", "Lcom/avito/android/section/SectionItemConverter;", "a", "b", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements SectionItemConverter {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f264654k = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f264655a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final S f264656b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.images_and_links_item.d f264657c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T f264658d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final n1 f264659e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f264660f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f264661g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.recomendations.j f264662h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f264663i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final PrintableText f264664j = com.avito.android.printable_text.b.c(R.string.united_section_default_title, new Serializable[0]);

    /* compiled from: SectionItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/section/f$a;", "", "<init>", "()V", "", "HORIZONTAL_MAX", "I", "SHOP_COLUMNS_LANDSCAPE", "SHOP_ITEMS_MUST_BE_4", "SHOP_REMOVE_ITEM_INDEX", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k c cVar, @Y61.k S s5, @Y61.k com.avito.android.serp.adapter.images_and_links_item.d dVar, @Y61.k T t12, @Y61.k n1 n1Var, @Y61.k R0 r02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.serp.adapter.recomendations.j jVar) {
        this.f264655a = cVar;
        this.f264656b = s5;
        this.f264657c = dVar;
        this.f264658d = t12;
        this.f264659e = n1Var;
        this.f264660f = r02;
        this.f264661g = interfaceC35745a5;
        this.f264662h = jVar;
        this.f264663i = U.a(r02.d().plus(t1.b()));
    }

    public static HorizontalSectionButtonItem g(f fVar, b bVar) {
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.show_all, new Serializable[0]);
        fVar.getClass();
        T t12 = bVar.f264666c;
        String sectionId = ((SectionTypeItem) t12).getSectionId();
        SectionItemConverter.a aVar = bVar.f264665b;
        return new HorizontalSectionButtonItem(sectionId, aVar.getF264600b(), printableTextC, aVar.m() ? null : ((SectionTypeItem) t12).getAction());
    }

    public static HorizontalSectionAdapterItem h(SectionTypeItem sectionTypeItem, SectionItemConverter.a aVar, List list) {
        return new HorizontalSectionAdapterItem(sectionTypeItem.getSectionId(), L.f(sectionTypeItem.getIsAvailableToHide(), Boolean.TRUE) ? null : sectionTypeItem.getTitle(), sectionTypeItem.getSubtitle(), aVar.getF264600b(), null, sectionTypeItem.getAction(), list, sectionTypeItem.getContext(), sectionTypeItem.getDisplaying(), false, 528, null);
    }

    public static void i(b bVar) {
        SectionItemConverter.a aVar = bVar.f264665b;
        boolean zF2 = L.f(aVar.getF264609k(), Boolean.FALSE);
        T t12 = bVar.f264666c;
        bVar.f264667d.add(zF2 ? new SectionPlaceholderItem(t12.getSectionId(), aVar.getF264600b(), com.avito.android.printable_text.b.c(R.string.section_default_load_failed_retry_text, new Serializable[0]), true) : new SectionPlaceholderItem(t12.getSectionId(), aVar.getF264600b(), com.avito.android.printable_text.b.c(R.string.section_default_not_found_error_text, new Serializable[0]), false));
    }

    public static List j(ExpandableSectionItem expandableSectionItem, List list) {
        if (expandableSectionItem.f270543e) {
            return Collections.singletonList(expandableSectionItem);
        }
        t0 t0Var = new t0(2);
        t0Var.a(expandableSectionItem);
        t0Var.b(list.toArray(new PersistableSpannedItem[0]));
        ArrayList<Object> arrayList = t0Var.f406850a;
        return C42745f0.U(arrayList.toArray(new PersistableSpannedItem[arrayList.size()]));
    }

    public static List k(List list, SectionItemConverter.a aVar) {
        Object next;
        if (!aVar.getF264602d() && aVar.getF264600b() > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PersistableSpannedItem) next).getF264948c() > 1) {
                    break;
                }
            }
            if (next == null) {
                ArrayList arrayList = new ArrayList(list);
                if (aVar.getF264601c() && arrayList.size() == 4 && aVar.getF264600b() == 3) {
                    arrayList.remove(2);
                }
                return arrayList;
            }
        }
        return list;
    }

    public static List l(List list, SectionItemConverter.a aVar, String str) {
        return aVar.getF264603e() ? Collections.singletonList(new SectionVerticalAdapterItem(list, str, aVar.getF264600b(), null, null, 24, null)) : list;
    }

    public static void m(com.avito.android.serp.adapter.recomendations.j jVar, String str, boolean z12) {
        if (jVar.b(str) == null) {
            jVar.a(str, z12);
        }
    }

    public static boolean n(SectionTypeItem sectionTypeItem) {
        SectionDisplaying displaying = sectionTypeItem.getDisplaying();
        return (displaying != null ? displaying.getListViewType() : null) == SectionViewType.VERTICAL;
    }

    public static void p(b bVar, PrintableText printableText, boolean z12, Action action) {
        bVar.f264667d.add(new SectionTitleWithActionRedesignItem(z12 ? PlatformActions.EXPANDABLE : "", bVar.f264665b.getF264600b(), printableText, z12, action));
    }

    public static void q(b bVar) {
        SectionTypeItem sectionTypeItem = (SectionTypeItem) bVar.f264666c;
        bVar.f264667d.add(new SectionTitleWithActionItem(sectionTypeItem.getSectionId(), sectionTypeItem.getTitle(), sectionTypeItem.getSubtitle(), bVar.f264665b.getF264600b(), sectionTypeItem.getAction(), null, false, 96, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0168 -> B:67:0x0169). Please report as a decompilation issue!!! */
    @Override // com.avito.android.section.SectionItemConverter
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.Iterable r18, @Y61.k com.avito.android.section.SectionItemConverter.Params r19, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.section.f.a(java.lang.Iterable, com.avito.android.section.SectionItemConverter$Params, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.section.SectionItemConverter
    @Y61.k
    public final List<PersistableSpannedItem> b(@Y61.k SectionTypeItem sectionTypeItem, boolean z12) {
        List<SectionElement> items = sectionTypeItem.getItems();
        if (items == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayListA = this.f264655a.a(items, sectionTypeItem.getDisplayType(), z12);
        this.f264658d.b(arrayListA);
        this.f264659e.b(arrayListA);
        return arrayListA;
    }

    @Override // com.avito.android.section.SectionItemConverter
    @Y61.k
    public final W c(@Y61.k SectionTypeItem sectionTypeItem, @Y61.k SectionItemConverter.Params params) {
        B0 b0D0 = io.reactivex.rxjava3.core.z.W(new CallableC13028a(27, this, sectionTypeItem)).T(new j(this), Integer.MAX_VALUE).T(new l(this), Integer.MAX_VALUE).d0(new m(this, sectionTypeItem, params));
        C42784z0 c42784z0 = C42784z0.f406748b;
        Objects.requireNonNull(c42784z0, "defaultItem is null");
        return new C41964k1(b0D0, c42784z0).z(this.f264661g.c());
    }

    @Override // com.avito.android.section.SectionItemConverter
    @Y61.k
    public final ArrayList d(@Y61.k ArrayList arrayList, @Y61.k SectionTypeElement sectionTypeElement) {
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SectionTypeElement sectionTypeElement2 = (SectionTypeElement) it.next();
            String sectionId = sectionTypeElement2.getSectionId();
            String title = sectionTypeElement2.getTitle();
            if (title == null) {
                title = "";
            }
            arrayList2.add(new SectionChip(sectionId, null, sectionTypeElement.equals(sectionTypeElement2), title, false, 18, null));
        }
        return arrayList2;
    }

    @Override // com.avito.android.section.SectionItemConverter
    @Y61.l
    public final Object e(@Y61.k SectionTypeElement sectionTypeElement, @Y61.k SectionItemConverter.Params params, @Y61.l SectionTypeElement sectionTypeElement2, @Y61.k ContinuationImpl continuationImpl) {
        if (params.f264611m) {
            return f(sectionTypeElement, params, sectionTypeElement2);
        }
        return C43259k.b(this.f264663i, this.f264660f.d(), new h(this, sectionTypeElement, params, sectionTypeElement2, null), 2).F(continuationImpl);
    }

    public final SectionElementData<?> f(SectionTypeElement sectionTypeElement, SectionItemConverter.Params params, SectionTypeElement sectionTypeElement2) {
        SectionElementData<?> sectionElementData;
        List listSingletonList;
        SectionElementData<?> sectionElementData2;
        List listSingletonList2;
        Boolean boolB;
        SectionTypeElement sectionTypeElementUpdateSection = (sectionTypeElement2 == null || !(sectionTypeElement2 instanceof SectionGroupTypeElement)) ? sectionTypeElement : ((SectionGroupTypeElement) sectionTypeElement2).updateSection(sectionTypeElement);
        if (sectionTypeElementUpdateSection instanceof RedesignUnitedSectionTypeItem) {
            RedesignUnitedSectionTypeItem redesignUnitedSectionTypeItem = (RedesignUnitedSectionTypeItem) sectionTypeElementUpdateSection;
            if (redesignUnitedSectionTypeItem.f264594b.isEmpty()) {
                return new SectionElementData<>(redesignUnitedSectionTypeItem, C42784z0.f406748b);
            }
            b bVar = new b(params, redesignUnitedSectionTypeItem, null, 4, null);
            RedesignUnitedSectionTypeItem redesignUnitedSectionTypeItem2 = (RedesignUnitedSectionTypeItem) bVar.f264666c;
            List<PersistableSpannedItem> listB = b(redesignUnitedSectionTypeItem2.f264595c, params.isRedesign());
            ArrayList arrayList = redesignUnitedSectionTypeItem2.f264594b;
            int size = arrayList.size();
            PrintableText printableText = this.f264664j;
            List<PersistableSpannedItem> list = bVar.f264667d;
            SectionItemConverter.a aVar = bVar.f264665b;
            if (size > 1) {
                p(bVar, printableText, true, null);
                list.add(new SectionChipsItem(aVar.getF264600b(), "", d(arrayList, redesignUnitedSectionTypeItem2.f264595c)));
            } else {
                p(bVar, printableText, listB.size() > aVar.c(), null);
            }
            o(new b<>(aVar, redesignUnitedSectionTypeItem2.f264595c, list), listB);
            return new SectionElementData<>(redesignUnitedSectionTypeItem, list);
        }
        boolean z12 = sectionTypeElementUpdateSection instanceof SectionTypeItem;
        com.avito.android.serp.adapter.recomendations.j jVar = this.f264662h;
        if (!z12) {
            if (sectionTypeElementUpdateSection instanceof RecommendedSellersCarousel) {
                RecommendedSellersCarousel recommendedSellersCarousel = (RecommendedSellersCarousel) sectionTypeElementUpdateSection;
                String str = "recommendation_carousel:" + UUID.randomUUID();
                List<RecommendedSellerElement> items = recommendedSellersCarousel.getItems();
                List listA = items != null ? this.f264656b.a(str, items) : C42784z0.f406748b;
                Boolean isAvailableToHide = recommendedSellersCarousel.getIsAvailableToHide();
                Boolean bool = Boolean.TRUE;
                AdvertDetailsRecommendationItem advertDetailsRecommendationItem = new AdvertDetailsRecommendationItem(str, listA, L.f(isAvailableToHide, bool) ? null : recommendedSellersCarousel.getTitle(), params.f264600b, null, 16, null);
                if (L.f(recommendedSellersCarousel.getIsAvailableToHide(), bool)) {
                    String title = recommendedSellersCarousel.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    m(jVar, title, true);
                    String title2 = recommendedSellersCarousel.getTitle();
                    String str2 = title2 == null ? "" : title2;
                    String f264597e = recommendedSellersCarousel.getF264597e();
                    String title3 = recommendedSellersCarousel.getTitle();
                    Boolean boolB2 = jVar.b(title3 != null ? title3 : "");
                    listSingletonList2 = j(new ExpandableSectionItem(params.f264600b, str2, f264597e, boolB2 != null ? boolB2.booleanValue() : true, params.f264604f, recommendedSellersCarousel.getF264596d(), Collections.singletonList(advertDetailsRecommendationItem), params.f264605g), Collections.singletonList(advertDetailsRecommendationItem));
                } else {
                    listSingletonList2 = Collections.singletonList(advertDetailsRecommendationItem);
                }
                sectionElementData2 = new SectionElementData<>(sectionTypeElementUpdateSection, listSingletonList2);
            } else if (sectionTypeElementUpdateSection instanceof ImagesWithLinksElement) {
                ImagesWithLinksElement imagesWithLinksElement = (ImagesWithLinksElement) sectionTypeElementUpdateSection;
                String str3 = "images_with_links:" + UUID.randomUUID();
                List<ImageWithLinkElement> items2 = imagesWithLinksElement.getItems();
                boolean z13 = (items2 != null ? items2.size() : 0) > 2;
                List<ImageWithLinkElement> items3 = imagesWithLinksElement.getItems();
                List listA2 = items3 != null ? this.f264657c.a(items3, z13) : C42784z0.f406748b;
                Boolean isAvailableToHide2 = imagesWithLinksElement.getIsAvailableToHide();
                Boolean bool2 = Boolean.TRUE;
                ImagesWithLinksItem imagesWithLinksItem = new ImagesWithLinksItem(L.f(isAvailableToHide2, bool2) ? null : imagesWithLinksElement.getTitle(), params.f264600b, str3, listA2, imagesWithLinksElement.getDisplaying(), z13);
                Displaying displaying = imagesWithLinksElement.getDisplaying();
                if ((displaying != null ? displaying.getListViewType() : null) == SimpleViewType.VERTICAL) {
                    listSingletonList = C42784z0.f406748b;
                } else if (L.f(imagesWithLinksElement.getIsAvailableToHide(), bool2)) {
                    Boolean isCollapsed = imagesWithLinksElement.getIsCollapsed();
                    zBooleanValue = isCollapsed != null ? isCollapsed.booleanValue() : true;
                    String title4 = imagesWithLinksElement.getTitle();
                    if (title4 == null) {
                        title4 = "";
                    }
                    m(jVar, title4, zBooleanValue);
                    String title5 = imagesWithLinksElement.getTitle();
                    String str4 = title5 == null ? "" : title5;
                    String str5 = imagesWithLinksElement.f84420c;
                    String title6 = imagesWithLinksElement.getTitle();
                    Boolean boolB3 = jVar.b(title6 != null ? title6 : "");
                    if (boolB3 != null) {
                        zBooleanValue = boolB3.booleanValue();
                    }
                    listSingletonList = j(new ExpandableSectionItem(params.f264600b, str4, str5, zBooleanValue, params.f264604f, imagesWithLinksElement.f84419b, Collections.singletonList(imagesWithLinksItem), params.f264605g), Collections.singletonList(imagesWithLinksItem));
                } else {
                    listSingletonList = Collections.singletonList(imagesWithLinksItem);
                }
                sectionElementData2 = new SectionElementData<>(sectionTypeElementUpdateSection, listSingletonList);
            } else {
                sectionElementData = new SectionElementData<>(sectionTypeElementUpdateSection, C42784z0.f406748b);
            }
            return sectionElementData2;
        }
        SectionTypeItem sectionTypeItem = (SectionTypeItem) sectionTypeElementUpdateSection;
        List<PersistableSpannedItem> listB2 = b(sectionTypeItem, params.isRedesign());
        if (params.isRedesign()) {
            int iC2 = params.c();
            if (listB2.size() > iC2) {
                listB2 = listB2.subList(0, iC2);
            }
            b<SectionTypeItem> bVar2 = new b<>(params, sectionTypeItem, null, 4, null);
            boolean zM2 = bVar2.f264665b.m();
            T t12 = bVar2.f264666c;
            if (zM2) {
                String title7 = ((SectionTypeItem) t12).getTitle();
                p(bVar2, com.avito.android.printable_text.b.f(title7 != null ? title7 : ""), true, null);
            } else {
                SectionTypeItem sectionTypeItem2 = (SectionTypeItem) t12;
                String title8 = sectionTypeItem2.getTitle();
                p(bVar2, com.avito.android.printable_text.b.f(title8 != null ? title8 : ""), sectionTypeItem2.getAction() != null, sectionTypeItem2.getAction());
            }
            o(bVar2, listB2);
            return new SectionElementData<>(sectionTypeItem, bVar2.f264667d);
        }
        if (L.f(sectionTypeItem.getIsAvailableToHide(), Boolean.TRUE)) {
            b bVar3 = new b(params, sectionTypeItem, null, 4, null);
            SectionTypeItem sectionTypeItem3 = (SectionTypeItem) bVar3.f264666c;
            String title9 = sectionTypeItem3.getTitle();
            if (title9 == null) {
                title9 = "";
            }
            String sectionId = sectionTypeItem3.getSectionId();
            SectionItemConverter.a aVar2 = bVar3.f264665b;
            List listSingletonList3 = Collections.singletonList(new SectionSkeletonItem(sectionId, aVar2.getF264600b()));
            if (!aVar2.f()) {
                if (!listB2.isEmpty()) {
                    Boolean boolB4 = jVar.b(title9);
                    zBooleanValue = (boolB4 == null && (boolB4 = sectionTypeItem3.getIsCollapsed()) == null) ? true : boolB4.booleanValue();
                    listSingletonList3 = n(sectionTypeItem3) ? l(k(listB2, aVar2), aVar2, sectionTypeItem3.getSectionId()) : Collections.singletonList(h(sectionTypeItem3, aVar2, listB2));
                } else if (aVar2.getF264610l() && ((boolB = jVar.b(title9)) != null || (boolB = sectionTypeItem3.getIsCollapsed()) != null)) {
                    zBooleanValue = boolB.booleanValue();
                }
            }
            ExpandableSectionItem expandableSectionItem = new ExpandableSectionItem(aVar2.getF264600b(), title9, sectionTypeItem3.getF264597e(), zBooleanValue, aVar2.getF264604f(), sectionTypeItem3.getSectionId(), listSingletonList3, aVar2.getF264605g());
            List<PersistableSpannedItem> list2 = bVar3.f264667d;
            list2.add(expandableSectionItem);
            if (!zBooleanValue) {
                list2.addAll(listSingletonList3);
            }
            sectionElementData = new SectionElementData<>(sectionTypeItem, list2);
        } else if (params.f() || (listB2.isEmpty() && !params.f264610l)) {
            sectionElementData = new SectionElementData<>(sectionTypeItem, C42784z0.f406748b);
        } else {
            b bVar4 = new b(params, sectionTypeItem, null, 4, null);
            boolean zIsEmpty = listB2.isEmpty();
            SectionItemConverter.a aVar3 = bVar4.f264665b;
            T t13 = bVar4.f264666c;
            List<PersistableSpannedItem> list3 = bVar4.f264667d;
            if (zIsEmpty) {
                q(bVar4);
                list3.add(new SectionSkeletonItem(t13.getSectionId(), aVar3.getF264600b()));
            } else {
                SectionTypeItem sectionTypeItem4 = (SectionTypeItem) t13;
                if (n(sectionTypeItem4)) {
                    q(bVar4);
                    list3.addAll(l(k(listB2, aVar3), aVar3, sectionTypeItem4.getSectionId()));
                } else {
                    list3.add(h(sectionTypeItem4, aVar3, listB2));
                }
            }
            sectionElementData = new SectionElementData<>(sectionTypeItem, list3);
        }
        return sectionElementData;
    }

    public final void o(b<SectionTypeItem> bVar, List<? extends PersistableSpannedItem> list) {
        List<? extends PersistableSpannedItem> listI0;
        List<? extends PersistableSpannedItem> list2 = list;
        boolean zIsEmpty = list2.isEmpty();
        List<PersistableSpannedItem> list3 = bVar.f264667d;
        T t12 = bVar.f264666c;
        SectionItemConverter.a aVar = bVar.f264665b;
        if (zIsEmpty) {
            if (aVar.f()) {
                i(bVar);
                return;
            } else if (aVar.getF264610l()) {
                list3.add(new SectionSkeletonItem(t12.getSectionId(), aVar.getF264600b()));
                return;
            } else {
                i(bVar);
                return;
            }
        }
        int i12 = 0;
        if (aVar.getF264607i() == SectionViewType.VERTICAL) {
            SectionTypeItem sectionTypeItem = (SectionTypeItem) t12;
            list3.addAll(l(k(list, aVar), aVar, sectionTypeItem.getSectionId()));
            Action action = sectionTypeItem.getAction();
            if (action != null) {
                list3.add(new SectionVerticalButtonItem(sectionTypeItem.getSectionId(), aVar.getF264600b(), com.avito.android.printable_text.b.c(R.string.show_more, new Serializable[0]), action));
                return;
            }
            return;
        }
        if (!aVar.m() || list.size() <= aVar.c()) {
            listI0 = aVar.getF264607i() == SectionViewType.HORIZONTAL ? C42745f0.i0(g(this, bVar), list2) : list;
        } else {
            int iC2 = aVar.c() + 1;
            ArrayList arrayList = new ArrayList(iC2);
            while (i12 < iC2) {
                arrayList.add(i12 < aVar.c() ? (PersistableSpannedItem) list.get(i12) : g(this, bVar));
                i12++;
            }
            listI0 = arrayList;
        }
        list3.add(new HorizontalSectionAdapterItem(((SectionTypeItem) t12).getSectionId(), null, null, aVar.getF264600b(), null, null, listI0, null, null, true, 16, null));
    }

    /* compiled from: SectionItemConverter.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/section/f$b;", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "T", "Lcom/avito/android/section/SectionItemConverter$a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<T extends SectionTypeElement> implements SectionItemConverter.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SectionItemConverter.a f264665b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final T f264666c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<PersistableSpannedItem> f264667d;

        public b(@Y61.k SectionItemConverter.a aVar, @Y61.k T t12, @Y61.k List<PersistableSpannedItem> list) {
            this.f264665b = aVar;
            this.f264666c = t12;
            this.f264667d = list;
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        public final int c() {
            return this.f264665b.c();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        @Y61.l
        /* renamed from: d */
        public final Boolean getF264609k() {
            return this.f264665b.getF264609k();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: e */
        public final boolean getF264603e() {
            return this.f264665b.getF264603e();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        public final boolean f() {
            return this.f264665b.f();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        @Y61.l
        /* renamed from: g */
        public final SectionViewType getF264607i() {
            return this.f264665b.getF264607i();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: h */
        public final boolean getF264604f() {
            return this.f264665b.getF264604f();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: i */
        public final boolean getF264602d() {
            return this.f264665b.getF264602d();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: j */
        public final boolean getF264610l() {
            return this.f264665b.getF264610l();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: k */
        public final boolean getF264605g() {
            return this.f264665b.getF264605g();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: l */
        public final boolean getF264601c() {
            return this.f264665b.getF264601c();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        public final boolean m() {
            return this.f264665b.m();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: n */
        public final int getF264600b() {
            return this.f264665b.getF264600b();
        }

        public /* synthetic */ b(SectionItemConverter.a aVar, SectionTypeElement sectionTypeElement, List list, int i12, C42822w c42822w) {
            this(aVar, sectionTypeElement, (i12 & 4) != 0 ? new ArrayList() : list);
        }
    }
}
