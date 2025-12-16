package com.avito.android.lib.beduin_v2.repository.favorite_item;

import Y41.l;
import Y41.p;
import Y61.k;
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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lV0.C43689a;

/* compiled from: FavoriteItemRepositoryClientImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.repository.favorite_item.FavoriteItemRepositoryClientImpl$observe$job$1", f = "FavoriteItemRepositoryClientImpl.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f176600q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.beduin_v2.repository.favorite_item.a f176601r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f176602s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l<C43689a, G0> f176603t;

    /* compiled from: FavoriteItemRepositoryClientImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "map", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.repository.favorite_item.FavoriteItemRepositoryClientImpl$observe$job$1$1", f = "FavoriteItemRepositoryClientImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<Map<String, ? extends Boolean>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f176604q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f176605r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l<C43689a, G0> f176606s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, l<? super C43689a, G0> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f176605r = str;
            this.f176606s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f176605r, this.f176606s, continuation);
            aVar.f176604q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Map<String, ? extends Boolean> map, Continuation<? super G0> continuation) {
            return ((a) create(map, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Boolean bool = (Boolean) ((Map) this.f176604q).get(this.f176605r);
            this.f176606s.invoke(bool != null ? new C43689a(bool.booleanValue()) : null);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(com.avito.android.lib.beduin_v2.repository.favorite_item.a aVar, String str, l<? super C43689a, G0> lVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f176601r = aVar;
        this.f176602s = str;
        this.f176603t = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new c(this.f176601r, this.f176602s, this.f176603t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f176600q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i<Map<String, Boolean>> data = this.f176601r.f176590c.getData();
            a aVar = new a(this.f176602s, this.f176603t, null);
            this.f176600q = 1;
            if (C43175k.j(data, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
