package com.avito.android.loyalty_program.loyalty_entry_view.mvi;

import BX.b;
import BX.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LoyaltyEntryViewOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "LBX/b;", "LBX/c;", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements t<BX.b, BX.c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final BX.c b(BX.b bVar) {
        BX.b bVar2 = bVar;
        if (bVar2 instanceof b.c ? true : bVar2 instanceof b.C0057b) {
            return null;
        }
        if (bVar2 instanceof b.a) {
            return c.a.f1451a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
