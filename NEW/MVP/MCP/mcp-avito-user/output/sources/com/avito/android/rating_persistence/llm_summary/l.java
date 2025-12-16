package com.avito.android.rating_persistence.llm_summary;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingLLMSummaryInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_persistence.llm_summary.RatingLLMSummaryInteractorImpl", f = "RatingLLMSummaryInteractor.kt", i = {0, 0, 0}, l = {36}, m = "checkFeedbackWasSentFlow", n = {"this", ChannelContext.Item.USER_ID, "itemId"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes16.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f249826q;

    /* renamed from: r, reason: collision with root package name */
    public String f249827r;

    /* renamed from: s, reason: collision with root package name */
    public long f249828s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f249829t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f249830u;

    /* renamed from: v, reason: collision with root package name */
    public int f249831v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f249830u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f249829t = obj;
        this.f249831v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f249830u.a(0L, this);
    }
}
