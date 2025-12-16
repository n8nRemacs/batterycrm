package G00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PersonFormErrorsCounterState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG00/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f6134a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6135b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6136c;

    public a(int i12, int i13, boolean z12) {
        this.f6134a = i12;
        this.f6135b = i13;
        this.f6136c = z12;
    }

    public static a a(a aVar, int i12, int i13, boolean z12, int i14) {
        if ((i14 & 1) != 0) {
            i12 = aVar.f6134a;
        }
        if ((i14 & 2) != 0) {
            i13 = aVar.f6135b;
        }
        if ((i14 & 4) != 0) {
            z12 = aVar.f6136c;
        }
        aVar.getClass();
        return new a(i12, i13, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6134a == aVar.f6134a && this.f6135b == aVar.f6135b && this.f6136c == aVar.f6136c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6136c) + r.e(this.f6135b, Integer.hashCode(this.f6134a) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersonFormErrorsCounterState(errorsCount=");
        sb2.append(this.f6134a);
        sb2.append(", lastScrollTargetError=");
        sb2.append(this.f6135b);
        sb2.append(", isVisible=");
        return r.x(sb2, this.f6136c, ')');
    }

    public /* synthetic */ a(int i12, int i13, boolean z12, int i14, C42822w c42822w) {
        this(i12, (i14 & 2) != 0 ? -1 : i13, (i14 & 4) != 0 ? true : z12);
    }
}
