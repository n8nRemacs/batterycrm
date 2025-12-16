package com.avito.android.guests_selector.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.guests_selector.mvi.entity.GuestsSelectorInternalAction;
import gI.InterfaceC40586b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GuestsSelectorOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/guests_selector/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "LgI/b;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements t<GuestsSelectorInternalAction, InterfaceC40586b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40586b b(GuestsSelectorInternalAction guestsSelectorInternalAction) {
        GuestsSelectorInternalAction guestsSelectorInternalAction2 = guestsSelectorInternalAction;
        if (guestsSelectorInternalAction2 instanceof GuestsSelectorInternalAction.CloseDialog) {
            return InterfaceC40586b.a.f396429a;
        }
        if (guestsSelectorInternalAction2 instanceof GuestsSelectorInternalAction.SetResult) {
            return new InterfaceC40586b.C11204b(((GuestsSelectorInternalAction.SetResult) guestsSelectorInternalAction2).f161549b);
        }
        return null;
    }
}
