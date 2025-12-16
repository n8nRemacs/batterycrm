package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC20431a0;
import androidx.compose.foundation.interaction.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Draggable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0, 1, 1, 1}, l = {534, 537}, m = "processDragStart", n = {"this", "event", "this", "event", "interaction"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
final class L0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public I0 f27342q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC20431a0.c f27343r;

    /* renamed from: s, reason: collision with root package name */
    public a.b f27344s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f27345t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I0 f27346u;

    /* renamed from: v, reason: collision with root package name */
    public int f27347v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(I0 i02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27346u = i02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27345t = obj;
        this.f27347v |= BeduinInputModel.MIN_TEXT_VERSION;
        return I0.o2(this.f27346u, null, this);
    }
}
