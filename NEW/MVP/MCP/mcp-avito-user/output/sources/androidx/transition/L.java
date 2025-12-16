package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.collection.C20199a;
import androidx.collection.C20204c0;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: Transition.java */
/* loaded from: classes10.dex */
public abstract class L implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<V> f54677n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<V> f54678o;

    /* renamed from: v, reason: collision with root package name */
    public p0 f54685v;

    /* renamed from: w, reason: collision with root package name */
    public d f54686w;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f54663y = {2, 1, 3, 4};

    /* renamed from: z, reason: collision with root package name */
    public static final B f54664z = new a();

    /* renamed from: A, reason: collision with root package name */
    public static final ThreadLocal<C20199a<Animator, b>> f54662A = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public final String f54665b = getClass().getName();

    /* renamed from: c, reason: collision with root package name */
    public long f54666c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f54667d = -1;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f54668e = null;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<Integer> f54669f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<View> f54670g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<View> f54671h = null;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<View> f54672i = null;

    /* renamed from: j, reason: collision with root package name */
    public W f54673j = new W();

    /* renamed from: k, reason: collision with root package name */
    public W f54674k = new W();

    /* renamed from: l, reason: collision with root package name */
    public T f54675l = null;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f54676m = f54663y;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList<Animator> f54679p = new ArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    public int f54680q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f54681r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f54682s = false;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<f> f54683t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<Animator> f54684u = new ArrayList<>();

    /* renamed from: x, reason: collision with root package name */
    public B f54687x = f54664z;

    /* compiled from: Transition.java */
    public class a extends B {
        @Override // androidx.transition.B
        public final Path a(float f12, float f13, float f14, float f15) {
            Path path = new Path();
            path.moveTo(f12, f13);
            path.lineTo(f14, f15);
            return path;
        }
    }

    /* compiled from: Transition.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public View f54688a;

        /* renamed from: b, reason: collision with root package name */
        public String f54689b;

        /* renamed from: c, reason: collision with root package name */
        public V f54690c;

        /* renamed from: d, reason: collision with root package name */
        public r0 f54691d;

        /* renamed from: e, reason: collision with root package name */
        public L f54692e;
    }

    /* compiled from: Transition.java */
    public static class c {
    }

    /* compiled from: Transition.java */
    public static abstract class d {
        public abstract Rect a();
    }

    /* compiled from: Transition.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface e {
    }

    /* compiled from: Transition.java */
    public interface f {
        void a();

        void b();

        void c();

        void d(@j.N L l12);

        void e(@j.N L l12);
    }

    public static void e(W w12, View view, V v12) {
        w12.f54719a.put(view, v12);
        int id2 = view.getId();
        if (id2 >= 0) {
            SparseArray<View> sparseArray = w12.f54720b;
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        String strP = C22823h0.p(view);
        if (strP != null) {
            C20199a<String, View> c20199a = w12.f54722d;
            if (c20199a.containsKey(strP)) {
                c20199a.put(strP, null);
            } else {
                c20199a.put(strP, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C20204c0<View> c20204c0 = w12.f54721c;
                if (c20204c0.i(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c20204c0.l(itemIdAtPosition, view);
                    return;
                }
                View viewF = c20204c0.f(itemIdAtPosition);
                if (viewF != null) {
                    viewF.setHasTransientState(false);
                    c20204c0.l(itemIdAtPosition, null);
                }
            }
        }
    }

    public static ArrayList r(View view, ArrayList arrayList) {
        if (view != null) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    public static C20199a<Animator, b> u() {
        ThreadLocal<C20199a<Animator, b>> threadLocal = f54662A;
        C20199a<Animator, b> c20199a = threadLocal.get();
        if (c20199a != null) {
            return c20199a;
        }
        C20199a<Animator, b> c20199a2 = new C20199a<>();
        threadLocal.set(c20199a2);
        return c20199a2;
    }

    @j.N
    public void A(@j.N f fVar) {
        ArrayList<f> arrayList = this.f54683t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(fVar);
        if (this.f54683t.size() == 0) {
            this.f54683t = null;
        }
    }

    @j.N
    public void B(@j.N View view) {
        this.f54670g.remove(view);
    }

    @RestrictTo
    public void C(View view) {
        if (this.f54681r) {
            if (!this.f54682s) {
                ArrayList<Animator> arrayList = this.f54679p;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).resume();
                }
                ArrayList<f> arrayList2 = this.f54683t;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f54683t.clone();
                    int size2 = arrayList3.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ((f) arrayList3.get(i12)).c();
                    }
                }
            }
            this.f54681r = false;
        }
    }

    @RestrictTo
    public void D() {
        K();
        C20199a<Animator, b> c20199aU = u();
        Iterator<Animator> it = this.f54684u.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (c20199aU.containsKey(next)) {
                K();
                if (next != null) {
                    next.addListener(new M(this, c20199aU));
                    long j12 = this.f54667d;
                    if (j12 >= 0) {
                        next.setDuration(j12);
                    }
                    long j13 = this.f54666c;
                    if (j13 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j13);
                    }
                    TimeInterpolator timeInterpolator = this.f54668e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new N(this));
                    next.start();
                }
            }
        }
        this.f54684u.clear();
        p();
    }

    @j.N
    public void E(long j12) {
        this.f54667d = j12;
    }

    public void F(@j.P d dVar) {
        this.f54686w = dVar;
    }

    @j.N
    public void G(@j.P TimeInterpolator timeInterpolator) {
        this.f54668e = timeInterpolator;
    }

    public void H(@j.P B b12) {
        if (b12 == null) {
            this.f54687x = f54664z;
        } else {
            this.f54687x = b12;
        }
    }

    public void I(@j.P p0 p0Var) {
        this.f54685v = p0Var;
    }

    @j.N
    public void J(long j12) {
        this.f54666c = j12;
    }

    @RestrictTo
    public final void K() {
        if (this.f54680q == 0) {
            ArrayList<f> arrayList = this.f54683t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f54683t.clone();
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((f) arrayList2.get(i12)).d(this);
                }
            }
            this.f54682s = false;
        }
        this.f54680q++;
    }

    public String L(String str) {
        StringBuilder sbR = androidx.compose.foundation.H.r(str);
        sbR.append(getClass().getSimpleName());
        sbR.append("@");
        sbR.append(Integer.toHexString(hashCode()));
        sbR.append(": ");
        String string = sbR.toString();
        if (this.f54667d != -1) {
            string = AK.c.j(this.f54667d, ") ", androidx.appcompat.app.r.z(string, "dur("));
        }
        if (this.f54666c != -1) {
            string = AK.c.j(this.f54666c, ") ", androidx.appcompat.app.r.z(string, "dly("));
        }
        if (this.f54668e != null) {
            StringBuilder sbZ = androidx.appcompat.app.r.z(string, "interp(");
            sbZ.append(this.f54668e);
            sbZ.append(") ");
            string = sbZ.toString();
        }
        ArrayList<Integer> arrayList = this.f54669f;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f54670g;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strQ = androidx.appcompat.app.r.q(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (i12 > 0) {
                    strQ = androidx.appcompat.app.r.q(strQ, ", ");
                }
                StringBuilder sbR2 = androidx.compose.foundation.H.r(strQ);
                sbR2.append(arrayList.get(i12));
                strQ = sbR2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (i13 > 0) {
                    strQ = androidx.appcompat.app.r.q(strQ, ", ");
                }
                StringBuilder sbR3 = androidx.compose.foundation.H.r(strQ);
                sbR3.append(arrayList2.get(i13));
                strQ = sbR3.toString();
            }
        }
        return androidx.appcompat.app.r.q(strQ, ")");
    }

    @j.N
    public void a(@j.N f fVar) {
        if (this.f54683t == null) {
            this.f54683t = new ArrayList<>();
        }
        this.f54683t.add(fVar);
    }

    @j.N
    public L b(@j.N View view) {
        this.f54670g.add(view);
        return this;
    }

    @j.N
    public void c(@j.D int i12) {
        if (i12 != 0) {
            this.f54669f.add(Integer.valueOf(i12));
        }
    }

    @RestrictTo
    public void cancel() {
        ArrayList<Animator> arrayList = this.f54679p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).cancel();
        }
        ArrayList<f> arrayList2 = this.f54683t;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f54683t.clone();
        int size2 = arrayList3.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((f) arrayList3.get(i12)).b();
        }
    }

    public abstract void f(@j.N V v12);

    public final void g(View view, boolean z12) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList<View> arrayList = this.f54671h;
        if (arrayList == null || !arrayList.contains(view)) {
            if (view.getParent() instanceof ViewGroup) {
                V v12 = new V(view);
                if (z12) {
                    j(v12);
                } else {
                    f(v12);
                }
                v12.f54718c.add(this);
                i(v12);
                if (z12) {
                    e(this.f54673j, view, v12);
                } else {
                    e(this.f54674k, view, v12);
                }
            }
            if (view instanceof ViewGroup) {
                ArrayList<View> arrayList2 = this.f54672i;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                        g(viewGroup.getChildAt(i12), z12);
                    }
                }
            }
        }
    }

    public void i(V v12) {
        if (this.f54685v != null) {
            HashMap map = v12.f54716a;
            if (map.isEmpty()) {
                return;
            }
            this.f54685v.getClass();
            String[] strArr = p0.f54836a;
            for (int i12 = 0; i12 < 2; i12++) {
                if (!map.containsKey(strArr[i12])) {
                    this.f54685v.getClass();
                    View view = v12.f54717b;
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void j(@j.N V v12);

    public final void k(ViewGroup viewGroup, boolean z12) {
        l(z12);
        ArrayList<Integer> arrayList = this.f54669f;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f54670g;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z12);
            return;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            View viewFindViewById = viewGroup.findViewById(arrayList.get(i12).intValue());
            if (viewFindViewById != null) {
                V v12 = new V(viewFindViewById);
                if (z12) {
                    j(v12);
                } else {
                    f(v12);
                }
                v12.f54718c.add(this);
                i(v12);
                if (z12) {
                    e(this.f54673j, viewFindViewById, v12);
                } else {
                    e(this.f54674k, viewFindViewById, v12);
                }
            }
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            View view = arrayList2.get(i13);
            V v13 = new V(view);
            if (z12) {
                j(v13);
            } else {
                f(v13);
            }
            v13.f54718c.add(this);
            i(v13);
            if (z12) {
                e(this.f54673j, view, v13);
            } else {
                e(this.f54674k, view, v13);
            }
        }
    }

    public final void l(boolean z12) {
        if (z12) {
            this.f54673j.f54719a.clear();
            this.f54673j.f54720b.clear();
            this.f54673j.f54721c.a();
        } else {
            this.f54674k.f54719a.clear();
            this.f54674k.f54720b.clear();
            this.f54674k.f54721c.a();
        }
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public L clone() {
        try {
            L l12 = (L) super.clone();
            l12.f54684u = new ArrayList<>();
            l12.f54673j = new W();
            l12.f54674k = new W();
            l12.f54677n = null;
            l12.f54678o = null;
            return l12;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @j.P
    public Animator n(@j.N ViewGroup viewGroup, @j.P V v12, @j.P V v13) {
        return null;
    }

    @RestrictTo
    public void o(ViewGroup viewGroup, W w12, W w13, ArrayList<V> arrayList, ArrayList<V> arrayList2) {
        Animator animatorN;
        int i12;
        int i13;
        View view;
        V v12;
        Animator animator;
        V v13;
        Animator animator2;
        C20199a<Animator, b> c20199aU = u();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i14 = 0;
        while (i14 < size) {
            V v14 = arrayList.get(i14);
            V v15 = arrayList2.get(i14);
            if (v14 != null && !v14.f54718c.contains(this)) {
                v14 = null;
            }
            if (v15 != null && !v15.f54718c.contains(this)) {
                v15 = null;
            }
            if (!(v14 == null && v15 == null) && ((v14 == null || v15 == null || x(v14, v15)) && (animatorN = n(viewGroup, v14, v15)) != null)) {
                String str = this.f54665b;
                if (v15 != null) {
                    view = v15.f54717b;
                    String[] strArrV = v();
                    i12 = size;
                    if (strArrV != null && strArrV.length > 0) {
                        v13 = new V(view);
                        V v16 = w13.f54719a.get(view);
                        if (v16 != null) {
                            animator2 = animatorN;
                            int i15 = 0;
                            while (i15 < strArrV.length) {
                                HashMap map = v13.f54716a;
                                int i16 = i14;
                                String str2 = strArrV[i15];
                                map.put(str2, v16.f54716a.get(str2));
                                i15++;
                                i14 = i16;
                                strArrV = strArrV;
                            }
                            i13 = i14;
                        } else {
                            i13 = i14;
                            animator2 = animatorN;
                        }
                        int i17 = c20199aU.f25790d;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= i17) {
                                animator = animator2;
                                break;
                            }
                            b bVar = c20199aU.get(c20199aU.f(i18));
                            if (bVar.f54690c != null && bVar.f54688a == view && bVar.f54689b.equals(str) && bVar.f54690c.equals(v13)) {
                                animator = null;
                                break;
                            }
                            i18++;
                        }
                    } else {
                        i13 = i14;
                        animator = animatorN;
                        v13 = null;
                    }
                    animatorN = animator;
                    v12 = v13;
                } else {
                    i12 = size;
                    i13 = i14;
                    view = v14.f54717b;
                    v12 = null;
                }
                if (animatorN != null) {
                    p0 p0Var = this.f54685v;
                    if (p0Var != null) {
                        long jA2 = p0Var.a(viewGroup, this, v14, v15);
                        sparseIntArray.put(this.f54684u.size(), (int) jA2);
                        jMin = Math.min(jA2, jMin);
                    }
                    l0 l0Var = h0.f54765a;
                    r0 r0Var = new r0(viewGroup);
                    b bVar2 = new b();
                    bVar2.f54688a = view;
                    bVar2.f54689b = str;
                    bVar2.f54690c = v12;
                    bVar2.f54691d = r0Var;
                    bVar2.f54692e = this;
                    c20199aU.put(animatorN, bVar2);
                    this.f54684u.add(animatorN);
                }
            } else {
                i12 = size;
                i13 = i14;
            }
            i14 = i13 + 1;
            size = i12;
        }
        if (sparseIntArray.size() != 0) {
            for (int i19 = 0; i19 < sparseIntArray.size(); i19++) {
                Animator animator3 = this.f54684u.get(sparseIntArray.keyAt(i19));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(i19) - jMin));
            }
        }
    }

    @RestrictTo
    public final void p() {
        int i12 = this.f54680q - 1;
        this.f54680q = i12;
        if (i12 == 0) {
            ArrayList<f> arrayList = this.f54683t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f54683t.clone();
                int size = arrayList2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((f) arrayList2.get(i13)).e(this);
                }
            }
            for (int i14 = 0; i14 < this.f54673j.f54721c.n(); i14++) {
                View viewO = this.f54673j.f54721c.o(i14);
                if (viewO != null) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    viewO.setHasTransientState(false);
                }
            }
            for (int i15 = 0; i15 < this.f54674k.f54721c.n(); i15++) {
                View viewO2 = this.f54674k.f54721c.o(i15);
                if (viewO2 != null) {
                    WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                    viewO2.setHasTransientState(false);
                }
            }
            this.f54682s = true;
        }
    }

    @j.N
    public void q(@j.N View view) {
        this.f54671h = r(view, this.f54671h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo
    public void s(ViewGroup viewGroup) {
        C20199a<Animator, b> c20199aU = u();
        int i12 = c20199aU.f25790d;
        if (viewGroup == null || i12 == 0) {
            return;
        }
        l0 l0Var = h0.f54765a;
        r0 r0Var = new r0(viewGroup);
        C20199a c20199a = new C20199a(c20199aU);
        c20199aU.clear();
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            b bVar = (b) c20199a.k(i13);
            if (bVar.f54688a != null && r0Var.equals(bVar.f54691d)) {
                ((Animator) c20199a.f(i13)).end();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f54678o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f54677n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.transition.V t(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            androidx.transition.T r0 = r5.f54675l
            if (r0 == 0) goto L9
            androidx.transition.V r6 = r0.t(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<androidx.transition.V> r0 = r5.f54677n
            goto L10
        Le:
            java.util.ArrayList<androidx.transition.V> r0 = r5.f54678o
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            androidx.transition.V r4 = (androidx.transition.V) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f54717b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList<androidx.transition.V> r6 = r5.f54678o
            goto L36
        L34:
            java.util.ArrayList<androidx.transition.V> r6 = r5.f54677n
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            androidx.transition.V r1 = (androidx.transition.V) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.L.t(android.view.View, boolean):androidx.transition.V");
    }

    public final String toString() {
        return L("");
    }

    @j.P
    public String[] v() {
        return null;
    }

    @j.P
    public final V w(@j.N View view, boolean z12) {
        T t12 = this.f54675l;
        if (t12 != null) {
            return t12.w(view, z12);
        }
        return (z12 ? this.f54673j : this.f54674k).f54719a.get(view);
    }

    public boolean x(@j.P V v12, @j.P V v13) {
        if (v12 == null || v13 == null) {
            return false;
        }
        String[] strArrV = v();
        HashMap map = v12.f54716a;
        HashMap map2 = v13.f54716a;
        if (strArrV == null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                Object obj2 = map2.get(str);
                if ((obj == null && obj2 == null) ? false : (obj == null || obj2 == null) ? true : !obj.equals(obj2)) {
                }
            }
            return false;
        }
        for (String str2 : strArrV) {
            Object obj3 = map.get(str2);
            Object obj4 = map2.get(str2);
            if (!((obj3 == null && obj4 == null) ? false : (obj3 == null || obj4 == null) ? true : !obj3.equals(obj4))) {
            }
        }
        return false;
        return true;
    }

    public final boolean y(View view) {
        int id2 = view.getId();
        ArrayList<View> arrayList = this.f54671h;
        if (arrayList != null && arrayList.contains(view)) {
            return false;
        }
        ArrayList<Integer> arrayList2 = this.f54669f;
        int size = arrayList2.size();
        ArrayList<View> arrayList3 = this.f54670g;
        return (size == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id2)) || arrayList3.contains(view);
    }

    @RestrictTo
    public void z(ViewGroup viewGroup) {
        if (this.f54682s) {
            return;
        }
        ArrayList<Animator> arrayList = this.f54679p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).pause();
        }
        ArrayList<f> arrayList2 = this.f54683t;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f54683t.clone();
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((f) arrayList3.get(i12)).a();
            }
        }
        this.f54681r = true;
    }
}
