package androidx.compose.foundation.gestures.snapping;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {354}, m = "animateWithTarget", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
/* loaded from: classes.dex */
final class r extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public float f28044q;

    /* renamed from: r, reason: collision with root package name */
    public float f28045r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.compose.animation.core.r f28046s;

    /* renamed from: t, reason: collision with root package name */
    public l0.e f28047t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f28048u;

    /* renamed from: v, reason: collision with root package name */
    public int f28049v;

    public r() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f28048u = obj;
        this.f28049v |= BeduinInputModel.MIN_TEXT_VERSION;
        return t.c(null, 0.0f, 0.0f, null, null, null, this);
    }
}
