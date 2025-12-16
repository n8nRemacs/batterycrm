package com.avito.avcalls.android;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.K;

/* compiled from: AvCallsImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.AvCallsImpl$safeLaunchWithResult$2", f = "AvCallsImpl.kt", i = {}, l = {201, 202}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class p extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331861q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Continuation<? super xQ0.b>, Object> f331862r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.e f331863s;

    /* compiled from: AvCallsImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.AvCallsImpl$safeLaunchWithResult$2$1", f = "AvCallsImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.e f331864q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ xQ0.b f331865r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.e eVar, xQ0.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f331864q = eVar;
            this.f331865r = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f331864q, this.f331865r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f331864q.f164544a.onSuccess(this.f331865r);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Y41.l lVar, com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f331862r = lVar;
        this.f331863s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new p(this.f331862r, this.f331863s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331861q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f331861q = 1;
            obj = ((j) this.f331862r).invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        AbstractC43129d1 abstractC43129d1 = K.f411877a;
        a aVar = new a(this.f331863s, (xQ0.b) obj, null);
        this.f331861q = 2;
        if (C43259k.g(abstractC43129d1, aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
