package com.avito.android.cpt.activation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction;
import com.avito.android.cpt.remote.model.ActivationEstimateResponseV2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CptActivationReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/activation/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction;", "LLr/c;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements u<CptActivationInternalAction, Lr.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpt.activation.data.mapper.a f126306b;

    @Inject
    public j(@Y61.k com.avito.android.cpt.activation.data.mapper.a aVar) {
        this.f126306b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Lr.c a(CptActivationInternalAction cptActivationInternalAction, Lr.c cVar) {
        CptActivationInternalAction cptActivationInternalAction2 = cptActivationInternalAction;
        Lr.c cVar2 = cVar;
        if (cptActivationInternalAction2 instanceof CptActivationInternalAction.Loading) {
            return Lr.c.a(cVar2, true, null, null, null, null, null, 60);
        }
        if (cptActivationInternalAction2 instanceof CptActivationInternalAction.Error) {
            return Lr.c.a(cVar2, false, ((CptActivationInternalAction.Error) cptActivationInternalAction2).f126296b, null, null, null, null, 60);
        }
        if (!(cptActivationInternalAction2 instanceof CptActivationInternalAction.Content)) {
            return cVar2;
        }
        ActivationEstimateResponseV2 activationEstimateResponseV2 = ((CptActivationInternalAction.Content) cptActivationInternalAction2).f126295b;
        return Lr.c.a(cVar2, false, null, this.f126306b.a(activationEstimateResponseV2), activationEstimateResponseV2.getButton(), null, activationEstimateResponseV2.getAgreement(), 16);
    }
}
