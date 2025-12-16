package K90;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LK90/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f9292e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f9293f = new c(false, false, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9294b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9295c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, ProfileRemovalScreen> f9296d;

    /* compiled from: ProfileRemoveState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LK90/c$a;", "", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(false, false, null, 7, null);
    }

    public static c a(c cVar, boolean z12, boolean z13) {
        Map<String, ProfileRemovalScreen> map = cVar.f9296d;
        cVar.getClass();
        return new c(z12, z13, map);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9294b == cVar.f9294b && this.f9295c == cVar.f9295c && L.f(this.f9296d, cVar.f9296d);
    }

    public final int hashCode() {
        return this.f9296d.hashCode() + r.i(Boolean.hashCode(this.f9294b) * 31, 31, this.f9295c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileRemoveState(isLoading=");
        sb2.append(this.f9294b);
        sb2.append(", isError=");
        sb2.append(this.f9295c);
        sb2.append(", screens=");
        return r.w(sb2, this.f9296d, ')');
    }

    public /* synthetic */ c(boolean z12, boolean z13, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? P0.c() : map);
    }

    public c(boolean z12, boolean z13, @k Map<String, ProfileRemovalScreen> map) {
        this.f9294b = z12;
        this.f9295c = z13;
        this.f9296d = map;
    }
}
