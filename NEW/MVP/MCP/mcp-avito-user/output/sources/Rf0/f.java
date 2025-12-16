package RF0;

import androidx.compose.foundation.H;
import com.avito.android.trx_promo_impl.data.local.TrxPromoDateValidator;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDatePickerInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/f;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f14232a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f14233b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final LocalDate f14234c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final LocalDate f14235d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<TrxPromoDateValidator> f14236e;

    public f() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f14232a, fVar.f14232a) && L.f(this.f14233b, fVar.f14233b) && L.f(this.f14234c, fVar.f14234c) && L.f(this.f14235d, fVar.f14235d) && L.f(this.f14236e, fVar.f14236e);
    }

    public final int hashCode() {
        String str = this.f14232a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14233b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.f14234c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f14235d;
        return this.f14236e.hashCode() + ((iHashCode3 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoDatePickerInfo(screenTitle=");
        sb2.append(this.f14232a);
        sb2.append(", buttonTitle=");
        sb2.append(this.f14233b);
        sb2.append(", startDate=");
        sb2.append(this.f14234c);
        sb2.append(", selectedDate=");
        sb2.append(this.f14235d);
        sb2.append(", validators=");
        return H.p(sb2, this.f14236e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Y61.l String str, @Y61.l String str2, @Y61.l LocalDate localDate, @Y61.l LocalDate localDate2, @Y61.k List<? extends TrxPromoDateValidator> list) {
        this.f14232a = str;
        this.f14233b = str2;
        this.f14234c = localDate;
        this.f14235d = localDate2;
        this.f14236e = list;
    }

    public f(String str, String str2, LocalDate localDate, LocalDate localDate2, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : localDate, (i12 & 8) == 0 ? localDate2 : null, (i12 & 16) != 0 ? C42784z0.f406748b : list);
    }
}
