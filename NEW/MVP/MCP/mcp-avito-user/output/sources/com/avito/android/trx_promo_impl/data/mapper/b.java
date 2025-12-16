package com.avito.android.trx_promo_impl.data.mapper;

import RF0.e;
import RF0.m;
import RF0.n;
import Y61.k;
import Y61.l;
import YF0.g;
import YF0.h;
import YF0.i;
import YF0.o;
import YF0.p;
import YF0.q;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.f;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_impl.data.local.EqualValidator;
import com.avito.android.trx_promo_impl.data.local.GreaterThanOrEqualValidator;
import com.avito.android.trx_promo_impl.data.local.GreaterThanValidator;
import com.avito.android.trx_promo_impl.data.local.LessThanOrEqualValidator;
import com.avito.android.trx_promo_impl.data.local.LessThanValidator;
import com.avito.android.trx_promo_impl.data.local.NotEqualValidator;
import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.ApiDatesV3WithDateRangeOptionsItem;
import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem;
import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBanner;
import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBannerButtonsItem;
import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkDiscountV2;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoMapperV7.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/data/mapper/b;", "Lcom/avito/android/trx_promo_impl/data/mapper/a;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.trx_promo_impl.data.mapper.a {

    /* compiled from: TrxPromoMapperV7.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f303941a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f303942b;

        static {
            int[] iArr = new int[ApiDatesV3WithDateRangeOptionsItem.OptionType.values().length];
            try {
                iArr[ApiDatesV3WithDateRangeOptionsItem.OptionType.AllFree.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDatesV3WithDateRangeOptionsItem.OptionType.BeforeDate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiDatesV3WithDateRangeOptionsItem.OptionType.DateRange.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f303941a = iArr;
            int[] iArr2 = new int[ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem.ValidatorType.values().length];
            try {
                iArr2[ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem.ValidatorType.GreaterThan.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem.ValidatorType.GreaterThanOrEqual.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem.ValidatorType.LessThan.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem.ValidatorType.LessThanOrEqual.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem.ValidatorType.Equal.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem.ValidatorType.NotEqual.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f303942b = iArr2;
        }
    }

    @Inject
    public b() {
    }

    public static ApiDatesV3WithDateRangeOptionsItem h(g gVar) {
        Object next;
        Iterator<T> it = gVar.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ApiDatesV3WithDateRangeOptionsItem) next).getOptionType() == ApiDatesV3WithDateRangeOptionsItem.OptionType.BeforeDate) {
                break;
            }
        }
        return (ApiDatesV3WithDateRangeOptionsItem) next;
    }

    public static ApiDatesV3WithDateRangeOptionsItem i(g gVar) {
        Object next;
        Iterator<T> it = gVar.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ApiDatesV3WithDateRangeOptionsItem) next).getOptionType() == ApiDatesV3WithDateRangeOptionsItem.OptionType.DateRange) {
                break;
            }
        }
        return (ApiDatesV3WithDateRangeOptionsItem) next;
    }

    public static g j(o.b bVar, boolean z12) {
        if (z12) {
            p changedState = bVar.getChangedState();
            if ((changedState != null ? changedState.getDates() : null) != null) {
                return bVar.getChangedState().getDates();
            }
        }
        return bVar.getDates();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static RF0.g k(YF0.b r6) {
        /*
            RF0.g r0 = new RF0.g
            java.lang.String r1 = r6.getIconName()
            java.lang.Integer r1 = com.avito.android.lib.util.q.a(r1)
            if (r1 == 0) goto L11
            int r1 = r1.intValue()
            goto L14
        L11:
            r1 = 2130971975(0x7f040d47, float:1.7552704E38)
        L14:
            RF0.l$a r2 = RF0.l.f14245d
            YF0.a r3 = r6.getColor()
            java.lang.String r3 = r3.getValueName()
            YF0.a r4 = r6.getColor()
            java.lang.String r4 = r4.getValue()
            YF0.a r6 = r6.getColor()
            java.lang.String r6 = r6.getValueDark()
            r2.getClass()
            r2 = 0
            if (r3 != 0) goto L37
            if (r4 != 0) goto L37
            goto L77
        L37:
            if (r4 == 0) goto L54
            RF0.j$a r5 = RF0.j.f14243b
            r5.getClass()
            int r4 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L47
            goto L48
        L47:
            r4 = r2
        L48:
            if (r4 == 0) goto L54
            int r4 = r4.intValue()
            RF0.j r5 = new RF0.j
            r5.<init>(r4)
            goto L55
        L54:
            r5 = r2
        L55:
            if (r6 == 0) goto L71
            RF0.j$a r4 = RF0.j.f14243b
            r4.getClass()
            int r6 = android.graphics.Color.parseColor(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L65
            goto L66
        L65:
            r6 = r2
        L66:
            if (r6 == 0) goto L71
            int r6 = r6.intValue()
            RF0.j r2 = new RF0.j
            r2.<init>(r6)
        L71:
            RF0.l r6 = new RF0.l
            r6.<init>(r3, r5, r2)
            r2 = r6
        L77:
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_impl.data.mapper.b.k(YF0.b):RF0.g");
    }

    @Override // com.avito.android.trx_promo_impl.data.mapper.a
    @k
    public final ArrayList a(@k o.b bVar, boolean z12, @l Integer num, @l LocalDate localDate, @l LocalDate localDate2) {
        boolean z13;
        LocalDate localDate3;
        LocalDate localDateD;
        e aVar;
        boolean selected;
        boolean selected2;
        boolean selected3;
        h datePicker;
        String startDate;
        Object next;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        int iIntValue = num != null ? num.intValue() : (int) bVar.getCommission().getValue();
        arrayList2.add(new com.avito.android.trx_promo_impl.item.header.c(bVar.getTitle(), bVar.getDescription()));
        OkResponseSuccessOkBanner banner = bVar.getBanner();
        if (banner != null) {
            int iB2 = f.b(banner.getStyle().f304189b);
            String title = banner.getTitle();
            AttributedText description = banner.getDescription();
            List<OkResponseSuccessOkBannerButtonsItem> listA = banner.a();
            if (listA != null) {
                List<OkResponseSuccessOkBannerButtonsItem> list = listA;
                arrayList = new ArrayList(C42745f0.q(list, 10));
                for (OkResponseSuccessOkBannerButtonsItem okResponseSuccessOkBannerButtonsItem : list) {
                    arrayList.add(new RF0.h(okResponseSuccessOkBannerButtonsItem.getTitle(), okResponseSuccessOkBannerButtonsItem.getUri(), okResponseSuccessOkBannerButtonsItem.getStyle().f304192b, null, 8, null));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new com.avito.android.trx_promo_impl.item.banner.a(iB2, title, description, arrayList));
        }
        AttributedText title2 = bVar.getCommission().getTitle();
        String valuePrefix = bVar.getCommission().getValuePrefix();
        String valueSuffix = bVar.getCommission().getValueSuffix();
        int step = (int) bVar.getCommission().getStep();
        int valueMin = (int) bVar.getCommission().getValueMin();
        int valueMax = (int) bVar.getCommission().getValueMax();
        List<YF0.d> listG = bVar.getCommission().g();
        if ((listG instanceof Collection) && listG.isEmpty()) {
            z13 = true;
        } else {
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                if (((YF0.d) it.next()).getColors() == null) {
                    z13 = false;
                    break;
                }
            }
            z13 = true;
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(listG, 10));
        for (YF0.d dVar : listG) {
            ArrayList arrayList4 = arrayList2;
            kotlin.ranges.l lVar = new kotlin.ranges.l((int) dVar.getFrom(), (int) dVar.getTo(), 1);
            AttributedText description2 = dVar.getDescription();
            YF0.e colors = dVar.getColors();
            if (!z13) {
                colors = null;
            }
            arrayList3.add(new n(lVar, description2, colors != null ? new RF0.o(colors.getSliderColorName(), colors.getBannerColorName()) : null));
            arrayList2 = arrayList4;
        }
        ArrayList arrayList5 = arrayList2;
        boolean z14 = true;
        arrayList5.add(new com.avito.android.trx_promo_impl.item.commission.c(title2, iIntValue, valuePrefix, valueSuffix, step, valueMin, valueMax, arrayList3));
        OkResponseSuccessOkDiscountV2 discountV2 = bVar.getDiscountV2();
        if (discountV2 != null) {
            Iterator<T> it2 = discountV2.c().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((int) ((q) next).getCommission()) == iIntValue) {
                    break;
                }
            }
            q qVar = (q) next;
            if (qVar != null) {
                arrayList5.add(new com.avito.android.trx_promo_impl.item.discount_v2.c(f.h(discountV2.getBackgroundGradient().f304195b), qVar.getTitle(), qVar.getDescription(), new m(discountV2.getImage().getValue(), discountV2.getImage().getValueDark()), qVar.getDetailsUri()));
            }
        }
        g gVarJ = j(bVar, z12);
        AttributedText title3 = gVarJ.getTitle();
        if (localDate == null) {
            localDateD = d(bVar, z12);
            localDate3 = localDate2;
        } else {
            localDate3 = localDate2;
            localDateD = localDate;
        }
        LocalDate localDateC = localDate3 == null ? c(bVar, z12) : localDate3;
        ApiDatesV3WithDateRangeOptionsItem apiDatesV3WithDateRangeOptionsItemH = h(gVarJ);
        LocalDate localDateA = (apiDatesV3WithDateRangeOptionsItemH == null || (datePicker = apiDatesV3WithDateRangeOptionsItemH.getDatePicker()) == null || (startDate = datePicker.getStartDate()) == null) ? null : cG0.d.a(startDate);
        List<ApiDatesV3WithDateRangeOptionsItem> listA2 = gVarJ.a();
        ArrayList arrayList6 = new ArrayList(C42745f0.q(listA2, 10));
        for (ApiDatesV3WithDateRangeOptionsItem apiDatesV3WithDateRangeOptionsItem : listA2) {
            int i12 = a.f303941a[apiDatesV3WithDateRangeOptionsItem.getOptionType().ordinal()];
            if (i12 == z14) {
                if (localDate3 != null) {
                    com.avito.android.trx_promo_impl.b.f303905a.getClass();
                    selected = localDate3.equals(com.avito.android.trx_promo_impl.b.f303906b);
                } else {
                    selected = apiDatesV3WithDateRangeOptionsItem.getSelected();
                }
                boolean z15 = selected;
                String title4 = apiDatesV3WithDateRangeOptionsItem.getTitle();
                YF0.b icon = apiDatesV3WithDateRangeOptionsItem.getIcon();
                RF0.g gVarK = icon != null ? k(icon) : null;
                String title5 = apiDatesV3WithDateRangeOptionsItem.getSelectedState().getTitle();
                YF0.b icon2 = apiDatesV3WithDateRangeOptionsItem.getSelectedState().getIcon();
                aVar = new e.a(z15, title4, gVarK, title5, icon2 != null ? k(icon2) : null);
            } else if (i12 == 2) {
                if (localDate3 != null) {
                    com.avito.android.trx_promo_impl.b.f303905a.getClass();
                    selected2 = !localDate3.equals(com.avito.android.trx_promo_impl.b.f303906b);
                } else {
                    selected2 = apiDatesV3WithDateRangeOptionsItem.getSelected();
                }
                String title6 = apiDatesV3WithDateRangeOptionsItem.getTitle();
                YF0.b icon3 = apiDatesV3WithDateRangeOptionsItem.getIcon();
                RF0.g gVarK2 = icon3 != null ? k(icon3) : null;
                String title7 = apiDatesV3WithDateRangeOptionsItem.getSelectedState().getTitle();
                YF0.b icon4 = apiDatesV3WithDateRangeOptionsItem.getSelectedState().getIcon();
                RF0.g gVarK3 = icon4 != null ? k(icon4) : null;
                String singleDateTitle = apiDatesV3WithDateRangeOptionsItem.getSelectedState().getSingleDateTitle();
                YF0.k toDateOptions = apiDatesV3WithDateRangeOptionsItem.getToDateOptions();
                String placeholder = toDateOptions != null ? toDateOptions.getPlaceholder() : null;
                YF0.k toDateOptions2 = apiDatesV3WithDateRangeOptionsItem.getToDateOptions();
                aVar = new e.b(selected2, title6, gVarK2, title7, gVarK3, singleDateTitle, new RF0.d(placeholder, toDateOptions2 != null ? toDateOptions2.getFormat() : null));
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (localDate3 == null || localDate == null) {
                    selected3 = apiDatesV3WithDateRangeOptionsItem.getSelected();
                } else {
                    com.avito.android.trx_promo_impl.b.f303905a.getClass();
                    LocalDate localDate4 = com.avito.android.trx_promo_impl.b.f303906b;
                    selected3 = (localDate3.equals(localDate4) || localDate.equals(localDate4)) ? false : z14;
                }
                String title8 = apiDatesV3WithDateRangeOptionsItem.getTitle();
                YF0.b icon5 = apiDatesV3WithDateRangeOptionsItem.getIcon();
                RF0.g gVarK4 = icon5 != null ? k(icon5) : null;
                YF0.b icon6 = apiDatesV3WithDateRangeOptionsItem.getSelectedState().getIcon();
                RF0.g gVarK5 = icon6 != null ? k(icon6) : null;
                DeepLink uri = apiDatesV3WithDateRangeOptionsItem.getUri();
                i dateRangeFormat = apiDatesV3WithDateRangeOptionsItem.getDateRangeFormat();
                aVar = new e.c(selected3, title8, gVarK4, null, gVarK5, uri, dateRangeFormat != null ? new RF0.b(new RF0.a(dateRangeFormat.getEqual().getStart(), dateRangeFormat.getEqual().getEnd(), dateRangeFormat.getEqual().getFormat()), new RF0.a(dateRangeFormat.getOther().getStart(), dateRangeFormat.getOther().getEnd(), dateRangeFormat.getOther().getFormat()), new RF0.a(dateRangeFormat.getSameMonth().getStart(), dateRangeFormat.getSameMonth().getEnd(), dateRangeFormat.getSameMonth().getFormat()), new RF0.a(dateRangeFormat.getSameYear().getStart(), dateRangeFormat.getSameYear().getEnd(), dateRangeFormat.getSameYear().getFormat())) : null, 8, null);
            }
            arrayList6.add(aVar);
            z14 = true;
        }
        arrayList5.add(new com.avito.android.trx_promo_impl.item.date.c(title3, localDateD, localDateC, localDateA, arrayList6));
        AttributedText extraInfo = (!z12 || bVar.getChangedState() == null) ? bVar.getExtraInfo() : bVar.getChangedState().getExtraInfo();
        if (extraInfo != null) {
            arrayList5.add(new com.avito.android.trx_promo_impl.item.extra_info.c(extraInfo));
        }
        return arrayList5;
    }

    @Override // com.avito.android.trx_promo_impl.data.mapper.a
    @l
    public final AttributedText b(@k o.b bVar, boolean z12) {
        return (!z12 || bVar.getChangedState() == null) ? bVar.getAgreement() : bVar.getChangedState().getAgreement();
    }

    @Override // com.avito.android.trx_promo_impl.data.mapper.a
    @k
    public final LocalDate c(@k o.b bVar, boolean z12) {
        String endDate;
        g gVarJ = j(bVar, z12);
        ApiDatesV3WithDateRangeOptionsItem apiDatesV3WithDateRangeOptionsItemI = i(gVarJ);
        if (apiDatesV3WithDateRangeOptionsItemI == null) {
            apiDatesV3WithDateRangeOptionsItemI = h(gVarJ);
        }
        LocalDate localDateA = null;
        if (apiDatesV3WithDateRangeOptionsItemI != null) {
            if (!apiDatesV3WithDateRangeOptionsItemI.getSelected()) {
                apiDatesV3WithDateRangeOptionsItemI = null;
            }
            if (apiDatesV3WithDateRangeOptionsItemI != null && (endDate = apiDatesV3WithDateRangeOptionsItemI.getEndDate()) != null) {
                localDateA = cG0.d.a(endDate);
            }
        }
        if (localDateA != null) {
            return localDateA;
        }
        com.avito.android.trx_promo_impl.b.f303905a.getClass();
        return com.avito.android.trx_promo_impl.b.f303906b;
    }

    @Override // com.avito.android.trx_promo_impl.data.mapper.a
    @k
    public final LocalDate d(@k o.b bVar, boolean z12) {
        String startDate;
        LocalDate localDateA;
        ApiDatesV3WithDateRangeOptionsItem apiDatesV3WithDateRangeOptionsItemI = i(j(bVar, z12));
        if (apiDatesV3WithDateRangeOptionsItemI != null) {
            if (!apiDatesV3WithDateRangeOptionsItemI.getSelected()) {
                apiDatesV3WithDateRangeOptionsItemI = null;
            }
            if (apiDatesV3WithDateRangeOptionsItemI != null && (startDate = apiDatesV3WithDateRangeOptionsItemI.getStartDate()) != null && (localDateA = cG0.d.a(startDate)) != null) {
                return localDateA;
            }
        }
        com.avito.android.trx_promo_impl.b.f303905a.getClass();
        return com.avito.android.trx_promo_impl.b.f303906b;
    }

    @Override // com.avito.android.trx_promo_impl.data.mapper.a
    @l
    public final RF0.k e(@k o.b bVar) {
        YF0.m navBar = bVar.getNavBar();
        if (navBar == null) {
            return null;
        }
        Double progress = navBar.getProgress();
        Float fValueOf = progress != null ? Float.valueOf((float) progress.doubleValue()) : null;
        YF0.n button = navBar.getButton();
        return new RF0.k(fValueOf, button != null ? new ButtonAction(button.getTitle(), button.getUri(), button.getStyle(), button.getIsEnabled()) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.trx_promo_impl.data.mapper.a
    @k
    public final RF0.f f(@k o.b bVar, boolean z12, @k LocalDate localDate) {
        h datePicker;
        C42784z0 c42784z0;
        Parcelable greaterThanValidator;
        LocalDate localDate2 = localDate;
        ApiDatesV3WithDateRangeOptionsItem apiDatesV3WithDateRangeOptionsItemH = h(j(bVar, z12));
        if (apiDatesV3WithDateRangeOptionsItemH == null || (datePicker = apiDatesV3WithDateRangeOptionsItemH.getDatePicker()) == null) {
            return new RF0.f(null, null, null, null, null, 31, null);
        }
        LocalDate localDateA = cG0.d.a(datePicker.getStartDate());
        if (localDateA == null) {
            localDateA = LocalDate.now();
        }
        LocalDate localDate3 = localDateA;
        String screenTitle = datePicker.getScreenTitle();
        String buttonTitle = datePicker.getButtonTitle();
        com.avito.android.trx_promo_impl.b.f303905a.getClass();
        if (localDate2.equals(com.avito.android.trx_promo_impl.b.f303906b) || localDate2.compareTo((ChronoLocalDate) localDate3) < 0) {
            localDate2 = null;
        }
        LocalDate localDate4 = localDate2 == null ? localDate3 : localDate2;
        List<ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem> listD = datePicker.d();
        if (listD != null) {
            List<ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem> list = listD;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem apiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem : list) {
                LocalDate localDateA2 = cG0.d.a(apiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem.getValue());
                String message = apiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem.getMessage();
                switch (a.f303942b[apiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem.getValidatorType().ordinal()]) {
                    case 1:
                        if (localDateA2 == null) {
                            localDateA2 = LocalDate.MIN;
                        }
                        greaterThanValidator = new GreaterThanValidator(localDateA2, message);
                        break;
                    case 2:
                        if (localDateA2 == null) {
                            localDateA2 = LocalDate.MIN;
                        }
                        greaterThanValidator = new GreaterThanOrEqualValidator(localDateA2, message);
                        break;
                    case 3:
                        if (localDateA2 == null) {
                            localDateA2 = LocalDate.MAX;
                        }
                        greaterThanValidator = new LessThanValidator(localDateA2, message);
                        break;
                    case 4:
                        if (localDateA2 == null) {
                            localDateA2 = LocalDate.MAX;
                        }
                        greaterThanValidator = new LessThanOrEqualValidator(localDateA2, message);
                        break;
                    case 5:
                        if (localDateA2 == null) {
                            localDateA2 = LocalDate.now();
                        }
                        greaterThanValidator = new EqualValidator(localDateA2, message);
                        break;
                    case 6:
                        if (localDateA2 == null) {
                            localDateA2 = LocalDate.MIN;
                        }
                        greaterThanValidator = new NotEqualValidator(localDateA2, message);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList.add(greaterThanValidator);
            }
            c42784z0 = arrayList;
        } else {
            c42784z0 = C42784z0.f406748b;
        }
        return new RF0.f(screenTitle, buttonTitle, localDate3, localDate4, c42784z0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    @Override // com.avito.android.trx_promo_impl.data.mapper.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList g(@Y61.k YF0.o.b r10, boolean r11) {
        /*
            r9 = this;
            r0 = 10
            if (r11 == 0) goto L51
            YF0.p r11 = r10.getChangedState()
            if (r11 == 0) goto Lf
            java.util.List r11 = r11.b()
            goto L10
        Lf:
            r11 = 0
        L10:
            if (r11 == 0) goto L51
            YF0.p r10 = r10.getChangedState()
            java.util.List r10 = r10.b()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = kotlin.collections.C42745f0.q(r10, r0)
            r11.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L29:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r10.next()
            com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBannerButtonsItem r0 = (com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBannerButtonsItem) r0
            RF0.h r8 = new RF0.h
            java.lang.String r2 = r0.getTitle()
            com.avito.android.deep_linking.links.DeepLink r3 = r0.getUri()
            com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBannerButtonsItem$Style r0 = r0.getStyle()
            java.lang.String r4 = r0.f304192b
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.add(r8)
            goto L29
        L51:
            java.util.List r10 = r10.c()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = kotlin.collections.C42745f0.q(r10, r0)
            r11.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L64:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r10.next()
            com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBannerButtonsItem r0 = (com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBannerButtonsItem) r0
            RF0.h r8 = new RF0.h
            java.lang.String r2 = r0.getTitle()
            com.avito.android.deep_linking.links.DeepLink r3 = r0.getUri()
            com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBannerButtonsItem$Style r0 = r0.getStyle()
            java.lang.String r4 = r0.f304192b
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.add(r8)
            goto L64
        L8c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_impl.data.mapper.b.g(YF0.o$b, boolean):java.util.ArrayList");
    }
}
