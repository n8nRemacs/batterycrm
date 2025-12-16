package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: AnchoredDraggable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {0, 0}, l = {1380}, m = "animateToWithDecay", n = {"remainingVelocity", "velocity"}, s = {"L$0", "F$0"})
/* renamed from: androidx.compose.foundation.gestures.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20466j<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public float f27767q;

    /* renamed from: r, reason: collision with root package name */
    public l0.e f27768r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27769s;

    /* renamed from: t, reason: collision with root package name */
    public int f27770t;

    public C20466j() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27769s = obj;
        this.f27770t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20438c.g(null, null, 0.0f, null, null, this);
    }
}
