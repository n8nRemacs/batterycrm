package com.avito.android.lf_levels.mvi;

import com.avito.android.lf_levels.mvi.entity.LfLevelsInternalAction;
import com.avito.android.remote.model.ButtonAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import tR.C48597a;
import wR.InterfaceC49553a;

/* compiled from: LfLevelsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lf_levels/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LwR/a;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "LwR/c;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC49553a, LfLevelsInternalAction, wR.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lf_levels.domain.a f175375a;

    @Inject
    public c(@Y61.k com.avito.android.lf_levels.domain.a aVar) {
        this.f175375a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f175372l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<LfLevelsInternalAction> b(@Y61.k InterfaceC49553a interfaceC49553a, @Y61.k wR.c cVar) {
        ButtonAction buttonAction;
        if (interfaceC49553a instanceof InterfaceC49553a.f) {
            return (InterfaceC43160i) this.f175375a.invoke();
        }
        if (interfaceC49553a instanceof InterfaceC49553a.d) {
            return new C43210w(new LfLevelsInternalAction.LevelSelect(((InterfaceC49553a.d) interfaceC49553a).f441440a));
        }
        if (interfaceC49553a instanceof InterfaceC49553a.C12819a) {
            return new C43210w(new LfLevelsInternalAction.HandleDeeplink(((InterfaceC49553a.C12819a) interfaceC49553a).f441437a));
        }
        if (interfaceC49553a instanceof InterfaceC49553a.b) {
            C48597a c48597a = cVar.f441449e;
            return new C43210w(new LfLevelsInternalAction.HandleDeeplink((c48597a == null || (buttonAction = c48597a.f439254d) == null) ? null : buttonAction.getDeeplink()));
        }
        if (interfaceC49553a instanceof InterfaceC49553a.c) {
            return new C43210w(new LfLevelsInternalAction.HandleDeeplink(((InterfaceC49553a.c) interfaceC49553a).f441439a));
        }
        if (interfaceC49553a instanceof InterfaceC49553a.e) {
            return new C43210w(new LfLevelsInternalAction.ProgressChanged(((InterfaceC49553a.e) interfaceC49553a).f441441a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
