package V80;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionChart.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/f;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<AttributedText> f16950a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16951b;

    public f(@Y61.k List<AttributedText> list, long j12) {
        this.f16950a = list;
        this.f16951b = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f16950a, fVar.f16950a) && this.f16951b == fVar.f16951b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16951b) + (this.f16950a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PositionChartMobileChartParams(lineY=");
        sb2.append(this.f16950a);
        sb2.append(", maxValue=");
        return r.u(sb2, this.f16951b, ')');
    }
}
