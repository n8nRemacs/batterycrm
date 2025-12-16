package kotlinx.datetime.format;

import com.avito.android.remote.model.category_parameters.SelectionType;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;
import kotlinx.datetime.j;

/* compiled from: LocalDateFormat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/L;", "Lkotlinx/datetime/format/i;", "Lkotlinx/datetime/internal/format/parser/c;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class L implements InterfaceC43338i, InterfaceC43377c<L> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public Integer f412350a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Integer f412351b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Integer f412352c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Integer f412353d;

    public L() {
        this(null, null, null, null, 15, null);
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Integer getF412353d() {
        return this.f412353d;
    }

    @Override // kotlinx.datetime.internal.format.parser.InterfaceC43377c
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final L a() {
        return new L(this.f412350a, this.f412351b, this.f412352c, this.f412353d);
    }

    @Y61.k
    public final kotlinx.datetime.q d() {
        Integer num = this.f412350a;
        S.b(num, SelectionType.TYPE_YEAR);
        int iIntValue = num.intValue();
        Integer num2 = this.f412351b;
        S.b(num2, "monthNumber");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f412352c;
        S.b(num3, "dayOfMonth");
        kotlinx.datetime.q qVar = new kotlinx.datetime.q(iIntValue, iIntValue2, num3.intValue());
        Integer num4 = this.f412353d;
        if (num4 != null) {
            int iIntValue3 = num4.intValue();
            LocalDate localDate = qVar.f412619b;
            if (iIntValue3 != localDate.getDayOfWeek().ordinal() + 1) {
                StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > iIntValue3 || iIntValue3 >= 8) {
                    throw new IllegalArgumentException(AK.c.g(iIntValue3, "Expected ISO day-of-week number in 1..7, got ").toString());
                }
                sb2.append(j.a.f412615a.get(iIntValue3 - 1));
                sb2.append(" but the date is ");
                sb2.append(qVar);
                sb2.append(", which is a ");
                sb2.append(localDate.getDayOfWeek());
                throw new DateTimeFormatException(sb2.toString());
            }
        }
        return qVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof L) {
            L l12 = (L) obj;
            if (kotlin.jvm.internal.L.f(this.f412350a, l12.f412350a) && kotlin.jvm.internal.L.f(this.f412351b, l12.f412351b) && kotlin.jvm.internal.L.f(this.f412352c, l12.f412352c) && kotlin.jvm.internal.L.f(this.f412353d, l12.f412353d)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void f(@Y61.l Integer num) {
        this.f412353d = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: getYear, reason: from getter */
    public final Integer getF412350a() {
        return this.f412350a;
    }

    public final int hashCode() {
        Integer num = this.f412350a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f412351b;
        int iHashCode2 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode;
        Integer num3 = this.f412352c;
        int iHashCode3 = ((num3 != null ? num3.hashCode() : 0) * 31) + iHashCode2;
        Integer num4 = this.f412353d;
        return ((num4 != null ? num4.hashCode() : 0) * 31) + iHashCode3;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void k(@Y61.l Integer num) {
        this.f412351b = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void n(@Y61.l Integer num) {
        this.f412350a = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: o, reason: from getter */
    public final Integer getF412352c() {
        return this.f412352c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Object obj = this.f412350a;
        if (obj == null) {
            obj = "??";
        }
        sb2.append(obj);
        sb2.append('-');
        Object obj2 = this.f412351b;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb2.append(obj2);
        sb2.append('-');
        Object obj3 = this.f412352c;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb2.append(obj3);
        sb2.append(" (day of week is ");
        Object obj4 = this.f412353d;
        return androidx.compose.foundation.H.n(sb2, obj4 != null ? obj4 : "??", ')');
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void u(@Y61.l Integer num) {
        this.f412352c = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: v, reason: from getter */
    public final Integer getF412351b() {
        return this.f412351b;
    }

    public L(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4) {
        this.f412350a = num;
        this.f412351b = num2;
        this.f412352c = num3;
        this.f412353d = num4;
    }

    public /* synthetic */ L(Integer num, Integer num2, Integer num3, Integer num4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2, (i12 & 4) != 0 ? null : num3, (i12 & 8) != 0 ? null : num4);
    }
}
