package defpackage;

import android.graphics.Rect;
import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class aad implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ View a;
    public final /* synthetic */ dad b;
    public final /* synthetic */ View c;
    public final /* synthetic */ z9d d;
    public final /* synthetic */ x8d o;

    public aad(View view, dad dadVar, View view2, z9d z9dVar, x8d x8dVar, long j) {
        this.a = view;
        this.b = dadVar;
        this.c = view2;
        this.d = z9dVar;
        this.o = x8dVar;
        this.X = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dad dadVar = this.b;
        View view = this.c;
        View view2 = (View) dadVar.c.b;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        Rect rectC = view == null ? null : shh.c(view, view2);
        if (rectC == null) {
            return;
        }
        String str = this.b.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                x8d x8dVar = this.o;
                l6bVar.c(lg8Var, str, "Play reaction effect without pending, reaction:" + ((Object) x8dVar) + ", l:" + this.X, null);
            }
        }
        dad dadVar2 = this.b;
        z9d z9dVar = this.d;
        dad.c(dadVar2, z9dVar.b, z9dVar.a, rectC);
    }
}
