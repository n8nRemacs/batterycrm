package com.avito.android.comfortable_deal.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DealStageInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.comfortable_deal.domain.DealStageInteractor", f = "DealStageInteractor.kt", i = {}, l = {14}, m = "getRouteResult", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f122006q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f122007r;

    /* renamed from: s, reason: collision with root package name */
    public int f122008s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f122007r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f122006q = obj;
        this.f122008s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f122007r.a(this);
    }
}
