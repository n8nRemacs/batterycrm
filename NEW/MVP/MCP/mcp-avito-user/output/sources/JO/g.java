package JO;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.imv.MarketValueItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InstantMarketValueItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJO/g;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f8949b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<MarketValueItem> f8950c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8951d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f8952e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8953f;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.k String str, @Y61.k List<? extends MarketValueItem> list, boolean z12, @Y61.l Integer num, boolean z13) {
        this.f8949b = str;
        this.f8950c = list;
        this.f8951d = z12;
        this.f8952e = num;
        this.f8953f = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f8949b, gVar.f8949b) && L.f(this.f8950c, gVar.f8950c) && this.f8951d == gVar.f8951d && L.f(this.f8952e, gVar.f8952e) && this.f8953f == gVar.f8953f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84833b() {
        return getF130049b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130049b() {
        return this.f8949b;
    }

    public final int hashCode() {
        int i12 = r.i(H.e(this.f8949b.hashCode() * 31, 31, this.f8950c), 31, this.f8951d);
        Integer num = this.f8952e;
        return Boolean.hashCode(this.f8953f) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstantMarketValueItem(stringId=");
        sb2.append(this.f8949b);
        sb2.append(", elements=");
        sb2.append(this.f8950c);
        sb2.append(", isLoading=");
        sb2.append(this.f8951d);
        sb2.append(", categoryId=");
        sb2.append(this.f8952e);
        sb2.append(", shouldHideLoading=");
        return r.x(sb2, this.f8953f, ')');
    }

    public /* synthetic */ g(String str, List list, boolean z12, Integer num, boolean z13, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? false : z12, num, (i12 & 16) != 0 ? false : z13);
    }
}
