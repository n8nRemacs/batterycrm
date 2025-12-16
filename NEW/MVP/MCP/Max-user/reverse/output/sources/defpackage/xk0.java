package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes.dex */
public final class xk0 implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ xk0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((al0) this.c).u0.x(this.b, 4);
                break;
            case 1:
                nud nudVar = (nud) this.c;
                int i = this.b;
                f8j f8jVar = (f8j) nudVar.b;
                if (f8jVar != null) {
                    f8jVar.b(i);
                    break;
                }
                break;
            case 2:
                ((MaterialCalendar) this.c).p1.B0(this.b);
                break;
            case 3:
                ((SystemForegroundService) this.c).o.cancel(this.b);
                break;
            case 4:
                ((RecyclerView) this.c).B0(this.b);
                break;
            default:
                ((wai) this.c).f(this.b);
                break;
        }
    }

    public xk0(int i, zgh zghVar) {
        this.a = 4;
        this.b = i;
        this.c = zghVar;
    }

    public xk0(al0 al0Var) {
        this.a = 0;
        this.c = al0Var;
        this.b = -1;
    }
}
