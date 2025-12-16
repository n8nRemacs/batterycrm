package com.avito.android.lib.design.stepper;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Stepper.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Stepper f180619b;

    public d(Stepper stepper) {
        this.f180619b = stepper;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        G0 g02;
        Stepper stepper = this.f180619b;
        StepperState stepperState = stepper.f180569b;
        if (stepperState != null) {
            l<Integer, G0> lVar = stepperState.f180609f;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(stepper.getValue() + 1));
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 != null) {
                return;
            }
        }
        stepper.setValue(stepper.getValue() + 1);
    }
}
