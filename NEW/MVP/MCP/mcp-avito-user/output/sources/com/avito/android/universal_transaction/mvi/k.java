package com.avito.android.universal_transaction.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import xG0.C49833b;

/* compiled from: TransactionBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/k;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements com.avito.android.arch.mvi.b<TransactionInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_transaction.mvi.domain.a f306444a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f306445b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f306446c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f306447d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f306448e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f306449f;

    @Inject
    public k(@Y61.k com.avito.android.universal_transaction.mvi.domain.a aVar, @Y61.k @C49833b.d String str, @C49833b.c @Y61.k String str2, @C49833b.e @Y61.k String str3, @C49833b.InterfaceC12856b @Y61.l String str4, @Y61.l @C49833b.a String str5) {
        this.f306444a = aVar;
        this.f306445b = str;
        this.f306446c = str2;
        this.f306447d = str3;
        this.f306448e = str4;
        this.f306449f = str5;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TransactionInternalAction> a() {
        BG0.a aVar = new BG0.a(this.f306445b, this.f306447d, this.f306446c, this.f306448e, this.f306449f, null, null, null, null, null, 992, null);
        return C43175k.N(new C43210w(new TransactionInternalAction.UpdateTransactionParams(aVar)), this.f306444a.a(aVar));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
