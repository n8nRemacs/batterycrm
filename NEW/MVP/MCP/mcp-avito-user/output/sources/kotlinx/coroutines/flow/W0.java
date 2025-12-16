package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Reduce.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {151}, m = "last", n = {"result"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class W0<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f411287q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411288r;

    /* renamed from: s, reason: collision with root package name */
    public int f411289s;

    public W0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411288r = obj;
        this.f411289s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C43175k.J(null, this);
    }
}
