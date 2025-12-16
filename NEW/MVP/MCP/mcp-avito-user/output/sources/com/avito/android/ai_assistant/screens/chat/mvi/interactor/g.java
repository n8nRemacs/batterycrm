package com.avito.android.ai_assistant.screens.chat.mvi.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.R0;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: TimeoutFallbackInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/interactor/g;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/interactor/f;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43238h f89386a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public N0 f89387b;

    /* compiled from: TimeoutFallbackInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.TimeoutFallbackInteractorImpl$timeoutFallback$1", f = "TimeoutFallbackInteractor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<I0<? super G0>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89388q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f89389r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f89391t;

        /* compiled from: TimeoutFallbackInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.TimeoutFallbackInteractorImpl$timeoutFallback$1$1", f = "TimeoutFallbackInteractor.kt", i = {}, l = {33, 34}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.interactor.g$a$a, reason: collision with other inner class name */
        public static final class C2654a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f89392q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ long f89393r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ I0<G0> f89394s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2654a(long j12, I0<? super G0> i02, Continuation<? super C2654a> continuation) {
                super(2, continuation);
                this.f89393r = j12;
                this.f89394s = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C2654a(this.f89393r, this.f89394s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C2654a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f89392q;
                I0<G0> i02 = this.f89394s;
                try {
                } catch (CancellationException e12) {
                    i02.h(e12);
                }
                if (i12 == 0) {
                    C42729a0.b(obj);
                    long j12 = this.f89393r;
                    this.f89392q = 1;
                    if (C43131e0.c(j12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        i02.h(null);
                        return G0.f406611a;
                    }
                    C42729a0.b(obj);
                }
                G0 g02 = G0.f406611a;
                this.f89392q = 2;
                if (i02.send(g02, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i02.h(null);
                return G0.f406611a;
            }
        }

        /* compiled from: TimeoutFallbackInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ I0<G0> f89395l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ g f89396m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(I0<? super G0> i02, g gVar) {
                super(0);
                this.f89395l = i02;
                this.f89396m = gVar;
            }

            @Override // Y41.a
            public final G0 invoke() {
                this.f89395l.r().h(null);
                N0 n02 = this.f89396m.f89387b;
                if (n02 != null) {
                    ((V0) n02).c(null);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f89391t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = g.this.new a(this.f89391t, continuation);
            aVar.f89389r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super G0> i02, Continuation<? super G0> continuation) {
            return ((a) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f89388q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i02 = (I0) this.f89389r;
                g gVar = g.this;
                N0 n02 = gVar.f89387b;
                if (n02 != null) {
                    ((V0) n02).c(null);
                }
                gVar.f89387b = C43259k.d(gVar.f89386a, null, null, new C2654a(this.f89391t, i02, null), 3);
                b bVar = new b(i02, gVar);
                this.f89388q = 1;
                if (F0.a(i02, bVar, this) == coroutine_suspended) {
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
    public g(@k R0 r02) {
        this.f89386a = U.a(r02.a());
    }

    @Override // com.avito.android.ai_assistant.screens.chat.mvi.interactor.f
    @k
    public final InterfaceC43160i<G0> a(long j12) {
        e.a aVar = kotlin.time.e.f410651c;
        return C43175k.h(new a(kotlin.time.g.h(j12, DurationUnit.f410634f), null));
    }

    @Override // com.avito.android.ai_assistant.screens.chat.mvi.interactor.f
    public final void b() {
        N0 n02 = this.f89387b;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
    }
}
