package com.avito.android.remote.model.notification;

import Ik0.C14122a;
import Ik0.c;
import Y61.k;
import android.net.Uri;
import com.avito.android.deep_linking.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: NotificationResponseMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationResponseMapper;", "", "Lcom/avito/android/deep_linking/x;", "deeplinkFactory", "<init>", "(Lcom/avito/android/deep_linking/x;)V", "LIk0/c;", "apicoNotificationSearchResponse", "Lcom/avito/android/remote/model/notification/NotificationsResponse;", "mapToNotificationResponse", "(LIk0/c;)Lcom/avito/android/remote/model/notification/NotificationsResponse;", "Lcom/avito/android/deep_linking/x;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationResponseMapper {

    @k
    private final x deeplinkFactory;

    @Inject
    public NotificationResponseMapper(@k x xVar) {
        this.deeplinkFactory = xVar;
    }

    @k
    public final NotificationsResponse mapToNotificationResponse(@k c apicoNotificationSearchResponse) {
        LinkedHashMap linkedHashMap;
        String nextPage = apicoNotificationSearchResponse.getResult().getNextPage();
        if (nextPage == null || C43066x.K(nextPage)) {
            nextPage = null;
        }
        Uri uri = nextPage != null ? Uri.parse(nextPage) : null;
        List<C14122a> listB = apicoNotificationSearchResponse.getResult().b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        for (C14122a c14122a : listB) {
            String id2 = c14122a.getId();
            String title = c14122a.getTitle();
            String description = c14122a.getDescription();
            long date = c14122a.getDate();
            boolean isRead = c14122a.getIsRead();
            Map<String, Object> mapA = c14122a.a();
            if (mapA != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(mapA.size()));
                Iterator<T> it = mapA.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
                }
                linkedHashMap = linkedHashMap2;
            } else {
                linkedHashMap = null;
            }
            arrayList.add(new Notification(id2, title, description, date, isRead, this.deeplinkFactory.b(c14122a.getUri()), linkedHashMap));
        }
        return new NotificationsResponse(uri, arrayList);
    }
}
