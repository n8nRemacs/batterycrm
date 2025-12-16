package ru.cyberity.cbr.core.common;

import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;

/* compiled from: LifecycleExtensions.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aL\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aL\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aP\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u000e2&\b\u0002\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0010\u001aL\u0010\f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0010\u001a@\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\t\u0010\u0017\u001a[\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u000f\u001a\u00020\u000e21\u0010\u0016\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Landroidx/lifecycle/P;", SearchParamsConverterKt.OWNER, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "", "collector", "a", "(Lkotlinx/coroutines/flow/i;Landroidx/lifecycle/P;LY41/p;)V", "Lkotlinx/coroutines/N0;", "b", "(Lkotlinx/coroutines/flow/i;Landroidx/lifecycle/P;LY41/p;)Lkotlinx/coroutines/N0;", "Lkotlinx/coroutines/T;", "scope", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/T;LY41/p;)V", "Lkotlinx/coroutines/flow/Z1;", "Lkotlin/Function1;", "Lkotlin/S;", "name", "current", "update", "(Lkotlinx/coroutines/flow/Z1;LY41/l;)V", "(Lkotlinx/coroutines/flow/Z1;Lkotlinx/coroutines/T;LY41/p;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class j0 {

    /* compiled from: LifecycleExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.LifecycleExtensionsKt$collectEvents$1", f = "LifecycleExtensions.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432716a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC22983P f432717b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC43160i<T> f432718c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y41.p<T, Continuation<? super G0>, Object> f432719d;

        /* compiled from: LifecycleExtensions.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.common.LifecycleExtensionsKt$collectEvents$1$1", f = "LifecycleExtensions.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.core.common.j0$a$a, reason: collision with other inner class name */
        public static final class C12437a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432720a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC43160i<T> f432721b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Y41.p<T, Continuation<? super G0>, Object> f432722c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C12437a(InterfaceC43160i<? extends T> interfaceC43160i, Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super C12437a> continuation) {
                super(2, continuation);
                this.f432721b = interfaceC43160i;
                this.f432722c = pVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((C12437a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C12437a(this.f432721b, this.f432722c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f432720a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i<T> interfaceC43160i = this.f432721b;
                    e eVar = new e(this.f432722c);
                    this.f432720a = 1;
                    if (interfaceC43160i.collect(eVar, this) == coroutine_suspended) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC22983P interfaceC22983P, InterfaceC43160i<? extends T> interfaceC43160i, Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f432717b = interfaceC22983P;
            this.f432718c = interfaceC43160i;
            this.f432719d = pVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f432717b, this.f432718c, this.f432719d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432716a;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle lifecycle = this.f432717b.getLifecycle();
                Lifecycle.State state = Lifecycle.State.f46682e;
                C12437a c12437a = new C12437a(this.f432718c, this.f432719d, null);
                this.f432716a = 1;
                if (C23056p0.a(lifecycle, state, c12437a, this) == coroutine_suspended) {
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

    /* compiled from: LifecycleExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.LifecycleExtensionsKt$collectIn$1", f = "LifecycleExtensions.kt", i = {}, l = {33, 34}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432723a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y41.p<T, Continuation<? super G0>, Object> f432724b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC43160i<T> f432725c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, InterfaceC43160i<? extends T> interfaceC43160i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f432724b = pVar;
            this.f432725c = interfaceC43160i;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f432724b, this.f432725c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432723a;
            if (i12 == 0) {
                C42729a0.b(obj);
                Y41.p<T, Continuation<? super G0>, Object> pVar = this.f432724b;
                if (pVar == 0) {
                    InterfaceC43160i<T> interfaceC43160i = this.f432725c;
                    this.f432723a = 1;
                    if (C43175k.i(interfaceC43160i, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    InterfaceC43160i<T> interfaceC43160i2 = this.f432725c;
                    e eVar = new e(pVar);
                    this.f432723a = 2;
                    if (interfaceC43160i2.collect(eVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LifecycleExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.LifecycleExtensionsKt$collectLatestIn$1", f = "LifecycleExtensions.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432726a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC43160i<T> f432727b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y41.p<T, Continuation<? super G0>, Object> f432728c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC43160i<? extends T> interfaceC43160i, Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f432727b = interfaceC43160i;
            this.f432728c = pVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f432727b, this.f432728c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432726a;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i<T> interfaceC43160i = this.f432727b;
                Y41.p<T, Continuation<? super G0>, Object> pVar = this.f432728c;
                this.f432726a = 1;
                if (C43175k.j(interfaceC43160i, pVar, this) == coroutine_suspended) {
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

    /* compiled from: LifecycleExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.LifecycleExtensionsKt$collectState$1", f = "LifecycleExtensions.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432729a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC22983P f432730b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC43160i<T> f432731c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y41.p<T, Continuation<? super G0>, Object> f432732d;

        /* compiled from: LifecycleExtensions.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.common.LifecycleExtensionsKt$collectState$1$1", f = "LifecycleExtensions.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432733a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC43160i<T> f432734b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Y41.p<T, Continuation<? super G0>, Object> f432735c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC43160i<? extends T> interfaceC43160i, Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f432734b = interfaceC43160i;
                this.f432735c = pVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f432734b, this.f432735c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f432733a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i<T> interfaceC43160i = this.f432734b;
                    Y41.p<T, Continuation<? super G0>, Object> pVar = this.f432735c;
                    this.f432733a = 1;
                    if (C43175k.j(interfaceC43160i, pVar, this) == coroutine_suspended) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public d(InterfaceC22983P interfaceC22983P, InterfaceC43160i<? extends T> interfaceC43160i, Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f432730b = interfaceC22983P;
            this.f432731c = interfaceC43160i;
            this.f432732d = pVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new d(this.f432730b, this.f432731c, this.f432732d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432729a;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle lifecycle = this.f432730b.getLifecycle();
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(this.f432731c, this.f432732d, null);
                this.f432729a = 1;
                if (C23056p0.a(lifecycle, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: LifecycleExtensions.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e implements InterfaceC43172j, D {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Y41.p<Object, Continuation<Object>, Object> f432736a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.p<Object, ? super Continuation<Object>, ? extends Object> pVar) {
            this.f432736a = pVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final /* synthetic */ Object emit(Object obj, Continuation continuation) {
            Object objInvoke = this.f432736a.invoke(obj, continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : G0.f406611a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                return L.f(getFunctionDelegate(), ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f432736a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: LifecycleExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.LifecycleExtensionsKt$updateStateIn$1", f = "LifecycleExtensions.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f432737a;

        /* renamed from: b, reason: collision with root package name */
        int f432738b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Z1<T> f432739c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y41.p<T, Continuation<? super T>, Object> f432740d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Z1<T> z12, Y41.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f432739c = z12;
            this.f432740d = pVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new f(this.f432739c, this.f432740d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Z1 z12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432738b;
            if (i12 == 0) {
                C42729a0.b(obj);
                Z1 z13 = this.f432739c;
                Y41.p<T, Continuation<? super T>, Object> pVar = this.f432740d;
                Object value = z13.getValue();
                this.f432737a = z13;
                this.f432738b = 1;
                Object objInvoke = pVar.invoke(value, this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z12 = z13;
                obj = objInvoke;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z12 = (Z1) this.f432737a;
                C42729a0.b(obj);
            }
            z12.setValue(obj);
            return G0.f406611a;
        }
    }

    public static final <T> void a(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar) {
        C43259k.d(C22984Q.a(interfaceC22983P), null, null, new a(interfaceC22983P, interfaceC43160i, pVar, null), 3);
    }

    @Y61.k
    public static final <T> N0 b(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar) {
        return C43259k.d(C22984Q.a(interfaceC22983P), null, null, new d(interfaceC22983P, interfaceC43160i, pVar, null), 3);
    }

    public static /* synthetic */ void a(InterfaceC43160i interfaceC43160i, T t12, Y41.p pVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            pVar = null;
        }
        a(interfaceC43160i, t12, pVar);
    }

    public static final <T> void b(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k T t12, @Y61.k Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar) {
        C43259k.d(t12, null, null, new c(interfaceC43160i, pVar, null), 3);
    }

    public static final <T> void a(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k T t12, @Y61.l Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar) {
        C43259k.d(t12, null, null, new b(pVar, interfaceC43160i, null), 3);
    }

    public static final <T> void a(@Y61.k Z1<T> z12, @Y61.k Y41.l<? super T, ? extends T> lVar) {
        z12.setValue(lVar.invoke(z12.getValue()));
    }

    public static final <T> void a(@Y61.k Z1<T> z12, @Y61.k T t12, @Y61.k Y41.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar) {
        C43259k.d(t12, null, null, new f(z12, pVar, null), 3);
    }
}
