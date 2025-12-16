package qY0;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MaterialDividerItemDecoration.java */
/* renamed from: qY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47361a extends RecyclerView.l {
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@j.N android.graphics.Rect r2, @j.N android.view.View r3, @j.N androidx.recyclerview.widget.RecyclerView r4, @j.N androidx.recyclerview.widget.RecyclerView.z r5) {
        /*
            r1 = this;
            r5 = 0
            r2.set(r5, r5, r5, r5)
            r4.getClass()
            int r3 = androidx.recyclerview.widget.RecyclerView.U(r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r4.getAdapter()
            if (r4 == 0) goto L1a
            int r4 = r4.getItemCount()
            r0 = 1
            int r4 = r4 - r0
            if (r3 != r4) goto L1a
            goto L1b
        L1a:
            r0 = r5
        L1b:
            r4 = -1
            if (r3 == r4) goto L23
            if (r0 == 0) goto L21
            goto L23
        L21:
            r2.right = r5
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qY0.C47361a.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(@j.N android.graphics.Canvas r7, @j.N androidx.recyclerview.widget.RecyclerView r8, @j.N androidx.recyclerview.widget.RecyclerView.z r9) {
        /*
            r6 = this;
            androidx.recyclerview.widget.RecyclerView$m r9 = r8.getLayoutManager()
            if (r9 != 0) goto L7
            return
        L7:
            r7.save()
            boolean r9 = r8.getClipToPadding()
            if (r9 == 0) goto L2e
            int r9 = r8.getPaddingTop()
            int r0 = r8.getHeight()
            int r1 = r8.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r8.getPaddingLeft()
            int r2 = r8.getWidth()
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            r7.clipRect(r1, r9, r2, r0)
            goto L31
        L2e:
            r8.getHeight()
        L31:
            int r9 = r8.getChildCount()
            r0 = 0
            r1 = r0
        L37:
            if (r1 >= r9) goto L63
            android.view.View r2 = r8.getChildAt(r1)
            int r3 = androidx.recyclerview.widget.RecyclerView.U(r2)
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r8.getAdapter()
            if (r4 == 0) goto L50
            int r4 = r4.getItemCount()
            r5 = 1
            int r4 = r4 - r5
            if (r3 != r4) goto L50
            goto L51
        L50:
            r5 = r0
        L51:
            r4 = -1
            if (r3 == r4) goto L60
            if (r5 == 0) goto L57
            goto L60
        L57:
            androidx.recyclerview.widget.RecyclerView$m r7 = r8.getLayoutManager()
            r8 = 0
            r7.i0(r2, r8)
            throw r8
        L60:
            int r1 = r1 + 1
            goto L37
        L63:
            r7.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qY0.C47361a.onDraw(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
