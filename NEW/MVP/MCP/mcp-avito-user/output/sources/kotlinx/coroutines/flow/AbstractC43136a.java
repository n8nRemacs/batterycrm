package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Flow.kt */
@kotlinx.coroutines.B0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/a;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/c;", "<init>", "()V", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/G0;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectSafely", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43136a<T> implements InterfaceC43160i<T>, InterfaceC43142c<T> {

    /* compiled from: Flow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {226}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    public static final class C11715a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public kotlinx.coroutines.flow.internal.A f411314q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411315r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AbstractC43136a<T> f411316s;

        /* renamed from: t, reason: collision with root package name */
        public int f411317t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11715a(AbstractC43136a<T> abstractC43136a, Continuation<? super C11715a> continuation) {
            super(continuation);
            this.f411316s = abstractC43136a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411315r = obj;
            this.f411317t |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411316s.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super T> r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractC43136a.C11715a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.AbstractC43136a.C11715a) r0
            int r1 = r0.f411317t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411317t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f411315r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411317t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.flow.internal.A r6 = r0.f411314q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L2b:
            r7 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r7)
            kotlinx.coroutines.flow.internal.A r7 = new kotlinx.coroutines.flow.internal.A
            kotlin.coroutines.CoroutineContext r2 = r0.getF411960f()
            r7.<init>(r6, r2)
            r0.f411314q = r7     // Catch: java.lang.Throwable -> L53
            r0.f411317t = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r6 = r5.collectSafely(r7, r0)     // Catch: java.lang.Throwable -> L53
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r6 = r7
        L4d:
            r6.releaseIntercepted()
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L53:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L57:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC43136a.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Y61.l
    public abstract Object collectSafely(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<? super kotlin.G0> continuation);
}
