package iI;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestChild.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiI/b;", "", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C41290b {

    /* renamed from: a, reason: collision with root package name */
    public final int f398466a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f398467b;

    public C41290b(int i12, @k String str) {
        this.f398466a = i12;
        this.f398467b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41290b)) {
            return false;
        }
        C41290b c41290b = (C41290b) obj;
        return this.f398466a == c41290b.f398466a && L.f(this.f398467b, c41290b.f398467b);
    }

    public final int hashCode() {
        return this.f398467b.hashCode() + (Integer.hashCode(this.f398466a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestChild(childId=");
        sb2.append(this.f398466a);
        sb2.append(", ageId=");
        return C22026a.c(sb2, this.f398467b, ')');
    }
}
