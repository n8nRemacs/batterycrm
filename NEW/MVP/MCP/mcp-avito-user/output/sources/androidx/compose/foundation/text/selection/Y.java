package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: SelectionGestures.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1, 1}, l = {357, 384}, m = "mouseSelectionBtf2", n = {"$this$mouseSelectionBtf2", "observer", "$this$mouseSelectionBtf2", "observer", "dragConsumed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
final class Y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f31898q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC21028o f31899r;

    /* renamed from: s, reason: collision with root package name */
    public l0.a f31900s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f31901t;

    /* renamed from: u, reason: collision with root package name */
    public int f31902u;

    public Y() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31901t = obj;
        this.f31902u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20998b0.c(null, null, null, null, this);
    }
}
