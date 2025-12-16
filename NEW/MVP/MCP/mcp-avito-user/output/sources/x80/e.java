package X80;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/e;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f18695a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18696b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18697c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f18698d;

    public e(long j12, boolean z12, @Y61.k String str, @Y61.k String str2) {
        this.f18695a = str;
        this.f18696b = z12;
        this.f18697c = j12;
        this.f18698d = str2;
    }

    public static e a(e eVar, boolean z12) {
        String str = eVar.f18695a;
        long j12 = eVar.f18697c;
        String str2 = eVar.f18698d;
        eVar.getClass();
        return new e(j12, z12, str, str2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f18695a, eVar.f18695a) && this.f18696b == eVar.f18696b && this.f18697c == eVar.f18697c && L.f(this.f18698d, eVar.f18698d);
    }

    public final int hashCode() {
        return this.f18698d.hashCode() + r.g(r.i(this.f18695a.hashCode() * 31, 31, this.f18696b), 31, this.f18697c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodInfoNextPageBlock(blockId=");
        sb2.append(this.f18695a);
        sb2.append(", isLoading=");
        sb2.append(this.f18696b);
        sb2.append(", nextPageOffset=");
        sb2.append(this.f18697c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f18698d, ')');
    }
}
