package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.entity.SleepingPlacesInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import wf0.C49618c;

/* compiled from: SleepingPlacesReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/g;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction;", "Lwf0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements u<SleepingPlacesInternalAction, C49618c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f245039b;

    @Inject
    public g(@k i iVar) {
        this.f245039b = iVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49618c a(SleepingPlacesInternalAction sleepingPlacesInternalAction, C49618c c49618c) {
        SleepingPlacesInternalAction sleepingPlacesInternalAction2 = sleepingPlacesInternalAction;
        C49618c c49618c2 = c49618c;
        boolean z12 = sleepingPlacesInternalAction2 instanceof SleepingPlacesInternalAction.Init;
        i iVar = this.f245039b;
        if (!z12) {
            return sleepingPlacesInternalAction2 instanceof SleepingPlacesInternalAction.ChooseBed ? iVar.a(C49618c.a(c49618c2, Integer.valueOf(((SleepingPlacesInternalAction.ChooseBed) sleepingPlacesInternalAction2).f245033b), null, null, true, null, 22)) : c49618c2;
        }
        SleepingPlacesInternalAction.Init init = (SleepingPlacesInternalAction.Init) sleepingPlacesInternalAction2;
        Integer num = init.f245035c;
        return iVar.a(C49618c.a(c49618c2, num, init.f245034b, init.f245036d, num != null, null, 16));
    }
}
