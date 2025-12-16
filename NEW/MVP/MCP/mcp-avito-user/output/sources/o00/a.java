package O00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.Metadata;

/* compiled from: PreApprovalSliderConfig.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO00/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f11895a;

    public a(double d12) {
        this.f11895a = d12;
    }

    public static a a(a aVar, double d12) {
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        return new a(d12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Double.compare(this.f11895a, ((a) obj).f11895a) == 0 && Double.compare(0.0d, 0.0d) == 0 && Double.compare(1.0d, 1.0d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Double.hashCode(1.0d) + e.d(Double.hashCode(this.f11895a) * 31, 31, 0.0d)) * 31) + 1821885246) * 31) + 985643724;
    }

    @k
    public final String toString() {
        return "PreApprovalSliderConfig(value=" + this.f11895a + ", minValue=0.0, maxValue=1.0, minStringValue=500 тыс. ₽, maxStringValue=100 млн ₽)";
    }
}
