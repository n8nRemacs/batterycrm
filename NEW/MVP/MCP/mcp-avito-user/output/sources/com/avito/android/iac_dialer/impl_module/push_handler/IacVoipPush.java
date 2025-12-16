package com.avito.android.iac_dialer.impl_module.push_handler;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacVoipPush.kt */
@P
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JN\u0010\u0017\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b\u0006\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010\u0011R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006("}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/push_handler/IacVoipPush;", "LdL/d;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "isVideo", "isHighPriority", "", "tags", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "rawJson", "<init>", "(Ljava/lang/String;ZZLjava/util/List;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "copy", "(Ljava/lang/String;ZZLjava/util/List;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;)Lcom/avito/android/iac_dialer/impl_module/push_handler/IacVoipPush;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Z", "Ljava/util/List;", "getTags", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getRawJson", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacVoipPush implements dL.d {
    public static final int $stable = 8;

    @k
    private final String callId;
    private final boolean isHighPriority;
    private final boolean isVideo;

    @k
    private final IacPiiString rawJson;

    @l
    private final List<String> tags;

    public IacVoipPush(@k String str, boolean z12, boolean z13, @l List<String> list, @k IacPiiString iacPiiString) {
        this.callId = str;
        this.isVideo = z12;
        this.isHighPriority = z13;
        this.tags = list;
        this.rawJson = iacPiiString;
    }

    public static /* synthetic */ IacVoipPush copy$default(IacVoipPush iacVoipPush, String str, boolean z12, boolean z13, List list, IacPiiString iacPiiString, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = iacVoipPush.callId;
        }
        if ((i12 & 2) != 0) {
            z12 = iacVoipPush.isVideo;
        }
        boolean z14 = z12;
        if ((i12 & 4) != 0) {
            z13 = iacVoipPush.isHighPriority;
        }
        boolean z15 = z13;
        if ((i12 & 8) != 0) {
            list = iacVoipPush.tags;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            iacPiiString = iacVoipPush.rawJson;
        }
        return iacVoipPush.copy(str, z14, z15, list2, iacPiiString);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsHighPriority() {
        return this.isHighPriority;
    }

    @l
    public final List<String> component4() {
        return this.tags;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final IacPiiString getRawJson() {
        return this.rawJson;
    }

    @k
    public final IacVoipPush copy(@k String callId, boolean isVideo, boolean isHighPriority, @l List<String> tags, @k IacPiiString rawJson) {
        return new IacVoipPush(callId, isVideo, isHighPriority, tags, rawJson);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacVoipPush)) {
            return false;
        }
        IacVoipPush iacVoipPush = (IacVoipPush) other;
        return L.f(this.callId, iacVoipPush.callId) && this.isVideo == iacVoipPush.isVideo && this.isHighPriority == iacVoipPush.isHighPriority && L.f(this.tags, iacVoipPush.tags) && L.f(this.rawJson, iacVoipPush.rawJson);
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @k
    public final IacPiiString getRawJson() {
        return this.rawJson;
    }

    @l
    public final List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int i12 = r.i(r.i(this.callId.hashCode() * 31, 31, this.isVideo), 31, this.isHighPriority);
        List<String> list = this.tags;
        return this.rawJson.hashCode() + ((i12 + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final boolean isHighPriority() {
        return this.isHighPriority;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @k
    public String toString() {
        return "IacVoipPush(callId=" + this.callId + ", isVideo=" + this.isVideo + ", isHighPriority=" + this.isHighPriority + ", tags=" + this.tags + ", rawJson=" + this.rawJson + ')';
    }
}
