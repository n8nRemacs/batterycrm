package com.avito.android.document_verification_status_screen.mvi;

import Fx.AbstractC13849b;
import Fx.AbstractC13850c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VerificationStatusOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/document_verification_status_screen/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "LFx/b;", "LFx/c;", "<init>", "()V", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements t<AbstractC13849b, AbstractC13850c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC13850c b(AbstractC13849b abstractC13849b) {
        AbstractC13849b abstractC13849b2 = abstractC13849b;
        if (abstractC13849b2 instanceof AbstractC13849b.a) {
            return AbstractC13850c.a.f6054a;
        }
        if (abstractC13849b2 instanceof AbstractC13849b.C0311b ? true : abstractC13849b2.equals(AbstractC13849b.d.f6053a) ? true : abstractC13849b2.equals(AbstractC13849b.c.f6052a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
