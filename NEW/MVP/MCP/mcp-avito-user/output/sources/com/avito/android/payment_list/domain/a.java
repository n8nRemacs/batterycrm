package com.avito.android.payment_list.domain;

import E60.b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.di.B;
import com.avito.android.remote.model.TypedResult;
import eG.InterfaceC40001a;
import fG.C40288c;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PaymentListInteractor.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment_list/domain/a;", "", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.payment_list.mvi.a f214969a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40001a f214970b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f214971c;

    /* compiled from: PaymentListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LE60/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.payment_list.domain.PaymentListInteractor$getInfo$1", f = "PaymentListInteractor.kt", i = {0}, l = {19, 30}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.payment_list.domain.a$a, reason: collision with other inner class name */
    public static final class C6446a extends SuspendLambda implements p<InterfaceC43172j<? super E60.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f214972q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f214973r;

        public C6446a(Continuation<? super C6446a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6446a c6446a = a.this.new C6446a(continuation);
            c6446a.f214973r = obj;
            return c6446a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super E60.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6446a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            E60.b c0217b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f214972q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f214973r;
                InterfaceC40001a interfaceC40001a = aVar.f214970b;
                this.f214973r = interfaceC43172j;
                this.f214972q = 1;
                obj = interfaceC40001a.a(null, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f214973r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                aVar.f214971c = ((C40288c) success.getResult()).getCursor();
                C40288c c40288c = (C40288c) success.getResult();
                aVar.f214969a.getClass();
                c0217b = new b.C0217b(com.avito.android.payment_list.mvi.a.a(c40288c), aVar.f214971c != null);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0217b = b.c.f3775a;
            }
            this.f214973r = null;
            this.f214972q = 2;
            if (interfaceC43172j.emit(c0217b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LE60/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.payment_list.domain.PaymentListInteractor$loadMore$1", f = "PaymentListInteractor.kt", i = {0}, l = {34, 45}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super E60.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f214975q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f214976r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f214976r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super E60.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            E60.b eVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f214975q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f214976r;
                InterfaceC40001a interfaceC40001a = aVar.f214970b;
                String str = aVar.f214971c;
                this.f214976r = interfaceC43172j;
                this.f214975q = 1;
                obj = interfaceC40001a.a(str, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f214976r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                aVar.f214971c = ((C40288c) success.getResult()).getCursor();
                C40288c c40288c = (C40288c) success.getResult();
                aVar.f214969a.getClass();
                eVar = new b.e(com.avito.android.payment_list.mvi.a.a(c40288c), aVar.f214971c != null);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = b.d.f3776a;
            }
            this.f214976r = null;
            this.f214975q = 2;
            if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k com.avito.android.payment_list.mvi.a aVar, @k InterfaceC40001a interfaceC40001a) {
        this.f214969a = aVar;
        this.f214970b = interfaceC40001a;
    }

    @k
    public final InterfaceC43160i<E60.b> a() {
        return C43175k.G(new C6446a(null));
    }

    @k
    public final InterfaceC43160i<E60.b> b() {
        return C43175k.G(new b(null));
    }
}
