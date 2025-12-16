package com.avito.android.success.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.success.mvi.entity.SuccessInternalAction;
import eA0.C39981c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuccessReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/success/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "LeA0/c;", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<SuccessInternalAction, C39981c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C39981c a(SuccessInternalAction successInternalAction, C39981c c39981c) {
        C39981c c39981c2;
        SuccessInternalAction successInternalAction2 = successInternalAction;
        C39981c c39981c3 = c39981c;
        if (successInternalAction2 instanceof SuccessInternalAction.Loading) {
            return new C39981c(C39981c.a.C11058c.f395040a);
        }
        if (successInternalAction2 instanceof SuccessInternalAction.Content) {
            SuccessInternalAction.Content content = (SuccessInternalAction.Content) successInternalAction2;
            c39981c2 = new C39981c(new C39981c.a.C11057a(content.f291674b, content.f291675c, content.f291676d, null, 8, null));
        } else {
            if (!(successInternalAction2 instanceof SuccessInternalAction.Error)) {
                return c39981c3;
            }
            c39981c2 = new C39981c(new C39981c.a.b(((SuccessInternalAction.Error) successInternalAction2).f291677b));
        }
        return c39981c2;
    }
}
