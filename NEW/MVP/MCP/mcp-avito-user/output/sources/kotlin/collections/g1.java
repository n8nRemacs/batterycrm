package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC43032o;

/* compiled from: SlidingWindow.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/sequences/o;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class g1 extends RestrictedSuspendLambda implements Y41.p<AbstractC43032o<? super List<Object>>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f406727q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f406728r;

    /* renamed from: s, reason: collision with root package name */
    public int f406729s;

    /* renamed from: t, reason: collision with root package name */
    public int f406730t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f406731u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f406732v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f406733w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Iterator<Object> f406734x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(int i12, int i13, Iterator it, Continuation continuation) {
        super(2, continuation);
        this.f406732v = i12;
        this.f406733w = i13;
        this.f406734x = it;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        g1 g1Var = new g1(this.f406732v, this.f406733w, this.f406734x, continuation);
        g1Var.f406731u = obj;
        return g1Var;
    }

    @Override // Y41.p
    public final Object invoke(AbstractC43032o<? super List<Object>> abstractC43032o, Continuation<? super kotlin.G0> continuation) {
        return ((g1) create(abstractC43032o, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a0 -> B:34:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ea -> B:57:0x010e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0121 -> B:61:0x0124). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0147 -> B:70:0x014a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
