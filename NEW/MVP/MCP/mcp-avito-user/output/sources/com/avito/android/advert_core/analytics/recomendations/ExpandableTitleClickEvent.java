package com.avito.android.advert_core.analytics.recomendations;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.analytics.AdvertDetailsStyleAnalytics;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExpandableTitleClickEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/analytics/recomendations/ExpandableTitleClickEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ActionType", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExpandableTitleClickEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f82843b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExpandableTitleClickEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/recomendations/ExpandableTitleClickEvent$ActionType;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f82844c;

        /* renamed from: d, reason: collision with root package name */
        public static final ActionType f82845d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f82846e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f82847f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82848b;

        static {
            ActionType actionType = new ActionType("OPEN", 0, "open");
            f82844c = actionType;
            ActionType actionType2 = new ActionType("HIDE", 1, ConstraintKt.CONDITION_FLOW_HIDE);
            f82845d = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f82846e = actionTypeArr;
            f82847f = c.a(actionTypeArr);
        }

        public ActionType(String str, int i12, String str2) {
            this.f82848b = str2;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f82846e.clone();
        }
    }

    public ExpandableTitleClickEvent(@k String str, @k ActionType actionType, @k AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics, @l String str2, @l String str3) {
        this.f82843b = new ParametrizedClickStreamEvent(5224, 3, C35755b0.c(P0.g(new Q("iid", str), new Q("action_type", actionType.f82848b), new Q("from_block", Integer.valueOf(advertDetailsStyleAnalytics.f82780b)), new Q("from_page", str2), new Q("from_space", str3))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f82843b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f82843b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f82843b.f90248c;
    }

    public /* synthetic */ ExpandableTitleClickEvent(String str, ActionType actionType, AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics, String str2, String str3, int i12, C42822w c42822w) {
        this(str, actionType, advertDetailsStyleAnalytics, (i12 & 8) != 0 ? null : str2, str3);
    }
}
