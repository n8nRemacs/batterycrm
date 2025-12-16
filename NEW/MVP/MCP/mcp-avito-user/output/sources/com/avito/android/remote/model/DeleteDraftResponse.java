package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DeleteDraftResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/DeleteDraftResponse;", "", "draft", "Lcom/avito/android/remote/model/DeleteDraftResponse$Draft;", "(Lcom/avito/android/remote/model/DeleteDraftResponse$Draft;)V", "getDraft", "()Lcom/avito/android/remote/model/DeleteDraftResponse$Draft;", "Draft", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeleteDraftResponse {

    @c("draft")
    @k
    private final Draft draft;

    /* compiled from: DeleteDraftResponse.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/DeleteDraftResponse$Draft;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Draft {

        @c("id")
        @k
        private final String id;

        public Draft(@k String str) {
            this.id = str;
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    public DeleteDraftResponse(@k Draft draft) {
        this.draft = draft;
    }

    @k
    public final Draft getDraft() {
        return this.draft;
    }
}
