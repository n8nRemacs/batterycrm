package pn0;

import Y61.k;
import com.avito.android.ownership.Owners;
import com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import nn0.C44453a;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: ShowTicketEntryTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpn0/b;", "Lu3/d;", "Lcom/avito/android/reward_program/ab_tests/configs/ShowTicketEntryTestGroup;", "_avito-discouraged_avito-feature_reward-program"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pn0.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47117b extends AbstractC48780d<ShowTicketEntryTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C44453a f428760a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f428761b = "reward_entry_point_main_empty_cart";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f428762c;

    public C47117b(@k C44453a c44453a) {
        this.f428760a = c44453a;
        Owners owners = Owners.f210476d;
        this.f428762c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF428762c() {
        return this.f428762c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF428761b() {
        return this.f428761b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return ShowTicketEntryTestGroup.f255684c;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (ShowTicketEntryTestGroup[]) ((AbstractC42734a) ShowTicketEntryTestGroup.f255687f).toArray(new ShowTicketEntryTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return ShowTicketEntryTestGroup.f255684c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C44453a c44453a = this.f428760a;
        c44453a.getClass();
        n<Object> nVar = C44453a.f419152d[0];
        return ((Boolean) c44453a.f419153b.a().invoke()).booleanValue();
    }
}
