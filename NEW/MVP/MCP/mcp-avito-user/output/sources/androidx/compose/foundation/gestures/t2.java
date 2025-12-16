package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Transformable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0}, l = {312}, m = "awaitCtrlMouseScrollOrNull", n = {"$this$awaitCtrlMouseScrollOrNull", "scrollConfig"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class t2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f28058q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC20524z1 f28059r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f28060s;

    /* renamed from: t, reason: collision with root package name */
    public int f28061t;

    public t2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f28060s = obj;
        this.f28061t |= BeduinInputModel.MIN_TEXT_VERSION;
        return y2.c(null, null, this);
    }
}
