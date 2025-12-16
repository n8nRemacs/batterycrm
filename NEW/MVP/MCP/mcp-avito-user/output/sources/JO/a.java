package JO;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AccordionSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJO/a;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f8933b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f8934c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8935d;

    public a(@Y61.k String str, @Y61.k String str2, boolean z12) {
        this.f8933b = str;
        this.f8934c = str2;
        this.f8935d = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f8933b, aVar.f8933b) && L.f(this.f8934c, aVar.f8934c) && this.f8935d == aVar.f8935d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return getF217853b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217853b() {
        return this.f8933b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8935d) + H.d(this.f8933b.hashCode() * 31, 31, this.f8934c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccordionSlotItem(stringId=");
        sb2.append(this.f8933b);
        sb2.append(", title=");
        sb2.append(this.f8934c);
        sb2.append(", isExpanded=");
        return r.x(sb2, this.f8935d, ')');
    }
}
