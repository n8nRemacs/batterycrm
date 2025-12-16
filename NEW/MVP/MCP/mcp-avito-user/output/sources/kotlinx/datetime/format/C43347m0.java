package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocalDateFormat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/m0;", "Lkotlinx/datetime/internal/format/z;", "Lkotlinx/datetime/format/i;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43347m0 extends kotlinx.datetime.internal.format.z<InterfaceC43338i> {

    /* renamed from: c, reason: collision with root package name */
    public final int f412444c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f412445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43347m0(int i12, boolean z12, int i13, C42822w c42822w) {
        super(C43340j.f412412b, i12);
        z12 = (i13 & 2) != 0 ? false : z12;
        C43340j.f412411a.getClass();
        this.f412444c = i12;
        this.f412445d = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C43347m0) {
            C43347m0 c43347m0 = (C43347m0) obj;
            if (this.f412444c == c43347m0.f412444c && this.f412445d == c43347m0.f412445d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f412445d) + (Integer.hashCode(this.f412444c) * 31);
    }
}
