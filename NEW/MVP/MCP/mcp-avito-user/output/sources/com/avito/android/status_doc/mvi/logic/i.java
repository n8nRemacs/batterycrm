package com.avito.android.status_doc.mvi.logic;

import Ax0.InterfaceC13099c;
import com.avito.android.arch.mvi.t;
import com.avito.android.status_doc.mvi.entities.GigStatusDocInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GigStatusDocOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/status_doc/mvi/logic/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction;", "LAx0/c;", "<init>", "()V", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements t<GigStatusDocInternalAction, InterfaceC13099c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13099c b(GigStatusDocInternalAction gigStatusDocInternalAction) {
        GigStatusDocInternalAction gigStatusDocInternalAction2 = gigStatusDocInternalAction;
        if (gigStatusDocInternalAction2 instanceof GigStatusDocInternalAction.Close) {
            return InterfaceC13099c.a.f722a;
        }
        if (gigStatusDocInternalAction2 instanceof GigStatusDocInternalAction.ShowContent ? true : gigStatusDocInternalAction2 instanceof GigStatusDocInternalAction.ShowError ? true : gigStatusDocInternalAction2 instanceof GigStatusDocInternalAction.ShowLoading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
