package cq;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecallResult.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcq/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C39396a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f392955a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f392956b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f392957c;

    public C39396a(@k String str, @k String str2, boolean z12) {
        this.f392955a = str;
        this.f392956b = str2;
        this.f392957c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39396a)) {
            return false;
        }
        C39396a c39396a = (C39396a) obj;
        return L.f(this.f392955a, c39396a.f392955a) && L.f(this.f392956b, c39396a.f392956b) && this.f392957c == c39396a.f392957c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f392957c) + H.d(this.f392955a.hashCode() * 31, 31, this.f392956b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecallResult(requestId=");
        sb2.append(this.f392955a);
        sb2.append(", message=");
        sb2.append(this.f392956b);
        sb2.append(", isError=");
        return r.x(sb2, this.f392957c, ')');
    }
}
