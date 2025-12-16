package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TapGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 1, 1}, l = {352, 366}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: androidx.compose.foundation.gestures.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20473k2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f27824q;

    /* renamed from: r, reason: collision with root package name */
    public PointerEventPass f27825r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27826s;

    /* renamed from: t, reason: collision with root package name */
    public int f27827t;

    public C20473k2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27826s = obj;
        this.f27827t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20445d2.l(null, null, this);
    }
}
