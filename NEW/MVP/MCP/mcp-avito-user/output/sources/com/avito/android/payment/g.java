package com.avito.android.payment;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentMethodsContentsComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/g;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements com.avito.android.recycler.data_aware.b {
    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF113526b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF113526b()) : null)) {
            return false;
        }
        if (!(aVar instanceof O81.a) || !(aVar2 instanceof O81.a)) {
            return L.f(aVar != null ? Long.valueOf(aVar.getF113526b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF113526b()) : null);
        }
        O81.a aVar3 = (O81.a) aVar;
        O81.a aVar4 = (O81.a) aVar2;
        if (aVar3.getF113526b() != aVar4.getF113526b()) {
            return false;
        }
        aVar3.getClass();
        aVar4.getClass();
        return true;
    }
}
