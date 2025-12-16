package com.avito.android.rating_form.select_item.mvi;

import Y41.p;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.api.remote.model.a;
import com.avito.android.rating_form.select_item.RatingFormSelectItemArguments;
import com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction;
import com.avito.android.rating_form.y;
import com.avito.android.util.R0;
import fh0.C40423b;
import fh0.InterfaceC40422a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormSelectItemActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lfh0/a;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lfh0/b;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC40422a, RatingFormSelectItemInternalAction, C40423b> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f249029g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.interactor.i f249030a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.select_item.d f249031b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f249032c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f249033d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RatingFormSelectItemArguments f249034e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.m f249035f;

    /* compiled from: RatingFormSelectItemActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/a$a;", "", "<init>", "()V", "", "SEARCH_THROTTLE_MS", "J", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating_form.select_item.mvi.a$a, reason: collision with other inner class name */
    public static final class C7479a {
        public /* synthetic */ C7479a(C42822w c42822w) {
            this();
        }

        public C7479a() {
        }
    }

    /* compiled from: RatingFormSelectItemActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.select_item.mvi.RatingFormSelectItemActor$process$3", f = "RatingFormSelectItemActor.kt", i = {0}, l = {51, 52, 52}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super RatingFormSelectItemInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249036q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249037r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f249037r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormSelectItemInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
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
                int r1 = r6.f249036q
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r7)
                goto L62
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f249037r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L57
            L26:
                java.lang.Object r1 = r6.f249037r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L46
            L2e:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f249037r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Loading r1 = new com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Loading
                r1.<init>()
                r6.f249037r = r7
                r6.f249036q = r4
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L45
                return r0
            L45:
                r1 = r7
            L46:
                com.avito.android.rating_form.select_item.mvi.a r7 = com.avito.android.rating_form.select_item.mvi.a.this
                com.avito.android.rating_form.select_item.d r4 = r7.f249031b
                r6.f249037r = r1
                r6.f249036q = r3
                java.lang.String r7 = r7.f249032c
                java.lang.Object r7 = r4.a(r7, r5, r6)
                if (r7 != r0) goto L57
                return r0
            L57:
                r6.f249037r = r5
                r6.f249036q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L62
                return r0
            L62:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.select_item.mvi.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RatingFormSelectItemActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.select_item.mvi.RatingFormSelectItemActor$process$4", f = "RatingFormSelectItemActor.kt", i = {0}, l = {57, 58, 58}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super RatingFormSelectItemInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249039q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249040r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C40423b f249041s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f249042t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C40423b c40423b, a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f249041s = c40423b;
            this.f249042t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f249041s, this.f249042t, continuation);
            cVar.f249040r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormSelectItemInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[RETURN] */
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
                int r1 = r6.f249039q
                fh0.b r2 = r6.f249041s
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2f
                if (r1 == r5) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.C42729a0.b(r7)
                goto L6f
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                java.lang.Object r1 = r6.f249040r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L63
            L27:
                java.lang.Object r1 = r6.f249040r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L52
            L2f:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f249040r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                java.lang.String r1 = r2.f396052e
                if (r1 == 0) goto L72
                boolean r1 = kotlin.text.C43066x.K(r1)
                if (r1 == 0) goto L41
                goto L72
            L41:
                com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Loading r1 = new com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Loading
                r1.<init>()
                r6.f249040r = r7
                r6.f249039q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L51
                return r0
            L51:
                r1 = r7
            L52:
                com.avito.android.rating_form.select_item.mvi.a r7 = r6.f249042t
                com.avito.android.rating_form.select_item.d r7 = r7.f249031b
                java.lang.String r2 = r2.f396052e
                r6.f249040r = r1
                r6.f249039q = r4
                java.lang.Object r7 = r7.b(r2, r6)
                if (r7 != r0) goto L63
                return r0
            L63:
                r2 = 0
                r6.f249040r = r2
                r6.f249039q = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L6f
                return r0
            L6f:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L72:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.select_item.mvi.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RatingFormSelectItemActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.select_item.mvi.RatingFormSelectItemActor$process$5", f = "RatingFormSelectItemActor.kt", i = {}, l = {62, 62}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super RatingFormSelectItemInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249043q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249044r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40422a f249046t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC40422a interfaceC40422a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f249046t = interfaceC40422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = a.this.new d(this.f249046t, continuation);
            dVar.f249044r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormSelectItemInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249043q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f249044r;
                a aVar = a.this;
                com.avito.android.rating_form.select_item.d dVar = aVar.f249031b;
                String str = ((InterfaceC40422a.e) this.f249046t).f396045a;
                this.f249044r = interfaceC43172j;
                this.f249043q = 1;
                obj = dVar.a(aVar.f249032c, str, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f249044r;
                C42729a0.b(obj);
            }
            this.f249044r = null;
            this.f249043q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormSelectItemActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.select_item.mvi.RatingFormSelectItemActor$process$6", f = "RatingFormSelectItemActor.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super RatingFormSelectItemInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249047q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40422a f249049s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC40422a interfaceC40422a, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f249049s = interfaceC40422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new e(this.f249049s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormSelectItemInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249047q;
            if (i12 == 0) {
                C42729a0.b(obj);
                long j12 = ((InterfaceC40422a.f) this.f249049s).f396046a;
                this.f249047q = 1;
                if (a.c(a.this, j12, this) == coroutine_suspended) {
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

    /* compiled from: RatingFormSelectItemActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.select_item.mvi.RatingFormSelectItemActor$process$7", f = "RatingFormSelectItemActor.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super RatingFormSelectItemInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249050q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40422a f249052s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC40422a interfaceC40422a, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f249052s = interfaceC40422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new f(this.f249052s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormSelectItemInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249050q;
            if (i12 == 0) {
                C42729a0.b(obj);
                List<com.avito.android.rating_form.api.remote.model.a> list = ((InterfaceC40422a.d) this.f249052s).f396044a;
                this.f249050q = 1;
                int i13 = a.f249029g;
                a aVar = a.this;
                RatingFormSelectItemArguments ratingFormSelectItemArguments = aVar.f249034e;
                Object objB = aVar.f249030a.b(list, (14 & 2) != 0 ? null : Boxing.boxInt(ratingFormSelectItemArguments.f248866c), (14 & 4) != 0 ? null : ratingFormSelectItemArguments.f248867d, new LinkedHashMap(), this);
                if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objB = G0.f406611a;
                }
                if (objB == coroutine_suspended) {
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

    /* compiled from: RatingFormSelectItemActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.select_item.mvi.RatingFormSelectItemActor$process$8", f = "RatingFormSelectItemActor.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<InterfaceC43172j<? super RatingFormSelectItemInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249053q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C40423b f249054r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f249055s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C40423b c40423b, a aVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f249054r = c40423b;
            this.f249055s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new g(this.f249054r, this.f249055s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormSelectItemInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249053q;
            if (i12 == 0) {
                C42729a0.b(obj);
                List<com.avito.conveyor_item.a> list = this.f249054r.f396051d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof com.avito.android.rating_form.select_item.adapter.advert.a) {
                        arrayList.add(obj2);
                    }
                }
                com.avito.android.rating_form.select_item.adapter.advert.a aVar = (com.avito.android.rating_form.select_item.adapter.advert.a) C42745f0.G(arrayList);
                if (aVar == null) {
                    return G0.f406611a;
                }
                this.f249053q = 1;
                if (a.c(this.f249055s, aVar.f248903c, this) == coroutine_suspended) {
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

    static {
        new C7479a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.rating_form.interactor.i iVar, @Y61.k com.avito.android.rating_form.select_item.d dVar, @com.avito.android.rating_form.select_item.di.b @Y61.k String str, @Y61.k R0 r02, @Y61.k RatingFormSelectItemArguments ratingFormSelectItemArguments, @Y61.k y yVar) {
        this.f249030a = iVar;
        this.f249031b = dVar;
        this.f249032c = str;
        this.f249033d = r02;
        this.f249034e = ratingFormSelectItemArguments;
        this.f249035f = yVar.b(ratingFormSelectItemArguments.f248866c);
    }

    public static final Object c(a aVar, long j12, SuspendLambda suspendLambda) {
        RatingFormSelectItemArguments ratingFormSelectItemArguments = aVar.f249034e;
        ArrayList<RatingFormField> arrayListY = aVar.f249035f.y(ratingFormSelectItemArguments.f248867d);
        if (arrayListY == null) {
            return G0.f406611a;
        }
        for (RatingFormField ratingFormField : arrayListY) {
            if (ratingFormField.getViewType() == RatingFormField.ViewType.ITEMS) {
                a.e eVar = new a.e(new a.e.AbstractC7454a.c(ratingFormField.getId(), ratingFormField.getSlug(), ratingFormField.getDataType(), j12));
                StepIdentifier stepIdentifier = ratingFormSelectItemArguments.f248867d;
                List listU = C42745f0.U(eVar, new a.C7446a(new a.C7446a.C7447a(stepIdentifier.f247923b, stepIdentifier.f247924c)));
                RatingFormSelectItemArguments ratingFormSelectItemArguments2 = aVar.f249034e;
                Object objB = aVar.f249030a.b(listU, (14 & 2) != 0 ? null : Boxing.boxInt(ratingFormSelectItemArguments2.f248866c), (14 & 4) != 0 ? null : ratingFormSelectItemArguments2.f248867d, new LinkedHashMap(), suspendLambda);
                if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objB = G0.f406611a;
                }
                return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, com.avito.android.rating_form.select_item.mvi.b.f249056l, new com.avito.android.rating_form.select_item.mvi.c(this, aVar), 300L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<RatingFormSelectItemInternalAction> b(@Y61.k InterfaceC40422a interfaceC40422a, @Y61.k C40423b c40423b) {
        InterfaceC43160i interfaceC43160iG;
        if (interfaceC40422a instanceof InterfaceC40422a.b) {
            interfaceC43160iG = C43175k.G(new b(null));
        } else if (interfaceC40422a instanceof InterfaceC40422a.c) {
            interfaceC43160iG = C43175k.G(new c(c40423b, this, null));
        } else if (interfaceC40422a instanceof InterfaceC40422a.e) {
            interfaceC43160iG = C43175k.G(new d(interfaceC40422a, null));
        } else if (interfaceC40422a instanceof InterfaceC40422a.f) {
            interfaceC43160iG = C43175k.G(new e(interfaceC40422a, null));
        } else if (interfaceC40422a instanceof InterfaceC40422a.d) {
            interfaceC43160iG = C43175k.G(new f(interfaceC40422a, null));
        } else {
            if (!(interfaceC40422a instanceof InterfaceC40422a.C11168a)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC43160iG = C43175k.G(new g(c40423b, this, null));
        }
        return C43175k.I(this.f249033d.a(), interfaceC43160iG);
    }
}
