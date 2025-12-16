package androidx.view;

import android.app.PictureInPictureParams;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PipHintTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Rect;", "hint", "Lkotlin/G0;", "emit", "(Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.activity.D, reason: from Kotlin metadata */
/* loaded from: classes.dex */
final class Rect<T> implements InterfaceC43172j {
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        C19926i.f21215a.getClass();
        new PictureInPictureParams.Builder().setSourceRectHint((android.graphics.Rect) obj).build();
        throw null;
    }
}
