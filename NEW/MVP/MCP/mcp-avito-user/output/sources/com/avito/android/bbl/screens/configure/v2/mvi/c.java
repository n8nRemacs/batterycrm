package com.avito.android.bbl.screens.configure.v2.mvi;

import Ah.InterfaceC13032a;
import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.screens.configure.v2.mvi.entity.BblConfigureV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lh.InterfaceC43770a;
import wZ.C49577a;

/* compiled from: BblConfigureV2Actor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LAh/a;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "LAh/c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC13032a, BblConfigureV2InternalAction, Ah.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bbl.screens.configure.v2.mvi.domain.a f99332a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43770a f99333b;

    @Inject
    public c(@Y61.k com.avito.android.bbl.screens.configure.v2.mvi.domain.a aVar, @Y61.k InterfaceC43770a interfaceC43770a) {
        this.f99332a = aVar;
        this.f99333b = interfaceC43770a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f99329l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<BblConfigureV2InternalAction> b(@Y61.k InterfaceC13032a interfaceC13032a, @Y61.k Ah.c cVar) {
        C43210w c43210w;
        C49577a c49577a;
        if (interfaceC13032a instanceof InterfaceC13032a.g) {
            return (InterfaceC43160i) this.f99332a.invoke();
        }
        if (interfaceC13032a instanceof InterfaceC13032a.b) {
            c43210w = new C43210w(BblConfigureV2InternalAction.Back.f99355b);
        } else {
            if (interfaceC13032a instanceof InterfaceC13032a.e) {
                return new C43210w(new BblConfigureV2InternalAction.HandleDeeplink(((InterfaceC13032a.e) interfaceC13032a).f562a, null, cVar.f576f, 2, null));
            }
            if (interfaceC13032a instanceof InterfaceC13032a.c) {
                InterfaceC43770a interfaceC43770a = this.f99333b;
                interfaceC43770a.a();
                interfaceC43770a.clear();
                InterfaceC13032a.c cVar2 = (InterfaceC13032a.c) interfaceC13032a;
                return new C43210w(new BblConfigureV2InternalAction.HandleDeeplink(cVar2.f559a, cVar2.f560b, cVar.f576f));
            }
            if (interfaceC13032a instanceof InterfaceC13032a.d) {
                return new C43210w(new BblConfigureV2InternalAction.UpdateConfig(((InterfaceC13032a.d) interfaceC13032a).f561a));
            }
            if (!(interfaceC13032a instanceof InterfaceC13032a.C0021a)) {
                if (!(interfaceC13032a instanceof InterfaceC13032a.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13032a.f fVar = (InterfaceC13032a.f) interfaceC13032a;
                return new C43210w(new BblConfigureV2InternalAction.ChangeOnScreenLoading(fVar.f563a, fVar.f564b));
            }
            wZ.i iVar = cVar.f572b;
            c43210w = new C43210w(new BblConfigureV2InternalAction.HandleDeeplink((iVar == null || (c49577a = iVar.f441568b) == null) ? null : c49577a.f441545b, null, null, 6, null));
        }
        return c43210w;
    }
}
