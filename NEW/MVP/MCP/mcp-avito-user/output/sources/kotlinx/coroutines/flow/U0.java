package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Reduce.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {40}, m = "fold", n = {"accumulator"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class U0<T, R> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f411273q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411274r;

    /* renamed from: s, reason: collision with root package name */
    public int f411275s;

    public U0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411274r = obj;
        this.f411275s = (this.f411275s | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411275s;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l0.h hVar = this.f411273q;
            C42729a0.b(obj);
            return hVar.f406842b;
        }
        l0.h hVarT = androidx.compose.foundation.H.t(obj);
        hVarT.f406842b = null;
        this.f411273q = hVarT;
        this.f411275s = 1;
        throw null;
    }
}
