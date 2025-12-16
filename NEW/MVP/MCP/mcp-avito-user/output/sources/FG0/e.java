package fg0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PushTokenDataProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfg0/e;", "", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f396036a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f396037b;

    public e(@k String str, @l String str2) {
        this.f396036a = str;
        this.f396037b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f396036a, eVar.f396036a) && L.f(this.f396037b, eVar.f396037b);
    }

    public final int hashCode() {
        int iHashCode = this.f396036a.hashCode() * 31;
        String str = this.f396037b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PushTokenProviderData(pushToken=");
        sb2.append(this.f396036a);
        sb2.append(", pushTokenProvider=");
        return C22026a.c(sb2, this.f396037b, ')');
    }
}
