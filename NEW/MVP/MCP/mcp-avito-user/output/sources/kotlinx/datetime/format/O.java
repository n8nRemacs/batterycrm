package kotlinx.datetime.format;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;

/* compiled from: UtcOffsetFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/O;", "Lkotlinx/datetime/format/x0;", "Lkotlinx/datetime/internal/format/parser/c;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class O implements x0, InterfaceC43377c<O> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public Boolean f412364a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Integer f412365b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Integer f412366c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Integer f412367d;

    public O() {
        this(null, null, null, null, 15, null);
    }

    @Override // kotlinx.datetime.internal.format.parser.InterfaceC43377c
    public final O a() {
        return new O(this.f412365b, this.f412366c, this.f412367d, this.f412364a);
    }

    @Y61.k
    public final kotlinx.datetime.D b() {
        kotlinx.datetime.D d12;
        int i12 = kotlin.jvm.internal.L.f(this.f412364a, Boolean.TRUE) ? -1 : 1;
        Integer num = this.f412365b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i12) : null;
        Integer num2 = this.f412366c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i12) : null;
        Integer num3 = this.f412367d;
        Integer numValueOf3 = num3 != null ? Integer.valueOf(num3.intValue() * i12) : null;
        InterfaceC42726C interfaceC42726C = kotlinx.datetime.E.f412308a;
        try {
            if (numValueOf != null) {
                d12 = new kotlinx.datetime.D(ZoneOffset.ofHoursMinutesSeconds(numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 0, numValueOf3 != null ? numValueOf3.intValue() : 0));
            } else if (numValueOf2 != null) {
                d12 = new kotlinx.datetime.D(ZoneOffset.ofHoursMinutesSeconds(numValueOf2.intValue() / 60, numValueOf2.intValue() % 60, numValueOf3 != null ? numValueOf3.intValue() : 0));
            } else {
                d12 = new kotlinx.datetime.D(ZoneOffset.ofTotalSeconds(numValueOf3 != null ? numValueOf3.intValue() : 0));
            }
            return d12;
        } catch (DateTimeException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    @Override // kotlinx.datetime.format.x0
    public final void d(@Y61.l Integer num) {
        this.f412365b = num;
    }

    @Override // kotlinx.datetime.format.x0
    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Integer getF412367d() {
        return this.f412367d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof O) {
            O o12 = (O) obj;
            if (kotlin.jvm.internal.L.f(this.f412364a, o12.f412364a) && kotlin.jvm.internal.L.f(this.f412365b, o12.f412365b) && kotlin.jvm.internal.L.f(this.f412366c, o12.f412366c) && kotlin.jvm.internal.L.f(this.f412367d, o12.f412367d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f412364a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.f412365b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.f412366c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.f412367d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // kotlinx.datetime.format.x0
    @Y61.l
    /* renamed from: i, reason: from getter */
    public final Boolean getF412364a() {
        return this.f412364a;
    }

    @Override // kotlinx.datetime.format.x0
    public final void q(@Y61.l Boolean bool) {
        this.f412364a = bool;
    }

    @Override // kotlinx.datetime.format.x0
    public final void r(@Y61.l Integer num) {
        this.f412366c = num;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Boolean bool = this.f412364a;
        sb2.append(bool != null ? bool.booleanValue() ? "-" : "+" : " ");
        Object obj = this.f412365b;
        if (obj == null) {
            obj = "??";
        }
        sb2.append(obj);
        sb2.append(':');
        Object obj2 = this.f412366c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb2.append(obj2);
        sb2.append(':');
        Integer num = this.f412367d;
        sb2.append(num != null ? num : "??");
        return sb2.toString();
    }

    @Override // kotlinx.datetime.format.x0
    @Y61.l
    /* renamed from: x, reason: from getter */
    public final Integer getF412365b() {
        return this.f412365b;
    }

    @Override // kotlinx.datetime.format.x0
    @Y61.l
    /* renamed from: y, reason: from getter */
    public final Integer getF412366c() {
        return this.f412366c;
    }

    @Override // kotlinx.datetime.format.x0
    public final void z(@Y61.l Integer num) {
        this.f412367d = num;
    }

    public /* synthetic */ O(Boolean bool, Integer num, Integer num2, Integer num3, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? null : num3, (i12 & 1) != 0 ? null : bool);
    }

    public O(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Boolean bool) {
        this.f412364a = bool;
        this.f412365b = num;
        this.f412366c = num2;
        this.f412367d = num3;
    }
}
