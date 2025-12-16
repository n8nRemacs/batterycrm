package Po0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SbcAutoDispatchesState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPo0/e;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Po0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C14821e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13301a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13302b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13303c;

    public C14821e(@k String str, boolean z12, long j12) {
        this.f13301a = z12;
        this.f13302b = str;
        this.f13303c = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14821e)) {
            return false;
        }
        C14821e c14821e = (C14821e) obj;
        return this.f13301a == c14821e.f13301a && this.f13302b.equals(c14821e.f13302b) && this.f13303c == c14821e.f13303c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13303c) + H.d(Boolean.hashCode(this.f13301a) * 31, 31, this.f13302b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabItem(isActive=");
        sb2.append(this.f13301a);
        sb2.append(", name=");
        sb2.append(this.f13302b);
        sb2.append(", id=");
        return r.u(sb2, this.f13303c, ')');
    }
}
