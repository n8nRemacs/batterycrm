package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class od6 implements da8 {
    public final c9a X;
    public em6 Y;
    public sm6 Z;
    public final boolean a;
    public final nm8 b;
    public final String c;
    public nd6 d;
    public neb o;
    public List s0;
    public final ArrayList t0;
    public List u0;
    public final iv v0;
    public String w0;

    public od6(int i, ExecutorService executorService) {
        boolean z = (i & 1) != 0;
        executorService = (i & 2) != 0 ? e03.a.a().a() : executorService;
        nm8 nm8Var = (nm8) e03.a.getAccessor().c(2);
        this.a = z;
        this.b = nm8Var;
        this.c = od6.class.getName();
        this.X = new c9a();
        this.t0 = new ArrayList();
        this.u0 = hd5.a;
        this.v0 = new iv(this, new xt4(executorService, 4, new yf4(6)));
    }

    public final i40 a(neb nebVar, ViewPager2 viewPager2, em6 em6Var, sm6 sm6Var) {
        this.o = nebVar;
        this.Y = em6Var;
        this.Z = sm6Var;
        nd6 nd6Var = new nd6(0, this);
        nebVar.a(nd6Var);
        this.d = nd6Var;
        return new i40(nebVar, viewPager2, new md6(this, nebVar, 0), new md6(this, nebVar, 1));
    }

    @Override // defpackage.da8
    public final void b(int i, int i2) {
        neb nebVar = this.o;
        if (nebVar == null) {
            return;
        }
        aya ayaVar = (aya) this.t0.remove(i);
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                StringBuilder sbK = wy1.k("onMoved: from=", i, " to=", i2, " model=");
                sbK.append(ayaVar);
                l6bVar.c(lg8Var, str, sbK.toString(), null);
            }
        }
        e("onMoved");
        this.t0.add(i2, ayaVar);
        e("onMoved");
        nebVar.l(i);
        iyf iyfVarI = nebVar.i();
        if (d(iyfVarI, i2)) {
            nebVar.b(iyfVarI, i2, nebVar.b.isEmpty());
        }
        i();
    }

    @Override // defpackage.da8
    public final void c(int i, int i2) {
        int i3;
        int i4;
        lg8 lg8Var = lg8.d;
        neb nebVar = this.o;
        if (nebVar == null) {
            return;
        }
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, ho7.g("onInserted: pos=", i, i2, " count="), null);
        }
        e("onInserted before");
        Iterator it = this.v0.f.iterator();
        int i5 = i;
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            aya ayaVar = (aya) it.next();
            Iterator it2 = this.u0.iterator();
            int i6 = 0;
            while (true) {
                i4 = -1;
                if (!it2.hasNext()) {
                    i6 = -1;
                    break;
                }
                if (fni.a(ayaVar.a, ((aya) it2.next()).a)) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 < 0) {
                Iterator it3 = this.t0.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (fni.a(ayaVar.a, ((aya) it3.next()).a)) {
                        i4 = i3;
                        break;
                    }
                    i3++;
                }
                if (i4 < 0) {
                    String str2 = this.c;
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                        l6bVar2.c(lg8Var, str2, "onInserted: " + i5 + " " + ayaVar, null);
                    }
                    this.t0.add(i5, ayaVar);
                    i5++;
                }
            }
        }
        e("onInserted after");
        while (i3 < i2) {
            iyf iyfVarI = nebVar.i();
            int i7 = i + i3;
            if (d(iyfVarI, i7)) {
                nebVar.b(iyfVarI, i7, nebVar.b.isEmpty());
            }
            i3++;
        }
        i();
    }

    public final boolean d(iyf iyfVar, int i) {
        View view = iyfVar.b;
        meb mebVar = view instanceof meb ? (meb) view : null;
        aya ayaVar = (aya) ue3.J(i, this.t0);
        if (ayaVar == null) {
            return false;
        }
        if (mebVar != null) {
            mebVar.setTabItem(ayaVar);
            return true;
        }
        neb nebVar = this.o;
        if (nebVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        meb mebVar2 = new meb(nebVar.getContext());
        mebVar2.setIndicatorVisible(this.a);
        mebVar2.setTabItem(ayaVar);
        iyfVar.d.setId(View.generateViewId());
        iyfVar.b = mebVar2;
        kyf kyfVar = iyfVar.d;
        if (kyfVar != null) {
            kyfVar.d();
        }
        iyfVar.d.setOnLongClickListener(new yi2(this, mebVar2, ayaVar, 7));
        int iD = kti.d(13 * vw4.d().getDisplayMetrics().density);
        kyf kyfVar2 = iyfVar.d;
        kyfVar2.setPadding(iD, kyfVar2.getPaddingTop(), iD, kyfVar2.getPaddingBottom());
        kyf kyfVar3 = iyfVar.d;
        mgb.a(kyfVar3, new zn6(kyfVar3, 8, this));
        return true;
    }

    public final void e(String str) {
        lg8 lg8Var = lg8.d;
        if (this.t0.isEmpty()) {
            String str2 = this.c;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, str.concat(": RenderTabs are empty!"), null);
                return;
            }
            return;
        }
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            aya ayaVar = (aya) it.next();
            String str3 = this.c;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str3, str + ": " + ayaVar, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.CharSequence, xxa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od6.f(java.util.List):void");
    }

    @Override // defpackage.da8
    public final void g(int i, int i2) {
        neb nebVar = this.o;
        if (nebVar == null) {
            return;
        }
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, ho7.g("onRemoved: pos=", i, i2, " count="), null);
            }
        }
        e("onRemoved");
        for (int i3 = 0; i3 < i2; i3++) {
            nebVar.l(i);
            this.t0.remove(i);
        }
        e("onRemoved");
        i();
    }

    @Override // defpackage.da8
    public final void h(int i, int i2, Object obj) {
        neb nebVar = this.o;
        if (nebVar == null) {
            return;
        }
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                Object objJ = ue3.J(i, this.v0.f);
                StringBuilder sbK = wy1.k("onChanged: pos=", i, " count=", i2, " payload=");
                sbK.append(obj);
                sbK.append(" model=");
                sbK.append(objJ);
                l6bVar.c(lg8Var, str, sbK.toString(), null);
            }
        }
        int i3 = i2 + i;
        while (i < i3) {
            iyf iyfVarH = nebVar.h(i);
            if (iyfVarH != null) {
                aya ayaVar = (aya) this.v0.f.get(i);
                View view = iyfVarH.b;
                meb mebVar = view instanceof meb ? (meb) view : null;
                if (mebVar != null) {
                    mebVar.setTabItem(ayaVar);
                }
            }
            i++;
        }
        i();
    }

    public final void i() {
        neb nebVar = this.o;
        if (nebVar == null) {
            return;
        }
        int tabCount = nebVar.getTabCount();
        iv ivVar = this.v0;
        if (ivVar.f.isEmpty() || tabCount == 0) {
            return;
        }
        int i = tabCount - 1;
        Iterator it = ivVar.f.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((aya) it.next()).c == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 <= i) {
            i = i2;
        }
        if (i < 0 || i == nebVar.getSelectedTabPosition()) {
            return;
        }
        nebVar.n(nebVar.h(i), true);
    }
}
