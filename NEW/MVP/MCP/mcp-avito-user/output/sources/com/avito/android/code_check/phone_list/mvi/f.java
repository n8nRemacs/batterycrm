package com.avito.android.code_check.phone_list.mvi;

import Qo.C14915b;
import com.avito.android.arch.mvi.u;
import com.avito.android.code_check.phone_list.mvi.entity.PhoneListInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PhoneListReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check/phone_list/mvi/f;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/code_check/phone_list/mvi/entity/PhoneListInternalAction;", "LQo/b;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements u<PhoneListInternalAction, C14915b> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C14915b a(PhoneListInternalAction phoneListInternalAction, C14915b c14915b) {
        PhoneListInternalAction phoneListInternalAction2 = phoneListInternalAction;
        if (phoneListInternalAction2 instanceof PhoneListInternalAction.ShowFilteredPhones) {
            return new C14915b(((PhoneListInternalAction.ShowFilteredPhones) phoneListInternalAction2).f119002b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
