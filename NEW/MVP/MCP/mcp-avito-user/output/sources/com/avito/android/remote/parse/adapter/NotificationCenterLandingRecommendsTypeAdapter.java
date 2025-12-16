package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.notification_center.NotificationCenterLandingRecommends;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: NotificationCenterLandingRecommendsTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/NotificationCenterLandingRecommendsTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingRecommends$Element;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationCenterLandingRecommendsTypeAdapter extends RuntimeTypeAdapter<NotificationCenterLandingRecommends.Element> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254195a;

    public NotificationCenterLandingRecommendsTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254195a = P0.g(new kotlin.Q("item", NotificationCenterLandingRecommends.Element.Advert.class), new kotlin.Q("title", NotificationCenterLandingRecommends.Element.Title.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.remote.model.notification_center.NotificationCenterLandingRecommends$Element>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends NotificationCenterLandingRecommends.Element>> getMapping() {
        return this.f254195a;
    }
}
