package kotlinx.datetime.format;

import kotlin.Metadata;

/* compiled from: LocalTimeFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/n0;", "Lkotlinx/datetime/internal/format/F;", "Lkotlinx/datetime/format/o0;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43349n0 extends kotlinx.datetime.internal.format.F<InterfaceC43351o0> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Padding f412447e;

    /* compiled from: LocalTimeFormat.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.format.n0$a */
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

    /* JADX WARN: Illegal instructions before constructor call */
    public C43349n0() {
        Padding padding = Padding.f412372c;
        C43353p0.f412450a.getClass();
        kotlinx.datetime.internal.format.E<InterfaceC43351o0> e12 = C43353p0.f412453d;
        Padding padding2 = Padding.f412371b;
        super(e12, 2, null);
        this.f412447e = padding;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C43349n0) {
            if (this.f412447e == ((C43349n0) obj).f412447e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f412447e.hashCode();
    }
}
