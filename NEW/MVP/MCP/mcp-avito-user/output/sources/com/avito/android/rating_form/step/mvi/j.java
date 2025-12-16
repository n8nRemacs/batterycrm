package com.avito.android.rating_form.step.mvi;

import android.net.Uri;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import com.avito.android.rating_form.step.validations.ValidationInfo;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import ih0.C41404c;
import ih0.InterfaceC41402a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/j;", "Lcom/avito/android/arch/mvi/a;", "Lih0/a;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lih0/c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements com.avito.android.arch.mvi.a<InterfaceC41402a, RatingFormStepInternalAction, C41404c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RatingFormStepArguments f249608a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.interactor.i f249609b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.step.validations.o f249610c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.step.f f249611d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.m f249612e;

    /* compiled from: RatingFormStepActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$10", f = "RatingFormStepActor.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249613q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41402a f249615s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC41402a interfaceC41402a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f249615s = interfaceC41402a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return j.this.new a(this.f249615s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249613q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC41402a.s sVar = (InterfaceC41402a.s) this.f249615s;
                FieldIdentifier fieldIdentifier = sVar.f398643a;
                com.avito.android.rating_form.step.e eVar = sVar.f398644b;
                this.f249613q = 1;
                Object objD = j.this.f249611d.d(fieldIdentifier, eVar, this);
                if (objD != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objD = G0.f406611a;
                }
                if (objD == coroutine_suspended) {
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

    /* compiled from: RatingFormStepActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$3", f = "RatingFormStepActor.kt", i = {0, 1}, l = {98, 99, 100, UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249616q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249617r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C41404c f249619t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41402a f249620u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C41404c c41404c, InterfaceC41402a interfaceC41402a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f249619t = c41404c;
            this.f249620u = interfaceC41402a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = j.this.new b(this.f249619t, this.f249620u, continuation);
            bVar.f249617r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00db A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.mvi.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RatingFormStepActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$4", f = "RatingFormStepActor.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249621q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249622r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41402a f249624t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f249625u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC41402a interfaceC41402a, LinkedHashMap linkedHashMap, Continuation continuation) {
            super(2, continuation);
            this.f249624t = interfaceC41402a;
            this.f249625u = linkedHashMap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = j.this.new c(this.f249624t, this.f249625u, continuation);
            cVar.f249622r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249621q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f249622r;
                InterfaceC41402a.b bVar = (InterfaceC41402a.b) this.f249624t;
                FieldIdentifier fieldIdentifier = bVar.f398623a;
                Integer num = bVar.f398624b;
                j jVar = j.this;
                jVar.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new com.avito.android.rating_form.step.mvi.d(num, jVar, this.f249625u, fieldIdentifier, null));
                this.f249621q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: RatingFormStepActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$Empty;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$5", f = "RatingFormStepActor.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction.Empty>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249626q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249627r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41402a f249629t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f249630u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC41402a interfaceC41402a, LinkedHashMap linkedHashMap, Continuation continuation) {
            super(2, continuation);
            this.f249629t = interfaceC41402a;
            this.f249630u = linkedHashMap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = j.this.new d(this.f249629t, this.f249630u, continuation);
            dVar.f249627r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction.Empty> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249626q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f249627r;
                InterfaceC41402a.c cVar = (InterfaceC41402a.c) this.f249629t;
                FieldIdentifier fieldIdentifier = cVar.f398625a;
                String str = cVar.f398626b;
                j jVar = j.this;
                jVar.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new com.avito.android.rating_form.step.mvi.e(jVar, fieldIdentifier, str, this.f249630u, null));
                this.f249626q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: RatingFormStepActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$6", f = "RatingFormStepActor.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249631q;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return j.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249631q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.rating_form.interactor.i iVar = j.this.f249609b;
                this.f249631q = 1;
                if (iVar.e(false, this) == coroutine_suspended) {
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

    /* compiled from: RatingFormStepActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$7", f = "RatingFormStepActor.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249633q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249634r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41402a f249636t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC41402a interfaceC41402a, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f249636t = interfaceC41402a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = j.this.new f(this.f249636t, continuation);
            fVar.f249634r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249633q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f249634r;
                j.this.f249612e.v(((InterfaceC41402a.t) this.f249636t).f398645a);
                RatingFormStepInternalAction.UpdateItems updateItems = new RatingFormStepInternalAction.UpdateItems(null, null, 3, null);
                this.f249633q = 1;
                if (interfaceC43172j.emit(updateItems, this) == coroutine_suspended) {
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

    /* compiled from: RatingFormStepActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$8", f = "RatingFormStepActor.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249637q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41402a f249639s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC41402a interfaceC41402a, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f249639s = interfaceC41402a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return j.this.new g(this.f249639s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object objF;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249637q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC41402a.z zVar = (InterfaceC41402a.z) this.f249639s;
                FieldIdentifier fieldIdentifier = zVar.f398653a;
                ArrayList arrayList = zVar.f398654b;
                this.f249637q = 1;
                j jVar = j.this;
                jVar.getClass();
                if (arrayList.isEmpty()) {
                    objF = G0.f406611a;
                } else {
                    objF = jVar.f249611d.f(fieldIdentifier, (Uri) C42745f0.E(arrayList), this);
                    if (objF != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objF = G0.f406611a;
                    }
                }
                if (objF == coroutine_suspended) {
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

    /* compiled from: RatingFormStepActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$9", f = "RatingFormStepActor.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249640q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41402a f249642s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC41402a interfaceC41402a, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f249642s = interfaceC41402a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return j.this.new h(this.f249642s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249640q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC41402a.g gVar = (InterfaceC41402a.g) this.f249642s;
                FieldIdentifier fieldIdentifier = gVar.f398632a;
                com.avito.android.rating_form.step.e eVar = gVar.f398633b;
                this.f249640q = 1;
                Object objC = j.this.f249611d.c(fieldIdentifier, eVar, this);
                if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objC = G0.f406611a;
                }
                if (objC == coroutine_suspended) {
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
    public j(@Y61.k com.avito.android.rating_form.y yVar, @Y61.k RatingFormStepArguments ratingFormStepArguments, @Y61.k com.avito.android.rating_form.interactor.i iVar, @Y61.k com.avito.android.rating_form.step.validations.o oVar, @Y61.k com.avito.android.rating_form.step.f fVar) {
        this.f249608a = ratingFormStepArguments;
        this.f249609b = iVar;
        this.f249610c = oVar;
        this.f249611d = fVar;
        this.f249612e = yVar.b(ratingFormStepArguments.f249115c);
    }

    public static final boolean c(j jVar, LinkedHashMap linkedHashMap, FieldIdentifier fieldIdentifier) {
        jVar.getClass();
        return (fieldIdentifier == null || ((ValidationInfo) linkedHashMap.remove(fieldIdentifier)) == null) ? false : true;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new l(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, k.f249643l));
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0369  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction> b(@Y61.k ih0.InterfaceC41402a r10, @Y61.k ih0.C41404c r11) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.mvi.j.b(ih0.a, ih0.c):kotlinx.coroutines.flow.i");
    }
}
