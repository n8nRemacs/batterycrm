package defpackage;

import android.graphics.Rect;
import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class cad implements View.OnLayoutChangeListener {
    public final /* synthetic */ dad a;
    public final /* synthetic */ View b;
    public final /* synthetic */ long c;

    public cad(dad dadVar, View view, long j) {
        this.a = dadVar;
        this.b = view;
        this.c = j;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        dad dadVar = this.a;
        View view2 = (View) dadVar.c.b;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        View view3 = this.b;
        Rect rectC = view3 == null ? null : shh.c(view3, view2);
        if (rectC == null) {
            return;
        }
        dadVar.b.d(this.c, rectC);
    }
}
