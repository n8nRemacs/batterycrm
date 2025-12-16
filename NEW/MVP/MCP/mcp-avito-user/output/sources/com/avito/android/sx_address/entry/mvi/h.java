package com.avito.android.sx_address.entry.mvi;

import DA0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxAddressEntryOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/entry/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "LDA0/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements t<SxAddressEntryInternalAction, DA0.c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final DA0.c b(SxAddressEntryInternalAction sxAddressEntryInternalAction) {
        SxAddressEntryInternalAction sxAddressEntryInternalAction2 = sxAddressEntryInternalAction;
        if (sxAddressEntryInternalAction2 instanceof SxAddressEntryInternalAction.a) {
            return c.a.f3085a;
        }
        if (sxAddressEntryInternalAction2 instanceof SxAddressEntryInternalAction.b) {
            return new c.b(((SxAddressEntryInternalAction.b) sxAddressEntryInternalAction2).f292967b);
        }
        return null;
    }
}
