package androidx.compose.material;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetectorCopy.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {125, 163}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1", "L$0", "L$1", "L$2", "L$3", "F$0", "F$1"})
/* renamed from: androidx.compose.material.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21127c3 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.p f33493q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC22325c f33494r;

    /* renamed from: s, reason: collision with root package name */
    public l0.g f33495s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.C f33496t;

    /* renamed from: u, reason: collision with root package name */
    public float f33497u;

    /* renamed from: v, reason: collision with root package name */
    public float f33498v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f33499w;

    /* renamed from: x, reason: collision with root package name */
    public int f33500x;

    public C21127c3() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f33499w = obj;
        this.f33500x |= BeduinInputModel.MIN_TEXT_VERSION;
        return C21140d3.a(null, 0L, 0, null, this);
    }
}
