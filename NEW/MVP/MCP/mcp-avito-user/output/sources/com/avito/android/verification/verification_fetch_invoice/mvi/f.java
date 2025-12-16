package com.avito.android.verification.verification_fetch_invoice.mvi;

import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceArgs;
import com.avito.android.verification.verification_fetch_invoice.mvi.entity.FetchInvoiceInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FetchInvoiceBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements com.avito.android.arch.mvi.b<FetchInvoiceInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VerificationFetchInvoiceArgs f325208a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_fetch_invoice.b f325209b;

    @Inject
    public f(@Y61.k VerificationFetchInvoiceArgs verificationFetchInvoiceArgs, @Y61.k com.avito.android.verification.verification_fetch_invoice.b bVar) {
        this.f325208a = verificationFetchInvoiceArgs;
        this.f325209b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<FetchInvoiceInternalAction> a() {
        return this.f325209b.a(this.f325208a.f325131b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
