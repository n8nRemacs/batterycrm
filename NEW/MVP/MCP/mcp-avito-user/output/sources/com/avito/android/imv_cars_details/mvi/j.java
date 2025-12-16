package com.avito.android.imv_cars_details.mvi;

import WM.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.imv_cars_details.mvi.entity.ImvCarsDetailsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvCarsDetailsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "LWM/b;", "<init>", "()V", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements t<ImvCarsDetailsInternalAction, WM.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final WM.b b(ImvCarsDetailsInternalAction imvCarsDetailsInternalAction) {
        ImvCarsDetailsInternalAction imvCarsDetailsInternalAction2 = imvCarsDetailsInternalAction;
        if (imvCarsDetailsInternalAction2 instanceof ImvCarsDetailsInternalAction.OpenLink) {
            ImvCarsDetailsInternalAction.OpenLink openLink = (ImvCarsDetailsInternalAction.OpenLink) imvCarsDetailsInternalAction2;
            return new b.a(openLink.f169990b, openLink.f169991c);
        }
        if (imvCarsDetailsInternalAction2 instanceof ImvCarsDetailsInternalAction.ShowToast) {
            return new b.c(((ImvCarsDetailsInternalAction.ShowToast) imvCarsDetailsInternalAction2).f169995b);
        }
        if (!(imvCarsDetailsInternalAction2 instanceof ImvCarsDetailsInternalAction.ScrollToItem)) {
            return null;
        }
        ((ImvCarsDetailsInternalAction.ScrollToItem) imvCarsDetailsInternalAction2).getClass();
        return new b.C1267b();
    }
}
