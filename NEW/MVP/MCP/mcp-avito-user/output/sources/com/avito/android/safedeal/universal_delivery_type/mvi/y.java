package com.avito.android.safedeal.universal_delivery_type.mvi;

import Un0.C15542c;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalDeliveryTypeReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/y;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "LUn0/c;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y implements com.avito.android.arch.mvi.u<UniversalDeliveryTypeInternalAction, C15542c> {
    @Inject
    public y() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final C15542c a(UniversalDeliveryTypeInternalAction universalDeliveryTypeInternalAction, C15542c c15542c) {
        int selectedTabIndex;
        UniversalDeliveryTypeInternalAction universalDeliveryTypeInternalAction2 = universalDeliveryTypeInternalAction;
        C15542c c15542c2 = c15542c;
        if (universalDeliveryTypeInternalAction2 instanceof UniversalDeliveryTypeInternalAction.LoadingStarted) {
            return new C15542c(C15542c.a.C1146c.f16597a);
        }
        boolean z12 = universalDeliveryTypeInternalAction2 instanceof UniversalDeliveryTypeInternalAction.Loaded;
        C15542c.a aVar = c15542c2.f16593b;
        if (!z12) {
            if (universalDeliveryTypeInternalAction2 instanceof UniversalDeliveryTypeInternalAction.LoadedError) {
                return new C15542c(new C15542c.a.b(((UniversalDeliveryTypeInternalAction.LoadedError) universalDeliveryTypeInternalAction2).f256671b));
            }
            if (universalDeliveryTypeInternalAction2 instanceof UniversalDeliveryTypeInternalAction.TabSelect) {
                return aVar instanceof C15542c.a.C1145a ? new C15542c((C15542c.a) new x(universalDeliveryTypeInternalAction2).invoke(aVar)) : c15542c2;
            }
            return c15542c2;
        }
        if (!(aVar instanceof C15542c.a.C1145a) || (selectedTabIndex = ((C15542c.a.C1145a) aVar).f16595b) <= -1) {
            UniversalDeliveryTypeInternalAction.Loaded loaded = (UniversalDeliveryTypeInternalAction.Loaded) universalDeliveryTypeInternalAction2;
            UniversalDeliveryTypeContent universalDeliveryTypeContent = loaded.f256669b;
            selectedTabIndex = loaded.f256670c < universalDeliveryTypeContent.getTabs().size() ? universalDeliveryTypeContent.getSelectedTabIndex() : 0;
        }
        return new C15542c(new C15542c.a.C1145a(((UniversalDeliveryTypeInternalAction.Loaded) universalDeliveryTypeInternalAction2).f256669b, selectedTabIndex));
    }
}
