package tX;

import Y61.k;
import com.avito.android.loyalty_program.ab_tests.LoyaltyProgramTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;
import yX.C50195a;

/* compiled from: LoyaltyProgramTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LtX/d;", "Lu3/d;", "Lcom/avito/android/loyalty_program/ab_tests/LoyaltyProgramTestGroup;", "_avito_loyalty-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends AbstractC48780d<LoyaltyProgramTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50195a f439266a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f439267b = "bonus_vs_subsidy";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f439268c;

    /* compiled from: LoyaltyProgramTestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<LoyaltyProgramTestGroup> f439269a = kotlin.enums.c.a(LoyaltyProgramTestGroup.values());
    }

    public d(@k C50195a c50195a) {
        this.f439266a = c50195a;
        Owners owners = Owners.f210476d;
        this.f439268c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF439268c() {
        return this.f439268c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF439267b() {
        return this.f439267b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        C50195a c50195a = this.f439266a;
        c50195a.getClass();
        n<Object> nVar = C50195a.f443165e[1];
        return d(((OptionSet) c50195a.f443167c.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (LoyaltyProgramTestGroup[]) ((AbstractC42734a) a.f439269a).toArray(new LoyaltyProgramTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return LoyaltyProgramTestGroup.f184148c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C50195a c50195a = this.f439266a;
        c50195a.getClass();
        n<Object> nVar = C50195a.f443165e[2];
        return ((Boolean) c50195a.f443168d.a().invoke()).booleanValue();
    }
}
