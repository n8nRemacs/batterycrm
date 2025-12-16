package com.avito.android.screens.bbip_private.mvi;

import Y41.p;
import Y41.q;
import com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rp0.C47707c;
import rp0.InterfaceC47705a;

/* compiled from: BbipPrivateActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "Lkotlinx/coroutines/flow/i;", "Lrp0/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.screens.bbip_private.mvi.BbipPrivateActor$process$4", f = "BbipPrivateActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<Q<? extends Boolean, ? extends InterfaceC43160i<? extends InterfaceC47705a>>, Continuation<? super InterfaceC43160i<? extends BbipPrivateInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f260570q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.screens.bbip_private.mvi.a f260571r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C47707c> f260572s;

    /* compiled from: BbipPrivateActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrp0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "<anonymous>", "(Lrp0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private.mvi.BbipPrivateActor$process$4$2", f = "BbipPrivateActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC47705a, Continuation<? super InterfaceC43160i<? extends BbipPrivateInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f260573q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.screens.bbip_private.mvi.a f260574r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C47707c> f260575s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, com.avito.android.screens.bbip_private.mvi.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f260574r = aVar2;
            this.f260575s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f260575s, this.f260574r, continuation);
            aVar.f260573q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC47705a interfaceC47705a, Continuation<? super InterfaceC43160i<? extends BbipPrivateInternalAction>> continuation) {
            return ((a) create(interfaceC47705a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f260574r.b((InterfaceC47705a) this.f260573q, this.f260575s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private.mvi.BbipPrivateActor$process$4$invokeSuspend$$inlined$flatMapLatest$1", f = "BbipPrivateActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super BbipPrivateInternalAction>, InterfaceC47705a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260576q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f260577r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f260578s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.screens.bbip_private.mvi.a f260579t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f260580u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, com.avito.android.screens.bbip_private.mvi.a aVar2, Continuation continuation) {
            super(3, continuation);
            this.f260579t = aVar2;
            this.f260580u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BbipPrivateInternalAction> interfaceC43172j, InterfaceC47705a interfaceC47705a, Continuation<? super G0> continuation) {
            b bVar = new b(this.f260580u, this.f260579t, continuation);
            bVar.f260577r = interfaceC43172j;
            bVar.f260578s = interfaceC47705a;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f260576q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f260577r;
                InterfaceC43160i<BbipPrivateInternalAction> interfaceC43160iC = this.f260579t.b((InterfaceC47705a) this.f260578s, (C47707c) this.f260580u.invoke());
                this.f260576q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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
    public c(Y41.a aVar, com.avito.android.screens.bbip_private.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f260571r = aVar2;
        this.f260572s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f260572s, this.f260571r, continuation);
        cVar.f260570q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends Boolean, ? extends InterfaceC43160i<? extends InterfaceC47705a>> q12, Continuation<? super InterfaceC43160i<? extends BbipPrivateInternalAction>> continuation) {
        return ((c) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f260570q;
        boolean zBooleanValue = ((Boolean) q12.f406619b).booleanValue();
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        Y41.a<C47707c> aVar = this.f260572s;
        com.avito.android.screens.bbip_private.mvi.a aVar2 = this.f260571r;
        return zBooleanValue ? C43175k.Y(interfaceC43160i, new b(aVar, aVar2, null)) : C43175k.C(new a(aVar, aVar2, null), interfaceC43160i);
    }
}
