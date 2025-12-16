package Ke0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MergedPretendPremoderationState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LKe0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f9588d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final d f9589e = new d(true, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9590b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f9591c;

    /* compiled from: MergedPretendPremoderationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKe0/d$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(boolean z12, @l String str) {
        this.f9590b = z12;
        this.f9591c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9590b == dVar.f9590b && L.f(this.f9591c, dVar.f9591c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f9590b) * 31;
        String str = this.f9591c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MergedPretendPremoderationState(isLoading=");
        sb2.append(this.f9590b);
        sb2.append(", error=");
        return C22026a.c(sb2, this.f9591c, ')');
    }
}
