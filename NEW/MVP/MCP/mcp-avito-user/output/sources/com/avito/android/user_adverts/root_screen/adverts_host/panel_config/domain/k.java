package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ItemsConfigStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.ItemsConfigStorageImpl$shouldShowStatsOnboarding$2", f = "ItemsConfigStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class k extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j f313288q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f313288q = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f313288q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        j jVar = this.f313288q;
        boolean zA2 = jVar.f313284a.a();
        long jNow = jVar.f313286c.now();
        cK0.b bVar = jVar.f313284a;
        boolean z12 = false;
        boolean z13 = jNow - bVar.d() > 86400000;
        boolean z14 = bVar.c() < 3;
        if (!zA2 && z13 && z14) {
            z12 = true;
        }
        return Boxing.boxBoolean(z12);
    }
}
