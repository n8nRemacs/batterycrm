package Gw;

import Ww.C15804b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HelpCenterState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LGw/d;", "", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f6797c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final d f6798d = new d(P2.c.f318721a, false);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final P2<C15804b> f6799a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6800b;

    /* compiled from: HelpCenterState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGw/d$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k P2<? super C15804b> p22, boolean z12) {
        this.f6799a = p22;
        this.f6800b = z12;
    }

    public static d a(d dVar, P2 p22, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            p22 = dVar.f6799a;
        }
        if ((i12 & 2) != 0) {
            z12 = dVar.f6800b;
        }
        dVar.getClass();
        return new d(p22, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f6799a, dVar.f6799a) && this.f6800b == dVar.f6800b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6800b) + (this.f6799a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HelpCenterState(regionalManager=");
        sb2.append(this.f6799a);
        sb2.append(", useNavigationV2=");
        return r.x(sb2, this.f6800b, ')');
    }
}
