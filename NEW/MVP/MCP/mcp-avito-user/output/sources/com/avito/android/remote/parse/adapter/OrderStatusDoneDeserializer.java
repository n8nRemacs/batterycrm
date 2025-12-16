package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.OrderMessage;
import com.avito.android.remote.model.OrderStatus;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: OrderStatusDoneDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/OrderStatusDoneDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/OrderStatus$Done;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderStatusDoneDeserializer implements com.google.gson.h<OrderStatus.Done> {
    @Override // com.google.gson.h
    public final OrderStatus.Done deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        boolean zC2 = C43066x.C(kVarI.D("status").s(), PaymentStateKt.PAYMENT_STATE_DONE, true);
        com.google.gson.i iVarD = kVarI.D("message");
        return new OrderStatus.Done(zC2, (OrderMessage) (iVarD == null ? null : gVar.b(iVarD, OrderMessage.class)));
    }
}
