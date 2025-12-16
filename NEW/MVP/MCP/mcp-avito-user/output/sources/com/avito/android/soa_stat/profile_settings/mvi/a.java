package com.avito.android.soa_stat.profile_settings.mvi;

import Vw0.InterfaceC15722a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.soa_stat.profile_settings.mvi.entity.SoaStatSettingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SoaStatSettingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LVw0/a;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "LVw0/c;", "a", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC15722a, SoaStatSettingInternalAction, Vw0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.soa_stat.profile_settings.domain.a f284124a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f284125b;

    /* compiled from: SoaStatSettingActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/a$a;", "", "<init>", "()V", "", "TOGGLE_DEBOUNCE_MS", "J", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.soa_stat.profile_settings.mvi.a$a, reason: collision with other inner class name */
    public static final class C8481a {
        public /* synthetic */ C8481a(C42822w c42822w) {
            this();
        }

        public C8481a() {
        }
    }

    static {
        new C8481a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.soa_stat.profile_settings.domain.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f284124a = aVar;
        this.f284125b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(C43175k.N(new h(aVar, new C43210w(InterfaceC15722a.C1214a.f17501a)), new i(new j(c43197r1), aVar)), new k(null, this, aVar));
        m mVar = new m(c43197r1);
        e.a aVar2 = kotlin.time.e.f410651c;
        return C43175k.N(lVarY, C43175k.Y(new l(aVar, C43175k.p(mVar, kotlin.time.g.h(500L, DurationUnit.f410633e))), new n(null, this, aVar)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<SoaStatSettingInternalAction> b(InterfaceC15722a interfaceC15722a, Vw0.c cVar) {
        return c(interfaceC15722a);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k InterfaceC15722a interfaceC15722a) {
        if (interfaceC15722a instanceof InterfaceC15722a.b) {
            return new C43137a0(new g(2, null), new e(C43175k.G(new f(this, null))));
        }
        if (interfaceC15722a instanceof InterfaceC15722a.C1214a) {
            return new C43137a0(new g(2, null), new e(C43175k.G(new f(this, null))));
        }
        if (!(interfaceC15722a instanceof InterfaceC15722a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC15722a.c cVar = (InterfaceC15722a.c) interfaceC15722a;
        return new C43197r1(new o(this, null), new C43137a0(new d(cVar, null), new b(C43175k.G(new c(this, cVar, null)), cVar)));
    }
}
