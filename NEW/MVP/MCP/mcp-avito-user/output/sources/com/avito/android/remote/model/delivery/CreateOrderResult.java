package com.avito.android.remote.model.delivery;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateOrderResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/delivery/CreateOrderResult;", "", "orderId", "", "paymentUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getPaymentUrl", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CreateOrderResult {

    @c("orderId")
    @k
    private final String orderId;

    @c("paymentUrl")
    @k
    private final String paymentUrl;

    public CreateOrderResult(@k String str, @k String str2) {
        this.orderId = str;
        this.paymentUrl = str2;
    }

    public static /* synthetic */ CreateOrderResult copy$default(CreateOrderResult createOrderResult, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = createOrderResult.orderId;
        }
        if ((i12 & 2) != 0) {
            str2 = createOrderResult.paymentUrl;
        }
        return createOrderResult.copy(str, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    @k
    public final CreateOrderResult copy(@k String orderId, @k String paymentUrl) {
        return new CreateOrderResult(orderId, paymentUrl);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderResult)) {
            return false;
        }
        CreateOrderResult createOrderResult = (CreateOrderResult) other;
        return L.f(this.orderId, createOrderResult.orderId) && L.f(this.paymentUrl, createOrderResult.paymentUrl);
    }

    @k
    public final String getOrderId() {
        return this.orderId;
    }

    @k
    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    public int hashCode() {
        return this.paymentUrl.hashCode() + (this.orderId.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CreateOrderResult(orderId=");
        sb2.append(this.orderId);
        sb2.append(", paymentUrl=");
        return C22026a.c(sb2, this.paymentUrl, ')');
    }
}
