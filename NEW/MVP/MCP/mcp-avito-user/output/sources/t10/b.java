package T10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientForms.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT10/b;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15277a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15278b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f15279c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15280d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f15281e;

    public b(@k String str, @k String str2, boolean z12, @l String str3, boolean z13) {
        this.f15277a = z12;
        this.f15278b = str;
        this.f15279c = str2;
        this.f15280d = z13;
        this.f15281e = str3;
    }

    public static b a(b bVar, String str) {
        boolean z12 = bVar.f15277a;
        String str2 = bVar.f15278b;
        String str3 = bVar.f15279c;
        boolean z13 = bVar.f15280d;
        bVar.getClass();
        return new b(str2, str3, z12, str, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15277a == bVar.f15277a && L.f(this.f15278b, bVar.f15278b) && L.f(this.f15279c, bVar.f15279c) && this.f15280d == bVar.f15280d && L.f(this.f15281e, bVar.f15281e);
    }

    public final int hashCode() {
        int i12 = r.i(H.d(H.d(Boolean.hashCode(this.f15277a) * 31, 31, this.f15278b), 31, this.f15279c), 31, this.f15280d);
        String str = this.f15281e;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationClientFormField(isRequired=");
        sb2.append(this.f15277a);
        sb2.append(", placeholder=");
        sb2.append(this.f15278b);
        sb2.append(", title=");
        sb2.append(this.f15279c);
        sb2.append(", isMasked=");
        sb2.append(this.f15280d);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f15281e, ')');
    }
}
