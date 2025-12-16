package androidx.compose.ui.tooling;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.sequences.AbstractC43032o;

/* compiled from: ShadowViewInfo.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "Landroidx/compose/ui/tooling/N;", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.tooling.ShadowViewInfo$allNodes$1", f = "ShadowViewInfo.android.kt", i = {0, 1}, l = {43, 44}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class M extends RestrictedSuspendLambda implements Y41.p<AbstractC43032o<? super N>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Iterator f42760q;

    /* renamed from: r, reason: collision with root package name */
    public int f42761r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f42762s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N f42763t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n12, Continuation<? super M> continuation) {
        super(2, continuation);
        this.f42763t = n12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        M m12 = new M(this.f42763t, continuation);
        m12.f42762s = obj;
        return m12;
    }

    @Override // Y41.p
    public final Object invoke(AbstractC43032o<? super N> abstractC43032o, Continuation<? super G0> continuation) {
        return ((M) create(abstractC43032o, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f42761r;
        N n12 = this.f42763t;
        if (i12 == 0) {
            C42729a0.b(obj);
            AbstractC43032o abstractC43032o = (AbstractC43032o) this.f42762s;
            this.f42762s = abstractC43032o;
            this.f42761r = 1;
            if (abstractC43032o.a(n12, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it = this.f42760q;
                AbstractC43032o abstractC43032o2 = (AbstractC43032o) this.f42762s;
                C42729a0.b(obj);
                while (it.hasNext()) {
                    N n13 = (N) it.next();
                    this.f42762s = abstractC43032o2;
                    this.f42760q = it;
                    this.f42761r = 2;
                    if (abstractC43032o2.a(n13, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        new ArrayList();
        throw null;
    }
}
