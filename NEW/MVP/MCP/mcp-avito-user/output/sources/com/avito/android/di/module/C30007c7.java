package com.avito.android.di.module;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.publish.RatingPublishResult;
import com.avito.android.remote.model.review_action_network_request.ReviewActionNetworkRequestResult;
import com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult;
import com.avito.android.util.C35866p0;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: RatingJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/di/module/c7;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/p0;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.c7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30007c7 implements dagger.internal.h<Set<C35866p0>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C30007c7 f144248a = new C30007c7();

    @Override // javax.inject.Provider
    public final Object get() {
        C29996b7.f144237a.getClass();
        return kotlin.collections.b1.g(new C35866p0(ReviewActionNetworkRequestResult.class, kotlin.collections.P0.g(new kotlin.Q("ok", ReviewActionNetworkRequestResult.Ok.class), new kotlin.Q(RequestReviewResultKt.INFO_TYPE, ReviewActionNetworkRequestResult.Info.class), new kotlin.Q("error", ReviewActionNetworkRequestResult.Error.class))), new C35866p0(RatingUxFeedbackResult.class, kotlin.collections.P0.g(new kotlin.Q("ok", RatingUxFeedbackResult.Ok.class), new kotlin.Q("error", RatingUxFeedbackResult.Error.class))), new C35866p0(RatingPublishResult.class, Collections.singletonMap("action", RatingPublishResult.Action.class)));
    }
}
