package com.avito.android.autoteka.presentation.confirmEmail.mvi;

import Jf.InterfaceC14191a;
import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaConfirmEmailActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LJf/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.confirmEmail.mvi.AutotekaConfirmEmailActor$process$1", f = "AutotekaConfirmEmailActor.kt", i = {0}, l = {40, 42, 41}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super Jf.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f97244q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f97245r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f97246s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14191a f97247t;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.autoteka.presentation.confirmEmail.mvi.a$a, reason: collision with other inner class name */
    public static final class C2905a implements InterfaceC43160i<Jf.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f97248b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f97249c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.autoteka.presentation.confirmEmail.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C2906a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f97250b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f97251c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.autoteka.presentation.confirmEmail.mvi.AutotekaConfirmEmailActor$process$1$invokeSuspend$$inlined$map$1$2", f = "AutotekaConfirmEmailActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.autoteka.presentation.confirmEmail.mvi.a$a$a$a, reason: collision with other inner class name */
            public static final class C2907a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f97252q;

                /* renamed from: r, reason: collision with root package name */
                public int f97253r;

                public C2907a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f97252q = obj;
                    this.f97253r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C2906a.this.emit(null, this);
                }
            }

            public C2906a(InterfaceC43172j interfaceC43172j, b bVar) {
                this.f97250b = interfaceC43172j;
                this.f97251c = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.autoteka.presentation.confirmEmail.mvi.a.C2905a.C2906a.C2907a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.autoteka.presentation.confirmEmail.mvi.a$a$a$a r0 = (com.avito.android.autoteka.presentation.confirmEmail.mvi.a.C2905a.C2906a.C2907a) r0
                    int r1 = r0.f97253r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f97253r = r1
                    goto L18
                L13:
                    com.avito.android.autoteka.presentation.confirmEmail.mvi.a$a$a$a r0 = new com.avito.android.autoteka.presentation.confirmEmail.mvi.a$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f97252q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f97253r
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.C42729a0.b(r7)
                    goto L97
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L32:
                    kotlin.C42729a0.b(r7)
                    com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                    boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r7 == 0) goto L3e
                    Jf.b$c r6 = Jf.b.c.f9085a
                    goto L8c
                L3e:
                    boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r7 == 0) goto L9a
                    com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                    com.avito.android.remote.error.ApiError r6 = r6.getError()
                    boolean r7 = r6 instanceof com.avito.android.remote.error.ApiError.BadRequest
                    if (r7 == 0) goto L86
                    r7 = r6
                    com.avito.android.remote.error.ApiError$BadRequest r7 = (com.avito.android.remote.error.ApiError.BadRequest) r7
                    java.lang.String r2 = r7.getF244063c()
                    com.avito.android.autoteka.presentation.confirmEmail.mvi.b r4 = r5.f97251c
                    com.avito.android.autoteka.domain.model.confirmEmail.ConfirmEmailDetails r4 = r4.f97256b
                    java.lang.String r4 = r4.getAlreadyRegisteredMessage()
                    boolean r4 = r2.equals(r4)
                    if (r4 == 0) goto L64
                    Jf.b$c r6 = Jf.b.c.f9085a
                    goto L8c
                L64:
                    java.lang.String r4 = ""
                    boolean r2 = r2.equals(r4)
                    if (r2 == 0) goto L73
                    Jf.b$f r7 = new Jf.b$f
                    r7.<init>(r6)
                L71:
                    r6 = r7
                    goto L8c
                L73:
                    Jf.b$b r6 = new Jf.b$b
                    com.avito.android.autoteka.helpers.k$a$a r2 = new com.avito.android.autoteka.helpers.k$a$a
                    java.lang.String r7 = r7.getF244063c()
                    com.avito.android.printable_text.PrintableText r7 = com.avito.android.printable_text.b.f(r7)
                    r2.<init>(r7)
                    r6.<init>(r2)
                    goto L8c
                L86:
                    Jf.b$f r7 = new Jf.b$f
                    r7.<init>(r6)
                    goto L71
                L8c:
                    r0.f97253r = r3
                    kotlinx.coroutines.flow.j r7 = r5.f97250b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L97
                    return r1
                L97:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                L9a:
                    kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.confirmEmail.mvi.a.C2905a.C2906a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C2905a(InterfaceC43160i interfaceC43160i, b bVar) {
            this.f97248b = interfaceC43160i;
            this.f97249c = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Jf.b> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f97248b.collect(new C2906a(interfaceC43172j, this.f97249c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC14191a interfaceC14191a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f97246s = bVar;
        this.f97247t = interfaceC14191a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f97246s, this.f97247t, continuation);
        aVar.f97245r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Jf.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f97244q
            com.avito.android.autoteka.presentation.confirmEmail.mvi.b r2 = r6.f97246s
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.C42729a0.b(r7)
            goto L6a
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            java.lang.Object r1 = r6.f97245r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L57
        L27:
            java.lang.Object r1 = r6.f97245r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L44
        L2f:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f97245r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            Jf.b$d r1 = Jf.b.d.f9086a
            r6.f97245r = r7
            r6.f97244q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L43
            return r0
        L43:
            r1 = r7
        L44:
            com.avito.android.autoteka.data.order.a r7 = r2.f97255a
            Jf.a r5 = r6.f97247t
            Jf.a$b r5 = (Jf.InterfaceC14191a.b) r5
            java.lang.String r5 = r5.f9082a
            r6.f97245r = r1
            r6.f97244q = r4
            kotlinx.coroutines.flow.f0 r7 = r7.a(r5)
            if (r7 != r0) goto L57
            return r0
        L57:
            kotlinx.coroutines.flow.i r7 = (kotlinx.coroutines.flow.InterfaceC43160i) r7
            com.avito.android.autoteka.presentation.confirmEmail.mvi.a$a r4 = new com.avito.android.autoteka.presentation.confirmEmail.mvi.a$a
            r4.<init>(r7, r2)
            r7 = 0
            r6.f97245r = r7
            r6.f97244q = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.u(r6, r4, r1)
            if (r7 != r0) goto L6a
            return r0
        L6a:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.confirmEmail.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
