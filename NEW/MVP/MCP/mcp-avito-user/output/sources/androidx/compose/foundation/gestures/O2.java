package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UpdatableAnimationState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {102, 153}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
/* loaded from: classes.dex */
final class O2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public N2 f27418q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43072x f27419r;

    /* renamed from: s, reason: collision with root package name */
    public Y41.a f27420s;

    /* renamed from: t, reason: collision with root package name */
    public float f27421t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f27422u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ N2 f27423v;

    /* renamed from: w, reason: collision with root package name */
    public int f27424w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O2(N2 n22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27423v = n22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27422u = obj;
        this.f27424w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f27423v.a(null, null, this);
    }
}
