package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0}, l = {968}, m = "awaitLongPressOrCancellation-rnUCldI", n = {"initialDown", "longPress", "deepPress"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: androidx.compose.foundation.gestures.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20455g0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.C f27708q;

    /* renamed from: r, reason: collision with root package name */
    public l0.h f27709r;

    /* renamed from: s, reason: collision with root package name */
    public l0.a f27710s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f27711t;

    /* renamed from: u, reason: collision with root package name */
    public int f27712u;

    public C20455g0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27711t = obj;
        this.f27712u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20495q0.d(null, 0L, this);
    }
}
