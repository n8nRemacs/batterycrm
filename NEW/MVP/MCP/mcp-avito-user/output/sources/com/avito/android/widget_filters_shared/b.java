package com.avito.android.widget_filters_shared;

import UP0.c;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.M0;
import androidx.view.N0;
import androidx.view.P0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.i2;

/* compiled from: WidgetFiltersSharedViewModelImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters_shared/b;", "Lcom/avito/android/widget_filters_shared/a;", "b", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends com.avito.android.widget_filters_shared.a {

    /* renamed from: N, reason: collision with root package name */
    @k
    public final e2 f330571N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final e2 f330572O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final e2 f330573P;

    /* renamed from: Q, reason: collision with root package name */
    @k
    public final e2 f330574Q;

    /* compiled from: WidgetFiltersSharedViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters_shared.WidgetFiltersSharedViewModelImpl$1", f = "WidgetFiltersSharedViewModelImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f330575q;

        /* compiled from: WidgetFiltersSharedViewModelImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.widget_filters_shared.WidgetFiltersSharedViewModelImpl$1$1", f = "WidgetFiltersSharedViewModelImpl.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.widget_filters_shared.b$a$a, reason: collision with other inner class name */
        public static final class C10259a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f330577q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f330578r;

            /* compiled from: WidgetFiltersSharedViewModelImpl.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUP0/c;", "event", "Lkotlin/G0;", "emit", "(LUP0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.widget_filters_shared.b$a$a$a, reason: collision with other inner class name */
            public static final class C10260a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f330579b;

                public C10260a(b bVar) {
                    this.f330579b = bVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    UP0.c cVar = (UP0.c) obj;
                    boolean z12 = cVar instanceof c.a;
                    b bVar = this.f330579b;
                    if (z12) {
                        Object objEmit = bVar.f330571N.emit(((c.a) cVar).f16377a, continuation);
                        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
                    }
                    if (!(cVar instanceof c.b)) {
                        return G0.f406611a;
                    }
                    e2 e2Var = bVar.f330573P;
                    G0 g02 = G0.f406611a;
                    Object objEmit2 = e2Var.emit(g02, continuation);
                    return objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit2 : g02;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10259a(b bVar, Continuation<? super C10259a> continuation) {
                super(2, continuation);
                this.f330578r = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C10259a(this.f330578r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C10259a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f330577q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    b bVar = this.f330578r;
                    InterfaceC43160i<UP0.c> events = bVar.getEvents();
                    C10260a c10260a = new C10260a(bVar);
                    this.f330577q = 1;
                    if (events.collect(c10260a, this) == coroutine_suspended) {
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

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f330575q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43259k.d((T) this.f330575q, null, null, new C10259a(b.this, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersSharedViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/widget_filters_shared/b$b;", "", "<init>", "()V", "a", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.widget_filters_shared.b$b, reason: collision with other inner class name */
    public static final class C10261b {

        /* compiled from: WidgetFiltersSharedViewModelImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters_shared/b$b$a;", "Landroidx/lifecycle/P0$c;", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.widget_filters_shared.b$b$a */
        public static final class a implements P0.c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.android.widget_filters_shared.mvi.d f330580a;

            @Inject
            public a(@k com.avito.android.widget_filters_shared.mvi.d dVar) {
                this.f330580a = dVar;
            }

            @Override // androidx.lifecycle.P0.c
            @k
            public final <T extends M0> T create(@k Class<T> cls) {
                return new b(this.f330580a);
            }
        }

        public /* synthetic */ C10261b(C42822w c42822w) {
            this();
        }

        public C10261b() {
        }
    }

    static {
        new C10261b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public b(@k com.avito.android.widget_filters_shared.mvi.d dVar) {
        super(dVar, i2.a.f411432b);
        i2.f411430a.getClass();
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f330571N = e2VarB;
        this.f330572O = e2VarB;
        e2 e2VarB2 = f2.b(0, 0, null, 7);
        this.f330573P = e2VarB2;
        this.f330574Q = e2VarB2;
        C43259k.d(N0.a(this), null, null, new a(null), 3);
    }

    @Override // com.avito.android.widget_filters_shared.a
    @k
    /* renamed from: ne, reason: from getter */
    public final e2 getF330572O() {
        return this.f330572O;
    }

    @Override // com.avito.android.widget_filters_shared.a
    @k
    /* renamed from: oe, reason: from getter */
    public final e2 getF330574Q() {
        return this.f330574Q;
    }
}
