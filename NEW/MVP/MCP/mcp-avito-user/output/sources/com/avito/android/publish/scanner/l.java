package com.avito.android.publish.scanner;

import android.content.Context;
import androidx.core.os.C22777e;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.component.snackbar.e;
import com.avito.android.lib.design.modal.a;
import io.reactivex.rxjava3.core.z;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import ze0.C50556d;
import ze0.InterfaceC50553a;
import ze0.InterfaceC50555c;

/* compiled from: ScannerFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.scanner.ScannerFragment$subscribeToViewState$1", f = "ScannerFragment.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f239221q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ScannerFragment f239222r;

    /* compiled from: ScannerFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.scanner.ScannerFragment$subscribeToViewState$1$1", f = "ScannerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f239223q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ScannerFragment f239224r;

        /* compiled from: ScannerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.scanner.ScannerFragment$subscribeToViewState$1$1$1", f = "ScannerFragment.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.scanner.l$a$a, reason: collision with other inner class name */
        public static final class C7190a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f239225q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ScannerFragment f239226r;

            /* compiled from: ScannerFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.publish.scanner.l$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C7191a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScannerFragment f239227b;

                public C7191a(ScannerFragment scannerFragment) {
                    this.f239227b = scannerFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    InterfaceC50555c interfaceC50555c = (InterfaceC50555c) obj;
                    kotlin.reflect.n<Object>[] nVarArr = ScannerFragment.f239116D0;
                    ScannerFragment scannerFragment = this.f239227b;
                    if (L.f(interfaceC50555c, InterfaceC50555c.a.f444123a)) {
                        o oVar = scannerFragment.f239131z0;
                        if (oVar != null) {
                            oVar.M0();
                        }
                    } else if (interfaceC50555c instanceof InterfaceC50555c.b) {
                        q qVar = scannerFragment.f239130y0;
                        if (qVar != null) {
                            InterfaceC50555c.b bVar = (InterfaceC50555c.b) interfaceC50555c;
                            com.avito.android.component.snackbar.h.c(qVar.f239268f, bVar.f444124a, 0, new e.b(bVar.f444125b), null, null, null, 234);
                        }
                    } else if (interfaceC50555c instanceof InterfaceC50555c.C12963c) {
                        f fVar = ((InterfaceC50555c.C12963c) interfaceC50555c).f444126a;
                        k kVar = new k(scannerFragment);
                        Context contextRequireContext = scannerFragment.requireContext();
                        com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, contextRequireContext, new com.avito.android.publish.scanner.c(fVar, contextRequireContext, kVar)));
                    } else if (interfaceC50555c instanceof InterfaceC50555c.d) {
                        scannerFragment.getParentFragmentManager().o0(C22777e.a(), "SCANNER_REQUEST_KEY");
                        o oVar2 = scannerFragment.f239131z0;
                        if (oVar2 != null) {
                            oVar2.M0();
                        }
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
                    return new C42801a(2, this.f239227b, ScannerFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/scanner/mvi/entity/ScannerOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7190a(ScannerFragment scannerFragment, Continuation<? super C7190a> continuation) {
                super(2, continuation);
                this.f239226r = scannerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7190a(this.f239226r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C7190a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f239225q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    kotlin.reflect.n<Object>[] nVarArr = ScannerFragment.f239116D0;
                    ScannerFragment scannerFragment = this.f239226r;
                    InterfaceC43160i<InterfaceC50555c> events = scannerFragment.s5().getEvents();
                    C7191a c7191a = new C7191a(scannerFragment);
                    this.f239225q = 1;
                    if (events.collect(c7191a, this) == coroutine_suspended) {
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

        /* compiled from: ScannerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.scanner.ScannerFragment$subscribeToViewState$1$1$2", f = "ScannerFragment.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f239228q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ScannerFragment f239229r;

            /* compiled from: ScannerFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.publish.scanner.l$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C7192a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScannerFragment f239230b;

                public C7192a(ScannerFragment scannerFragment) {
                    this.f239230b = scannerFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    kotlin.reflect.n<Object>[] nVarArr = ScannerFragment.f239116D0;
                    ScannerFragment scannerFragment = this.f239230b;
                    if (((C50556d) obj).f444128a) {
                        q qVar = scannerFragment.f239130y0;
                        if (qVar != null) {
                            qVar.f239269g.k(null);
                        }
                    } else {
                        q qVar2 = scannerFragment.f239130y0;
                        if (qVar2 != null) {
                            qVar2.f239269g.j();
                        }
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
                    return new C42801a(2, this.f239230b, ScannerFragment.class, "render", "render(Lcom/avito/android/publish/scanner/mvi/entity/ScannerState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ScannerFragment scannerFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f239229r = scannerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f239229r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f239228q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    kotlin.reflect.n<Object>[] nVarArr = ScannerFragment.f239116D0;
                    ScannerFragment scannerFragment = this.f239229r;
                    n2<C50556d> state = scannerFragment.s5().getState();
                    C7192a c7192a = new C7192a(scannerFragment);
                    this.f239228q = 1;
                    if (state.collect(c7192a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* compiled from: ScannerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.scanner.ScannerFragment$subscribeToViewState$1$1$3", f = "ScannerFragment.kt", i = {}, l = {313}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f239231q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ScannerFragment f239232r;

            /* compiled from: ScannerFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.publish.scanner.l$a$c$a, reason: collision with other inner class name */
            public static final class C7193a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScannerFragment f239233b;

                public C7193a(ScannerFragment scannerFragment) {
                    this.f239233b = scannerFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    kotlin.reflect.n<Object>[] nVarArr = ScannerFragment.f239116D0;
                    this.f239233b.s5().accept(InterfaceC50553a.b.f444110a);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ScannerFragment scannerFragment, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f239232r = scannerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f239232r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                z<G0> zVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f239231q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ScannerFragment scannerFragment = this.f239232r;
                    q qVar = scannerFragment.f239130y0;
                    if (qVar != null && (zVar = qVar.f239270h) != null) {
                        InterfaceC43160i interfaceC43160iA = y.a(zVar);
                        C7193a c7193a = new C7193a(scannerFragment);
                        this.f239231q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c7193a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public a(ScannerFragment scannerFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f239224r = scannerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f239224r, continuation);
            aVar.f239223q = obj;
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
            T t12 = (T) this.f239223q;
            ScannerFragment scannerFragment = this.f239224r;
            C43259k.d(t12, null, null, new C7190a(scannerFragment, null), 3);
            C43259k.d(t12, null, null, new b(scannerFragment, null), 3);
            C43259k.d(t12, null, null, new c(scannerFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ScannerFragment scannerFragment, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f239222r = scannerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new l(this.f239222r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f239221q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            ScannerFragment scannerFragment = this.f239222r;
            a aVar = new a(scannerFragment, null);
            this.f239221q = 1;
            if (C23056p0.b(scannerFragment, state, aVar, this) == coroutine_suspended) {
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
