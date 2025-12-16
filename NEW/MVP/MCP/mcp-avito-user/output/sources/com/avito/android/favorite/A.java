package com.avito.android.favorite;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* compiled from: FavoritesStorageWithCache.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "com/avito/android/favorite/B"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite.FavoritesStorageWithCache$syncCacheWithPersistent$$inlined$updateCache$1", f = "FavoritesStorageWithCache.kt", i = {0}, l = {122}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes13.dex */
public final class A extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f155153q;

    /* renamed from: r, reason: collision with root package name */
    public z f155154r;

    /* renamed from: s, reason: collision with root package name */
    public int f155155s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f155156t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f155157u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(z zVar, Continuation continuation, z zVar2) {
        super(2, continuation);
        this.f155156t = zVar;
        this.f155157u = zVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new A(this.f155156t, continuation, this.f155157u);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((A) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        kotlinx.coroutines.sync.d dVar;
        z zVar;
        Map<String, Boolean> value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f155155s;
        if (i12 == 0) {
            C42729a0.b(obj);
            z zVar2 = this.f155156t;
            dVar = zVar2.f155246c;
            this.f155153q = dVar;
            this.f155154r = zVar2;
            this.f155155s = 1;
            if (dVar.b(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zVar = zVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = this.f155154r;
            dVar = this.f155153q;
            C42729a0.b(obj);
        }
        try {
            Z1<Map<String, Boolean>> z12 = zVar.f155245b;
            do {
                value = z12.getValue();
                Map<String, Boolean> map = value;
                new LinkedHashMap(zVar.f155245b.getValue());
            } while (!z12.N3(value, this.f155157u.f155244a.n()));
            G0 g02 = G0.f406611a;
            dVar.d(null);
            return G0.f406611a;
        } catch (Throwable th2) {
            dVar.d(null);
            throw th2;
        }
    }
}
