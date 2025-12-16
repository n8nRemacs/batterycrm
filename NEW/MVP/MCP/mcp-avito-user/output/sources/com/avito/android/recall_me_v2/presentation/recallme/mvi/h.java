package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import Di0.AbstractC13405c;
import Ju.InterfaceC14249c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;

/* compiled from: RecallMeActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$subscribeToPhoneVerificationResult$2", f = "RecallMeActor.kt", i = {0}, l = {185, 193}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RecallMeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252167q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f252168r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.recall_me_v2.presentation.recallme.mvi.a f252169s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC13405c.a f252170t;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f252171b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.recall_me_v2.presentation.recallme.mvi.h$a$a, reason: collision with other inner class name */
        public static final class C7567a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f252172b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$subscribeToPhoneVerificationResult$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "RecallMeActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.recall_me_v2.presentation.recallme.mvi.h$a$a$a, reason: collision with other inner class name */
            public static final class C7568a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f252173q;

                /* renamed from: r, reason: collision with root package name */
                public int f252174r;

                public C7568a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f252173q = obj;
                    this.f252174r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7567a.this.emit(null, this);
                }
            }

            public C7567a(InterfaceC43172j interfaceC43172j) {
                this.f252172b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.recall_me_v2.presentation.recallme.mvi.h.a.C7567a.C7568a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.recall_me_v2.presentation.recallme.mvi.h$a$a$a r0 = (com.avito.android.recall_me_v2.presentation.recallme.mvi.h.a.C7567a.C7568a) r0
                    int r1 = r0.f252174r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f252174r = r1
                    goto L18
                L13:
                    com.avito.android.recall_me_v2.presentation.recallme.mvi.h$a$a$a r0 = new com.avito.android.recall_me_v2.presentation.recallme.mvi.h$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f252173q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f252174r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    boolean r6 = r5 instanceof com.avito.android.code_check_public.CodeCheckLink.b
                    if (r6 == 0) goto L43
                    r0.f252174r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f252172b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recall_me_v2.presentation.recallme.mvi.h.a.C7567a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(b bVar) {
            this.f252171b = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f252171b.collect(new C7567a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<InterfaceC14249c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f252176b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f252177b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$subscribeToPhoneVerificationResult$2$invokeSuspend$$inlined$map$1$2", f = "RecallMeActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.recall_me_v2.presentation.recallme.mvi.h$b$a$a, reason: collision with other inner class name */
            public static final class C7569a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f252178q;

                /* renamed from: r, reason: collision with root package name */
                public int f252179r;

                public C7569a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f252178q = obj;
                    this.f252179r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f252177b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.recall_me_v2.presentation.recallme.mvi.h.b.a.C7569a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.recall_me_v2.presentation.recallme.mvi.h$b$a$a r0 = (com.avito.android.recall_me_v2.presentation.recallme.mvi.h.b.a.C7569a) r0
                    int r1 = r0.f252179r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f252179r = r1
                    goto L18
                L13:
                    com.avito.android.recall_me_v2.presentation.recallme.mvi.h$b$a$a r0 = new com.avito.android.recall_me_v2.presentation.recallme.mvi.h$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f252178q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f252179r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    kv.a r5 = (kv.C43501a) r5
                    Ju.c r5 = r5.f413261b
                    r0.f252179r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f252177b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recall_me_v2.presentation.recallme.mvi.h.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f252176b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC14249c> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f252176b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AbstractC13405c.a aVar, com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f252169s = aVar2;
        this.f252170t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f252170t, this.f252169s, continuation);
        hVar.f252168r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RecallMeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f252167q;
        com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar = this.f252169s;
        boolean z12 = true;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f252168r;
            a aVar2 = new a(new b(y.a(aVar.f252122c.d9())));
            this.f252168r = interfaceC43172j;
            this.f252167q = 1;
            obj = C43175k.A(aVar2, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f252168r;
            C42729a0.b(obj);
        }
        CodeCheckLink.b bVar = (CodeCheckLink.b) obj;
        if (!(bVar instanceof CodeCheckLink.b.a ? true : L.f(bVar, CodeCheckLink.b.c.f119268b)) && bVar != null) {
            z12 = false;
        }
        if (z12) {
            return G0.f406611a;
        }
        if (bVar instanceof CodeCheckLink.b.C3493b) {
            AbstractC13405c.a aVar3 = this.f252170t;
            Set<Integer> set = com.avito.android.recall_me_v2.presentation.recallme.mvi.a.f252119e;
            aVar.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new g(aVar3, aVar, null));
            this.f252168r = null;
            this.f252167q = 2;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
