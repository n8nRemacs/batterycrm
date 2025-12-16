package com.avito.android.extended_profile_map.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: ExtendedProfileMapActionEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_map/analytics/ExtendedProfileMapActionEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ActionType", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileMapActionEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f151173b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfileMapActionEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/analytics/ExtendedProfileMapActionEvent$ActionType;", "", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f151174c;

        /* renamed from: d, reason: collision with root package name */
        public static final ActionType f151175d;

        /* renamed from: e, reason: collision with root package name */
        public static final ActionType f151176e;

        /* renamed from: f, reason: collision with root package name */
        public static final ActionType f151177f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f151178g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f151179h;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f151180b;

        static {
            ActionType actionType = new ActionType("DRAG", 0, "drag");
            f151174c = actionType;
            ActionType actionType2 = new ActionType("ZOOM", 1, "zoom");
            f151175d = actionType2;
            ActionType actionType3 = new ActionType("LOCATE", 2, "locate");
            ActionType actionType4 = new ActionType("FULLSCREEN", 3, "fullscreen");
            f151176e = actionType4;
            ActionType actionType5 = new ActionType("SELECT", 4, "select");
            f151177f = actionType5;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5};
            f151178g = actionTypeArr;
            f151179h = c.a(actionTypeArr);
        }

        public ActionType(String str, int i12, String str2) {
            this.f151180b = str2;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f151178g.clone();
        }
    }

    public ExtendedProfileMapActionEvent(@k String str, @k String str2, @k ActionType actionType) {
        this.f151173b = new ParametrizedClickStreamEvent(AuthCode.StatusCode.PERMISSION_NOT_EXIST, 1, P0.g(new Q("uid", str), new Q("user_key", str2), new Q("action_type", actionType.f151180b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f151173b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f151173b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f151173b.f90248c;
    }
}
