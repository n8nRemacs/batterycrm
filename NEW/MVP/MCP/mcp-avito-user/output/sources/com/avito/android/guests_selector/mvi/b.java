package com.avito.android.guests_selector.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.guests_selector.mvi.entity.GuestsSelectorInternalAction;
import gI.InterfaceC40585a;
import hI.C40827a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GuestsSelectorActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/guests_selector/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LgI/a;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "LhI/a;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40585a, GuestsSelectorInternalAction, C40827a> {
    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<GuestsSelectorInternalAction> b(InterfaceC40585a interfaceC40585a, C40827a c40827a) {
        return C43175k.G(new a(interfaceC40585a, c40827a, null));
    }
}
