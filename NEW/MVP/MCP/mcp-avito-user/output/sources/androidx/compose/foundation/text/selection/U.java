package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SelectionGestures.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {430}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
/* loaded from: classes.dex */
final class U extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f31877q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f31878r;

    /* renamed from: s, reason: collision with root package name */
    public int f31879s;

    public U() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31878r = obj;
        this.f31879s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20998b0.a(null, this);
    }
}
