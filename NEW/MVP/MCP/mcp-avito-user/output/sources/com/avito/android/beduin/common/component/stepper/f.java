package com.avito.android.beduin.common.component.stepper;

import com.avito.android.beduin.common.component.stepper.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinStepperComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/stepper/StepperChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/stepper/StepperChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.l<StepperChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f102723l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.stepper.a f102724m;

    /* compiled from: BeduinStepperComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[StepperChange.values().length];
            try {
                iArr[StepperChange.f102701f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StepperChange.f102702g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StepperChange.f102698c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StepperChange.f102700e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StepperChange.f102699d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, com.avito.android.beduin.common.component.stepper.a aVar) {
        super(1);
        this.f102723l = kVar;
        this.f102724m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(StepperChange stepperChange) {
        int iOrdinal = stepperChange.ordinal();
        k kVar = this.f102723l;
        com.avito.android.beduin.common.component.stepper.a aVar = this.f102724m;
        if (iOrdinal == 0) {
            c cVar = new c(aVar);
            a.C3078a c3078a = com.avito.android.beduin.common.component.stepper.a.f102711h;
            aVar.p(kVar, cVar);
            G0 g02 = G0.f406611a;
        } else if (iOrdinal == 1) {
            e eVar = new e(aVar);
            a.C3078a c3078a2 = com.avito.android.beduin.common.component.stepper.a.f102711h;
            aVar.p(kVar, eVar);
            G0 g03 = G0.f406611a;
        } else if (iOrdinal == 2) {
            d dVar = new d(aVar);
            a.C3078a c3078a3 = com.avito.android.beduin.common.component.stepper.a.f102711h;
            aVar.p(kVar, dVar);
            G0 g04 = G0.f406611a;
        } else {
            if (iOrdinal != 3 && iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            l.a(kVar, aVar.f102714e);
            G0 g05 = G0.f406611a;
        }
        return G0.f406611a;
    }
}
