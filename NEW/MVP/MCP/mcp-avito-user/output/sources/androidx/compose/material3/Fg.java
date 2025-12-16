package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0, 0}, l = {299}, m = "animateSnap", n = {"this", "animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1"})
/* loaded from: classes.dex */
final class Fg extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Lg f34742q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.compose.animation.core.r f34743r;

    /* renamed from: s, reason: collision with root package name */
    public l0.e f34744s;

    /* renamed from: t, reason: collision with root package name */
    public float f34745t;

    /* renamed from: u, reason: collision with root package name */
    public float f34746u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f34747v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Lg f34748w;

    /* renamed from: x, reason: collision with root package name */
    public int f34749x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fg(Lg lg2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f34748w = lg2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f34747v = obj;
        this.f34749x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f34748w.e(null, 0.0f, 0.0f, null, null, this);
    }
}
