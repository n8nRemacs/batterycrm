package i3;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import k3.InterfaceC42487e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PullToRefreshStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Li3/a;", "", "a", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C41216a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C11365a f398349d = new C11365a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f398350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f398351b;

    /* renamed from: c, reason: collision with root package name */
    public final int f398352c;

    /* compiled from: PullToRefreshStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li3/a$a;", "Lk3/e;", "Li3/a;", "<init>", "()V", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: i3.a$a, reason: collision with other inner class name */
    public static final class C11365a implements InterfaceC42487e<C41216a> {
        public /* synthetic */ C11365a(C42822w c42822w) {
            this();
        }

        public C11365a() {
        }
    }

    public C41216a() {
        this(0, 0, 0, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41216a)) {
            return false;
        }
        C41216a c41216a = (C41216a) obj;
        return this.f398350a == c41216a.f398350a && this.f398351b == c41216a.f398351b && this.f398352c == c41216a.f398352c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f398352c) + r.e(this.f398351b, Integer.hashCode(this.f398350a) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PullToRefreshStyle(spinnerColor=");
        sb2.append(this.f398350a);
        sb2.append(", spinnerSize=");
        sb2.append(this.f398351b);
        sb2.append(", spinnerThickness=");
        return r.t(sb2, this.f398352c, ')');
    }

    public C41216a(int i12, int i13, int i14) {
        this.f398350a = i12;
        this.f398351b = i13;
        this.f398352c = i14;
    }

    public /* synthetic */ C41216a(int i12, int i13, int i14, int i15, C42822w c42822w) {
        this((i15 & 1) != 0 ? 0 : i12, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 0 : i14);
    }
}
