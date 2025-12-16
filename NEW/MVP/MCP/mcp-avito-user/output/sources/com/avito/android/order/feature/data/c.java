package com.avito.android.order.feature.data;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: OrderRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/data/c;", "Lcom/avito/android/order/feature/data/a;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.order.feature.data.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<N40.a> f209517a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f209518b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dD.b f209519c;

    /* compiled from: OrderRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LO40/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.order.feature.data.OrderRepositoryImpl$getOrderDetailsV2$2", f = "OrderRepositoryImpl.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<O40.b>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209520q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f209522s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f209523t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ OrderScreenSegment f209524u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, OrderScreenSegment orderScreenSegment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f209522s = str;
            this.f209523t = str2;
            this.f209524u = orderScreenSegment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new a(this.f209522s, this.f209523t, this.f209524u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<O40.b>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209520q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = c.this;
                N40.a aVar = cVar.f209517a.get();
                dD.b bVar = cVar.f209519c;
                bVar.getClass();
                n<Object> nVar = dD.b.f393739f[2];
                Integer numY0 = C43066x.y0((String) bVar.f393742d.a().invoke());
                String str = this.f209524u.f209450b;
                this.f209520q = 1;
                obj = aVar.a(this.f209522s, this.f209523t, numY0, str, this);
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

    @Inject
    public c(@k h31.e<N40.a> eVar, @k R0 r02, @k dD.b bVar) {
        this.f209517a = eVar;
        this.f209518b = r02;
        this.f209519c = bVar;
    }

    @Override // com.avito.android.order.feature.data.a
    @l
    public final Object a(@k String str, @k ContinuationImpl continuationImpl) {
        return C43259k.g(this.f209518b.a(), new d(this, str, null), continuationImpl);
    }

    @Override // com.avito.android.order.feature.data.a
    @l
    public final Object b(@k String str, @k String str2, @k OrderScreenSegment orderScreenSegment, @k Continuation<? super TypedResult<O40.b>> continuation) {
        return C43259k.g(this.f209518b.a(), new a(str, str2, orderScreenSegment, null), continuation);
    }

    @Override // com.avito.android.order.feature.data.a
    @l
    public final Object c(@k String str, @k String str2, @k OrderScreenSegment orderScreenSegment, @k Continuation continuation) {
        return C43259k.g(this.f209518b.a(), new b(this, str, str2, orderScreenSegment, null), continuation);
    }
}
