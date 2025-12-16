package nn0;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: MotivationProgramFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn0/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_reward-program"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nn0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44453a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f419152d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f419153b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f419154c;

    static {
        h0 h0Var = new h0(C44453a.class, "showTicketEntry", "getShowTicketEntry()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f419152d = new n[]{n0Var.i(h0Var), C0.k(C44453a.class, "isRewardsEntryPointNetworkEnabled", "isRewardsEntryPointNetworkEnabled()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C44453a() {
        Owners owners = Owners.f210477d0;
        Boolean bool = Boolean.TRUE;
        this.f419153b = A0.u(this, "Точка входа на главной в портал призов с билетиком", "showTicketEntry", bool, false, 0, owners, 56);
        this.f419154c = A0.u(this, "Сетевое взаимодействие точки входа Портала призов (мотивационной программы) на Главной", "isRewardsEntryPointNetworkEnabled", bool, false, 0, owners, 56);
    }
}
