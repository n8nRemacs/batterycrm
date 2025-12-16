package OH0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortTermRentItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOH0/d;", "LOH0/c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12159b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f12160c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f12161d;

    public d(@k String str, @k String str2, @k String str3) {
        this.f12159b = str;
        this.f12160c = str2;
        this.f12161d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f12159b, dVar.f12159b) && L.f(this.f12160c, dVar.f12160c) && L.f(this.f12161d, dVar.f12161d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF310044b() {
        return this.f12159b;
    }

    public final int hashCode() {
        return this.f12161d.hashCode() + H.d(this.f12159b.hashCode() * 31, 31, this.f12160c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShortTermRentParameterItem(stringId=");
        sb2.append(this.f12159b);
        sb2.append(", title=");
        sb2.append(this.f12160c);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f12161d, ')');
    }
}
