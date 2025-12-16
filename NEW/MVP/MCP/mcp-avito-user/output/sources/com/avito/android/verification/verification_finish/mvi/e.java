package com.avito.android.verification.verification_finish.mvi;

import com.avito.android.verification.verification_finish.mvi.entity.FinishInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FinishBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_finish/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements com.avito.android.arch.mvi.b<FinishInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_finish.i f325281a;

    @Inject
    public e(@Y61.k com.avito.android.verification.verification_finish.i iVar) {
        this.f325281a = iVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<FinishInternalAction> a() {
        com.avito.android.verification.verification_finish.i iVar = this.f325281a;
        return C43175k.N(iVar.b(), iVar.a());
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
