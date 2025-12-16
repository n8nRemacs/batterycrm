package ce;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.RadioState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FactorUnavailableReasonState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lce/b;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ce.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C27181b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58058a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58059b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RadioState f58060c;

    public C27181b() {
        this(false, false, null, 7, null);
    }

    public static C27181b a(C27181b c27181b, boolean z12, boolean z13, RadioState radioState, int i12) {
        if ((i12 & 1) != 0) {
            z12 = c27181b.f58058a;
        }
        if ((i12 & 2) != 0) {
            z13 = c27181b.f58059b;
        }
        if ((i12 & 4) != 0) {
            radioState = c27181b.f58060c;
        }
        c27181b.getClass();
        return new C27181b(z12, z13, radioState);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27181b)) {
            return false;
        }
        C27181b c27181b = (C27181b) obj;
        return this.f58058a == c27181b.f58058a && this.f58059b == c27181b.f58059b && this.f58060c == c27181b.f58060c;
    }

    public final int hashCode() {
        return this.f58060c.hashCode() + r.i(Boolean.hashCode(this.f58058a) * 31, 31, this.f58059b);
    }

    @k
    public final String toString() {
        return "FactorUnavailableReasonState(isEmptyError=" + this.f58058a + ", isLoading=" + this.f58059b + ", radioState=" + this.f58060c + ')';
    }

    public C27181b(boolean z12, boolean z13, @k RadioState radioState) {
        this.f58058a = z12;
        this.f58059b = z13;
        this.f58060c = radioState;
    }

    public /* synthetic */ C27181b(boolean z12, boolean z13, RadioState radioState, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? RadioState.f93165b : radioState);
    }
}
