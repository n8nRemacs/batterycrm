package Dm;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarNavigatorState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LDm/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dm.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C13416c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f3430e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C13416c f3431f = new C13416c(true, false, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3432b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3433c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f3434d;

    /* compiled from: CarNavigatorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDm/c$a;", "", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dm.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13416c() {
        this(false, false, null, 7, null);
    }

    public static C13416c a(C13416c c13416c, boolean z12, boolean z13) {
        String str = c13416c.f3434d;
        c13416c.getClass();
        return new C13416c(z12, z13, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13416c)) {
            return false;
        }
        C13416c c13416c = (C13416c) obj;
        return this.f3432b == c13416c.f3432b && this.f3433c == c13416c.f3433c && L.f(this.f3434d, c13416c.f3434d);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f3432b) * 31, 31, this.f3433c);
        String str = this.f3434d;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarNavigatorState(isLoading=");
        sb2.append(this.f3432b);
        sb2.append(", hasError=");
        sb2.append(this.f3433c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f3434d, ')');
    }

    public /* synthetic */ C13416c(boolean z12, boolean z13, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? null : str);
    }

    public C13416c(boolean z12, boolean z13, @l String str) {
        this.f3432b = z12;
        this.f3433c = z13;
        this.f3434d = str;
    }
}
