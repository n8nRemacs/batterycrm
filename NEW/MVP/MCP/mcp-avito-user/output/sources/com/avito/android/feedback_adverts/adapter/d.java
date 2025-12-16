package com.avito.android.feedback_adverts.adapter;

import com.avito.android.remote.feedback.FeedbackAdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeedbackAdvertsItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f157761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FeedbackAdvertItem f157762m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, FeedbackAdvertItem feedbackAdvertItem) {
        super(0);
        this.f157761l = eVar;
        this.f157762m = feedbackAdvertItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f157761l.f157763b.get().e4(this.f157762m);
        return G0.f406611a;
    }
}
