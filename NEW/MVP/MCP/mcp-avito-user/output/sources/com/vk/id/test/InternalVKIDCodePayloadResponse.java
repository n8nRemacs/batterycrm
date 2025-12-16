package com.vk.id.test;

import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InternalVKIDOverrideApi.kt */
@P
@InternalVKIDApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/vk/id/test/InternalVKIDCodePayloadResponse;", "", "", "code", VoiceInfo.STATE, "deviceId", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getState", "getDeviceId", "getError", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalVKIDCodePayloadResponse {

    @c("code")
    @l
    private final String code;

    @c("device_id")
    @l
    private final String deviceId;

    @c("error")
    @l
    private final String error;

    @c(VoiceInfo.STATE)
    @l
    private final String state;

    public InternalVKIDCodePayloadResponse() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVKIDCodePayloadResponse)) {
            return false;
        }
        InternalVKIDCodePayloadResponse internalVKIDCodePayloadResponse = (InternalVKIDCodePayloadResponse) other;
        return L.f(this.code, internalVKIDCodePayloadResponse.code) && L.f(this.state, internalVKIDCodePayloadResponse.state) && L.f(this.deviceId, internalVKIDCodePayloadResponse.deviceId) && L.f(this.error, internalVKIDCodePayloadResponse.error);
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.error;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public String toString() {
        String str = this.code;
        String str2 = this.state;
        return G.h(C23088b.b("InternalVKIDCodePayloadResponse(code=", str, ", state=", str2, ", deviceId="), this.deviceId, ", error=", this.error, ")");
    }

    public InternalVKIDCodePayloadResponse(@l String str, @l String str2, @l String str3, @l String str4) {
        this.code = str;
        this.state = str2;
        this.deviceId = str3;
        this.error = str4;
    }

    public /* synthetic */ InternalVKIDCodePayloadResponse(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4);
    }
}
