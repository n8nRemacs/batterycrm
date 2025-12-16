package kotlinx.coroutines.stream;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Stream.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/stream/a;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class a<T> implements InterfaceC43160i<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f412246b = AtomicIntegerFieldUpdater.newUpdater(a.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* compiled from: Stream.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {22}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.stream.a$a, reason: collision with other inner class name */
    public static final class C11738a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC43172j f412247q;

        /* renamed from: r, reason: collision with root package name */
        public Iterator f412248r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f412249s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a<T> f412250t;

        /* renamed from: u, reason: collision with root package name */
        public int f412251u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11738a(a<T> aVar, Continuation<? super C11738a> continuation) {
            super(continuation);
            this.f412250t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f412249s = obj;
            this.f412251u |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f412250t.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super T> r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof kotlinx.coroutines.stream.a.C11738a
            if (r6 == 0) goto L13
            r6 = r7
            kotlinx.coroutines.stream.a$a r6 = (kotlinx.coroutines.stream.a.C11738a) r6
            int r0 = r6.f412251u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f412251u = r0
            goto L18
        L13:
            kotlinx.coroutines.stream.a$a r6 = new kotlinx.coroutines.stream.a$a
            r6.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r6.f412249s
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f412251u
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L4f
            if (r1 != r3) goto L47
            java.util.Iterator r1 = r6.f412248r
            kotlinx.coroutines.flow.j r4 = r6.f412247q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L44
        L2d:
            boolean r7 = r1.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L46
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L44
            r6.f412247q = r4     // Catch: java.lang.Throwable -> L44
            r6.f412248r = r1     // Catch: java.lang.Throwable -> L44
            r6.f412251u = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r7 = r4.emit(r7, r6)     // Catch: java.lang.Throwable -> L44
            if (r7 != r0) goto L2d
            return r0
        L44:
            r6 = r2
            goto L65
        L46:
            throw r2
        L47:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4f:
            kotlin.C42729a0.b(r7)
            r6 = 0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = kotlinx.coroutines.stream.a.f412246b
            boolean r6 = r7.compareAndSet(r5, r6, r3)
            if (r6 != 0) goto L63
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Stream.consumeAsFlow can be collected only once"
            r6.<init>(r7)
            throw r6
        L63:
            throw r2     // Catch: java.lang.Throwable -> L64
        L64:
            r6 = r5
        L65:
            r6.getClass()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.a.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
