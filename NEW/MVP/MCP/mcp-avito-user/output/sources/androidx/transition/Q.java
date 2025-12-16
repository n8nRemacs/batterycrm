package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.C20199a;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: TransitionManager.java */
/* loaded from: classes10.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final C23492c f54696a = new C23492c();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<C20199a<ViewGroup, ArrayList<L>>>> f54697b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f54698c = new ArrayList<>();

    public Q() {
        new C20199a();
        new C20199a();
    }

    public static void a(@j.N ViewGroup viewGroup, @j.P L l12) {
        ArrayList<ViewGroup> arrayList = f54698c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (l12 == null) {
                l12 = f54696a;
            }
            L lClone = l12.clone();
            e(viewGroup, lClone);
            viewGroup.setTag(R.id.transition_current_scene, null);
            d(viewGroup, lClone);
        }
    }

    public static void b(ViewGroup viewGroup) {
        f54698c.remove(viewGroup);
        ArrayList<L> arrayList = c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((L) arrayList2.get(size)).s(viewGroup);
        }
    }

    public static C20199a<ViewGroup, ArrayList<L>> c() {
        C20199a<ViewGroup, ArrayList<L>> c20199a;
        ThreadLocal<WeakReference<C20199a<ViewGroup, ArrayList<L>>>> threadLocal = f54697b;
        WeakReference<C20199a<ViewGroup, ArrayList<L>>> weakReference = threadLocal.get();
        if (weakReference != null && (c20199a = weakReference.get()) != null) {
            return c20199a;
        }
        C20199a<ViewGroup, ArrayList<L>> c20199a2 = new C20199a<>();
        threadLocal.set(new WeakReference<>(c20199a2));
        return c20199a2;
    }

    public static void d(ViewGroup viewGroup, L l12) {
        if (l12 == null || viewGroup == null) {
            return;
        }
        a aVar = new a();
        aVar.f54699b = l12;
        aVar.f54700c = viewGroup;
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void e(ViewGroup viewGroup, L l12) {
        com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f fVar;
        ArrayList<L> arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<L> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().z(viewGroup);
            }
        }
        if (l12 != null) {
            l12.k(viewGroup, true);
        }
        H h12 = (H) viewGroup.getTag(R.id.transition_current_scene);
        if (h12 == null || ((H) h12.f54648a.getTag(R.id.transition_current_scene)) != h12 || (fVar = h12.f54650c) == null) {
            return;
        }
        fVar.run();
    }

    /* compiled from: TransitionManager.java */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public L f54699b;

        /* renamed from: c, reason: collision with root package name */
        public ViewGroup f54700c;

        /* compiled from: TransitionManager.java */
        /* renamed from: androidx.transition.Q$a$a, reason: collision with other inner class name */
        public class C1929a extends P {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C20199a f54701a;

            public C1929a(C20199a c20199a) {
                this.f54701a = c20199a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.P, androidx.transition.L.f
            public final void e(@j.N L l12) {
                ((ArrayList) this.f54701a.get(a.this.f54700c)).remove(l12);
                l12.A(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:103:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01d6 A[EDGE_INSN: B:138:0x01d6->B:93:0x01d6 BREAK  A[LOOP:1: B:19:0x0083->B:92:0x01ce], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01db  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 662
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Q.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f54700c;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = Q.f54698c;
            ViewGroup viewGroup2 = this.f54700c;
            arrayList.remove(viewGroup2);
            ArrayList<L> arrayList2 = Q.c().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<L> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().C(viewGroup2);
                }
            }
            this.f54699b.l(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
