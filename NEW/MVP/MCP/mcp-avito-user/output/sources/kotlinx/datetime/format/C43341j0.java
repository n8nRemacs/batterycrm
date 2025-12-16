package kotlinx.datetime.format;

import kotlin.Metadata;

/* compiled from: LocalDateFormat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/j0;", "Lkotlinx/datetime/internal/format/s;", "Lkotlinx/datetime/format/i;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43341j0 extends kotlinx.datetime.internal.format.s<InterfaceC43338i> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43343k0 f412420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43341j0(@Y61.k C43343k0 c43343k0) {
        super(C43340j.f412413c, c43343k0.f412431a, "monthName");
        C43340j.f412411a.getClass();
        this.f412420d = c43343k0;
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof C43341j0) && kotlin.jvm.internal.L.f(this.f412420d.f412431a, ((C43341j0) obj).f412420d.f412431a);
    }

    public final int hashCode() {
        return this.f412420d.f412431a.hashCode();
    }
}
