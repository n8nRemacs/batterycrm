package com.avito.android.sbc.autodispatcheslist;

import Ro0.InterfaceC15068b;
import Ro0.d;
import Y41.p;
import Y61.k;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.sbc.autodispatches.x;
import com.avito.android.sbc.autodispatcheslist.mvi.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SbcAutoDispatchesListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.autodispatcheslist.SbcAutoDispatchesListFragment$bindViewModel$1", f = "SbcAutoDispatchesListFragment.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259009q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SbcAutoDispatchesListFragment f259010r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f259011s;

    /* compiled from: SbcAutoDispatchesListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.autodispatcheslist.SbcAutoDispatchesListFragment$bindViewModel$1$1", f = "SbcAutoDispatchesListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.sbc.autodispatcheslist.a$a, reason: collision with other inner class name */
    public static final class C7779a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f259012q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l f259013r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SbcAutoDispatchesListFragment f259014s;

        /* compiled from: SbcAutoDispatchesListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sbc.autodispatcheslist.SbcAutoDispatchesListFragment$bindViewModel$1$1$1", f = "SbcAutoDispatchesListFragment.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.sbc.autodispatcheslist.a$a$a, reason: collision with other inner class name */
        public static final class C7780a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f259015q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ l f259016r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ SbcAutoDispatchesListFragment f259017s;

            /* compiled from: SbcAutoDispatchesListFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRo0/d;", "it", "Lkotlin/G0;", "emit", "(LRo0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.sbc.autodispatcheslist.a$a$a$a, reason: collision with other inner class name */
            public static final class C7781a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SbcAutoDispatchesListFragment f259018b;

                public C7781a(SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment) {
                    this.f259018b = sbcAutoDispatchesListFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Ro0.d dVar = (Ro0.d) obj;
                    h hVar = this.f259018b.f258995r0;
                    if (hVar != null) {
                        i iVar = hVar.f259113d;
                        iVar.f259116d = !(dVar instanceof d.e);
                        iVar.f259117e = dVar instanceof d.c;
                        hVar.f259111b.l(dVar.b(), null);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7780a(SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment, l lVar, Continuation continuation) {
                super(2, continuation);
                this.f259016r = lVar;
                this.f259017s = sbcAutoDispatchesListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new C7780a(this.f259017s, this.f259016r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C7780a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f259015q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C7781a c7781a = new C7781a(this.f259017s);
                    this.f259015q = 1;
                    if (this.f259016r.le(c7781a, this) == coroutine_suspended) {
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

        /* compiled from: SbcAutoDispatchesListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sbc.autodispatcheslist.SbcAutoDispatchesListFragment$bindViewModel$1$1$2", f = "SbcAutoDispatchesListFragment.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.sbc.autodispatcheslist.a$a$b */
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f259019q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ l f259020r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ SbcAutoDispatchesListFragment f259021s;

            /* compiled from: SbcAutoDispatchesListFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRo0/b;", "event", "Lkotlin/G0;", "emit", "(LRo0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.sbc.autodispatcheslist.a$a$b$a, reason: collision with other inner class name */
            public static final class C7782a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SbcAutoDispatchesListFragment f259022b;

                public C7782a(SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment) {
                    this.f259022b = sbcAutoDispatchesListFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    x xVar;
                    InterfaceC15068b interfaceC15068b = (InterfaceC15068b) obj;
                    boolean z12 = interfaceC15068b instanceof InterfaceC15068b.C0981b;
                    SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment = this.f259022b;
                    if (z12) {
                        new SbcAutoDispatchesListAdvertsExplanationDialog().show(sbcAutoDispatchesListFragment.getParentFragmentManager(), (String) null);
                    } else if ((interfaceC15068b instanceof InterfaceC15068b.a) && (xVar = sbcAutoDispatchesListFragment.f258997t0) != null) {
                        xVar.T0(((InterfaceC15068b.a) interfaceC15068b).f14638a);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment, l lVar, Continuation continuation) {
                super(2, continuation);
                this.f259020r = lVar;
                this.f259021s = sbcAutoDispatchesListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new b(this.f259021s, this.f259020r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f259019q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C7782a c7782a = new C7782a(this.f259021s);
                    this.f259019q = 1;
                    if (this.f259020r.ke(c7782a, this) == coroutine_suspended) {
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
        public C7779a(SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment, l lVar, Continuation continuation) {
            super(2, continuation);
            this.f259013r = lVar;
            this.f259014s = sbcAutoDispatchesListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            C7779a c7779a = new C7779a(this.f259014s, this.f259013r, continuation);
            c7779a.f259012q = obj;
            return c7779a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C7779a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f259012q;
            l lVar = this.f259013r;
            SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment = this.f259014s;
            C43259k.d(t12, null, null, new C7780a(sbcAutoDispatchesListFragment, lVar, null), 3);
            C43259k.d(t12, null, null, new b(sbcAutoDispatchesListFragment, lVar, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment, l lVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f259010r = sbcAutoDispatchesListFragment;
        this.f259011s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f259010r, this.f259011s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259009q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            l lVar = this.f259011s;
            SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment = this.f259010r;
            C7779a c7779a = new C7779a(sbcAutoDispatchesListFragment, lVar, null);
            this.f259009q = 1;
            if (C23056p0.b(sbcAutoDispatchesListFragment, state, c7779a, this) == coroutine_suspended) {
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
