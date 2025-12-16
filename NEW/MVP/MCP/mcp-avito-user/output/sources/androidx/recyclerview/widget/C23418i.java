package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23418i extends O {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f54015s;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<RecyclerView.C> f54016h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList<RecyclerView.C> f54017i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList<e> f54018j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<d> f54019k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.C>> f54020l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<ArrayList<e>> f54021m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList<ArrayList<d>> f54022n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList<RecyclerView.C> f54023o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList<RecyclerView.C> f54024p = new ArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList<RecyclerView.C> f54025q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList<RecyclerView.C> f54026r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$a */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f54027b;

        public a(ArrayList arrayList) {
            this.f54027b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f54027b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C23418i c23418i = C23418i.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c23418i.f54021m.remove(arrayList);
                    return;
                }
                e eVar = (e) it.next();
                RecyclerView.C c12 = eVar.f54039a;
                c23418i.getClass();
                View view = c12.itemView;
                int i12 = eVar.f54042d - eVar.f54040b;
                int i13 = eVar.f54043e - eVar.f54041c;
                if (i12 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i13 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c23418i.f54024p.add(c12);
                viewPropertyAnimatorAnimate.setDuration(c23418i.f53831e).setListener(new C23421l(c23418i, c12, i12, view, i13, viewPropertyAnimatorAnimate)).start();
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$b */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f54029b;

        public b(ArrayList arrayList) {
            this.f54029b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f54029b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C23418i c23418i = C23418i.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c23418i.f54022n.remove(arrayList);
                    return;
                }
                d dVar = (d) it.next();
                c23418i.getClass();
                RecyclerView.C c12 = dVar.f54033a;
                View view = c12 == null ? null : c12.itemView;
                RecyclerView.C c13 = dVar.f54034b;
                View view2 = c13 != null ? c13.itemView : null;
                ArrayList<RecyclerView.C> arrayList2 = c23418i.f54026r;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(c23418i.f53832f);
                    arrayList2.add(dVar.f54033a);
                    duration.translationX(dVar.f54037e - dVar.f54035c);
                    duration.translationY(dVar.f54038f - dVar.f54036d);
                    duration.alpha(0.0f).setListener(new C23422m(c23418i, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    arrayList2.add(dVar.f54034b);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(c23418i.f53832f).alpha(1.0f).setListener(new C23423n(c23418i, dVar, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$c */
    public class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f54031b;

        public c(ArrayList arrayList) {
            this.f54031b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f54031b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C23418i c23418i = C23418i.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c23418i.f54020l.remove(arrayList);
                    return;
                }
                RecyclerView.C c12 = (RecyclerView.C) it.next();
                c23418i.getClass();
                View view = c12.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c23418i.f54023o.add(c12);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(c23418i.f53829c).setListener(new C23420k(view, viewPropertyAnimatorAnimate, c23418i, c12)).start();
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.C f54033a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.C f54034b;

        /* renamed from: c, reason: collision with root package name */
        public int f54035c;

        /* renamed from: d, reason: collision with root package name */
        public int f54036d;

        /* renamed from: e, reason: collision with root package name */
        public int f54037e;

        /* renamed from: f, reason: collision with root package name */
        public int f54038f;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f54033a);
            sb2.append(", newHolder=");
            sb2.append(this.f54034b);
            sb2.append(", fromX=");
            sb2.append(this.f54035c);
            sb2.append(", fromY=");
            sb2.append(this.f54036d);
            sb2.append(", toX=");
            sb2.append(this.f54037e);
            sb2.append(", toY=");
            return androidx.appcompat.app.r.t(sb2, this.f54038f, '}');
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.i$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.C f54039a;

        /* renamed from: b, reason: collision with root package name */
        public int f54040b;

        /* renamed from: c, reason: collision with root package name */
        public int f54041c;

        /* renamed from: d, reason: collision with root package name */
        public int f54042d;

        /* renamed from: e, reason: collision with root package name */
        public int f54043e;
    }

    public static void s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.C) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean g(@j.N RecyclerView.C c12, @j.N List<Object> list) {
        return !list.isEmpty() || f(c12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void j(RecyclerView.C c12) {
        View view = c12.itemView;
        view.animate().cancel();
        ArrayList<e> arrayList = this.f54018j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f54039a == c12) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(c12);
                arrayList.remove(size);
            }
        }
        u(this.f54019k, c12);
        if (this.f54016h.remove(c12)) {
            view.setAlpha(1.0f);
            h(c12);
        }
        if (this.f54017i.remove(c12)) {
            view.setAlpha(1.0f);
            h(c12);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.f54022n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            u(arrayList3, c12);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.f54021m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).f54039a == c12) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(c12);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.C>> arrayList6 = this.f54020l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.C> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(c12)) {
                view.setAlpha(1.0f);
                h(c12);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f54025q.remove(c12);
        this.f54023o.remove(c12);
        this.f54026r.remove(c12);
        this.f54024p.remove(c12);
        t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void k() {
        ArrayList<e> arrayList = this.f54018j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view = eVar.f54039a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(eVar.f54039a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.C> arrayList2 = this.f54016h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.C> arrayList3 = this.f54017i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C c12 = arrayList3.get(size3);
            c12.itemView.setAlpha(1.0f);
            h(c12);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.f54019k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            d dVar = arrayList4.get(size4);
            RecyclerView.C c13 = dVar.f54033a;
            if (c13 != null) {
                v(dVar, c13);
            }
            RecyclerView.C c14 = dVar.f54034b;
            if (c14 != null) {
                v(dVar, c14);
            }
        }
        arrayList4.clear();
        if (l()) {
            ArrayList<ArrayList<e>> arrayList5 = this.f54021m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<e> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    e eVar2 = arrayList6.get(size6);
                    View view2 = eVar2.f54039a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(eVar2.f54039a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.C>> arrayList7 = this.f54020l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.C> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C c15 = arrayList8.get(size8);
                    c15.itemView.setAlpha(1.0f);
                    h(c15);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<d>> arrayList9 = this.f54022n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<d> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    d dVar2 = arrayList10.get(size10);
                    RecyclerView.C c16 = dVar2.f54033a;
                    if (c16 != null) {
                        v(dVar2, c16);
                    }
                    RecyclerView.C c17 = dVar2.f54034b;
                    if (c17 != null) {
                        v(dVar2, c17);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            s(this.f54025q);
            s(this.f54024p);
            s(this.f54023o);
            s(this.f54026r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean l() {
        return (this.f54017i.isEmpty() && this.f54019k.isEmpty() && this.f54018j.isEmpty() && this.f54016h.isEmpty() && this.f54024p.isEmpty() && this.f54025q.isEmpty() && this.f54023o.isEmpty() && this.f54026r.isEmpty() && this.f54021m.isEmpty() && this.f54020l.isEmpty() && this.f54022n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void n() {
        ArrayList<RecyclerView.C> arrayList = this.f54016h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.f54018j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.f54019k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList<RecyclerView.C> arrayList4 = this.f54017i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.C> it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.C next = it.next();
            View view = next.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f54025q.add(next);
            viewPropertyAnimatorAnimate.setDuration(this.f53830d).alpha(0.0f).setListener(new C23419j(view, viewPropertyAnimatorAnimate, this, next)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList<e> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.f54021m.add(arrayList5);
            arrayList2.clear();
            a aVar = new a(arrayList5);
            if (zIsEmpty) {
                aVar.run();
            } else {
                View view2 = arrayList5.get(0).f54039a.itemView;
                long j12 = this.f53830d;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                view2.postOnAnimationDelayed(aVar, j12);
            }
        }
        if (!zIsEmpty3) {
            ArrayList<d> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.f54022n.add(arrayList6);
            arrayList3.clear();
            b bVar = new b(arrayList6);
            if (zIsEmpty) {
                bVar.run();
            } else {
                View view3 = arrayList6.get(0).f54033a.itemView;
                long j13 = this.f53830d;
                WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                view3.postOnAnimationDelayed(bVar, j13);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.C> arrayList7 = new ArrayList<>();
        arrayList7.addAll(arrayList4);
        this.f54020l.add(arrayList7);
        arrayList4.clear();
        c cVar = new c(arrayList7);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
            return;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.f53831e : 0L, zIsEmpty3 ? 0L : this.f53832f) + (!zIsEmpty ? this.f53830d : 0L);
        View view4 = arrayList7.get(0).itemView;
        WeakHashMap<View, A0> weakHashMap3 = C22823h0.f45055a;
        view4.postOnAnimationDelayed(cVar, jMax);
    }

    @Override // androidx.recyclerview.widget.O
    public final boolean o(RecyclerView.C c12) {
        w(c12);
        c12.itemView.setAlpha(0.0f);
        this.f54017i.add(c12);
        return true;
    }

    @Override // androidx.recyclerview.widget.O
    public final boolean p(RecyclerView.C c12, RecyclerView.C c13, int i12, int i13, int i14, int i15) {
        if (c12 == c13) {
            return q(c12, i12, i13, i14, i15);
        }
        float translationX = c12.itemView.getTranslationX();
        float translationY = c12.itemView.getTranslationY();
        float alpha = c12.itemView.getAlpha();
        w(c12);
        int i16 = (int) ((i14 - i12) - translationX);
        int i17 = (int) ((i15 - i13) - translationY);
        c12.itemView.setTranslationX(translationX);
        c12.itemView.setTranslationY(translationY);
        c12.itemView.setAlpha(alpha);
        if (c13 != null) {
            w(c13);
            c13.itemView.setTranslationX(-i16);
            c13.itemView.setTranslationY(-i17);
            c13.itemView.setAlpha(0.0f);
        }
        ArrayList<d> arrayList = this.f54019k;
        d dVar = new d();
        dVar.f54033a = c12;
        dVar.f54034b = c13;
        dVar.f54035c = i12;
        dVar.f54036d = i13;
        dVar.f54037e = i14;
        dVar.f54038f = i15;
        arrayList.add(dVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.O
    public final boolean q(RecyclerView.C c12, int i12, int i13, int i14, int i15) {
        View view = c12.itemView;
        int translationX = i12 + ((int) view.getTranslationX());
        int translationY = i13 + ((int) c12.itemView.getTranslationY());
        w(c12);
        int i16 = i14 - translationX;
        int i17 = i15 - translationY;
        if (i16 == 0 && i17 == 0) {
            h(c12);
            return false;
        }
        if (i16 != 0) {
            view.setTranslationX(-i16);
        }
        if (i17 != 0) {
            view.setTranslationY(-i17);
        }
        ArrayList<e> arrayList = this.f54018j;
        e eVar = new e();
        eVar.f54039a = c12;
        eVar.f54040b = translationX;
        eVar.f54041c = translationY;
        eVar.f54042d = i14;
        eVar.f54043e = i15;
        arrayList.add(eVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.O
    public final boolean r(RecyclerView.C c12) {
        w(c12);
        this.f54016h.add(c12);
        return true;
    }

    public final void t() {
        if (l()) {
            return;
        }
        i();
    }

    public final void u(ArrayList arrayList, RecyclerView.C c12) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (v(dVar, c12) && dVar.f54033a == null && dVar.f54034b == null) {
                arrayList.remove(dVar);
            }
        }
    }

    public final boolean v(d dVar, RecyclerView.C c12) {
        if (dVar.f54034b == c12) {
            dVar.f54034b = null;
        } else {
            if (dVar.f54033a != c12) {
                return false;
            }
            dVar.f54033a = null;
        }
        c12.itemView.setAlpha(1.0f);
        c12.itemView.setTranslationX(0.0f);
        c12.itemView.setTranslationY(0.0f);
        h(c12);
        return true;
    }

    public final void w(RecyclerView.C c12) {
        if (f54015s == null) {
            f54015s = new ValueAnimator().getInterpolator();
        }
        c12.itemView.animate().setInterpolator(f54015s);
        j(c12);
    }
}
