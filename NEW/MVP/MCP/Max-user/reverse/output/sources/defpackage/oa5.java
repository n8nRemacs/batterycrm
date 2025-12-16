package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class oa5 extends eaj {
    public final /* synthetic */ pa5 a;

    public oa5(pa5 pa5Var) {
        this.a = pa5Var;
    }

    @Override // defpackage.eaj
    public final void a(Throwable th) {
        ((ta5) this.a.a).e(th);
    }

    @Override // defpackage.eaj
    public final void b(hz9 hz9Var) {
        pa5 pa5Var = this.a;
        if (hz9Var == null) {
            ((ta5) pa5Var.a).e(new IllegalArgumentException("metadataRepo cannot be null"));
            return;
        }
        pa5Var.c = hz9Var;
        hz9 hz9Var2 = (hz9) pa5Var.c;
        ta5 ta5Var = (ta5) pa5Var.a;
        uha uhaVar = ta5Var.g;
        sm4 sm4Var = ta5Var.k;
        int[] iArr = ta5Var.i;
        Set<int[]> setA = Build.VERSION.SDK_INT >= 34 ? cb5.a() : faj.a();
        fde fdeVar = new fde();
        fdeVar.a = uhaVar;
        fdeVar.b = hz9Var2;
        fdeVar.c = sm4Var;
        fdeVar.d = iArr;
        if (!setA.isEmpty()) {
            for (int[] iArr2 : setA) {
                String str = new String(iArr2, 0, iArr2.length);
                fdeVar.G(str, 0, str.length(), 1, true, new gz4(str));
            }
        }
        pa5Var.b = fdeVar;
        ta5 ta5Var2 = (ta5) pa5Var.a;
        ta5Var2.getClass();
        ArrayList arrayList = new ArrayList();
        ta5Var2.a.writeLock().lock();
        try {
            ta5Var2.c = 1;
            arrayList.addAll(ta5Var2.b);
            ta5Var2.b.clear();
            ta5Var2.a.writeLock().unlock();
            ta5Var2.d.post(new hp(arrayList, ta5Var2.c, (Throwable) null));
        } catch (Throwable th) {
            ta5Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
