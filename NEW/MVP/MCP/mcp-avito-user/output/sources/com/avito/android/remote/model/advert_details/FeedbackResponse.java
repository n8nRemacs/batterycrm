package com.avito.android.remote.model.advert_details;

import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: FeedbackResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/advert_details/FeedbackResponse;", "", "success", "", "(Ljava/lang/Boolean;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FeedbackResponse {

    @c("success")
    @l
    private final Boolean success;

    public FeedbackResponse(@l Boolean bool) {
        this.success = bool;
    }

    @l
    public final Boolean getSuccess() {
        return this.success;
    }
}
