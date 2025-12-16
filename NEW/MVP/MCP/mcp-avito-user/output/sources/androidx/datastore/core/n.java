package androidx.datastore.core;

import androidx.datastore.core.o;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* compiled from: SimpleActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/n;", "T", "", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class n<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T f45423a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.p<T, Continuation<? super G0>, Object> f45424b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43108m f45425c = kotlinx.coroutines.channels.A.a(Integer.MAX_VALUE, null, null, 6);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicInteger f45426d = new AtomicInteger(0);

    /* compiled from: SimpleActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "ex", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Throwable, G0> f45427l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n<T> f45428m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.p<T, Throwable, G0> f45429n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Throwable, G0> lVar, n<T> nVar, Y41.p<? super T, ? super Throwable, G0> pVar) {
            super(1);
            this.f45427l = lVar;
            this.f45428m = nVar;
            this.f45429n = pVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            G0 g02;
            Throwable th3 = th2;
            ((o.d) this.f45427l).invoke(th3);
            n<T> nVar = this.f45428m;
            nVar.f45425c.h(th3);
            do {
                Object objC = kotlinx.coroutines.channels.B.c(nVar.f45425c.H());
                if (objC == null) {
                    g02 = null;
                } else {
                    ((o.e) this.f45429n).invoke(objC, th3);
                    g02 = G0.f406611a;
                }
            } while (g02 != null);
            return G0.f406611a;
        }
    }

    /* compiled from: SimpleActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {122, 122}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f45430q;

        /* renamed from: r, reason: collision with root package name */
        public int f45431r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n<T> f45432s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n<T> nVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f45432s = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f45432s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f45431r
                r2 = 2
                r3 = 1
                androidx.datastore.core.n<T> r4 = r6.f45432s
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.C42729a0.b(r7)
                goto L4f
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                java.lang.Object r1 = r6.f45430q
                Y41.p r1 = (Y41.p) r1
                kotlin.C42729a0.b(r7)
                goto L43
            L24:
                kotlin.C42729a0.b(r7)
                java.util.concurrent.atomic.AtomicInteger r7 = r4.f45426d
                int r7 = r7.get()
                if (r7 <= 0) goto L5a
            L2f:
                kotlinx.coroutines.T r7 = r4.f45423a
                kotlinx.coroutines.U.d(r7)
                Y41.p<T, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object> r1 = r4.f45424b
                r6.f45430q = r1
                r6.f45431r = r3
                kotlinx.coroutines.channels.m r7 = r4.f45425c
                java.lang.Object r7 = r7.M(r6)
                if (r7 != r0) goto L43
                return r0
            L43:
                r5 = 0
                r6.f45430q = r5
                r6.f45431r = r2
                java.lang.Object r7 = r1.invoke(r7, r6)
                if (r7 != r0) goto L4f
                return r0
            L4f:
                java.util.concurrent.atomic.AtomicInteger r7 = r4.f45426d
                int r7 = r7.decrementAndGet()
                if (r7 != 0) goto L2f
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L5a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@Y61.k T t12, @Y61.k Y41.l<? super Throwable, G0> lVar, @Y61.k Y41.p<? super T, ? super Throwable, G0> pVar, @Y61.k Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar2) {
        this.f45423a = t12;
        this.f45424b = pVar2;
        N0 n02 = (N0) t12.getF401596i().get(N0.f410716u2);
        if (n02 == null) {
            return;
        }
        n02.k(new a(lVar, this, pVar));
    }

    public final void a(T t12) throws Throwable {
        Object objW = this.f45425c.w(t12);
        if (objW instanceof B.a) {
            Throwable thB = kotlinx.coroutines.channels.B.b(objW);
            if (thB != null) {
                throw thB;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        B.b bVar = kotlinx.coroutines.channels.B.f410772b;
        if (objW instanceof B.c) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f45426d.getAndIncrement() == 0) {
            C43259k.d(this.f45423a, null, null, new b(this, null), 3);
        }
    }
}
