package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Draggable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0}, l = {552}, m = "processDragCancel", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class K0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public I0 f27304q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27305r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I0 f27306s;

    /* renamed from: t, reason: collision with root package name */
    public int f27307t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(I0 i02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27306s = i02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27305r = obj;
        this.f27307t |= BeduinInputModel.MIN_TEXT_VERSION;
        return I0.n2(this.f27306s, this);
    }
}
