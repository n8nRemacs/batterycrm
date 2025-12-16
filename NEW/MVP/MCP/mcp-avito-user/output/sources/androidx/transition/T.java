package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.transition.L;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes10.dex */
public class T extends L {

    /* renamed from: D, reason: collision with root package name */
    public int f54705D;

    /* renamed from: B, reason: collision with root package name */
    public ArrayList<L> f54703B = new ArrayList<>();

    /* renamed from: C, reason: collision with root package name */
    public boolean f54704C = true;

    /* renamed from: E, reason: collision with root package name */
    public boolean f54706E = false;

    /* renamed from: F, reason: collision with root package name */
    public int f54707F = 0;

    /* compiled from: TransitionSet.java */
    public class a extends P {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L f54708a;

        public a(L l12) {
            this.f54708a = l12;
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void e(@j.N L l12) {
            this.f54708a.D();
            l12.A(this);
        }
    }

    /* compiled from: TransitionSet.java */
    public static class b extends P {

        /* renamed from: a, reason: collision with root package name */
        public T f54709a;

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void d(@j.N L l12) {
            T t12 = this.f54709a;
            if (t12.f54706E) {
                return;
            }
            t12.K();
            t12.f54706E = true;
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void e(@j.N L l12) {
            T t12 = this.f54709a;
            int i12 = t12.f54705D - 1;
            t12.f54705D = i12;
            if (i12 == 0) {
                t12.f54706E = false;
                t12.p();
            }
            l12.A(this);
        }
    }

    @Override // androidx.transition.L
    @j.N
    public final void B(@j.N View view) {
        for (int i12 = 0; i12 < this.f54703B.size(); i12++) {
            this.f54703B.get(i12).B(view);
        }
        this.f54670g.remove(view);
    }

    @Override // androidx.transition.L
    @RestrictTo
    public final void C(View view) {
        super.C(view);
        int size = this.f54703B.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f54703B.get(i12).C(view);
        }
    }

    @Override // androidx.transition.L
    @RestrictTo
    public final void D() {
        if (this.f54703B.isEmpty()) {
            K();
            p();
            return;
        }
        b bVar = new b();
        bVar.f54709a = this;
        Iterator<L> it = this.f54703B.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.f54705D = this.f54703B.size();
        if (this.f54704C) {
            Iterator<L> it2 = this.f54703B.iterator();
            while (it2.hasNext()) {
                it2.next().D();
            }
            return;
        }
        for (int i12 = 1; i12 < this.f54703B.size(); i12++) {
            this.f54703B.get(i12 - 1).a(new a(this.f54703B.get(i12)));
        }
        L l12 = this.f54703B.get(0);
        if (l12 != null) {
            l12.D();
        }
    }

    @Override // androidx.transition.L
    public final void F(L.d dVar) {
        this.f54686w = dVar;
        this.f54707F |= 8;
        int size = this.f54703B.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f54703B.get(i12).F(dVar);
        }
    }

    @Override // androidx.transition.L
    public final void H(B b12) {
        super.H(b12);
        this.f54707F |= 4;
        if (this.f54703B != null) {
            for (int i12 = 0; i12 < this.f54703B.size(); i12++) {
                this.f54703B.get(i12).H(b12);
            }
        }
    }

    @Override // androidx.transition.L
    public final void I(p0 p0Var) {
        this.f54685v = p0Var;
        this.f54707F |= 2;
        int size = this.f54703B.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f54703B.get(i12).I(p0Var);
        }
    }

    @Override // androidx.transition.L
    @j.N
    public final void J(long j12) {
        this.f54666c = j12;
    }

    @Override // androidx.transition.L
    public final String L(String str) {
        String strL = super.L(str);
        for (int i12 = 0; i12 < this.f54703B.size(); i12++) {
            StringBuilder sbZ = androidx.appcompat.app.r.z(strL, "\n");
            sbZ.append(this.f54703B.get(i12).L(str + "  "));
            strL = sbZ.toString();
        }
        return strL;
    }

    @j.N
    public final void M(@j.N View view) {
        for (int i12 = 0; i12 < this.f54703B.size(); i12++) {
            this.f54703B.get(i12).b(view);
        }
        this.f54670g.add(view);
    }

    @j.N
    public final void N(@j.N L l12) {
        this.f54703B.add(l12);
        l12.f54675l = this;
        long j12 = this.f54667d;
        if (j12 >= 0) {
            l12.E(j12);
        }
        if ((this.f54707F & 1) != 0) {
            l12.G(this.f54668e);
        }
        if ((this.f54707F & 2) != 0) {
            l12.I(this.f54685v);
        }
        if ((this.f54707F & 4) != 0) {
            l12.H(this.f54687x);
        }
        if ((this.f54707F & 8) != 0) {
            l12.F(this.f54686w);
        }
    }

    @Override // androidx.transition.L
    @j.N
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void E(long j12) {
        ArrayList<L> arrayList;
        this.f54667d = j12;
        if (j12 < 0 || (arrayList = this.f54703B) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f54703B.get(i12).E(j12);
        }
    }

    @Override // androidx.transition.L
    @j.N
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void G(@j.P TimeInterpolator timeInterpolator) {
        this.f54707F |= 1;
        ArrayList<L> arrayList = this.f54703B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f54703B.get(i12).G(timeInterpolator);
            }
        }
        this.f54668e = timeInterpolator;
    }

    @j.N
    public final void Q(int i12) {
        if (i12 == 0) {
            this.f54704C = true;
        } else {
            if (i12 != 1) {
                throw new AndroidRuntimeException(AK.c.g(i12, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f54704C = false;
        }
    }

    @Override // androidx.transition.L
    @j.N
    public final /* bridge */ /* synthetic */ L b(@j.N View view) {
        M(view);
        return this;
    }

    @Override // androidx.transition.L
    @j.N
    public final void c(@j.D int i12) {
        for (int i13 = 0; i13 < this.f54703B.size(); i13++) {
            this.f54703B.get(i13).c(i12);
        }
        super.c(i12);
    }

    @Override // androidx.transition.L
    @RestrictTo
    public final void cancel() {
        super.cancel();
        int size = this.f54703B.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f54703B.get(i12).cancel();
        }
    }

    @Override // androidx.transition.L
    public final void f(@j.N V v12) {
        if (y(v12.f54717b)) {
            Iterator<L> it = this.f54703B.iterator();
            while (it.hasNext()) {
                L next = it.next();
                if (next.y(v12.f54717b)) {
                    next.f(v12);
                    v12.f54718c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.L
    public final void i(V v12) {
        super.i(v12);
        int size = this.f54703B.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f54703B.get(i12).i(v12);
        }
    }

    @Override // androidx.transition.L
    public final void j(@j.N V v12) {
        if (y(v12.f54717b)) {
            Iterator<L> it = this.f54703B.iterator();
            while (it.hasNext()) {
                L next = it.next();
                if (next.y(v12.f54717b)) {
                    next.j(v12);
                    v12.f54718c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.L
    /* renamed from: m */
    public final L clone() {
        T t12 = (T) super.clone();
        t12.f54703B = new ArrayList<>();
        int size = this.f54703B.size();
        for (int i12 = 0; i12 < size; i12++) {
            L lClone = this.f54703B.get(i12).clone();
            t12.f54703B.add(lClone);
            lClone.f54675l = t12;
        }
        return t12;
    }

    @Override // androidx.transition.L
    @RestrictTo
    public final void o(ViewGroup viewGroup, W w12, W w13, ArrayList<V> arrayList, ArrayList<V> arrayList2) {
        long j12 = this.f54666c;
        int size = this.f54703B.size();
        for (int i12 = 0; i12 < size; i12++) {
            L l12 = this.f54703B.get(i12);
            if (j12 > 0 && (this.f54704C || i12 == 0)) {
                long j13 = l12.f54666c;
                if (j13 > 0) {
                    l12.J(j13 + j12);
                } else {
                    l12.J(j12);
                }
            }
            l12.o(viewGroup, w12, w13, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.L
    @j.N
    public final void q(@j.N View view) {
        for (int i12 = 0; i12 < this.f54703B.size(); i12++) {
            this.f54703B.get(i12).q(view);
        }
        super.q(view);
    }

    @Override // androidx.transition.L
    @RestrictTo
    public final void s(ViewGroup viewGroup) {
        super.s(viewGroup);
        int size = this.f54703B.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f54703B.get(i12).s(viewGroup);
        }
    }

    @Override // androidx.transition.L
    @RestrictTo
    public final void z(ViewGroup viewGroup) {
        super.z(viewGroup);
        int size = this.f54703B.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f54703B.get(i12).z(viewGroup);
        }
    }
}
