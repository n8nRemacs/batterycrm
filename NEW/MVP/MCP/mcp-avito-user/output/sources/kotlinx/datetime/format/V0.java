package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocalDateFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/V0;", "Lkotlinx/datetime/internal/format/B;", "Lkotlinx/datetime/format/i;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class V0 extends kotlinx.datetime.internal.format.B<InterfaceC43338i> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Padding f412386d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f412387e;

    /* compiled from: LocalDateFormat.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Padding.values().length];
            try {
                Padding padding = Padding.f412371b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(Padding padding, boolean z12, int i12, C42822w c42822w) {
        super(C43340j.f412412b, Integer.valueOf(padding == Padding.f412372c ? 4 : 1), padding == Padding.f412373d ? 4 : null);
        z12 = (i12 & 2) != 0 ? false : z12;
        C43340j.f412411a.getClass();
        this.f412386d = padding;
        this.f412387e = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof V0) {
            V0 v02 = (V0) obj;
            if (this.f412386d == v02.f412386d && this.f412387e == v02.f412387e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f412387e) + (this.f412386d.hashCode() * 31);
    }
}
