package ln0;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: RewardBugEntryFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lln0/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ln0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43803a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f414191d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f414192b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f414193c;

    static {
        h0 h0Var = new h0(C43803a.class, "rewardBugEntryEnabled", "getRewardBugEntryEnabled()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f414191d = new n[]{n0Var.i(h0Var), C0.k(C43803a.class, "shortRewardFloatingEntryPolling", "getShortRewardFloatingEntryPolling()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C43803a() {
        Owners owners = Owners.f210477d0;
        Boolean bool = Boolean.FALSE;
        this.f414192b = A0.u(this, "Точка входа на штору мотивации через жучок", "reward_bug_entry_enabled", bool, false, 0, owners, 56);
        this.f414193c = A0.u(this, "Короткий поллинг(10 минут) для плавающей точки входа", "short_reward_floating_entry_polling", bool, false, 0, owners, 56);
    }
}
