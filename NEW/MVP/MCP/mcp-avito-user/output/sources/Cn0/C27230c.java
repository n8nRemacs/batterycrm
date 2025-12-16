package cn0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import bn0.C25683a;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealReviewsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcn0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cn0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C27230c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f58138d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final int f58139b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<C25683a> f58140c;

    /* compiled from: ComfortableDealReviewsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcn0/c$a;", "", "<init>", "()V", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cn0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C27230c(int i12, @k List<C25683a> list) {
        this.f58139b = i12;
        this.f58140c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27230c)) {
            return false;
        }
        C27230c c27230c = (C27230c) obj;
        return this.f58139b == c27230c.f58139b && L.f(this.f58140c, c27230c.f58140c);
    }

    public final int hashCode() {
        return this.f58140c.hashCode() + (Integer.hashCode(this.f58139b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComfortableDealReviewsState(titleRes=");
        sb2.append(this.f58139b);
        sb2.append(", reviews=");
        return H.p(sb2, this.f58140c, ')');
    }
}
