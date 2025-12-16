package PE0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatisticsBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPE0/i;", "LOE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i implements OE0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f12908a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<j> f12909b;

    public i(@k AttributedText attributedText, @k List<j> list) {
        this.f12908a = attributedText;
        this.f12909b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f12908a, iVar.f12908a) && L.f(this.f12909b, iVar.f12909b);
    }

    public final int hashCode() {
        return this.f12909b.hashCode() + (this.f12908a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatisticsBlock(title=");
        sb2.append(this.f12908a);
        sb2.append(", statistics=");
        return H.p(sb2, this.f12909b, ')');
    }
}
