package HY;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChannelBadgeTag.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f7137a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7138b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f7139c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f7140d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f7141e;

    public b(@Y61.k String str, @Y61.k String str2, long j12, @Y61.k String str3, @Y61.k String str4) {
        this.f7137a = str;
        this.f7138b = j12;
        this.f7139c = str2;
        this.f7140d = str3;
        this.f7141e = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f7137a, bVar.f7137a) && this.f7138b == bVar.f7138b && L.f(this.f7139c, bVar.f7139c) && L.f(this.f7140d, bVar.f7140d) && L.f(this.f7141e, bVar.f7141e);
    }

    public final int hashCode() {
        return this.f7141e.hashCode() + H.d(H.d(r.g(this.f7137a.hashCode() * 31, 31, this.f7138b), 31, this.f7139c), 31, this.f7140d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelBadgeTag(messageId=");
        sb2.append(this.f7137a);
        sb2.append(", badgeTagId=");
        sb2.append(this.f7138b);
        sb2.append(", title=");
        sb2.append(this.f7139c);
        sb2.append(", textColor=");
        sb2.append(this.f7140d);
        sb2.append(", backgroundColor=");
        return C22026a.c(sb2, this.f7141e, ')');
    }
}
