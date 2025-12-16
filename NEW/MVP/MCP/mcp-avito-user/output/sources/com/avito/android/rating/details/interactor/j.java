package com.avito.android.rating.details.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingDetailsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating.details.interactor.RatingDetailsInteractorImpl", f = "RatingDetailsInteractor.kt", i = {}, l = {322}, m = "getReviewActions", n = {}, s = {})
/* loaded from: classes16.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f247121q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f247122r;

    /* renamed from: s, reason: collision with root package name */
    public int f247123s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f247122r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f247121q = obj;
        this.f247123s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f247122r.a(0L, this);
    }
}
