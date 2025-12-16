package mz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lz0.C43851a;

/* compiled from: StrOrdersState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmz0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C44158c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f414839d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C44158c f414840e = new C44158c(C42784z0.f406748b, 0);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<C43851a> f414841b;

    /* renamed from: c, reason: collision with root package name */
    public final int f414842c;

    /* compiled from: StrOrdersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmz0/c$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mz0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44158c(@k List<C43851a> list, int i12) {
        this.f414841b = list;
        this.f414842c = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44158c)) {
            return false;
        }
        C44158c c44158c = (C44158c) obj;
        return L.f(this.f414841b, c44158c.f414841b) && this.f414842c == c44158c.f414842c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f414842c) + (this.f414841b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersState(tabs=");
        sb2.append(this.f414841b);
        sb2.append(", selectedTabPosition=");
        return r.t(sb2, this.f414842c, ')');
    }
}
