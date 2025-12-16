package com.avito.android.legal_request.mvi;

import com.avito.android.legal_request.mvi.entity.LegalRequestInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LegalRequestBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/legal_request/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements com.avito.android.arch.mvi.b<LegalRequestInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f175273a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ZS.b f175274b;

    @Inject
    public f(@Y61.k String str, @Y61.k ZS.b bVar) {
        this.f175273a = str;
        this.f175274b = bVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<LegalRequestInternalAction> a() {
        return new C43210w(new LegalRequestInternalAction.HandleBeduinAction(new InterfaceC40047a.c(this.f175273a, this.f175274b)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
