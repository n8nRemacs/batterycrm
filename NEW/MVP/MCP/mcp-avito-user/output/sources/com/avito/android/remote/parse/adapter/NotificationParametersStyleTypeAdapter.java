package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.notification.PushNotification;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: NotificationParametersStyleTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/NotificationParametersStyleTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/notification/PushNotification$Style;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationParametersStyleTypeAdapter extends RuntimeTypeAdapter<PushNotification.Style> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254199a;

    public NotificationParametersStyleTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254199a = P0.g(new kotlin.Q("bigImage", PushNotification.Style.BigImage.class), new kotlin.Q("bigText", PushNotification.Style.BigText.class), new kotlin.Q("MessengerWithIcon", PushNotification.Style.MessengerWithIcon.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.remote.notification.PushNotification$Style>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends PushNotification.Style>> getMapping() {
        return this.f254199a;
    }
}
