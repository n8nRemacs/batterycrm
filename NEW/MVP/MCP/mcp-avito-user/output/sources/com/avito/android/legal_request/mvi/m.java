package com.avito.android.legal_request.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.legal_request.mvi.entity.LegalRequestInternalAction;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import sR.AbstractC48101d;
import sR.C48100c;

/* compiled from: LegalRequestReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/legal_request/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "LsR/c;", "<init>", "()V", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements u<LegalRequestInternalAction, C48100c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C48100c a(LegalRequestInternalAction legalRequestInternalAction, C48100c c48100c) {
        AbstractC48101d bVar;
        LegalRequestInternalAction legalRequestInternalAction2 = legalRequestInternalAction;
        C48100c c48100c2 = c48100c;
        if (!(legalRequestInternalAction2 instanceof LegalRequestInternalAction.HandleBeduinState)) {
            return c48100c2;
        }
        AbstractC40048c.C11084c c11084c = AbstractC40048c.C11084c.f395217b;
        AbstractC40048c abstractC40048c = ((LegalRequestInternalAction.HandleBeduinState) legalRequestInternalAction2).f175272b;
        if (L.f(abstractC40048c, c11084c) ? true : L.f(abstractC40048c, AbstractC40048c.d.f395218b)) {
            bVar = AbstractC48101d.c.f437661a;
        } else if (abstractC40048c instanceof AbstractC40048c.a) {
            bVar = new AbstractC48101d.a(((AbstractC40048c.a) abstractC40048c).getF395211c());
        } else {
            if (!(abstractC40048c instanceof AbstractC40048c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new AbstractC48101d.b(((AbstractC40048c.b) abstractC40048c).f395216b);
        }
        return new C48100c(abstractC40048c, bVar);
    }
}
