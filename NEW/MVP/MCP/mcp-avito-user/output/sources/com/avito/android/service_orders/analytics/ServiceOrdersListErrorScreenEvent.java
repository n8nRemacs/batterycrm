package com.avito.android.service_orders.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: ServiceOrdersListErrorScreenEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/analytics/ServiceOrdersListErrorScreenEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ActionType", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceOrdersListErrorScreenEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ActionType f279062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f279063c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceOrdersListErrorScreenEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/analytics/ServiceOrdersListErrorScreenEvent$ActionType;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f279064c;

        /* renamed from: d, reason: collision with root package name */
        public static final ActionType f279065d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f279066e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f279067f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f279068b;

        static {
            ActionType actionType = new ActionType("FULLSCREEN", 0, "fullscreen");
            f279064c = actionType;
            ActionType actionType2 = new ActionType("TOAST", 1, "toast");
            f279065d = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f279066e = actionTypeArr;
            f279067f = c.a(actionTypeArr);
        }

        public ActionType(String str, int i12, String str2) {
            this.f279068b = str2;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f279066e.clone();
        }
    }

    public ServiceOrdersListErrorScreenEvent(@k ActionType actionType) {
        this.f279062b = actionType;
        this.f279063c = new ParametrizedClickStreamEvent(7416, 2, Collections.singletonMap("action_type", actionType.f279068b), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceOrdersListErrorScreenEvent) && this.f279062b == ((ServiceOrdersListErrorScreenEvent) obj).f279062b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF6279b() {
        return this.f279063c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f279063c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF6280c() {
        return this.f279063c.f90248c;
    }

    public final int hashCode() {
        return this.f279062b.hashCode();
    }

    @k
    public final String toString() {
        return "ServiceOrdersListErrorScreenEvent(actionType=" + this.f279062b + ')';
    }
}
