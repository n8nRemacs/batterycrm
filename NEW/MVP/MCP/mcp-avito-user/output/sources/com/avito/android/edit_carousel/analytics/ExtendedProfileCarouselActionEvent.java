package com.avito.android.edit_carousel.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: ExtendedProfileCarouselActionEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/analytics/ExtendedProfileCarouselActionEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ActionType", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileCarouselActionEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f146326b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfileCarouselActionEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/analytics/ExtendedProfileCarouselActionEvent$ActionType;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f146327c;

        /* renamed from: d, reason: collision with root package name */
        public static final ActionType f146328d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f146329e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f146330f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146331b;

        static {
            ActionType actionType = new ActionType("DRAG", 0, "drag");
            f146327c = actionType;
            ActionType actionType2 = new ActionType("REMOVE", 1, "remove");
            f146328d = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f146329e = actionTypeArr;
            f146330f = c.a(actionTypeArr);
        }

        public ActionType(String str, int i12, String str2) {
            this.f146331b = str2;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f146329e.clone();
        }
    }

    public ExtendedProfileCarouselActionEvent(@k ActionType actionType, @k CarouselAnalyticsScenario carouselAnalyticsScenario) {
        this.f146326b = new ParametrizedClickStreamEvent(5950, 1, "ext_profile_window_action", P0.g(new Q("action_type", actionType.f146331b), new Q("window_scenario", carouselAnalyticsScenario.f146325b)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF327516b() {
        return this.f146326b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f146326b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF327517c() {
        return this.f146326b.f90248c;
    }
}
