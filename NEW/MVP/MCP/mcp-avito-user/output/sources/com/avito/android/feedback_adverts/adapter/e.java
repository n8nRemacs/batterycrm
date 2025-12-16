package com.avito.android.feedback_adverts.adapter;

import Y61.k;
import com.avito.android.feedback_adverts.adapter.c;
import com.avito.android.remote.feedback.FeedbackAdvertItem;
import com.avito.android.remote.model.Image;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FeedbackAdvertsItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/adapter/e;", "Lcom/avito/android/feedback_adverts/adapter/c;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<c.a> f157763b;

    @Inject
    public e(@k h31.e<c.a> eVar) {
        this.f157763b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        FeedbackAdvertItem feedbackAdvertItem = (FeedbackAdvertItem) aVar;
        gVar.J(feedbackAdvertItem.f253446c);
        gVar.p(feedbackAdvertItem.f253447d);
        List<Image> list = feedbackAdvertItem.f253449f;
        gVar.l(list != null ? (Image) C42745f0.G(list) : null);
        gVar.J0(new d(this, feedbackAdvertItem));
    }
}
