package com.avito.android.mandatory_verification.presentation.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction;
import fv.C40482a;
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
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;

/* compiled from: MandatoryVerificationBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.b<MandatoryVerificationInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mandatory_verification.domain.g f184758a;

    /* renamed from: b, reason: collision with root package name */
    public final long f184759b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C5427c f184760c;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C43501a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f184761b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mandatory_verification.presentation.mvi.c$a$a, reason: collision with other inner class name */
        public static final class C5425a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f184762b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.mandatory_verification.presentation.mvi.MandatoryVerificationBootstrap$special$$inlined$filter$1$2", f = "MandatoryVerificationBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.mandatory_verification.presentation.mvi.c$a$a$a, reason: collision with other inner class name */
            public static final class C5426a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f184763q;

                /* renamed from: r, reason: collision with root package name */
                public int f184764r;

                public C5426a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f184763q = obj;
                    this.f184764r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C5425a.this.emit(null, this);
                }
            }

            public C5425a(InterfaceC43172j interfaceC43172j) {
                this.f184762b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.mandatory_verification.presentation.mvi.c.a.C5425a.C5426a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.mandatory_verification.presentation.mvi.c$a$a$a r0 = (com.avito.android.mandatory_verification.presentation.mvi.c.a.C5425a.C5426a) r0
                    int r1 = r0.f184764r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f184764r = r1
                    goto L18
                L13:
                    com.avito.android.mandatory_verification.presentation.mvi.c$a$a$a r0 = new com.avito.android.mandatory_verification.presentation.mvi.c$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f184763q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f184764r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    kv.a r6 = (kv.C43501a) r6
                    Ju.c r6 = r6.f413261b
                    boolean r2 = r6 instanceof com.avito.android.deep_linking.links.O.b
                    if (r2 != 0) goto L41
                    boolean r6 = r6 instanceof com.avito.android.deep_linking.links.O.a
                    if (r6 == 0) goto L4c
                L41:
                    r0.f184764r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f184762b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mandatory_verification.presentation.mvi.c.a.C5425a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f184761b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C43501a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f184761b).collect(new C5425a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mandatory_verification.presentation.mvi.MandatoryVerificationBootstrap$special$$inlined$flatMapLatest$1", f = "MandatoryVerificationBootstrap.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super MandatoryVerificationInternalAction>, C43501a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f184766q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f184767r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f184768s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f184769t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, c cVar) {
            super(3, continuation);
            this.f184769t = cVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super MandatoryVerificationInternalAction> interfaceC43172j, C43501a c43501a, Continuation<? super G0> continuation) {
            b bVar = new b(continuation, this.f184769t);
            bVar.f184767r = interfaceC43172j;
            bVar.f184768s = c43501a;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f184766q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f184767r;
                c cVar = this.f184769t;
                C43152f0 c43152f0A = cVar.f184758a.a(cVar.f184759b);
                this.f184766q = 1;
                if (C43175k.u(this, c43152f0A, interfaceC43172j) == coroutine_suspended) {
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
    /* renamed from: com.avito.android.mandatory_verification.presentation.mvi.c$c, reason: collision with other inner class name */
    public static final class C5427c implements InterfaceC43160i<MandatoryVerificationInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.internal.l f184770b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mandatory_verification.presentation.mvi.c$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f184771b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.mandatory_verification.presentation.mvi.MandatoryVerificationBootstrap$special$$inlined$map$1$2", f = "MandatoryVerificationBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.mandatory_verification.presentation.mvi.c$c$a$a, reason: collision with other inner class name */
            public static final class C5428a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f184772q;

                /* renamed from: r, reason: collision with root package name */
                public int f184773r;

                public C5428a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f184772q = obj;
                    this.f184773r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f184771b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.mandatory_verification.presentation.mvi.c.C5427c.a.C5428a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.mandatory_verification.presentation.mvi.c$c$a$a r0 = (com.avito.android.mandatory_verification.presentation.mvi.c.C5427c.a.C5428a) r0
                    int r1 = r0.f184773r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f184773r = r1
                    goto L18
                L13:
                    com.avito.android.mandatory_verification.presentation.mvi.c$c$a$a r0 = new com.avito.android.mandatory_verification.presentation.mvi.c$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f184772q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f184773r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L51
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction r5 = (com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction) r5
                    boolean r6 = r5 instanceof com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction.BuildInitial
                    if (r6 == 0) goto L46
                    com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$BuildVerificationSuccess r6 = new com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$BuildVerificationSuccess
                    com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$BuildInitial r5 = (com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction.BuildInitial) r5
                    com.avito.android.mandatory_verification.data.model.MandatoryVerificationData r5 = r5.f184786b
                    com.avito.android.mandatory_verification.data.model.MandatoryVerificationData$AccountVerification r5 = r5.f184430d
                    r6.<init>(r5)
                    r5 = r6
                L46:
                    r0.f184773r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f184771b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L51
                    return r1
                L51:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mandatory_verification.presentation.mvi.c.C5427c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C5427c(kotlinx.coroutines.flow.internal.l lVar) {
            this.f184770b = lVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super MandatoryVerificationInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f184770b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.mandatory_verification.domain.g gVar, long j12) {
        this.f184758a = gVar;
        this.f184759b = j12;
        this.f184760c = new C5427c(C43175k.Y(new a(C40482a.b(aVar)), new b(null, this)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<MandatoryVerificationInternalAction> a() {
        return C43175k.N(this.f184760c, this.f184758a.a(this.f184759b));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
