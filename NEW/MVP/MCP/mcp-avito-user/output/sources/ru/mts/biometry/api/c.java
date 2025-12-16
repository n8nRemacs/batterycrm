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
import ru.mts.biometry.api.dataSource.j;
import ru.mts.biometry.api.entity.state.ApiIdentificationState;

/* compiled from: BiometryDataSource.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Lru/mts/biometry/api/entity/state/ApiIdentificationState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ru.mts.biometry.api.BiometryDataSource$state$3", f = "BiometryDataSource.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class c extends SuspendLambda implements l<Continuation<? super ApiIdentificationState>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f436310q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f436311r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation<? super c> continuation) {
        super(1, continuation);
        this.f436311r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@k Continuation<?> continuation) {
        return new c(this.f436311r, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super ApiIdentificationState> continuation) {
        return ((c) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f436310q;
        if (i12 == 0) {
            C42729a0.b(obj);
            j jVar = this.f436311r.f436312a;
            this.f436310q = 1;
            obj = jVar.g(this);
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
