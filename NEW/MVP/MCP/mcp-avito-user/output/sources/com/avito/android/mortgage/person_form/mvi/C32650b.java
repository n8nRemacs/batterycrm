package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.mortgage.api.model.items.form.FormContentItemType;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PersonFormActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$buttonNextClick$1", f = "PersonFormActor.kt", i = {0}, l = {553, 598}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.mortgage.person_form.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32650b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201012q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201013r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G00.c f201014s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32649a f201015t;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$buttonNextClick$1$invokeSuspend$$inlined$transform$1", f = "PersonFormActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.b$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201016q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201017r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f201018s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.q f201019t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.person_form.mvi.b$a$a, reason: collision with other inner class name */
        public static final class C5955a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201020b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Y41.q f201021c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$buttonNextClick$1$invokeSuspend$$inlined$transform$1$1", f = "PersonFormActor.kt", i = {}, l = {38}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage.person_form.mvi.b$a$a$a, reason: collision with other inner class name */
            public static final class C5956a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f201022q;

                /* renamed from: r, reason: collision with root package name */
                public int f201023r;

                public C5956a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f201022q = obj;
                    this.f201023r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C5955a.this.emit(null, this);
                }
            }

            public C5955a(Y41.q qVar, InterfaceC43172j interfaceC43172j) {
                this.f201021c = qVar;
                this.f201020b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.mortgage.person_form.mvi.C32650b.a.C5955a.C5956a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.mortgage.person_form.mvi.b$a$a$a r0 = (com.avito.android.mortgage.person_form.mvi.C32650b.a.C5955a.C5956a) r0
                    int r1 = r0.f201023r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f201023r = r1
                    goto L18
                L13:
                    com.avito.android.mortgage.person_form.mvi.b$a$a$a r0 = new com.avito.android.mortgage.person_form.mvi.b$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f201022q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f201023r
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
                    r0.f201023r = r3
                    Y41.q r6 = r4.f201021c
                    kotlinx.coroutines.flow.j<com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction> r2 = r4.f201020b
                    com.avito.android.mortgage.person_form.mvi.b$b r6 = (com.avito.android.mortgage.person_form.mvi.C32650b.C5957b) r6
                    java.lang.Object r5 = r6.invoke(r2, r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.C32650b.a.C5955a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i interfaceC43160i, Y41.q qVar, Continuation continuation) {
            super(2, continuation);
            this.f201018s = interfaceC43160i;
            this.f201019t = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f201018s, this.f201019t, continuation);
            aVar.f201017r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201016q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C5955a c5955a = new C5955a(this.f201019t, (InterfaceC43172j) this.f201017r);
                this.f201016q = 1;
                if (this.f201018s.collect(c5955a, this) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "action", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$buttonNextClick$1$updateFormFlow$1", f = "PersonFormActor.kt", i = {2, 2}, l = {579, 584, 591, 594}, m = "invokeSuspend", n = {"$this$transform", "action"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.b$b, reason: collision with other inner class name */
    public static final class C5957b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PersonFormInternalAction>, PersonFormInternalAction, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201025q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f201026r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ PersonFormInternalAction f201027s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32649a f201028t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ G00.c f201029u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5957b(G00.c cVar, C32649a c32649a, Continuation continuation) {
            super(3, continuation);
            this.f201028t = c32649a;
            this.f201029u = cVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, PersonFormInternalAction personFormInternalAction, Continuation<? super G0> continuation) {
            C32649a c32649a = this.f201028t;
            C5957b c5957b = new C5957b(this.f201029u, c32649a, continuation);
            c5957b.f201026r = interfaceC43172j;
            c5957b.f201027s = personFormInternalAction;
            return c5957b.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f201025q
                r2 = 0
                G00.c r3 = r10.f201029u
                com.avito.android.mortgage.person_form.mvi.a r4 = r10.f201028t
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                if (r1 == 0) goto L36
                if (r1 == r8) goto L32
                if (r1 == r7) goto L2e
                if (r1 == r6) goto L26
                if (r1 != r5) goto L1e
                kotlin.C42729a0.b(r11)
                goto Lac
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction r1 = r10.f201027s
                kotlinx.coroutines.flow.j r6 = r10.f201026r
                kotlin.C42729a0.b(r11)
                goto L85
            L2e:
                kotlin.C42729a0.b(r11)
                goto L74
            L32:
                kotlin.C42729a0.b(r11)
                goto L62
            L36:
                kotlin.C42729a0.b(r11)
                kotlinx.coroutines.flow.j r11 = r10.f201026r
                com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction r1 = r10.f201027s
                boolean r9 = r1 instanceof com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction.PhoneConfirmed
                if (r9 == 0) goto L65
                r4.getClass()
                com.avito.android.mortgage.person_form.mvi.i r1 = new com.avito.android.mortgage.person_form.mvi.i
                r1.<init>(r3, r4, r2)
                kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.C43175k.G(r1)
                com.avito.android.util.R0 r3 = r4.f200902h
                kotlinx.coroutines.scheduling.b r3 = r3.a()
                kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.C43175k.I(r3, r1)
                r10.f201026r = r2
                r10.f201025q = r8
                java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r1, r11)
                if (r11 != r0) goto L62
                return r0
            L62:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            L65:
                boolean r8 = r1 instanceof com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction.UploadingCompleted
                if (r8 != 0) goto L77
                r10.f201026r = r2
                r10.f201025q = r7
                java.lang.Object r11 = r11.emit(r1, r10)
                if (r11 != r0) goto L74
                return r0
            L74:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            L77:
                r10.f201026r = r11
                r10.f201027s = r1
                r10.f201025q = r6
                java.lang.Object r6 = r11.emit(r1, r10)
                if (r6 != r0) goto L84
                return r0
            L84:
                r6 = r11
            L85:
                com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction$UploadingCompleted r1 = (com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction.UploadingCompleted) r1
                java.util.Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> r11 = r1.f201218b
                boolean r11 = r11.isEmpty()
                if (r11 == 0) goto Lac
                boolean r11 = r3.f6151i
                if (r11 != 0) goto Lac
                r4.getClass()
                com.avito.android.mortgage.person_form.mvi.g r11 = new com.avito.android.mortgage.person_form.mvi.g
                r11.<init>(r3, r4, r2)
                kotlinx.coroutines.flow.i r11 = kotlinx.coroutines.flow.C43175k.G(r11)
                r10.f201026r = r2
                r10.f201027s = r2
                r10.f201025q = r5
                java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r6)
                if (r11 != r0) goto Lac
                return r0
            Lac:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.C32650b.C5957b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32650b(G00.c cVar, C32649a c32649a, Continuation<? super C32650b> continuation) {
        super(2, continuation);
        this.f201014s = cVar;
        this.f201015t = c32649a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32650b c32650b = new C32650b(this.f201014s, this.f201015t, continuation);
        c32650b.f201013r = obj;
        return c32650b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32650b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Iterable iterableSingletonList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201012q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f201013r;
            PersonFormInternalAction.ButtonNextClicked buttonNextClicked = PersonFormInternalAction.ButtonNextClicked.f201175b;
            this.f201013r = interfaceC43172j;
            this.f201012q = 1;
            if (interfaceC43172j.emit(buttonNextClicked, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f201013r;
            C42729a0.b(obj);
        }
        G00.c cVar = this.f201014s;
        List<LZ.c> list = cVar.f6153k;
        ArrayList arrayList = new ArrayList();
        for (LZ.c cVar2 : list) {
            com.avito.android.mortgage.api.model.items.form.d dVar = cVar2.f9996b;
            if (dVar instanceof LZ.b) {
                List<LZ.a> listD = ((LZ.b) dVar).d();
                ArrayList arrayList2 = new ArrayList();
                for (LZ.a aVar : listD) {
                    C42745f0.h(C42745f0.U(new LZ.c(FormContentItemType.INPUT, aVar.getInput()), new LZ.c(FormContentItemType.CHECKBOX, aVar.getCheckbox())), arrayList2);
                }
                iterableSingletonList = C42745f0.i0(cVar2, arrayList2);
            } else {
                iterableSingletonList = Collections.singletonList(cVar2);
            }
            C42745f0.h(iterableSingletonList, arrayList);
        }
        C32649a c32649a = this.f201015t;
        InterfaceC43160i interfaceC43160iG = C43175k.G(new a(c32649a.f200897c.b(cVar.f6144b, cVar.f6145c, cVar.f6146d, cVar.f6147e, cVar.c(), arrayList, cVar.f6151i), new C5957b(cVar, c32649a, null), null));
        this.f201013r = null;
        this.f201012q = 2;
        if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
