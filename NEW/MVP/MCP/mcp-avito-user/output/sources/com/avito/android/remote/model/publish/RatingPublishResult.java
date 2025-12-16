package com.avito.android.remote.model.publish;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RatingPublishResult.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/publish/RatingPublishResult;", "", "Action", "Lcom/avito/android/remote/model/publish/RatingPublishResult$Action;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RatingPublishResult {

    /* compiled from: RatingPublishResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/publish/RatingPublishResult$Action;", "Lcom/avito/android/remote/model/publish/RatingPublishResult;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "getAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action implements RatingPublishResult {

        @c("action")
        @l
        private final DeepLink action;

        public Action(@l DeepLink deepLink) {
            this.action = deepLink;
        }

        @l
        public final DeepLink getAction() {
            return this.action;
        }
    }
}
