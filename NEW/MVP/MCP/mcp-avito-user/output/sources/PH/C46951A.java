package pH;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/A;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pH.A, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C46951A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428296a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f428297b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f428298c;

    public C46951A(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        this.f428296a = str;
        this.f428297b = str2;
        this.f428298c = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46951A)) {
            return false;
        }
        C46951A c46951a = (C46951A) obj;
        return L.f(this.f428296a, c46951a.f428296a) && L.f(this.f428297b, c46951a.f428297b) && L.f(this.f428298c, c46951a.f428298c);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f428296a.hashCode() * 31, 31, this.f428297b);
        String str = this.f428298c;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Hint(title=");
        sb2.append(this.f428296a);
        sb2.append(", subtitle=");
        sb2.append(this.f428297b);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.f428298c, ')');
    }
}
