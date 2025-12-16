package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC20431a0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Draggable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0}, l = {544}, m = "processDragStop", n = {"this", "event"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class M0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public I0 f27352q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC20431a0.d f27353r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27354s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I0 f27355t;

    /* renamed from: u, reason: collision with root package name */
    public int f27356u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(I0 i02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27355t = i02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27354s = obj;
        this.f27356u |= BeduinInputModel.MIN_TEXT_VERSION;
        return I0.p2(this.f27355t, null, this);
    }
}
