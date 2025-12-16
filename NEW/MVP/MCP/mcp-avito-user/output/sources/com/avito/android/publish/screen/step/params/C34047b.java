package com.avito.android.publish.screen.step.params;

import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import fv.C40482a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: PublishDetailsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$attach$1", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.publish.screen.step.params.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34047b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f240465q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f240466r;

    /* compiled from: PublishDetailsDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$attach$1$1", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.publish.screen.step.params.b$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f240467q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ p f240468r;

        /* compiled from: PublishDetailsDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$attach$1$1$1", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.screen.step.params.b$a$a, reason: collision with other inner class name */
        public static final class C7215a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f240469q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ p f240470r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7215a(p pVar, Continuation<? super C7215a> continuation) {
                super(2, continuation);
                this.f240470r = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7215a(this.f240470r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C7215a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f240469q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f240469q = 1;
                    p pVar = this.f240470r;
                    Object objI = C43175k.i(new C43152f0(new C43197r1(new C34049d(pVar, null), new C34048c(C40482a.b(pVar.f241518c))), new C34099e(3, null)), this);
                    if (objI != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objI = G0.f406611a;
                    }
                    if (objI == coroutine_suspended) {
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

        /* compiled from: PublishDetailsDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$attach$1$1$2", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.screen.step.params.b$a$b, reason: collision with other inner class name */
        public static final class C7216b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f240471q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ p f240472r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7216b(p pVar, Continuation<? super C7216b> continuation) {
                super(2, continuation);
                this.f240472r = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7216b(this.f240472r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C7216b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f240471q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f240471q = 1;
                    p pVar = this.f240472r;
                    Object objI = C43175k.i(new C43152f0(new C43197r1(new C34106l(pVar, null), new C34105k(C40482a.b(pVar.f241518c))), new m(3, null)), this);
                    if (objI != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objI = G0.f406611a;
                    }
                    if (objI == coroutine_suspended) {
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

        /* compiled from: PublishDetailsDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$attach$1$1$3", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.screen.step.params.b$a$c */
        public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f240473q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ p f240474r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(p pVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f240474r = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f240474r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f240473q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f240473q = 1;
                    p pVar = this.f240474r;
                    Object objJ = C43175k.j(new C34103i(new C34102h(C40482a.b(pVar.f241518c))), new C34104j(pVar, null), this);
                    if (objJ != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objJ = G0.f406611a;
                    }
                    if (objJ == coroutine_suspended) {
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

        /* compiled from: PublishDetailsDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$attach$1$1$4", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.screen.step.params.b$a$d */
        public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f240475q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ p f240476r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(p pVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f240476r = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new d(this.f240476r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f240475q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f240475q = 1;
                    p pVar = this.f240476r;
                    Object objJ = C43175k.j(new n(C40482a.b(pVar.f241518c)), new o(pVar, null), this);
                    if (objJ != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objJ = G0.f406611a;
                    }
                    if (objJ == coroutine_suspended) {
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

        /* compiled from: PublishDetailsDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$attach$1$1$5", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.screen.step.params.b$a$e */
        public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f240477q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ p f240478r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(p pVar, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f240478r = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new e(this.f240478r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f240477q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f240477q = 1;
                    p pVar = this.f240478r;
                    Object objJ = C43175k.j(new C34100f(C40482a.b(pVar.f241518c)), new C34101g(pVar, null), this);
                    if (objJ != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objJ = G0.f406611a;
                    }
                    if (objJ == coroutine_suspended) {
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
        public a(p pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f240468r = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f240468r, continuation);
            aVar.f240467q = obj;
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
            T t12 = (T) this.f240467q;
            p pVar = this.f240468r;
            C43259k.d(t12, null, null, new C7215a(pVar, null), 3);
            C43259k.d(t12, null, null, new C7216b(pVar, null), 3);
            C43259k.d(t12, null, null, new c(pVar, null), 3);
            C43259k.d(t12, null, null, new d(pVar, null), 3);
            C43259k.d(t12, null, null, new e(pVar, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34047b(p pVar, Continuation<? super C34047b> continuation) {
        super(2, continuation);
        this.f240466r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C34047b(this.f240466r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C34047b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f240465q;
        if (i12 == 0) {
            C42729a0.b(obj);
            p pVar = this.f240466r;
            InterfaceC22983P viewLifecycleOwner = pVar.f241516a.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.f46681d;
            a aVar = new a(pVar, null);
            this.f240465q = 1;
            if (C23056p0.b(viewLifecycleOwner, state, aVar, this) == coroutine_suspended) {
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
