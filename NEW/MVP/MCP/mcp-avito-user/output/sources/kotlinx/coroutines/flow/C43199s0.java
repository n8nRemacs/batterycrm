package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Limit.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {70}, m = "emitAbort$FlowKt__LimitKt", n = {"ownershipMarker"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.flow.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43199s0<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f411735q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411736r;

    /* renamed from: s, reason: collision with root package name */
    public int f411737s;

    public C43199s0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411736r = obj;
        this.f411737s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C43217y0.a(null, null, null, this);
    }
}
