package Vx;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvertInfoState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LVx/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f17520d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f17521e = new c(null, new d(null, null, null, null, null));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final EarlyAccessAdvert f17522b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f17523c;

    /* compiled from: EarlyAccessAdvertInfoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVx/c$a;", "", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l EarlyAccessAdvert earlyAccessAdvert, @k d dVar) {
        this.f17522b = earlyAccessAdvert;
        this.f17523c = dVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f17522b, cVar.f17522b) && L.f(this.f17523c, cVar.f17523c);
    }

    public final int hashCode() {
        EarlyAccessAdvert earlyAccessAdvert = this.f17522b;
        return this.f17523c.hashCode() + ((earlyAccessAdvert == null ? 0 : earlyAccessAdvert.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "EarlyAccessAdvertInfoState(data=" + this.f17522b + ", viewState=" + this.f17523c + ')';
    }
}
