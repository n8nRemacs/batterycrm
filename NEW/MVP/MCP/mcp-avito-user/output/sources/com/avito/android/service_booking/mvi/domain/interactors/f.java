package com.avito.android.service_booking.mvi.domain.interactors;

import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingCoroutinesInteractor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-booking_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {
    public static final Object a(InterfaceC43172j interfaceC43172j, boolean z12, ServiceBookingMviStepInternalAction serviceBookingMviStepInternalAction, ServiceBookingMviStepInternalAction.ShowToastError showToastError, ContinuationImpl continuationImpl) {
        if (z12) {
            Object objEmit = interfaceC43172j.emit(serviceBookingMviStepInternalAction, continuationImpl);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }
        Object objEmit2 = interfaceC43172j.emit(showToastError, continuationImpl);
        return objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit2 : G0.f406611a;
    }
}
