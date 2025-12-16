package com.avito.android.multigeo_flow.mvi.logics;

import Q20.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.multigeo_flow.mvi.entity.InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: JobMultiGeoOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/logics/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "LQ20/b;", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements t<InternalAction, Q20.b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Q20.b b(InternalAction internalAction) {
        InternalAction internalAction2 = internalAction;
        if (internalAction2 instanceof InternalAction.e) {
            return new b.c(((InternalAction.e) internalAction2).f206997b);
        }
        if (internalAction2 instanceof InternalAction.ShowError) {
            return b.g.f13437a;
        }
        if (internalAction2 instanceof InternalAction.c) {
            return b.C0882b.f13432a;
        }
        if (internalAction2 instanceof InternalAction.b) {
            return new b.a(((InternalAction.b) internalAction2).f206993b);
        }
        if (internalAction2 instanceof InternalAction.a) {
            return new b.d(((InternalAction.a) internalAction2).f206992c.f206874b);
        }
        if (internalAction2 instanceof InternalAction.d) {
            return new b.f(((InternalAction.d) internalAction2).f206996c.f206874b);
        }
        if (internalAction2 instanceof InternalAction.DeleteAddress) {
            return new b.e(((InternalAction.DeleteAddress) internalAction2).f206986c);
        }
        if (internalAction2 instanceof InternalAction.f ? true : internalAction2 instanceof InternalAction.ShowLoading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
