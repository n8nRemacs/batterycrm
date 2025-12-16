package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DragGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {111}, m = "drag-jO51t88", n = {"$this$drag_u2djO51t88", "onDrag"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class E0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f27230q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.l f27231r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27232s;

    /* renamed from: t, reason: collision with root package name */
    public int f27233t;

    public E0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27232s = obj;
        this.f27233t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20495q0.i(null, 0L, null, this);
    }
}
