package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.entity.SleepingPlacesInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wf0.C49618c;
import wf0.InterfaceC49616a;

/* compiled from: SleepingPlacesActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lwf0/a;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction;", "Lwf0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC49616a, SleepingPlacesInternalAction, C49618c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SleepingPlacesInternalAction> b(InterfaceC49616a interfaceC49616a, C49618c c49618c) {
        InterfaceC49616a interfaceC49616a2 = interfaceC49616a;
        if (interfaceC49616a2 instanceof InterfaceC49616a.b) {
            return new C43210w(new SleepingPlacesInternalAction.PassResult(((InterfaceC49616a.b) interfaceC49616a2).f441723a));
        }
        if (interfaceC49616a2 instanceof InterfaceC49616a.C12823a) {
            return new C43210w(new SleepingPlacesInternalAction.ChooseBed(((InterfaceC49616a.C12823a) interfaceC49616a2).f441722a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
