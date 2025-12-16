package dr0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SendEsiaDataUiState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldr0/d;", "", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dr0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C39792d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f394160a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f394161b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C39792d() {
        boolean z12 = false;
        this(z12, z12, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39792d)) {
            return false;
        }
        C39792d c39792d = (C39792d) obj;
        return this.f394160a == c39792d.f394160a && this.f394161b == c39792d.f394161b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f394161b) + (Boolean.hashCode(this.f394160a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendEsiaDataUiState(isLoading=");
        sb2.append(this.f394160a);
        sb2.append(", isError=");
        return r.x(sb2, this.f394161b, ')');
    }

    public C39792d(boolean z12, boolean z13) {
        this.f394160a = z12;
        this.f394161b = z13;
    }

    public /* synthetic */ C39792d(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? false : z13);
    }
}
