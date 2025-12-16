package gj;

import androidx.appcompat.app.r;
import com.avito.android.beduin_shared.model.context.PresentationStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinViewConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgj/l;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f396757a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f396758b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PresentationStyle f396759c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Float f396760d;

    public l() {
        this(null, false, null, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f396757a, lVar.f396757a) && this.f396758b == lVar.f396758b && this.f396759c == lVar.f396759c && L.f(this.f396760d, lVar.f396760d);
    }

    public final int hashCode() {
        Integer num = this.f396757a;
        int iHashCode = (this.f396759c.hashCode() + r.i((num == null ? 0 : num.hashCode()) * 31, 31, this.f396758b)) * 31;
        Float f12 = this.f396760d;
        return iHashCode + (f12 != null ? f12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinViewConfig(tooltipMinHorizontalMargin=");
        sb2.append(this.f396757a);
        sb2.append(", excludeRefreshForms=");
        sb2.append(this.f396758b);
        sb2.append(", presentationStyle=");
        sb2.append(this.f396759c);
        sb2.append(", recyclerViewScrollTimePerInch=");
        return org.webrtc.h.d(sb2, this.f396760d, ')');
    }

    public l(Integer num, boolean z12, PresentationStyle presentationStyle, Float f12, int i12, C42822w c42822w) {
        num = (i12 & 1) != 0 ? null : num;
        z12 = (i12 & 2) != 0 ? false : z12;
        presentationStyle = (i12 & 4) != 0 ? PresentationStyle.f105307b : presentationStyle;
        f12 = (i12 & 8) != 0 ? null : f12;
        this.f396757a = num;
        this.f396758b = z12;
        this.f396759c = presentationStyle;
        this.f396760d = f12;
    }
}
