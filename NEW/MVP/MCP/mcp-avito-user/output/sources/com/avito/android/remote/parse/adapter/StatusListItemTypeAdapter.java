package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.common.items.VerificationBannerItem;
import com.avito.android.remote.model.common.items.VerificationIconItem;
import com.avito.android.remote.model.common.items.VerificationImageItem;
import com.avito.android.remote.model.common.items.VerificationListItem;
import com.avito.android.remote.model.common.items.VerificationSpacerItem;
import com.avito.android.remote.model.common.items.VerificationStatusItem;
import com.avito.android.remote.model.common.items.VerificationTextItem;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import com.avito.android.remote.model.text.SpacerAttribute;
import com.my.tracker.ads.AdFormat;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: StatusListItemTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/StatusListItemTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/common/items/VerificationListItem;", "<init>", "()V", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StatusListItemTypeAdapter extends RuntimeTypeAdapter<VerificationListItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254248a;

    public StatusListItemTypeAdapter() {
        super(null, "args", null, 5, null);
        this.f254248a = P0.g(new kotlin.Q(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD, VerificationStatusItem.class), new kotlin.Q("text", VerificationTextItem.class), new kotlin.Q(SpacerAttribute.ATTRIBUTE_TYPE, VerificationSpacerItem.class), new kotlin.Q("image", VerificationImageItem.class), new kotlin.Q("iconText", VerificationIconItem.class), new kotlin.Q(AdFormat.BANNER, VerificationBannerItem.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.reflect.Type>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Type> getMapping() {
        return this.f254248a;
    }
}
