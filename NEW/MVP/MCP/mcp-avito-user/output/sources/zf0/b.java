package ZF0;

import Y61.k;
import Y61.l;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZF0/b;", "", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f20028d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final b f20029e = new b(null, null, null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f20030a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final LocalDate f20031b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final LocalDate f20032c;

    /* compiled from: TrxPromoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZF0/b$a;", "", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@l Integer num, @l LocalDate localDate, @l LocalDate localDate2) {
        this.f20030a = num;
        this.f20031b = localDate;
        this.f20032c = localDate2;
    }

    public static b a(b bVar, int i12) {
        Integer num = (i12 & 1) != 0 ? bVar.f20030a : null;
        LocalDate localDate = (i12 & 2) != 0 ? bVar.f20031b : null;
        LocalDate localDate2 = (i12 & 4) != 0 ? bVar.f20032c : null;
        bVar.getClass();
        return new b(num, localDate, localDate2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f20030a, bVar.f20030a) && L.f(this.f20031b, bVar.f20031b) && L.f(this.f20032c, bVar.f20032c);
    }

    public final int hashCode() {
        Integer num = this.f20030a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        LocalDate localDate = this.f20031b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f20032c;
        return iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoInputState(commission=");
        sb2.append(this.f20030a);
        sb2.append(", dateFrom=");
        sb2.append(this.f20031b);
        sb2.append(", dateTo=");
        return AK.c.t(sb2, this.f20032c, ')');
    }
}
