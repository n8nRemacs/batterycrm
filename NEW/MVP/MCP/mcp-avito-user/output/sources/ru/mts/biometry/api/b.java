package ru.mts.biometry.api;

import Y41.l;
import Y61.k;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.mts.biometry.api.entity.state.ApiIdentificationState;

/* compiled from: BiometryDataSource.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Lru/mts/biometry/api/entity/state/ApiIdentificationState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ru.mts.biometry.api.BiometryDataSource$state$2", f = "BiometryDataSource.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class b extends SuspendLambda implements l<Continuation<? super ApiIdentificationState>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f436308q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f436309r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation<? super b> continuation) {
        super(1, continuation);
        this.f436309r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@k Continuation<?> continuation) {
        return new b(this.f436309r, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super ApiIdentificationState> continuation) {
        return ((b) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f436308q;
        if (i12 == 0) {
            C42729a0.b(obj);
            d dVar = this.f436309r;
            this.f436308q = 1;
            obj = dVar.f436313b.c(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
