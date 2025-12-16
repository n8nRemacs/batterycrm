package cG0;

import Y61.k;
import Y61.l;
import com.avito.android.util.V2;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: TrxPromoDateUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_trx-promo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Locale f57802a = new Locale("ru", "RU");

    /* compiled from: TrxPromoDateUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<Month> f57803a = kotlin.enums.c.a(Month.values());
    }

    @l
    public static final LocalDate a(@k String str) {
        try {
            return LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
        } catch (DateTimeParseException e12) {
            V2.f318762a.f(e12);
            return null;
        }
    }

    @k
    public static final String b(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @k LocalDate localDate, @l LocalDate localDate2) {
        if (str2 == null) {
            str2 = "{end}";
        }
        if (str3 == null) {
            str3 = "{start}";
        }
        if (str4 == null) {
            str4 = "";
        }
        if (str5 == null) {
            str5 = "";
        }
        if (localDate2 == null) {
            try {
                com.avito.android.trx_promo_impl.b.f303905a.getClass();
                localDate2 = com.avito.android.trx_promo_impl.b.f303906b;
            } catch (Exception unused) {
                return str;
            }
        }
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(str4);
        Locale locale = f57802a;
        return C43066x.a0(C43066x.a0(str, str2, dateTimeFormatterOfPattern.withLocale(locale).format(localDate), false), str3, DateTimeFormatter.ofPattern(str5).withLocale(locale).format(localDate2), false);
    }
}
