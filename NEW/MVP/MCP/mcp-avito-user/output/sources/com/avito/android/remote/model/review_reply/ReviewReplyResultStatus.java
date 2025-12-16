package com.avito.android.remote.model.review_reply;

import P41.c;
import Y61.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: ReviewReplyResultStatus.kt */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/review_reply/ReviewReplyResultStatus;", "", "Companion", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c
/* loaded from: classes17.dex */
public @interface ReviewReplyResultStatus {

    @k
    public static final String ACTIVE = "active";

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @k
    public static final String DECLINED = "declined";

    @k
    public static final String MODERATION = "moderation";

    /* compiled from: ReviewReplyResultStatus.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/review_reply/ReviewReplyResultStatus$Companion;", "", "()V", "ACTIVE", "", "DECLINED", "MODERATION", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        public static final String ACTIVE = "active";

        @k
        public static final String DECLINED = "declined";

        @k
        public static final String MODERATION = "moderation";

        private Companion() {
        }
    }
}
