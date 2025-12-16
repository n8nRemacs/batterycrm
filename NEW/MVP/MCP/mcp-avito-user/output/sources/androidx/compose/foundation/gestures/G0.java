package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0}, l = {1055}, m = "horizontalDrag-jO51t88", n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes.dex */
final class G0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.l f27248q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC22325c f27249r;

    /* renamed from: s, reason: collision with root package name */
    public Orientation f27250s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC22325c f27251t;

    /* renamed from: u, reason: collision with root package name */
    public l0.g f27252u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f27253v;

    /* renamed from: w, reason: collision with root package name */
    public int f27254w;

    public G0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27253v = obj;
        this.f27254w |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20495q0.j(null, 0L, null, this);
    }
}
