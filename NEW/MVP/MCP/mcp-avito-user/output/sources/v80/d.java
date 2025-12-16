package V80;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionChart.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/d;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final e f16943a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f16944b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f16945c;

    public d(@Y61.l e eVar, @Y61.l AttributedText attributedText, @Y61.k String str) {
        this.f16943a = eVar;
        this.f16944b = attributedText;
        this.f16945c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f16943a, dVar.f16943a) && L.f(this.f16944b, dVar.f16944b) && L.f(this.f16945c, dVar.f16945c);
    }

    public final int hashCode() {
        e eVar = this.f16943a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        AttributedText attributedText = this.f16944b;
        return this.f16945c.hashCode() + ((iHashCode + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PositionChart(chartMobile=");
        sb2.append(this.f16943a);
        sb2.append(", description=");
        sb2.append(this.f16944b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f16945c, ')');
    }
}
