package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* loaded from: classes2.dex */
public final class oz7 extends ky6 {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;

    public oz7(GridLayoutManager gridLayoutManager, phd phdVar) {
        this.d = gridLayoutManager;
        this.e = phdVar;
    }

    @Override // defpackage.ky6
    public final int c(int i) {
        GridLayoutManager gridLayoutManagerD;
        int iL;
        switch (this.c) {
            case 0:
                KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) this.d;
                if (i >= keyboardEmojiWidget.o.j() || keyboardEmojiWidget.o.l(i) != w5b.q || (gridLayoutManagerD = x7j.d((RecyclerView) this.e)) == null) {
                    return 1;
                }
                return gridLayoutManagerD.F;
            default:
                phd phdVar = (phd) this.e;
                if (i >= phdVar.j() || !((iL = phdVar.l(i)) == uab.k || iL == uab.l || iL == w5b.r)) {
                    return 1;
                }
                return ((GridLayoutManager) this.d).F;
        }
    }

    public oz7(KeyboardEmojiWidget keyboardEmojiWidget, RecyclerView recyclerView) {
        this.d = keyboardEmojiWidget;
        this.e = recyclerView;
    }
}
