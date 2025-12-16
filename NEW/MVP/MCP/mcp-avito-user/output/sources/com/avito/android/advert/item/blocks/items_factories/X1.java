package com.avito.android.advert.item.blocks.items_factories;

import android.content.res.Resources;
import android.text.format.DateUtils;
import com.avito.android.R;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.advert.item.gig.documents.GigPersonalInfoItem;
import com.avito.android.advert.item.gig.duties.AdvertDetailsDutiesItem;
import com.avito.android.advert.item.gig.seller.AdvertDetailsGigSellerItem;
import com.avito.android.advert.item.gig.similar_shifts.AdvertDetailsSimilarShiftsItem;
import com.avito.android.advert_details_items.price.AdvertDetailsPriceItem;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentStatus;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.gig.Event;
import com.avito.android.remote.model.gig.GigNavigationItem;
import com.avito.android.remote.model.gig.GigSeller;
import com.avito.android.remote.model.gig.GigShift;
import com.avito.android.remote.model.gig.GigShiftAction;
import com.avito.android.remote.model.gig.GigShiftDocument;
import com.avito.android.remote.model.gig.GigShiftDocumentStatus;
import com.avito.android.remote.model.gig.GigShiftItem;
import com.avito.android.remote.model.gig.GigShiftPersonalInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsGigItemsFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/X1;", "Lcom/avito/android/advert/item/blocks/items_factories/W1;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X1 implements W1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73877a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.B2 f73878b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f73879c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Resources f73880d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Locale f73881e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_snippet.a f73882f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f73883g;

    /* compiled from: AdvertDetailsGigItemsFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/X1$a;", "", "<init>", "()V", "", "MINUTES_IN_HOUR", "I", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailsGigItemsFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73884a;

        static {
            int[] iArr = new int[GigShiftDocumentStatus.values().length];
            try {
                iArr[GigShiftDocumentStatus.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GigShiftDocumentStatus.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GigShiftDocumentStatus.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GigShiftDocumentStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GigShiftDocumentStatus.EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GigShiftDocumentStatus.DISABLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f73884a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public X1(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.B2 b22, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k Resources resources, @Y61.k Locale locale, @Y61.k com.avito.android.gig_snippet.a aVar) {
        this.f73877a = jVar;
        this.f73878b = b22;
        this.f73879c = xVar;
        this.f73880d = resources;
        this.f73881e = locale;
        this.f73882f = aVar;
        this.f73883g = new SimpleDateFormat("EE d", locale);
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.W1
    @Y61.l
    public final AdvertDetailsSimilarShiftsItem a(@Y61.k AdvertDetails advertDetails, @Y61.l AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem, @Y61.l String str, @Y61.l String str2, boolean z12, boolean z13) throws Resources.NotFoundException {
        List<GigNavigationItem> list;
        String string;
        String str3;
        X1 x12 = this;
        GigShiftItem gigShift = advertDetails.getGigShift();
        List<GigNavigationItem> navigation2 = gigShift != null ? gigShift.getNavigation() : null;
        if (!advertDetails.isGigItem() || (list = navigation2) == null || list.isEmpty()) {
            return null;
        }
        String date = str == null ? advertDetailsSimilarShiftsItem != null ? advertDetailsSimilarShiftsItem.f75766e : null : str;
        int i12 = 0;
        GigNavigationItem gigNavigationItem = navigation2.get(0);
        int iA2 = x12.f73877a.a();
        List<GigNavigationItem> list2 = navigation2;
        int i13 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            GigNavigationItem gigNavigationItem2 = (GigNavigationItem) it.next();
            String date2 = gigNavigationItem2.getDate();
            String date3 = gigNavigationItem2.getDate();
            com.avito.android.gig_snippet.a aVar = x12.f73882f;
            Date dateD = aVar.d(date3);
            if (dateD == null) {
                str3 = "";
            } else {
                boolean zIsToday = DateUtils.isToday(dateD.getTime());
                Resources resources = x12.f73880d;
                if (zIsToday) {
                    string = resources.getString(R.string.advert_details_gig_today);
                } else if (DateUtils.isToday(dateD.getTime() - 86400000)) {
                    string = resources.getString(R.string.advert_details_gig_tomorrow);
                } else {
                    string = x12.f73883g.format(dateD);
                    if (string.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        char cCharAt = string.charAt(i12);
                        sb2.append((Object) (Character.isLowerCase(cCharAt) ? C43044a.f(cCharAt, x12.f73881e) : String.valueOf(cCharAt)));
                        sb2.append(string.substring(1));
                        string = sb2.toString();
                    }
                }
                str3 = string;
            }
            List<GigShift> shifts = gigNavigationItem2.getShifts();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(shifts, i13));
            Iterator it2 = shifts.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                GigShift gigShift2 = (GigShift) next;
                String strValueOf = String.valueOf(gigShift2.getShiftID());
                Iterator it3 = it;
                Iterator it4 = it2;
                String strB = aVar.b(gigShift2.getStartTime(), gigShift2.getEndTime(), gigShift2.getTotalPrice());
                Long lC2 = aVar.c(gigShift2.getStartTime());
                arrayList2.add(new AdvertDetailsSimilarShiftsItem.SimilarShiftTimeContent(strValueOf, strB, lC2 != null ? lC2.longValue() : 0L, (str2 == null || z13) ? i14 == 0 : str2.equals(strValueOf), gigShift2.getTotalPrice(), gigShift2.getDurationMinutes(), gigShift2.getPricePerHour(), gigShift2.getAction().getTitle(), gigShift2.getAction().getUri(), gigShift2.getHotShift()));
                i14 = i15;
                it = it3;
                it2 = it4;
            }
            arrayList.add(new AdvertDetailsSimilarShiftsItem.SimilarShiftDaysContent(date2, str3, arrayList2, z12));
            x12 = this;
            it = it;
            i12 = 0;
            i13 = 10;
        }
        if (date == null) {
            date = gigNavigationItem.getDate();
        }
        return new AdvertDetailsSimilarShiftsItem(iA2, null, arrayList, date, 2, null);
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.W1
    @Y61.l
    public final AdvertDetailsContactBarItem b(@Y61.l AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem) {
        AdvertDetailsSimilarShiftsItem.SimilarShiftTimeContent similarShiftTimeContent = advertDetailsSimilarShiftsItem != null ? advertDetailsSimilarShiftsItem.f75767f : null;
        if (similarShiftTimeContent != null) {
            return new AdvertDetailsContactBarItem(0L, null, null, null, Collections.singletonList(new ContactBar.Button.Action(similarShiftTimeContent.f75780i, null, R.color.legacy_black, this.f73879c.b(similarShiftTimeContent.f75781j), false, ContactBar.Button.Action.Type.f125066j, false, null, false, false, false, false, null, null, null, Long.valueOf(similarShiftTimeContent.f75775d), false, null, false, null, 1015744, null)), null, null, true, false, null, this.f73877a.a(), null, null, 7023, null);
        }
        return null;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.W1
    @Y61.l
    public final AdvertDetailsPriceItem c(@Y61.l AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem) {
        AdvertDetailsSimilarShiftsItem.SimilarShiftTimeContent similarShiftTimeContent = advertDetailsSimilarShiftsItem != null ? advertDetailsSimilarShiftsItem.f75767f : null;
        if (similarShiftTimeContent == null) {
            return null;
        }
        int iB2 = kotlin.math.b.b(similarShiftTimeContent.f75778g / 60);
        Object[] objArr = {Integer.valueOf(iB2)};
        Resources resources = this.f73880d;
        return new AdvertDetailsPriceItem(0L, null, resources.getString(R.string.advert_details_gig_price_title, similarShiftTimeContent.f75777f, resources.getQuantityString(R.plurals.advert_details_gig_hours, iB2, objArr), similarShiftTimeContent.f75779h), null, null, null, null, null, false, null, null, false, false, false, true, false, false, null, this.f73877a.a(), null, null, 1816707, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[PHI: r3
  0x00c8: PHI (r3v3 boolean) = (r3v10 boolean), (r3v11 boolean) binds: [B:46:0x00c6, B:42:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    @Override // com.avito.android.advert.item.blocks.items_factories.W1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert_core.map.AdvertMapItem d(@Y61.k com.avito.android.remote.model.AdvertDetails r32, @Y61.l java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.items_factories.X1.d(com.avito.android.remote.model.AdvertDetails, java.lang.String):com.avito.android.advert_core.map.AdvertMapItem");
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.W1
    @Y61.l
    public final GigPersonalInfoItem e(@Y61.k AdvertDetails advertDetails) {
        GigShiftPersonalInfo personalInfo;
        List list;
        DocumentStatus documentStatus;
        ParametrizedClickStreamEvent parametrizedClickStreamEvent;
        String uri;
        DocumentStatus documentStatus2;
        GigShiftItem gigShift = advertDetails.getGigShift();
        if (gigShift == null || (personalInfo = gigShift.getPersonalInfo()) == null) {
            return null;
        }
        int iA2 = this.f73877a.a();
        String title = personalInfo.getTitle();
        List<GigShiftDocument> items = personalInfo.getItems();
        if (items != null) {
            List<GigShiftDocument> list2 = items;
            List arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (GigShiftDocument gigShiftDocument : list2) {
                String title2 = gigShiftDocument.getTitle();
                String description = gigShiftDocument.getDescription();
                String str = description == null ? "" : description;
                GigShiftDocumentStatus status = gigShiftDocument.getStatus();
                if (status != null) {
                    switch (b.f73884a[status.ordinal()]) {
                        case 1:
                            documentStatus2 = DocumentStatus.f125595b;
                            break;
                        case 2:
                            documentStatus2 = DocumentStatus.f125596c;
                            break;
                        case 3:
                            documentStatus2 = DocumentStatus.f125597d;
                            break;
                        case 4:
                            documentStatus2 = DocumentStatus.f125598e;
                            break;
                        case 5:
                            documentStatus2 = DocumentStatus.f125599f;
                            break;
                        case 6:
                            documentStatus2 = DocumentStatus.f125600g;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    documentStatus = documentStatus2;
                } else {
                    documentStatus = null;
                }
                GigShiftAction action = gigShiftDocument.getAction();
                DeepLink deepLinkB = (action == null || (uri = action.getUri()) == null) ? null : this.f73879c.b(uri);
                Event event = gigShiftDocument.getEvent();
                if (event != null) {
                    String id2 = advertDetails.getId();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(event.getParameters());
                    linkedHashMap.put("business_platform", "3");
                    if (id2 == null) {
                        id2 = "";
                    }
                    linkedHashMap.put("iid", id2);
                    linkedHashMap.put("from_page", "");
                    parametrizedClickStreamEvent = new ParametrizedClickStreamEvent((int) event.getId(), (int) event.getVersion(), linkedHashMap, null, 8, null);
                } else {
                    parametrizedClickStreamEvent = null;
                }
                arrayList.add(new DocumentButtonItem(title2, str, documentStatus, deepLinkB, parametrizedClickStreamEvent, null, 32, null));
            }
            list = arrayList;
        } else {
            list = C42784z0.f406748b;
        }
        return new GigPersonalInfoItem(iA2, null, title, list, 2, null);
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.W1
    @Y61.l
    public final AdvertDetailsGigSellerItem f(@Y61.k AdvertDetails advertDetails) throws Resources.NotFoundException {
        GigSeller seller;
        GigShiftItem gigShift = advertDetails.getGigShift();
        String quantityString = null;
        if (gigShift == null || (seller = gigShift.getSeller()) == null) {
            return null;
        }
        Integer count = seller.getCount();
        if (count != null && count.intValue() > 0) {
            quantityString = this.f73880d.getQuantityString(R.plurals.advert_details_shift_count, count.intValue(), count);
        }
        return new AdvertDetailsGigSellerItem(this.f73877a.a(), null, seller.getName(), quantityString, seller.getAvatar().getUrl(), 2, null);
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.W1
    @Y61.l
    public final AdvertDetailsDutiesItem g(@Y61.k AdvertDetails advertDetails) {
        GigShiftItem gigShift;
        List<String> duties;
        GigShiftItem gigShift2 = advertDetails.getGigShift();
        List<String> duties2 = gigShift2 != null ? gigShift2.getDuties() : null;
        if (duties2 == null || duties2.isEmpty() || (gigShift = advertDetails.getGigShift()) == null || (duties = gigShift.getDuties()) == null) {
            return null;
        }
        int iA2 = this.f73877a.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : duties) {
            if (!C43066x.K((String) obj)) {
                arrayList.add(obj);
            }
        }
        return new AdvertDetailsDutiesItem(iA2, null, arrayList, 2, null);
    }
}
