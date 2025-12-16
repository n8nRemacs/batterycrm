package F20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiSendContentData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF20/b;", "", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f4494a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f4495b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4496c;

    public b(@k String str, @k String str2, long j12) {
        this.f4494a = str;
        this.f4495b = str2;
        this.f4496c = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f4494a, bVar.f4494a) && L.f(this.f4495b, bVar.f4495b) && this.f4496c == bVar.f4496c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4496c) + H.d(this.f4494a.hashCode() * 31, 31, this.f4495b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSendAnchorData(ident=");
        sb2.append(this.f4494a);
        sb2.append(", title=");
        sb2.append(this.f4495b);
        sb2.append(", ord=");
        return r.u(sb2, this.f4496c, ')');
    }
}
