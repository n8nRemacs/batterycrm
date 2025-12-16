package com.avito.android.iac_analytics.public_module.clickstream_events;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import cc.e;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import dL.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import oJ.C44655b;
import oJ.C44656c;
import qJ.C47304a;

/* compiled from: IacEvent4101.kt */
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b \b\u0086\b\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB¥\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010#J\u0010\u0010*\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010#J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b0\u0010+J\u001e\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010\u001dJÎ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\t2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b6\u0010\u001dJ\u0010\u00107\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b7\u0010&J\u001a\u0010:\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b>\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\b\n\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bB\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bE\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bF\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bG\u0010#R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\b\u0012\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\bJ\u0010\u001dR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010/R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\b\u0016\u0010+R%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010M\u001a\u0004\bN\u00102R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\bO\u0010\u001dR\u0014\u0010Q\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010&R \u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002080\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u00102R\u0014\u0010U\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010&¨\u0006X"}, d2 = {"Lcom/avito/android/iac_analytics/public_module/clickstream_events/IacEvent4101;", "LdL/d;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "", "scenario", FailedBinderCallBack.CALLER_ID, "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "callDirection", "", "isVideo", "itemId", "", "eventType", "callResult", "networkType", "notificationsAllowed", "micAccess", "isVpnActive", "lastNetworkTestId", "", "lastNetworkTestTimestamp", "isTablet", "", "extraParams", "techInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;ZLjava/util/Map;Ljava/lang/String;)V", "description", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "()Z", "component11", "component12", "component13", "()Ljava/lang/Long;", "component14", "component15", "()Ljava/util/Map;", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;ZLjava/util/Map;Ljava/lang/String;)Lcom/avito/android/iac_analytics/public_module/clickstream_events/IacEvent4101;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScenario", "getCallId", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getCallDirection", "Ljava/lang/Boolean;", "getItemId", "I", "getEventType", "getCallResult", "getNetworkType", "getNotificationsAllowed", "Z", "getMicAccess", "getLastNetworkTestId", "Ljava/lang/Long;", "getLastNetworkTestTimestamp", "Ljava/util/Map;", "getExtraParams", "getTechInfo", "getEventId", "eventId", "getParams", "params", "getVersion", "version", "Companion", "a", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class IacEvent4101 implements d, e, a {

    @k
    public static final String KEY_CALL_ID = "appcall_id";

    @k
    public static final String KEY_EVENT_TYPE = "appcall_eventtype";
    public static final int VALUE_EVENT_TYPE_CONNECTED = 3;
    public static final int VALUE_EVENT_TYPE_FINISHED = 5;
    public static final int VALUE_EVENT_TYPE_INITIATED = 1;
    public static final int VALUE_EVENT_TYPE_WAITING = 2;
    private final /* synthetic */ ParametrizedClickStreamEvent $$delegate_0;

    @k
    private final IacCallDirection callDirection;

    @k
    private final String callId;

    @l
    private final String callResult;
    private final int eventType;

    @l
    private final Map<String, String> extraParams;
    private final boolean isTablet;

    @l
    private final Boolean isVideo;

    @l
    private final Boolean isVpnActive;

    @l
    private final String itemId;

    @l
    private final String lastNetworkTestId;

    @l
    private final Long lastNetworkTestTimestamp;
    private final boolean micAccess;

    @k
    private final String networkType;

    @l
    private final Boolean notificationsAllowed;

    @k
    private final String scenario;

    @l
    private final String techInfo;

    public IacEvent4101(@k String str, @k String str2, @k IacCallDirection iacCallDirection, @l Boolean bool, @l String str3, int i12, @l String str4, @k String str5, @l Boolean bool2, boolean z12, @l Boolean bool3, @l String str6, @l Long l12, boolean z13, @l Map<String, String> map, @l String str7) {
        this.scenario = str;
        this.callId = str2;
        this.callDirection = iacCallDirection;
        this.isVideo = bool;
        this.itemId = str3;
        this.eventType = i12;
        this.callResult = str4;
        this.networkType = str5;
        this.notificationsAllowed = bool2;
        this.micAccess = z12;
        this.isVpnActive = bool3;
        this.lastNetworkTestId = str6;
        this.lastNetworkTestTimestamp = l12;
        this.isTablet = z13;
        this.extraParams = map;
        this.techInfo = str7;
        Q q12 = new Q("iid", str3);
        Q q13 = new Q("appcall_scenario", str);
        Q q14 = new Q(KEY_CALL_ID, str2);
        Q q15 = new Q("appcall_network", str5);
        Q q16 = new Q(KEY_EVENT_TYPE, Integer.valueOf(i12));
        Q q17 = new Q("appcall_result", str4);
        Q q18 = new Q("appcall_system_notification", bool2);
        C44656c.f419703a.getClass();
        Q q19 = new Q("call_side", C44656c.a(iacCallDirection));
        Q q22 = new Q("is_video_call", bool);
        Q q23 = new Q("mic_access", Boolean.valueOf(z12));
        C44655b.f419701a.getClass();
        this.$$delegate_0 = new ParametrizedClickStreamEvent(4101, 15, C47304a.a(P0.k(P0.g(q12, q13, q14, q15, q16, q17, q18, q19, q22, q23, C44655b.f419702b, new Q("vpn_active", bool3), new Q("iac_network_test_id", str6), new Q("iac_network_test_timestamp", l12), new Q("device_form", z13 ? "tablet" : "phone"), new Q("iac_tech_info", str7)), map == null ? P0.c() : map)), null, 8, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getMicAccess() {
        return this.micAccess;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Boolean getIsVpnActive() {
        return this.isVpnActive;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getLastNetworkTestId() {
        return this.lastNetworkTestId;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Long getLastNetworkTestTimestamp() {
        return this.lastNetworkTestTimestamp;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsTablet() {
        return this.isTablet;
    }

    @l
    public final Map<String, String> component15() {
        return this.extraParams;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final String getTechInfo() {
        return this.techInfo;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final IacCallDirection getCallDirection() {
        return this.callDirection;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsVideo() {
        return this.isVideo;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getEventType() {
        return this.eventType;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getCallResult() {
        return this.callResult;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final String getNetworkType() {
        return this.networkType;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Boolean getNotificationsAllowed() {
        return this.notificationsAllowed;
    }

    @k
    public final IacEvent4101 copy(@k String scenario, @k String callId, @k IacCallDirection callDirection, @l Boolean isVideo, @l String itemId, int eventType, @l String callResult, @k String networkType, @l Boolean notificationsAllowed, boolean micAccess, @l Boolean isVpnActive, @l String lastNetworkTestId, @l Long lastNetworkTestTimestamp, boolean isTablet, @l Map<String, String> extraParams, @l String techInfo) {
        return new IacEvent4101(scenario, callId, callDirection, isVideo, itemId, eventType, callResult, networkType, notificationsAllowed, micAccess, isVpnActive, lastNetworkTestId, lastNetworkTestTimestamp, isTablet, extraParams, techInfo);
    }

    @k
    public String description() {
        return this.$$delegate_0.i();
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacEvent4101)) {
            return false;
        }
        IacEvent4101 iacEvent4101 = (IacEvent4101) other;
        return L.f(this.scenario, iacEvent4101.scenario) && L.f(this.callId, iacEvent4101.callId) && this.callDirection == iacEvent4101.callDirection && L.f(this.isVideo, iacEvent4101.isVideo) && L.f(this.itemId, iacEvent4101.itemId) && this.eventType == iacEvent4101.eventType && L.f(this.callResult, iacEvent4101.callResult) && L.f(this.networkType, iacEvent4101.networkType) && L.f(this.notificationsAllowed, iacEvent4101.notificationsAllowed) && this.micAccess == iacEvent4101.micAccess && L.f(this.isVpnActive, iacEvent4101.isVpnActive) && L.f(this.lastNetworkTestId, iacEvent4101.lastNetworkTestId) && L.f(this.lastNetworkTestTimestamp, iacEvent4101.lastNetworkTestTimestamp) && this.isTablet == iacEvent4101.isTablet && L.f(this.extraParams, iacEvent4101.extraParams) && L.f(this.techInfo, iacEvent4101.techInfo);
    }

    @k
    public final IacCallDirection getCallDirection() {
        return this.callDirection;
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @l
    public final String getCallResult() {
        return this.callResult;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public int getF83080b() {
        return this.$$delegate_0.f90247b;
    }

    public final int getEventType() {
        return this.eventType;
    }

    @l
    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    @l
    public final String getItemId() {
        return this.itemId;
    }

    @l
    public final String getLastNetworkTestId() {
        return this.lastNetworkTestId;
    }

    @l
    public final Long getLastNetworkTestTimestamp() {
        return this.lastNetworkTestTimestamp;
    }

    public final boolean getMicAccess() {
        return this.micAccess;
    }

    @k
    public final String getNetworkType() {
        return this.networkType;
    }

    @l
    public final Boolean getNotificationsAllowed() {
        return this.notificationsAllowed;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public Map<String, Object> getParams() {
        return this.$$delegate_0.f90249d;
    }

    @k
    public final String getScenario() {
        return this.scenario;
    }

    @l
    public final String getTechInfo() {
        return this.techInfo;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public int getF83081c() {
        return this.$$delegate_0.f90248c;
    }

    public int hashCode() {
        int iHashCode = (this.callDirection.hashCode() + H.d(this.scenario.hashCode() * 31, 31, this.callId)) * 31;
        Boolean bool = this.isVideo;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.itemId;
        int iE2 = r.e(this.eventType, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.callResult;
        int iD2 = H.d((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.networkType);
        Boolean bool2 = this.notificationsAllowed;
        int i12 = r.i((iD2 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.micAccess);
        Boolean bool3 = this.isVpnActive;
        int iHashCode3 = (i12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.lastNetworkTestId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.lastNetworkTestTimestamp;
        int i13 = r.i((iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.isTablet);
        Map<String, String> map = this.extraParams;
        int iHashCode5 = (i13 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.techInfo;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isTablet() {
        return this.isTablet;
    }

    @l
    public final Boolean isVideo() {
        return this.isVideo;
    }

    @l
    public final Boolean isVpnActive() {
        return this.isVpnActive;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacEvent4101(scenario=");
        sb2.append(this.scenario);
        sb2.append(", callId=");
        sb2.append(this.callId);
        sb2.append(", callDirection=");
        sb2.append(this.callDirection);
        sb2.append(", isVideo=");
        sb2.append(this.isVideo);
        sb2.append(", itemId=");
        sb2.append(this.itemId);
        sb2.append(", eventType=");
        sb2.append(this.eventType);
        sb2.append(", callResult=");
        sb2.append(this.callResult);
        sb2.append(", networkType=");
        sb2.append(this.networkType);
        sb2.append(", notificationsAllowed=");
        sb2.append(this.notificationsAllowed);
        sb2.append(", micAccess=");
        sb2.append(this.micAccess);
        sb2.append(", isVpnActive=");
        sb2.append(this.isVpnActive);
        sb2.append(", lastNetworkTestId=");
        sb2.append(this.lastNetworkTestId);
        sb2.append(", lastNetworkTestTimestamp=");
        sb2.append(this.lastNetworkTestTimestamp);
        sb2.append(", isTablet=");
        sb2.append(this.isTablet);
        sb2.append(", extraParams=");
        sb2.append(this.extraParams);
        sb2.append(", techInfo=");
        return C22026a.c(sb2, this.techInfo, ')');
    }
}
