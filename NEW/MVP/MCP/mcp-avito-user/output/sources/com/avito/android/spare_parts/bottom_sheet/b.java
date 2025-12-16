package com.avito.android.spare_parts.bottom_sheet;

import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sx0.C48428a;
import sx0.InterfaceC48429b;
import tx0.InterfaceC48735a;
import tx0.InterfaceC48736b;

/* compiled from: SparePartsBottomSheetActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.spare_parts.bottom_sheet.SparePartsBottomSheetActivity$observeViewModel$1", f = "SparePartsBottomSheetActivity.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f284755q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SparePartsBottomSheetActivity f284756r;

    /* compiled from: SparePartsBottomSheetActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.spare_parts.bottom_sheet.SparePartsBottomSheetActivity$observeViewModel$1$1", f = "SparePartsBottomSheetActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f284757q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ SparePartsBottomSheetActivity f284758r;

        /* compiled from: SparePartsBottomSheetActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.spare_parts.bottom_sheet.SparePartsBottomSheetActivity$observeViewModel$1$1$1", f = "SparePartsBottomSheetActivity.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.spare_parts.bottom_sheet.b$a$a, reason: collision with other inner class name */
        public static final class C8510a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f284759q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SparePartsBottomSheetActivity f284760r;

            /* compiled from: SparePartsBottomSheetActivity.kt */
            @s0
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "Ltx0/c;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "emit", "(Lkotlin/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.spare_parts.bottom_sheet.b$a$a$a, reason: collision with other inner class name */
            public static final class C8511a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SparePartsBottomSheetActivity f284761b;

                public C8511a(SparePartsBottomSheetActivity sparePartsBottomSheetActivity) {
                    this.f284761b = sparePartsBottomSheetActivity;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
                    /*
                        Method dump skipped, instructions count: 416
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.spare_parts.bottom_sheet.b.a.C8510a.C8511a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8510a(SparePartsBottomSheetActivity sparePartsBottomSheetActivity, Continuation<? super C8510a> continuation) {
                super(2, continuation);
                this.f284760r = sparePartsBottomSheetActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C8510a(this.f284760r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8510a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f284759q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    SparePartsBottomSheetActivity sparePartsBottomSheetActivity = this.f284760r;
                    InterfaceC43160i interfaceC43160iC = com.avito.android.arch.mvi.utils.h.c(((x) sparePartsBottomSheetActivity.f284737p.getValue()).getState());
                    C8511a c8511a = new C8511a(sparePartsBottomSheetActivity);
                    this.f284759q = 1;
                    if (interfaceC43160iC.collect(c8511a, this) == coroutine_suspended) {
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

        /* compiled from: SparePartsBottomSheetActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.spare_parts.bottom_sheet.SparePartsBottomSheetActivity$observeViewModel$1$1$2", f = "SparePartsBottomSheetActivity.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.spare_parts.bottom_sheet.b$a$b, reason: collision with other inner class name */
        public static final class C8512b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f284762q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SparePartsBottomSheetActivity f284763r;

            /* compiled from: SparePartsBottomSheetActivity.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.spare_parts.bottom_sheet.b$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C8513a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SparePartsBottomSheetActivity f284764b;

                public C8513a(SparePartsBottomSheetActivity sparePartsBottomSheetActivity) {
                    this.f284764b = sparePartsBottomSheetActivity;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    int i12 = SparePartsBottomSheetActivity.f284733v;
                    SparePartsBottomSheetActivity sparePartsBottomSheetActivity = this.f284764b;
                    sparePartsBottomSheetActivity.getClass();
                    if (L.f((InterfaceC48736b) obj, InterfaceC48736b.a.f439672a)) {
                        sparePartsBottomSheetActivity.finish();
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f284764b, SparePartsBottomSheetActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8512b(SparePartsBottomSheetActivity sparePartsBottomSheetActivity, Continuation<? super C8512b> continuation) {
                super(2, continuation);
                this.f284763r = sparePartsBottomSheetActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C8512b(this.f284763r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8512b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f284762q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    SparePartsBottomSheetActivity sparePartsBottomSheetActivity = this.f284763r;
                    InterfaceC43160i<InterfaceC48736b> events = ((x) sparePartsBottomSheetActivity.f284737p.getValue()).getEvents();
                    C8513a c8513a = new C8513a(sparePartsBottomSheetActivity);
                    this.f284762q = 1;
                    if (events.collect(c8513a, this) == coroutine_suspended) {
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

        /* compiled from: SparePartsBottomSheetActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.spare_parts.bottom_sheet.SparePartsBottomSheetActivity$observeViewModel$1$1$3", f = "SparePartsBottomSheetActivity.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f284765q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SparePartsBottomSheetActivity f284766r;

            /* compiled from: SparePartsBottomSheetActivity.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsx0/a;", "it", "Lkotlin/G0;", "emit", "(Lsx0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.spare_parts.bottom_sheet.b$a$c$a, reason: collision with other inner class name */
            public static final class C8514a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SparePartsBottomSheetActivity f284767b;

                public C8514a(SparePartsBottomSheetActivity sparePartsBottomSheetActivity) {
                    this.f284767b = sparePartsBottomSheetActivity;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    ((x) this.f284767b.f284737p.getValue()).accept(new InterfaceC48735a.C12694a(((C48428a) obj).f438930a));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SparePartsBottomSheetActivity sparePartsBottomSheetActivity, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f284766r = sparePartsBottomSheetActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f284766r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f284765q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    SparePartsBottomSheetActivity sparePartsBottomSheetActivity = this.f284766r;
                    InterfaceC48429b interfaceC48429b = sparePartsBottomSheetActivity.f284742u;
                    if (interfaceC48429b == null) {
                        interfaceC48429b = null;
                    }
                    InterfaceC43160i<C48428a> interfaceC43160iG = interfaceC48429b.g();
                    C8514a c8514a = new C8514a(sparePartsBottomSheetActivity);
                    this.f284765q = 1;
                    if (interfaceC43160iG.collect(c8514a, this) == coroutine_suspended) {
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
        public a(SparePartsBottomSheetActivity sparePartsBottomSheetActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f284758r = sparePartsBottomSheetActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f284758r, continuation);
            aVar.f284757q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f284757q;
            SparePartsBottomSheetActivity sparePartsBottomSheetActivity = this.f284758r;
            C43259k.d(t12, null, null, new C8510a(sparePartsBottomSheetActivity, null), 3);
            C43259k.d(t12, null, null, new C8512b(sparePartsBottomSheetActivity, null), 3);
            C43259k.d(t12, null, null, new c(sparePartsBottomSheetActivity, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SparePartsBottomSheetActivity sparePartsBottomSheetActivity, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f284756r = sparePartsBottomSheetActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f284756r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f284755q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            SparePartsBottomSheetActivity sparePartsBottomSheetActivity = this.f284756r;
            a aVar = new a(sparePartsBottomSheetActivity, null);
            this.f284755q = 1;
            if (C23056p0.b(sparePartsBottomSheetActivity, state, aVar, this) == coroutine_suspended) {
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
