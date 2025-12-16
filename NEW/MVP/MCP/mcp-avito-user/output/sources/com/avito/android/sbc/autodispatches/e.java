package com.avito.android.sbc.autodispatches;

import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.autodispatches.B;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43200s1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: SbcAutoDispatchesCache.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatches/e;", "Lcom/avito/android/sbc/autodispatches/d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes3.dex */
public final class e implements InterfaceC34468d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f258880a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<C> f258881b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f258882c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f258883d;

    /* compiled from: SbcAutoDispatchesCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesCacheImpl$1", f = "SbcAutoDispatchesCache.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f258884q;

        /* compiled from: SbcAutoDispatchesCache.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/sbc/autodispatches/C;", "cache", "Lcom/avito/android/sbc/autodispatches/B;", "action", "<anonymous>", "(Lcom/avito/android/sbc/autodispatches/C;Lcom/avito/android/sbc/autodispatches/B;)Lcom/avito/android/sbc/autodispatches/C;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesCacheImpl$1$1", f = "SbcAutoDispatchesCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.sbc.autodispatches.e$a$a, reason: collision with other inner class name */
        public static final class C7771a extends SuspendLambda implements Y41.q<C, B, Continuation<? super C>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ C f258886q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ B f258887r;

            public C7771a() {
                throw null;
            }

            @Override // Y41.q
            public final Object invoke(C c12, B b12, Continuation<? super C> continuation) {
                C7771a c7771a = new C7771a(3, continuation);
                c7771a.f258886q = c12;
                c7771a.f258887r = b12;
                return c7771a.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                C c12;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                C c13 = this.f258886q;
                B b12 = this.f258887r;
                if (b12 instanceof B.c) {
                    B.c cVar = (B.c) b12;
                    return new C(cVar.f258814a, cVar.f258815b);
                }
                if (b12 instanceof B.a) {
                    B.a aVar = (B.a) b12;
                    c12 = new C(new C34466b(C42745f0.h0(aVar.f258812a.f258848a, new ArrayList(c13.f258819a.f258848a)), aVar.f258812a.f258849b), c13.f258820b);
                } else {
                    if (!(b12 instanceof B.b)) {
                        if (!(b12 instanceof B.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C.f258817c.getClass();
                        return C.f258818d;
                    }
                    B.b bVar = (B.b) b12;
                    c12 = new C(c13.f258819a, new C34466b(C42745f0.h0(bVar.f258813a.f258848a, new ArrayList(c13.f258820b.f258848a)), bVar.f258813a.f258849b));
                }
                return c12;
            }
        }

        /* compiled from: SbcAutoDispatchesCache.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sbc/autodispatches/C;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/sbc/autodispatches/C;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f258888b;

            public b(e eVar) {
                this.f258888b = eVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f258888b.f258881b.setValue((C) obj);
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f258884q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e eVar = e.this;
                e2 e2Var = eVar.f258882c;
                C.f258817c.getClass();
                C43200s1 c43200s1 = new C43200s1(C.f258818d, e2Var, new C7771a(3, null));
                b bVar = new b(eVar);
                this.f258884q = 1;
                if (c43200s1.collect(bVar, this) == coroutine_suspended) {
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

    /* compiled from: SbcAutoDispatchesCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesCacheImpl$init$1", f = "SbcAutoDispatchesCache.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f258889q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C34466b f258891s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C34466b f258892t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C34466b c34466b, C34466b c34466b2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f258891s = c34466b;
            this.f258892t = c34466b2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new b(this.f258891s, this.f258892t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f258889q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = e.this.f258882c;
                B.c cVar = new B.c(this.f258891s, this.f258892t);
                this.f258889q = 1;
                if (e2Var.emit(cVar, this) == coroutine_suspended) {
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

    /* compiled from: SbcAutoDispatchesCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesCacheImpl$invalidate$1", f = "SbcAutoDispatchesCache.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f258893q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f258893q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = e.this.f258882c;
                B.d dVar = B.d.f258816a;
                this.f258893q = 1;
                if (e2Var.emit(dVar, this) == coroutine_suspended) {
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

    /* compiled from: SbcAutoDispatchesCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesCacheImpl$putActiveAutoDispatches$1", f = "SbcAutoDispatchesCache.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f258895q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C34466b f258897s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C34466b c34466b, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f258897s = c34466b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new d(this.f258897s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f258895q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = e.this.f258882c;
                B.a aVar = new B.a(this.f258897s);
                this.f258895q = 1;
                if (e2Var.emit(aVar, this) == coroutine_suspended) {
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

    /* compiled from: SbcAutoDispatchesCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesCacheImpl$putInactiveAutoDispatches$1", f = "SbcAutoDispatchesCache.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.sbc.autodispatches.e$e, reason: collision with other inner class name */
    public static final class C7772e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f258898q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C34466b f258900s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7772e(C34466b c34466b, Continuation<? super C7772e> continuation) {
            super(2, continuation);
            this.f258900s = c34466b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new C7772e(this.f258900s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C7772e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f258898q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = e.this.f258882c;
                B.b bVar = new B.b(this.f258900s);
                this.f258898q = 1;
                if (e2Var.emit(bVar, this) == coroutine_suspended) {
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
    public e(@Y61.k R0 r02) {
        this.f258880a = r02;
        C.f258817c.getClass();
        this.f258881b = p2.a(C.f258818d);
        this.f258882c = f2.b(0, 0, null, 7);
        C43238h c43238hA = U.a(r02.a());
        this.f258883d = c43238hA;
        C43259k.d(c43238hA, null, null, new a(null), 3);
    }

    @Override // com.avito.android.sbc.autodispatches.InterfaceC34468d
    public final void a(@Y61.k C34466b c34466b) {
        C43259k.d(this.f258883d, null, null, new C7772e(c34466b, null), 3);
    }

    @Override // com.avito.android.sbc.autodispatches.InterfaceC34468d
    @Y61.k
    public final g b() {
        return new g(this.f258881b);
    }

    @Override // com.avito.android.sbc.autodispatches.InterfaceC34468d
    public final void c(@Y61.k C34466b c34466b, @Y61.k C34466b c34466b2) {
        C43259k.d(this.f258883d, null, null, new b(c34466b, c34466b2, null), 3);
    }

    @Override // com.avito.android.sbc.autodispatches.InterfaceC34468d
    public final void d(@Y61.k C34466b c34466b) {
        C43259k.d(this.f258883d, null, null, new d(c34466b, null), 3);
    }

    @Override // com.avito.android.sbc.autodispatches.InterfaceC34468d
    @Y61.k
    public final f e() {
        return new f(this.f258881b);
    }

    @Override // com.avito.android.sbc.autodispatches.InterfaceC34468d
    public final void invalidate() {
        C43259k.d(this.f258883d, null, null, new c(null), 3);
    }
}
