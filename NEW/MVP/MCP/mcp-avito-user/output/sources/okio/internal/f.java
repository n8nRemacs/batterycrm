package okio.internal;

import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC43032o;
import okio.S;

/* compiled from: FileSystem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "Lokio/S;", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
final class f extends RestrictedSuspendLambda implements Y41.p<AbstractC43032o<? super S>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C42754k f420081q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f420082r;

    /* renamed from: s, reason: collision with root package name */
    public int f420083s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f420084t;

    public f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(AbstractC43032o<? super S> abstractC43032o, Continuation<? super G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f420083s;
        if (i12 == 0) {
            C42729a0.b(obj);
            new C42754k();
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = this.f420082r;
        C42754k c42754k = this.f420081q;
        AbstractC43032o abstractC43032o = (AbstractC43032o) this.f420084t;
        C42729a0.b(obj);
        if (!it.hasNext()) {
            return G0.f406611a;
        }
        this.f420084t = abstractC43032o;
        this.f420081q = c42754k;
        this.f420082r = it;
        this.f420083s = 1;
        throw null;
    }
}
