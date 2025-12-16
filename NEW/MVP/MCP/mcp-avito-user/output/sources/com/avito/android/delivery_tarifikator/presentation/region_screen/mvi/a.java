package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi;

import Xv.C17052c;
import Xv.InterfaceC17050a;
import com.avito.android.delivery_tarifikator.domain.D;
import com.avito.android.delivery_tarifikator.domain.p0;
import com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TarifikatorRegionActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LXv/a;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "LXv/c;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC17050a, TarifikatorRegionInternalAction, C17052c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.region_screen.domain.a f135796a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p0 f135797b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final D f135798c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f135799d;

    /* compiled from: TarifikatorRegionActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/a$a;", "", "<init>", "()V", "", "CLICKS_THROTTLE_TIME", "J", "DEBOUNCE_TIME", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a$a, reason: collision with other inner class name */
    public static final class C4106a {
        public /* synthetic */ C4106a(C42822w c42822w) {
            this();
        }

        public C4106a() {
        }
    }

    static {
        new C4106a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.delivery_tarifikator.presentation.region_screen.domain.a aVar, @Y61.k p0 p0Var, @Y61.k D d12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f135796a = aVar;
        this.f135797b = p0Var;
        this.f135798c = d12;
        this.f135799d = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new k(this.f135797b.getSettings()), C43175k.C(new j(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, i.f135827l)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<TarifikatorRegionInternalAction> b(InterfaceC17050a interfaceC17050a, C17052c c17052c) {
        return c(interfaceC17050a);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k InterfaceC17050a interfaceC17050a) {
        InterfaceC43160i c43210w;
        if (interfaceC17050a.equals(InterfaceC17050a.C1354a.f19131a)) {
            return C43175k.G(new b(this, null));
        }
        if (interfaceC17050a.equals(InterfaceC17050a.d.f19134a)) {
            this.f135797b.f();
            c43210w = new C43207v(new TarifikatorRegionInternalAction[]{TarifikatorRegionInternalAction.ClearAlertDialog.f135809b, TarifikatorRegionInternalAction.CloseScreen.f135810b});
        } else {
            if (!interfaceC17050a.equals(InterfaceC17050a.c.f19133a)) {
                if (interfaceC17050a instanceof InterfaceC17050a.i) {
                    return C43175k.G(new c(this, interfaceC17050a, null));
                }
                if (interfaceC17050a instanceof InterfaceC17050a.g) {
                    return C43175k.G(new d(this, interfaceC17050a, null));
                }
                if (interfaceC17050a instanceof InterfaceC17050a.e) {
                    return C43175k.G(new e(this, interfaceC17050a, null));
                }
                if (interfaceC17050a instanceof InterfaceC17050a.f) {
                    return C43175k.G(new f(this, interfaceC17050a, null));
                }
                if (interfaceC17050a.equals(InterfaceC17050a.h.f19141a)) {
                    return C43175k.G(new g(this, null));
                }
                if (interfaceC17050a instanceof InterfaceC17050a.b) {
                    return C43175k.G(new h(this, interfaceC17050a, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(TarifikatorRegionInternalAction.ClearAlertDialog.f135809b);
        }
        return c43210w;
    }
}
