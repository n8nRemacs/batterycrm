package com.avito.android.trx_promo_impl.date_range_picker.data.mapper;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.trx_promo_impl.data.local.EqualValidator;
import com.avito.android.trx_promo_impl.data.local.GreaterThanOrEqualValidator;
import com.avito.android.trx_promo_impl.data.local.GreaterThanValidator;
import com.avito.android.trx_promo_impl.data.local.LessThanOrEqualValidator;
import com.avito.android.trx_promo_impl.data.local.LessThanValidator;
import com.avito.android.trx_promo_impl.data.local.NotEqualValidator;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerLinkContent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: TrxPromoDateRangePickerMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/data/mapper/b;", "Lcom/avito/android/trx_promo_impl/date_range_picker/data/mapper/a;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Locale f303989a = new Locale("ru", "RU");

    /* compiled from: TrxPromoDateRangePickerMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f303990a;

        static {
            int[] iArr = new int[TrxPromoConfigureDateRangePickerLinkContent.Validator.Type.values().length];
            try {
                iArr[TrxPromoConfigureDateRangePickerLinkContent.Validator.Type.GREATER_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrxPromoConfigureDateRangePickerLinkContent.Validator.Type.GREATER_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrxPromoConfigureDateRangePickerLinkContent.Validator.Type.LESS_THAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrxPromoConfigureDateRangePickerLinkContent.Validator.Type.LESS_THAN_OR_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TrxPromoConfigureDateRangePickerLinkContent.Validator.Type.EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TrxPromoConfigureDateRangePickerLinkContent.Validator.Type.NOT_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f303990a = iArr;
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a
    @l
    public final LocalDate a(@l com.avito.android.lib.design.picker.k<?> kVar, @l com.avito.android.lib.design.picker.k<?> kVar2, @l com.avito.android.lib.design.picker.k<?> kVar3) {
        Object obj = kVar != null ? kVar.f180046a : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            int iIntValue = num.intValue();
            Object obj2 = kVar2 != null ? kVar2.f180046a : null;
            Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
            if (num2 != null) {
                int iIntValue2 = num2.intValue() + 1;
                Object obj3 = kVar3 != null ? kVar3.f180046a : null;
                Integer num3 = obj3 instanceof Integer ? (Integer) obj3 : null;
                if (num3 != null) {
                    int iIntValue3 = num3.intValue();
                    String strR = C43066x.R(2, String.valueOf(iIntValue));
                    String strR2 = C43066x.R(2, String.valueOf(iIntValue2));
                    return cG0.d.a(String.valueOf(iIntValue3) + '-' + strR2 + '-' + strR);
                }
            }
        }
        return null;
    }

    @Override // com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a
    @l
    public final LocalDate b(@k String str) {
        return cG0.d.a(str);
    }

    @Override // com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a
    @k
    public final ArrayList c(@k List list) {
        Parcelable greaterThanValidator;
        List<TrxPromoConfigureDateRangePickerLinkContent.Validator> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (TrxPromoConfigureDateRangePickerLinkContent.Validator validator : list2) {
            LocalDate localDateA = cG0.d.a(validator.getValue());
            String message = validator.getMessage();
            switch (a.f303990a[validator.getType().ordinal()]) {
                case 1:
                    if (localDateA == null) {
                        localDateA = LocalDate.MIN;
                    }
                    greaterThanValidator = new GreaterThanValidator(localDateA, message);
                    break;
                case 2:
                    if (localDateA == null) {
                        localDateA = LocalDate.MIN;
                    }
                    greaterThanValidator = new GreaterThanOrEqualValidator(localDateA, message);
                    break;
                case 3:
                    if (localDateA == null) {
                        localDateA = LocalDate.MAX;
                    }
                    greaterThanValidator = new LessThanValidator(localDateA, message);
                    break;
                case 4:
                    if (localDateA == null) {
                        localDateA = LocalDate.MAX;
                    }
                    greaterThanValidator = new LessThanOrEqualValidator(localDateA, message);
                    break;
                case 5:
                    if (localDateA == null) {
                        localDateA = LocalDate.now();
                    }
                    greaterThanValidator = new EqualValidator(localDateA, message);
                    break;
                case 6:
                    if (localDateA == null) {
                        localDateA = LocalDate.MIN;
                    }
                    greaterThanValidator = new NotEqualValidator(localDateA, message);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(greaterThanValidator);
        }
        return arrayList;
    }

    @Override // com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a
    @k
    public final String d(@k LocalDate localDate, @k String str, @k String str2, @k String str3) {
        DateTimeFormatter dateTimeFormatterOfPattern;
        com.avito.android.trx_promo_impl.b.f303905a.getClass();
        if (localDate.equals(com.avito.android.trx_promo_impl.b.f303906b)) {
            return str2;
        }
        try {
            dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(str3);
        } catch (IllegalArgumentException unused) {
            dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("d MMMM");
        }
        return C43066x.a0(str, "{date}", localDate.format(dateTimeFormatterOfPattern.withLocale(this.f303989a)), false);
    }
}
