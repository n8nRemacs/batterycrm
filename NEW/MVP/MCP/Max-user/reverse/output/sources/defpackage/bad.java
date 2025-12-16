package defpackage;

import android.graphics.Rect;
import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class bad implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ View a;
    public final /* synthetic */ dad b;
    public final /* synthetic */ mid c;
    public final /* synthetic */ long d;
    public final /* synthetic */ z9d o;

    public bad(View view, dad dadVar, mid midVar, long j, z9d z9dVar, boolean z) {
        this.a = view;
        this.b = dadVar;
        this.c = midVar;
        this.d = j;
        this.o = z9dVar;
        this.X = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.e(this.c.g())) {
            return;
        }
        this.b.f.remove(Long.valueOf(this.d));
        this.b.e.remove(this.o);
        View viewFindViewById = this.c.a.findViewById(this.o.c.a.toString().hashCode());
        View view = (View) this.b.c.b;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        Rect rectC = viewFindViewById == null ? null : shh.c(viewFindViewById, view);
        if (rectC == null) {
            return;
        }
        String str = this.b.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Play pending reaction effect, by place:" + rectC + ", onCreation:" + this.X, null);
            }
        }
        dad dadVar = this.b;
        z9d z9dVar = this.o;
        dad.c(dadVar, z9dVar.b, z9dVar.a, rectC);
        if (this.X) {
            this.c.a.addOnLayoutChangeListener(new cad(this.b, viewFindViewById, this.d));
        }
    }
}
