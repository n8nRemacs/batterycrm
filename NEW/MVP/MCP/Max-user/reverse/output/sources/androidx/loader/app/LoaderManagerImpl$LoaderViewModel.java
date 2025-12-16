package androidx.loader.app;

import defpackage.kc8;
import defpackage.lc8;
import defpackage.lii;
import defpackage.r7f;
import defpackage.yfh;

/* loaded from: classes.dex */
class LoaderManagerImpl$LoaderViewModel extends yfh {
    public static final a d = new a();
    public final r7f b = new r7f(0);
    public boolean c = false;

    @Override // defpackage.yfh
    public final void d() {
        r7f r7fVar = this.b;
        int i = r7fVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            kc8 kc8Var = (kc8) r7fVar.b[i2];
            lii liiVar = kc8Var.l;
            liiVar.a();
            liiVar.c = true;
            lc8 lc8Var = kc8Var.n;
            if (lc8Var != null) {
                kc8Var.j(lc8Var);
            }
            kc8 kc8Var2 = liiVar.a;
            if (kc8Var2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (kc8Var2 != kc8Var) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            liiVar.a = null;
            if (lc8Var != null) {
                boolean z = lc8Var.b;
            }
            liiVar.d = true;
            liiVar.b = false;
            liiVar.c = false;
            liiVar.e = false;
        }
        int i3 = r7fVar.c;
        Object[] objArr = r7fVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        r7fVar.c = 0;
    }
}
