package com.avito.android.bxcontent;

import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentCombinationFeatureManager.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/l;", "searchState", "Lcom/avito/android/map/mvi/entity/a;", "mapState", "LeT/c;", "beduinState", "Lcom/avito/android/bxcontent/l;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/l;Lcom/avito/android/map/mvi/entity/a;LeT/c;)Lcom/avito/android/bxcontent/l;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxContentCombinationFeatureManager$state$1", f = "BxContentCombinationFeatureManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29087h extends SuspendLambda implements Y41.r<com.avito.android.bxcontent.mvi.entity.l, com.avito.android.map.mvi.entity.a, AbstractC40048c, Continuation<? super C29099l>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111116q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ com.avito.android.map.mvi.entity.a f111117r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ AbstractC40048c f111118s;

    public C29087h() {
        throw null;
    }

    @Override // Y41.r
    public final Object invoke(com.avito.android.bxcontent.mvi.entity.l lVar, com.avito.android.map.mvi.entity.a aVar, AbstractC40048c abstractC40048c, Continuation<? super C29099l> continuation) {
        C29087h c29087h = new C29087h(4, continuation);
        c29087h.f111116q = lVar;
        c29087h.f111117r = aVar;
        c29087h.f111118s = abstractC40048c;
        return c29087h.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new C29099l(this.f111116q, this.f111117r, this.f111118s);
    }
}
