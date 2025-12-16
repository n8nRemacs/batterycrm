package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.NoSuchElementException;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Reduce.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {18}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.flow.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43138a1<S, T extends S> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f411326q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411327r;

    /* renamed from: s, reason: collision with root package name */
    public int f411328s;

    public C43138a1() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlinx.coroutines.internal.a0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411327r = obj;
        this.f411328s = (this.f411328s | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411328s;
        ?? r12 = kotlinx.coroutines.flow.internal.z.f411583a;
        if (i12 == 0) {
            l0.h hVarT = androidx.compose.foundation.H.t(obj);
            hVarT.f406842b = r12;
            this.f411326q = hVarT;
            this.f411328s = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l0.h hVar = this.f411326q;
        C42729a0.b(obj);
        T t12 = hVar.f406842b;
        if (t12 != r12) {
            return t12;
        }
        throw new NoSuchElementException("Empty flow can't be reduced");
    }
}
