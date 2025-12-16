package com.avito.android.verification.verification_confirm_requisites.mvi;

import com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesArgs;
import com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ConfirmRequisitesBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements com.avito.android.arch.mvi.b<ConfirmRequisitesInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VerificationConfirmRequisitesArgs f324999a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_confirm_requisites.b f325000b;

    @Inject
    public h(@Y61.k VerificationConfirmRequisitesArgs verificationConfirmRequisitesArgs, @Y61.k com.avito.android.verification.verification_confirm_requisites.b bVar) {
        this.f324999a = verificationConfirmRequisitesArgs;
        this.f325000b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ConfirmRequisitesInternalAction> a() {
        return this.f325000b.a(this.f324999a.f324890b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
