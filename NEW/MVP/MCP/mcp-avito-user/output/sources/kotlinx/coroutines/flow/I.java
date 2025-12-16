package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Count.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {13}, m = "count", n = {"i"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class I<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.f f411144q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411145r;

    /* renamed from: s, reason: collision with root package name */
    public int f411146s;

    public I() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411145r = obj;
        this.f411146s = (this.f411146s | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411146s;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f411144q = new l0.f();
            this.f411146s = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l0.f fVar = this.f411144q;
        C42729a0.b(obj);
        return Boxing.boxInt(fVar.f406840b);
    }
}
