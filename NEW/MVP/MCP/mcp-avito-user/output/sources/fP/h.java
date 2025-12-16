package fp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomState.kt */
@P
@J41.b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfp/h;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f396122a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f396124c;

    public h(int i12, @k String str, int i13) {
        this.f396122a = i12;
        this.f396123b = str;
        this.f396124c = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f396122a == hVar.f396122a && L.f(this.f396123b, hVar.f396123b) && this.f396124c == hVar.f396124c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f396124c) + H.d(Integer.hashCode(this.f396122a) * 31, 31, this.f396123b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LargeBadge(imageResource=");
        sb2.append(this.f396122a);
        sb2.append(", title=");
        sb2.append(this.f396123b);
        sb2.append(", subtitleResource=");
        return r.t(sb2, this.f396124c, ')');
    }
}
