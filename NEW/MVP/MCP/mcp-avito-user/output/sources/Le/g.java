package lE;

import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: UserStatsFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlE/g;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends A0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f413657e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f413658b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f413659c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f413660d;

    static {
        h0 h0Var = new h0(g.class, "userStatsForOneItem", "getUserStatsForOneItem()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f413657e = new n[]{n0Var.i(h0Var), C0.k(g.class, "chartPositionInSearch", "getChartPositionInSearch()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(g.class, "localSend2744Event", "getLocalSend2744Event()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public g() {
        Owners owners = Owners.f210546u3;
        Boolean bool = Boolean.TRUE;
        this.f413658b = A0.u(this, "КО для статы по 1му объявлению", "userStatsOneItem", bool, false, 0, owners, 56);
        this.f413659c = A0.u(this, "График с позицией в поиске", "chart_position_in_search", bool, false, 0, owners, 56);
        this.f413660d = A0.u(this, "Отправка 2744 события локально", "local_send_2744_event", bool, false, 0, owners, 56);
    }
}
