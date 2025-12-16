package JO;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectableItemsSection.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJO/n;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class n implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f8977b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f8978c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f8979d;

    public n(@Y61.l String str, @Y61.k ArrayList arrayList) {
        this.f8977b = str;
        this.f8978c = arrayList;
        this.f8979d = str == null ? "" : str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return n.class.equals(obj != null ? obj.getClass() : null) && L.f(this.f8979d, ((n) obj).f8979d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162200b() {
        return getF8979d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF8979d() {
        return this.f8979d;
    }

    public final int hashCode() {
        return this.f8979d.hashCode();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectableItemsSection(title=");
        sb2.append(this.f8977b);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f8978c, ')');
    }
}
