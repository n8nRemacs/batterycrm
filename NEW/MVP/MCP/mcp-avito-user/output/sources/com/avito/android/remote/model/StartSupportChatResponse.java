package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StartSupportChatResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/StartSupportChatResponse;", "", "result", "Lcom/avito/android/remote/model/StartSupportChatResult;", "(Lcom/avito/android/remote/model/StartSupportChatResult;)V", "getResult", "()Lcom/avito/android/remote/model/StartSupportChatResult;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StartSupportChatResponse {
    public static final int $stable = 0;

    @c("result")
    @k
    private final StartSupportChatResult result;

    public StartSupportChatResponse(@k StartSupportChatResult startSupportChatResult) {
        this.result = startSupportChatResult;
    }

    public static /* synthetic */ StartSupportChatResponse copy$default(StartSupportChatResponse startSupportChatResponse, StartSupportChatResult startSupportChatResult, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            startSupportChatResult = startSupportChatResponse.result;
        }
        return startSupportChatResponse.copy(startSupportChatResult);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final StartSupportChatResult getResult() {
        return this.result;
    }

    @k
    public final StartSupportChatResponse copy(@k StartSupportChatResult result) {
        return new StartSupportChatResponse(result);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StartSupportChatResponse) && L.f(this.result, ((StartSupportChatResponse) other).result);
    }

    @k
    public final StartSupportChatResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    @k
    public String toString() {
        return "StartSupportChatResponse(result=" + this.result + ')';
    }
}
