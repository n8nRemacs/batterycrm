package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_models.abstract_module.IacCallTime;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CallParams.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00012Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013Jz\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b,\u0010\u0013R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0018R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b/\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b0\u0010\u0013¨\u00063"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "LdL/d;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallTime;", CrashHianalyticsData.TIME, "", "wasScreenStarted", "hideControlsInVideo", "hideVpnToast", "dtmfOpened", "", "", "customParams", "analyticsExtraParams", "muteRingtone", "<init>", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacCallTime;ZZZZLjava/util/Map;Ljava/util/Map;Z)V", "component1", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallTime;", "component2", "()Z", "component3", "component4", "component5", "component6", "()Ljava/util/Map;", "component7", "component8", "copy", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacCallTime;ZZZZLjava/util/Map;Ljava/util/Map;Z)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallTime;", "getTime", "Z", "getWasScreenStarted", "getHideControlsInVideo", "getHideVpnToast", "getDtmfOpened", "Ljava/util/Map;", "getCustomParams", "getAnalyticsExtraParams", "getMuteRingtone", "Companion", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CallParams implements dL.d {

    @Y61.l
    private final Map<String, String> analyticsExtraParams;

    @Y61.k
    private final Map<String, String> customParams;
    private final boolean dtmfOpened;
    private final boolean hideControlsInVideo;
    private final boolean hideVpnToast;
    private final boolean muteRingtone;

    @Y61.k
    private final IacCallTime time;
    private final boolean wasScreenStarted;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CallParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams$a;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    public CallParams(@Y61.k IacCallTime iacCallTime, boolean z12, boolean z13, boolean z14, boolean z15, @Y61.k Map<String, String> map, @Y61.l Map<String, String> map2, boolean z16) {
        this.time = iacCallTime;
        this.wasScreenStarted = z12;
        this.hideControlsInVideo = z13;
        this.hideVpnToast = z14;
        this.dtmfOpened = z15;
        this.customParams = map;
        this.analyticsExtraParams = map2;
        this.muteRingtone = z16;
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final IacCallTime getTime() {
        return this.time;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWasScreenStarted() {
        return this.wasScreenStarted;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHideControlsInVideo() {
        return this.hideControlsInVideo;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHideVpnToast() {
        return this.hideVpnToast;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDtmfOpened() {
        return this.dtmfOpened;
    }

    @Y61.k
    public final Map<String, String> component6() {
        return this.customParams;
    }

    @Y61.l
    public final Map<String, String> component7() {
        return this.analyticsExtraParams;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getMuteRingtone() {
        return this.muteRingtone;
    }

    @Y61.k
    public final CallParams copy(@Y61.k IacCallTime time, boolean wasScreenStarted, boolean hideControlsInVideo, boolean hideVpnToast, boolean dtmfOpened, @Y61.k Map<String, String> customParams, @Y61.l Map<String, String> analyticsExtraParams, boolean muteRingtone) {
        return new CallParams(time, wasScreenStarted, hideControlsInVideo, hideVpnToast, dtmfOpened, customParams, analyticsExtraParams, muteRingtone);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallParams)) {
            return false;
        }
        CallParams callParams = (CallParams) other;
        return L.f(this.time, callParams.time) && this.wasScreenStarted == callParams.wasScreenStarted && this.hideControlsInVideo == callParams.hideControlsInVideo && this.hideVpnToast == callParams.hideVpnToast && this.dtmfOpened == callParams.dtmfOpened && L.f(this.customParams, callParams.customParams) && L.f(this.analyticsExtraParams, callParams.analyticsExtraParams) && this.muteRingtone == callParams.muteRingtone;
    }

    @Y61.l
    public final Map<String, String> getAnalyticsExtraParams() {
        return this.analyticsExtraParams;
    }

    @Y61.k
    public final Map<String, String> getCustomParams() {
        return this.customParams;
    }

    public final boolean getDtmfOpened() {
        return this.dtmfOpened;
    }

    public final boolean getHideControlsInVideo() {
        return this.hideControlsInVideo;
    }

    public final boolean getHideVpnToast() {
        return this.hideVpnToast;
    }

    public final boolean getMuteRingtone() {
        return this.muteRingtone;
    }

    @Y61.k
    public final IacCallTime getTime() {
        return this.time;
    }

    public final boolean getWasScreenStarted() {
        return this.wasScreenStarted;
    }

    public int hashCode() {
        int iC2 = AK.c.c(r.i(r.i(r.i(r.i(this.time.hashCode() * 31, 31, this.wasScreenStarted), 31, this.hideControlsInVideo), 31, this.hideVpnToast), 31, this.dtmfOpened), 31, this.customParams);
        Map<String, String> map = this.analyticsExtraParams;
        return Boolean.hashCode(this.muteRingtone) + ((iC2 + (map == null ? 0 : map.hashCode())) * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CallParams(time=");
        sb2.append(this.time);
        sb2.append(", wasScreenStarted=");
        sb2.append(this.wasScreenStarted);
        sb2.append(", hideControlsInVideo=");
        sb2.append(this.hideControlsInVideo);
        sb2.append(", hideVpnToast=");
        sb2.append(this.hideVpnToast);
        sb2.append(", dtmfOpened=");
        sb2.append(this.dtmfOpened);
        sb2.append(", customParams=");
        sb2.append(this.customParams);
        sb2.append(", analyticsExtraParams=");
        sb2.append(this.analyticsExtraParams);
        sb2.append(", muteRingtone=");
        return r.x(sb2, this.muteRingtone, ')');
    }
}
