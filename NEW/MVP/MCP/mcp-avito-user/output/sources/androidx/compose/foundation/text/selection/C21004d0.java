package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.W1;
import androidx.compose.ui.input.pointer.C22341t;
import kotlin.Metadata;

/* compiled from: SelectionGestures.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.selection.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21004d0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W1 f31944l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21004d0(W1 w12) {
        super(1);
        this.f31944l = w12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12) {
        androidx.compose.ui.input.pointer.C c13 = c12;
        this.f31944l.d(C22341t.f(c13, false));
        c13.a();
        return kotlin.G0.f406611a;
    }
}
