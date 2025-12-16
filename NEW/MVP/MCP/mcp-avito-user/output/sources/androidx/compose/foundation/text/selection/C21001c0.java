package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.W1;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: SelectionGestures.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {WebSocketProtocol.PAYLOAD_SHORT, 130}, m = "touchSelection", n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* renamed from: androidx.compose.foundation.text.selection.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21001c0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f31935q;

    /* renamed from: r, reason: collision with root package name */
    public W1 f31936r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.C f31937s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f31938t;

    /* renamed from: u, reason: collision with root package name */
    public int f31939u;

    public C21001c0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31938t = obj;
        this.f31939u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20998b0.d(null, null, null, this);
    }
}
