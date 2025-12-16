package com.avito.android.serp.adapter.location_notification;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.location_notification.LocationNotification;
import com.avito.android.serp.adapter.location_notification.LocationNotificationItem;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LocationNotificationItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/location_notification/d;", "Lcom/avito/android/serp/adapter/location_notification/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements e {

    /* compiled from: LocationNotificationItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f270255a;

        static {
            int[] iArr = new int[LocationNotification.TooltipType.values().length];
            try {
                iArr[LocationNotification.TooltipType.CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationNotification.TooltipType.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f270255a = iArr;
        }
    }

    @Override // com.avito.android.serp.adapter.location_notification.e
    @Y61.k
    public final LocationNotificationItem a(@Y61.k LocationNotification locationNotification) {
        LocationNotificationItem.TooltipType tooltipType;
        String title = locationNotification.getTitle();
        String confirmText = locationNotification.getConfirmText();
        String changeText = locationNotification.getChangeText();
        LocationNotification.TooltipType tooltipType2 = locationNotification.getTooltipType();
        if (tooltipType2 != null) {
            int i12 = a.f270255a[tooltipType2.ordinal()];
            if (i12 == 1) {
                tooltipType = LocationNotificationItem.TooltipType.f270243c;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tooltipType = LocationNotificationItem.TooltipType.f270244d;
            }
        } else {
            tooltipType = null;
        }
        return new LocationNotificationItem(null, 6, title, confirmText, changeText, tooltipType, locationNotification.getGeoSessionId(), 1, null);
    }
}
