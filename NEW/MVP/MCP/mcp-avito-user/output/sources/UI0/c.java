package UI0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutsUserInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUI0/c;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16335a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16336b;

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        boolean z12 = false;
        this(z12, z12, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16335a == cVar.f16335a && this.f16336b == cVar.f16336b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16336b) + (Boolean.hashCode(this.f16335a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShortcutsUserInfo(userIsPro=");
        sb2.append(this.f16335a);
        sb2.append(", userInfoIsValid=");
        return r.x(sb2, this.f16336b, ')');
    }

    public c(boolean z12, boolean z13) {
        this.f16335a = z12;
        this.f16336b = z13;
    }

    public /* synthetic */ c(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
    }
}
