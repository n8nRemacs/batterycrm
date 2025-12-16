package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.C20991s0;
import androidx.compose.foundation.text.F1;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextFieldSelectionState.android.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/contextmenu/p;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/contextmenu/p;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class W extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.contextmenu.p, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f31355l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.contextmenu.s f31356m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<TextFieldSelectionState, TextContextMenuItems, G0> f31357n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31358o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y41.p pVar, androidx.compose.foundation.contextmenu.s sVar, TextFieldSelectionState textFieldSelectionState, InterfaceC22204y1 interfaceC22204y1) {
        super(1);
        this.f31355l = interfaceC22204y1;
        this.f31356m = sVar;
        this.f31357n = pVar;
        this.f31358o = textFieldSelectionState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(androidx.compose.foundation.contextmenu.p pVar) {
        androidx.compose.foundation.contextmenu.p pVar2 = pVar;
        int i12 = ((F1) this.f31355l.getF42167b()).f30250a;
        TextContextMenuItems textContextMenuItems = TextContextMenuItems.f30549c;
        boolean z12 = (i12 & 4) == 4;
        TextFieldSelectionState textFieldSelectionState = this.f31358o;
        Y41.p<TextFieldSelectionState, TextContextMenuItems, G0> pVar3 = this.f31357n;
        androidx.compose.foundation.contextmenu.s sVar = this.f31356m;
        if (z12) {
            androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems), new Q(sVar, pVar3, textFieldSelectionState));
        }
        TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.f30550d;
        if ((i12 & 1) == 1) {
            androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems2), new S(sVar, pVar3, textFieldSelectionState));
        }
        TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.f30551e;
        if ((i12 & 2) == 2) {
            androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems3), new T(sVar, pVar3, textFieldSelectionState));
        }
        TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.f30552f;
        if ((i12 & 8) == 8) {
            androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems4), new U(sVar, pVar3, textFieldSelectionState));
        }
        TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.f30553g;
        if ((i12 & 16) == 16) {
            androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems5), new V(sVar, pVar3, textFieldSelectionState));
        }
        return G0.f406611a;
    }
}
