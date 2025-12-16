package pH;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/l;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428407a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f428408b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f428409c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f428410d;

    public l(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
        this.f428407a = str;
        this.f428408b = str2;
        this.f428409c = str3;
        this.f428410d = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f428407a, lVar.f428407a) && L.f(this.f428408b, lVar.f428408b) && L.f(this.f428409c, lVar.f428409c) && L.f(this.f428410d, lVar.f428410d);
    }

    public final int hashCode() {
        return this.f428410d.hashCode() + H.d(H.d(this.f428407a.hashCode() * 31, 31, this.f428408b), 31, this.f428409c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotKnowledgeBanner(title=");
        sb2.append(this.f428407a);
        sb2.append(", description=");
        sb2.append(this.f428408b);
        sb2.append(", imageUrl=");
        sb2.append(this.f428409c);
        sb2.append(", url=");
        return C22026a.c(sb2, this.f428410d, ')');
    }
}
