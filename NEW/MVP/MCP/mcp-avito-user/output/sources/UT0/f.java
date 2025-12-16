package Ut0;

import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/f;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16728a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16729b;

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        boolean z12 = false;
        this(z12, z12, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f16728a == fVar.f16728a && this.f16729b == fVar.f16729b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16729b) + (Boolean.hashCode(this.f16728a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SaveButtonState(showSaveButton=");
        sb2.append(this.f16728a);
        sb2.append(", isButtonProgress=");
        return r.x(sb2, this.f16729b, ')');
    }

    public f(boolean z12, boolean z13) {
        this.f16728a = z12;
        this.f16729b = z13;
    }

    public /* synthetic */ f(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
    }
}
