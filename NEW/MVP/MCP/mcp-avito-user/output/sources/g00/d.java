package G00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PersonFormStaticViewContent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG00/d;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f6160a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6161b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6162c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6163d;

    public d() {
        this(null, 0, 0, false, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f6160a, dVar.f6160a) && this.f6161b == dVar.f6161b && this.f6162c == dVar.f6162c && this.f6163d == dVar.f6163d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6163d) + r.e(this.f6162c, r.e(this.f6161b, this.f6160a.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersonFormStaticViewContent(screenTitle=");
        sb2.append(this.f6160a);
        sb2.append(", currentStepNum=");
        sb2.append(this.f6161b);
        sb2.append(", allStepsNum=");
        sb2.append(this.f6162c);
        sb2.append(", isFirstStep=");
        return r.x(sb2, this.f6163d, ')');
    }

    public d(int i12, int i13, @k String str, boolean z12) {
        this.f6160a = str;
        this.f6161b = i12;
        this.f6162c = i13;
        this.f6163d = z12;
    }

    public /* synthetic */ d(String str, int i12, int i13, boolean z12, int i14, C42822w c42822w) {
        this((i14 & 2) != 0 ? 1 : i12, (i14 & 4) != 0 ? 1 : i13, (i14 & 1) != 0 ? "" : str, (i14 & 8) != 0 ? true : z12);
    }
}
