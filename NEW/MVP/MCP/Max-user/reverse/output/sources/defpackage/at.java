package defpackage;

import android.view.Menu;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class at implements zde {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ at(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [dpd, sm6] */
    @Override // defpackage.zde
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new f2(2, (Object[]) this.b);
            case 1:
                return new f2(1, (float[]) this.b);
            case 2:
                return ((Iterable) this.b).iterator();
            case 3:
                return new e58(this);
            case 4:
                return new f2(3, (Menu) this.b);
            case 5:
                return mee.b((dpd) this.b);
            case 6:
                return (Iterator) this.b;
            case 7:
                Iterator it = ((Iterable) ((at) this.b).b).iterator();
                return !it.hasNext() ? gd5.a : mee.b(new x4f(200, 200, it, null));
            default:
                return new f2(9, (ViewGroup) this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public at(sm6 sm6Var) {
        this.a = 5;
        this.b = (dpd) sm6Var;
    }
}
