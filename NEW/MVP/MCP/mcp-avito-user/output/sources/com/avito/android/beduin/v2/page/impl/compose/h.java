package com.avito.android.beduin.v2.page.impl.compose;

import Y41.q;
import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BeduinV2PageComposeViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LeT/c;", "beduinState", "LHi/d;", "screenState", "Lcom/avito/android/beduin/v2/page/impl/compose/m;", "<anonymous>", "(LeT/c;LHi/d;)Lcom/avito/android/beduin/v2/page/impl/compose/m;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.compose.BeduinV2PageComposeViewModel$state$2$2", f = "BeduinV2PageComposeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements q<AbstractC40048c, Hi.d, Continuation<? super m>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ AbstractC40048c f104971q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Hi.d f104972r;

    public h() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(AbstractC40048c abstractC40048c, Hi.d dVar, Continuation<? super m> continuation) {
        h hVar = new h(3, continuation);
        hVar.f104971q = abstractC40048c;
        hVar.f104972r = dVar;
        return hVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new m(this.f104971q, this.f104972r);
    }
}
