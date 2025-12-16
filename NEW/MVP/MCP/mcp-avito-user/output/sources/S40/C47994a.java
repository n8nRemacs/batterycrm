package s40;

import Y61.k;
import Y61.l;
import com.avito.android.offlinization.j;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OfflineInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls40/a;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C47994a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<j> f437462a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<j> f437463b;

    public C47994a() {
        this(null, null, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47994a)) {
            return false;
        }
        C47994a c47994a = (C47994a) obj;
        return L.f(this.f437462a, c47994a.f437462a) && L.f(this.f437463b, c47994a.f437463b);
    }

    public final int hashCode() {
        return this.f437463b.hashCode() + (this.f437462a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OfflineDetailedInfo(forceIncluded=");
        sb2.append(this.f437462a);
        sb2.append(", excluded=");
        return AK.c.u(sb2, this.f437463b, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47994a(@k Set<? extends j> set, @k Set<? extends j> set2) {
        this.f437462a = set;
        this.f437463b = set2;
    }

    public C47994a(Set set, Set set2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? B0.f406639b : set, (i12 & 2) != 0 ? B0.f406639b : set2);
    }
}
