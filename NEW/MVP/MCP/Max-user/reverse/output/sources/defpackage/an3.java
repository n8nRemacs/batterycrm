package defpackage;

import android.util.Log;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.apache.http.HttpHost;

/* loaded from: classes.dex */
public final class an3 {
    public final /* synthetic */ int a;
    public int b;
    public final ArrayList c;
    public ArrayList d;
    public Object e;
    public Object f;
    public Serializable g;
    public Object h;
    public Object i;

    public an3(zm3 zm3Var, ym3 ym3Var) {
        this.a = 0;
        this.c = new ArrayList();
        this.g = new IdentityHashMap();
        this.d = new ArrayList();
        this.h = new c0();
        this.e = zm3Var;
        if (ym3Var.a) {
            bj bjVar = new bj(19, false);
            bjVar.c = new SparseArray();
            bjVar.b = 0;
            this.f = bjVar;
        } else {
            vgd vgdVar = new vgd(11);
            vgdVar.b = new SparseArray();
            this.f = vgdVar;
        }
        int i = ym3Var.b;
        this.b = i;
        if (i == 1) {
            w7c w7cVar = new w7c();
            w7cVar.a = new u1j(29);
            this.i = w7cVar;
        } else if (i == 2) {
            n7 n7Var = new n7();
            n7Var.a = 0L;
            this.i = n7Var;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.i = new n4e();
        }
    }

    public boolean a(int i, phd phdVar) {
        ArrayList arrayList = this.d;
        if (i < 0 || i > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i);
        }
        if (this.b != 1) {
            z5j.a("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", phdVar.b);
        } else if (phdVar.b) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int i2 = i(phdVar);
        if ((i2 == -1 ? null : (lda) arrayList.get(i2)) != null) {
            return false;
        }
        lda ldaVar = new lda(phdVar, this, (ohh) this.f, ((n9f) this.i).d());
        arrayList.add(i, ldaVar);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                phdVar.q(recyclerView);
            }
        }
        if (ldaVar.e > 0) {
            ((zm3) this.e).p(d(ldaVar), ldaVar.e);
        }
        c();
        return true;
    }

    public ga7 b() {
        ArrayList arrayList;
        String str = (String) this.e;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = mni.E(0, (String) this.f, 0, 7);
        String strE2 = mni.E(0, (String) this.g, 0, 7);
        String str2 = (String) this.h;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iE = e();
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = new ArrayList(we3.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(mni.E(0, (String) it.next(), 0, 7));
        }
        ArrayList<String> arrayList4 = this.d;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(we3.q(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? mni.E(0, str3, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.i;
        return new ga7(str, strE, strE2, str2, iE, arrayList, str4 != null ? mni.E(0, str4, 0, 7) : null, toString());
    }

    public void c() {
        int i;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            lda ldaVar = (lda) it.next();
            int i2 = ldaVar.c.c;
            i = 3;
            if (i2 == 3 || (i2 == 2 && ldaVar.e == 0)) {
                break;
            }
        }
        zm3 zm3Var = (zm3) this.e;
        if (i != zm3Var.c) {
            zm3Var.c = i;
            zm3Var.a.g();
        }
    }

    public int d(lda ldaVar) {
        lda ldaVar2;
        Iterator it = this.d.iterator();
        int i = 0;
        while (it.hasNext() && (ldaVar2 = (lda) it.next()) != ldaVar) {
            i += ldaVar2.e;
        }
        return i;
    }

    public int e() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.e;
        int iHashCode = str.hashCode();
        return iHashCode != 3213448 ? (iHashCode == 99617003 && str.equals("https")) ? 443 : -1 : str.equals(HttpHost.DEFAULT_SCHEME_NAME) ? 80 : -1;
    }

    public c0 f(int i) {
        c0 c0Var = (c0) this.h;
        if (c0Var.b) {
            c0Var = new c0();
        } else {
            c0Var.b = true;
        }
        Iterator it = this.d.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            lda ldaVar = (lda) it.next();
            int i3 = ldaVar.e;
            if (i3 > i2) {
                c0Var.c = ldaVar;
                c0Var.a = i2;
                break;
            }
            i2 -= i3;
        }
        if (((lda) c0Var.c) != null) {
            return c0Var;
        }
        throw new IllegalArgumentException(ho7.f(i, "Cannot find wrapper for "));
    }

    public lda g(mid midVar) {
        lda ldaVar = (lda) ((IdentityHashMap) this.g).get(midVar);
        if (ldaVar != null) {
            return ldaVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + midVar + ", seems like it is not bound by this adapter: " + this);
    }

    public void h(String str) {
        String strE = mei.e(mni.E(0, str, 0, 7));
        if (strE == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.h = strE;
    }

    public int i(phd phdVar) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((lda) arrayList.get(i)).c == phdVar) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(defpackage.ga7 r19, java.lang.String r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an3.j(ga7, java.lang.String):void");
    }

    public void k(int i) {
        if (1 > i || 65535 < i) {
            throw new IllegalArgumentException(ho7.f(i, "unexpected port: ").toString());
        }
        this.b = i;
    }

    public void l(String str) {
        if (this.d == null) {
            return;
        }
        String strY = mni.y(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219);
        int size = this.d.size() - 2;
        ro7 ro7Var = new ro7(size, x6j.a(size, 0, -1), -2);
        int i = ro7Var.a;
        int i2 = ro7Var.b;
        int i3 = ro7Var.c;
        if (i3 >= 0) {
            if (i > i2) {
                return;
            }
        } else if (i < i2) {
            return;
        }
        while (true) {
            if (strY.equals((String) this.d.get(i))) {
                this.d.remove(i + 1);
                this.d.remove(i);
                if (this.d.isEmpty()) {
                    this.d = null;
                    return;
                }
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an3.toString():java.lang.String");
    }

    public an3() {
        this.a = 1;
        this.f = "";
        this.g = "";
        this.b = -1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add("");
    }
}
