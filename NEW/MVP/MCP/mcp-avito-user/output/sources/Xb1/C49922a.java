package xb1;

import AK.c;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuthResultModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxb1/a;", "", "library_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: xb1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C49922a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f442572a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f442573b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f442574c;

    public C49922a() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49922a)) {
            return false;
        }
        C49922a c49922a = (C49922a) obj;
        return L.f(this.f442572a, c49922a.f442572a) && L.f(this.f442573b, c49922a.f442573b) && L.f(this.f442574c, c49922a.f442574c);
    }

    public final int hashCode() {
        String str = this.f442572a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f442573b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f442574c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuthResultModel(authCode=");
        sb2.append(this.f442572a);
        sb2.append(", nonce=");
        sb2.append(this.f442573b);
        sb2.append(", errorDescription=");
        return c.s(sb2, this.f442574c, ")");
    }

    public C49922a(@l String str, @l String str2, @l String str3) {
        this.f442572a = str;
        this.f442573b = str2;
        this.f442574c = str3;
    }

    public /* synthetic */ C49922a(String str, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
    }
}
