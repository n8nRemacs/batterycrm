package YE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingBlocksInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYE0/e;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final f f19398a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f19399b;

    public e(@l f fVar, @k ArrayList arrayList) {
        this.f19398a = fVar;
        this.f19399b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f19398a, eVar.f19398a) && this.f19399b.equals(eVar.f19399b);
    }

    public final int hashCode() {
        f fVar = this.f19398a;
        return this.f19399b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TravelOnboardingConditionsBlock(header=");
        sb2.append(this.f19398a);
        sb2.append(", conditions=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f19399b, ')');
    }
}
