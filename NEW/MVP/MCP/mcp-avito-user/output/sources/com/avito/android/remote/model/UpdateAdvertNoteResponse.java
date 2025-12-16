package com.avito.android.remote.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: UpdateAdvertNoteResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/UpdateAdvertNoteResponse;", "", "isDeleted", "", "(Z)V", "()Z", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UpdateAdvertNoteResponse {

    @c("isDeleted")
    private final boolean isDeleted;

    public UpdateAdvertNoteResponse(boolean z12) {
        this.isDeleted = z12;
    }

    /* renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }
}
