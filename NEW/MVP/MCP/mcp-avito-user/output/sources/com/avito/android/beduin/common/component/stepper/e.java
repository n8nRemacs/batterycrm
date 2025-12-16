package com.avito.android.beduin.common.component.stepper;

import com.avito.android.lib.design.stepper.Stepper;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinStepperComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/stepper/Stepper;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/stepper/Stepper;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<Stepper, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f102722l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar) {
        super(1);
        this.f102722l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Stepper stepper) {
        stepper.setMinValue(this.f102722l.f102714e.getMinValue());
        return G0.f406611a;
    }
}
