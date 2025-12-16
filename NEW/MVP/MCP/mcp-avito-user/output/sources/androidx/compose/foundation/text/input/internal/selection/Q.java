package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.TextContextMenuItems;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContextMenu.android.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "androidx/compose/foundation/text/t0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.contextmenu.s f31251l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p f31252m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31253n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(androidx.compose.foundation.contextmenu.s sVar, Y41.p pVar, TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f31251l = sVar;
        this.f31252m = pVar;
        this.f31253n = textFieldSelectionState;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f31252m.invoke(this.f31253n, TextContextMenuItems.f30549c);
        androidx.compose.foundation.contextmenu.t.a(this.f31251l);
        return G0.f406611a;
    }
}
