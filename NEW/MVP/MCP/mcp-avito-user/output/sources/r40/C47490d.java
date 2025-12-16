package r40;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import okio.Y;
import x40.C49761a;

/* compiled from: OfflineInnerCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr40/d;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: r40.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C47490d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C49761a f429580a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y f429581b;

    public C47490d(@k C49761a c49761a, @k Y y12) {
        this.f429580a = c49761a;
        this.f429581b = y12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47490d)) {
            return false;
        }
        C47490d c47490d = (C47490d) obj;
        return this.f429580a.equals(c47490d.f429580a) && this.f429581b.equals(c47490d.f429581b);
    }

    public final int hashCode() {
        return this.f429581b.hashCode() + (this.f429580a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "CacheResponse(entry=" + this.f429580a + ", bodySource=" + this.f429581b + ')';
    }
}
