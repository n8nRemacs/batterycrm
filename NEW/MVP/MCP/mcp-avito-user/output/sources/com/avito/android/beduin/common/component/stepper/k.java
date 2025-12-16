package com.avito.android.beduin.common.component.stepper;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.stepper.Stepper;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: StepperViewContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/stepper/k;", "Lej/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f102727b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Stepper f102728c;

    public k(@Y61.k androidx.appcompat.view.d dVar, @Y61.k ViewGroup.LayoutParams layoutParams) {
        ComponentContainer componentContainer = new ComponentContainer(dVar);
        componentContainer.setLayoutParams(layoutParams);
        Stepper stepper = new Stepper(componentContainer.getContext(), null, 0, 0, 14, null);
        stepper.setId(R.id.beduin_stepper);
        stepper.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        stepper.setAppearanceFromAttr(R.attr.stepperMedium);
        this.f102728c = stepper;
        componentContainer.addView(stepper);
        this.f102727b = componentContainer;
    }

    @Override // ej.InterfaceC40116e
    /* renamed from: getRoot */
    public final View getF103243b() {
        return this.f102727b;
    }
}
