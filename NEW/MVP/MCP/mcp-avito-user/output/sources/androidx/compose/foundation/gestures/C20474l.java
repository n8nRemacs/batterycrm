package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {1543}, m = "restartable", n = {}, s = {})
/* renamed from: androidx.compose.foundation.gestures.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20474l<I> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f27828q;

    /* renamed from: r, reason: collision with root package name */
    public int f27829r;

    public C20474l() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27828q = obj;
        this.f27829r |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20438c.d(null, null, this);
    }
}
