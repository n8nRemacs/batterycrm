package com.avito.android.avito_finance_user_profile.view.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.avito_finance_user_profile.view.analytics.AvitoFinanceSensitiveDataEvent;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pg.C47078d;
import pg.InterfaceC47075a;
import pg.InterfaceC47077c;
import qg.C47395a;

/* compiled from: AvitoFinanceBlockActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "Lpg/a;", "Lpg/c;", "Lpg/d;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC47075a, InterfaceC47077c, C47078d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f98054a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avito_finance_user_profile.view.domain.b f98055b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C47395a f98056c;

    @Inject
    public g(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.avito_finance_user_profile.view.domain.b bVar, @Y61.k C47395a c47395a) {
        this.f98054a = interfaceC28373a;
        this.f98055b = bVar;
        this.f98056c = c47395a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new c(this, aVar, null), C43175k.N(C43175k.G(new a(aVar, null)), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<InterfaceC47077c> b(InterfaceC47075a interfaceC47075a, C47078d c47078d) {
        return c(interfaceC47075a);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k InterfaceC47075a interfaceC47075a) {
        InterfaceC43160i c43210w;
        InterfaceC28464o avitoFinanceSensitiveDataEvent;
        if (interfaceC47075a instanceof InterfaceC47075a.C12282a) {
            return new C43210w(new InterfaceC47077c.e(((InterfaceC47075a.C12282a) interfaceC47075a).f428713a));
        }
        if (interfaceC47075a instanceof InterfaceC47075a.d) {
            c43210w = new C43152f0(new C43137a0(new e(2, null), new b(C43175k.G(new d(this, null)))), new f(3, null));
        } else if (interfaceC47075a instanceof InterfaceC47075a.c) {
            InterfaceC47075a.c cVar = (InterfaceC47075a.c) interfaceC47075a;
            Map<String, Object> mapC = cVar.f428716b;
            if (mapC == null) {
                mapC = P0.c();
            }
            Map<String, Object> map = mapC;
            boolean zIsEmpty = map.isEmpty();
            long j12 = cVar.f428717c;
            long j13 = cVar.f428715a;
            if (zIsEmpty) {
                avitoFinanceSensitiveDataEvent = new com.avito.android.analytics.provider.clickstream.b((int) j13, (int) j12);
            } else {
                avitoFinanceSensitiveDataEvent = L.f(cVar.f428718d, Boolean.TRUE) ? new AvitoFinanceSensitiveDataEvent((int) j13, (int) j12, map) : new ParametrizedClickStreamEvent((int) j13, (int) j12, map, null, 8, null);
            }
            this.f98054a.c(avitoFinanceSensitiveDataEvent);
            c43210w = new C43210w(InterfaceC47077c.d.f428725a);
        } else {
            if (!(interfaceC47075a instanceof InterfaceC47075a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(InterfaceC47077c.f.f428727a);
        }
        return c43210w;
    }
}
