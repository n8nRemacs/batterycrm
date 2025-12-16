package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: AdvertActionTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdvertActionTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/AdvertAction;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvertActionTypeAdapter extends RuntimeTypeAdapter<AdvertAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254152a;

    public AdvertActionTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254152a = P0.j(new kotlin.Q(NotificationsSettings.Section.SECTION_MESSENGER, AdvertAction.Messenger.class), new kotlin.Q("phone", AdvertAction.Phone.class), new kotlin.Q("callOrder", AdvertAction.CallOrder.class), new kotlin.Q("videoVoipCallRequest", AdvertAction.IacVideoCallRequest.class), new kotlin.Q("realtyLayout", AdvertAction.RealtyLayout.class), new kotlin.Q("gigApply", AdvertAction.GigApply.class), new kotlin.Q("serviceOrder", AdvertAction.ServiceOrderRequest.class), new kotlin.Q("findShift", AdvertAction.FindShift.class), new kotlin.Q("onlineBooking", AdvertAction.Booking.class));
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends AdvertAction>> getMapping() {
        return this.f254152a;
    }
}
