package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.AbstractC20248z;
import androidx.collection.C20203c;
import androidx.collection.C20204c0;
import androidx.compose.foundation.text.selection.C21030p;
import androidx.core.util.z;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import j.InterfaceC42153i;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes10.dex */
public abstract class b extends RecyclerView.Adapter<i> implements j {

    /* renamed from: c, reason: collision with root package name */
    public final Lifecycle f55068c;

    /* renamed from: d, reason: collision with root package name */
    public final FragmentManager f55069d;

    /* renamed from: e, reason: collision with root package name */
    public final C20204c0<Fragment> f55070e;

    /* renamed from: f, reason: collision with root package name */
    public final C20204c0<Fragment.SavedState> f55071f;

    /* renamed from: g, reason: collision with root package name */
    public final C20204c0<Integer> f55072g;

    /* renamed from: h, reason: collision with root package name */
    public c f55073h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f55074i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f55075j;

    /* compiled from: FragmentStateAdapter.java */
    public class a implements InterfaceC22979L {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f55076b;

        public a(i iVar) {
            this.f55076b = iVar;
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@N InterfaceC22983P interfaceC22983P, @N Lifecycle.Event event) {
            b bVar = b.this;
            if (bVar.f55069d.V()) {
                return;
            }
            interfaceC22983P.getLifecycle().c(this);
            i iVar = this.f55076b;
            FrameLayout frameLayout = (FrameLayout) iVar.itemView;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (frameLayout.isAttachedToWindow()) {
                bVar.o(iVar);
            }
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    /* renamed from: androidx.viewpager2.adapter.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1935b extends RecyclerView.g {
        public AbstractC1935b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i12, int i13) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i12, int i13, @P Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i12, int i13) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i12, int i13) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i12, int i13) {
            a();
        }

        public /* synthetic */ AbstractC1935b(androidx.viewpager2.adapter.a aVar) {
            this();
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public ViewPager2.i f55078a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.g f55079b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC22979L f55080c;

        /* renamed from: d, reason: collision with root package name */
        public ViewPager2 f55081d;

        /* renamed from: e, reason: collision with root package name */
        public long f55082e = -1;

        public c() {
        }

        @N
        public static ViewPager2 a(@N RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z12) {
            int currentItem;
            Fragment fragmentF;
            b bVar = b.this;
            FragmentManager fragmentManager = bVar.f55069d;
            if (!fragmentManager.V() && this.f55081d.getScrollState() == 0) {
                C20204c0<Fragment> c20204c0 = bVar.f55070e;
                if (c20204c0.j() || bVar.getItemCount() == 0 || (currentItem = this.f55081d.getCurrentItem()) >= bVar.getItemCount()) {
                    return;
                }
                long itemId = bVar.getItemId(currentItem);
                if ((itemId != this.f55082e || z12) && (fragmentF = c20204c0.f(itemId)) != null && fragmentF.isAdded()) {
                    this.f55082e = itemId;
                    H hE2 = fragmentManager.e();
                    Fragment fragment = null;
                    for (int i12 = 0; i12 < c20204c0.n(); i12++) {
                        long jK2 = c20204c0.k(i12);
                        Fragment fragmentO = c20204c0.o(i12);
                        if (fragmentO.isAdded()) {
                            if (jK2 != this.f55082e) {
                                hE2.p(fragmentO, Lifecycle.State.f46682e);
                            } else {
                                fragment = fragmentO;
                            }
                            fragmentO.setMenuVisibility(jK2 == this.f55082e);
                        }
                    }
                    if (fragment != null) {
                        hE2.p(fragment, Lifecycle.State.f46683f);
                    }
                    if (hE2.l()) {
                        return;
                    }
                    hE2.g();
                }
            }
        }
    }

    public b(@N com.avito.android.ui.activity.a aVar) {
        this(aVar.getSupportFragmentManager(), aVar.getLifecycle());
    }

    public static void j(@N View view, @N FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // androidx.viewpager2.adapter.j
    @N
    public final Bundle H() {
        C20204c0<Fragment> c20204c0 = this.f55070e;
        int iN2 = c20204c0.n();
        C20204c0<Fragment.SavedState> c20204c02 = this.f55071f;
        Bundle bundle = new Bundle(c20204c02.n() + iN2);
        for (int i12 = 0; i12 < c20204c0.n(); i12++) {
            long jK2 = c20204c0.k(i12);
            Fragment fragmentF = c20204c0.f(jK2);
            if (fragmentF != null && fragmentF.isAdded()) {
                this.f55069d.d0(bundle, fragmentF, C21030p.a(jK2, "f#"));
            }
        }
        for (int i13 = 0; i13 < c20204c02.n(); i13++) {
            long jK3 = c20204c02.k(i13);
            if (k(jK3)) {
                bundle.putParcelable(C21030p.a(jK3, "s#"), c20204c02.f(jK3));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.j
    public final void a(@N Parcelable parcelable) throws NumberFormatException {
        String next;
        C20204c0<Fragment.SavedState> c20204c0 = this.f55071f;
        if (c20204c0.j()) {
            C20204c0<Fragment> c20204c02 = this.f55070e;
            if (c20204c02.j()) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (c20204c02.j()) {
                            return;
                        }
                        this.f55075j = true;
                        this.f55074i = true;
                        m();
                        Handler handler = new Handler(Looper.getMainLooper());
                        d dVar = new d(this);
                        this.f55068c.a(new e(handler, dVar));
                        handler.postDelayed(dVar, 10000L);
                        return;
                    }
                    next = it.next();
                    if (next.startsWith("f#") && next.length() > 2) {
                        c20204c02.l(Long.parseLong(next.substring(2)), this.f55069d.M(bundle, next));
                    } else {
                        if (!next.startsWith("s#") || next.length() <= 2) {
                            break;
                        }
                        long j12 = Long.parseLong(next.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(next);
                        if (k(j12)) {
                            c20204c0.l(j12, savedState);
                        }
                    }
                }
                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i12) {
        return i12;
    }

    public boolean k(long j12) {
        return j12 >= 0 && j12 < ((long) getItemCount());
    }

    @N
    public abstract Fragment l(int i12);

    public final void m() {
        C20204c0<Fragment> c20204c0;
        C20204c0<Integer> c20204c02;
        Fragment fragmentF;
        View view;
        if (!this.f55075j || this.f55069d.V()) {
            return;
        }
        C20203c c20203c = new C20203c();
        int i12 = 0;
        while (true) {
            c20204c0 = this.f55070e;
            int iN2 = c20204c0.n();
            c20204c02 = this.f55072g;
            if (i12 >= iN2) {
                break;
            }
            long jK2 = c20204c0.k(i12);
            if (!k(jK2)) {
                c20203c.add(Long.valueOf(jK2));
                c20204c02.m(jK2);
            }
            i12++;
        }
        if (!this.f55074i) {
            this.f55075j = false;
            for (int i13 = 0; i13 < c20204c0.n(); i13++) {
                long jK3 = c20204c0.k(i13);
                if (c20204c02.i(jK3) < 0 && ((fragmentF = c20204c0.f(jK3)) == null || (view = fragmentF.getView()) == null || view.getParent() == null)) {
                    c20203c.add(Long.valueOf(jK3));
                }
            }
        }
        Iterator it = c20203c.iterator();
        while (true) {
            AbstractC20248z abstractC20248z = (AbstractC20248z) it;
            if (!abstractC20248z.hasNext()) {
                return;
            } else {
                p(((Long) abstractC20248z.next()).longValue());
            }
        }
    }

    public final Long n(int i12) {
        Long lValueOf = null;
        int i13 = 0;
        while (true) {
            C20204c0<Integer> c20204c0 = this.f55072g;
            if (i13 >= c20204c0.n()) {
                return lValueOf;
            }
            if (c20204c0.o(i13).intValue() == i12) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(c20204c0.k(i13));
            }
            i13++;
        }
    }

    public final void o(@N i iVar) {
        Fragment fragmentF = this.f55070e.f(iVar.getItemId());
        if (fragmentF == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) iVar.itemView;
        View view = fragmentF.getView();
        if (!fragmentF.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zIsAdded = fragmentF.isAdded();
        FragmentManager fragmentManager = this.f55069d;
        if (zIsAdded && view == null) {
            fragmentManager.e0(new androidx.viewpager2.adapter.c(this, fragmentF, frameLayout), false);
            return;
        }
        if (fragmentF.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                j(view, frameLayout);
                return;
            }
            return;
        }
        if (fragmentF.isAdded()) {
            j(view, frameLayout);
            return;
        }
        if (fragmentManager.V()) {
            if (fragmentManager.f46356I) {
                return;
            }
            this.f55068c.a(new a(iVar));
            return;
        }
        fragmentManager.e0(new androidx.viewpager2.adapter.c(this, fragmentF, frameLayout), false);
        H hE2 = fragmentManager.e();
        hE2.j(0, fragmentF, "f" + iVar.getItemId(), 1);
        hE2.p(fragmentF, Lifecycle.State.f46682e);
        hE2.g();
        this.f55073h.b(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @InterfaceC42153i
    public final void onAttachedToRecyclerView(@N RecyclerView recyclerView) {
        z.b(this.f55073h == null);
        c cVar = new c();
        this.f55073h = cVar;
        cVar.f55081d = c.a(recyclerView);
        f fVar = new f(cVar);
        cVar.f55078a = fVar;
        cVar.f55081d.e(fVar);
        g gVar = new g(cVar);
        cVar.f55079b = gVar;
        registerAdapterDataObserver(gVar);
        h hVar = new h(cVar);
        cVar.f55080c = hVar;
        this.f55068c.a(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@N RecyclerView.C c12, int i12) {
        i iVar = (i) c12;
        long itemId = iVar.getItemId();
        int id2 = ((FrameLayout) iVar.itemView).getId();
        Long lN2 = n(id2);
        C20204c0<Integer> c20204c0 = this.f55072g;
        if (lN2 != null && lN2.longValue() != itemId) {
            p(lN2.longValue());
            c20204c0.m(lN2.longValue());
        }
        c20204c0.l(itemId, Integer.valueOf(id2));
        long itemId2 = getItemId(i12);
        C20204c0<Fragment> c20204c02 = this.f55070e;
        if (c20204c02.i(itemId2) < 0) {
            Fragment fragmentL = l(i12);
            fragmentL.setInitialSavedState(this.f55071f.f(itemId2));
            c20204c02.l(itemId2, fragmentL);
        }
        FrameLayout frameLayout = (FrameLayout) iVar.itemView;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (frameLayout.isAttachedToWindow()) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new androidx.viewpager2.adapter.a(this, frameLayout, iVar));
        }
        m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    public final RecyclerView.C onCreateViewHolder(@N ViewGroup viewGroup, int i12) {
        int i13 = i.f55093b;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new i(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @InterfaceC42153i
    public final void onDetachedFromRecyclerView(@N RecyclerView recyclerView) {
        c cVar = this.f55073h;
        cVar.getClass();
        c.a(recyclerView).i(cVar.f55078a);
        RecyclerView.g gVar = cVar.f55079b;
        b bVar = b.this;
        bVar.unregisterAdapterDataObserver(gVar);
        bVar.f55068c.c(cVar.f55080c);
        cVar.f55081d = null;
        this.f55073h = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(@N RecyclerView.C c12) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@N RecyclerView.C c12) {
        o((i) c12);
        m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@N RecyclerView.C c12) {
        Long lN2 = n(((FrameLayout) ((i) c12).itemView).getId());
        if (lN2 != null) {
            p(lN2.longValue());
            this.f55072g.m(lN2.longValue());
        }
    }

    public final void p(long j12) {
        ViewParent parent;
        C20204c0<Fragment> c20204c0 = this.f55070e;
        Fragment fragmentF = c20204c0.f(j12);
        if (fragmentF == null) {
            return;
        }
        if (fragmentF.getView() != null && (parent = fragmentF.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zK2 = k(j12);
        C20204c0<Fragment.SavedState> c20204c02 = this.f55071f;
        if (!zK2) {
            c20204c02.m(j12);
        }
        if (!fragmentF.isAdded()) {
            c20204c0.m(j12);
            return;
        }
        FragmentManager fragmentManager = this.f55069d;
        if (fragmentManager.V()) {
            this.f55075j = true;
            return;
        }
        if (fragmentF.isAdded() && k(j12)) {
            c20204c02.l(j12, fragmentManager.l0(fragmentF));
        }
        H hE2 = fragmentManager.e();
        hE2.m(fragmentF);
        hE2.g();
        c20204c0.m(j12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z12) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public b(@N Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public b(@N FragmentManager fragmentManager, @N Lifecycle lifecycle) {
        this.f55070e = new C20204c0<>();
        this.f55071f = new C20204c0<>();
        this.f55072g = new C20204c0<>();
        this.f55074i = false;
        this.f55075j = false;
        this.f55069d = fragmentManager;
        this.f55068c = lifecycle;
        super.setHasStableIds(true);
    }
}
