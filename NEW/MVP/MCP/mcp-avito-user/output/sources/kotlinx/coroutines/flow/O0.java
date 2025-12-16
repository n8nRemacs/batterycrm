package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Reduce.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class O0<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f411184q;

    /* renamed from: r, reason: collision with root package name */
    public M0 f411185r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f411186s;

    /* renamed from: t, reason: collision with root package name */
    public int f411187t;

    public O0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411186s = obj;
        this.f411187t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C43175k.y(null, this);
    }
}
