package Ta;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiItemCopyItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTa/b;", "Lcom/avito/conveyor_item/a;", "_avito_advert-multi-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15730b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f15731c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f15732d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f15733e;

    public b(@k String str, @k String str2, @k DeepLink deepLink, @k String str3) {
        this.f15730b = str;
        this.f15731c = str2;
        this.f15732d = deepLink;
        this.f15733e = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f15730b, bVar.f15730b) && L.f(this.f15731c, bVar.f15731c) && L.f(this.f15732d, bVar.f15732d) && L.f(this.f15733e, bVar.f15733e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78357k() {
        return getF15730b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF15730b() {
        return this.f15730b;
    }

    public final int hashCode() {
        return this.f15733e.hashCode() + com.avito.android.actions_sheet.a.e(this.f15732d, H.d(this.f15730b.hashCode() * 31, 31, this.f15731c), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiItemCopyItem(stringId=");
        sb2.append(this.f15730b);
        sb2.append(", buttonText=");
        sb2.append(this.f15731c);
        sb2.append(", deeplink=");
        sb2.append(this.f15732d);
        sb2.append(", iconName=");
        return C22026a.c(sb2, this.f15733e, ')');
    }
}
