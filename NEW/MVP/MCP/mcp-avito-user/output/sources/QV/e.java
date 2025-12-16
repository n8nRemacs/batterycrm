package QV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SpacingConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQV/e;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f13746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13747b;

    public e() {
        this(0, 0, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13746a == eVar.f13746a && this.f13747b == eVar.f13747b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13747b) + (Integer.hashCode(this.f13746a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpacingConfig(nonGroupedSpacingRes=");
        sb2.append(this.f13746a);
        sb2.append(", groupedSpacingRes=");
        return r.t(sb2, this.f13747b, ')');
    }

    public e(int i12, int i13, int i14, C42822w c42822w) {
        i12 = (i14 & 1) != 0 ? R.dimen.design_promo_block_non_grouped_spacing : i12;
        i13 = (i14 & 2) != 0 ? R.dimen.design_promo_block_grouped_spacing : i13;
        this.f13746a = i12;
        this.f13747b = i13;
    }
}
