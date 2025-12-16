package com.avito.android.rating.details.answer.photo;

import Mg0.InterfaceC14487a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.review_reply.AddReviewReplyResult;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;

/* compiled from: RatingAddAnswerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/b;", "Lcom/avito/android/rating/details/answer/photo/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14487a f246654a;

    @Inject
    public b(@k InterfaceC14487a interfaceC14487a) {
        this.f246654a = interfaceC14487a;
    }

    @Override // com.avito.android.rating.details.answer.photo.a
    @l
    public final Object a(long j12, @k String str, @k List<Long> list, @k Continuation<? super TypedResult<AddReviewReplyResult>> continuation) {
        return this.f246654a.p(j12, str, C42745f0.O(list, ",", null, null, null, 62), null, continuation);
    }
}
