package com.avito.android.favorite;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* compiled from: FavoritesStorageWithCache.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "com/avito/android/favorite/B"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite.FavoritesStorageWithCache$clearMarkForRemove$$inlined$updateCache$1", f = "FavoritesStorageWithCache.kt", i = {0}, l = {122}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes13.dex */
public final class y extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f155239q;

    /* renamed from: r, reason: collision with root package name */
    public z f155240r;

    /* renamed from: s, reason: collision with root package name */
    public int f155241s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f155242t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f155243u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Continuation continuation, String str) {
        super(2, continuation);
        this.f155242t = zVar;
        this.f155243u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new y(this.f155242t, continuation, this.f155243u);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((y) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        kotlinx.coroutines.sync.d dVar;
        z zVar;
        Map<String, Boolean> value;
        LinkedHashMap linkedHashMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f155241s;
        if (i12 == 0) {
            C42729a0.b(obj);
            z zVar2 = this.f155242t;
            dVar = zVar2.f155246c;
            this.f155239q = dVar;
            this.f155240r = zVar2;
            this.f155241s = 1;
            if (dVar.b(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zVar = zVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = this.f155240r;
            dVar = this.f155239q;
            C42729a0.b(obj);
        }
        try {
            Z1<Map<String, Boolean>> z12 = zVar.f155245b;
            do {
                value = z12.getValue();
                Map<String, Boolean> map = value;
                linkedHashMap = new LinkedHashMap(zVar.f155245b.getValue());
                linkedHashMap.put(this.f155243u, Boxing.boxBoolean(true));
            } while (!z12.N3(value, linkedHashMap));
            G0 g02 = G0.f406611a;
            dVar.d(null);
            return G0.f406611a;
        } catch (Throwable th2) {
            dVar.d(null);
            throw th2;
        }
    }
}
