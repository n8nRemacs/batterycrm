package W80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW80/j;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f17803a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f17804b;

    public j(@k String str, @k AttributedText attributedText) {
        this.f17803a = str;
        this.f17804b = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f17803a, jVar.f17803a) && L.f(this.f17804b, jVar.f17804b);
    }

    public final int hashCode() {
        return this.f17804b.hashCode() + (this.f17803a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PositionInfoToastBlock(id=");
        sb2.append(this.f17803a);
        sb2.append(", message=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f17804b, ')');
    }
}
