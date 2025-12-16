package com.avito.android.rating_form.select_item.mvi;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.rating_form.select_item.RatingFormSelectItemArguments;
import com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction;
import com.avito.android.rating_form.y;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.d2;

/* compiled from: RatingFormSelectItemBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.arch.mvi.b<RatingFormSelectItemInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.select_item.d f249065a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.interactor.i f249066b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RatingFormSelectItemArguments f249067c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.custom_params.d f249068d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f249069e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.m f249070f;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<RatingFormSelectItemInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2 f249071b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f249072c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating_form.select_item.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C7480a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f249073b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f249074c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.rating_form.select_item.mvi.RatingFormSelectItemBootstrap$produce$$inlined$map$1$2", f = "RatingFormSelectItemBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.rating_form.select_item.mvi.e$a$a$a, reason: collision with other inner class name */
            public static final class C7481a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f249075q;

                /* renamed from: r, reason: collision with root package name */
                public int f249076r;

                public C7481a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f249075q = obj;
                    this.f249076r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7480a.this.emit(null, this);
                }
            }

            public C7480a(InterfaceC43172j interfaceC43172j, e eVar) {
                this.f249073b = interfaceC43172j;
                this.f249074c = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, @Y61.k kotlin.coroutines.Continuation r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.avito.android.rating_form.select_item.mvi.e.a.C7480a.C7481a
                    if (r0 == 0) goto L13
                    r0 = r14
                    com.avito.android.rating_form.select_item.mvi.e$a$a$a r0 = (com.avito.android.rating_form.select_item.mvi.e.a.C7480a.C7481a) r0
                    int r1 = r0.f249076r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f249076r = r1
                    goto L18
                L13:
                    com.avito.android.rating_form.select_item.mvi.e$a$a$a r0 = new com.avito.android.rating_form.select_item.mvi.e$a$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.f249075q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f249076r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r14)
                    goto L8f
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    kotlin.C42729a0.b(r14)
                    com.avito.android.rating_form.interactor.RatingFormInteractorInternalAction r13 = (com.avito.android.rating_form.interactor.RatingFormInteractorInternalAction) r13
                    com.avito.android.rating_form.select_item.mvi.e r14 = r12.f249074c
                    r14.getClass()
                    boolean r2 = r13 instanceof com.avito.android.rating_form.interactor.RatingFormInteractorInternalAction.ShowErrorToast
                    if (r2 == 0) goto L82
                    com.avito.android.rating_form.interactor.RatingFormInteractorInternalAction$ShowErrorToast r13 = (com.avito.android.rating_form.interactor.RatingFormInteractorInternalAction.ShowErrorToast) r13
                    com.avito.android.rating_form.StepIdentifier r2 = r13.f248198b
                    com.avito.android.rating_form.select_item.RatingFormSelectItemArguments r4 = r14.f249067c
                    com.avito.android.rating_form.StepIdentifier r5 = r4.f248867d
                    boolean r2 = kotlin.jvm.internal.L.f(r2, r5)
                    if (r2 != 0) goto L50
                    com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Empty r13 = com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction.Empty.f249085b
                    goto L84
                L50:
                    com.avito.android.rating_form.m r14 = r14.f249070f
                    com.avito.android.rating_form.StepIdentifier r2 = r4.f248867d
                    java.lang.String r14 = r14.p(r2)
                    r2 = 0
                    if (r14 == 0) goto L61
                    com.avito.android.printable_text.PrintableText r14 = com.avito.android.printable_text.b.f(r14)
                    r5 = r14
                    goto L62
                L61:
                    r5 = r2
                L62:
                    r14 = 0
                    java.io.Serializable[] r14 = new java.io.Serializable[r14]
                    r4 = 2131956333(0x7f13126d, float:1.9549219E38)
                    com.avito.android.printable_text.PrintableText r7 = com.avito.android.printable_text.b.c(r4, r14)
                    java.util.List<com.avito.android.rating_form.api.remote.model.a> r13 = r13.f248200d
                    if (r13 == 0) goto L75
                    fh0.a$d r2 = new fh0.a$d
                    r2.<init>(r13)
                L75:
                    r8 = r2
                    com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$ShowErrorToastBar r13 = new com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$ShowErrorToastBar
                    r10 = 18
                    r11 = 0
                    r6 = 0
                    r9 = 0
                    r4 = r13
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                    goto L84
                L82:
                    com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Empty r13 = com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction.Empty.f249085b
                L84:
                    r0.f249076r = r3
                    kotlinx.coroutines.flow.j r14 = r12.f249073b
                    java.lang.Object r13 = r14.emit(r13, r0)
                    if (r13 != r1) goto L8f
                    return r1
                L8f:
                    kotlin.G0 r13 = kotlin.G0.f406611a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.select_item.mvi.e.a.C7480a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(d2 d2Var, e eVar) {
            this.f249071b = d2Var;
            this.f249072c = eVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super RatingFormSelectItemInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f249071b.collect(new C7480a(interfaceC43172j, this.f249072c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: RatingFormSelectItemBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.select_item.mvi.RatingFormSelectItemBootstrap$produce$2", f = "RatingFormSelectItemBootstrap.kt", i = {0, 1}, l = {40, 41, 42, 42}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super RatingFormSelectItemInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249078q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249079r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = e.this.new b(continuation);
            bVar.f249079r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormSelectItemInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f249078q
                com.avito.android.rating_form.select_item.mvi.e r2 = com.avito.android.rating_form.select_item.mvi.e.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L3e
                if (r1 == r6) goto L36
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L24
                if (r1 != r3) goto L1c
                kotlin.C42729a0.b(r13)
                goto Lc9
            L1c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L24:
                java.lang.Object r1 = r12.f249079r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto Lbe
            L2d:
                java.lang.Object r1 = r12.f249079r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto Laf
            L36:
                java.lang.Object r1 = r12.f249079r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L9f
            L3e:
                kotlin.C42729a0.b(r13)
                java.lang.Object r13 = r12.f249079r
                r1 = r13
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Initial r13 = new com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Initial
                com.avito.android.rating_form.select_item.RatingFormSelectItemArguments r8 = r2.f249067c
                com.avito.android.rating_form.StepIdentifier r8 = r8.f248867d
                com.avito.android.rating_form.m r9 = r2.f249070f
                java.util.ArrayList r8 = r9.y(r8)
                if (r8 == 0) goto L72
                java.util.Iterator r8 = r8.iterator()
            L58:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L6e
                java.lang.Object r9 = r8.next()
                r10 = r9
                com.avito.android.rating_form.api.remote.model.RatingFormField r10 = (com.avito.android.rating_form.api.remote.model.RatingFormField) r10
                com.avito.android.rating_form.api.remote.model.RatingFormField$EntityType r10 = r10.getEntityType()
                com.avito.android.rating_form.api.remote.model.RatingFormField$EntityType r11 = com.avito.android.rating_form.api.remote.model.RatingFormField.EntityType.SELECT
                if (r10 != r11) goto L58
                goto L6f
            L6e:
                r9 = r7
            L6f:
                com.avito.android.rating_form.api.remote.model.RatingFormField r9 = (com.avito.android.rating_form.api.remote.model.RatingFormField) r9
                goto L73
            L72:
                r9 = r7
            L73:
                kotlin.jvm.internal.n0 r8 = kotlin.jvm.internal.m0.f406844a
                java.lang.Class<com.avito.android.rating_form.custom_params.m> r10 = com.avito.android.rating_form.custom_params.m.class
                kotlin.reflect.d r8 = r8.b(r10)
                if (r9 == 0) goto L82
                java.util.Map r9 = r9.e()
                goto L83
            L82:
                r9 = r7
            L83:
                com.avito.android.rating_form.custom_params.d r10 = r2.f249068d
                java.lang.Object r8 = r10.a(r8, r9)
                com.avito.android.rating_form.custom_params.m r8 = (com.avito.android.rating_form.custom_params.m) r8
                if (r8 == 0) goto L90
                com.avito.android.rating_form.custom_params.m$a r8 = r8.f248027a
                goto L91
            L90:
                r8 = r7
            L91:
                r13.<init>(r8)
                r12.f249079r = r1
                r12.f249078q = r6
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto L9f
                return r0
            L9f:
                com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Loading r13 = new com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Loading
                r13.<init>()
                r12.f249079r = r1
                r12.f249078q = r5
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto Laf
                return r0
            Laf:
                com.avito.android.rating_form.select_item.d r13 = r2.f249065a
                r12.f249079r = r1
                r12.f249078q = r4
                java.lang.String r2 = r2.f249069e
                java.lang.Object r13 = r13.a(r2, r7, r12)
                if (r13 != r0) goto Lbe
                return r0
            Lbe:
                r12.f249079r = r7
                r12.f249078q = r3
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto Lc9
                return r0
            Lc9:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.select_item.mvi.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.rating_form.select_item.d dVar, @Y61.k com.avito.android.rating_form.interactor.i iVar, @Y61.k RatingFormSelectItemArguments ratingFormSelectItemArguments, @Y61.k y yVar, @Y61.k com.avito.android.rating_form.custom_params.d dVar2, @com.avito.android.rating_form.select_item.di.b @Y61.k String str) {
        this.f249065a = dVar;
        this.f249066b = iVar;
        this.f249067c = ratingFormSelectItemArguments;
        this.f249068d = dVar2;
        this.f249069e = str;
        this.f249070f = yVar.b(ratingFormSelectItemArguments.f248866c);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<RatingFormSelectItemInternalAction> a() {
        return C43175k.N(new a(this.f249066b.getF248219h(), this), C43175k.G(new b(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
