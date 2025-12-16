package com.avito.android.document_verification_status_screen.mvi;

import Fx.AbstractC13849b;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerificationStatusReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/document_verification_status_screen/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LFx/b;", "LFx/d;", "<init>", "()V", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements u<AbstractC13849b, Fx.d> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Fx.d a(AbstractC13849b abstractC13849b, Fx.d dVar) {
        AbstractC13849b abstractC13849b2 = abstractC13849b;
        Fx.d dVar2 = dVar;
        if (!(abstractC13849b2 instanceof AbstractC13849b.C0311b)) {
            return abstractC13849b2 instanceof AbstractC13849b.c ? Fx.d.a(dVar2, false, true) : abstractC13849b2 instanceof AbstractC13849b.d ? Fx.d.a(dVar2, true, false) : dVar2;
        }
        AbstractC13849b.C0311b c0311b = (AbstractC13849b.C0311b) abstractC13849b2;
        DeepLink deepLink = c0311b.f6050e;
        return new Fx.d(c0311b.f6046a, c0311b.f6047b, c0311b.f6049d, c0311b.f6048c, c0311b.f6051f, deepLink, dVar2.f6061g, deepLink != null, true, false, false);
    }
}
