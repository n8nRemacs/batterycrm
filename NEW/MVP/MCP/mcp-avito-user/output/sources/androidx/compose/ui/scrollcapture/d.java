package androidx.compose.ui.scrollcapture;

import Y41.p;
import androidx.compose.foundation.H;
import androidx.compose.ui.semantics.y;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"reverseScrolling"}, s = {"Z$0"})
/* loaded from: classes.dex */
final class d extends SuspendLambda implements p<Float, Continuation<? super Float>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public boolean f41695q;

    /* renamed from: r, reason: collision with root package name */
    public int f41696r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ float f41697s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f41698t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f41698t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        d dVar = new d(this.f41698t, continuation);
        dVar.f41697s = ((Number) obj).floatValue();
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(Float f12, Continuation<? super Float> continuation) {
        return ((d) create(Float.valueOf(f12.floatValue()), continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f41696r;
        if (i12 == 0) {
            C42729a0.b(obj);
            float f12 = this.f41697s;
            a aVar = this.f41698t;
            androidx.compose.ui.semantics.l lVar = aVar.f41672a.f41797d;
            androidx.compose.ui.semantics.k.f41760a.getClass();
            p pVar = (p) androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.k.f41765f);
            if (pVar == null) {
                throw H.s("Required value was null.");
            }
            androidx.compose.ui.semantics.l lVar2 = aVar.f41672a.f41797d;
            y.f41820a.getClass();
            boolean z13 = ((androidx.compose.ui.semantics.j) lVar2.d(y.f41840u)).f41756c;
            if (z13) {
                f12 = -f12;
            }
            l0.g gVarA = l0.g.a((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
            this.f41695q = z13;
            this.f41696r = 1;
            obj = pVar.invoke(gVarA, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            z12 = z13;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z12 = this.f41695q;
            C42729a0.b(obj);
        }
        long j12 = ((l0.g) obj).f413387a;
        return Boxing.boxFloat(z12 ? -Float.intBitsToFloat((int) (j12 & 4294967295L)) : Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }
}
