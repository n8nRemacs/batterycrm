package com.avito.android.passport.auth_suggest.mvi;

import F50.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PassportAuthSuggestOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/auth_suggest/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "LF50/b;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements t<PassportAuthSuggestInternalAction, F50.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final F50.b b(PassportAuthSuggestInternalAction passportAuthSuggestInternalAction) {
        PassportAuthSuggestInternalAction passportAuthSuggestInternalAction2 = passportAuthSuggestInternalAction;
        if (passportAuthSuggestInternalAction2 instanceof PassportAuthSuggestInternalAction.ContentLoaded) {
            return new b.c(((PassportAuthSuggestInternalAction.ContentLoaded) passportAuthSuggestInternalAction2).f211015b);
        }
        boolean z12 = passportAuthSuggestInternalAction2 instanceof PassportAuthSuggestInternalAction.HandleBeduinEvent;
        return null;
    }
}
