package com.avito.beduin.v2.utils.navigate;

import FV0.e;
import Y61.k;
import Y61.l;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.beduin.v2.page.impl.navigation.BeduinV2InnerScreenFragment;
import com.avito.beduin.v2.interaction.navigation.flow.p;
import com.avito.beduin.v2.interaction.navigation.flow.t;
import com.avito.beduin.v2.interaction.navigation.flow.u;
import com.avito.beduin.v2.logger.LogLevel;
import dU0.f;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ScreenAwareNavigationClient.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/utils/navigate/b;", "Lcom/avito/beduin/v2/interaction/navigation/flow/p;", "a", "navigation-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements p {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Z1 f338450b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.utils.navigate.a f338451c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<f> f338452d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public e f338453e;

    /* compiled from: ScreenAwareNavigationClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/utils/navigate/b$a;", "", "<init>", "()V", "", "SKIP_FRAGMENT_TX_POSTFIX", "Ljava/lang/String;", "TAG", "navigation-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ScreenAwareNavigationClient.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/fragment/app/FragmentManager$k;", "it", "", "invoke", "(Landroidx/fragment/app/FragmentManager$k;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.utils.navigate.b$b, reason: collision with other inner class name */
    public static final class C10490b extends N implements Y41.l<FragmentManager.k, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10490b f338454l = new C10490b();

        public C10490b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(FragmentManager.k kVar) {
            String name = kVar.getName();
            boolean z12 = false;
            if (name != null && C43066x.z(name, "#skip", false)) {
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    static {
        new a(null);
    }

    public b(@k Z1 z12, @k com.avito.beduin.v2.utils.navigate.a aVar, @k Y41.a aVar2) {
        this.f338450b = z12;
        this.f338451c = aVar;
        this.f338452d = aVar2;
    }

    @Override // FV0.h
    public final void P() {
        this.f338453e = null;
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        FV0.f fVarA1 = aVar.A1();
        if (fVarA1 instanceof e) {
            this.f338453e = (e) fVarA1;
            return;
        }
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (3 >= RU0.b.f14469c) {
            RU0.b.f14468b.e(RU0.b.f14470d + ":ScreenAwareNavigationClient", "Navigation host is not attached to client, because not a FragmentNavigationHost");
        }
    }

    public final boolean b(u uVar) {
        FragmentManager fragmentManagerA;
        e eVar = this.f338453e;
        if (eVar == null || (fragmentManagerA = eVar.a()) == null) {
            return false;
        }
        C10490b c10490b = C10490b.f338454l;
        if (L.f(uVar, u.b.f337551c)) {
            if (fragmentManagerA.L() <= 1) {
                return false;
            }
            int iL2 = fragmentManagerA.L();
            for (int i12 = 1; i12 < iL2; i12++) {
                FragmentManager.k kVarK = fragmentManagerA.K(i12);
                if (!((Boolean) c10490b.invoke(kVarK)).booleanValue()) {
                    fragmentManagerA.Z(kVarK.getId(), 1, false);
                }
            }
            return false;
        }
        if (!(uVar instanceof u.c)) {
            if (uVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (fragmentManagerA.L() <= 1) {
                return false;
            }
            for (int iL3 = fragmentManagerA.L() - 1; iL3 > 0; iL3--) {
                FragmentManager.k kVarK2 = fragmentManagerA.K(iL3);
                if (!((Boolean) c10490b.invoke(kVarK2)).booleanValue()) {
                    fragmentManagerA.Z(kVarK2.getId(), 1, false);
                }
            }
            return false;
        }
        String str = ((u.c) uVar).f337552c;
        if (fragmentManagerA.L() <= 1) {
            return false;
        }
        boolean zBooleanValue = false;
        for (int iL4 = fragmentManagerA.L() - 1; iL4 > 0; iL4--) {
            FragmentManager.k kVarK3 = fragmentManagerA.K(iL4);
            String name = kVarK3.getName();
            if (!L.f(name != null ? C43066x.q0(name, "#skip") : null, str) || zBooleanValue || iL4 >= fragmentManagerA.L() - 1) {
                zBooleanValue = ((Boolean) c10490b.invoke(kVarK3)).booleanValue();
            } else {
                fragmentManagerA.Z(kVarK3.getId(), 0, false);
            }
        }
        return false;
        return true;
    }

    @Override // com.avito.beduin.v2.interaction.navigation.flow.o
    @l
    public final f f(@l u uVar) {
        if (b(uVar)) {
            return null;
        }
        return this.f338452d.invoke();
    }

    @Override // com.avito.beduin.v2.interaction.navigation.flow.o
    public final boolean g(@l u uVar) {
        return b(uVar);
    }

    @Override // com.avito.beduin.v2.interaction.navigation.flow.o
    public final void l(@k t tVar, boolean z12, boolean z13, @l LinkedHashMap linkedHashMap) {
        e eVar = this.f338453e;
        if (eVar == null) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (3 >= RU0.b.f14469c) {
                RU0.b.f14468b.e(RU0.b.f14470d + ":ScreenAwareNavigationClient", "Client not attached to host, navigation not completed");
                return;
            }
            return;
        }
        BeduinV2InnerScreenFragment beduinV2InnerScreenFragmentA = this.f338451c.a(tVar.getF337544a(), linkedHashMap);
        if (z13) {
            e eVar2 = this.f338453e;
            FragmentManager fragmentManagerA = eVar2 != null ? eVar2.a() : null;
            if (fragmentManagerA != null && fragmentManagerA.L() != 0) {
                int id2 = fragmentManagerA.K(0).getId();
                if (id2 < 0) {
                    throw new IllegalArgumentException(AK.c.g(id2, "Bad id: "));
                }
                fragmentManagerA.b0(id2, 1, null);
            }
        }
        H hE2 = eVar.a().e();
        hE2.n(eVar.b(), beduinV2InnerScreenFragmentA, null);
        hE2.c(tVar.getF337544a().f337550a + (z12 ? "" : "#skip"));
        hE2.e();
        if (tVar.getF337545b() != null) {
            this.f338450b.K5(tVar);
        }
    }
}
