package JO;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HistoricalSuggestsSection.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJO/d;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f8942b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f8943c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public c f8944d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<c> f8945e;

    public d(@Y61.k String str, @Y61.k String str2, @Y61.l c cVar, @Y61.k List<c> list) {
        this.f8942b = str;
        this.f8943c = str2;
        this.f8944d = cVar;
        this.f8945e = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f8942b, dVar.f8942b) && L.f(this.f8943c, dVar.f8943c) && L.f(this.f8944d, dVar.f8944d) && L.f(this.f8945e, dVar.f8945e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return getF8942b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF8942b() {
        return this.f8942b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f8942b.hashCode() * 31, 31, this.f8943c);
        c cVar = this.f8944d;
        return this.f8945e.hashCode() + ((iD2 + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HistoricalSuggestsSection(stringId=");
        sb2.append(this.f8942b);
        sb2.append(", title=");
        sb2.append(this.f8943c);
        sb2.append(", selectedItem=");
        sb2.append(this.f8944d);
        sb2.append(", items=");
        return H.p(sb2, this.f8945e, ')');
    }

    public /* synthetic */ d(String str, String str2, c cVar, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "historicalSuggests" : str, str2, cVar, list);
    }
}
