package DH0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GroupItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDH0/e;", "LDH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f3137b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f3138c;

    public e(@k String str, @k String str2) {
        this.f3137b = str;
        this.f3138c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f3137b, eVar.f3137b) && L.f(this.f3138c, eVar.f3138c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266981b() {
        return this.f3137b;
    }

    public final int hashCode() {
        return this.f3138c.hashCode() + (this.f3137b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupTitleItem(stringId=");
        sb2.append(this.f3137b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f3138c, ')');
    }
}
