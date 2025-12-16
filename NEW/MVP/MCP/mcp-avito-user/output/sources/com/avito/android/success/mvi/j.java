package com.avito.android.success.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.success.mvi.entity.SuccessInternalAction;
import eA0.InterfaceC39980b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuccessOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/success/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "LeA0/b;", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements t<SuccessInternalAction, InterfaceC39980b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39980b b(SuccessInternalAction successInternalAction) {
        SuccessInternalAction successInternalAction2 = successInternalAction;
        if (successInternalAction2 instanceof SuccessInternalAction.HandleDeepLink) {
            return new InterfaceC39980b.a(((SuccessInternalAction.HandleDeepLink) successInternalAction2).f291679b);
        }
        return null;
    }
}
