package com.avito.android.profile_settings_extended.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: ExtendedProfileSelectionActionEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/analytics/ExtendedProfileSelectionActionEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ActionType", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ExtendedProfileSelectionActionEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f229986b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfileSelectionActionEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/analytics/ExtendedProfileSelectionActionEvent$ActionType;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final ActionType f229987b;

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f229988c;

        /* renamed from: d, reason: collision with root package name */
        public static final ActionType f229989d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f229990e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f229991f;

        static {
            ActionType actionType = new ActionType("REMOVE", 0);
            f229987b = actionType;
            ActionType actionType2 = new ActionType("VIEW", 1);
            f229988c = actionType2;
            ActionType actionType3 = new ActionType("SHARE", 2);
            f229989d = actionType3;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
            f229990e = actionTypeArr;
            f229991f = c.a(actionTypeArr);
        }

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f229990e.clone();
        }
    }

    /* compiled from: ExtendedProfileSelectionActionEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionType actionType = ActionType.f229987b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ActionType actionType2 = ActionType.f229987b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ExtendedProfileSelectionActionEvent(@k String str, @k ActionType actionType) {
        String str2;
        Q q12 = new Q("uid", str);
        int iOrdinal = actionType.ordinal();
        if (iOrdinal == 0) {
            str2 = "remove";
        } else if (iOrdinal == 1) {
            str2 = "view";
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "share";
        }
        this.f229986b = new ParametrizedClickStreamEvent(10374, 1, P0.g(q12, new Q("action_type", str2)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f229986b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f229986b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f229986b.f90248c;
    }
}
