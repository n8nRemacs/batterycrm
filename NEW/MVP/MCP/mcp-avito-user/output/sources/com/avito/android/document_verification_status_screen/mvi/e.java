package com.avito.android.document_verification_status_screen.mvi;

import Fx.AbstractC13848a;
import Fx.AbstractC13849b;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VerificationStatusActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/document_verification_status_screen/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LFx/a;", "LFx/b;", "LFx/d;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements com.avito.android.arch.mvi.a<AbstractC13848a, AbstractC13849b, Fx.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f144848a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.document_verification_status_screen.domain.a f144849b;

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.document_verification_status_screen.domain.a aVar2) {
        this.f144848a = aVar;
        this.f144849b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AbstractC13849b> b(AbstractC13848a abstractC13848a, Fx.d dVar) {
        AbstractC13848a abstractC13848a2 = abstractC13848a;
        if (abstractC13848a2 instanceof AbstractC13848a.b) {
            return C43175k.G(new a(this, abstractC13848a2, null));
        }
        if (abstractC13848a2 instanceof AbstractC13848a.d) {
            return C43175k.G(new b(this, abstractC13848a2, null));
        }
        if (abstractC13848a2 instanceof AbstractC13848a.C0310a) {
            return C43175k.G(new c(2, null));
        }
        if (abstractC13848a2 instanceof AbstractC13848a.c) {
            return C43175k.G(new d(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
