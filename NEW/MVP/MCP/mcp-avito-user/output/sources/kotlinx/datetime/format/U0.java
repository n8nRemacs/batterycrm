package kotlinx.datetime.format;

import kotlin.Metadata;

/* compiled from: UtcOffsetFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/U0;", "Lkotlinx/datetime/internal/format/F;", "Lkotlinx/datetime/format/x0;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class U0 extends kotlinx.datetime.internal.format.F<x0> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Padding f412385e;

    /* JADX WARN: Illegal instructions before constructor call */
    public U0() {
        Padding padding = Padding.f412372c;
        C43345l0.f412434a.getClass();
        kotlinx.datetime.internal.format.E<x0> e12 = C43345l0.f412435b;
        Padding padding2 = Padding.f412371b;
        super(e12, 2, null);
        this.f412385e = padding;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof U0) {
            if (this.f412385e == ((U0) obj).f412385e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f412385e.hashCode();
    }
}
