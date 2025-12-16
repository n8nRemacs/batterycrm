package e11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f394585a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f394586b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f394587c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f394588d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f394589e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f394590f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final androidx.camera.core.impl.r0 f394591g = new androidx.camera.core.impl.r0(13);

    @j.N
    public final ArrayList a(@j.N String str) {
        return new ArrayList(str.equals("portrait") ? this.f394587c : this.f394588d);
    }

    public final void b(@j.N X1 x12) {
        if (x12 instanceof P1) {
            String str = ((P1) x12).f394459d;
            if ("landscape".equals(str)) {
                this.f394588d.add(x12);
                return;
            } else {
                if ("portrait".equals(str)) {
                    this.f394587c.add(x12);
                    return;
                }
                return;
            }
        }
        if (x12 instanceof C39865f) {
            this.f394586b.add((C39865f) x12);
            return;
        }
        if (!(x12 instanceof V1)) {
            if (x12 instanceof Q) {
                this.f394590f.add((Q) x12);
                return;
            } else {
                this.f394585a.add(x12);
                return;
            }
        }
        V1 v12 = (V1) x12;
        ArrayList arrayList = this.f394589e;
        int iBinarySearch = Collections.binarySearch(arrayList, v12, this.f394591g);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        arrayList.add(iBinarySearch, v12);
    }

    public final void c(@j.N e2 e2Var, float f12) {
        this.f394585a.addAll(e2Var.f394585a);
        this.f394590f.addAll(e2Var.f394590f);
        this.f394587c.addAll(e2Var.f394587c);
        this.f394588d.addAll(e2Var.f394588d);
        ArrayList arrayList = e2Var.f394589e;
        HashSet hashSet = e2Var.f394586b;
        if (f12 <= 0.0f) {
            this.f394586b.addAll(hashSet);
            this.f394589e.addAll(arrayList);
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C39865f c39865f = (C39865f) it.next();
            float f13 = c39865f.f394593e;
            if (f13 >= 0.0f) {
                c39865f.f394592d = (f13 * f12) / 100.0f;
                c39865f.f394593e = -1.0f;
            }
            b(c39865f);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            V1 v12 = (V1) it2.next();
            float f14 = v12.f394493g;
            if (f14 >= 0.0f) {
                v12.f394492f = (f14 * f12) / 100.0f;
                v12.f394493g = -1.0f;
            }
            b(v12);
        }
    }

    public final void d(@j.N List<X1> list) {
        Iterator<X1> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    @j.N
    public final ArrayList<X1> e(@j.N String str) {
        ArrayList<X1> arrayList = new ArrayList<>();
        Iterator it = this.f394585a.iterator();
        while (it.hasNext()) {
            X1 x12 = (X1) it.next();
            if (str.equals(x12.f394506a)) {
                arrayList.add(x12);
            }
        }
        return arrayList;
    }

    @j.N
    public final HashSet f() {
        return new HashSet(this.f394586b);
    }
}
