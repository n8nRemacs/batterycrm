package androidx.compose.foundation.gestures.snapping;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {115}, m = "fling", n = {"onRemainingScrollOffsetUpdate"}, s = {"L$0"})
/* loaded from: classes.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.l f28011q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f28012r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f28013s;

    /* renamed from: t, reason: collision with root package name */
    public int f28014t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28013s = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f28012r = obj;
        this.f28014t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f28013s.d(null, 0.0f, null, this);
    }
}
