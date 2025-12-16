package androidx.view;

import L91.e;
import X41.i;
import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FlowLiveData.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@i
/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23071x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowLiveData.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 1, 2}, l = {107, 112, 113, 115}, m = "invokeSuspend", n = {"observer", "observer", "observer"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: androidx.lifecycle.x$a */
    public static final class a<T> extends SuspendLambda implements p<I0<? super T>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f46914q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f46915r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AbstractC22991Y<T> f46916s;

        /* compiled from: FlowLiveData.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.x$a$a, reason: collision with other inner class name */
        public static final class C1803a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ AbstractC22991Y<T> f46917q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ e f46918r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1803a(AbstractC22991Y abstractC22991Y, e eVar, Continuation continuation) {
                super(2, continuation);
                this.f46917q = abstractC22991Y;
                this.f46918r = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C1803a(this.f46917q, this.f46918r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C1803a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                this.f46917q.observeForever(this.f46918r);
                return G0.f406611a;
            }
        }

        /* compiled from: FlowLiveData.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.x$a$b */
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ AbstractC22991Y<T> f46919q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC23040h0<T> f46920r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC22991Y<T> abstractC22991Y, InterfaceC23040h0<T> interfaceC23040h0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f46919q = abstractC22991Y;
                this.f46920r = interfaceC23040h0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new b(this.f46919q, this.f46920r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                this.f46919q.observeForever(this.f46920r);
                return G0.f406611a;
            }
        }

        /* compiled from: FlowLiveData.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.x$a$c */
        public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ AbstractC22991Y<T> f46921q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC23040h0<T> f46922r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC22991Y<T> abstractC22991Y, InterfaceC23040h0<T> interfaceC23040h0, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f46921q = abstractC22991Y;
                this.f46922r = interfaceC23040h0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new c(this.f46921q, this.f46922r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                this.f46921q.removeObserver(this.f46922r);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC22991Y<T> abstractC22991Y, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f46916s = abstractC22991Y;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f46916s, continuation);
            aVar.f46915r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((a) create((I0) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.h0] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.h0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                r0 = 4
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r9.f46914q
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                androidx.lifecycle.Y<T> r7 = r9.f46916s
                if (r2 == 0) goto L42
                if (r2 == r5) goto L3a
                if (r2 == r4) goto L32
                if (r2 == r3) goto L28
                if (r2 == r0) goto L1f
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                java.lang.Object r0 = r9.f46915r
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.C42729a0.b(r10)
                goto Lae
            L28:
                java.lang.Object r2 = r9.f46915r
                androidx.lifecycle.h0 r2 = (androidx.view.InterfaceC23040h0) r2
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L30
                goto L89
            L30:
                r10 = move-exception
                goto L8f
            L32:
                java.lang.Object r2 = r9.f46915r
                androidx.lifecycle.h0 r2 = (androidx.view.InterfaceC23040h0) r2
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L30
                goto L7e
            L3a:
                java.lang.Object r2 = r9.f46915r
                androidx.lifecycle.h0 r2 = (androidx.view.InterfaceC23040h0) r2
                kotlin.C42729a0.b(r10)
                goto L66
            L42:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f46915r
                kotlinx.coroutines.channels.I0 r10 = (kotlinx.coroutines.channels.I0) r10
                L91.e r2 = new L91.e
                r2.<init>(r10, r0)
                kotlinx.coroutines.scheduling.c r10 = kotlinx.coroutines.C43262l0.f411945a
                kotlinx.coroutines.d1 r10 = kotlinx.coroutines.internal.K.f411877a
                kotlinx.coroutines.d1 r10 = r10.y()
                androidx.lifecycle.x$a$a r8 = new androidx.lifecycle.x$a$a
                r8.<init>(r7, r2, r6)
                r9.f46915r = r2
                r9.f46914q = r5
                java.lang.Object r10 = kotlinx.coroutines.C43259k.g(r10, r8, r9)
                if (r10 != r1) goto L66
                return r1
            L66:
                kotlinx.coroutines.scheduling.c r10 = kotlinx.coroutines.C43262l0.f411945a     // Catch: java.lang.Throwable -> L30
                kotlinx.coroutines.d1 r10 = kotlinx.coroutines.internal.K.f411877a     // Catch: java.lang.Throwable -> L30
                kotlinx.coroutines.d1 r10 = r10.y()     // Catch: java.lang.Throwable -> L30
                androidx.lifecycle.x$a$b r5 = new androidx.lifecycle.x$a$b     // Catch: java.lang.Throwable -> L30
                r5.<init>(r7, r2, r6)     // Catch: java.lang.Throwable -> L30
                r9.f46915r = r2     // Catch: java.lang.Throwable -> L30
                r9.f46914q = r4     // Catch: java.lang.Throwable -> L30
                java.lang.Object r10 = kotlinx.coroutines.C43259k.g(r10, r5, r9)     // Catch: java.lang.Throwable -> L30
                if (r10 != r1) goto L7e
                return r1
            L7e:
                r9.f46915r = r2     // Catch: java.lang.Throwable -> L30
                r9.f46914q = r3     // Catch: java.lang.Throwable -> L30
                java.lang.Object r10 = kotlinx.coroutines.C43131e0.a(r9)     // Catch: java.lang.Throwable -> L30
                if (r10 != r1) goto L89
                return r1
            L89:
                kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L30
                r10.<init>()     // Catch: java.lang.Throwable -> L30
                throw r10     // Catch: java.lang.Throwable -> L30
            L8f:
                kotlinx.coroutines.scheduling.c r3 = kotlinx.coroutines.C43262l0.f411945a
                kotlinx.coroutines.d1 r3 = kotlinx.coroutines.internal.K.f411877a
                kotlinx.coroutines.d1 r3 = r3.y()
                kotlinx.coroutines.f1 r4 = kotlinx.coroutines.C43135f1.f411090b
                kotlin.coroutines.CoroutineContext r3 = r3.plus(r4)
                androidx.lifecycle.x$a$c r4 = new androidx.lifecycle.x$a$c
                r4.<init>(r7, r2, r6)
                r9.f46915r = r10
                r9.f46914q = r0
                java.lang.Object r0 = kotlinx.coroutines.C43259k.g(r3, r4, r9)
                if (r0 != r1) goto Lad
                return r1
            Lad:
                r0 = r10
            Lae:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.view.C23071x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @k
    public static final <T> InterfaceC43160i<T> a(@k AbstractC22991Y<T> abstractC22991Y) {
        return C43175k.c(C43175k.d(new a(abstractC22991Y, null)), -1, 2);
    }
}
