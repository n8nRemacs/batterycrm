package YE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingBlocksInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYE0/f;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f19400a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f19401b;

    public f(@k AttributedText attributedText, @l String str) {
        this.f19400a = attributedText;
        this.f19401b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f19400a, fVar.f19400a) && L.f(this.f19401b, fVar.f19401b);
    }

    public final int hashCode() {
        int iHashCode = this.f19400a.hashCode() * 31;
        String str = this.f19401b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TravelOnboardingConditionsHeader(title=");
        sb2.append(this.f19400a);
        sb2.append(", tooltipText=");
        return C22026a.c(sb2, this.f19401b, ')');
    }
}
