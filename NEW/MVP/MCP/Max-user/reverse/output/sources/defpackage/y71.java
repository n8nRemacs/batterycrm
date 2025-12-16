package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes.dex */
public final class y71 extends vhd {
    public final /* synthetic */ int a;

    public /* synthetic */ y71(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    @Override // defpackage.vhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.graphics.Rect r4, android.view.View r5, androidx.recyclerview.widget.RecyclerView r6, defpackage.iid r7) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y71.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, iid):void");
    }

    @Override // defpackage.vhd
    public void g(Canvas canvas, RecyclerView recyclerView, iid iidVar) {
        switch (this.a) {
            case 7:
                if ((recyclerView.getAdapter() instanceof g7i) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public y71(MaterialCalendar materialCalendar) {
        this.a = 7;
        vxg.c(null);
        vxg.c(null);
    }
}
