package com.avito.android.onboarding.dialog.interactor;

import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CvStatusUpdateInteractor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_onboarding_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {
    @Y61.l
    public static final Object a(@Y61.k InterfaceC43172j interfaceC43172j, long j12, long j13, boolean z12, @Y61.k SuspendLambda suspendLambda) {
        Object objEmit = interfaceC43172j.emit(new OnboardingDialogInternalAction.UpdateAdditionalButtonLoadingState(j12, j13, z12), suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }
}
