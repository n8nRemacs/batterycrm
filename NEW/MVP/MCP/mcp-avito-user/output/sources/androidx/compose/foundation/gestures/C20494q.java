package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: AnchoredDraggable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", i = {1}, l = {455, 458}, m = "fling", n = {"leftoverVelocity"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.gestures.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20494q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.e f27914q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27915r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20490p<Object> f27916s;

    /* renamed from: t, reason: collision with root package name */
    public int f27917t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20494q(C20490p c20490p, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27916s = c20490p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27915r = obj;
        this.f27917t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20490p.w2(this.f27916s, 0.0f, this);
    }
}
