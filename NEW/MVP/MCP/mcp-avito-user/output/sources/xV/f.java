package xv;

import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.delivery.DeliveryFlowPaymentStatus;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: Intents.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-app_core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {
    @k
    public static final DeliveryFlowPaymentStatus a(@l Intent intent) {
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("delivery_payment_status") : null;
        DeliveryFlowPaymentStatus deliveryFlowPaymentStatus = serializableExtra instanceof DeliveryFlowPaymentStatus ? (DeliveryFlowPaymentStatus) serializableExtra : null;
        return deliveryFlowPaymentStatus == null ? DeliveryFlowPaymentStatus.f134747c : deliveryFlowPaymentStatus;
    }
}
