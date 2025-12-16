package defpackage;

import android.view.View;
import one.me.stickerspreview.set.StickerSetBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class uff implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerSetBottomSheet b;

    public /* synthetic */ uff(StickerSetBottomSheet stickerSetBottomSheet, int i) {
        this.a = i;
        this.b = stickerSetBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ytd router;
        int i = this.a;
        StickerSetBottomSheet stickerSetBottomSheet = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = StickerSetBottomSheet.E0;
                c54 parentController = stickerSetBottomSheet.getParentController();
                if (parentController != null && (router = parentController.getRouter()) != null) {
                    router.C();
                    break;
                }
                break;
            default:
                yy7[] yy7VarArr2 = StickerSetBottomSheet.E0;
                off offVar = (off) stickerSetBottomSheet.w0.getValue();
                dgf dgfVar = (dgf) offVar.A0.a.getValue();
                if (dgfVar != null) {
                    x9f x9fVar = offVar.E0;
                    if (x9fVar == null || !x9fVar.isActive()) {
                        offVar.E0 = xfh.o(offVar, ((q2b) offVar.c).b(), new nff(dgfVar, offVar, null), 2);
                        break;
                    }
                }
                break;
        }
    }
}
