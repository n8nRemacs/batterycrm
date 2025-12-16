package com.avito.android.delivery_location_suggest;

import Gv.InterfaceC13920a;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestFragment;
import com.avito.android.util.K2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43188o0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;

/* compiled from: DeliveryLocationSuggestFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_location_suggest.DeliveryLocationSuggestFragment$initToolbar$1", f = "DeliveryLocationSuggestFragment.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f135099q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ DeliveryLocationSuggestFragment f135100r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f135101s;

    /* compiled from: DeliveryLocationSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_location_suggest.DeliveryLocationSuggestFragment$initToolbar$1$1", f = "DeliveryLocationSuggestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f135102q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ DeliveryLocationSuggestFragment f135103r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ View f135104s;

        /* compiled from: DeliveryLocationSuggestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.delivery_location_suggest.DeliveryLocationSuggestFragment$initToolbar$1$1$1", f = "DeliveryLocationSuggestFragment.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.delivery_location_suggest.f$a$a, reason: collision with other inner class name */
        public static final class C4087a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f135105q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ DeliveryLocationSuggestFragment f135106r;

            /* compiled from: DeliveryLocationSuggestFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.delivery_location_suggest.f$a$a$a, reason: collision with other inner class name */
            public static final class C4088a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DeliveryLocationSuggestFragment f135107b;

                public C4088a(DeliveryLocationSuggestFragment deliveryLocationSuggestFragment) {
                    this.f135107b = deliveryLocationSuggestFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    DeliveryLocationSuggestFragment.a aVar = DeliveryLocationSuggestFragment.f135018v0;
                    DeliveryLocationSuggestFragment deliveryLocationSuggestFragment = this.f135107b;
                    K2.d(deliveryLocationSuggestFragment.q5(), true);
                    deliveryLocationSuggestFragment.r5().accept(new InterfaceC13920a.C0379a((String) obj));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4087a(DeliveryLocationSuggestFragment deliveryLocationSuggestFragment, Continuation<? super C4087a> continuation) {
                super(2, continuation);
                this.f135106r = deliveryLocationSuggestFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C4087a(this.f135106r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C4087a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f135105q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    DeliveryLocationSuggestFragment.a aVar = DeliveryLocationSuggestFragment.f135018v0;
                    DeliveryLocationSuggestFragment deliveryLocationSuggestFragment = this.f135106r;
                    InterfaceC43160i interfaceC43160iA = y.a(deliveryLocationSuggestFragment.q5().f292162g);
                    C4088a c4088a = new C4088a(deliveryLocationSuggestFragment);
                    this.f135105q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c4088a, this) == coroutine_suspended) {
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

        /* compiled from: DeliveryLocationSuggestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.delivery_location_suggest.DeliveryLocationSuggestFragment$initToolbar$1$1$2", f = "DeliveryLocationSuggestFragment.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f135108q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ DeliveryLocationSuggestFragment f135109r;

            /* compiled from: DeliveryLocationSuggestFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.delivery_location_suggest.f$a$b$a, reason: collision with other inner class name */
            public static final class C4089a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DeliveryLocationSuggestFragment f135110b;

                public C4089a(DeliveryLocationSuggestFragment deliveryLocationSuggestFragment) {
                    this.f135110b = deliveryLocationSuggestFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    DeliveryLocationSuggestFragment.a aVar = DeliveryLocationSuggestFragment.f135018v0;
                    this.f135110b.r5().accept(new InterfaceC13920a.C0379a((String) obj));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(DeliveryLocationSuggestFragment deliveryLocationSuggestFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f135109r = deliveryLocationSuggestFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f135109r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f135108q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    DeliveryLocationSuggestFragment.a aVar = DeliveryLocationSuggestFragment.f135018v0;
                    DeliveryLocationSuggestFragment deliveryLocationSuggestFragment = this.f135109r;
                    C43188o0 c43188o0T = C43175k.t(y.a(deliveryLocationSuggestFragment.q5().d()), 1);
                    C4089a c4089a = new C4089a(deliveryLocationSuggestFragment);
                    this.f135108q = 1;
                    if (c43188o0T.collect(c4089a, this) == coroutine_suspended) {
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

        /* compiled from: DeliveryLocationSuggestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.delivery_location_suggest.DeliveryLocationSuggestFragment$initToolbar$1$1$3", f = "DeliveryLocationSuggestFragment.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f135111q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ DeliveryLocationSuggestFragment f135112r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ View f135113s;

            /* compiled from: DeliveryLocationSuggestFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.delivery_location_suggest.f$a$c$a, reason: collision with other inner class name */
            public static final class C4090a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f135114b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ DeliveryLocationSuggestFragment f135115c;

                public C4090a(View view, DeliveryLocationSuggestFragment deliveryLocationSuggestFragment) {
                    this.f135114b = view;
                    this.f135115c = deliveryLocationSuggestFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    K2.d(this.f135114b, true);
                    DeliveryLocationSuggestFragment deliveryLocationSuggestFragment = this.f135115c;
                    ActivityC22955m activityC22955mL1 = deliveryLocationSuggestFragment.l1();
                    if (activityC22955mL1 != null) {
                        activityC22955mL1.setResult(0);
                    }
                    ActivityC22955m activityC22955mL12 = deliveryLocationSuggestFragment.l1();
                    if (activityC22955mL12 != null) {
                        activityC22955mL12.finish();
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(DeliveryLocationSuggestFragment deliveryLocationSuggestFragment, View view, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f135112r = deliveryLocationSuggestFragment;
                this.f135113s = view;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f135112r, this.f135113s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f135111q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    DeliveryLocationSuggestFragment.a aVar = DeliveryLocationSuggestFragment.f135018v0;
                    DeliveryLocationSuggestFragment deliveryLocationSuggestFragment = this.f135112r;
                    InterfaceC43160i interfaceC43160iA = y.a(deliveryLocationSuggestFragment.q5().f292161f);
                    C4090a c4090a = new C4090a(this.f135113s, deliveryLocationSuggestFragment);
                    this.f135111q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c4090a, this) == coroutine_suspended) {
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
        public a(DeliveryLocationSuggestFragment deliveryLocationSuggestFragment, View view, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f135103r = deliveryLocationSuggestFragment;
            this.f135104s = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f135103r, this.f135104s, continuation);
            aVar.f135102q = obj;
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
            T t12 = (T) this.f135102q;
            DeliveryLocationSuggestFragment deliveryLocationSuggestFragment = this.f135103r;
            C43259k.d(t12, null, null, new C4087a(deliveryLocationSuggestFragment, null), 3);
            C43259k.d(t12, null, null, new b(deliveryLocationSuggestFragment, null), 3);
            C43259k.d(t12, null, null, new c(deliveryLocationSuggestFragment, this.f135104s, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DeliveryLocationSuggestFragment deliveryLocationSuggestFragment, View view, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f135100r = deliveryLocationSuggestFragment;
        this.f135101s = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f135100r, this.f135101s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f135099q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            View view = this.f135101s;
            DeliveryLocationSuggestFragment deliveryLocationSuggestFragment = this.f135100r;
            a aVar = new a(deliveryLocationSuggestFragment, view, null);
            this.f135099q = 1;
            if (C23056p0.b(deliveryLocationSuggestFragment, state, aVar, this) == coroutine_suspended) {
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
