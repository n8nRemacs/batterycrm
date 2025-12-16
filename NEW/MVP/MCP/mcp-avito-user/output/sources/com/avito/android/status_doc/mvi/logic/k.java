package com.avito.android.status_doc.mvi.logic;

import Ax0.C13100d;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.status_doc.mvi.entities.GigStatusDocInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GigStatusDocReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/status_doc/mvi/logic/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction;", "LAx0/d;", "<init>", "()V", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements u<GigStatusDocInternalAction, C13100d> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C13100d a(GigStatusDocInternalAction gigStatusDocInternalAction, C13100d c13100d) {
        GigStatusDocInternalAction gigStatusDocInternalAction2 = gigStatusDocInternalAction;
        C13100d c13100d2 = c13100d;
        if (gigStatusDocInternalAction2 instanceof GigStatusDocInternalAction.ShowContent) {
            GigStatusDocInternalAction.ShowContent showContent = (GigStatusDocInternalAction.ShowContent) gigStatusDocInternalAction2;
            DeepLink deepLink = showContent.f284915f;
            return new C13100d(showContent.f284911b, showContent.f284912c, showContent.f284913d, showContent.f284914e, deepLink, deepLink != null, false, false);
        }
        if (gigStatusDocInternalAction2 instanceof GigStatusDocInternalAction.ShowLoading) {
            return C13100d.a(c13100d2, true, false);
        }
        if (gigStatusDocInternalAction2 instanceof GigStatusDocInternalAction.ShowError) {
            return C13100d.a(c13100d2, false, true);
        }
        if (gigStatusDocInternalAction2 instanceof GigStatusDocInternalAction.Close) {
            return c13100d2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
