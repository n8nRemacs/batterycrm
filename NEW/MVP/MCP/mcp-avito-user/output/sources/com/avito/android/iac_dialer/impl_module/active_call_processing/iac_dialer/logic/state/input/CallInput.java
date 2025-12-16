package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.api.FailedBinderCallBack;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CallInput.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\f\rR\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\n\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput;", "LdL/d;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "getCallId", "()Ljava/lang/String;", FailedBinderCallBack.CALLER_ID, "getScenario", "scenario", "", "isVideo", "()Z", "NewCall", "RecallFromSystemApi", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$NewCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CallInput extends dL.d {

    /* compiled from: CallInput.kt */
    @P
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\r\u0010\u001c\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u0080\u0001\u0010$\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006,"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$NewCall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "scenario", "isVideo", "", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "itemId", "", "extraInfo", "", "analyticsExtraParams", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/util/Map;)V", "getAnalyticsExtraParams", "()Ljava/util/Map;", "getCallId", "()Ljava/lang/String;", "getExtraInfo", "getFrom", "()Z", "getItemId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getScenario", "getTo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/util/Map;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$NewCall;", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NewCall implements CallInput {
        public static final int $stable = 8;

        @l
        private final Map<String, String> analyticsExtraParams;

        @Y61.k
        private final String callId;

        @l
        private final Map<String, String> extraInfo;

        @Y61.k
        private final String from;
        private final boolean isVideo;

        @l
        private final Long itemId;

        @Y61.k
        private final String scenario;

        @Y61.k
        private final String to;

        public NewCall(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k String str3, @Y61.k String str4, @l Long l12, @l Map<String, String> map, @l Map<String, String> map2) {
            this.callId = str;
            this.scenario = str2;
            this.isVideo = z12;
            this.to = str3;
            this.from = str4;
            this.itemId = l12;
            this.extraInfo = map;
            this.analyticsExtraParams = map2;
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @Y61.k
        /* renamed from: component2, reason: from getter */
        public final String getScenario() {
            return this.scenario;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        @Y61.k
        /* renamed from: component4, reason: from getter */
        public final String getTo() {
            return this.to;
        }

        @Y61.k
        /* renamed from: component5, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Long getItemId() {
            return this.itemId;
        }

        @l
        public final Map<String, String> component7() {
            return this.extraInfo;
        }

        @l
        public final Map<String, String> component8() {
            return this.analyticsExtraParams;
        }

        @Y61.k
        public final NewCall copy(@Y61.k String callId, @Y61.k String scenario, boolean isVideo, @Y61.k String to2, @Y61.k String from, @l Long itemId, @l Map<String, String> extraInfo, @l Map<String, String> analyticsExtraParams) {
            return new NewCall(callId, scenario, isVideo, to2, from, itemId, extraInfo, analyticsExtraParams);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewCall)) {
                return false;
            }
            NewCall newCall = (NewCall) other;
            return L.f(this.callId, newCall.callId) && L.f(this.scenario, newCall.scenario) && this.isVideo == newCall.isVideo && L.f(this.to, newCall.to) && L.f(this.from, newCall.from) && L.f(this.itemId, newCall.itemId) && L.f(this.extraInfo, newCall.extraInfo) && L.f(this.analyticsExtraParams, newCall.analyticsExtraParams);
        }

        @l
        public final Map<String, String> getAnalyticsExtraParams() {
            return this.analyticsExtraParams;
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput
        @Y61.k
        public String getCallId() {
            return this.callId;
        }

        @l
        public final Map<String, String> getExtraInfo() {
            return this.extraInfo;
        }

        @Y61.k
        public final String getFrom() {
            return this.from;
        }

        @l
        public final Long getItemId() {
            return this.itemId;
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput
        @Y61.k
        public String getScenario() {
            return this.scenario;
        }

        @Y61.k
        public final String getTo() {
            return this.to;
        }

        public int hashCode() {
            int iD2 = H.d(H.d(r.i(H.d(this.callId.hashCode() * 31, 31, this.scenario), 31, this.isVideo), 31, this.to), 31, this.from);
            Long l12 = this.itemId;
            int iHashCode = (iD2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Map<String, String> map = this.extraInfo;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.analyticsExtraParams;
            return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput
        public boolean isVideo() {
            return this.isVideo;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("NewCall(callId=");
            sb2.append(this.callId);
            sb2.append(", scenario=");
            sb2.append(this.scenario);
            sb2.append(", isVideo=");
            sb2.append(this.isVideo);
            sb2.append(", to=");
            sb2.append(this.to);
            sb2.append(", from=");
            sb2.append(this.from);
            sb2.append(", itemId=");
            sb2.append(this.itemId);
            sb2.append(", extraInfo=");
            sb2.append(this.extraInfo);
            sb2.append(", analyticsExtraParams=");
            return r.w(sb2, this.analyticsExtraParams, ')');
        }
    }

    /* compiled from: CallInput.kt */
    @P
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0010\b\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\tJ\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\r\u0010\u0012\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\b\u0002\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0015\u0010\b\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$RecallFromSystemApi;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "scenario", "isVideo", "", "prevCallId", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "()Z", "getPrevCallId", "getScenario", "component1", "component2", "component3", "component4", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecallFromSystemApi implements CallInput {
        public static final int $stable = 0;

        @Y61.k
        private final String callId;
        private final boolean isVideo;

        @Y61.k
        private final String prevCallId;

        @Y61.k
        private final String scenario;

        public RecallFromSystemApi(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k String str3) {
            this.callId = str;
            this.scenario = str2;
            this.isVideo = z12;
            this.prevCallId = str3;
        }

        public static /* synthetic */ RecallFromSystemApi copy$default(RecallFromSystemApi recallFromSystemApi, String str, String str2, boolean z12, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = recallFromSystemApi.callId;
            }
            if ((i12 & 2) != 0) {
                str2 = recallFromSystemApi.scenario;
            }
            if ((i12 & 4) != 0) {
                z12 = recallFromSystemApi.isVideo;
            }
            if ((i12 & 8) != 0) {
                str3 = recallFromSystemApi.prevCallId;
            }
            return recallFromSystemApi.copy(str, str2, z12, str3);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @Y61.k
        /* renamed from: component2, reason: from getter */
        public final String getScenario() {
            return this.scenario;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        @Y61.k
        /* renamed from: component4, reason: from getter */
        public final String getPrevCallId() {
            return this.prevCallId;
        }

        @Y61.k
        public final RecallFromSystemApi copy(@Y61.k String callId, @Y61.k String scenario, boolean isVideo, @Y61.k String prevCallId) {
            return new RecallFromSystemApi(callId, scenario, isVideo, prevCallId);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecallFromSystemApi)) {
                return false;
            }
            RecallFromSystemApi recallFromSystemApi = (RecallFromSystemApi) other;
            return L.f(this.callId, recallFromSystemApi.callId) && L.f(this.scenario, recallFromSystemApi.scenario) && this.isVideo == recallFromSystemApi.isVideo && L.f(this.prevCallId, recallFromSystemApi.prevCallId);
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput
        @Y61.k
        public String getCallId() {
            return this.callId;
        }

        @Y61.k
        public final String getPrevCallId() {
            return this.prevCallId;
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput
        @Y61.k
        public String getScenario() {
            return this.scenario;
        }

        public int hashCode() {
            return this.prevCallId.hashCode() + r.i(H.d(this.callId.hashCode() * 31, 31, this.scenario), 31, this.isVideo);
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput
        public boolean isVideo() {
            return this.isVideo;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RecallFromSystemApi(callId=");
            sb2.append(this.callId);
            sb2.append(", scenario=");
            sb2.append(this.scenario);
            sb2.append(", isVideo=");
            sb2.append(this.isVideo);
            sb2.append(", prevCallId=");
            return C22026a.c(sb2, this.prevCallId, ')');
        }
    }

    @Y61.k
    String getCallId();

    @Y61.k
    String getScenario();

    boolean isVideo();
}
