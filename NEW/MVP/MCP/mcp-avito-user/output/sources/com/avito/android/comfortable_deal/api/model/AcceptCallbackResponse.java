package com.avito.android.comfortable_deal.api.model;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AcceptCallbackResponse.kt */
@P
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/AcceptCallbackResponse;", "", "description", "", "status", "Lcom/avito/android/comfortable_deal/api/model/AcceptCallbackRequestStatus;", "(Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/AcceptCallbackRequestStatus;)V", "getDescription", "()Ljava/lang/String;", "getStatus", "()Lcom/avito/android/comfortable_deal/api/model/AcceptCallbackRequestStatus;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AcceptCallbackResponse {
    public static final int $stable = 0;

    @k
    private final String description;

    @k
    private final AcceptCallbackRequestStatus status;

    public AcceptCallbackResponse(@k String str, @k AcceptCallbackRequestStatus acceptCallbackRequestStatus) {
        this.description = str;
        this.status = acceptCallbackRequestStatus;
    }

    public static /* synthetic */ AcceptCallbackResponse copy$default(AcceptCallbackResponse acceptCallbackResponse, String str, AcceptCallbackRequestStatus acceptCallbackRequestStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = acceptCallbackResponse.description;
        }
        if ((i12 & 2) != 0) {
            acceptCallbackRequestStatus = acceptCallbackResponse.status;
        }
        return acceptCallbackResponse.copy(str, acceptCallbackRequestStatus);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AcceptCallbackRequestStatus getStatus() {
        return this.status;
    }

    @k
    public final AcceptCallbackResponse copy(@k String description, @k AcceptCallbackRequestStatus status) {
        return new AcceptCallbackResponse(description, status);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcceptCallbackResponse)) {
            return false;
        }
        AcceptCallbackResponse acceptCallbackResponse = (AcceptCallbackResponse) other;
        return L.f(this.description, acceptCallbackResponse.description) && this.status == acceptCallbackResponse.status;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final AcceptCallbackRequestStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.description.hashCode() * 31);
    }

    @k
    public String toString() {
        return "AcceptCallbackResponse(description=" + this.description + ", status=" + this.status + ')';
    }
}
