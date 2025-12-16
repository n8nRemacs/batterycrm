package com.avito.android.passport.profile_add.merge.check.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CheckMergePossibilityReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction;", "La60/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements u<CheckMergePossibilityInternalAction, a60.c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final a60.c a(CheckMergePossibilityInternalAction checkMergePossibilityInternalAction, a60.c cVar) {
        CheckMergePossibilityInternalAction checkMergePossibilityInternalAction2 = checkMergePossibilityInternalAction;
        a60.c cVar2 = cVar;
        if (checkMergePossibilityInternalAction2 instanceof CheckMergePossibilityInternalAction.UnknownError) {
            return new a60.c(false, true);
        }
        if (checkMergePossibilityInternalAction2 instanceof CheckMergePossibilityInternalAction.Loading) {
            return new a60.c(true, false);
        }
        if (checkMergePossibilityInternalAction2 instanceof CheckMergePossibilityInternalAction.OpenDeepLink ? true : checkMergePossibilityInternalAction2.equals(CheckMergePossibilityInternalAction.Close.f212663b)) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
