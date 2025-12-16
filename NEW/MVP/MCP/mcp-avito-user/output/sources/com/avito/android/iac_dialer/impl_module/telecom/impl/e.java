package com.avito.android.iac_dialer.impl_module.telecom.impl;

import Y41.p;
import com.avito.android.iac_dialer.impl_module.telecom.IacConnectionException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.D1;
import kotlinx.coroutines.InterfaceC43314z;
import kotlinx.coroutines.T;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.U;

/* compiled from: IacConnection.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Z;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Z;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnection$moveConnectionStateToActive$3", f = "IacConnection.kt", i = {0}, l = {182}, m = "invokeSuspend", n = {"$this$async"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super Z<? extends G0>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166455q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f166456r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166457s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f166458t;

    /* compiled from: IacConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnection$moveConnectionStateToActive$3$1", f = "IacConnection.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f166459q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f166460r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f166460r = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f166460r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f166459q;
            b bVar = this.f166460r;
            if (i12 == 0) {
                C42729a0.b(obj);
                bVar.b("moveConnectionStateToActive: wasDialingOrRingingStateReached BEFORE");
                InterfaceC43314z<G0> interfaceC43314z = bVar.f166439b;
                this.f166459q = 1;
                if (interfaceC43314z.F(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            bVar.b("moveConnectionStateToActive: wasDialingOrRingingStateReached AFTER");
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Y41.a<G0> aVar, b bVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f166457s = aVar;
        this.f166458t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f166457s, this.f166458t, continuation);
        eVar.f166456r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Z<? extends G0>> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object bVar;
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f166455q;
        b bVar2 = this.f166458t;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                T t13 = (T) this.f166456r;
                this.f166457s.invoke();
                a aVar = new a(bVar2, null);
                this.f166456r = t13;
                this.f166455q = 1;
                if (D1.b(5000L, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                t12 = t13;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t12 = (T) this.f166456r;
                C42729a0.b(obj);
            }
            U.d(t12);
            bVar2.setActive();
            int i13 = Z.f406624c;
            bVar = G0.f406611a;
        } catch (TimeoutCancellationException unused) {
            int i14 = Z.f406624c;
            bVar = new Z.b(new IacConnectionException("moveConnectionStateToActive was invoked but state DIALING or RINGING was not reached in 5000 millis"));
        }
        return Z.a(bVar);
    }
}
