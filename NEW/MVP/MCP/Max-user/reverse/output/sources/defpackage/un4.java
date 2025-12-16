package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class un4 extends uhd {
    public static TimeInterpolator s;
    public boolean g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;

    public un4() {
        this.a = null;
        this.b = new ArrayList();
        this.c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f = 250L;
        this.g = true;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
    }

    public static void i(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((mid) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.uhd
    public final boolean a(mid midVar, mid midVar2, kt ktVar, kt ktVar2) {
        int i;
        int i2;
        int i3 = ktVar.b;
        int i4 = ktVar.c;
        if (midVar2.x()) {
            int i5 = ktVar.b;
            i2 = ktVar.c;
            i = i5;
        } else {
            i = ktVar2.b;
            i2 = ktVar2.c;
        }
        if (midVar == midVar2) {
            return h(midVar, i3, i4, i, i2);
        }
        View view = midVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        n(midVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = midVar2.a;
        n(midVar2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        sn4 sn4Var = new sn4();
        sn4Var.a = midVar;
        sn4Var.b = midVar2;
        sn4Var.c = i3;
        sn4Var.d = i4;
        sn4Var.e = i;
        sn4Var.f = i2;
        this.k.add(sn4Var);
        return true;
    }

    @Override // defpackage.uhd
    public final void d(mid midVar) {
        View view = midVar.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((tn4) arrayList.get(size)).a == midVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(midVar);
                arrayList.remove(size);
            }
        }
        k(this.k, midVar);
        if (this.h.remove(midVar)) {
            view.setAlpha(1.0f);
            m();
            c(midVar);
        }
        if (this.i.remove(midVar)) {
            view.setAlpha(1.0f);
            c(midVar);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            k(arrayList3, midVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((tn4) arrayList5.get(size4)).a == midVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(midVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(midVar)) {
                view.setAlpha(1.0f);
                c(midVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(midVar);
        this.o.remove(midVar);
        this.r.remove(midVar);
        this.p.remove(midVar);
        j();
    }

    @Override // defpackage.uhd
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            tn4 tn4Var = (tn4) arrayList.get(size);
            View view = tn4Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(tn4Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            mid midVar = (mid) arrayList2.get(size2);
            m();
            c(midVar);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            mid midVar2 = (mid) arrayList3.get(size3);
            midVar2.a.setAlpha(1.0f);
            c(midVar2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            sn4 sn4Var = (sn4) arrayList4.get(size4);
            mid midVar3 = sn4Var.a;
            if (midVar3 != null) {
                l(sn4Var, midVar3);
            }
            mid midVar4 = sn4Var.b;
            if (midVar4 != null) {
                l(sn4Var, midVar4);
            }
        }
        arrayList4.clear();
        if (g()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    tn4 tn4Var2 = (tn4) arrayList6.get(size6);
                    View view2 = tn4Var2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(tn4Var2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    mid midVar5 = (mid) arrayList8.get(size8);
                    midVar5.a.setAlpha(1.0f);
                    c(midVar5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    sn4 sn4Var2 = (sn4) arrayList10.get(size10);
                    mid midVar6 = sn4Var2.a;
                    if (midVar6 != null) {
                        l(sn4Var2, midVar6);
                    }
                    mid midVar7 = sn4Var2.b;
                    if (midVar7 != null) {
                        l(sn4Var2, midVar7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            i(this.q);
            i(this.p);
            i(this.o);
            i(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() > 0) {
                throw xrf.n(arrayList11, 0);
            }
            arrayList11.clear();
        }
    }

    @Override // defpackage.uhd
    public final boolean g() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean h(mid midVar, int i, int i2, int i3, int i4) {
        View view = midVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) midVar.a.getTranslationY());
        n(midVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(midVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        tn4 tn4Var = new tn4();
        tn4Var.a = midVar;
        tn4Var.b = translationX;
        tn4Var.c = translationY;
        tn4Var.d = i3;
        tn4Var.e = i4;
        this.j.add(tn4Var);
        return true;
    }

    public final void j() {
        if (g()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            throw xrf.n(arrayList, 0);
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList, mid midVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sn4 sn4Var = (sn4) arrayList.get(size);
            if (l(sn4Var, midVar) && sn4Var.a == null && sn4Var.b == null) {
                arrayList.remove(sn4Var);
            }
        }
    }

    public final boolean l(sn4 sn4Var, mid midVar) {
        if (sn4Var.b == midVar) {
            sn4Var.b = null;
        } else {
            if (sn4Var.a != midVar) {
                return false;
            }
            sn4Var.a = null;
        }
        View view = midVar.a;
        View view2 = midVar.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(midVar);
        return true;
    }

    public void m() {
    }

    public final void n(mid midVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        midVar.a.animate().setInterpolator(s);
        d(midVar);
    }
}
