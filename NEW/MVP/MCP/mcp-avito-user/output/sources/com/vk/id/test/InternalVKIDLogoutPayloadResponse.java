package com.vk.id.test;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InternalVKIDOverrideApi.kt */
@P
@InternalVKIDApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH×\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/vk/id/test/InternalVKIDLogoutPayloadResponse;", "", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalVKIDLogoutPayloadResponse {

    @l
    private final String error;

    /* JADX WARN: Multi-variable type inference failed */
    public InternalVKIDLogoutPayloadResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InternalVKIDLogoutPayloadResponse) && L.f(this.error, ((InternalVKIDLogoutPayloadResponse) other).error);
    }

    public int hashCode() {
        String str = this.error;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public String toString() {
        return c.k("InternalVKIDLogoutPayloadResponse(error=", this.error, ")");
    }

    public InternalVKIDLogoutPayloadResponse(@l String str) {
        this.error = str;
    }

    public /* synthetic */ InternalVKIDLogoutPayloadResponse(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }
}
