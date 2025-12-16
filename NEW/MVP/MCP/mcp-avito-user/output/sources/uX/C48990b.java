package uX;

import Y61.k;
import com.avito.android.loyalty_program.ab_tests.LoyaltyProgramTestGroup;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import tX.C48612c;
import tX.InterfaceC48610a;
import u3.l;

/* compiled from: LoyaltyProgramAbTestsModule_LoyaltyProgramTestGroupFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LuX/b;", "Ldagger/internal/h;", "Lu3/l;", "Lcom/avito/android/loyalty_program/ab_tests/LoyaltyProgramTestGroup;", "LX41/o;", "a", "_avito_loyalty-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48990b implements h<l<LoyaltyProgramTestGroup>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f440082b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C48612c f440083a;

    /* compiled from: LoyaltyProgramAbTestsModule_LoyaltyProgramTestGroupFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuX/b$a;", "", "<init>", "()V", "_avito_loyalty-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uX.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48990b(@k C48612c c48612c) {
        this.f440083a = c48612c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48610a interfaceC48610a = (InterfaceC48610a) this.f440083a.get();
        f440082b.getClass();
        C48989a.f440081a.getClass();
        return interfaceC48610a.a();
    }
}
