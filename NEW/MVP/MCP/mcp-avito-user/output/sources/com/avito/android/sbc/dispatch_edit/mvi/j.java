package com.avito.android.sbc.dispatch_edit.mvi;

import Wo0.InterfaceC15787c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.remote.error.ApiError;
import com.avito.android.sbc.dispatch_edit.mvi.entity.SbcDispatchEditInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SbcDispatchEditOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "LWo0/c;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements t<SbcDispatchEditInternalAction, InterfaceC15787c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15787c b(SbcDispatchEditInternalAction sbcDispatchEditInternalAction) {
        SbcDispatchEditInternalAction sbcDispatchEditInternalAction2 = sbcDispatchEditInternalAction;
        if (sbcDispatchEditInternalAction2 instanceof SbcDispatchEditInternalAction.RemovedFromDispatch) {
            return new InterfaceC15787c.b(((SbcDispatchEditInternalAction.RemovedFromDispatch) sbcDispatchEditInternalAction2).f260130b);
        }
        if (sbcDispatchEditInternalAction2 instanceof SbcDispatchEditInternalAction.NavigateBack) {
            return InterfaceC15787c.a.f18056a;
        }
        if (!(sbcDispatchEditInternalAction2 instanceof SbcDispatchEditInternalAction.RemoveFromDispatchFailed)) {
            return null;
        }
        ApiError apiError = ((SbcDispatchEditInternalAction.RemoveFromDispatchFailed) sbcDispatchEditInternalAction2).f260129b;
        return apiError != null ? new InterfaceC15787c.C1286c(apiError) : new InterfaceC15787c.d();
    }
}
