package QF0;

import Y61.k;
import Y61.l;
import com.avito.android.util.V2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import kotlin.Metadata;

/* compiled from: TrxPromoGoodsDateUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_trx-promo-goods_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {
    @l
    public static final LocalDate a(@k String str) {
        try {
            return LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
        } catch (DateTimeParseException e12) {
            V2.f318762a.f(e12);
            return null;
        }
    }
}
