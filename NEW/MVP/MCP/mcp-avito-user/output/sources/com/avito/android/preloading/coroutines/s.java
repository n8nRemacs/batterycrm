package com.avito.android.preloading.coroutines;

import com.avito.android.preloading.coroutines.AbstractC33302a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: PreloadingPromiseCoroutinesExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_preloading-promise"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s {

    /* JADX INFO: Add missing generic type declarations: [Response] */
    /* compiled from: PreloadingPromiseCoroutinesExt.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00010\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Request", "Response", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.preloading.coroutines.PreloadingPromiseCoroutinesExtKt$asFlow$2", f = "PreloadingPromiseCoroutinesExt.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<Response> extends SuspendLambda implements Y41.p<I0<? super Response>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f221841q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221842r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AbstractC33302a<Request, Response> f221843s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Request f221844t;

        /* compiled from: PreloadingPromiseCoroutinesExt.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Request", "Response", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.preloading.coroutines.s$a$a, reason: collision with other inner class name */
        public static final class C6713a extends N implements Y41.l<Response, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ I0<Response> f221845l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6713a(I0<? super Response> i02) {
                super(1);
                this.f221845l = i02;
            }

            @Override // Y41.l
            public final G0 invoke(Object obj) {
                this.f221845l.w(obj);
                return G0.f406611a;
            }
        }

        /* compiled from: PreloadingPromiseCoroutinesExt.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Request", "Response", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.l<Throwable, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ I0<Response> f221846l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(I0<? super Response> i02) {
                super(1);
                this.f221846l = i02;
            }

            @Override // Y41.l
            public final G0 invoke(Throwable th2) {
                this.f221846l.h(th2);
                return G0.f406611a;
            }
        }

        /* compiled from: PreloadingPromiseCoroutinesExt.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Request", "Response", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class c extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ I0<Response> f221847l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(I0<? super Response> i02) {
                super(0);
                this.f221847l = i02;
            }

            @Override // Y41.a
            public final G0 invoke() {
                this.f221847l.h(null);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC33302a<Request, Response> abstractC33302a, Request request, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f221843s = abstractC33302a;
            this.f221844t = request;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f221843s, this.f221844t, continuation);
            aVar.f221842r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((a) create((I0) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object obj2;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f221841q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i02 = (I0) this.f221842r;
                C6713a c6713a = new C6713a(i02);
                b bVar = new b(i02);
                c cVar = new c(i02);
                AbstractC33302a<Request, Response> abstractC33302a = this.f221843s;
                synchronized (abstractC33302a.f221804f) {
                    obj2 = abstractC33302a.f221803e;
                }
                boolean zF2 = L.f(obj2, AbstractC33302a.b.C6711a.f221805a);
                Request request = this.f221844t;
                if (zF2) {
                    abstractC33302a.a(request);
                }
                synchronized (abstractC33302a.f221804f) {
                    obj3 = abstractC33302a.f221803e;
                }
                AbstractC33302a.b.C6712b c6712b = obj3 instanceof AbstractC33302a.b.C6712b ? (AbstractC33302a.b.C6712b) obj3 : null;
                boolean z12 = false;
                if (c6712b != null && !c6712b.f221809d) {
                    z12 = true;
                }
                B.f221784a.getClass();
                abstractC33302a.f221802d.a(z12, y.f221849l, C33306e.f221816l);
                abstractC33302a.f221802d.a(request.equals(c6712b != null ? c6712b.f221806a : null), z.f221850l, C33307f.f221817l);
                if (!request.equals(c6712b != null ? c6712b.f221806a : null) || c6712b.f221809d) {
                    Q0.a().c(null);
                } else {
                    abstractC33302a.b(new h(c6712b, C43175k.K(new C43197r1(new k(2, c6713a, L.a.class, "suspendConversion3", "waitResultOrLoad$suspendConversion3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new X(new C43152f0(C43175k.Z(c6712b.f221807b, new D(3, null)), new i(bVar, null)), new j(abstractC33302a, cVar, null))), abstractC33302a.f221800b)), C33308g.f221818l);
                    c6712b.f221808c.c(null);
                }
                this.f221841q = 1;
                if (F0.a(i02, kotlinx.coroutines.channels.G0.f410795l, this) == coroutine_suspended) {
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

    @Y61.k
    public static final <Request, Response> InterfaceC43160i<Response> a(@Y61.k AbstractC33302a<Request, Response> abstractC33302a, @Y61.k Request request) {
        return C43175k.d(new a(abstractC33302a, request, null));
    }
}
