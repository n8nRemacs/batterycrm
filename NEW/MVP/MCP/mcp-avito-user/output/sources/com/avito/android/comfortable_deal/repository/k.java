package com.avito.android.comfortable_deal.repository;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ComfortableDealRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl", f = "ComfortableDealRepository.kt", i = {}, l = {151}, m = "returnMortgageApplicationToWork", n = {}, s = {})
/* loaded from: classes12.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f122605q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f122606r;

    /* renamed from: s, reason: collision with root package name */
    public int f122607s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f122606r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f122605q = obj;
        this.f122607s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f122606r.h(null, this);
    }
}
