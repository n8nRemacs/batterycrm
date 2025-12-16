package fu0;

import Y61.k;
import java.text.DateFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: LocaleUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfu0/d;", "", "<init>", "()V", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f396183a = new d();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final DateFormatSymbols f396184b;

    static {
        DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(new Locale("ru"));
        f396184b = dateFormatSymbols;
        dateFormatSymbols.setMonths(new String[]{"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"});
    }
}
