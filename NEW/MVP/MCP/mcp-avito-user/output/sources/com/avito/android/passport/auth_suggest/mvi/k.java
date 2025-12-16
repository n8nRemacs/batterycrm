package com.avito.android.passport.auth_suggest.mvi;

import F50.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: PassportAuthSuggestReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/auth_suggest/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "LF50/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<PassportAuthSuggestInternalAction, F50.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final F50.c a(PassportAuthSuggestInternalAction passportAuthSuggestInternalAction, F50.c cVar) {
        F50.c cVar2;
        PassportAuthSuggestInternalAction passportAuthSuggestInternalAction2 = passportAuthSuggestInternalAction;
        F50.c cVar3 = cVar;
        if (passportAuthSuggestInternalAction2 instanceof PassportAuthSuggestInternalAction.LoadingStarted) {
            return new F50.c(c.b.C0276c.f4545a);
        }
        if (passportAuthSuggestInternalAction2 instanceof PassportAuthSuggestInternalAction.Error) {
            cVar2 = new F50.c(new c.b.C0275b(((PassportAuthSuggestInternalAction.Error) passportAuthSuggestInternalAction2).f211016b));
        } else {
            if (!(passportAuthSuggestInternalAction2 instanceof PassportAuthSuggestInternalAction.HandleBeduinState)) {
                return cVar3;
            }
            AbstractC40048c.C11084c c11084c = AbstractC40048c.C11084c.f395217b;
            AbstractC40048c abstractC40048c = ((PassportAuthSuggestInternalAction.HandleBeduinState) passportAuthSuggestInternalAction2).f211019b;
            if (L.f(abstractC40048c, c11084c) ? true : L.f(abstractC40048c, AbstractC40048c.d.f395218b)) {
                return new F50.c(c.b.C0276c.f4545a);
            }
            if (abstractC40048c instanceof AbstractC40048c.a) {
                cVar2 = new F50.c(new c.b.a(((AbstractC40048c.a) abstractC40048c).getF395211c()));
            } else {
                if (!(abstractC40048c instanceof AbstractC40048c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2 = new F50.c(new c.b.C0275b(z.n(((AbstractC40048c.b) abstractC40048c).f395216b)));
            }
        }
        return cVar2;
    }
}
