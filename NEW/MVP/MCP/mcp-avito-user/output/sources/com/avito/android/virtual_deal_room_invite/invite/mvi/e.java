package com.avito.android.virtual_deal_room_invite.invite.mvi;

import Y41.q;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;

/* compiled from: InviteBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements com.avito.android.arch.mvi.b<InviteInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.virtual_deal_room_invite.invite.interactor.a f327053a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.virtual_deal_room_invite.invite.interactor.e f327054b;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f327055b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room_invite.invite.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C10132a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f327056b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.mvi.InviteBootstrap$produce$$inlined$filter$1$2", f = "InviteBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.virtual_deal_room_invite.invite.mvi.e$a$a$a, reason: collision with other inner class name */
            public static final class C10133a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f327057q;

                /* renamed from: r, reason: collision with root package name */
                public int f327058r;

                public C10133a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f327057q = obj;
                    this.f327058r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C10132a.this.emit(null, this);
                }
            }

            public C10132a(InterfaceC43172j interfaceC43172j) {
                this.f327056b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.virtual_deal_room_invite.invite.mvi.e.a.C10132a.C10133a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.virtual_deal_room_invite.invite.mvi.e$a$a$a r0 = (com.avito.android.virtual_deal_room_invite.invite.mvi.e.a.C10132a.C10133a) r0
                    int r1 = r0.f327058r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f327058r = r1
                    goto L18
                L13:
                    com.avito.android.virtual_deal_room_invite.invite.mvi.e$a$a$a r0 = new com.avito.android.virtual_deal_room_invite.invite.mvi.e$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f327057q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f327058r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    java.lang.Number r6 = (java.lang.Number) r6
                    int r6 = r6.intValue()
                    if (r6 != 0) goto L48
                    r0.f327058r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f327056b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_invite.invite.mvi.e.a.C10132a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(c cVar) {
            this.f327055b = cVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Integer> interfaceC43172j, @Y61.k Continuation continuation) throws Throwable {
            Object objCollect = this.f327055b.collect(new C10132a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.mvi.InviteBootstrap$produce$$inlined$flatMapLatest$1", f = "InviteBootstrap.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super InviteInternalAction>, Integer, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f327060q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f327061r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f327062s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ e f327063t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, e eVar) {
            super(3, continuation);
            this.f327063t = eVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InviteInternalAction> interfaceC43172j, Integer num, Continuation<? super G0> continuation) {
            b bVar = new b(continuation, this.f327063t);
            bVar.f327061r = interfaceC43172j;
            bVar.f327062s = num;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f327060q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f327061r;
                ((Number) this.f327062s).intValue();
                InterfaceC43160i<InviteInternalAction> interfaceC43160iB = this.f327063t.f327053a.b(false);
                this.f327060q = 1;
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

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2 f327064b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f327065b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.mvi.InviteBootstrap$produce$$inlined$map$1$2", f = "InviteBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.virtual_deal_room_invite.invite.mvi.e$c$a$a, reason: collision with other inner class name */
            public static final class C10134a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f327066q;

                /* renamed from: r, reason: collision with root package name */
                public int f327067r;

                public C10134a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f327066q = obj;
                    this.f327067r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f327065b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.virtual_deal_room_invite.invite.mvi.e.c.a.C10134a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.virtual_deal_room_invite.invite.mvi.e$c$a$a r0 = (com.avito.android.virtual_deal_room_invite.invite.mvi.e.c.a.C10134a) r0
                    int r1 = r0.f327067r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f327067r = r1
                    goto L18
                L13:
                    com.avito.android.virtual_deal_room_invite.invite.mvi.e$c$a$a r0 = new com.avito.android.virtual_deal_room_invite.invite.mvi.e$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f327066q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f327067r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction r5 = (com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction) r5
                    com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction$CountDownValidationTimer r5 = (com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction.CountDownValidationTimer) r5
                    int r5 = r5.f327073b
                    java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
                    r0.f327067r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f327065b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_invite.invite.mvi.e.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(e2 e2Var) {
            this.f327064b = e2Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Integer> interfaceC43172j, @Y61.k Continuation continuation) throws Throwable {
            a aVar = new a(interfaceC43172j);
            e2 e2Var = this.f327064b;
            e2Var.getClass();
            Object objG = e2.g(e2Var, aVar, continuation);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.virtual_deal_room_invite.invite.interactor.a aVar, @Y61.k com.avito.android.virtual_deal_room_invite.invite.interactor.e eVar) {
        this.f327053a = aVar;
        this.f327054b = eVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InviteInternalAction> a() {
        InterfaceC43160i<InviteInternalAction> interfaceC43160iB = this.f327053a.b(true);
        e2 e2Var = this.f327054b.f57850c;
        return C43175k.N(interfaceC43160iB, e2Var, C43175k.Y(new a(new c(e2Var)), new b(null, this)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
