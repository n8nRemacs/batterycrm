package com.avito.android.tariff_cpt.info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yC0.InterfaceC50099a;
import yC0.c;

/* compiled from: CptInfoV2Actor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LyC0/a;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "LyC0/c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC50099a, CptInfoV2InternalAction, yC0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_cpt.info.domain.a f298247a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f298248b;

    @Inject
    public f(@Y61.k com.avito.android.tariff_cpt.info.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f298247a = aVar;
        this.f298248b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new e(this, null), new a(new b(C40482a.b(this.f298248b)))), com.avito.android.arch.mvi.utils.h.e(c43197r1, c.f298233l, new d(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CptInfoV2InternalAction> b(@Y61.k InterfaceC50099a interfaceC50099a, @Y61.k yC0.c cVar) {
        C43210w c43210w;
        c.d dVar;
        if (interfaceC50099a instanceof InterfaceC50099a.C12892a) {
            return new C43210w(CptInfoV2InternalAction.Back.f298239b);
        }
        boolean z12 = interfaceC50099a instanceof InterfaceC50099a.i;
        String str = cVar.f442983e;
        com.avito.android.tariff_cpt.info.domain.a aVar = this.f298247a;
        if (z12) {
            return aVar.a(str, false);
        }
        if (interfaceC50099a instanceof InterfaceC50099a.h) {
            return aVar.a(str, true);
        }
        if (interfaceC50099a instanceof InterfaceC50099a.f) {
            c.e eVar = cVar.f442980b;
            if (eVar == null || (dVar = eVar.f442998b) == null) {
                return C43175k.w();
            }
            c43210w = new C43210w(new CptInfoV2InternalAction.HandleDeeplink(dVar.f442996c));
        } else if (interfaceC50099a instanceof InterfaceC50099a.b) {
            c43210w = new C43210w(new CptInfoV2InternalAction.HandleDeeplink(((InterfaceC50099a.b) interfaceC50099a).f442967a));
        } else if (interfaceC50099a instanceof InterfaceC50099a.g) {
            c43210w = new C43210w(new CptInfoV2InternalAction.HandleDeeplink(((InterfaceC50099a.g) interfaceC50099a).f442972a));
        } else if (interfaceC50099a instanceof InterfaceC50099a.d) {
            c43210w = new C43210w(new CptInfoV2InternalAction.ChangeFeatureGroups(((InterfaceC50099a.d) interfaceC50099a).f442969a));
        } else if (interfaceC50099a instanceof InterfaceC50099a.c) {
            c43210w = new C43210w(new CptInfoV2InternalAction.HandleDeeplink(((InterfaceC50099a.c) interfaceC50099a).f442968a));
        } else {
            if (!(interfaceC50099a instanceof InterfaceC50099a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new CptInfoV2InternalAction.HeaderItemChangeState(((InterfaceC50099a.e) interfaceC50099a).f442970a));
        }
        return c43210w;
    }
}
