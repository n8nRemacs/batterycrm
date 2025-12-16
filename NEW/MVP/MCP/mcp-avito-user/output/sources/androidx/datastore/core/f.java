package androidx.datastore.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
/* loaded from: classes.dex */
final class f extends SuspendLambda implements Y41.p<Object, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Iterator f45410q;

    /* renamed from: r, reason: collision with root package name */
    public c f45411r;

    /* renamed from: s, reason: collision with root package name */
    public Object f45412s;

    /* renamed from: t, reason: collision with root package name */
    public int f45413t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f45414u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List<c<Object>> f45415v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f45416w;

    /* compiled from: DataMigrationInitializer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f45417q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ c<Object> f45418r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<Object> cVar, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f45418r = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f45418r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f45417q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f45417q = 1;
                if (this.f45418r.s() == coroutine_suspended) {
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
    public f(List list, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f45415v = list;
        this.f45416w = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f45415v, this.f45416w, continuation);
        fVar.f45414u = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Continuation<Object> continuation) {
        return ((f) create(obj, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[RETURN] */
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
            int r1 = r9.f45413t
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.util.Iterator r1 = r9.f45410q
            java.lang.Object r4 = r9.f45414u
            java.util.List r4 = (java.util.List) r4
            kotlin.C42729a0.b(r10)
            goto L40
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.f45412s
            androidx.datastore.core.c r4 = r9.f45411r
            java.util.Iterator r5 = r9.f45410q
            java.lang.Object r6 = r9.f45414u
            java.util.List r6 = (java.util.List) r6
            kotlin.C42729a0.b(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L62
        L31:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f45414u
            java.util.List<androidx.datastore.core.c<java.lang.Object>> r1 = r9.f45415v
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r9.f45416w
        L40:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L88
            java.lang.Object r5 = r1.next()
            androidx.datastore.core.c r5 = (androidx.datastore.core.c) r5
            r9.f45414u = r4
            r9.f45410q = r1
            r9.f45411r = r5
            r9.f45412s = r10
            r9.f45413t = r3
            java.lang.Object r6 = r5.t(r10, r9)
            if (r6 != r0) goto L5d
            return r0
        L5d:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L62:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L86
            androidx.datastore.core.f$a r10 = new androidx.datastore.core.f$a
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.f45414u = r4
            r9.f45410q = r5
            r9.f45411r = r7
            r9.f45412s = r7
            r9.f45413t = r2
            java.lang.Object r10 = r6.u(r1, r9)
            if (r10 != r0) goto L84
            return r0
        L84:
            r1 = r5
            goto L40
        L86:
            r10 = r1
            goto L84
        L88:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
