package com.avito.android.remote.model.category_parameters.slot.auto_publish;

import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AutoPublishResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/auto_publish/AutoPublishResponse;", "", "available", "", "(Z)V", "getAvailable", "()Z", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AutoPublishResponse {

    @c("available")
    private final boolean available;

    public AutoPublishResponse(boolean z12) {
        this.available = z12;
    }

    public final boolean getAvailable() {
        return this.available;
    }
}
