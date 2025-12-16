package androidx.compose.foundation.gestures.snapping;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {175}, m = "tryApproach", n = {}, s = {})
/* loaded from: classes.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f28028q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f28029r;

    /* renamed from: s, reason: collision with root package name */
    public int f28030s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28029r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f28028q = obj;
        this.f28030s |= BeduinInputModel.MIN_TEXT_VERSION;
        return o.c(this.f28029r, null, 0.0f, 0.0f, null, this);
    }
}
