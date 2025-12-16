package com.avito.android.user_advert.advert;

import com.avito.android.C29640d;
import com.avito.android.C30566f2;
import com.avito.android.N2;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.analytics.body_condition.FromPage;
import com.avito.android.advert_core.block_header.BlockHeaderItem;
import com.avito.android.advert_core.body_condition.AdvertDetailsCarBodyConditionItem;
import com.avito.android.advert_core.divider.AdvertDetailsDividerItem;
import com.avito.android.advert_core.domoteka_report_teaser.AdvertDetailsDomotekaReportTeaserItem;
import com.avito.android.advert_core.equipments.redesign.EquipmentsItem;
import com.avito.android.advert_core.equipments.redesign.Page;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.advert_core.feature_teasers.common.AdvertDetailsFeatureTeaserItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.advert_core.service_education.ServiceEducationItem;
import com.avito.android.advert_core.service_education.ServiceEducationValue;
import com.avito.android.advert_details_items.imv_v4_cars.ImvCarsData;
import com.avito.android.advert_details_items.imv_v4_cars.ImvCarsV4Item;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdvertEquipments;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.AdvertSellerShortTermRent;
import com.avito.android.remote.model.AnonymousNumber;
import com.avito.android.remote.model.CarMarketPrice;
import com.avito.android.remote.model.CheckInRules;
import com.avito.android.remote.model.ExpandItemsButton;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.remote.model.PriceRanges;
import com.avito.android.remote.model.Range;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.remote.model.VerificationStatus;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.adverts.PromoBlockData;
import com.avito.android.remote.model.domoteka_report_teaser.DomotekaReportTeaser;
import com.avito.android.remote.model.feature_teaser.AdvertDetailsFeaturesTeasers;
import com.avito.android.remote.model.feature_teaser.ApartmentFeature;
import com.avito.android.remote.model.feature_teaser.SafeShow;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.service_education.ServiceEducation;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import com.avito.android.user_advert.advert.items.number.a;
import com.avito.android.user_advert.advert.items.parameters.MyAdvertParameterItem;
import com.avito.android.user_advert.advert.items.safe_deal_services.c;
import com.avito.android.util.C35809h6;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.O2;
import gj.InterfaceC40691b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import tz.InterfaceC48743a;

/* compiled from: MyAdvertDetailsConverter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/N;", "Lcom/avito/android/user_advert/advert/M;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class N implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final hJ.i f308371a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final hJ.e f308372b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final hJ.h f308373c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f308374d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final N2 f308375e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C29640d f308376f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Z0 f308377g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35373a f308378h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f308379i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.feature_teasers.common.b f308380j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.price_list.converter.a f308381k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.groupable_item.f f308382l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final AK0.l f308383m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_persistence.b f308384n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f308385o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.mapping.checker.c f308386p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_advert.advert.delegate.multi_urgency.a f308387q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_advert.advert.delegate.multi_items.a f308388r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final C30566f2 f308389s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48743a f308390t;

    /* compiled from: MyAdvertDetailsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f308391a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f308392b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f308393c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f308394d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f308395e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f308396f;

        static {
            int[] iArr = new int[MyAdvertDetails.ContactsBbl.HistoryData.BannerColor.values().length];
            try {
                iArr[MyAdvertDetails.ContactsBbl.HistoryData.BannerColor.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyAdvertDetails.ContactsBbl.HistoryData.BannerColor.WARMGRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f308391a = iArr;
            int[] iArr2 = new int[MyAdvertDetails.Style.values().length];
            try {
                iArr2[MyAdvertDetails.Style.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MyAdvertDetails.Style.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MyAdvertDetails.Style.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MyAdvertDetails.Style.DANGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f308392b = iArr2;
            int[] iArr3 = new int[VerificationStatus.values().length];
            try {
                iArr3[VerificationStatus.OFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[VerificationStatus.CHECKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[VerificationStatus.APPROVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[VerificationStatus.RETRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f308393c = iArr3;
            int[] iArr4 = new int[MyAdvertDetails.Portfolio.WidgetType.values().length];
            try {
                iArr4[MyAdvertDetails.Portfolio.WidgetType.FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[MyAdvertDetails.Portfolio.WidgetType.FILLED_REDESIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f308394d = iArr4;
            int[] iArr5 = new int[MyAdvertDetails.ServiceBookingReminderBlock.SbReminderStyle.values().length];
            try {
                iArr5[MyAdvertDetails.ServiceBookingReminderBlock.SbReminderStyle.WARMGRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[MyAdvertDetails.ServiceBookingReminderBlock.SbReminderStyle.ORANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[MyAdvertDetails.ServiceBookingReminderBlock.SbReminderStyle.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            f308395e = iArr5;
            int[] iArr6 = new int[MyAdvertDetails.ServiceBookingReminderBlock.SbReminderAction.ActionStyle.values().length];
            try {
                iArr6[MyAdvertDetails.ServiceBookingReminderBlock.SbReminderAction.ActionStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[MyAdvertDetails.ServiceBookingReminderBlock.SbReminderAction.ActionStyle.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            f308396f = iArr6;
        }
    }

    @Inject
    public N(@Y61.k hJ.i iVar, @Y61.k hJ.e eVar, @Y61.k hJ.h hVar, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k N2 n22, @Y61.k C29640d c29640d, @Y61.k com.avito.android.Z0 z02, @Y61.k InterfaceC35373a interfaceC35373a, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.advert_core.feature_teasers.common.b bVar, @Y61.k com.avito.android.advert_core.price_list.converter.a aVar, @Y61.k com.avito.android.lib.util.groupable_item.f fVar, @Y61.k AK0.l lVar, @Y61.k com.avito.android.service_booking_persistence.b bVar2, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.deeplink_handler.mapping.checker.c cVar, @Y61.k com.avito.android.user_advert.advert.delegate.multi_urgency.a aVar2, @Y61.k com.avito.android.user_advert.advert.delegate.multi_items.a aVar3, @Y61.k C30566f2 c30566f2, @Y61.k InterfaceC48743a interfaceC48743a) {
        this.f308371a = iVar;
        this.f308372b = eVar;
        this.f308373c = hVar;
        this.f308374d = interfaceC35863o4;
        this.f308375e = n22;
        this.f308376f = c29640d;
        this.f308377g = z02;
        this.f308378h = interfaceC35373a;
        this.f308379i = xVar;
        this.f308380j = bVar;
        this.f308381k = aVar;
        this.f308382l = fVar;
        this.f308383m = lVar;
        this.f308384n = bVar2;
        this.f308385o = interfaceC40691b;
        this.f308386p = cVar;
        this.f308387q = aVar2;
        this.f308388r = aVar3;
        this.f308389s = c30566f2;
        this.f308390t = interfaceC48743a;
    }

    public static AdvertDetailsCarBodyConditionItem e(MyAdvertDetailsItem myAdvertDetailsItem) {
        BodyCondition bodyCondition = myAdvertDetailsItem.f309172w0;
        if (bodyCondition == null) {
            return null;
        }
        return new AdvertDetailsCarBodyConditionItem(0L, null, bodyCondition, myAdvertDetailsItem.f309129b, FromPage.f82801d, null, 0, null, 163, null);
    }

    public static EquipmentsItem g(MyAdvertDetailsItem myAdvertDetailsItem) {
        AdvertEquipments equipments;
        AdvertParameters advertParameters = myAdvertDetailsItem.f309092G;
        if (advertParameters == null || (equipments = advertParameters.getEquipments()) == null) {
            return null;
        }
        return new EquipmentsItem(0L, null, equipments, Page.f83477d, myAdvertDetailsItem.f309129b, null, 1, null, null, 419, null);
    }

    public static AdvertDetailsGapItem i(int i12) {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsGapItem(52, null, i12, 0, null, null, 50, null);
    }

    public static List j(MyAdvertDetailsItem myAdvertDetailsItem) {
        PriceRanges priceRanges;
        List<Range> ranges;
        CarMarketPrice carMarketPrice = myAdvertDetailsItem.f309152m0;
        if (carMarketPrice == null || (priceRanges = carMarketPrice.getPriceRanges()) == null || (ranges = priceRanges.getRanges()) == null || ranges.isEmpty()) {
            return null;
        }
        return C42745f0.U(new AdvertDetailsDividerItem(0L, null, 24, 24, 0, null, null, 0, 99, null), new ImvCarsV4Item(0L, null, new ImvCarsData(priceRanges.getTitle(), priceRanges.getDisclaimer(), priceRanges.getSubtitle(), priceRanges.getDetails()), priceRanges.getRanges(), myAdvertDetailsItem.f309129b, 0, null, null, 195, null));
    }

    public static com.avito.android.phone_protection_info.item.b w(MyAdvertDetailsItem myAdvertDetailsItem) {
        if (kotlin.jvm.internal.L.f(myAdvertDetailsItem.f309177z, Boolean.TRUE)) {
            return new com.avito.android.phone_protection_info.item.b(null, null, 3, null);
        }
        return null;
    }

    public static ServiceEducationItem z(MyAdvertDetailsItem myAdvertDetailsItem) {
        AdvertParameters advertParameters;
        ServiceEducation serviceEducation;
        if (myAdvertDetailsItem == null || (advertParameters = myAdvertDetailsItem.f309092G) == null || (serviceEducation = advertParameters.getServiceEducation()) == null) {
            return null;
        }
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        String strValueOf = String.valueOf(156);
        PrintableText printableTextF = serviceEducation.getTitle() != null ? com.avito.android.printable_text.b.f(String.valueOf(serviceEducation.getTitle())) : null;
        List<ServiceEducation.ServiceEducationValue> values = serviceEducation.getValues();
        ArrayList arrayList = new ArrayList(C42745f0.q(values, 10));
        for (ServiceEducation.ServiceEducationValue serviceEducationValue : values) {
            arrayList.add(new ServiceEducationValue(String.valueOf(serviceEducationValue.hashCode()), serviceEducationValue.getInstitution(), serviceEducationValue.getSpeciality(), serviceEducationValue.getYear()));
        }
        return new ServiceEducationItem(strValueOf, 1, myAdvertDetailsItem.f309129b, printableTextF, arrayList, false, true, true);
    }

    public final ExpandItemsButtonItem A(String str, String str2, ArrayList arrayList) {
        return new ExpandItemsButtonItem(this.f308374d.a().hashCode(), null, 0, null, null, str, str2, arrayList, null, null, false, false, 3866, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023f  */
    @Override // com.avito.android.user_advert.advert.M
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem a(@Y61.k com.avito.android.remote.model.adverts.MyAdvertDetails r105) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.N.a(com.avito.android.remote.model.adverts.MyAdvertDetails):com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0bf1  */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v77, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v77 */
    /* JADX WARN: Type inference failed for: r8v79, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v80, types: [java.util.ArrayList] */
    @Override // com.avito.android.user_advert.advert.M
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(@Y61.k com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem r40, @Y61.k com.avito.android.user_advert.advert.AbstractC35385e r41) {
        /*
            Method dump skipped, instructions count: 3429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.N.b(com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem, com.avito.android.user_advert.advert.e):java.util.ArrayList");
    }

    public final List<com.avito.conveyor_item.a> c(MyAdvertDetailsItem myAdvertDetailsItem) {
        List<AdvertParameters.Parameter> params;
        AdvertParameters.Parameter parameter;
        ExpandItemsButtonItem expandItemsButtonItemA;
        AdditionalSeller additionalSeller = myAdvertDetailsItem.f309160q0;
        if (additionalSeller == null || (params = additionalSeller.getParams()) == null || (parameter = (AdvertParameters.Parameter) C42745f0.G(params)) == null || parameter.getDescription() == null) {
            return C42784z0.f406748b;
        }
        InterfaceC35863o4 interfaceC35863o4 = this.f308374d;
        BlockHeaderItem blockHeaderItem = new BlockHeaderItem(interfaceC35863o4.a(), 0, null, null, additionalSeller.getTitle(), 12, null);
        List<AdvertParameters.Parameter> params2 = additionalSeller.getParams();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = params2.iterator();
        while (true) {
            expandItemsButtonItemA = null;
            MyAdvertParameterItem myAdvertParameterItem = null;
            expandItemsButtonItemA = null;
            if (!it.hasNext()) {
                break;
            }
            AdvertParameters.Parameter parameter2 = (AdvertParameters.Parameter) it.next();
            String description = parameter2.getDescription();
            if (description != null) {
                String strA = interfaceC35863o4.a();
                String title = parameter2.getTitle();
                String descriptionColor = parameter2.getDescriptionColor();
                myAdvertParameterItem = new MyAdvertParameterItem(strA, 0, title, description, descriptionColor != null ? UniversalColorKt.universalColorOf$default(descriptionColor, 0, 2, null) : null, parameter2.getButton(), parameter2.getAttributeId(), parameter2.getDeepLink(), 2, null);
            }
            if (myAdvertParameterItem != null) {
                arrayList.add(myAdvertParameterItem);
            }
        }
        ExpandItemsButton expandParamsButton = additionalSeller.getExpandParamsButton();
        Integer numValueOf = expandParamsButton != null ? Integer.valueOf(expandParamsButton.getLimit()) : null;
        if (expandParamsButton != null && arrayList.size() > expandParamsButton.getLimit()) {
            AttributedText title2 = additionalSeller.getTitle();
            expandItemsButtonItemA = A(title2 != null ? title2.getText() : null, expandParamsButton.getTitle(), C42745f0.i0(i(12), arrayList));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(blockHeaderItem);
        if (expandItemsButtonItemA == null || numValueOf == null) {
            arrayList2.addAll(arrayList);
            arrayList2.add(i(12));
        } else {
            arrayList2.addAll(C42745f0.E0(arrayList, numValueOf.intValue()));
            arrayList2.add(expandItemsButtonItemA);
        }
        return arrayList2;
    }

    public final AdvertDetailsDomotekaReportTeaserItem d(MyAdvertDetailsItem myAdvertDetailsItem) {
        DomotekaReportTeaser domotekaReportTeaser = myAdvertDetailsItem.f309087D0;
        if (domotekaReportTeaser == null) {
            return null;
        }
        AdvertDetailsDomotekaReportTeaserItem advertDetailsDomotekaReportTeaserItem = new AdvertDetailsDomotekaReportTeaserItem(0L, null, null, null, 0, domotekaReportTeaser.getTitle(), domotekaReportTeaser.getTheme(), domotekaReportTeaser.getInsights(), domotekaReportTeaser.getActions(), domotekaReportTeaser.getHint(), false, 1039, null);
        C29640d c29640d = this.f308376f;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[20];
        if (((Boolean) c29640d.f132218u.a().invoke()).booleanValue()) {
            return advertDetailsDomotekaReportTeaserItem;
        }
        return null;
    }

    public final List<com.avito.conveyor_item.a> f(MyAdvertDetailsItem myAdvertDetailsItem) {
        List<AdvertParameters.Parameter> params;
        AdvertParameters.Parameter parameter;
        ExpandItemsButtonItem expandItemsButtonItemA;
        CheckInRules checkInRules = myAdvertDetailsItem.f309158p0;
        if (checkInRules == null || (params = checkInRules.getParams()) == null || (parameter = (AdvertParameters.Parameter) C42745f0.G(params)) == null || parameter.getDescription() == null) {
            return C42784z0.f406748b;
        }
        InterfaceC35863o4 interfaceC35863o4 = this.f308374d;
        BlockHeaderItem blockHeaderItem = new BlockHeaderItem(interfaceC35863o4.a(), 0, null, null, checkInRules.getTitle(), 12, null);
        List<AdvertParameters.Parameter> params2 = checkInRules.getParams();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = params2.iterator();
        while (true) {
            expandItemsButtonItemA = null;
            MyAdvertParameterItem myAdvertParameterItem = null;
            expandItemsButtonItemA = null;
            if (!it.hasNext()) {
                break;
            }
            AdvertParameters.Parameter parameter2 = (AdvertParameters.Parameter) it.next();
            String description = parameter2.getDescription();
            if (description != null) {
                String strA = interfaceC35863o4.a();
                String title = parameter2.getTitle();
                String descriptionColor = parameter2.getDescriptionColor();
                myAdvertParameterItem = new MyAdvertParameterItem(strA, 0, title, description, descriptionColor != null ? UniversalColorKt.universalColorOf$default(descriptionColor, 0, 2, null) : null, parameter2.getButton(), parameter2.getAttributeId(), parameter2.getDeepLink(), 2, null);
            }
            if (myAdvertParameterItem != null) {
                arrayList.add(myAdvertParameterItem);
            }
        }
        ExpandItemsButton expandParamsButton = checkInRules.getExpandParamsButton();
        Integer numValueOf = expandParamsButton != null ? Integer.valueOf(expandParamsButton.getLimit()) : null;
        if (expandParamsButton != null && arrayList.size() > expandParamsButton.getLimit()) {
            AttributedText title2 = checkInRules.getTitle();
            expandItemsButtonItemA = A(title2 != null ? title2.getText() : null, expandParamsButton.getTitle(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(blockHeaderItem);
        if (expandItemsButtonItemA == null || numValueOf == null) {
            arrayList2.addAll(arrayList);
        } else {
            arrayList2.addAll(C42745f0.E0(arrayList, numValueOf.intValue()));
            arrayList2.add(expandItemsButtonItemA);
        }
        return arrayList2;
    }

    public final List<com.avito.conveyor_item.a> h(AttributedText attributedText, List<AdvertParameters.Parameter> list, ExpandItemsButton expandItemsButton, boolean z12) {
        MyAdvertParameterItem myAdvertParameterItem;
        InterfaceC35863o4 interfaceC35863o4 = this.f308374d;
        ExpandItemsButtonItem expandItemsButtonItemA = null;
        expandItemsButtonItemA = null;
        BlockHeaderItem blockHeaderItem = attributedText != null ? new BlockHeaderItem(interfaceC35863o4.a(), 0, null, null, attributedText, 12, null) : null;
        ArrayList arrayList = new ArrayList();
        for (AdvertParameters.Parameter parameter : list) {
            String description = parameter.getDescription();
            if (description != null) {
                String strA = interfaceC35863o4.a();
                String title = parameter.getTitle();
                String descriptionColor = parameter.getDescriptionColor();
                myAdvertParameterItem = new MyAdvertParameterItem(strA, 0, title, description, descriptionColor != null ? UniversalColorKt.universalColorOf$default(descriptionColor, 0, 2, null) : null, parameter.getButton(), parameter.getAttributeId(), parameter.getDeepLink(), 2, null);
            } else {
                myAdvertParameterItem = null;
            }
            if (myAdvertParameterItem != null) {
                arrayList.add(myAdvertParameterItem);
            }
        }
        if (arrayList.isEmpty()) {
            return C42784z0.f406748b;
        }
        if (!z12) {
            arrayList = C42745f0.i0(i(12), arrayList);
        }
        Integer numValueOf = expandItemsButton != null ? Integer.valueOf(expandItemsButton.getLimit()) : null;
        if (expandItemsButton != null && list.size() > expandItemsButton.getLimit()) {
            expandItemsButtonItemA = A(attributedText != null ? attributedText.getText() : null, expandItemsButton.getTitle(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        if (blockHeaderItem != null) {
            arrayList2.add(blockHeaderItem);
        }
        if (expandItemsButtonItemA == null || numValueOf == null) {
            arrayList2.addAll(arrayList);
        } else {
            arrayList2.addAll(C42745f0.E0(arrayList, numValueOf.intValue()));
            arrayList2.add(expandItemsButtonItemA);
        }
        return arrayList2;
    }

    public final List<com.avito.conveyor_item.a> k(MyAdvertDetailsItem myAdvertDetailsItem) {
        List<MyAdvertDetails.JobListItem> list = myAdvertDetailsItem.f309117S0;
        if (list == null) {
            return C42784z0.f406748b;
        }
        List<MyAdvertDetails.JobListItem> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (MyAdvertDetails.JobListItem jobListItem : list2) {
            arrayList.add(new com.avito.android.user_advert.advert.items.job_list_item.a(this.f308374d.a(), jobListItem.getTitle(), jobListItem.getLeftIconName(), jobListItem.getDeepLink(), jobListItem.getSubtitle()));
        }
        return arrayList;
    }

    public final com.avito.android.user_advert.advert.items.anon_number.a l(MyAdvertDetailsItem myAdvertDetailsItem) {
        AnonymousNumber anonymousNumber = myAdvertDetailsItem.f309167u;
        String title = anonymousNumber != null ? anonymousNumber.getTitle() : null;
        AnonymousNumber anonymousNumber2 = myAdvertDetailsItem.f309167u;
        String subtitle = anonymousNumber2 != null ? anonymousNumber2.getSubtitle() : null;
        if ((title == null || title.length() == 0) && (subtitle == null || subtitle.length() == 0)) {
            return null;
        }
        return new com.avito.android.user_advert.advert.items.anon_number.a(this.f308374d.a(), title, subtitle);
    }

    public final List<com.avito.android.user_advert.advert.items.contact.a> m(MyAdvertDetailsItem myAdvertDetailsItem) {
        MyAdvertDetails.Seller seller = myAdvertDetailsItem.f309173x;
        if (seller == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC35863o4 interfaceC35863o4 = this.f308374d;
        String strA = interfaceC35863o4.a();
        String name = seller.getName();
        boolean z12 = myAdvertDetailsItem.f309125X;
        boolean z13 = myAdvertDetailsItem.f309124W;
        arrayList.add(new com.avito.android.user_advert.advert.items.contact.a(strA, name, (z13 || z12) ? seller.getPostfix() : myAdvertDetailsItem.f309175y, seller.getImage(), z12 ? UserIconType.SHOP : z13 ? UserIconType.COMPANY : UserIconType.PRIVATE));
        String manager = seller.getManager();
        if (manager != null && manager.length() != 0) {
            arrayList.add(new com.avito.android.user_advert.advert.items.contact.a(interfaceC35863o4.a(), seller.getManager(), myAdvertDetailsItem.f309175y, null, null));
        }
        return arrayList;
    }

    public final List<com.avito.conveyor_item.a> n(MyAdvertDetailsItem myAdvertDetailsItem) {
        if (myAdvertDetailsItem.f309165t == null) {
            return C42784z0.f406748b;
        }
        InterfaceC35863o4 interfaceC35863o4 = this.f308374d;
        BlockHeaderItem blockHeaderItem = new BlockHeaderItem(interfaceC35863o4.a(), 0, null, null, null, 12, null);
        com.avito.android.user_advert.advert.items.description.a aVar = new com.avito.android.user_advert.advert.items.description.a(interfaceC35863o4.a(), myAdvertDetailsItem.f309165t, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(blockHeaderItem);
        arrayList.add(aVar);
        return arrayList;
    }

    public final ArrayList o(MyAdvertDetailsItem myAdvertDetailsItem) {
        ArrayList arrayList = new ArrayList();
        List<ApartmentFeature> list = myAdvertDetailsItem.f309142h0;
        O o12 = new O(this);
        com.avito.android.advert_core.feature_teasers.common.b bVar = this.f308380j;
        ArrayList arrayListA = bVar.a(o12, list);
        if (arrayListA != null) {
            arrayList.addAll(arrayListA);
        }
        AdvertDetailsFeaturesTeasers advertDetailsFeaturesTeasers = myAdvertDetailsItem.f309140g0;
        AdvertDetailsFeatureTeaserItem advertDetailsFeatureTeaserItemB = bVar.b(advertDetailsFeaturesTeasers != null ? advertDetailsFeaturesTeasers.getCheckedByAvito() : null, this.f308374d.a().hashCode());
        if (advertDetailsFeatureTeaserItemB != null) {
            arrayList.add(advertDetailsFeatureTeaserItemB);
        }
        return arrayList;
    }

    public final List<DH0.a> p(MyAdvertDetailsItem myAdvertDetailsItem) {
        List<AdvertParameters.Group> groups;
        AdvertParameters advertParameters = myAdvertDetailsItem.f309092G;
        if (advertParameters == null || (groups = advertParameters.getGroups()) == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (AdvertParameters.Group group : groups) {
            InterfaceC35863o4 interfaceC35863o4 = this.f308374d;
            arrayList.add(new DH0.e(interfaceC35863o4.a(), group.getTitle()));
            for (AdvertParameters.Parameter parameter : group.getParameters()) {
                arrayList.add(new DH0.d(interfaceC35863o4.a(), parameter.getTitle()));
                List<String> subtitles = parameter.getSubtitles();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(subtitles, 10));
                Iterator<T> it = subtitles.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new DH0.c(interfaceC35863o4.a(), (String) it.next()));
                }
                arrayList.addAll(arrayList2);
                String description = parameter.getDescription();
                if (description != null) {
                    arrayList.add(new DH0.b(interfaceC35863o4.a(), description));
                }
            }
        }
        return arrayList;
    }

    public final com.avito.android.user_advert.advert.items.number.a q(MyAdvertDetailsItem myAdvertDetailsItem, AbstractC35385e abstractC35385e) {
        boolean z12 = abstractC35385e instanceof C35382d;
        InterfaceC35863o4 interfaceC35863o4 = this.f308374d;
        if (z12) {
            if (myAdvertDetailsItem.f309153n != null) {
                return new a.C9498a(interfaceC35863o4.a(), ((C35382d) abstractC35385e).f308519a, myAdvertDetailsItem.f309153n.longValue());
            }
            return null;
        }
        if (abstractC35385e instanceof C35388f) {
            return new a.c(interfaceC35863o4.a(), ((C35388f) abstractC35385e).f308897a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<com.avito.conveyor_item.a> r(MyAdvertDetailsItem myAdvertDetailsItem) {
        List<AdvertParameters.Parameter> flat;
        AdvertParameters.Parameter parameter;
        AdvertParameters advertParameters = myAdvertDetailsItem.f309092G;
        if (advertParameters == null || (flat = advertParameters.getFlat()) == null || (parameter = (AdvertParameters.Parameter) C42745f0.G(flat)) == null || parameter.getDescription() == null) {
            return C42784z0.f406748b;
        }
        AdvertParameters advertParameters2 = myAdvertDetailsItem.f309092G;
        List<AdvertParameters.FlatSection> flatSections = advertParameters2.getFlatSections();
        if (!O2.a(flatSections)) {
            return h(advertParameters2.getFlatTitle(), advertParameters2.getFlat(), advertParameters2.getExpandParamsButton(), true);
        }
        List<AdvertParameters.FlatSection> list = flatSections == null ? C42784z0.f406748b : flatSections;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            AdvertParameters.FlatSection flatSection = (AdvertParameters.FlatSection) obj;
            AttributedText title = flatSection.getTitle();
            List<AdvertParameters.Parameter> flat2 = advertParameters2.getFlat();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : flat2) {
                if (C42745f0.r(flatSection.getAttributes(), ((AdvertParameters.Parameter) obj2).getAttributeId())) {
                    arrayList2.add(obj2);
                }
            }
            C42745f0.h(h(title, arrayList2, flatSection.getExpandParamsButton(), flatSections != null && i12 == flatSections.size() - 1), arrayList);
            i12 = i13;
        }
        return arrayList;
    }

    public final List<com.avito.android.user_advert.advert.items.safe_deal_services.c> s(MyAdvertDetailsItem myAdvertDetailsItem) {
        List<MyAdvertSafeDeal.Service> services;
        com.avito.conveyor_item.a aVar;
        MyAdvertSafeDeal myAdvertSafeDeal = myAdvertDetailsItem.f309138f0;
        ArrayList arrayList = null;
        if (myAdvertSafeDeal != null && (services = myAdvertSafeDeal.getServices()) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = services.iterator();
            while (it.hasNext()) {
                MyAdvertSafeDeal.Service.Content content = ((MyAdvertSafeDeal.Service) it.next()).getContent();
                boolean z12 = content instanceof MyAdvertSafeDeal.Service.Content.ListItem;
                InterfaceC35863o4 interfaceC35863o4 = this.f308374d;
                if (z12) {
                    MyAdvertSafeDeal.Service.Content.ListItem listItem = (MyAdvertSafeDeal.Service.Content.ListItem) content;
                    aVar = new c.b.C9502b(interfaceC35863o4.a(), myAdvertDetailsItem.f309129b, listItem.getTitle(), listItem.getLink().getText(), y(listItem.getLink()), PH0.a.a(listItem.getIconType()));
                } else if (content instanceof MyAdvertSafeDeal.Service.Content.Switcher) {
                    MyAdvertSafeDeal.Service.Content.Switcher switcher = (MyAdvertSafeDeal.Service.Content.Switcher) content;
                    String id2 = switcher.getId();
                    if (id2 != null) {
                        String title = switcher.getTitle();
                        String text = switcher.getLink().getText();
                        DeepLink deepLinkY = y(switcher.getLink());
                        com.avito.android.user_advert.advert.items.safe_deal_services.a aVarA = PH0.a.a(switcher.getIconType());
                        Boolean boolIsSwitchOn = switcher.isSwitchOn();
                        boolean zBooleanValue = boolIsSwitchOn != null ? boolIsSwitchOn.booleanValue() : false;
                        Boolean shouldReloadInstallments = switcher.getShouldReloadInstallments();
                        aVar = new c.b.a(id2, myAdvertDetailsItem.f309129b, title, text, deepLinkY, aVarA, id2, zBooleanValue, false, shouldReloadInstallments != null ? shouldReloadInstallments.booleanValue() : false);
                    } else {
                        aVar = null;
                    }
                } else {
                    if (!(content instanceof MyAdvertSafeDeal.Service.Content.ClickableListItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strA = interfaceC35863o4.a();
                    MyAdvertSafeDeal.Service.Content.ClickableListItem clickableListItem = (MyAdvertSafeDeal.Service.Content.ClickableListItem) content;
                    String title2 = clickableListItem.getTitle();
                    String subtitle = clickableListItem.getSubtitle();
                    MyAdvertSafeDeal.Service.Content.Icon leftIcon = clickableListItem.getLeftIcon();
                    com.avito.android.user_advert.advert.items.safe_deal_services.a aVarA2 = PH0.a.a(leftIcon != null ? leftIcon.getIconType() : null);
                    MyAdvertSafeDeal.Service.Content.Icon rightIcon = clickableListItem.getRightIcon();
                    aVar = new c.a(strA, title2, subtitle, clickableListItem.getOnClickDeepLink(), aVarA2, PH0.a.a(rightIcon != null ? rightIcon.getIconType() : null));
                }
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
    }

    public final com.avito.android.user_advert.advert.items.safe_show.a t(MyAdvertDetailsItem myAdvertDetailsItem) {
        SafeShow safeShow;
        AdvertDetailsFeaturesTeasers advertDetailsFeaturesTeasers = myAdvertDetailsItem.f309140g0;
        if (advertDetailsFeaturesTeasers == null || (safeShow = advertDetailsFeaturesTeasers.getSafeShow()) == null) {
            return null;
        }
        return new com.avito.android.user_advert.advert.items.safe_show.a(this.f308374d.a(), safeShow.getTeaserTitle(), safeShow.getBottomSheetInfo().getTitle(), safeShow.getBottomSheetInfo().getText());
    }

    public final List<OH0.c> u(MyAdvertDetailsItem myAdvertDetailsItem) {
        AdvertSellerShortTermRent advertSellerShortTermRent = myAdvertDetailsItem.f309126Y;
        AdvertSellerShortTermRent.Switcher onlineBookingField = advertSellerShortTermRent != null ? advertSellerShortTermRent.getOnlineBookingField() : null;
        AdvertSellerShortTermRent advertSellerShortTermRent2 = myAdvertDetailsItem.f309126Y;
        List<AdvertSellerShortTermRent.Parameter> parameters = advertSellerShortTermRent2 != null ? advertSellerShortTermRent2.getParameters() : null;
        Action manageCalendarButton = advertSellerShortTermRent2 != null ? advertSellerShortTermRent2.getManageCalendarButton() : null;
        if (onlineBookingField == null && parameters == null && manageCalendarButton == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC35863o4 interfaceC35863o4 = this.f308374d;
        if (onlineBookingField != null) {
            if (onlineBookingField.getIsToggleHidden()) {
                arrayList.add(new OH0.b(interfaceC35863o4.a(), onlineBookingField.getTitle(), onlineBookingField.getDisclaimer()));
            } else {
                arrayList.add(new OH0.e(interfaceC35863o4.a(), onlineBookingField.getTitle(), true, onlineBookingField.getIsEnabled(), onlineBookingField.getDisclaimer()));
            }
        }
        if (parameters == null) {
            parameters = C42784z0.f406748b;
        }
        for (AdvertSellerShortTermRent.Parameter parameter : parameters) {
            arrayList.add(new OH0.d(interfaceC35863o4.a(), parameter.getTitle(), parameter.getDescription()));
        }
        if (manageCalendarButton != null) {
            arrayList.add(new OH0.a(interfaceC35863o4.a(), manageCalendarButton));
        }
        return arrayList;
    }

    public final com.avito.android.user_advert.advert.items.ttl.a v(MyAdvertDetailsItem myAdvertDetailsItem) {
        String str = myAdvertDetailsItem.f309155o;
        if (str == null || str.length() == 0) {
            return null;
        }
        return new com.avito.android.user_advert.advert.items.ttl.a(this.f308374d.a(), str);
    }

    public final ArrayList x(MyAdvertDetailsItem myAdvertDetailsItem, PromoBlockData.MyAdvertPromoBlockPosition myAdvertPromoBlockPosition) {
        ArrayList<PromoBlockData> arrayList;
        List<PromoBlockData> list = myAdvertDetailsItem.f309134d0;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                PromoBlockData.MyAdvertPromoBlockPosition position = ((PromoBlockData) obj).getPosition();
                if (position == null) {
                    position = PromoBlockData.MyAdvertPromoBlockPosition.DEFAULT;
                }
                if (position == myAdvertPromoBlockPosition) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (PromoBlockData promoBlockData : arrayList) {
            Long id2 = promoBlockData.getId();
            arrayList2.add(new com.avito.android.user_advert.advert.items.promo_block_feed.a(id2 != null ? id2.longValue() : r4.a().hashCode(), this.f308374d.a(), promoBlockData, promoBlockData.getClosable(), null, 16, null));
        }
        Theme theme = ((com.avito.android.user_advert.advert.items.promo_block_feed.a) C42745f0.E(arrayList2)).f309851d.getTheme();
        Theme.Companion companion = Theme.INSTANCE;
        boolean zIsAvitoRe23 = companion.isAvitoRe23(theme);
        com.avito.android.lib.util.groupable_item.f fVar = this.f308382l;
        List listB = zIsAvitoRe23 ? fVar.b(arrayList2) : fVar.a(arrayList2, new QV.e(0, 0, 3, null));
        if (!companion.isAvitoRe23(((com.avito.android.user_advert.advert.items.promo_block_feed.a) C42745f0.E(listB)).f309851d.getTheme())) {
            ArrayList arrayListE0 = C42745f0.e0(i(22));
            arrayListE0.addAll(listB);
            return arrayListE0;
        }
        PromoBlockData.MyAdvertPromoBlockPosition myAdvertPromoBlockPosition2 = PromoBlockData.MyAdvertPromoBlockPosition.TOP;
        int i12 = myAdvertPromoBlockPosition != myAdvertPromoBlockPosition2 ? 22 : 10;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(i(i12));
        arrayList3.addAll(listB);
        if (myAdvertPromoBlockPosition != myAdvertPromoBlockPosition2) {
            return arrayList3;
        }
        arrayList3.add(i(i12));
        return arrayList3;
    }

    public final DeepLink y(MyAdvertSafeDeal.Service.Content.Link link) {
        return C42756l.H(link.getUri().getScheme(), C35809h6.f318899b) >= 0 ? new WebViewLink.AnyDomain(link.getUri(), null, null, 6, null) : this.f308379i.e(link.getUri());
    }
}
