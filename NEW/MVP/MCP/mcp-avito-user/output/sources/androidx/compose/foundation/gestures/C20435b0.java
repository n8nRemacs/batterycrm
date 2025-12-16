package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {851}, m = "awaitAllPointersUpWithSlopDetection", n = {"$this$awaitAllPointersUpWithSlopDetection", "pass", "pointer", "touchSlopDetector", "pointerSlopReached", "touchSlop"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "F$0"})
/* renamed from: androidx.compose.foundation.gestures.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20435b0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f27567q;

    /* renamed from: r, reason: collision with root package name */
    public PointerEventPass f27568r;

    /* renamed from: s, reason: collision with root package name */
    public l0.g f27569s;

    /* renamed from: t, reason: collision with root package name */
    public C20489o2 f27570t;

    /* renamed from: u, reason: collision with root package name */
    public int f27571u;

    /* renamed from: v, reason: collision with root package name */
    public float f27572v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f27573w;

    /* renamed from: x, reason: collision with root package name */
    public int f27574x;

    public C20435b0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27573w = obj;
        this.f27574x |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20495q0.a(null, null, null, this);
    }
}
