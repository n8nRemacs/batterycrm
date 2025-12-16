package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;

/* loaded from: classes2.dex */
public final class wff extends i6c {
    public float a;
    public final int b;
    public final int[] c = new int[2];
    public final /* synthetic */ StickerSetBottomSheet d;

    public wff(StickerSetBottomSheet stickerSetBottomSheet) {
        this.d = stickerSetBottomSheet;
        this.b = ViewConfiguration.get(stickerSetBottomSheet.getContext()).getScaledTouchSlop();
    }

    @Override // defpackage.i6c
    public final int a() {
        return StickerSetBottomSheet.L0(this.d);
    }

    @Override // defpackage.i6c
    public final int c() {
        return e();
    }

    @Override // defpackage.i6c
    public final int e() {
        StickerSetBottomSheet stickerSetBottomSheet = this.d;
        View view = stickerSetBottomSheet.getView();
        return (view != null ? view.getMeasuredHeight() : 0) - stickerSetBottomSheet.C0;
    }

    @Override // defpackage.i6c
    public final View f() {
        yy7[] yy7VarArr = StickerSetBottomSheet.E0;
        return this.d.B0();
    }

    @Override // defpackage.i6c
    public final m6c g(m6c m6cVar, m6c m6cVar2) {
        m6c m6cVar3 = m6c.a;
        return (m6cVar2 == m6cVar3 && m6cVar == m6c.c) ? m6c.b : m6cVar2 == m6cVar3 ? m6cVar : m6cVar2;
    }

    @Override // defpackage.i6c
    public final void m(int i) {
        yy7[] yy7VarArr = StickerSetBottomSheet.E0;
        Object parentController = this.d.getParentController();
        ViewGroup viewGroup = null;
        vff vffVar = parentController instanceof vff ? (vff) parentController : null;
        if (vffVar != null) {
            StickerPreviewScreen stickerPreviewScreen = (StickerPreviewScreen) vffVar;
            viewGroup = (ViewGroup) stickerPreviewScreen.s0.D(stickerPreviewScreen, StickerPreviewScreen.z0[4]);
        }
        if (viewGroup == null) {
            return;
        }
        if (i <= viewGroup.getBottom()) {
            viewGroup.setTranslationY(i - viewGroup.getBottom());
        } else {
            viewGroup.setTranslationY(0.0f);
        }
    }

    @Override // defpackage.i6c
    public final boolean n(m6c m6cVar, float f, float f2) {
        float f3 = f2 - this.a;
        this.a = f2;
        StickerSetBottomSheet stickerSetBottomSheet = this.d;
        RecyclerView recyclerView = (RecyclerView) stickerSetBottomSheet.A0.D(stickerSetBottomSheet, StickerSetBottomSheet.E0[2]);
        boolean z = m6cVar == m6c.c;
        if (Math.abs(f3) >= this.b) {
            int[] iArr = this.c;
            recyclerView.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            boolean z2 = f >= ((float) i) && f <= ((float) (recyclerView.getWidth() + i)) && f2 >= ((float) i2) && f2 <= ((float) (recyclerView.getHeight() + i2));
            if (z && z2) {
                boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
                boolean zCanScrollVertically2 = recyclerView.canScrollVertically(1);
                if ((f3 <= 0.0f || zCanScrollVertically) && (f3 >= 0.0f || zCanScrollVertically2)) {
                }
            }
            return true;
        }
        return false;
    }
}
