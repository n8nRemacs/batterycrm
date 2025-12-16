package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class gm {
    public final ArrayList a = new ArrayList();
    public boolean b = true;
    public boolean c;
    public boolean d;
    public boolean e;

    public final void a(fm fmVar) {
        this.a.add(fmVar);
        this.b &= fmVar.a();
        this.c |= fmVar.c();
        this.d |= !fmVar.b();
        this.e = fmVar.b() | this.e;
    }

    public final void b(String str, String str2) {
        a(new nmf(str, str2));
    }

    public final void c(gy7 gy7Var) {
        if (this.d) {
            ArrayList arrayList = this.a;
            if (arrayList.size() > 1) {
                ze3.s(new s55(9), arrayList);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fm fmVar = (fm) it.next();
                if (!fmVar.b()) {
                    fmVar.d(gy7Var);
                }
            }
        }
    }

    public final void d(gy7 gy7Var) {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                fm fmVar = (fm) it.next();
                if (fmVar.b()) {
                    fmVar.d(gy7Var);
                }
            }
        }
    }
}
