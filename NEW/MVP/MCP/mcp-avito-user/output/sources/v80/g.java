package V80;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionChart.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/g;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AttributedText f16952a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final a f16953b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ArrayList f16954c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f16955d;

    public g(@Y61.k AttributedText attributedText, @Y61.l a aVar, @Y61.l ArrayList arrayList, @Y61.l AttributedText attributedText2) {
        this.f16952a = attributedText;
        this.f16953b = aVar;
        this.f16954c = arrayList;
        this.f16955d = attributedText2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f16952a, gVar.f16952a) && L.f(this.f16953b, gVar.f16953b) && L.f(this.f16954c, gVar.f16954c) && L.f(this.f16955d, gVar.f16955d);
    }

    public final int hashCode() {
        int iHashCode = this.f16952a.hashCode() * 31;
        a aVar = this.f16953b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ArrayList arrayList = this.f16954c;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        AttributedText attributedText = this.f16955d;
        return iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PositionChartMobileColsItem(day=");
        sb2.append(this.f16952a);
        sb2.append(", position=");
        sb2.append(this.f16953b);
        sb2.append(", promotions=");
        sb2.append(this.f16954c);
        sb2.append(", weekDay=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f16955d, ')');
    }
}
