package com.avito.android.messenger.channels.analytics;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/UseCaseScenario;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UseCaseScenario {

    /* renamed from: c, reason: collision with root package name */
    public static final UseCaseScenario f187078c;

    /* renamed from: d, reason: collision with root package name */
    public static final UseCaseScenario f187079d;

    /* renamed from: e, reason: collision with root package name */
    public static final UseCaseScenario f187080e;

    /* renamed from: f, reason: collision with root package name */
    public static final UseCaseScenario f187081f;

    /* renamed from: g, reason: collision with root package name */
    public static final UseCaseScenario f187082g;

    /* renamed from: h, reason: collision with root package name */
    public static final UseCaseScenario f187083h;

    /* renamed from: i, reason: collision with root package name */
    public static final UseCaseScenario f187084i;

    /* renamed from: j, reason: collision with root package name */
    public static final UseCaseScenario f187085j;

    /* renamed from: k, reason: collision with root package name */
    public static final UseCaseScenario f187086k;

    /* renamed from: l, reason: collision with root package name */
    public static final UseCaseScenario f187087l;

    /* renamed from: m, reason: collision with root package name */
    public static final UseCaseScenario f187088m;

    /* renamed from: n, reason: collision with root package name */
    public static final UseCaseScenario f187089n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ UseCaseScenario[] f187090o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f187091p;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f187092b;

    static {
        UseCaseScenario useCaseScenario = new UseCaseScenario("PAGINATION", 0, "pagination");
        f187078c = useCaseScenario;
        UseCaseScenario useCaseScenario2 = new UseCaseScenario("COLD_START", 1, "cold");
        f187079d = useCaseScenario2;
        UseCaseScenario useCaseScenario3 = new UseCaseScenario("SCREEN_RECREATION", 2, "screen_recreation");
        f187080e = useCaseScenario3;
        UseCaseScenario useCaseScenario4 = new UseCaseScenario("RECONNECT", 3, "reconnect");
        f187081f = useCaseScenario4;
        UseCaseScenario useCaseScenario5 = new UseCaseScenario("PROFILE_SWITCH", 4, "profile_switch");
        f187082g = useCaseScenario5;
        UseCaseScenario useCaseScenario6 = new UseCaseScenario("EMPLOYEE_MODE_SWITCH", 5, "employee_mode_switch");
        f187083h = useCaseScenario6;
        UseCaseScenario useCaseScenario7 = new UseCaseScenario("SWIPE_TO_REFRESH", 6, "swipe_to_refresh");
        f187084i = useCaseScenario7;
        UseCaseScenario useCaseScenario8 = new UseCaseScenario("PINNED_CHAT", 7, "pinned_chat");
        f187085j = useCaseScenario8;
        UseCaseScenario useCaseScenario9 = new UseCaseScenario("UNMARKED_AS_SPAM", 8, "unmarked_as_spam");
        f187086k = useCaseScenario9;
        UseCaseScenario useCaseScenario10 = new UseCaseScenario("BLACK_LIST", 9, "black_list");
        f187087l = useCaseScenario10;
        UseCaseScenario useCaseScenario11 = new UseCaseScenario("FILTER_CHANGED", 10, "filter_changed");
        f187088m = useCaseScenario11;
        UseCaseScenario useCaseScenario12 = new UseCaseScenario("OTHER", 11, PluralsKeys.OTHER);
        f187089n = useCaseScenario12;
        UseCaseScenario[] useCaseScenarioArr = {useCaseScenario, useCaseScenario2, useCaseScenario3, useCaseScenario4, useCaseScenario5, useCaseScenario6, useCaseScenario7, useCaseScenario8, useCaseScenario9, useCaseScenario10, useCaseScenario11, useCaseScenario12};
        f187090o = useCaseScenarioArr;
        f187091p = kotlin.enums.c.a(useCaseScenarioArr);
    }

    public UseCaseScenario(String str, int i12, String str2) {
        this.f187092b = str2;
    }

    public static UseCaseScenario valueOf(String str) {
        return (UseCaseScenario) Enum.valueOf(UseCaseScenario.class, str);
    }

    public static UseCaseScenario[] values() {
        return (UseCaseScenario[]) f187090o.clone();
    }
}
