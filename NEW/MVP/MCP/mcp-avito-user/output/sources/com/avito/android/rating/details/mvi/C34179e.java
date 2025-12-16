package com.avito.android.rating.details.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.review_reply.DeleteBuyerReviewResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor", f = "RatingDetailsActor.kt", i = {0, 0}, l = {535, 536, 538}, m = "handleDeleteBuyerReviewSuccess", n = {"$this$handleDeleteBuyerReviewSuccess", "result"}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.rating.details.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34179e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f247307q;

    /* renamed from: r, reason: collision with root package name */
    public DeleteBuyerReviewResult f247308r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f247309s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34175a f247310t;

    /* renamed from: u, reason: collision with root package name */
    public int f247311u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34179e(C34175a c34175a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f247310t = c34175a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f247309s = obj;
        this.f247311u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C34175a.d(this.f247310t, null, 0L, null, null, this);
    }
}
