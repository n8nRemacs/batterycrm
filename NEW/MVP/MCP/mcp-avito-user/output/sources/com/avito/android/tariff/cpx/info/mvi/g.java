package com.avito.android.tariff.cpx.info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import wB0.C49483c;
import wB0.InterfaceC49481a;

/* compiled from: TariffCpxInfoActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LwB0/a;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "LwB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC49481a, TariffCpxInfoInternalAction, C49483c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpx.info.mvi.domain.a f296720a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v50.g f296721b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f296722c;

    @Inject
    public g(@Y61.k com.avito.android.tariff.cpx.info.mvi.domain.a aVar, @Y61.k v50.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f296720a = aVar;
        this.f296721b = gVar;
        this.f296722c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new c(this.f296721b.a(), null)), C43175k.C(new f(this, null), new a(new b(y.a(this.f296722c.d9())))), com.avito.android.arch.mvi.utils.h.e(c43197r1, d.f296695l, new e(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<TariffCpxInfoInternalAction> b(InterfaceC49481a interfaceC49481a, C49483c c49483c) {
        return c(interfaceC49481a);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k InterfaceC49481a interfaceC49481a) {
        if (interfaceC49481a instanceof InterfaceC49481a.f) {
            return this.f296720a.a(true);
        }
        if (interfaceC49481a instanceof InterfaceC49481a.C12811a) {
            return new C43210w(TariffCpxInfoInternalAction.Back.f296711b);
        }
        if (interfaceC49481a instanceof InterfaceC49481a.b) {
            return new C43210w(new TariffCpxInfoInternalAction.HandleDeeplink(((InterfaceC49481a.b) interfaceC49481a).f441313a));
        }
        if (interfaceC49481a instanceof InterfaceC49481a.e) {
            return new C43210w(new TariffCpxInfoInternalAction.HandleDeeplink(((InterfaceC49481a.e) interfaceC49481a).f441316a));
        }
        if (interfaceC49481a instanceof InterfaceC49481a.d) {
            return new C43210w(new TariffCpxInfoInternalAction.ChangeFeatureGroups(((InterfaceC49481a.d) interfaceC49481a).f441315a));
        }
        if (interfaceC49481a instanceof InterfaceC49481a.c) {
            return new C43210w(new TariffCpxInfoInternalAction.HandleDeeplink(((InterfaceC49481a.c) interfaceC49481a).f441314a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
