package com.avito.android.rating.details.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.review_reply.DeleteModelReviewResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor", f = "RatingDetailsActor.kt", i = {0, 0}, l = {510, 511, 513}, m = "handleDeleteModelReviewSuccess", n = {"$this$handleDeleteModelReviewSuccess", "result"}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.rating.details.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34183f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f247442q;

    /* renamed from: r, reason: collision with root package name */
    public DeleteModelReviewResult f247443r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f247444s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34175a f247445t;

    /* renamed from: u, reason: collision with root package name */
    public int f247446u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34183f(C34175a c34175a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f247445t = c34175a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f247444s = obj;
        this.f247446u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C34175a.e(this.f247445t, null, 0L, null, null, this);
    }
}
