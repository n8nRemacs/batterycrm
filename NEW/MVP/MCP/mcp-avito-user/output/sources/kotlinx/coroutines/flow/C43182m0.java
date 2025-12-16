package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* compiled from: Limit.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {133}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.flow.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43182m0<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C43185n0 f411617q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411618r;

    /* renamed from: s, reason: collision with root package name */
    public int f411619s;

    public C43182m0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411618r = obj;
        this.f411619s = (this.f411619s | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411619s;
        try {
        } catch (AbortFlowException e12) {
            if (e12.f411440b != i12) {
                throw e12;
            }
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f411617q = new C43185n0();
            this.f411619s = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C43185n0 c43185n0 = this.f411617q;
        C42729a0.b(obj);
        return kotlin.G0.f406611a;
    }
}
