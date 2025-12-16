package ru.mts.biometry.api.entity.inn;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InnRequestResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/mts/biometry/api/entity/inn/InnRequestResponse;", "", "", "requestId", "Lru/mts/biometry/api/entity/inn/InnData;", "data", "<init>", "(Ljava/lang/String;Lru/mts/biometry/api/entity/inn/InnData;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lru/mts/biometry/api/entity/inn/InnData;", "a", "()Lru/mts/biometry/api/entity/inn/InnData;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InnRequestResponse {

    @c("data")
    @l
    private final InnData data;

    @c("request_id")
    @l
    private final String requestId;

    public InnRequestResponse(@l String str, @l InnData innData) {
        this.requestId = str;
        this.data = innData;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final InnData getData() {
        return this.data;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnRequestResponse)) {
            return false;
        }
        InnRequestResponse innRequestResponse = (InnRequestResponse) obj;
        return L.f(this.requestId, innRequestResponse.requestId) && L.f(this.data, innRequestResponse.data);
    }

    public final int hashCode() {
        String str = this.requestId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InnData innData = this.data;
        return iHashCode + (innData != null ? innData.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "InnRequestResponse(requestId=" + this.requestId + ", data=" + this.data + ')';
    }
}
