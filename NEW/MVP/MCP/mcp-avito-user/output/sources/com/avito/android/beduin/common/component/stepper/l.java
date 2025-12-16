package com.avito.android.beduin.common.component.stepper;

import com.avito.android.beduin.common.component.stepper.BeduinStepperModel;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.stepper.Stepper;
import kotlin.Metadata;

/* compiled from: StepperViewContainer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l {
    public static final void a(@Y61.k k kVar, @Y61.k BeduinStepperModel beduinStepperModel) {
        String errorMessage;
        String errorMessage2 = beduinStepperModel.getErrorMessage();
        Stepper stepper = kVar.f102728c;
        ComponentContainer componentContainer = kVar.f102727b;
        if (errorMessage2 == null && beduinStepperModel.getError() == null) {
            componentContainer.q(componentContainer.f178848i);
            stepper.setCurrentState(Stepper.State.f180596c);
            return;
        }
        BeduinStepperModel.Error error = beduinStepperModel.getError();
        if (error == null || (errorMessage = error.getMessage()) == null) {
            errorMessage = beduinStepperModel.getErrorMessage();
        }
        ComponentContainer.n(componentContainer, errorMessage, 2);
        stepper.setCurrentState(Stepper.State.f180597d);
    }
}
