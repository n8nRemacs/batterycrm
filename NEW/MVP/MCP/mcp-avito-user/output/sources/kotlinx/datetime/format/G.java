package kotlinx.datetime.format;

import kotlin.Metadata;

/* compiled from: LocalDateFormat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/G;", "Lkotlinx/datetime/internal/format/s;", "Lkotlinx/datetime/format/i;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class G extends kotlinx.datetime.internal.format.s<InterfaceC43338i> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H f412335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(@Y61.k H h12) {
        super(C43340j.f412415e, h12.f412339a, "dayOfWeekName");
        C43340j.f412411a.getClass();
        this.f412335d = h12;
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof G) && kotlin.jvm.internal.L.f(this.f412335d.f412339a, ((G) obj).f412335d.f412339a);
    }

    public final int hashCode() {
        return this.f412335d.f412339a.hashCode();
    }
}
