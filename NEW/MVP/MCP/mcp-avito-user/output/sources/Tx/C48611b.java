package tX;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.loyalty_program.ab_tests.LoyaltyProgramTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.l;
import yX.C50195a;

/* compiled from: LoyaltyProgramAbTestsProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtX/b;", "LtX/a;", "_avito_loyalty-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48611b implements InterfaceC48610a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50195a f439259a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f439260b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27642e f439261c;

    @Inject
    public C48611b(@k C50195a c50195a, @k c0 c0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f439259a = c50195a;
        this.f439260b = c0Var;
        this.f439261c = interfaceC27642e;
    }

    @Override // tX.InterfaceC48610a
    @k
    public final l<LoyaltyProgramTestGroup> a() {
        return new l<>(this.f439261c.c(new d(this.f439259a)), this.f439260b);
    }
}
