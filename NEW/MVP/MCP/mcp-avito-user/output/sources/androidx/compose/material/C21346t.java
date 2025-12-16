package androidx.compose.material;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {720}, m = "restartable", n = {}, s = {})
/* renamed from: androidx.compose.material.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21346t<I> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f34204q;

    /* renamed from: r, reason: collision with root package name */
    public int f34205r;

    public C21346t() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f34204q = obj;
        this.f34205r |= BeduinInputModel.MIN_TEXT_VERSION;
        return C21385w.b(null, null, this);
    }
}
