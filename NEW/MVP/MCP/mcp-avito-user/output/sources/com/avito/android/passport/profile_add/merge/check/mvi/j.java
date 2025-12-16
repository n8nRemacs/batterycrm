package com.avito.android.passport.profile_add.merge.check.mvi;

import a60.InterfaceC19687b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CheckMergePossibilityOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction;", "La60/b;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements t<CheckMergePossibilityInternalAction, InterfaceC19687b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC19687b b(CheckMergePossibilityInternalAction checkMergePossibilityInternalAction) {
        CheckMergePossibilityInternalAction checkMergePossibilityInternalAction2 = checkMergePossibilityInternalAction;
        if (checkMergePossibilityInternalAction2 instanceof CheckMergePossibilityInternalAction.OpenDeepLink) {
            return new InterfaceC19687b.C1483b(((CheckMergePossibilityInternalAction.OpenDeepLink) checkMergePossibilityInternalAction2).f212664b);
        }
        if (checkMergePossibilityInternalAction2.equals(CheckMergePossibilityInternalAction.Close.f212663b)) {
            return InterfaceC19687b.a.f20742a;
        }
        if (checkMergePossibilityInternalAction2 instanceof CheckMergePossibilityInternalAction.Loading ? true : checkMergePossibilityInternalAction2 instanceof CheckMergePossibilityInternalAction.UnknownError) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
