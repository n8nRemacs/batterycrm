package com.avito.android.safedeal.universal_delivery_type.courier.mvi;

import Qn0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.safedeal.universal_delivery_type.courier.mvi.entity.UniversalDeliveryTypeCourierInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalDeliveryTypeCourierReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "LQn0/c;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements u<UniversalDeliveryTypeCourierInternalAction, Qn0.c> {
    @Inject
    public p() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final Qn0.c a(UniversalDeliveryTypeCourierInternalAction universalDeliveryTypeCourierInternalAction, Qn0.c cVar) {
        UniversalDeliveryTypeCourierInternalAction universalDeliveryTypeCourierInternalAction2 = universalDeliveryTypeCourierInternalAction;
        Qn0.c cVar2 = cVar;
        if (universalDeliveryTypeCourierInternalAction2 instanceof UniversalDeliveryTypeCourierInternalAction.ContentLoaded) {
            UniversalDeliveryTypeCourierInternalAction.ContentLoaded contentLoaded = (UniversalDeliveryTypeCourierInternalAction.ContentLoaded) universalDeliveryTypeCourierInternalAction2;
            return new c.a(contentLoaded.f256528b, contentLoaded.f256529c, contentLoaded.f256530d, contentLoaded.f256531e, false, contentLoaded.f256532f, false);
        }
        if (universalDeliveryTypeCourierInternalAction2 instanceof UniversalDeliveryTypeCourierInternalAction.ContentChanged) {
            return cVar2 instanceof c.a ? (Qn0.c) new m(universalDeliveryTypeCourierInternalAction2).invoke(cVar2) : cVar2;
        }
        if (universalDeliveryTypeCourierInternalAction2 instanceof UniversalDeliveryTypeCourierInternalAction.ExecuteRequestStateChanged) {
            return cVar2 instanceof c.a ? (Qn0.c) new n(universalDeliveryTypeCourierInternalAction2).invoke(cVar2) : cVar2;
        }
        if (universalDeliveryTypeCourierInternalAction2 instanceof UniversalDeliveryTypeCourierInternalAction.HandledOnInitActions) {
            return cVar2 instanceof c.a ? (Qn0.c) o.f256554l.invoke(cVar2) : cVar2;
        }
        return cVar2;
    }
}
