package com.avito.android.suggest_addresses.mvi;

import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import oA0.InterfaceC44611b;
import oA0.InterfaceC44613d;

/* compiled from: SuggestAddressesOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/r;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "LoA0/b;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r implements com.avito.android.arch.mvi.t<SuggestAddressesInternalAction, InterfaceC44611b> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44611b b(SuggestAddressesInternalAction suggestAddressesInternalAction) {
        SuggestAddressesInternalAction suggestAddressesInternalAction2 = suggestAddressesInternalAction;
        if (suggestAddressesInternalAction2.equals(SuggestAddressesInternalAction.UpdateSuggests.f291935b)) {
            return InterfaceC44611b.c.f419484a;
        }
        if (suggestAddressesInternalAction2.equals(SuggestAddressesInternalAction.HideKeyboard.f291919b)) {
            return InterfaceC44611b.a.c.f419481a;
        }
        if (suggestAddressesInternalAction2.equals(SuggestAddressesInternalAction.FinishScreen.f291917b)) {
            return InterfaceC44611b.a.C12167a.f419479a;
        }
        if (!suggestAddressesInternalAction2.equals(SuggestAddressesInternalAction.ResolveAddressError.f291924b)) {
            if (suggestAddressesInternalAction2 instanceof SuggestAddressesInternalAction.FinishScreenWithResult) {
                return new InterfaceC44611b.a.C12168b(((SuggestAddressesInternalAction.FinishScreenWithResult) suggestAddressesInternalAction2).f291918b);
            }
            return null;
        }
        InterfaceC44613d.b bVar = InterfaceC44613d.b.f419492a;
        f.c.f125255c.getClass();
        f.c cVarB = f.c.a.b();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new InterfaceC44611b.C12169b(bVar, cVarB);
    }
}
