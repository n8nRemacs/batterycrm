package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.notification.Payload;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: NotificationParametersPayloadTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/NotificationParametersPayloadTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/notification/Payload;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationParametersPayloadTypeAdapter extends RuntimeTypeAdapter<Payload> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, Class<? extends Payload>> f254198a;

    public NotificationParametersPayloadTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254198a = Payload.INSTANCE.getMapping();
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends Payload>> getMapping() {
        return this.f254198a;
    }
}
