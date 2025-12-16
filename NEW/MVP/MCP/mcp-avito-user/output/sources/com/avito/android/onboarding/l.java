package com.avito.android.onboarding;

import com.avito.android.onboarding.model.BxOnboardingStep;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: BxOnboardingChainFetcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/l;", "Lcom/avito/android/onboarding/k;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements InterfaceC32927k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43238h f209098a;

    /* compiled from: BxOnboardingChainFetcher.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainFetcherImpl$fetchAsync$1", f = "BxOnboardingChainFetcher.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<I0<? super BxOnboardingStep>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209099q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f209100r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Iterable<E> f209101s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l f209102t;

        /* compiled from: BxOnboardingChainFetcher.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainFetcherImpl$fetchAsync$1$1$1", f = "BxOnboardingChainFetcher.kt", i = {}, l = {72, 74}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.onboarding.l$a$a, reason: collision with other inner class name */
        public static final class C6237a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f209103q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f209104r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ E f209105s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ I0<BxOnboardingStep> f209106t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6237a(E e12, I0<? super BxOnboardingStep> i02, Continuation<? super C6237a> continuation) {
                super(2, continuation);
                this.f209105s = e12;
                this.f209106t = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C6237a c6237a = new C6237a(this.f209105s, this.f209106t, continuation);
                c6237a.f209104r = obj;
                return c6237a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C6237a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object bVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f209103q;
                try {
                } catch (Throwable th2) {
                    int i13 = Z.f406624c;
                    bVar = new Z.b(th2);
                }
                if (i12 == 0) {
                    C42729a0.b(obj);
                    E e12 = this.f209105s;
                    int i14 = Z.f406624c;
                    this.f209103q = 1;
                    obj = e12.b(this);
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
                    C42729a0.b(obj);
                }
                bVar = (BxOnboardingStep) obj;
                int i15 = Z.f406624c;
                if (bVar instanceof Z.b) {
                    bVar = null;
                }
                BxOnboardingStep bxOnboardingStep = (BxOnboardingStep) bVar;
                if (bxOnboardingStep != null) {
                    this.f209103q = 2;
                    if (this.f209106t.send(bxOnboardingStep, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Iterable<? extends E> iterable, l lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f209101s = iterable;
            this.f209102t = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f209101s, this.f209102t, continuation);
            aVar.f209100r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super BxOnboardingStep> i02, Continuation<? super G0> continuation) {
            return ((a) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209099q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i02 = (I0) this.f209100r;
                Iterable<E> iterable = this.f209101s;
                ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
                Iterator<E> it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(C43259k.d(this.f209102t.f209098a, null, null, new C6237a(it.next(), i02, null), 3));
                }
                this.f209099q = 1;
                if (C43225h.c(arrayList, this) == coroutine_suspended) {
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

    /* compiled from: BxOnboardingChainFetcher.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainFetcherImpl$fetchAwait$1", f = "BxOnboardingChainFetcher.kt", i = {0, 1}, l = {61, 63}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxOnboardingStep>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Iterator f209107q;

        /* renamed from: r, reason: collision with root package name */
        public int f209108r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f209109s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Iterable<E> f209110t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l f209111u;

        /* compiled from: BxOnboardingChainFetcher.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/onboarding/model/BxOnboardingStep;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainFetcherImpl$fetchAwait$1$1$1", f = "BxOnboardingChainFetcher.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super BxOnboardingStep>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f209112q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ E f209113r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(E e12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f209113r = e12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f209113r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super BxOnboardingStep> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f209112q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f209112q = 1;
                    obj = this.f209113r.b(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Iterable<? extends E> iterable, l lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f209110t = iterable;
            this.f209111u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f209110t, this.f209111u, continuation);
            bVar.f209109s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxOnboardingStep> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0098 -> B:19:0x0068). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:19:0x0068). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f209108r
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                java.util.Iterator r1 = r9.f209107q
                java.lang.Object r5 = r9.f209109s
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
                kotlin.C42729a0.b(r10)
                goto L68
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.util.Iterator r1 = r9.f209107q
                java.lang.Object r5 = r9.f209109s
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L2b
                goto L83
            L2b:
                r10 = move-exception
                goto L88
            L2d:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f209109s
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                java.util.ArrayList r1 = new java.util.ArrayList
                java.lang.Iterable<com.avito.android.onboarding.E> r5 = r9.f209110t
                r6 = 10
                int r6 = kotlin.collections.C42745f0.q(r5, r6)
                r1.<init>(r6)
                java.util.Iterator r5 = r5.iterator()
            L45:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L63
                java.lang.Object r6 = r5.next()
                com.avito.android.onboarding.E r6 = (com.avito.android.onboarding.E) r6
                com.avito.android.onboarding.l r7 = r9.f209111u
                kotlinx.coroutines.internal.h r7 = r7.f209098a
                com.avito.android.onboarding.l$b$a r8 = new com.avito.android.onboarding.l$b$a
                r8.<init>(r6, r2)
                r6 = 3
                kotlinx.coroutines.a0 r6 = kotlinx.coroutines.C43259k.b(r7, r2, r8, r6)
                r1.add(r6)
                goto L45
            L63:
                java.util.Iterator r1 = r1.iterator()
                r5 = r10
            L68:
                boolean r10 = r1.hasNext()
                if (r10 == 0) goto La7
                java.lang.Object r10 = r1.next()
                kotlinx.coroutines.a0 r10 = (kotlinx.coroutines.InterfaceC43076a0) r10
                int r6 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L2b
                r9.f209109s = r5     // Catch: java.lang.Throwable -> L2b
                r9.f209107q = r1     // Catch: java.lang.Throwable -> L2b
                r9.f209108r = r4     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r10 = r10.F(r9)     // Catch: java.lang.Throwable -> L2b
                if (r10 != r0) goto L83
                return r0
            L83:
                com.avito.android.onboarding.model.BxOnboardingStep r10 = (com.avito.android.onboarding.model.BxOnboardingStep) r10     // Catch: java.lang.Throwable -> L2b
                int r6 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L2b
                goto L90
            L88:
                int r6 = kotlin.Z.f406624c
                kotlin.Z$b r6 = new kotlin.Z$b
                r6.<init>(r10)
                r10 = r6
            L90:
                boolean r6 = r10 instanceof kotlin.Z.b
                if (r6 == 0) goto L96
                r10 = r2
            L96:
                com.avito.android.onboarding.model.BxOnboardingStep r10 = (com.avito.android.onboarding.model.BxOnboardingStep) r10
                if (r10 == 0) goto L68
                r9.f209109s = r5
                r9.f209107q = r1
                r9.f209108r = r3
                java.lang.Object r10 = r5.emit(r10, r9)
                if (r10 != r0) goto L68
                return r0
            La7:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public l(@Y61.k R0 r02) {
        this.f209098a = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.a()));
    }

    @Override // com.avito.android.onboarding.InterfaceC32927k
    @Y61.k
    public final InterfaceC43160i<BxOnboardingStep> a(@Y61.k Iterable<? extends E> iterable) {
        return C43175k.G(new b(iterable, this, null));
    }

    @Override // com.avito.android.onboarding.InterfaceC32927k
    @Y61.k
    public final InterfaceC43160i<BxOnboardingStep> b(@Y61.k Iterable<? extends E> iterable) {
        return C43175k.h(new a(iterable, this, null));
    }
}
