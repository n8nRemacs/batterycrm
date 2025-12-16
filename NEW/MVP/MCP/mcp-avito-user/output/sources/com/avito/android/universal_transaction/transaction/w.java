package com.avito.android.universal_transaction.transaction;

import CG0.a;
import com.avito.android.universal_transaction.transaction.TransactionFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TransactionFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBG0/a;", "transactionParams", "Lkotlin/G0;", "invoke", "(LBG0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class w extends N implements Y41.l<BG0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TransactionFragment f306635l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(TransactionFragment transactionFragment) {
        super(1);
        this.f306635l = transactionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(BG0.a aVar) {
        TransactionFragment.a aVar2 = TransactionFragment.f306549K0;
        TransactionFragment transactionFragment = this.f306635l;
        transactionFragment.E5().accept(new a.f(aVar));
        transactionFragment.E5().accept(a.d.f2058a);
        return G0.f406611a;
    }
}
