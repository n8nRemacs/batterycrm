package com.avito.android.screens.bbip_private_v2.mvi;

import Y41.p;
import Y41.q;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import com.avito.android.screens.bbip_private_v2.ui.BbipPrivateV2ActionGroup;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import tp0.InterfaceC48700a;

/* compiled from: BbipPrivateV2Actor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/screens/bbip_private_v2/ui/BbipPrivateV2ActionGroup;", "Lkotlinx/coroutines/flow/i;", "Ltp0/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.mvi.BbipPrivateV2Actor$process$6", f = "BbipPrivateV2Actor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<Q<? extends BbipPrivateV2ActionGroup, ? extends InterfaceC43160i<? extends InterfaceC48700a>>, Continuation<? super InterfaceC43160i<? extends BbipPrivateV2InternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f260968q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.screens.bbip_private_v2.mvi.a f260969r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<BbipPrivateV2State> f260970s;

    /* compiled from: BbipPrivateV2Actor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltp0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "<anonymous>", "(Ltp0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.mvi.BbipPrivateV2Actor$process$6$2", f = "BbipPrivateV2Actor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC48700a, Continuation<? super InterfaceC43160i<? extends BbipPrivateV2InternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f260971q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.screens.bbip_private_v2.mvi.a f260972r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<BbipPrivateV2State> f260973s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, com.avito.android.screens.bbip_private_v2.mvi.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f260972r = aVar2;
            this.f260973s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f260973s, this.f260972r, continuation);
            aVar.f260971q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC48700a interfaceC48700a, Continuation<? super InterfaceC43160i<? extends BbipPrivateV2InternalAction>> continuation) {
            return ((a) create(interfaceC48700a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f260972r.b((InterfaceC48700a) this.f260971q, this.f260973s.invoke());
        }
    }

    /* compiled from: BbipPrivateV2Actor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[BbipPrivateV2ActionGroup.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BbipPrivateV2ActionGroup bbipPrivateV2ActionGroup = BbipPrivateV2ActionGroup.f261113b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BbipPrivateV2ActionGroup bbipPrivateV2ActionGroup2 = BbipPrivateV2ActionGroup.f261113b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.mvi.BbipPrivateV2Actor$process$6$invokeSuspend$$inlined$flatMapLatest$1", f = "BbipPrivateV2Actor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.screens.bbip_private_v2.mvi.c$c, reason: collision with other inner class name */
    public static final class C7819c extends SuspendLambda implements q<InterfaceC43172j<? super BbipPrivateV2InternalAction>, InterfaceC48700a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260974q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f260975r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f260976s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.screens.bbip_private_v2.mvi.a f260977t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f260978u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7819c(Y41.a aVar, com.avito.android.screens.bbip_private_v2.mvi.a aVar2, Continuation continuation) {
            super(3, continuation);
            this.f260977t = aVar2;
            this.f260978u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BbipPrivateV2InternalAction> interfaceC43172j, InterfaceC48700a interfaceC48700a, Continuation<? super G0> continuation) {
            C7819c c7819c = new C7819c(this.f260978u, this.f260977t, continuation);
            c7819c.f260975r = interfaceC43172j;
            c7819c.f260976s = interfaceC48700a;
            return c7819c.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f260974q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f260975r;
                InterfaceC43160i<BbipPrivateV2InternalAction> interfaceC43160iB = this.f260977t.b((InterfaceC48700a) this.f260976s, (BbipPrivateV2State) this.f260978u.invoke());
                this.f260974q = 1;
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
    public c(Y41.a aVar, com.avito.android.screens.bbip_private_v2.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f260969r = aVar2;
        this.f260970s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f260970s, this.f260969r, continuation);
        cVar.f260968q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends BbipPrivateV2ActionGroup, ? extends InterfaceC43160i<? extends InterfaceC48700a>> q12, Continuation<? super InterfaceC43160i<? extends BbipPrivateV2InternalAction>> continuation) {
        return ((c) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f260968q;
        BbipPrivateV2ActionGroup bbipPrivateV2ActionGroup = (BbipPrivateV2ActionGroup) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        int iOrdinal = bbipPrivateV2ActionGroup.ordinal();
        Y41.a<BbipPrivateV2State> aVar = this.f260970s;
        com.avito.android.screens.bbip_private_v2.mvi.a aVar2 = this.f260969r;
        if (iOrdinal == 0 || iOrdinal == 1) {
            return C43175k.Y(interfaceC43160i, new C7819c(aVar, aVar2, null));
        }
        if (iOrdinal == 2) {
            return C43175k.C(new a(aVar, aVar2, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
