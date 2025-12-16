package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PinUnpinChannelResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lru/avito/messenger/api/entity/PinUnpinChannelResponse;", "", "", "isSuccess", "", "error", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getError", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PinUnpinChannelResponse {

    @c("error")
    @l
    private final String error;

    @c("ok")
    private final boolean isSuccess;

    public PinUnpinChannelResponse(boolean z12, @l String str) {
        this.isSuccess = z12;
        this.error = str;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinUnpinChannelResponse)) {
            return false;
        }
        PinUnpinChannelResponse pinUnpinChannelResponse = (PinUnpinChannelResponse) other;
        return this.isSuccess == pinUnpinChannelResponse.isSuccess && L.f(this.error, pinUnpinChannelResponse.error);
    }

    @l
    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSuccess) * 31;
        String str = this.error;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PinUnpinChannelResponse(isSuccess=");
        sb2.append(this.isSuccess);
        sb2.append(", error=");
        return C22026a.c(sb2, this.error, ')');
    }
}
