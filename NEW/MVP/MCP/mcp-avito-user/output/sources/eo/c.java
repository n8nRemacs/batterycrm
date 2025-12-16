package EO;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.item_price_history.presentation.mvi.entity.ScreenState;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistoryState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LEO/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f4001f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f4002g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BO.a f4003b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f4004c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ScreenState f4005d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4006e;

    /* compiled from: ItemPriceHistoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEO/c$a;", "", "<init>", "()V", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f4002g = new c(new BO.a(c42784z0, 0), new d(c42784z0), ScreenState.f173810b, false);
    }

    public c(@k BO.a aVar, @k d dVar, @k ScreenState screenState, boolean z12) {
        this.f4003b = aVar;
        this.f4004c = dVar;
        this.f4005d = screenState;
        this.f4006e = z12;
    }

    public static c a(c cVar, BO.a aVar, d dVar, ScreenState screenState, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            aVar = cVar.f4003b;
        }
        if ((i12 & 2) != 0) {
            dVar = cVar.f4004c;
        }
        if ((i12 & 4) != 0) {
            screenState = cVar.f4005d;
        }
        if ((i12 & 8) != 0) {
            z12 = cVar.f4006e;
        }
        cVar.getClass();
        return new c(aVar, dVar, screenState, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f4003b, cVar.f4003b) && L.f(this.f4004c, cVar.f4004c) && this.f4005d == cVar.f4005d && this.f4006e == cVar.f4006e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4006e) + ((this.f4005d.hashCode() + H.e(this.f4003b.hashCode() * 31, 31, this.f4004c.f4007a)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemPriceHistoryState(data=");
        sb2.append(this.f4003b);
        sb2.append(", viewState=");
        sb2.append(this.f4004c);
        sb2.append(", screenState=");
        sb2.append(this.f4005d);
        sb2.append(", favorite=");
        return r.x(sb2, this.f4006e, ')');
    }
}
