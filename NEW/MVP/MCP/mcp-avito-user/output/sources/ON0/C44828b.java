package on0;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.reward_program.ab_tests.configs.OctoberRewardTestGroup;
import com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import nn0.C44453a;
import pn0.C47116a;
import pn0.C47117b;
import u3.h;
import u3.l;

/* compiled from: MotivationProgramAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lon0/b;", "Lon0/a;", "_avito-discouraged_avito-feature_reward-program"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: on0.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44828b implements InterfaceC44827a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f420174a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC27642e f420175b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C44453a f420176c;

    @Inject
    public C44828b(@k c0 c0Var, @k InterfaceC27642e interfaceC27642e, @k C44453a c44453a) {
        this.f420174a = c0Var;
        this.f420175b = interfaceC27642e;
        this.f420176c = c44453a;
    }

    @Override // on0.InterfaceC44827a
    @k
    public final l<ShowTicketEntryTestGroup> a() {
        return new l<>(this.f420175b.c(new C47117b(this.f420176c)), this.f420174a);
    }

    @Override // on0.InterfaceC44827a
    @k
    public final h<OctoberRewardTestGroup> b() {
        return new h<>(this.f420175b.c(new C47116a()));
    }
}
