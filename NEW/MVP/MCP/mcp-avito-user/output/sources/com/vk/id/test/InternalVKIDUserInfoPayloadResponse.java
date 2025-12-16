package com.vk.id.test;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InternalVKIDOverrideApi.kt */
@P
@InternalVKIDApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/vk/id/test/InternalVKIDUserInfoPayloadResponse;", "", "", "error", "Lcom/vk/id/test/InternalVKIDUserPayloadResponse;", ChannelContext.UserToUser.TYPE, VoiceInfo.STATE, "<init>", "(Ljava/lang/String;Lcom/vk/id/test/InternalVKIDUserPayloadResponse;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "Lcom/vk/id/test/InternalVKIDUserPayloadResponse;", "getUser", "()Lcom/vk/id/test/InternalVKIDUserPayloadResponse;", "getState", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalVKIDUserInfoPayloadResponse {

    @l
    private final String error;

    @l
    private final String state;

    @l
    private final InternalVKIDUserPayloadResponse user;

    public InternalVKIDUserInfoPayloadResponse() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVKIDUserInfoPayloadResponse)) {
            return false;
        }
        InternalVKIDUserInfoPayloadResponse internalVKIDUserInfoPayloadResponse = (InternalVKIDUserInfoPayloadResponse) other;
        return L.f(this.error, internalVKIDUserInfoPayloadResponse.error) && L.f(this.user, internalVKIDUserInfoPayloadResponse.user) && L.f(this.state, internalVKIDUserInfoPayloadResponse.state);
    }

    public int hashCode() {
        String str = this.error;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InternalVKIDUserPayloadResponse internalVKIDUserPayloadResponse = this.user;
        int iHashCode2 = (iHashCode + (internalVKIDUserPayloadResponse == null ? 0 : internalVKIDUserPayloadResponse.hashCode())) * 31;
        String str2 = this.state;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        String str = this.error;
        InternalVKIDUserPayloadResponse internalVKIDUserPayloadResponse = this.user;
        String str2 = this.state;
        StringBuilder sb2 = new StringBuilder("InternalVKIDUserInfoPayloadResponse(error=");
        sb2.append(str);
        sb2.append(", user=");
        sb2.append(internalVKIDUserPayloadResponse);
        sb2.append(", state=");
        return c.s(sb2, str2, ")");
    }

    public InternalVKIDUserInfoPayloadResponse(@l String str, @l InternalVKIDUserPayloadResponse internalVKIDUserPayloadResponse, @l String str2) {
        this.error = str;
        this.user = internalVKIDUserPayloadResponse;
        this.state = str2;
    }

    public /* synthetic */ InternalVKIDUserInfoPayloadResponse(String str, InternalVKIDUserPayloadResponse internalVKIDUserPayloadResponse, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : internalVKIDUserPayloadResponse, (i12 & 4) != 0 ? null : str2);
    }
}
