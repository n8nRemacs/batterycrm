package oQ0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoQ0/c;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oQ0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C44681c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f419765a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f419766b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f419767c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f419768d;

    public C44681c() {
        this(null, false, false, false, 15, null);
    }

    public static C44681c a(C44681c c44681c, boolean z12, boolean z13) {
        List<com.avito.conveyor_item.a> list = c44681c.f419765a;
        c44681c.getClass();
        return new C44681c(list, false, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44681c)) {
            return false;
        }
        C44681c c44681c = (C44681c) obj;
        return L.f(this.f419765a, c44681c.f419765a) && this.f419766b == c44681c.f419766b && this.f419767c == c44681c.f419767c && this.f419768d == c44681c.f419768d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f419768d) + r.i(r.i(this.f419765a.hashCode() * 31, 31, this.f419766b), 31, this.f419767c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigState(list=");
        sb2.append(this.f419765a);
        sb2.append(", isContent=");
        sb2.append(this.f419766b);
        sb2.append(", isLoading=");
        sb2.append(this.f419767c);
        sb2.append(", isError=");
        return r.x(sb2, this.f419768d, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C44681c(@k List<? extends com.avito.conveyor_item.a> list, boolean z12, boolean z13, boolean z14) {
        this.f419765a = list;
        this.f419766b = z12;
        this.f419767c = z13;
        this.f419768d = z14;
    }

    public C44681c(List list, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? true : z13, (i12 & 8) != 0 ? false : z14);
    }
}
