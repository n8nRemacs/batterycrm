package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContextMenuGestures.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", i = {0}, l = {71}, m = "awaitFirstRightClickDown", n = {"$this$awaitFirstRightClickDown"}, s = {"L$0"})
/* loaded from: classes.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f27028q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27029r;

    /* renamed from: s, reason: collision with root package name */
    public int f27030s;

    public h() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27029r = obj;
        this.f27030s |= BeduinInputModel.MIN_TEXT_VERSION;
        return l.a(null, this);
    }
}
