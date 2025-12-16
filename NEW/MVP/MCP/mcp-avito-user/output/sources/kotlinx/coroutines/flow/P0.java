package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Reduce.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {179}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class P0<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.p f411211q;

    /* renamed from: r, reason: collision with root package name */
    public l0.h f411212r;

    /* renamed from: s, reason: collision with root package name */
    public N0 f411213s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f411214t;

    /* renamed from: u, reason: collision with root package name */
    public int f411215u;

    public P0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411214t = obj;
        this.f411215u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C43175k.x(null, null, this);
    }
}
