package com.avito.android.publish.free_delivery.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.publish.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import he0.InterfaceC40925b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FreeDeliveryOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/p;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lhe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements t<FreeDeliveryInternalAction, InterfaceC40925b> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40925b b(FreeDeliveryInternalAction freeDeliveryInternalAction) {
        FreeDeliveryInternalAction freeDeliveryInternalAction2 = freeDeliveryInternalAction;
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Input) {
            FreeDeliveryInternalAction.Input input = (FreeDeliveryInternalAction.Input) freeDeliveryInternalAction2;
            int i12 = input.f235826c;
            int i13 = input.f235825b;
            if (i12 > i13 || i13 > input.f235827d) {
                return InterfaceC40925b.d.f397326a;
            }
            return null;
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Slider) {
            FreeDeliveryInternalAction.Slider slider = (FreeDeliveryInternalAction.Slider) freeDeliveryInternalAction2;
            int iB2 = kotlin.math.b.b(slider.f235831b);
            if (iB2 == slider.f235833d || iB2 == slider.f235832c) {
                return InterfaceC40925b.d.f397326a;
            }
            return null;
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Return) {
            return InterfaceC40925b.c.f397325a;
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Forward) {
            return InterfaceC40925b.C11266b.f397324a;
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.SaveAndClose) {
            return InterfaceC40925b.a.f397323a;
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.ShowToast) {
            return new InterfaceC40925b.e(((FreeDeliveryInternalAction.ShowToast) freeDeliveryInternalAction2).f235830b);
        }
        return null;
    }
}
