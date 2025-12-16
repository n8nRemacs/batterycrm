package com.avito.android.payment.form;

import kotlin.Metadata;

/* compiled from: PaymentGenericFormItemsComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/form/k;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.form.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33008k implements com.avito.android.recycler.data_aware.b {
    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        Boolean boolValueOf;
        Boolean bool = null;
        if ((aVar instanceof com.avito.android.payment.items.phone_item.g) && (aVar2 instanceof com.avito.android.payment.items.phone_item.g)) {
            boolValueOf = Boolean.valueOf(((com.avito.android.payment.items.phone_item.g) aVar).f214495e == ((com.avito.android.payment.items.phone_item.g) aVar2).f214495e);
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        if ((aVar instanceof ru.avito.component.info_label.g) && (aVar2 instanceof ru.avito.component.info_label.g)) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
