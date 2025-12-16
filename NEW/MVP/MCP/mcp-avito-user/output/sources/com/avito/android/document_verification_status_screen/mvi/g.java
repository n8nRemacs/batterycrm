package com.avito.android.document_verification_status_screen.mvi;

import Fx.AbstractC13849b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VerificationStatusBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/document_verification_status_screen/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "LFx/b;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements com.avito.android.arch.mvi.b<AbstractC13849b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.document_verification_status_screen.domain.a f144852a;

    @Inject
    public g(@Y61.k com.avito.android.document_verification_status_screen.domain.a aVar) {
        this.f144852a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AbstractC13849b> a() {
        return this.f144852a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
