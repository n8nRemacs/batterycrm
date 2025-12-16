package SN;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsFakedoor.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSN/b;", "", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f14943a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f14944b;

    public b(@k String str, @k ArrayList arrayList) {
        this.f14943a = str;
        this.f14944b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f14943a, bVar.f14943a) && this.f14944b.equals(bVar.f14944b);
    }

    public final int hashCode() {
        return this.f14944b.hashCode() + (this.f14943a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsFakedoorBlock(title=");
        sb2.append(this.f14943a);
        sb2.append(", widgets=");
        return e.p(sb2, this.f14944b, ')');
    }
}
