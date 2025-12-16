package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.os.C22778f;
import androidx.fragment.app.RunnableC22948f;
import androidx.transition.L;
import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
@RestrictTo
/* renamed from: androidx.transition.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23505p extends androidx.fragment.app.O {

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: androidx.transition.p$a */
    public class a extends L.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f54832a;

        public a(Rect rect) {
            this.f54832a = rect;
        }

        @Override // androidx.transition.L.d
        public final Rect a() {
            return this.f54832a;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: androidx.transition.p$c */
    public class c extends L.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f54835a;

        public c(Rect rect) {
            this.f54835a = rect;
        }

        @Override // androidx.transition.L.d
        public final Rect a() {
            Rect rect = this.f54835a;
            if (rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    @Override // androidx.fragment.app.O
    public final void a(View view, Object obj) {
        ((L) obj).b(view);
    }

    @Override // androidx.fragment.app.O
    public final void b(ArrayList arrayList, Object obj) {
        L l12 = (L) obj;
        if (l12 == null) {
            return;
        }
        int i12 = 0;
        if (l12 instanceof T) {
            T t12 = (T) l12;
            int size = t12.f54703B.size();
            while (i12 < size) {
                b(arrayList, (i12 < 0 || i12 >= t12.f54703B.size()) ? null : t12.f54703B.get(i12));
                i12++;
            }
            return;
        }
        if (androidx.fragment.app.O.h(l12.f54669f) && androidx.fragment.app.O.h(l12.f54670g)) {
            int size2 = arrayList.size();
            while (i12 < size2) {
                l12.b((View) arrayList.get(i12));
                i12++;
            }
        }
    }

    @Override // androidx.fragment.app.O
    public final void c(ViewGroup viewGroup, Object obj) {
        Q.a(viewGroup, (L) obj);
    }

    @Override // androidx.fragment.app.O
    public final boolean e(Object obj) {
        return obj instanceof L;
    }

    @Override // androidx.fragment.app.O
    public final Object f(Object obj) {
        if (obj != null) {
            return ((L) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.O
    public final Object i(Object obj, Object obj2, Object obj3) {
        L l12 = (L) obj;
        L l13 = (L) obj2;
        L l14 = (L) obj3;
        if (l12 != null && l13 != null) {
            T t12 = new T();
            t12.N(l12);
            t12.N(l13);
            t12.Q(1);
            l12 = t12;
        } else if (l12 == null) {
            l12 = l13 != null ? l13 : null;
        }
        if (l14 == null) {
            return l12;
        }
        T t13 = new T();
        if (l12 != null) {
            t13.N(l12);
        }
        t13.N(l14);
        return t13;
    }

    @Override // androidx.fragment.app.O
    public final Object j(Object obj, Object obj2) {
        T t12 = new T();
        if (obj != null) {
            t12.N((L) obj);
        }
        t12.N((L) obj2);
        return t12;
    }

    @Override // androidx.fragment.app.O
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((L) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.O
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((L) obj).a(new C23506q(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.O
    public final void m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            androidx.fragment.app.O.g(view, rect);
            ((L) obj).F(new a(rect));
        }
    }

    @Override // androidx.fragment.app.O
    public final void n(Object obj, Rect rect) {
        ((L) obj).F(new c(rect));
    }

    @Override // androidx.fragment.app.O
    public final void o(@j.N Object obj, @j.N C22778f c22778f, @j.N RunnableC22948f runnableC22948f) {
        L l12 = (L) obj;
        c22778f.c(new r(l12));
        l12.a(new C23507s(runnableC22948f));
    }

    @Override // androidx.fragment.app.O
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        T t12 = (T) obj;
        ArrayList<View> arrayList2 = t12.f54670g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            androidx.fragment.app.O.d(arrayList.get(i12), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(arrayList, t12);
    }

    @Override // androidx.fragment.app.O
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        T t12 = (T) obj;
        if (t12 != null) {
            ArrayList<View> arrayList3 = t12.f54670g;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(t12, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.O
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        T t12 = new T();
        t12.N((L) obj);
        return t12;
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        L l12 = (L) obj;
        int i12 = 0;
        if (l12 instanceof T) {
            T t12 = (T) l12;
            int size = t12.f54703B.size();
            while (i12 < size) {
                s((i12 < 0 || i12 >= t12.f54703B.size()) ? null : t12.f54703B.get(i12), arrayList, arrayList2);
                i12++;
            }
            return;
        }
        if (androidx.fragment.app.O.h(l12.f54669f)) {
            ArrayList<View> arrayList3 = l12.f54670g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i12 < size2) {
                    l12.b(arrayList2.get(i12));
                    i12++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    l12.B(arrayList.get(size3));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: androidx.transition.p$b */
    public class b implements L.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f54833a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f54834b;

        public b(View view, ArrayList arrayList) {
            this.f54833a = view;
            this.f54834b = arrayList;
        }

        @Override // androidx.transition.L.f
        public final void d(@j.N L l12) {
            l12.A(this);
            l12.a(this);
        }

        @Override // androidx.transition.L.f
        public final void e(@j.N L l12) {
            l12.A(this);
            this.f54833a.setVisibility(8);
            ArrayList arrayList = this.f54834b;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((View) arrayList.get(i12)).setVisibility(0);
            }
        }

        @Override // androidx.transition.L.f
        public final void a() {
        }

        @Override // androidx.transition.L.f
        public final void b() {
        }

        @Override // androidx.transition.L.f
        public final void c() {
        }
    }
}
