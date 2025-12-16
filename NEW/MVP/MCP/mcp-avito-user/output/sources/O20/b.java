package o20;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParticipantCloseDialog.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo20/b;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f419317a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f419318b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f419319c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f419320d;

    public b(@k String str, @k String str2, @k String str3, @k String str4) {
        this.f419317a = str;
        this.f419318b = str2;
        this.f419319c = str3;
        this.f419320d = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f419317a, bVar.f419317a) && L.f(this.f419318b, bVar.f419318b) && L.f(this.f419319c, bVar.f419319c) && L.f(this.f419320d, bVar.f419320d);
    }

    public final int hashCode() {
        return this.f419320d.hashCode() + H.d(H.d(this.f419317a.hashCode() * 31, 31, this.f419318b), 31, this.f419319c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParticipantCloseDialog(title=");
        sb2.append(this.f419317a);
        sb2.append(", description=");
        sb2.append(this.f419318b);
        sb2.append(", declineAction=");
        sb2.append(this.f419319c);
        sb2.append(", confirmAction=");
        return C22026a.c(sb2, this.f419320d, ')');
    }
}
