package pH;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/r;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final s f428423a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f428424b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final j f428425c;

    public r() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f428423a, rVar.f428423a) && L.f(this.f428424b, rVar.f428424b) && L.f(this.f428425c, rVar.f428425c);
    }

    public final int hashCode() {
        s sVar = this.f428423a;
        int iHashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        AttributedText attributedText = this.f428424b;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        j jVar = this.f428425c;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "GigSlotPaymentInfo(requisites=" + this.f428423a + ", description=" + this.f428424b + ", primaryButton=" + this.f428425c + ')';
    }

    public r(@Y61.l s sVar, @Y61.l AttributedText attributedText, @Y61.l j jVar) {
        this.f428423a = sVar;
        this.f428424b = attributedText;
        this.f428425c = jVar;
    }

    public /* synthetic */ r(s sVar, AttributedText attributedText, j jVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : sVar, (i12 & 2) != 0 ? null : attributedText, (i12 & 4) != 0 ? null : jVar);
    }
}
