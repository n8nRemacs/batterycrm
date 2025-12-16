package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.notification_center.landing.unified.NotificationCenterLandingField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: NotificationCenterUnifiedFieldDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/NotificationCenterUnifiedFieldDeserializer;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationCenterUnifiedFieldDeserializer extends RuntimeTypeAdapter<NotificationCenterLandingField> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254196a;

    public NotificationCenterUnifiedFieldDeserializer() {
        super(null, null, null, 7, null);
        this.f254196a = P0.g(new kotlin.Q("button", NotificationCenterLandingField.Button.class), new kotlin.Q("description", NotificationCenterLandingField.Description.class), new kotlin.Q("divider", NotificationCenterLandingField.Divider.class), new kotlin.Q("image", NotificationCenterLandingField.Image.class), new kotlin.Q("item", NotificationCenterLandingField.Item.class), new kotlin.Q("pairButton", NotificationCenterLandingField.PairButton.class), new kotlin.Q("space", NotificationCenterLandingField.Space.class), new kotlin.Q("subtitle", NotificationCenterLandingField.Subtitle.class), new kotlin.Q("title", NotificationCenterLandingField.Title.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.remote.model.notification_center.landing.unified.NotificationCenterLandingField>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends NotificationCenterLandingField>> getMapping() {
        return this.f254196a;
    }
}
