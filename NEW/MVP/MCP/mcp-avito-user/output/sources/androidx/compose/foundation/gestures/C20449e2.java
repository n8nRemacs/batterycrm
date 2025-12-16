package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TapGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {304}, m = "awaitPrimaryFirstDown", n = {"$this$awaitPrimaryFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
/* renamed from: androidx.compose.foundation.gestures.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20449e2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f27689q;

    /* renamed from: r, reason: collision with root package name */
    public PointerEventPass f27690r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27691s;

    /* renamed from: t, reason: collision with root package name */
    public int f27692t;

    public C20449e2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27691s = obj;
        this.f27692t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20445d2.d(null, null, this);
    }
}
