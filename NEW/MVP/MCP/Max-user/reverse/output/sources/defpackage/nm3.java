package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class nm3 implements Runnable {
    public final /* synthetic */ int X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int o;

    public /* synthetic */ nm3(View view, int i, int i2, int i3, int i4, View view2, int i5) {
        this.a = i5;
        this.b = view;
        this.c = i;
        this.d = i2;
        this.o = i3;
        this.X = i4;
        this.Y = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ik9 ik9Var = (ik9) this.Y;
                Rect rect = new Rect();
                View view = this.b;
                view.getHitRect(rect);
                rect.left -= this.c;
                rect.top -= this.d;
                rect.right += this.o;
                rect.bottom += this.X;
                if (!(ik9Var.getTouchDelegate() instanceof mm3)) {
                    ik9Var.setTouchDelegate(new mm3(ik9Var));
                }
                ((mm3) ik9Var.getTouchDelegate()).a.add(new TouchDelegate(rect, view));
                break;
            default:
                Rect rect2 = new Rect();
                View view2 = this.b;
                view2.getHitRect(rect2);
                rect2.left -= this.c;
                rect2.top -= this.d;
                rect2.right += this.o;
                rect2.bottom += this.X;
                this.Y.setTouchDelegate(new TouchDelegate(rect2, view2));
                break;
        }
    }
}
