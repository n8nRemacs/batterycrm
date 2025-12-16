package com.avito.android.edit_carousel;

import androidx.compose.runtime.internal.P;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction;
import com.avito.android.remote.D0;
import com.avito.android.remote.model.extended.modification.CarouselModification;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EditCarouselInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/f;", "Lcom/avito/android/edit_carousel/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f146383a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f146384b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f146385c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final w f146386d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f146387e;

    /* compiled from: EditCarouselInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_carousel.EditCarouselInteractorImpl$loadAdverts$1", f = "EditCarouselInteractor.kt", i = {0, 1}, l = {58, 60, 62}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146388q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146389r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f146391t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Integer f146392u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Long f146393v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Long f146394w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Integer num, Long l12, Long l13, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f146391t = str;
            this.f146392u = num;
            this.f146393v = l12;
            this.f146394w = l13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(this.f146391t, this.f146392u, this.f146393v, this.f146394w, continuation);
            aVar.f146389r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0142  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_carousel.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EditCarouselInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_carousel.EditCarouselInteractorImpl$loadAdverts$2", f = "EditCarouselInteractor.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<?>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146395q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f146396r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f146397s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f146396r = interfaceC43172j;
            bVar.f146397s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f146395q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f146396r;
                EditCarouselInternalAction.AdvertsLoadingError advertsLoadingError = new EditCarouselInternalAction.AdvertsLoadingError(this.f146397s);
                this.f146396r = null;
                this.f146395q = 1;
                if (interfaceC43172j.emit(advertsLoadingError, this) == coroutine_suspended) {
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

    /* compiled from: EditCarouselInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_carousel.EditCarouselInteractorImpl$modifyCarouselFields$1", f = "EditCarouselInteractor.kt", i = {0, 1}, l = {122, 127, 129}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EditCarouselInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146398q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146399r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f146401t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f146402u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f146403v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ List<Long> f146404w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f146405x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ CarouselModification.OperationType f146406y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, int i12, List<Long> list, boolean z12, CarouselModification.OperationType operationType, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f146401t = str;
            this.f146402u = str2;
            this.f146403v = i12;
            this.f146404w = list;
            this.f146405x = z12;
            this.f146406y = operationType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = f.this.new c(this.f146401t, this.f146402u, this.f146403v, this.f146404w, this.f146405x, this.f146406y, continuation);
            cVar.f146399r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditCarouselInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) throws com.avito.android.util.ApiException {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f146398q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r12)
                goto La8
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                java.lang.Object r1 = r11.f146399r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L8c
            L26:
                java.lang.Object r1 = r11.f146399r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L43
            L2e:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f146399r
                kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
                com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction$CarouselModificationInProgress r1 = com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction.CarouselModificationInProgress.f146469b
                r11.f146399r = r12
                r11.f146398q = r4
                java.lang.Object r1 = r12.emit(r1, r11)
                if (r1 != r0) goto L42
                return r0
            L42:
                r1 = r12
            L43:
                com.avito.android.edit_carousel.f r12 = com.avito.android.edit_carousel.f.this
                h31.e<com.google.gson.Gson> r4 = r12.f146384b
                java.lang.Object r4 = r4.get()
                com.google.gson.Gson r4 = (com.google.gson.Gson) r4
                com.avito.android.remote.model.extended.modification.ModificationBody r5 = new com.avito.android.remote.model.extended.modification.ModificationBody
                com.avito.android.remote.model.extended.modification.CarouselModification r6 = new com.avito.android.remote.model.extended.modification.CarouselModification
                com.avito.android.remote.model.extended.modification.CarouselModification$Operation$CarouselModifyValue r7 = new com.avito.android.remote.model.extended.modification.CarouselModification$Operation$CarouselModifyValue
                int r8 = r11.f146403v
                java.util.List<java.lang.Long> r9 = r11.f146404w
                boolean r10 = r11.f146405x
                r7.<init>(r8, r9, r10)
                com.avito.android.remote.model.extended.modification.CarouselModification$Operation r8 = new com.avito.android.remote.model.extended.modification.CarouselModification$Operation
                com.avito.android.remote.model.extended.modification.CarouselModification$OperationType r9 = r11.f146406y
                java.lang.String r10 = r11.f146402u
                r8.<init>(r9, r10, r7)
                java.util.List r7 = java.util.Collections.singletonList(r8)
                java.lang.String r8 = r11.f146401t
                r6.<init>(r8, r7)
                java.util.List r6 = java.util.Collections.singletonList(r6)
                r5.<init>(r6)
                java.lang.String r4 = r4.l(r5)
                h31.e<com.avito.android.remote.D0> r12 = r12.f146383a
                java.lang.Object r12 = r12.get()
                com.avito.android.remote.D0 r12 = (com.avito.android.remote.D0) r12
                r11.f146399r = r1
                r11.f146398q = r3
                java.lang.Object r12 = r12.e(r4, r11)
                if (r12 != r0) goto L8c
                return r0
            L8c:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                boolean r3 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto Lab
                com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
                java.lang.Object r12 = r12.getResult()
                com.avito.android.remote.model.extended.modification.ModificationResult r12 = (com.avito.android.remote.model.extended.modification.ModificationResult) r12
                com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction$CarouselModificationSuccess r12 = com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction.CarouselModificationSuccess.f146470b
                r3 = 0
                r11.f146399r = r3
                r11.f146398q = r2
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto La8
                return r0
            La8:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            Lab:
                boolean r0 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto Lbe
                com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
                com.avito.android.remote.error.ApiError r0 = r12.getError()
                java.lang.Throwable r12 = r12.getCause()
                com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r0, r12)
                throw r12
            Lbe:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_carousel.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EditCarouselInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_carousel.EditCarouselInteractorImpl$modifyCarouselFields$2", f = "EditCarouselInteractor.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super EditCarouselInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146407q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f146408r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f146409s;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super EditCarouselInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f146408r = interfaceC43172j;
            dVar.f146409s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f146407q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f146408r;
                EditCarouselInternalAction.CarouselModificationFailure carouselModificationFailure = new EditCarouselInternalAction.CarouselModificationFailure(this.f146409s);
                this.f146408r = null;
                this.f146407q = 1;
                if (interfaceC43172j.emit(carouselModificationFailure, this) == coroutine_suspended) {
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

    @Inject
    public f(@Y61.k h31.e<D0> eVar, @Y61.k h31.e<Gson> eVar2, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k w wVar, @Y61.k R0 r02) {
        this.f146383a = eVar;
        this.f146384b = eVar2;
        this.f146385c = interfaceC35863o4;
        this.f146386d = wVar;
        this.f146387e = r02;
    }

    @Override // com.avito.android.edit_carousel.e
    @Y61.k
    public final InterfaceC43160i<EditCarouselInternalAction> a(@Y61.k String str, @Y61.k String str2, int i12, @Y61.k List<Long> list, boolean z12) {
        return d(str, str2, i12, list, z12, CarouselModification.OperationType.UPDATE);
    }

    @Override // com.avito.android.edit_carousel.e
    @Y61.k
    public final InterfaceC43160i b(@Y61.l String str, @Y61.l Long l12, @Y61.l Long l13, @Y61.l Integer num) {
        return C43175k.I(this.f146387e.a(), new C43152f0(C43175k.G(new a(str, num, l12, l13, null)), new b(3, null)));
    }

    @Override // com.avito.android.edit_carousel.e
    @Y61.k
    public final InterfaceC43160i c(int i12, @Y61.k String str, @Y61.k List list) {
        return d(str, this.f146385c.a(), i12, list, true, CarouselModification.OperationType.ADD);
    }

    public final InterfaceC43160i<EditCarouselInternalAction> d(String str, String str2, int i12, List<Long> list, boolean z12, CarouselModification.OperationType operationType) {
        return C43175k.I(this.f146387e.a(), new C43152f0(C43175k.G(new c(str, str2, i12, list, z12, operationType, null)), new d(3, null)));
    }
}
