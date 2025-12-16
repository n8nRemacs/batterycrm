package com.avito.android.universal_transaction.transaction;

import androidx.compose.runtime.C22126m3;
import com.avito.android.universal_transaction.transaction.TransactionFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TransactionFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class x extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TransactionFragment f306636l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(TransactionFragment transactionFragment) {
        super(2);
        this.f306636l = transactionFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            TransactionFragment.a aVar = TransactionFragment.f306549K0;
            TransactionFragment transactionFragment = this.f306636l;
            m.b(((CG0.c) C22126m3.b(transactionFragment.E5().f306498Q, a13).getF42167b()).f2067d, new w(transactionFragment), null, a13, 0);
        }
        return G0.f406611a;
    }
}
