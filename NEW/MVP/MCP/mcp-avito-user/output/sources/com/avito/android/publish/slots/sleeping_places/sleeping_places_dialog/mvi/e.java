package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.entity.SleepingPlacesInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import wf0.InterfaceC49617b;

/* compiled from: SleepingPlacesOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/e;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction;", "Lwf0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements t<SleepingPlacesInternalAction, InterfaceC49617b> {
    @Inject
    public e() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49617b b(SleepingPlacesInternalAction sleepingPlacesInternalAction) {
        SleepingPlacesInternalAction sleepingPlacesInternalAction2 = sleepingPlacesInternalAction;
        if (sleepingPlacesInternalAction2 instanceof SleepingPlacesInternalAction.PassResult) {
            return new InterfaceC49617b.a(((SleepingPlacesInternalAction.PassResult) sleepingPlacesInternalAction2).f245037b);
        }
        return null;
    }
}
