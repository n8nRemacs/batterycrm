package defpackage;

import android.widget.FrameLayout;
import one.me.stickerspreview.StickerPreviewScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class hff implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerPreviewScreen b;

    public /* synthetic */ hff(StickerPreviewScreen stickerPreviewScreen, int i) {
        this.a = i;
        this.b = stickerPreviewScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        StickerPreviewScreen stickerPreviewScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = StickerPreviewScreen.z0;
                hs hsVar = stickerPreviewScreen.a;
                yy7 yy7Var = StickerPreviewScreen.z0[1];
                long jLongValue = ((Number) hsVar.a(stickerPreviewScreen)).longValue();
                vgf vgfVar = vgf.a;
                lzf lzfVar = (lzf) vgfVar.getAccessor().c(8);
                vgfVar.getAccessor().getClass();
                bwf bwfVarD = vgfVar.getAccessor().d(232);
                bwf bwfVarD2 = vgfVar.getAccessor().d(239);
                bwf bwfVarD3 = vgfVar.getAccessor().d(240);
                bwf bwfVarD4 = vgfVar.getAccessor().d(241);
                bwf bwfVarD5 = vgfVar.getAccessor().d(109);
                bwf bwfVarD6 = vgfVar.getAccessor().d(186);
                vgfVar.getAccessor().getClass();
                return new off(jLongValue, lzfVar, bwfVarD, bwfVarD2, bwfVarD3, bwfVarD4, bwfVarD5, bwfVarD6);
            case 1:
                yy7[] yy7VarArr2 = StickerPreviewScreen.z0;
                oef oefVar = new oef(stickerPreviewScreen.getContext());
                oefVar.setId(pdb.f);
                int iD = kti.d(160 * vw4.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
                layoutParams.gravity = 17;
                oefVar.setLayoutParams(layoutParams);
                return oefVar;
            case 2:
                yy7[] yy7VarArr3 = StickerPreviewScreen.z0;
                sk8 sk8Var = new sk8(stickerPreviewScreen.getContext());
                sk8Var.setId(pdb.e);
                int iD2 = kti.d(160 * vw4.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iD2, iD2);
                layoutParams2.gravity = 17;
                sk8Var.setLayoutParams(layoutParams2);
                return sk8Var;
            default:
                yy7[] yy7VarArr4 = StickerPreviewScreen.z0;
                e1i e1iVar = new e1i(stickerPreviewScreen.getContext());
                e1iVar.setId(pdb.l);
                int iD3 = kti.d(160 * vw4.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iD3, iD3);
                layoutParams3.gravity = 17;
                e1iVar.setLayoutParams(layoutParams3);
                return e1iVar;
        }
    }
}
