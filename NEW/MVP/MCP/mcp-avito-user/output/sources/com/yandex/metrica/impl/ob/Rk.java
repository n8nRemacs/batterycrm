package com.yandex.metrica.impl.ob;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes7.dex */
class Rk {

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private static final List<Class> f379326l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private static final List<Class> f379327m;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final TreeSet<Float> f379328a = new TreeSet<>();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final List<C38711bl> f379329b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Ak f379330c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final List<InterfaceC38736cl> f379331d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final List<InterfaceC39083qk> f379332e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final Fl f379333f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C39130sk f379334g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final C39227wl f379335h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final C39275yl f379336i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final C39131sl f379337j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final Hl f379338k;

    static {
        ArrayList arrayList = new ArrayList();
        f379326l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f379327m = arrayList2;
        arrayList.add(ListView.class);
        arrayList.add(GridView.class);
        a(arrayList, "androidx.recyclerview.widget.RecyclerView");
        a(arrayList, "androidx.viewpager.widget.ViewPager");
        a(arrayList, "androidx.viewpager2.widget.ViewPager2");
        a(arrayList2, "androidx.coordinatorlayout.widget.CoordinatorLayout");
        a(arrayList2, "androidx.drawerlayout.widget.DrawerLayout");
        a(arrayList2, "androidx.slidingpanelayout.widget.SlidingPaneLayout");
        a(arrayList2, "androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        a(arrayList2, "androidx.core.widget.NestedScrollView");
        a(arrayList2, "androidx.constraintlayout.widget.ConstraintLayout");
        a(arrayList2, "androidx.appcompat.widget.ContentFrameLayout");
        arrayList2.add(AbsoluteLayout.class);
        arrayList2.add(FrameLayout.class);
        arrayList2.add(LinearLayout.class);
        arrayList2.add(RelativeLayout.class);
        arrayList2.add(TableLayout.class);
        arrayList2.add(ScrollView.class);
        arrayList2.add(GridLayout.class);
    }

    @j.k0
    public Rk(@j.N C39227wl c39227wl, @j.N Fl fl2, @j.N C39130sk c39130sk, @j.N Ak ak2, @j.N List<InterfaceC38736cl> list, @j.N List<InterfaceC39083qk> list2, @j.N C39275yl c39275yl, @j.N C39131sl c39131sl, @j.N Hl hl2) {
        this.f379335h = c39227wl;
        this.f379333f = fl2;
        this.f379334g = c39130sk;
        this.f379330c = ak2;
        this.f379331d = list;
        this.f379332e = list2;
        this.f379336i = c39275yl;
        this.f379337j = c39131sl;
        this.f379338k = hl2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b7, code lost:
    
        r1 = r1.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012d  */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.yandex.metrica.impl.ob.Pk a(@j.P com.yandex.metrica.impl.ob.C39107rl r22, @j.N android.view.View r23, int r24) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Rk.a(com.yandex.metrica.impl.ob.rl, android.view.View, int):com.yandex.metrica.impl.ob.Pk");
    }

    @j.P
    public Pk b(@j.P C39107rl c39107rl, @j.N View view, int i12) {
        try {
            if (this.f379337j.a(view)) {
                return null;
            }
            return a(c39107rl, view, i12);
        } catch (Throwable th2) {
            this.f379336i.a("ui_parsing_view", th2);
            return null;
        }
    }

    @j.N
    public final List<C38711bl> b() {
        return this.f379329b;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de A[LOOP:0: B:50:0x00d8->B:52:0x00de, LOOP_END] */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.yandex.metrica.impl.ob.C39107rl a(@j.N android.widget.TextView r20, @j.N java.lang.String r21, @j.N java.lang.String r22, int r23, boolean r24, @j.N com.yandex.metrica.impl.ob.C39107rl.a r25) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Rk.a(android.widget.TextView, java.lang.String, java.lang.String, int, boolean, com.yandex.metrica.impl.ob.rl$a):com.yandex.metrica.impl.ob.rl");
    }

    @j.N
    public TreeSet<Float> a() {
        return this.f379328a;
    }

    @j.N
    public List<View> a(@j.N View view, int i12) {
        ArrayList arrayList = new ArrayList();
        try {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int iMin = Math.min(this.f379334g.a(i12), viewGroup.getChildCount());
                for (int i13 = 0; i13 < iMin; i13++) {
                    arrayList.add(viewGroup.getChildAt(i13));
                }
            }
        } catch (Throwable th2) {
            this.f379336i.a("ui_parsing_children", th2);
        }
        return arrayList;
    }

    private boolean a(@j.N List<Class> list, @j.N View view) {
        Iterator<Class> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    private static void a(@j.N List<Class> list, @j.N String str) {
        Class clsB = C38842h2.b(str);
        if (clsB != null) {
            list.add(clsB);
        }
    }
}
