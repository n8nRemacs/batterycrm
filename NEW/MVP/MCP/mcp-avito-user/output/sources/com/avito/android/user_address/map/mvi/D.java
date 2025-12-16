package com.avito.android.user_address.map.mvi;

import com.avito.android.user_address.map.mvi.B;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapMviActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/user_address/map/mvi/B$a;", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_address/map/mvi/A;", "<name for destructuring parameter 0>", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$process$2", f = "UserAddressMapMviActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class D extends SuspendLambda implements Y41.p<kotlin.Q<? extends B.a, ? extends InterfaceC43160i<? extends A>>, Continuation<? super InterfaceC43160i<? extends UserAddressMapMviInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f307653q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B f307654r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<UserAddressAddNewAddressMviState> f307655s;

    /* compiled from: UserAddressMapMviActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "<anonymous>", "(Lcom/avito/android/user_address/map/mvi/A;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$process$2$2", f = "UserAddressMapMviActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<A, Continuation<? super InterfaceC43160i<? extends UserAddressMapMviInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f307656q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ B f307657r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<UserAddressAddNewAddressMviState> f307658s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, B b12, Continuation continuation) {
            super(2, continuation);
            this.f307657r = b12;
            this.f307658s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f307658s, this.f307657r, continuation);
            aVar.f307656q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(A a12, Continuation<? super InterfaceC43160i<? extends UserAddressMapMviInternalAction>> continuation) {
            return ((a) create(a12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f307657r.b((A) this.f307656q, this.f307658s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "UserAddressMapMviActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAddressMapMviInternalAction>, A, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f307659q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f307660r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f307661s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ B f307662t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f307663u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, B b12, Continuation continuation) {
            super(3, continuation);
            this.f307662t = b12;
            this.f307663u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, A a12, Continuation<? super G0> continuation) {
            b bVar = new b(this.f307663u, this.f307662t, continuation);
            bVar.f307660r = interfaceC43172j;
            bVar.f307661s = a12;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f307659q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f307660r;
                InterfaceC43160i<UserAddressMapMviInternalAction> interfaceC43160iB = this.f307662t.b((A) this.f307661s, (UserAddressAddNewAddressMviState) this.f307663u.invoke());
                this.f307659q = 1;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Y41.a aVar, B b12, Continuation continuation) {
        super(2, continuation);
        this.f307654r = b12;
        this.f307655s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        D d12 = new D(this.f307655s, this.f307654r, continuation);
        d12.f307653q = obj;
        return d12;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends B.a, ? extends InterfaceC43160i<? extends A>> q12, Continuation<? super InterfaceC43160i<? extends UserAddressMapMviInternalAction>> continuation) {
        return ((D) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f307653q;
        B.a aVar = (B.a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = kotlin.jvm.internal.L.f(aVar, B.a.C9452a.f307650a);
        Y41.a<UserAddressAddNewAddressMviState> aVar2 = this.f307655s;
        B b12 = this.f307654r;
        if (zF2) {
            return C43175k.Y(interfaceC43160i, new b(aVar2, b12, null));
        }
        if (kotlin.jvm.internal.L.f(aVar, B.a.b.f307651a)) {
            return C43175k.C(new a(aVar2, b12, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
