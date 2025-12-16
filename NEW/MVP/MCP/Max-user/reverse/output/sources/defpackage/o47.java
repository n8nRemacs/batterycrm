package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o47 extends nae {
    public static void i(i57 i57Var, d57 d57Var, HashSet hashSet, ArrayList arrayList) {
        String str = i57Var.a;
        long j = i57Var.h + d57Var.o;
        String str2 = d57Var.Y;
        if (str2 != null) {
            Uri uriE = moi.e(str, str2);
            if (hashSet.add(uriE)) {
                arrayList.add(new lae(j, nae.d(uriE)));
            }
        }
        arrayList.add(new lae(j, new ze4(moi.e(str, d57Var.a), d57Var.s0, d57Var.t0)));
    }

    @Override // defpackage.nae
    public final ArrayList e(ly0 ly0Var, mz5 mz5Var, boolean z) throws IOException {
        o47 o47Var = this;
        boolean z2 = z;
        s57 s57Var = (s57) mz5Var;
        ArrayList arrayList = new ArrayList();
        if (s57Var instanceof q57) {
            List list = ((q57) s57Var).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(nae.d((Uri) list.get(i)));
            }
        } else {
            arrayList.add(nae.d(Uri.parse(s57Var.a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ze4 ze4Var = (ze4) it.next();
            arrayList2.add(new lae(0L, ze4Var));
            try {
            } catch (IOException e) {
                e = e;
            }
            try {
                i57 i57Var = (i57) ((mz5) o47Var.c(new iae(o47Var, ly0Var, ze4Var), z2));
                wg7 wg7Var = i57Var.r;
                long j = z2 ? 0L : o47Var.a;
                long j2 = z2 ? -9223372036854775807L : o47Var.b;
                d57 d57Var = null;
                for (int i2 = 0; i2 < wg7Var.size(); i2++) {
                    d57 d57Var2 = (d57) wg7Var.get(i2);
                    long j3 = i57Var.h + d57Var2.o;
                    if (j3 + d57Var2.c > j) {
                        if (j2 == -9223372036854775807L || j3 < j + j2) {
                            d57 d57Var3 = d57Var2.b;
                            if (d57Var3 != null && d57Var3 != d57Var) {
                                i(i57Var, d57Var3, hashSet, arrayList2);
                                d57Var = d57Var3;
                            }
                            i(i57Var, d57Var2, hashSet, arrayList2);
                        }
                    }
                }
            } catch (IOException e2) {
                e = e2;
                if (!z) {
                    throw e;
                }
                o47Var = this;
                z2 = z;
            }
            o47Var = this;
            z2 = z;
        }
        return arrayList2;
    }
}
