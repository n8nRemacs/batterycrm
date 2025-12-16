package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: SelectionGestures.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1, 1}, l = {159, 183}, m = "mouseSelection", n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer", "dragConsumed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
final class V extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f31880q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC21028o f31881r;

    /* renamed from: s, reason: collision with root package name */
    public l0.a f31882s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f31883t;

    /* renamed from: u, reason: collision with root package name */
    public int f31884u;

    public V() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31883t = obj;
        this.f31884u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20998b0.b(null, null, null, null, this);
    }
}
