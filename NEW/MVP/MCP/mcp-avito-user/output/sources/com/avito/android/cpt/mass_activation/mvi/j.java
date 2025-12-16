package com.avito.android.cpt.mass_activation.mvi;

import Pr.C14830a;
import Rr.C15073a;
import Ur.InterfaceC15560a;
import Vr.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CptMassActivationReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/mass_activation/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "LVr/c;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements u<CptMassActivationInternalAction, Vr.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15560a f126602b;

    @Inject
    public j(@Y61.k InterfaceC15560a interfaceC15560a) {
        this.f126602b = interfaceC15560a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Vr.c a(CptMassActivationInternalAction cptMassActivationInternalAction, Vr.c cVar) {
        CptMassActivationInternalAction cptMassActivationInternalAction2 = cptMassActivationInternalAction;
        Vr.c cVar2 = cVar;
        if (cptMassActivationInternalAction2 instanceof CptMassActivationInternalAction.Loading) {
            return Vr.c.a(cVar2, true, null);
        }
        if (cptMassActivationInternalAction2 instanceof CptMassActivationInternalAction.Error) {
            return Vr.c.a(cVar2, false, ((CptMassActivationInternalAction.Error) cptMassActivationInternalAction2).f126592b);
        }
        if (!(cptMassActivationInternalAction2 instanceof CptMassActivationInternalAction.Content)) {
            return cVar2;
        }
        Rr.g gVar = ((CptMassActivationInternalAction.Content) cptMassActivationInternalAction2).f126591b;
        ArrayList arrayListA = this.f126602b.a(gVar);
        C15073a button = gVar.getButton();
        return new Vr.c(false, null, arrayListA, new C14830a(button.getTitle(), button.getPriceDescription(), button.getUri(), null, null, 24, null), new c.b(gVar.getTitle(), gVar.getItemsCountTitle()), gVar.getAgreement());
    }
}
