package kotlinx.datetime.format;

import kotlin.Metadata;

/* compiled from: LocalDateFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/F;", "Lkotlinx/datetime/internal/format/F;", "Lkotlinx/datetime/format/i;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class F extends kotlinx.datetime.internal.format.F<InterfaceC43338i> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Padding f412333e;

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
    public F(@Y61.k Padding padding) {
        super(C43340j.f412414d, padding == Padding.f412372c ? 2 : 1, padding == Padding.f412373d ? 2 : null);
        C43340j.f412411a.getClass();
        this.f412333e = padding;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof F) {
            if (this.f412333e == ((F) obj).f412333e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f412333e.hashCode();
    }
}
