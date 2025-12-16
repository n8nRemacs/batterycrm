package com.avito.android.iac_dialer.impl_module.socket_subscription.app_startup_task;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import dL.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacSocketSubscriptionTask.kt */
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0012R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006&"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/socket_subscription/app_startup_task/CallDeliveredBySocketMessage;", "LdL/d;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "json", "", "isVideo", "", "tags", "<init>", "(Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;ZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component3", "()Z", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;ZLjava/util/List;)Lcom/avito/android/iac_dialer/impl_module/socket_subscription/app_startup_task/CallDeliveredBySocketMessage;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getJson", "Z", "Ljava/util/List;", "getTags", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CallDeliveredBySocketMessage implements d {
    public static final int $stable = 8;

    @k
    private final String callId;
    private final boolean isVideo;

    @k
    private final IacPiiString json;

    @l
    private final List<String> tags;

    public CallDeliveredBySocketMessage(@k String str, @k IacPiiString iacPiiString, boolean z12, @l List<String> list) {
        this.callId = str;
        this.json = iacPiiString;
        this.isVideo = z12;
        this.tags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallDeliveredBySocketMessage copy$default(CallDeliveredBySocketMessage callDeliveredBySocketMessage, String str, IacPiiString iacPiiString, boolean z12, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = callDeliveredBySocketMessage.callId;
        }
        if ((i12 & 2) != 0) {
            iacPiiString = callDeliveredBySocketMessage.json;
        }
        if ((i12 & 4) != 0) {
            z12 = callDeliveredBySocketMessage.isVideo;
        }
        if ((i12 & 8) != 0) {
            list = callDeliveredBySocketMessage.tags;
        }
        return callDeliveredBySocketMessage.copy(str, iacPiiString, z12, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final IacPiiString getJson() {
        return this.json;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    @l
    public final List<String> component4() {
        return this.tags;
    }

    @k
    public final CallDeliveredBySocketMessage copy(@k String callId, @k IacPiiString json, boolean isVideo, @l List<String> tags) {
        return new CallDeliveredBySocketMessage(callId, json, isVideo, tags);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallDeliveredBySocketMessage)) {
            return false;
        }
        CallDeliveredBySocketMessage callDeliveredBySocketMessage = (CallDeliveredBySocketMessage) other;
        return L.f(this.callId, callDeliveredBySocketMessage.callId) && L.f(this.json, callDeliveredBySocketMessage.json) && this.isVideo == callDeliveredBySocketMessage.isVideo && L.f(this.tags, callDeliveredBySocketMessage.tags);
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @k
    public final IacPiiString getJson() {
        return this.json;
    }

    @l
    public final List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int i12 = r.i((this.json.hashCode() + (this.callId.hashCode() * 31)) * 31, 31, this.isVideo);
        List<String> list = this.tags;
        return i12 + (list == null ? 0 : list.hashCode());
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CallDeliveredBySocketMessage(callId=");
        sb2.append(this.callId);
        sb2.append(", json=");
        sb2.append(this.json);
        sb2.append(", isVideo=");
        sb2.append(this.isVideo);
        sb2.append(", tags=");
        return H.p(sb2, this.tags, ')');
    }
}
