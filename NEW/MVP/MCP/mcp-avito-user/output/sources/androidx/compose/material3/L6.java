package androidx.compose.material3;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetectorCopy.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {145, 183}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1", "L$0", "L$1", "L$2", "L$3", "F$0", "F$1"})
/* loaded from: classes.dex */
final class L6 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.p f35046q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC22325c f35047r;

    /* renamed from: s, reason: collision with root package name */
    public l0.g f35048s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.C f35049t;

    /* renamed from: u, reason: collision with root package name */
    public float f35050u;

    /* renamed from: v, reason: collision with root package name */
    public float f35051v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f35052w;

    /* renamed from: x, reason: collision with root package name */
    public int f35053x;

    public L6() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f35052w = obj;
        this.f35053x |= BeduinInputModel.MIN_TEXT_VERSION;
        return M6.a(null, 0L, 0, null, this);
    }
}
