package com.avito.android.publish.slots.sleeping_places;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SelectedBedType;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SelectedBedTypeState;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesRules;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SleepingPlacesValidator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/i;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i {
    @Inject
    public i() {
    }

    @k
    public static SelectedBedTypeState a(@k SelectedBedType selectedBedType, @k SleepingPlacesRules sleepingPlacesRules) {
        boolean z12 = selectedBedType.getAmount() < sleepingPlacesRules.getMinAmount() || selectedBedType.getAmount() > sleepingPlacesRules.getMaxAmount();
        boolean z13 = selectedBedType.getTitle() == null;
        return (z12 && z13) ? SelectedBedTypeState.FullError.INSTANCE : z13 ? SelectedBedTypeState.SelectError.INSTANCE : z12 ? SelectedBedTypeState.StepperError.INSTANCE : SelectedBedTypeState.Normal.INSTANCE;
    }
}
