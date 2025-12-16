package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {261}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
/* loaded from: classes.dex */
final class Dg extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public float f34632q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.compose.animation.core.r f34633r;

    /* renamed from: s, reason: collision with root package name */
    public l0.e f34634s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f34635t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Lg f34636u;

    /* renamed from: v, reason: collision with root package name */
    public int f34637v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dg(Lg lg2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f34636u = lg2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f34635t = obj;
        this.f34637v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f34636u.d(null, 0.0f, null, null, this);
    }
}
