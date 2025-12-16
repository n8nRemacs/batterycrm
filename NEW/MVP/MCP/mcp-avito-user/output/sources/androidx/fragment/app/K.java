package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22778f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21.java */
@j.X
/* loaded from: classes.dex */
class K extends O {

    /* compiled from: FragmentTransitionCompat21.java */
    public class a extends Transition.EpicenterCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f46469a;

        public a(Rect rect) {
            this.f46469a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            return this.f46469a;
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    public class c extends Transition.EpicenterCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f46472a;

        public c(Rect rect) {
            this.f46472a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f46472a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean s(Transition transition) {
        return (O.h(transition.getTargetIds()) && O.h(transition.getTargetNames()) && O.h(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.O
    public final void a(@j.N View view, @j.N Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.O
    public final void b(@j.N ArrayList arrayList, @j.N Object obj) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i12 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i12 < transitionCount) {
                b(arrayList, transitionSet.getTransitionAt(i12));
                i12++;
            }
            return;
        }
        if (s(transition) || !O.h(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i12 < size) {
            transition.addTarget((View) arrayList.get(i12));
            i12++;
        }
    }

    @Override // androidx.fragment.app.O
    public final void c(@j.N ViewGroup viewGroup, @j.P Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.O
    public final boolean e(@j.N Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.O
    public final Object f(@j.P Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.O
    public final Object i(@j.P Object obj, @j.P Object obj2, @j.P Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.O
    public final Object j(@j.P Object obj, @j.P Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.O
    public final void k(@j.N Object obj, @j.N View view, @j.N ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.O
    public final void l(@j.N Object obj, @j.P Object obj2, @j.P ArrayList arrayList, @j.P Object obj3, @j.P ArrayList arrayList2) {
        ((Transition) obj).addListener(new L(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.O
    public final void m(@j.P View view, @j.N Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            O.g(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.O
    public final void n(@j.N Object obj, @j.N Rect rect) {
        ((Transition) obj).setEpicenterCallback(new c(rect));
    }

    @Override // androidx.fragment.app.O
    public final void o(@j.N Object obj, @j.N C22778f c22778f, @j.N RunnableC22948f runnableC22948f) {
        ((Transition) obj).addListener(new M(runnableC22948f));
    }

    @Override // androidx.fragment.app.O
    public final void p(@j.N Object obj, @j.N View view, @j.N ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            O.d(arrayList.get(i12), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(arrayList, transitionSet);
    }

    @Override // androidx.fragment.app.O
    public final void q(@j.P Object obj, @j.P ArrayList<View> arrayList, @j.P ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            t(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.O
    public final Object r(@j.P Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void t(@j.N Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i12 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i12 < transitionCount) {
                t(transitionSet.getTransitionAt(i12), arrayList, arrayList2);
                i12++;
            }
            return;
        }
        if (s(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i12 < size) {
            transition.addTarget(arrayList2.get(i12));
            i12++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    public class b implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f46470a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f46471b;

        public b(View view, ArrayList arrayList) {
            this.f46470a = view;
            this.f46471b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f46470a.setVisibility(8);
            ArrayList arrayList = this.f46471b;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((View) arrayList.get(i12)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }
    }
}
