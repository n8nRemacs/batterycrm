package com.google.android.flexbox;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FlexboxItemDecoration.java */
/* loaded from: classes6.dex */
public class i extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        recyclerView.getClass();
        if (RecyclerView.U(view) == 0) {
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
    }
}
