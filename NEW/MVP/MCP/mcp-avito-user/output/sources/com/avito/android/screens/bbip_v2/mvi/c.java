package com.avito.android.screens.bbip_v2.mvi;

import Y41.p;
import Y41.q;
import com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction;
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
import vp0.C49366c;
import vp0.InterfaceC49364a;

/* compiled from: BbipV2Actor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "Lkotlinx/coroutines/flow/i;", "Lvp0/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.screens.bbip_v2.mvi.BbipV2Actor$process$4", f = "BbipV2Actor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<Q<? extends Boolean, ? extends InterfaceC43160i<? extends InterfaceC49364a>>, Continuation<? super InterfaceC43160i<? extends BbipV2InternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f261514q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.screens.bbip_v2.mvi.a f261515r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C49366c> f261516s;

    /* compiled from: BbipV2Actor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvp0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "<anonymous>", "(Lvp0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_v2.mvi.BbipV2Actor$process$4$2", f = "BbipV2Actor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC49364a, Continuation<? super InterfaceC43160i<? extends BbipV2InternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f261517q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.screens.bbip_v2.mvi.a f261518r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C49366c> f261519s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, com.avito.android.screens.bbip_v2.mvi.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f261518r = aVar2;
            this.f261519s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f261519s, this.f261518r, continuation);
            aVar.f261517q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC49364a interfaceC49364a, Continuation<? super InterfaceC43160i<? extends BbipV2InternalAction>> continuation) {
            return ((a) create(interfaceC49364a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f261518r.b((InterfaceC49364a) this.f261517q, this.f261519s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_v2.mvi.BbipV2Actor$process$4$invokeSuspend$$inlined$flatMapLatest$1", f = "BbipV2Actor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super BbipV2InternalAction>, InterfaceC49364a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f261520q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f261521r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f261522s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.screens.bbip_v2.mvi.a f261523t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f261524u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, com.avito.android.screens.bbip_v2.mvi.a aVar2, Continuation continuation) {
            super(3, continuation);
            this.f261523t = aVar2;
            this.f261524u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BbipV2InternalAction> interfaceC43172j, InterfaceC49364a interfaceC49364a, Continuation<? super G0> continuation) {
            b bVar = new b(this.f261524u, this.f261523t, continuation);
            bVar.f261521r = interfaceC43172j;
            bVar.f261522s = interfaceC49364a;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f261520q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f261521r;
                InterfaceC43160i<BbipV2InternalAction> interfaceC43160iC = this.f261523t.b((InterfaceC49364a) this.f261522s, (C49366c) this.f261524u.invoke());
                this.f261520q = 1;
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
    public c(Y41.a aVar, com.avito.android.screens.bbip_v2.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f261515r = aVar2;
        this.f261516s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f261516s, this.f261515r, continuation);
        cVar.f261514q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends Boolean, ? extends InterfaceC43160i<? extends InterfaceC49364a>> q12, Continuation<? super InterfaceC43160i<? extends BbipV2InternalAction>> continuation) {
        return ((c) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f261514q;
        boolean zBooleanValue = ((Boolean) q12.f406619b).booleanValue();
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        Y41.a<C49366c> aVar = this.f261516s;
        com.avito.android.screens.bbip_v2.mvi.a aVar2 = this.f261515r;
        return zBooleanValue ? C43175k.Y(interfaceC43160i, new b(aVar, aVar2, null)) : C43175k.C(new a(aVar, aVar2, null), interfaceC43160i);
    }
}
