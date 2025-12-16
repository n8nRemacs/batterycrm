package X50;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Specific.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX50/d;", "", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f18587a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f18588b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f18589c;

    public d(int i12, @k String str, @k String str2) {
        this.f18587a = i12;
        this.f18588b = str;
        this.f18589c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18587a == dVar.f18587a && L.f(this.f18588b, dVar.f18588b) && L.f(this.f18589c, dVar.f18589c);
    }

    public final int hashCode() {
        return this.f18589c.hashCode() + H.d(Integer.hashCode(this.f18587a) * 31, 31, this.f18588b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Specific(id=");
        sb2.append(this.f18587a);
        sb2.append(", name=");
        sb2.append(this.f18588b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f18589c, ')');
    }
}
