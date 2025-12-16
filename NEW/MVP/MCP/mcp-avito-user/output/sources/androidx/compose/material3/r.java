package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {732}, m = "restartable", n = {}, s = {})
/* loaded from: classes.dex */
final class r<I> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f37186q;

    /* renamed from: r, reason: collision with root package name */
    public int f37187r;

    public r() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f37186q = obj;
        this.f37187r |= BeduinInputModel.MIN_TEXT_VERSION;
        return C21894u.b(null, null, this);
    }
}
