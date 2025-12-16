package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C20991s0;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: TextFieldSelectionManager.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/contextmenu/p;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/contextmenu/p;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class u1 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.contextmenu.p, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f32144l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.contextmenu.s f32145m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f32146n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(androidx.compose.foundation.contextmenu.s sVar, C21011f1 c21011f1, InterfaceC22204y1 interfaceC22204y1) {
        super(1);
        this.f32144l = interfaceC22204y1;
        this.f32145m = sVar;
        this.f32146n = c21011f1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.foundation.contextmenu.p pVar) {
        androidx.compose.foundation.contextmenu.p pVar2 = pVar;
        int i12 = ((androidx.compose.foundation.text.F1) this.f32144l.getF42167b()).f30250a;
        TextContextMenuItems textContextMenuItems = TextContextMenuItems.f30549c;
        boolean z12 = (i12 & 4) == 4;
        C21011f1 c21011f1 = this.f32146n;
        androidx.compose.foundation.contextmenu.s sVar = this.f32145m;
        if (z12) {
            androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems), new p1(sVar, c21011f1));
        }
        TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.f30550d;
        if ((i12 & 1) == 1) {
            androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems2), new q1(sVar, c21011f1));
        }
        TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.f30551e;
        if ((i12 & 2) == 2) {
            androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems3), new r1(sVar, c21011f1));
        }
        TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.f30552f;
        if ((i12 & 8) == 8) {
            androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems4), new s1(sVar, c21011f1));
        }
        TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.f30553g;
        if (c21011f1.j() && androidx.compose.ui.text.v0.d(c21011f1.m().f42384b)) {
            androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems5), new t1(sVar, c21011f1));
        }
        return kotlin.G0.f406611a;
    }
}
