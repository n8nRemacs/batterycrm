package Ly0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.StrSellerCalendarRejectInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarRejectState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LLy0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f10310d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final StrSellerCalendarRejectInfo f10311b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f10312c;

    /* compiled from: StrCalendarRejectState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLy0/c$a;", "", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k StrSellerCalendarRejectInfo strSellerCalendarRejectInfo, @k d dVar) {
        this.f10311b = strSellerCalendarRejectInfo;
        this.f10312c = dVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f10311b, cVar.f10311b) && L.f(this.f10312c, cVar.f10312c);
    }

    public final int hashCode() {
        return this.f10312c.hashCode() + (this.f10311b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "StrCalendarRejectState(data=" + this.f10311b + ", viewState=" + this.f10312c + ')';
    }
}
