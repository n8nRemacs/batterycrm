package com.avito.android.profile_settings_extended.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: ExtendedProfileAddAddressEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/analytics/ExtendedProfileAddAddressEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ActionType", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ExtendedProfileAddAddressEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f229965b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfileAddAddressEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/analytics/ExtendedProfileAddAddressEvent$ActionType;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f229966c;

        /* renamed from: d, reason: collision with root package name */
        public static final ActionType f229967d;

        /* renamed from: e, reason: collision with root package name */
        public static final ActionType f229968e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f229969f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f229970g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229971b;

        static {
            ActionType actionType = new ActionType("ADD", 0, "add");
            f229966c = actionType;
            ActionType actionType2 = new ActionType("EDIT", 1, "edit");
            f229967d = actionType2;
            ActionType actionType3 = new ActionType("DEEPLINK", 2, Constants.DEEPLINK);
            f229968e = actionType3;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
            f229969f = actionTypeArr;
            f229970g = c.a(actionTypeArr);
        }

        public ActionType(String str, int i12, String str2) {
            this.f229971b = str2;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f229969f.clone();
        }
    }

    public ExtendedProfileAddAddressEvent(@k String str, @k ActionType actionType) {
        this.f229965b = new ParametrizedClickStreamEvent(AuthCode.StatusCode.AUTH_INFO_NOT_EXIST, 2, P0.g(new Q("uid", str), new Q("action_type", actionType.f229971b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f229965b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f229965b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f229965b.f90248c;
    }
}
