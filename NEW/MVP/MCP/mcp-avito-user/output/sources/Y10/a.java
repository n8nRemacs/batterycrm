package Y10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationContactInfoBlock.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY10/a;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f19258a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<b> f19259b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19260c;

    public a(@k String str, @k List<b> list, boolean z12) {
        this.f19258a = str;
        this.f19259b = list;
        this.f19260c = z12;
    }

    public static a a(a aVar, ArrayList arrayList, int i12) {
        String str = aVar.f19258a;
        boolean z12 = (i12 & 4) != 0 ? aVar.f19260c : true;
        aVar.getClass();
        return new a(str, arrayList, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f19258a, aVar.f19258a) && L.f(this.f19259b, aVar.f19259b) && this.f19260c == aVar.f19260c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19260c) + H.e(this.f19258a.hashCode() * 31, 31, this.f19259b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationContactInfoBlock(title=");
        sb2.append(this.f19258a);
        sb2.append(", content=");
        sb2.append(this.f19259b);
        sb2.append(", isUpdated=");
        return r.x(sb2, this.f19260c, ')');
    }
}
