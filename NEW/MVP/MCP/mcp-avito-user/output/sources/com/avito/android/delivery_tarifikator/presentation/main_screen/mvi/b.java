package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import Tv.C15414e;
import Tv.InterfaceC15412c;
import com.avito.android.delivery_tarifikator.domain.D;
import com.avito.android.delivery_tarifikator.domain.Z;
import com.avito.android.delivery_tarifikator.domain.p0;
import com.avito.android.delivery_tarifikator.domain.x0;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.AlertReason;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TarifikatorMainActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LTv/c;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "LTv/e;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC15412c, TarifikatorMainInternalAction, C15414e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e f135613a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x0 f135614b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p0 f135615c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D f135616d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z f135617e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.main_screen.domain.a f135618f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f135619g;

    /* compiled from: TarifikatorMainActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/b$a;", "", "<init>", "()V", "", "DEBOUNCE_TIME_MS", "J", "THROTTLE_TIME_MS", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@Y61.k com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e eVar, @Y61.k x0 x0Var, @Y61.k p0 p0Var, @Y61.k D d12, @Y61.k Z z12, @Y61.k com.avito.android.delivery_tarifikator.presentation.main_screen.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f135613a = eVar;
        this.f135614b = x0Var;
        this.f135615c = p0Var;
        this.f135616d = d12;
        this.f135617e = z12;
        this.f135618f = aVar;
        this.f135619g = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new C1(this.f135614b.getData(), this.f135615c.getSettings(), new o(3, null)), C43175k.C(new p(this, null), this.f135618f.b()), C43175k.C(new e(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, d.f135622l)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<TarifikatorMainInternalAction> b(InterfaceC15412c interfaceC15412c, C15414e c15414e) {
        return c(interfaceC15412c);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k InterfaceC15412c interfaceC15412c) {
        boolean zEquals = interfaceC15412c.equals(InterfaceC15412c.f.f15989a);
        x0 x0Var = this.f135614b;
        p0 p0Var = this.f135615c;
        if (zEquals) {
            if (p0Var.e()) {
                return new C43210w(new TarifikatorMainInternalAction.ShowAlertDialog(AlertReason.f135635b, InterfaceC15412c.e.f15988a));
            }
            x0Var.clear();
            p0Var.clear();
            return new C43210w(TarifikatorMainInternalAction.CloseScreen.f135640b);
        }
        boolean zEquals2 = interfaceC15412c.equals(InterfaceC15412c.k.f15997a);
        com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e eVar = this.f135613a;
        if (zEquals2) {
            return p0Var.e() ? new C43210w(new TarifikatorMainInternalAction.ShowAlertDialog(AlertReason.f135636c, InterfaceC15412c.l.f15998a)) : eVar.e();
        }
        if (interfaceC15412c.equals(InterfaceC15412c.n.f16000a)) {
            return eVar.a();
        }
        if (interfaceC15412c instanceof InterfaceC15412c.r) {
            return C43175k.G(new f(this, interfaceC15412c, null));
        }
        if (interfaceC15412c instanceof InterfaceC15412c.j) {
            return C43175k.G(new g(this, interfaceC15412c, null));
        }
        if (interfaceC15412c instanceof InterfaceC15412c.h) {
            return C43175k.G(new h(this, interfaceC15412c, null));
        }
        if (interfaceC15412c instanceof InterfaceC15412c.g) {
            return C43175k.G(new i(this, interfaceC15412c, null));
        }
        if (interfaceC15412c.equals(InterfaceC15412c.o.f16001a)) {
            return C43175k.G(new j(this, null));
        }
        if (interfaceC15412c.equals(InterfaceC15412c.e.f15988a)) {
            x0Var.clear();
            p0Var.clear();
            return new C43207v(new TarifikatorMainInternalAction[]{TarifikatorMainInternalAction.ClearAlertDialog.f135639b, TarifikatorMainInternalAction.CloseScreen.f135640b});
        }
        if (interfaceC15412c.equals(InterfaceC15412c.l.f15998a)) {
            return C43175k.G(new k(this, null));
        }
        if (interfaceC15412c.equals(InterfaceC15412c.a.f15984a)) {
            return new C43210w(TarifikatorMainInternalAction.ClearAlertDialog.f135639b);
        }
        if (interfaceC15412c instanceof InterfaceC15412c.p) {
            InterfaceC15412c.p pVar = (InterfaceC15412c.p) interfaceC15412c;
            Z z12 = this.f135617e;
            long j12 = pVar.f16002a;
            return new C43210w(new TarifikatorMainInternalAction.ShowDeleteTariffDialog(j12, pVar.f16003b, z12.a(j12)));
        }
        if (interfaceC15412c instanceof InterfaceC15412c.q) {
            return C43175k.G(new l(this, interfaceC15412c, null));
        }
        if (interfaceC15412c.equals(InterfaceC15412c.b.f15985a)) {
            return C43175k.G(new m(this, null));
        }
        if (interfaceC15412c instanceof InterfaceC15412c.d) {
            return C43175k.G(new n(this, interfaceC15412c, null));
        }
        if (interfaceC15412c instanceof InterfaceC15412c.m) {
            return p0Var.e() ? new C43210w(new TarifikatorMainInternalAction.ShowAlertDialog(AlertReason.f135635b, InterfaceC15412c.i.a(((InterfaceC15412c.m) interfaceC15412c).f15999a))) : new C43210w(TarifikatorMainInternalAction.OpenRegionSettings.c(((InterfaceC15412c.m) interfaceC15412c).f15999a));
        }
        if (interfaceC15412c instanceof InterfaceC15412c.i) {
            p0Var.f();
            return new C43207v(new TarifikatorMainInternalAction[]{TarifikatorMainInternalAction.ClearAlertDialog.f135639b, TarifikatorMainInternalAction.OpenRegionSettings.c(((InterfaceC15412c.i) interfaceC15412c).f15994a)});
        }
        if (interfaceC15412c instanceof InterfaceC15412c.C1088c) {
            return C43175k.G(new c(this, interfaceC15412c, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
