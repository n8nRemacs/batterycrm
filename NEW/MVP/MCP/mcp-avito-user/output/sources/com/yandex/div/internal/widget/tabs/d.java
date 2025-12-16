package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C20199a;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.internal.widget.tabs.A;
import com.yandex.div.internal.widget.tabs.d.g.b;
import com.yandex.div2.DivAction;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseDivTabbedCardUi.java */
/* loaded from: classes7.dex */
public abstract class d<TAB_DATA extends g.b<ACTION>, TAB_VIEW, ACTION> {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final com.yandex.div.internal.viewpool.h f370459a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final b<ACTION> f370460b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final o f370461c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final m f370462d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final A f370463e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final A.a f370464f;

    /* renamed from: i, reason: collision with root package name */
    @N
    public final String f370467i;

    /* renamed from: j, reason: collision with root package name */
    @N
    public final com.yandex.div.core.view2.divs.tabs.l f370468j;

    /* renamed from: g, reason: collision with root package name */
    @N
    public final C20199a f370465g = new C20199a();

    /* renamed from: h, reason: collision with root package name */
    @N
    public final C20199a f370466h = new C20199a();

    /* renamed from: k, reason: collision with root package name */
    public final androidx.viewpager.widget.a f370469k = new a();

    /* renamed from: l, reason: collision with root package name */
    public boolean f370470l = false;

    /* renamed from: m, reason: collision with root package name */
    public g<TAB_DATA> f370471m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f370472n = false;

    /* compiled from: BaseDivTabbedCardUi.java */
    public class a extends androidx.viewpager.widget.a {

        /* renamed from: c, reason: collision with root package name */
        @P
        public SparseArray<Parcelable> f370473c;

        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager.widget.a
        public final void a(ViewPager viewPager, int i12, Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            d dVar = d.this;
            e eVar = (e) dVar.f370465g.remove(viewGroup);
            TAB_VIEW tab_view = eVar.f370479d;
            if (tab_view != null) {
                d.this.c(tab_view);
                eVar.f370479d = null;
            }
            dVar.f370466h.remove(Integer.valueOf(i12));
            viewPager.removeView(viewGroup);
        }

        @Override // androidx.viewpager.widget.a
        public final int c() {
            g<TAB_DATA> gVar = d.this.f370471m;
            if (gVar == null) {
                return 0;
            }
            return gVar.a().size();
        }

        @Override // androidx.viewpager.widget.a
        public final int d(Object obj) {
            return -2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager.widget.a
        public final Object f(ViewGroup viewGroup, int i12) {
            ViewGroup viewGroup2;
            d dVar = d.this;
            e eVar = (e) dVar.f370466h.get(Integer.valueOf(i12));
            if (eVar != null) {
                viewGroup2 = eVar.f370476a;
                viewGroup2.getParent();
            } else {
                ViewGroup viewGroup3 = (ViewGroup) dVar.f370459a.b(dVar.f370467i);
                e eVar2 = new e(viewGroup3, (g.b) dVar.f370471m.a().get(i12), i12, null);
                dVar.f370466h.put(Integer.valueOf(i12), eVar2);
                viewGroup2 = viewGroup3;
                eVar = eVar2;
            }
            viewGroup.addView(viewGroup2);
            dVar.f370465g.put(viewGroup2, eVar);
            if (i12 == dVar.f370461c.getCurrentItem()) {
                eVar.a();
            }
            SparseArray<Parcelable> sparseArray = this.f370473c;
            if (sparseArray != null) {
                viewGroup2.restoreHierarchyState(sparseArray);
            }
            return viewGroup2;
        }

        @Override // androidx.viewpager.widget.a
        public final boolean g(View view, Object obj) {
            return obj == view;
        }

        @Override // androidx.viewpager.widget.a
        public final void j(@P Parcelable parcelable, @P ClassLoader classLoader) {
            if (!(parcelable instanceof Bundle)) {
                this.f370473c = null;
                return;
            }
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(getClass().getClassLoader());
            this.f370473c = bundle.getSparseParcelableArray("div_tabs_child_states");
        }

        @Override // androidx.viewpager.widget.a
        @N
        public final Parcelable k() {
            d dVar = d.this;
            SparseArray<Parcelable> sparseArray = new SparseArray<>(dVar.f370465g.f25790d);
            Iterator it = dVar.f370465g.keySet().iterator();
            while (it.hasNext()) {
                ((ViewGroup) it.next()).saveHierarchyState(sparseArray);
            }
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("div_tabs_child_states", sparseArray);
            return bundle;
        }
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public interface b<ACTION> {

        /* compiled from: BaseDivTabbedCardUi.java */
        public interface a<ACTION> {
            void a(int i12, @N Object obj);

            void b(int i12);
        }

        void a(int i12);

        void b(@N List<? extends g.b<ACTION>> list, int i12, @N com.yandex.div.json.expressions.e eVar, @N F21.b bVar);

        void c(int i12);

        void d(@N com.yandex.div.internal.viewpool.h hVar);

        @P
        ViewPager.i getCustomPageChangeListener();

        void setHost(@N a<ACTION> aVar);

        void setTypefaceProvider(@N com.yandex.div.core.font.a aVar);
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public interface c<ACTION> {
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    /* renamed from: com.yandex.div.internal.widget.tabs.d$d, reason: collision with other inner class name */
    public class C10935d implements b.a<ACTION> {
        public C10935d(a aVar) {
        }

        @Override // com.yandex.div.internal.widget.tabs.d.b.a
        public final void a(int i12, @N Object obj) {
            com.yandex.div.core.view2.divs.tabs.l lVar = d.this.f370468j;
            lVar.getClass();
            DivAction divAction = (DivAction) obj;
            if (divAction.f371217b != null) {
                int i13 = com.yandex.div.internal.p.f370124a;
            }
            lVar.f368809d.getClass();
            InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
            lVar.f368808c.a(lVar.f368807b, divAction, null);
        }

        @Override // com.yandex.div.internal.widget.tabs.d.b.a
        public final void b(int i12) {
            d.this.f370461c.setCurrentItem(i12);
        }
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public class e {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final ViewGroup f370476a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final TAB_DATA f370477b;

        /* renamed from: c, reason: collision with root package name */
        public final int f370478c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public TAB_VIEW f370479d;

        public e() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(ViewGroup viewGroup, g.b bVar, int i12, a aVar) {
            this.f370476a = viewGroup;
            this.f370477b = bVar;
            this.f370478c = i12;
        }

        public final void a() {
            if (this.f370479d != null) {
                return;
            }
            this.f370479d = (TAB_VIEW) d.this.a(this.f370476a, this.f370477b, this.f370478c);
        }
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public class f implements ViewPager.j {
        public f(a aVar) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager.widget.ViewPager.j
        public final void a(View view, float f12) {
            e eVar;
            d dVar = d.this;
            if (!dVar.f370472n && f12 > -1.0f && f12 < 1.0f && (eVar = (e) dVar.f370465g.get(view)) != null) {
                eVar.a();
            }
        }
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public interface g<TAB extends b> {

        /* compiled from: BaseDivTabbedCardUi.java */
        public interface a<ITM, ACTION> extends b<ACTION> {
        }

        /* compiled from: BaseDivTabbedCardUi.java */
        public interface b<ACTION> {
            @P
            DivAction a();

            @P
            Integer b();

            String getTitle();
        }

        @N
        List<? extends TAB> a();
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public class h implements ViewPager.i {

        /* renamed from: b, reason: collision with root package name */
        public int f370482b = 0;

        public h(a aVar) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
            A a12;
            d dVar = d.this;
            A.a aVar = dVar.f370464f;
            if (aVar == null) {
                dVar.f370461c.requestLayout();
            } else {
                if (this.f370482b != 0 || aVar == null || (a12 = dVar.f370463e) == null) {
                    return;
                }
                aVar.d(0.0f, i12);
                a12.requestLayout();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i12) {
            A a12;
            this.f370482b = i12;
            if (i12 == 0) {
                d dVar = d.this;
                int currentItem = dVar.f370461c.getCurrentItem();
                A.a aVar = dVar.f370464f;
                if (aVar != null && (a12 = dVar.f370463e) != null) {
                    aVar.d(0.0f, currentItem);
                    a12.requestLayout();
                }
                if (!dVar.f370470l) {
                    dVar.f370460b.c(currentItem);
                }
                dVar.f370470l = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void h(int i12, float f12, int i13) {
            A.a aVar;
            int i14 = this.f370482b;
            d dVar = d.this;
            if (i14 != 0 && dVar.f370463e != null && (aVar = dVar.f370464f) != null && aVar.c(f12, i12)) {
                dVar.f370464f.d(f12, i12);
                final A a12 = dVar.f370463e;
                if (a12.isInLayout()) {
                    a12.post(new Runnable() { // from class: com.yandex.div.internal.widget.tabs.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            a12.requestLayout();
                        }
                    });
                } else {
                    a12.requestLayout();
                }
            }
            if (dVar.f370470l) {
                return;
            }
            dVar.f370460b.getClass();
        }
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public static class i {
    }

    public d(@N com.yandex.div.internal.viewpool.h hVar, @N z zVar, @N i iVar, @N m mVar, @N s sVar, @P com.yandex.div.core.view2.divs.tabs.l lVar, @N com.yandex.div.core.view2.divs.tabs.l lVar2) {
        this.f370459a = hVar;
        this.f370462d = mVar;
        this.f370468j = lVar2;
        C10935d c10935d = new C10935d(null);
        this.f370467i = "DIV2.TAB_ITEM_VIEW";
        b<ACTION> bVar = (b) com.yandex.div.internal.util.x.a(zVar, R.id.base_tabbed_title_container_scroller);
        this.f370460b = bVar;
        bVar.setHost(c10935d);
        bVar.setTypefaceProvider(sVar.f370511a);
        bVar.d(hVar);
        o oVar = (o) com.yandex.div.internal.util.x.a(zVar, R.id.div_tabs_pager_container);
        this.f370461c = oVar;
        oVar.setAdapter(null);
        ArrayList arrayList = oVar.f55000S;
        if (arrayList != null) {
            arrayList.clear();
        }
        oVar.c(new h(null));
        ViewPager.i customPageChangeListener = bVar.getCustomPageChangeListener();
        if (customPageChangeListener != null) {
            oVar.c(customPageChangeListener);
        }
        oVar.c(lVar);
        oVar.setScrollEnabled(true);
        oVar.setEdgeScrollEnabled(false);
        oVar.z(new f(null));
        A a12 = (A) com.yandex.div.internal.util.x.a(zVar, R.id.div_tabs_container_helper);
        this.f370463e = a12;
        A.a aVarF = mVar.f((ViewGroup) hVar.b("DIV2.TAB_ITEM_VIEW"), new com.yandex.div.internal.widget.tabs.c(this), new com.yandex.div.internal.widget.tabs.c(this));
        this.f370464f = aVarF;
        a12.setHeightCalculator(aVarF);
    }

    @N
    public abstract ViewGroup a(@N ViewGroup viewGroup, @N g.b bVar, int i12);

    public final void b(@P g<TAB_DATA> gVar, @N com.yandex.div.json.expressions.e eVar, @N F21.b bVar) {
        o oVar = this.f370461c;
        int iMin = Math.min(oVar.getCurrentItem(), gVar.a().size() - 1);
        this.f370466h.clear();
        this.f370471m = gVar;
        androidx.viewpager.widget.a adapter = oVar.getAdapter();
        androidx.viewpager.widget.a aVar = this.f370469k;
        if (adapter != null) {
            this.f370472n = true;
            try {
                aVar.h();
            } finally {
                this.f370472n = false;
            }
        }
        List<? extends g.b<ACTION>> listA = gVar.a();
        b<ACTION> bVar2 = this.f370460b;
        bVar2.b(listA, iMin, eVar, bVar);
        if (oVar.getAdapter() == null) {
            oVar.setAdapter(aVar);
        } else if (!listA.isEmpty() && iMin != -1) {
            oVar.setCurrentItem(iMin);
            bVar2.a(iMin);
        }
        A.a aVar2 = this.f370464f;
        if (aVar2 != null) {
            aVar2.b();
        }
        A a12 = this.f370463e;
        if (a12 != null) {
            a12.requestLayout();
        }
    }

    public abstract void c(@N TAB_VIEW tab_view);
}
