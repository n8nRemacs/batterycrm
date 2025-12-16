package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {1048}, m = "awaitDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
/* renamed from: androidx.compose.foundation.gestures.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20439c0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f27586q;

    /* renamed from: r, reason: collision with root package name */
    public l0.g f27587r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27588s;

    /* renamed from: t, reason: collision with root package name */
    public int f27589t;

    public C20439c0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27588s = obj;
        this.f27589t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20495q0.b(null, 0L, this);
    }
}
