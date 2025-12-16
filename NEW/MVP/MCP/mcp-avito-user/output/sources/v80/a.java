package V80;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionChart.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f16932a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f16933b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16934c;

    public a(@Y61.k UniversalColor universalColor, @Y61.k AttributedText attributedText, long j12) {
        this.f16932a = universalColor;
        this.f16933b = attributedText;
        this.f16934c = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f16932a, aVar.f16932a) && L.f(this.f16933b, aVar.f16933b) && this.f16934c == aVar.f16934c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16934c) + com.avito.android.actions_sheet.a.b(this.f16932a.hashCode() * 31, 31, this.f16933b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChartMobileColsItemPositionData(bgColor=");
        sb2.append(this.f16932a);
        sb2.append(", title=");
        sb2.append(this.f16933b);
        sb2.append(", value=");
        return r.u(sb2, this.f16934c, ')');
    }
}
