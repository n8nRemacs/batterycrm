package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1061, 1104}, m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
/* renamed from: androidx.compose.foundation.gestures.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20475l0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.p f27830q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC22325c f27831r;

    /* renamed from: s, reason: collision with root package name */
    public l0.g f27832s;

    /* renamed from: t, reason: collision with root package name */
    public C20489o2 f27833t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.C f27834u;

    /* renamed from: v, reason: collision with root package name */
    public float f27835v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f27836w;

    /* renamed from: x, reason: collision with root package name */
    public int f27837x;

    public C20475l0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27836w = obj;
        this.f27837x |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20495q0.f(null, 0L, 0, null, this);
    }
}
