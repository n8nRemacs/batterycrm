package androidx.datastore.core;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.InterfaceC43314z;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43194q0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.t1;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/datastore/core/o;", "T", "Landroidx/datastore/core/h;", "a", "b", "c", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class o<T> implements androidx.datastore.core.h<T> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final a f45433k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @j.B
    @Y61.k
    public static final LinkedHashSet f45434l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final Object f45435m = new Object();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<File> f45436a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m<T> f45437b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22875a<T> f45438c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T f45439d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<T> f45440e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f45441f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f45442g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Z1<A<T>> f45443h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public List<? extends Y41.p<? super k<T>, ? super Continuation<? super G0>, ? extends Object>> f45444i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final n<b<T>> f45445j;

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/o$a;", "", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Landroidx/datastore/core/o$b;", "T", "", "<init>", "()V", "a", "b", "Landroidx/datastore/core/o$b$a;", "Landroidx/datastore/core/o$b$b;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class b<T> {

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/o$b$a;", "T", "Landroidx/datastore/core/o$b;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a<T> extends b<T> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final A<T> f45446a;

            public a(@Y61.l A<T> a12) {
                super(null);
                this.f45446a = a12;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/o$b$b;", "T", "Landroidx/datastore/core/o$b;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.datastore.core.o$b$b, reason: collision with other inner class name */
        public static final class C1773b<T> extends b<T> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final SuspendLambda f45447a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final InterfaceC43314z<T> f45448b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final A<T> f45449c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final CoroutineContext f45450d;

            /* JADX WARN: Multi-variable type inference failed */
            public C1773b(@Y61.k Y41.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, @Y61.k InterfaceC43314z<T> interfaceC43314z, @Y61.l A<T> a12, @Y61.k CoroutineContext coroutineContext) {
                super(null);
                this.f45447a = (SuspendLambda) pVar;
                this.f45448b = interfaceC43314z;
                this.f45449c = a12;
                this.f45450d = coroutineContext;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/o$c;", "Ljava/io/OutputStream;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends OutputStream {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final FileOutputStream f45451b;

        public c(@Y61.k FileOutputStream fileOutputStream) {
            this.f45451b = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f45451b.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i12) throws IOException {
            this.f45451b.write(i12);
        }

        @Override // java.io.OutputStream
        public final void write(@Y61.k byte[] bArr) throws IOException {
            this.f45451b.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(@Y61.k byte[] bArr, int i12, int i13) throws IOException {
            this.f45451b.write(bArr, i12, i13);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    public static final class d extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o<T> f45452l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o<T> oVar) {
            super(1);
            this.f45452l = oVar;
        }

        /* JADX WARN: Failed to analyze thrown exceptions
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:118)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
         */
        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            if (th3 != null) {
                this.f45452l.f45443h.setValue(new j(th3));
            }
            o.f45433k.getClass();
            Object obj = o.f45435m;
            o<T> oVar = this.f45452l;
            synchronized (obj) {
                o.f45434l.remove(oVar.c().getAbsolutePath());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroidx/datastore/core/o$b;", "msg", "", "ex", "Lkotlin/G0;", "<anonymous>", "(Landroidx/datastore/core/o$b;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    public static final class e extends N implements Y41.p<b<T>, Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f45453l = new e();

        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Object obj, Throwable th2) {
            b bVar = (b) obj;
            Throwable cancellationException = th2;
            if (bVar instanceof b.C1773b) {
                b.C1773b c1773b = (b.C1773b) bVar;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                c1773b.f45448b.b(cancellationException);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/datastore/core/o$b;", "msg", "Lkotlin/G0;", "<anonymous>", "(Landroidx/datastore/core/o$b;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", i = {}, l = {239, 242}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<b<T>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f45454q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f45455r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ o<T> f45456s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o<T> oVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f45456s = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f45456s, continuation);
            fVar.f45455r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((f) create((b) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f45454q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.C42729a0.b(r6)
                goto L86
            L1c:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f45455r
                androidx.datastore.core.o$b r6 = (androidx.datastore.core.o.b) r6
                boolean r1 = r6 instanceof androidx.datastore.core.o.b.a
                androidx.datastore.core.o<T> r4 = r5.f45456s
                if (r1 == 0) goto L77
                androidx.datastore.core.o$b$a r6 = (androidx.datastore.core.o.b.a) r6
                r5.f45454q = r3
                kotlinx.coroutines.flow.Z1<androidx.datastore.core.A<T>> r1 = r4.f45443h
                java.lang.Object r1 = r1.getValue()
                androidx.datastore.core.A r1 = (androidx.datastore.core.A) r1
                boolean r2 = r1 instanceof androidx.datastore.core.C22876b
                if (r2 == 0) goto L3a
                goto L6a
            L3a:
                boolean r2 = r1 instanceof androidx.datastore.core.l
                if (r2 == 0) goto L50
                androidx.datastore.core.A<T> r6 = r6.f45446a
                if (r1 != r6) goto L6a
                java.lang.Object r6 = r4.f(r5)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r6 != r1) goto L4d
                goto L6c
            L4d:
                kotlin.G0 r6 = kotlin.G0.f406611a
                goto L6c
            L50:
                androidx.datastore.core.B r6 = androidx.datastore.core.B.f45399a
                boolean r6 = kotlin.jvm.internal.L.f(r1, r6)
                if (r6 == 0) goto L66
                java.lang.Object r6 = r4.f(r5)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r6 != r1) goto L63
                goto L6c
            L63:
                kotlin.G0 r6 = kotlin.G0.f406611a
                goto L6c
            L66:
                boolean r6 = r1 instanceof androidx.datastore.core.j
                if (r6 != 0) goto L6f
            L6a:
                kotlin.G0 r6 = kotlin.G0.f406611a
            L6c:
                if (r6 != r0) goto L86
                return r0
            L6f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Can't read in final state."
                r6.<init>(r0)
                throw r6
            L77:
                boolean r1 = r6 instanceof androidx.datastore.core.o.b.C1773b
                if (r1 == 0) goto L86
                androidx.datastore.core.o$b$b r6 = (androidx.datastore.core.o.b.C1773b) r6
                r5.f45454q = r2
                java.lang.Object r6 = androidx.datastore.core.o.b(r4, r6, r5)
                if (r6 != r0) goto L86
                return r0
            L86:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super T>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f45457q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f45458r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ o<T> f45459s;

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/datastore/core/A;", "it", "", "<anonymous>", "(Landroidx/datastore/core/A;)Z"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<A<T>, Continuation<? super Boolean>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f45460q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ A<T> f45461r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(A<T> a12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f45461r = a12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f45461r, continuation);
                aVar.f45460q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
                return ((a) create((A) obj, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                A<T> a12 = (A) this.f45460q;
                A<T> a13 = this.f45461r;
                boolean z12 = false;
                if (!(a13 instanceof C22876b) && !(a13 instanceof j) && a12 == a13) {
                    z12 = true;
                }
                return Boxing.boxBoolean(z12);
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b implements InterfaceC43160i<T> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C43194q0 f45462b;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "kotlinx/coroutines/flow/p1$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class a implements InterfaceC43172j<A<T>> {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f45463b;

                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.datastore.core.o$g$b$a$a, reason: collision with other inner class name */
                public static final class C1774a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f45464q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f45465r;

                    public C1774a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f45464q = obj;
                        this.f45465r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f45463b = interfaceC43172j;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.datastore.core.o.g.b.a.C1774a
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.datastore.core.o$g$b$a$a r0 = (androidx.datastore.core.o.g.b.a.C1774a) r0
                        int r1 = r0.f45465r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f45465r = r1
                        goto L18
                    L13:
                        androidx.datastore.core.o$g$b$a$a r0 = new androidx.datastore.core.o$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f45464q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f45465r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        androidx.datastore.core.A r5 = (androidx.datastore.core.A) r5
                        boolean r6 = r5 instanceof androidx.datastore.core.l
                        if (r6 != 0) goto L6b
                        boolean r6 = r5 instanceof androidx.datastore.core.j
                        if (r6 != 0) goto L66
                        boolean r6 = r5 instanceof androidx.datastore.core.C22876b
                        if (r6 == 0) goto L54
                        androidx.datastore.core.b r5 = (androidx.datastore.core.C22876b) r5
                        T r5 = r5.f45400a
                        r0.f45465r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f45463b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L51
                        return r1
                    L51:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    L54:
                        boolean r5 = r5 instanceof androidx.datastore.core.B
                        if (r5 == 0) goto L60
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L60:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L66:
                        androidx.datastore.core.j r5 = (androidx.datastore.core.j) r5
                        java.lang.Throwable r5 = r5.f45421a
                        throw r5
                    L6b:
                        androidx.datastore.core.l r5 = (androidx.datastore.core.l) r5
                        java.lang.Throwable r5 = r5.f45422a
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o.g.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(C43194q0 c43194q0) {
                this.f45462b = c43194q0;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f45462b.collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o<T> oVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f45459s = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f45459s, continuation);
            gVar.f45458r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((g) create((InterfaceC43172j) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f45457q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f45458r;
                o<T> oVar = this.f45459s;
                A<T> value = oVar.f45443h.getValue();
                if (!(value instanceof C22876b)) {
                    oVar.f45445j.a(new b.a(value));
                }
                b bVar = new b(new C43194q0(new a(value, null), oVar.f45443h));
                this.f45457q = 1;
                if (C43175k.u(this, bVar, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "T"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class h extends N implements Y41.a<File> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o<T> f45467l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(o<T> oVar) {
            super(0);
            this.f45467l = oVar;
        }

        @Override // Y41.a
        public final File invoke() {
            File fileInvoke = this.f45467l.f45436a.invoke();
            String absolutePath = fileInvoke.getAbsolutePath();
            o.f45433k.getClass();
            synchronized (o.f45435m) {
                LinkedHashSet linkedHashSet = o.f45434l;
                if (linkedHashSet.contains(absolutePath)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + fileInvoke + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                linkedHashSet.add(absolutePath);
            }
            return fileInvoke;
        }
    }

    public o(Y41.a aVar, m mVar, List list, InterfaceC22875a interfaceC22875a, T t12, int i12, C42822w c42822w) {
        this(aVar, mVar, (i12 & 4) != 0 ? C42784z0.f406748b : list, (i12 & 8) != 0 ? new W0.a() : interfaceC22875a, (i12 & 16) != 0 ? U.a(C43262l0.f411947c.plus(t1.b())) : t12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r2v8, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    /* JADX WARN: Type inference failed for: r2v9, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.datastore.core.o] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.z] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.datastore.core.o r8, androidx.datastore.core.o.b.C1773b r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o.b(androidx.datastore.core.o, androidx.datastore.core.o$b$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.h
    @Y61.l
    public final Object a(@Y61.k Y41.p pVar, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        InterfaceC43314z interfaceC43314zA = kotlinx.coroutines.B.a();
        this.f45445j.a(new b.C1773b(pVar, interfaceC43314zA, this.f45443h.getValue(), continuationImpl.getF411447c()));
        return interfaceC43314zA.F(continuationImpl);
    }

    public final File c() {
        return (File) this.f45442g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.t
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.t r0 = (androidx.datastore.core.t) r0
            int r1 = r0.f45498t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45498t = r1
            goto L18
        L13:
            androidx.datastore.core.t r0 = new androidx.datastore.core.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f45496r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45498t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            androidx.datastore.core.o r0 = r0.f45495q
            kotlin.C42729a0.b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L43
        L2b:
            r5 = move-exception
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            r0.f45495q = r4     // Catch: java.lang.Throwable -> L48
            r0.f45498t = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L46:
            r0 = r4
            goto L4a
        L48:
            r5 = move-exception
            goto L46
        L4a:
            kotlinx.coroutines.flow.Z1<androidx.datastore.core.A<T>> r0 = r0.f45443h
            androidx.datastore.core.l r1 = new androidx.datastore.core.l
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.u
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.u r0 = (androidx.datastore.core.u) r0
            int r1 = r0.f45502t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45502t = r1
            goto L18
        L13:
            androidx.datastore.core.u r0 = new androidx.datastore.core.u
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f45500r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45502t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            androidx.datastore.core.o r0 = r0.f45499q
            kotlin.C42729a0.b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L51
        L2b:
            r5 = move-exception
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            r0.f45499q = r4     // Catch: java.lang.Throwable -> L45
            r0.f45502t = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L43:
            r0 = r4
            goto L47
        L45:
            r5 = move-exception
            goto L43
        L47:
            kotlinx.coroutines.flow.Z1<androidx.datastore.core.A<T>> r0 = r0.f45443h
            androidx.datastore.core.l r1 = new androidx.datastore.core.l
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.o] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.v] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.o] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.io.FileNotFoundException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.v
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.v r0 = (androidx.datastore.core.v) r0
            int r1 = r0.f45507u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45507u = r1
            goto L18
        L13:
            androidx.datastore.core.v r0 = new androidx.datastore.core.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f45505s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45507u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.io.FileInputStream r1 = r0.f45504r
            androidx.datastore.core.o r0 = r0.f45503q
            kotlin.C42729a0.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L55
        L2d:
            r5 = move-exception
            goto L62
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.C42729a0.b(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L68
            java.io.File r2 = r4.c()     // Catch: java.io.FileNotFoundException -> L68
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L68
            androidx.datastore.core.m<T> r2 = r4.f45437b     // Catch: java.lang.Throwable -> L60
            r0.f45503q = r4     // Catch: java.lang.Throwable -> L60
            r0.f45504r = r5     // Catch: java.lang.Throwable -> L60
            r0.f45507u = r3     // Catch: java.lang.Throwable -> L60
            androidx.datastore.preferences.core.a r0 = r2.b(r5)     // Catch: java.lang.Throwable -> L60
            if (r0 != r1) goto L52
            return r1
        L52:
            r1 = r5
            r5 = r0
            r0 = r4
        L55:
            r2 = 0
            kotlin.io.c.a(r1, r2)     // Catch: java.io.FileNotFoundException -> L5a
            return r5
        L5a:
            r5 = move-exception
            goto L6a
        L5c:
            r1 = r5
            r5 = r0
            r0 = r4
            goto L62
        L60:
            r0 = move-exception
            goto L5c
        L62:
            throw r5     // Catch: java.lang.Throwable -> L63
        L63:
            r2 = move-exception
            kotlin.io.c.a(r1, r5)     // Catch: java.io.FileNotFoundException -> L5a
            throw r2     // Catch: java.io.FileNotFoundException -> L5a
        L68:
            r5 = move-exception
            r0 = r4
        L6a:
            java.io.File r1 = r0.c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L7b
            androidx.datastore.core.m<T> r5 = r0.f45437b
            androidx.datastore.preferences.core.a r5 = r5.getDefaultValue()
            return r5
        L7b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o.g(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.h
    @Y61.k
    public final InterfaceC43160i<T> getData() {
        return this.f45440e;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws androidx.datastore.core.CorruptionException, java.io.FileNotFoundException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.w
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.w r0 = (androidx.datastore.core.w) r0
            int r1 = r0.f45512u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45512u = r1
            goto L18
        L13:
            androidx.datastore.core.w r0 = new androidx.datastore.core.w
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f45510s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45512u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f45509r
            java.lang.Object r0 = r0.f45508q
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            kotlin.C42729a0.b(r8)     // Catch: java.io.IOException -> L35
            goto L89
        L35:
            r8 = move-exception
            goto L8e
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f45509r
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f45508q
            androidx.datastore.core.o r4 = (androidx.datastore.core.o) r4
            kotlin.C42729a0.b(r8)
            goto L7b
        L4b:
            java.lang.Object r2 = r0.f45508q
            androidx.datastore.core.o r2 = (androidx.datastore.core.o) r2
            kotlin.C42729a0.b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L68
        L55:
            kotlin.C42729a0.b(r8)
            r0.f45508q = r7     // Catch: androidx.datastore.core.CorruptionException -> L66
            r0.f45512u = r5     // Catch: androidx.datastore.core.CorruptionException -> L66
            java.lang.Object r8 = r7.g(r0)     // Catch: androidx.datastore.core.CorruptionException -> L66
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r2 = r7
            goto L68
        L66:
            r8 = move-exception
            goto L64
        L68:
            androidx.datastore.core.a<T> r5 = r2.f45438c
            r0.f45508q = r2
            r0.f45509r = r8
            r0.f45512u = r4
            java.lang.Object r4 = r5.a(r8)
            if (r4 != r1) goto L77
            return r1
        L77:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L7b:
            r0.f45508q = r2     // Catch: java.io.IOException -> L8c
            r0.f45509r = r8     // Catch: java.io.IOException -> L8c
            r0.f45512u = r3     // Catch: java.io.IOException -> L8c
            java.lang.Object r0 = r4.j(r8, r0)     // Catch: java.io.IOException -> L8c
            if (r0 != r1) goto L88
            return r1
        L88:
            r1 = r8
        L89:
            return r1
        L8a:
            r0 = r2
            goto L8e
        L8c:
            r8 = move-exception
            goto L8a
        L8e:
            kotlin.C42833p.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(Y41.p r10, kotlin.coroutines.CoroutineContext r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.x
            if (r0 == 0) goto L13
            r0 = r12
            androidx.datastore.core.x r0 = (androidx.datastore.core.x) r0
            int r1 = r0.f45518v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45518v = r1
            goto L18
        L13:
            androidx.datastore.core.x r0 = new androidx.datastore.core.x
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f45516t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45518v
            java.lang.String r3 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r4 = 0
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L49
            if (r2 == r7) goto L3d
            if (r2 != r6) goto L35
            java.lang.Object r10 = r0.f45514r
            androidx.datastore.core.o r11 = r0.f45513q
            kotlin.C42729a0.b(r12)
            goto La2
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            java.lang.Object r10 = r0.f45515s
            java.lang.Object r11 = r0.f45514r
            androidx.datastore.core.b r11 = (androidx.datastore.core.C22876b) r11
            androidx.datastore.core.o r2 = r0.f45513q
            kotlin.C42729a0.b(r12)
            goto L7c
        L49:
            kotlin.C42729a0.b(r12)
            kotlinx.coroutines.flow.Z1<androidx.datastore.core.A<T>> r12 = r9.f45443h
            java.lang.Object r12 = r12.getValue()
            androidx.datastore.core.b r12 = (androidx.datastore.core.C22876b) r12
            T r2 = r12.f45400a
            if (r2 == 0) goto L5d
            int r2 = r2.hashCode()
            goto L5e
        L5d:
            r2 = r4
        L5e:
            int r8 = r12.f45401b
            if (r2 != r8) goto Lb9
            androidx.datastore.core.y r2 = new androidx.datastore.core.y
            T r8 = r12.f45400a
            r2.<init>(r10, r8, r5)
            r0.f45513q = r9
            r0.f45514r = r12
            r0.f45515s = r8
            r0.f45518v = r7
            java.lang.Object r10 = kotlinx.coroutines.C43259k.g(r11, r2, r0)
            if (r10 != r1) goto L78
            return r1
        L78:
            r2 = r9
            r11 = r12
            r12 = r10
            r10 = r8
        L7c:
            T r7 = r11.f45400a
            if (r7 == 0) goto L85
            int r7 = r7.hashCode()
            goto L86
        L85:
            r7 = r4
        L86:
            int r11 = r11.f45401b
            if (r7 != r11) goto Lb3
            boolean r11 = kotlin.jvm.internal.L.f(r10, r12)
            if (r11 == 0) goto L91
            goto Lb2
        L91:
            r0.f45513q = r2
            r0.f45514r = r12
            r0.f45515s = r5
            r0.f45518v = r6
            java.lang.Object r10 = r2.j(r12, r0)
            if (r10 != r1) goto La0
            return r1
        La0:
            r10 = r12
            r11 = r2
        La2:
            kotlinx.coroutines.flow.Z1<androidx.datastore.core.A<T>> r11 = r11.f45443h
            androidx.datastore.core.b r12 = new androidx.datastore.core.b
            if (r10 == 0) goto Lac
            int r4 = r10.hashCode()
        Lac:
            r12.<init>(r10, r4)
            r11.setValue(r12)
        Lb2:
            return r10
        Lb3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        Lb9:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o.i(Y41.p, kotlin.coroutines.CoroutineContext, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r9 instanceof androidx.datastore.core.z
            if (r1 == 0) goto L15
            r1 = r9
            androidx.datastore.core.z r1 = (androidx.datastore.core.z) r1
            int r2 = r1.f45528w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f45528w = r2
            goto L1a
        L15:
            androidx.datastore.core.z r1 = new androidx.datastore.core.z
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f45526u
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.f45528w
            r4 = 1
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L36
            java.io.FileOutputStream r8 = r1.f45525t
            java.io.FileOutputStream r2 = r1.f45524s
            java.io.File r3 = r1.f45523r
            androidx.datastore.core.o r1 = r1.f45522q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L33
            goto L8c
        L33:
            r8 = move-exception
            goto Lc1
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.C42729a0.b(r9)
            java.io.File r9 = r7.c()
            java.io.File r3 = r9.getCanonicalFile()
            java.io.File r3 = r3.getParentFile()
            if (r3 != 0) goto L50
            goto L59
        L50:
            r3.mkdirs()
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto Ld1
        L59:
            java.io.File r3 = new java.io.File
            java.io.File r9 = r7.c()
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.String r5 = r7.f45441f
            java.lang.String r9 = kotlin.jvm.internal.L.j(r5, r9)
            r3.<init>(r9)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lbd
            r9.<init>(r3)     // Catch: java.io.IOException -> Lbd
            androidx.datastore.core.m<T> r5 = r7.f45437b     // Catch: java.lang.Throwable -> Lbf
            androidx.datastore.core.o$c r6 = new androidx.datastore.core.o$c     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r9)     // Catch: java.lang.Throwable -> Lbf
            r1.f45522q = r7     // Catch: java.lang.Throwable -> Lbf
            r1.f45523r = r3     // Catch: java.lang.Throwable -> Lbf
            r1.f45524s = r9     // Catch: java.lang.Throwable -> Lbf
            r1.f45525t = r9     // Catch: java.lang.Throwable -> Lbf
            r1.f45528w = r4     // Catch: java.lang.Throwable -> Lbf
            kotlin.G0 r8 = r5.a(r8, r6)     // Catch: java.lang.Throwable -> Lbf
            if (r8 != r2) goto L89
            return r2
        L89:
            r1 = r7
            r8 = r9
            r2 = r8
        L8c:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L33
            r8.sync()     // Catch: java.lang.Throwable -> L33
            kotlin.G0 r8 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L33
            r8 = 0
            kotlin.io.c.a(r2, r8)     // Catch: java.io.IOException -> Lbd
            java.io.File r8 = r1.c()     // Catch: java.io.IOException -> Lbd
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbd
            if (r8 == 0) goto La6
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        La6:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbd
            r9.<init>(r0)     // Catch: java.io.IOException -> Lbd
            r9.append(r3)     // Catch: java.io.IOException -> Lbd
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbd
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbd
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbd
            throw r8     // Catch: java.io.IOException -> Lbd
        Lbd:
            r8 = move-exception
            goto Lc7
        Lbf:
            r8 = move-exception
            r2 = r9
        Lc1:
            throw r8     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r9 = move-exception
            kotlin.io.c.a(r2, r8)     // Catch: java.io.IOException -> Lbd
            throw r9     // Catch: java.io.IOException -> Lbd
        Lc7:
            boolean r9 = r3.exists()
            if (r9 == 0) goto Ld0
            r3.delete()
        Ld0:
            throw r8
        Ld1:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r9 = kotlin.jvm.internal.L.j(r9, r0)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o.j(java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k Y41.a<? extends File> aVar, @Y61.k m<T> mVar, @Y61.k List<? extends Y41.p<? super k<T>, ? super Continuation<? super G0>, ? extends Object>> list, @Y61.k InterfaceC22875a<T> interfaceC22875a, @Y61.k T t12) {
        this.f45436a = aVar;
        this.f45437b = mVar;
        this.f45438c = interfaceC22875a;
        this.f45439d = t12;
        this.f45440e = C43175k.G(new g(this, null));
        this.f45441f = ".tmp";
        this.f45442g = C42727D.c(new h(this));
        this.f45443h = p2.a(B.f45399a);
        this.f45444i = C42745f0.M0(list);
        this.f45445j = new n<>(t12, new d(this), e.f45453l, new f(this, null));
    }
}
