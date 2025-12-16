package k3;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChangeAttempt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lk3/a;", "T", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C42483a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f406027a;

    /* renamed from: b, reason: collision with root package name */
    public final T f406028b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f406029c;

    public C42483a(T t12, T t13) {
        this.f406027a = t12;
        this.f406028b = t13;
        this.f406029c = L.f(t12, t13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42483a)) {
            return false;
        }
        C42483a c42483a = (C42483a) obj;
        return L.f(this.f406027a, c42483a.f406027a) && L.f(this.f406028b, c42483a.f406028b);
    }

    public final int hashCode() {
        T t12 = this.f406027a;
        int iHashCode = (t12 == null ? 0 : t12.hashCode()) * 31;
        T t13 = this.f406028b;
        return iHashCode + (t13 != null ? t13.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeAttempt(new=");
        sb2.append(this.f406027a);
        sb2.append(", old=");
        return H.n(sb2, this.f406028b, ')');
    }
}
