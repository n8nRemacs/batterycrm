package ru.ok.messages.views.widgets;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import defpackage.nkf;
import defpackage.yf5;

/* loaded from: classes2.dex */
public class StickyHeaderRecyclerView extends yf5 {
    @Keep
    public void onDrawVerticalScrollBar(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setBounds(i, i2, i3, i4);
    }

    public void setStickyHeaderDecorator(nkf nkfVar) {
    }
}
