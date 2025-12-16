package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Emitters.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {212}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class W<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Throwable f411284q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411285r;

    /* renamed from: s, reason: collision with root package name */
    public int f411286s;

    public W() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411285r = obj;
        this.f411286s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C43149e0.a(null, null, null, this);
    }
}
