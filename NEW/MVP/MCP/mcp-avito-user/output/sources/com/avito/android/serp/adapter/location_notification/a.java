package com.avito.android.serp.adapter.location_notification;

import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.location_notification.LocationNotificationItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationNotificationActionData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/location_notification/a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f270248a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f270249b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final LocationNotificationItem.TooltipType f270250c;

    public a(@Y61.l String str, boolean z12, @Y61.l LocationNotificationItem.TooltipType tooltipType) {
        this.f270248a = str;
        this.f270249b = z12;
        this.f270250c = tooltipType;
    }

    public /* synthetic */ a(String str, boolean z12, LocationNotificationItem.TooltipType tooltipType, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : str, z12, (i13 & 4) != 0 ? null : tooltipType);
    }
}
